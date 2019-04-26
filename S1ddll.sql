--maken van de tabel
CREATE TABLE medewerkers2 AS SELECT * FROM medewerkers; 

--toevoegen van de geslachtsconstraint
ALTER TABLE medewerkers2
ADD GES varchar(2)
ADD constraint GESCHECK  CHECK (GES IN ('M', 'V'));

--testen van de constraint
INSERT INTO medewerkers2 VALUES (7900, 'TESTMAN', 'P', 'BOEKHOUDER', 7700, '04-12-70', 700, 40, 20, 'M');
INSERT INTO medewerkers2 VALUES (7500, 'TESTVROUW', 'A', 'BOEKHOUDER', 7200, '03-08-60', 650, 60, 40, 'V');

--maken van de sequence
CREATE SEQUENCE seq_afdeling
MINVALUE 0
START WITH 90
INCREMENT BY 10
CACHE 10
NOMAXVALUE;

-- DROP SEQUENCE seq_afdeling;

--op deze manier kan het ANR hoger   
ALTER TABLE afdelingen
MODIFY ANR NUMBER(4,0);

--testen van de sequences
INSERT INTO afdelingen VALUES(seq_afdeling.nextval, 'TESTAFDELING4', 'ROTTERDAM', 7782);
INSERT INTO afdelingen VALUES(seq_afdeling.nextval, 'TESTAFDELING5', 'ROTTERDAM', 7782);

-- select * from afdelingen;

--aanmaken adressentabel, postcode mag alleen bepaalde karakters bevatten, de datumcheck en de FK/PK word aangemaakt
CREATE TABLE ADRESSEN (
    POSTCODE CHAR(6) CHECK (POSTCODE LIKE '^[A-Z]{2}[0-9]{4}$'),
    HUISNUMMER NUMBER,
    INGANGSDATUM DATE NOT NULL,
    EINDDATUM DATE,
    TELEFOON NUMBER(10,0) UNIQUE,
    MED_MNR NUMBER(4,0) NOT NULL,
    CONSTRAINT DATUMCHECK CHECK (EINDDATUM > INGANGSDATUM),
    CONSTRAINT MEDFK FOREIGN KEY (MED_MNR) REFERENCES MEDEWERKERS ("MNR"),
    CONSTRAINT PRKEY PRIMARY KEY ("POSTCODE", "HUISNUMMER", "INGANGSDATUM")
);

-- DROP TABLE ADRESSEN;

--constraint van opdracht 7.1 aanmaken
ADD CONSTRAINT VERKCHECK CHECK (LNNVL(functie = 'VERKOPER') = LNNVL(comm IS NOT NULL));
