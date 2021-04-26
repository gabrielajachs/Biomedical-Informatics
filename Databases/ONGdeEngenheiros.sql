create database ONGdeEngenheiros;
use ONGdeEngenheiros;

##TABELA COM OS NUCLEOS DA ONG DE ENGENHEIROS
CREATE TABLE Nucleos(
	id_nucleo int auto_increment,
	nome_nucleo varchar(100),
	estado varchar(100),
	cidade varchar(100),
	homologado varchar(3),
	data_criacao date,
    CONSTRAINT PK_NUCLEOS PRIMARY KEY (id_nucleo)
);

##INSERÇÃO DAS INFORMAÇÕES REFERENTES AOS NUCLEOS
INSERT INTO Nucleos(nome_nucleo,estado,cidade,homologado,data_criacao)
VALUES('ONG nucleo RS','Rio Grande do Sul','Porto Alegre','Sim','2008-10-26');

INSERT INTO Nucleos(nome_nucleo,estado,cidade,homologado,data_criacao)
VALUES('ONG nucleo SP','São Paulo','São Paulo','Sim','2001-05-04');

INSERT INTO Nucleos(nome_nucleo,estado,cidade,homologado,data_criacao)
VALUES('ONG nucleo MG','Minas Gerais','Belo Horizonte','Nao','2019-06-15');

INSERT INTO Nucleos(nome_nucleo,estado,cidade,homologado,data_criacao)
VALUES('ONG nucleo RJ','Rio de Janeiro','Rio de Janeiro','Sim','2005-03-13');

##TABELA COM AS CATEGORIAS DOS PROJETOS FOMENTADOS PELA ONG DE ENGENHEIROS
CREATE TABLE Categorias(
	id_categoria int auto_increment,
	tipo varchar(100),
    CONSTRAINT PK_CATEGORIAS PRIMARY KEY (id_categoria)
);

##INSERÇÃO DAS INFORMAÇÕES REFERENTES AS CATEGORIAS
INSERT INTO Categorias(tipo) VALUES('educação');
INSERT INTO Categorias(tipo) VALUES('gestão e empreendedorismo');
INSERT INTO Categorias(tipo) VALUES('infraestrutura e assistência básica');
INSERT INTO Categorias(tipo) VALUES('sustentabilidade');

##TABELA DOS PROJETOS EXISTENTES EM TONTA A ONG DE ENGENHEIROS
CREATE TABLE Projetos(
	id_projeto int auto_increment,
	nome_projeto varchar(100),
	descricao varchar(300),
	data_inicio date,
	data_fim date,
	localizacao varchar(100),
	id_categoria int,
	id_nucleo int,
	CONSTRAINT PK_PROJETOS PRIMARY KEY(id_projeto),
	CONSTRAINT FK_CATEGORIAS_PROJETOS FOREIGN KEY (id_categoria) REFERENCES Categorias (id_categoria),
	CONSTRAINT FK_NUCLEOS_PROJETOS FOREIGN KEY (id_nucleo) REFERENCES Nucleos (id_nucleo)
);

##INSERÇÃO DAS INFORMAÇÕES SOBRE OS PROJETOS
INSERT INTO Projetos (nome_projeto,descricao,data_inicio,data_fim,localizacao,id_categoria,id_nucleo)
VALUES('Ensino proficionalizante','Auxilio no ensino profissionalizante nas áreasde engenharia metalurgica, química e produção','2008-12-27',null,'Fundação Pão dos Pobres',1,1);

INSERT INTO Projetos (nome_projeto,descricao,data_inicio,data_fim,localizacao,id_categoria,id_nucleo)
VALUES('Projeto casa quentinha','Vedação de casas com caixas de leite','2010-11-19',null,'Bom Jesus',3,1);

INSERT INTO Projetos (nome_projeto,descricao,data_inicio,data_fim,localizacao,id_categoria,id_nucleo)
VALUES('Reciclagem no morro','Oficinas sobre reciclagem','2014-11-07','2014-11-07','Morro da Cruz',4,1);

