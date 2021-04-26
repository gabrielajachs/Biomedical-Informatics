CREATE TABLE Virus (
	NomeCientifico VARCHAR (30) NOT NULL PRIMARY KEY,
    NomePopular VARCHAR(50) NOT NULL,
    DiasIncubacao INT );
    
CREATE TABLE Laboratorio(
	CodLab CHAR(15) NOT NULL PRIMARY KEY,
    Nome VARCHAR(50) NOT NULL,
    Cidade VARCHAR(50) NOT NULL );
    
CREATE TABLE Vacina (
	CodVacina CHAR(15) NOT NULL,
    PrincipioAtivo VARCHAR(50) NOT NULL,
    NomeComercial VARCHAR(50) NOT NULL,
    DosagemRecomendada REAL NOT NULL,
    DosesEstoque REAL NOT NULL,
    CodLab CHAR(15) NOT NULL,
		PRIMARY KEY (CodVacina),
		FOREIGN KEY(CodLab)
			REFERENCES Laboratorio (CodLab) );
        
CREATE TABLE Trata (
	Nomecientifico VARCHAR(30) NOT NULL,
    CodVacina CHAR(15) NOT NULL,
    Dosagem REAL NOT NULL,
    CONSTRAINT FK_TRATA_VIRUS FOREIGN KEY (NomeCientifico)
    REFERENCES Virus (NomeCientifico),
    CONSTRAINT FK_TRATA_VACINA FOREIGN KEY (CodVacina)
    REFERENCES Vacina (CodVacina),
    CONSTRAINT FK_TRATA_DOSAGEM CHECK (Dosagem > 0.1));
    
    
ALTER TABLE Vacina
ADD COLUMN Familia VARCHAR(45);

ALTER TABLE Vacina
MODIFY COLUMN NomeComercial VARCHAR(45);

DROP TABLE Trata


