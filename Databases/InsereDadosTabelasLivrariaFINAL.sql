/*exercicios da aula 11 - 03/04/2019*/
/*exercicio 1) escreva o comando que retorna o nome dos autores de os titulos dos livros de sua autoria. 
A listagem deve estar ordenada pelo nome do autor.*/
SELECT A.nome, L.titulo
FROM Escreve E
	INNER JOIN Livro L
		ON E.codlivro = L.codlivro
	INNER JOIN Autor A
		ON E.matricula = A.matricula
	ORDER BY nome ASC;
    
/*Exercicio 2) Monte a consulta SQL que retorna as editoras que publicaram livros
escritos pelo autor "Mario da Silva"*/
SELECT DISTINCT Ed.nome
FROM Editora Ed
	INNER JOIN Livro L 
		ON Ed.codeditora = L.codeditora
	INNER JOIN Escreve E
		ON L.codlivro = E.codlivro
	INNER JOIN Autor A 
		ON E.matricula = A.matricula
WHERE A.nome LIKE 'MARIO DA SILVA';



/*Exercicio 3)Escreva o comando SQL que apresenta a quantidade de livros que foram
escritos por um autor cujo nome possui a palavra "Peixoto" e que já
foram lançados*/
SELECT A.nome, COUNT(L.codlivro) AS QuantidadeLivros
FROM Escreve E
	INNER JOIN Livro L 
		ON E.codlivro = L.codlivro
	INNER JOIN Autor A
		ON E.matricula = A.matricula
WHERE A.nome like '%PEIXOTO%' AND L.lancamento IS NOT NULL;


/*Exercicio 4) Monte o comando para apresentar o preço do livro mais caro publicado
pela "Mirandela Editora" sobre programação*/
SELECT L.titulo, E.nome, MAX(L.preco) AS MaiorPreco
FROM Livro L
	INNER JOIN Editora E
		ON L.codeditora = E.codeditora
	INNER JOIN Assunto A 
		ON L.sigla = A.sigla
WHERE E.nome like 'MIRANDELA EDITORA' AND A.descricao like 'PROGRAMACAO';


/*Exercicio 5)Escreva o comando SQL que apresente o título do livro e o nome da
editora que publica para todos os livros que custam menos que R$50.00.*/
SELECT L.titulo, E.nome, L.preco
FROM Livro L
	INNER JOIN Editora E
		ON E.codeditora = L.codeditora
WHERE preco<50;


/*Exercicio 6)Monte o comando SQL que retorna o nome e CPF do autor e os títulos
dos livros de sua autoria, para todo autor de nacionalidade brasileira e
que tenha nascido antes de 01 de janeiro de 1990. Ordene sua listagem
pelo nome do autor e pelo título do livro de forma crescente.*/
SELECT A.nome, A.cpf, L.titulo
FROM Escreve E
	INNER JOIN Autor A
		ON A.matricula = E.matricula
	INNER JOIN Livro L 
		ON L.codlivro = E.codlivro
WHERE A.nacionalidade like 'Brasileira' AND A.datanascimento < '1990-01-01';



/*Exercicio 7)Monte uma listagem que o CPF, o nome do autor e o preço máximo dos
livros de sua autoria. Apresente apenas as informações para os autores
cujo preço máximo for superior a R$40.00*/
SELECT A.cpf, A.nome, L.preco
FROM Escreve E
	INNER JOIN Autor A
		ON A.matricula = E.matricula
	INNER JOIN Livro L 
		ON L.codlivro = E.codlivro
WHERE L.preco > 40;


/*Exercicio 8)Monte o comando SQL que apresente uma listagem do nome dos autores
e o nome das editoras que já lançaram pelo menos dois livros dos
autores em questão*/
SELECT nome, editora

/*Exercicio 9)Escreva o comando SQL que apresente a descrição dos assuntos que são
referenciados em mais de 1 livro.*/