INSERT INTO Projetos (nome_projeto,descricao,data_inicio,data_fim,localizacao,id_categoria,id_nucleo)
VALUES('Do lixo à robótica','Aprendizado de tecnologia da informação usando materiais recicláveis','2010-02-21',null,'Vila Babilônia',1,2);

INSERT INTO Projetos (nome_projeto,descricao,data_inicio,data_fim,localizacao,id_categoria,id_nucleo)
VALUES('Projeto Casa de David','Projeto de revitalização das fachadas e também um projeto de pista de corrida com caixa de areia','2015-05-16','2016-04-12','Casa de David',2,2);

INSERT INTO Projetos (nome_projeto,descricao,data_inicio,data_fim,localizacao,id_categoria,id_nucleo)
VALUES('Sustentabilidade em casa','Desenvolvimento e implementação de tecnologias sustentáveis, de baixo custo e que podem ser entendidas e replicadas por todos','2001-07-08',null,'Jardim Ângela',4,2);

INSERT INTO Projetos (nome_projeto,descricao,data_inicio,data_fim,localizacao,id_categoria,id_nucleo)
VALUES('Santa Margarida DançArte','Promoção de atividades culturais, oficinas de dança e arte, bem como workshops de interesse da comunidade','2011-10-13',null,'Comunidade de Santa Margarida',1,4);

INSERT INTO Projetos (nome_projeto,descricao,data_inicio,data_fim,localizacao,id_categoria,id_nucleo)
VALUES('Projeto AMAR: energia eletrica na forma alternativa','Levar a energia alternativa fotovoltaica para os telhados dos abrigos que se espalham por todo o Rio de Janeiro','2006-12-15','2018-10-16','Abrigo de crianças Associação Beneficente AMAR',3,4);

INSERT INTO Projetos (nome_projeto,descricao,data_inicio,data_fim,localizacao,id_categoria,id_nucleo)
VALUES('Tratamento de Água à Cooperativa de Catadores de Lixo de Bongaba','Levar técnicas ecológicas de baixo custo, de tratamento das águas residuais em ambientes menos favorecidos,além de conscientizar a população para o perigo eminente de poluição de nossos recursos naturais','2012-11-13','2019-04-06','Cooperativa de Catadores de Lixo de Bongaba',3,4);

INSERT INTO Projetos (nome_projeto,descricao,data_inicio,data_fim,localizacao,id_categoria,id_nucleo)
VALUES('MaRecicla','Reciclagem de lixo','2010-10-10',null,'Complexo da Maré',4,4);

##TABELA DOS VOLUNTÁRIOS ASSOCIADOS A ONG
CREATE TABLE Voluntarios (
	id_voluntario int auto_increment,
	nome_voluntario varchar(100),
	idade int,
	data_entrada date,
	data_saida date,
	id_nucleo int,
	CONSTRAINT PK_VOLUNTARIOS PRIMARY KEY(id_voluntario),
	CONSTRAINT FK_NUCLEOS_VOLUNTARIOS FOREIGN KEY(id_nucleo) REFERENCES Nucleos(id_nucleo)
);

