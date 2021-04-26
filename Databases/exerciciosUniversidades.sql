/*AULA 10/04/2019
Informe a quantidade de alunos cujo último nome começa com a letra W
ou K e que reside na cidade de SEATTLE. alunossn=matricula*/

SELECT COUNT(alunossn)
FROM aluno
WHERE ultimonome like 'k%' or ultimonome like 'w%'
AND cidade = 'SEATTLE';

/*2. Informe a quantidade de cursos oferecidos por faculdade.*/

SELECT F.primeironome, COUNT(CO.offerno)
FROM cursooferecido CO
	INNER JOIN faculdade F
		ON F.facssn = CO.facssn
GROUP by CO.facssn;

/*3. Selecione o código (cursono), a estação e o ano, somente para os cursos
oferecidos no verão de 2005. Ordene o resultado de maneira ascendente
de acordo com o código do curso.*/

SELECT cursono, estacao, ano
FROM cursooferecido
WHERE estacao = 'summer' AND ano = 2005
ORDER BY offerno ASC;

/*4. Informe qual é a quantidade de cursos oferecidos por ano e estação
ordenando-os de maneira ascendente por ano. Crie um apelido para
função de agregação (ex: Quantidade). offerno = id do cursos oferecidos*/

SELECT COUNT(offerno) AS quantidade, ano, estacao
FROM cursooferecido
GROUP BY ano, estacao;

/*5.Informe qual é a média do campo gpa (na tabela Aluno) por cidade,
selecionando somente as tuplas cuja média seja superior a 3.25. Crie um
apelido para a coluna da função agregada e ordene o resultado de
maneira descendente para cidade.*/

SELECT AVG(gpa) as media
FROM aluno
GROUP BY cidade
HAVING media>3.25
ORDER BY cidade DESC;

/*6. Faça a mesma consulta da questão 5, mas limite o resultado para os
alunos da classe JR.*/

SELECT AVG(gpa) as media
FROM aluno
GROUP BY cidade
HAVING media>3.25
ORDER BY cidade DESC;

/*7. Selecione o nome dos cursos que comecem a palavra “FUNDAMENTALS” e
ordene o campo de maneira ascendente.


8. Informe a quantidade de alunos por curso oferecido. Crie um apelido
para a função de ordenação e ordene de maneira ascendente para a
coluna da função de agregação.*/


/*9.Selecione os códigos dos cursos oferecidos e as salas eliminando as
duplicatas. Ordene de maneira ascendente para o código de curso.*/


/*10. Retorne a soma dos créditos dos nomes de curso que não começam com
a letra F, Crie um apelido para a coluna da função de agregação.*/


/*11. Retorne a quantidade de cursos oferecidos que possuam o código da
faculdade informado e que não tenham sido alocados na sala BLM214.*/


/*12. Retorne o valor máximo da coluna gpa na cidade de SEATTLE. */