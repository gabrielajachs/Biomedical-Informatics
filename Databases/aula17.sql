INSERT INTO Livro VALUES (999, ' Livro Teste', 10.00, '1990-02-02', 1, 'B');
SELECT TRIM(Titulo);

SELECT DAY(Lancamento) AS mes
FROM livro
WHERE codlivro = 1;

SELECT DATE_FORMAT(lancamento, "%d/%m/%y") AS lancamento
FROM livro
WHERE codlivro = 1;

SELECT preco, CEIL(preco)
FROM livro;

INSERT INTO livro VALUES(998, 'Livro teste 2', 49.00, '1990-03-02','B');

SELECT 'livro:' || titulo AS texto
FROM livro;

/*aula 16 - 24/04/2019
exercicio 1:Estão sendo estudados aumentos nos preços dos livros. Escreva o
comando SQL que retorna uma listagem contendo o título dos livros, e
mais três colunas: uma contendo o preço dos livros acrescidos de 10%
(deve ser chamada de Opção_1), a segunda contendo os preços
acrescidos de 15% (deve ser chamada de Opção_2) e a terceira contendo
os preços*/


/*2. Escreva o comando SQL que apresente uma listagem dos nomes dos
autores e do seu ano e mês de nascimento para autores brasileiros. A
listagem deve estar ordenada em ordem decrescente de idade do autor e
em ordem crescente de nome.*/


/*3. Apresente o comando que gere uma listagem com os títulos dos livros
cujo título tenha comprimento superior a 15 caracteres
Exercícios*/


/*4. Escreva o comando SQL que apresente uma listagem dos livros cujo
assunto é banco de dados, fazendo com que a palavra ‘BANCOS’ seja
substituída pela palavra ‘BANCO’.*/


/*5. Escreva um comando que apresente o ano da data de nascimento dos
autores (com apenas dois dígitos).*/