##INSERÇÃO DAS INFORMAÇÕES PERTINENTES AOS VOLUNTARIOS
INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Celso Costa',18,'2008-10-26','2015-05-01',1);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Caio Christison',20,'2008-12-07',null,1);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Ethelyn Ellis',40,'2014-11-08',null,1);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Bernardo Steed',32,'2009-04-17','2019-03-03',1);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Bruna Moraes',24,'2010-08-05','2017-04-30',1);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Salomé Byrd',45,'2016-08-08',null,1);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Basil Townsend',22,'2008-10-26',null,1);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Miriam Sacco',24,'2001-05-04','2003-06-14',2);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Jacqui Roberts Silva',52,'2002-08-29',null,2);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Gabriela Waterman',21,'2006-02-20','2007-10-03',2);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Cade Sharman',34,'2001-05-04',null,2);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Júlia Alcide Padovan',23,'2010-11-14',null,2);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Cristina Stein',34,'2008-07-28',null,2);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Adriano George',23,'2015-09-05',null,2);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Sheila Obando',28,'2016-12-05','2017-12-12',2);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Shawna Kingston',38,'2001-05-04','2012-09-21',2);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Ronaldo Iolanda Bandini',19,'2019-06-15',null,3);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Simon Espina',20,'2019-06-15',null,3);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Alan Teodosio Neil',18,'2019-06-15',null,3);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Leandro Feliciana Lippi',22,'2019-06-15',null,3);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Isaque Luigi Nunes',21,'2019-06-15',null,3);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Raul Boatwright',22,'2005-03-13','2019-07-18',4);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Cynthia Gibbs',23,'2007-12-18',null,4);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Luisinho Eloy Garrod',23,'2009-08-15',null,4);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Wardell Celestino Huxley',19,'2013-02-05','2018-03-04',4);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Rubens Christison',25,'2005-03-13',null,4);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Eliana Loyola',30,'2017-09-24','2019-10-15',4);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Gaspar Kinsley',20,'2007-12-05',null,4);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Jessica Cobb Santos',27,'2014-10-17',null,4);

INSERT INTO Voluntarios(nome_voluntario,idade,data_entrada,data_saida,id_nucleo)
VALUES('Aloísio Narváez',28,'2015-04-13','2019-09-01',4);

##TABELA COM A RELAÇÃO ENTRE VOLUNTÁRIOS E OS PROJETOS EM QUE PARTICIPAM
CREATE TABLE Participacoes(
	id_participacao int auto_increment,
	data_entrada date,
	data_saida date,
	funcao varchar(100),
	id_voluntario int,
	id_projeto int,
	CONSTRAINT PK_PARTICIPACOES PRIMARY KEY (id_participacao),
	CONSTRAINT FK_VOLUNTARIOS_PARTICIPACOES FOREIGN KEY (id_voluntario) REFERENCES Voluntarios(id_voluntario),
	CONSTRAINT FK_PROJETOS_PARTICIPACOES FOREIGN KEY (id_projeto) REFERENCES Projetos(id_projeto)
);

##INSERE INFORMAÇÕES SOBRE A PARTICIPAÇÃO DE VOLUNTARIOS EM PROJETOS
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2005-12-30','2015-05-01','voluntario',1,1);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2010-11-19','2015-05-01','lider',1,2);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2010-11-19',null,'lider',2,2);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2014-11-08',null,'lider',3,1);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2014-11-08',null,'voluntario',3,2);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2014-11-08',null,'lider',3,3);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2010-11-19','2019-03-03','voluntario',4,2);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2014-11-07','2019-03-03','voluntario',4,3);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2010-08-05','2017-04-30','voluntario',5,1);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2014-11-07','2017-04-30','voluntario',5,2);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2014-11-07','2017-04-30','voluntario',5,3);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2016-08-08',null,'voluntario',6,2);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2010-11-19',null,'voluntario',7,2);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2011-10-13','2003-06-14','voluntario',8,6);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2012-11-13',null,'voluntario',9,4);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2015-05-16',null,'lider',9,5);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2002-08-29',null,'voluntario',9,6);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2010-02-21','2007-10-03','voluntario',10,4);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2006-02-20','2007-10-03','lider',10,6);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2015-05-16',null,'voluntario',11,5);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2015-05-16',null,'voluntario',12,5);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2010-02-21',null,'lider',13,4);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2015-05-16',null,'voluntario',13,5);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2008-07-28',null,'lider',13,6);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2015-09-05',null,'voluntario',14,4);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2015-09-05',null,'lider',14,5);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2016-12-05','2017-12-12','voluntario',15,4);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2010-02-21','2012-09-21','voluntario',16,4);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2001-07-08','2012-09-21','voluntario',16,6);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2011-10-13','2019-07-18','voluntario',22,7);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2012-11-13','2019-07-18','voluntario',22,9);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2010-10-22','2019-07-18','voluntario',22,10);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2007-12-18',null,'lider',23,8);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2011-10-13',null,'voluntario',23,7);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2009-08-15',null,'voluntario',24,8);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2012-11-13',null,'voluntario',24,9);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2010-10-22',null,'lider',24,10);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2013-02-05','2018-03-04','voluntario',25,9);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2011-10-13',null,'lider',26,7);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2017-09-24','2019-10-15','voluntario',27,8);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2007-12-05',null,'voluntario',28,10);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2012-11-13',null,'lider',28,9);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2014-10-17',null,'voluntario',29,7);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2015-04-13','2019-09-01','voluntario',30,8);
INSERT INTO Participacoes(data_entrada,data_saida,funcao,id_voluntario,id_projeto)VALUES('2015-04-13','2019-09-01','lider',30,10);

