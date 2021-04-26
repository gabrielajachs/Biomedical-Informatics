/*exemplo 1*/

SELECT L.titulo, L.preco
FROM Livro L 
WHERE L.preco > (SELECT L.preco FROM livro L WHERE L.titulo = 'REDES DE COMPUTADORES');

/*exemplo 2*/
SELECT L.titulo, L.preco
FROM Livro L
WHERE L.preco < (SELECT AVG(L.preco) FROM Livro L);

/*com a utilizacao do predicado IN vimos que era pssivel comparar o valor de uma coluna com uma lista de valores*/
SELECT L.titulo
FROM Livro L
	INNER JOIN Editora E
    ON L.codeditora = E.codeditora
WHERE E.nome NOT IN ('MIRANDELA EDITORA','EDITORA VIA-NORTE');


SELECT L.titulo, E.nome
FROM Livro L 
	RIGHT OUTER JOIN Editora E
    ON L.codeditora = E.codeditora
WHERE E.codeditora NOT IN
	(SELECT DISTINCT L.codeditora 
    FROM livro L 
		INNER JOIN Assunto A
        ON L.sigla = A.sigla
	WHERE A.descricao = 'Banco de Dados');
    
/*seleciona os nomes e os preços dos livros cujo valor é inferior ao livro de preço MINIMO da EDITORA VIA-NORTE*/
SELECT L.titulo, MIN(L.preco)
FROM Livro L 
GROUP BY L.titulo
HAVING MIN(L.preco) < 
	(SELECT MIN(L.preco)
	FROM Livro L 
		INNER JOIN editora E
        ON L.codeditora = E.codeditora
	WHERE E.nome = 'Editora Via-Norte'
	GROUP BY E.nome);
        
/*livro cujo preço é maior do que o livro de maior preço da editora mirandela*/
SELECT L.titulo, L.preco
FROM Livro L
WHERE L.preco > 
	(SELECT MAX(L.preco)
	FROM Livro L 
		INNER JOIN Editora E
		ON L.codeditora = E.codeditora
	WHERE E.nome = 'MIRANDELA EDITORA');
    
/*listar o nome das editoras que possuem os livros ja lançados*/
SELECT DISTINCT E.nome
FROM Editora E
WHERE E.codeditora IN
	(SELECT L.codeditora
	FROM Livro L
	WHERE L.lancamento IS NOT NULL);
    
/*quais os assuntos que nao foram lancados livros*/    


/*nomes dos autores, respectivas publicacoes, precos inferiores a 42*/
SELECT T.nome, T.titulo, T.preco
FROM (SELECT A.nome, L.titulo, L.preco
	FROM Autor A 
	INNER JOIN Escreve E
    ON A.matricula = E.matricula
    INNER JOIN Livro L 
    ON E.codlivro = L.codelivro) T
WHERE T.preco > 42;

/*selecionar os nomes das editoras que tem livro com preco inferior da editora via-norte*/
SELECT DISTINCT E.nome
FROM Livro L 
	INNER JOIN Editora E
    ON L.codeditora = E.codeditora
WHERE L.preco < ALL
(SELECT L.preco
FROM Livro L 
	INNER JOIN Editora E
    ON L.codeditora = E.codeditora
WHERE E.nome = 'EDITORA VIA-NORTE');

/*selecione o nome das editoras que possuem livros ja lançados*/
SELECT E.nome
FROM Editora E
WHERE EXISTS
	(SELECT * FROM Livro L 
	WHERE L.lancamento IS NOT NULL AND A.sigla = L.sigla);
    
/*EXERCICIOS DA AULA*/
/*1. Escreva o comando SQL que apresente o nome do autor mais velho*/

SELECT MAX(A.datanascimento), A.nome
FROM Autor A
HAVING datanascimento <


/*2. Monte um comando SQL que retorne os nomes de todos os autores e a
quantidade de livros que já lançaram. Ordene a listagem em ordem
decrescente de quantidade. Para cada quantidade, ordene os nomes em
ordem alfabética*/

SELECT A.nome, L.titulo
FROM Livro L

/*3. Apresente um comando SQL para listar o nome das editoras que não
publicaram livro*/

/*4. Escreva o comando para contar quantos foram os autores que
escreveram mais de um livro*/

/*5. Escreva o comando SQL que retorna uma listagem contendo os nomes
das editoras que lançam apenas livros cujo assunto é programação*/

/*6. Monte um comando para apresentar o nome do autor de nacionalidade
brasileira que publicou o livro mais barato*/

/*7. Monte o comando que apresenta o nome das editoras que publicaram
mais de um livro sobre o assunto BANCO DE DADOS*/
    
		