COMMIT;

-- CONSULTAS
##Retorne o nome dos núcleos, incluindo aqueles não homologados, e a quantidade projetos, por núcleo.
select Nucleos.nome_nucleo, count(Projetos.id_projeto) as No_Projetos from Projetos
right outer join Nucleos
on Nucleos.id_nucleo = Projetos.id_nucleo
group by Nucleos.nome_nucleo;

##Retorne o nome das categorias e a quantidade projetos, por categoria.
select Categorias.tipo, count(Projetos.id_projeto) as No_Projetos from Projetos
inner join Categorias
on Categorias.id_categoria = Projetos.id_categoria
group by Categorias.tipo;

##Retorne o total de participantes em cada nucleo
select Nucleos.nome_nucleo, max(Voluntarios.id_voluntario) as No_Voluntarios from Voluntarios
inner join Nucleos
on Nucleos.id_nucleo = Voluntarios.id_nucleo
group by Voluntarios.id_nucleo;

##Retorne a lista completa de voluntarios ativos e suas funções para o projeto "Projeto Casa de David"
select Voluntarios.nome_voluntario, Participacoes.funcao from Voluntarios
inner join Participacoes
on Participacoes.id_voluntario = Voluntarios.id_voluntario
inner join Projetos
on Projetos.id_projeto = Participacoes.id_projeto
where Projetos.nome_projeto = "Projeto Casa de David" and Voluntarios.data_saida is null;

##Qual o nucleo que possui maior numero de participantes na função de lider, com idede menor que 25 anos.
select Nucleos.nome_nucleo, count(Nucleos.id_nucleo) as Lideres_menos_25 from Nucleos
inner join Voluntarios
on Voluntarios.id_nucleo = Nucleos.id_nucleo
left outer join Participacoes
on Participacoes.id_voluntario = Voluntarios.id_voluntario
where Voluntarios.idade < 25 and Participacoes.funcao = "lider"
group by Nucleos.nome_nucleo;

##Qual o nucleo que possui maior numero de participantes, com idede maior que 40 anos.
select Nucleos.nome_nucleo, count(Nucleos.id_nucleo) as No_Voluntario from Nucleos
inner join Voluntarios
on Voluntarios.id_nucleo = Nucleos.id_nucleo
left outer join Participacoes
on Participacoes.id_voluntario = Voluntarios.id_voluntario
where Voluntarios.idade > 40
group by Nucleos.nome_nucleo;

##Retorne a localização dos projetos finalizados até 2018, e a qual categoria pertenciam.
select Nucleos.nome_nucleo, Nucleos.cidade, Projetos.localizacao, Categorias.tipo from Projetos
inner join Categorias
on Categorias.id_categoria = Projetos.id_categoria
right outer join Nucleos
on Nucleos.id_nucleo = Projetos.id_nucleo
where Projetos.data_fim < '2018-01-01';

##Retorna o nome dos projetos, cujos núcleos foram criados depois de 2009.
Select Projetos.nome_projeto, Projetos.id_nucleo from Projetos
where Projetos.id_nucleo = (select Nucleos.id_nucleo from Nucleos 
where Nucleos.data_criacao > '2009-01-01');

##Retornar a quantidade de projetos, cuja categoria de projeto é igual a infraestrutura e assistência básica.
Select count(Projetos.id_projeto) as No_Projetos from Projetos
where Projetos.id_categoria = (Select Categorias.id_categoria from Categorias
where Categorias.tipo = "infraestrutura e assistência básica");



















