/*exercicios da aula 11 - 03/04/2019*/
/*exercicio 1) escreva o comando que retorna o nome dos autores de os titulos dos livros de sua autoria. 
A listagem deve estar ordenada pelo nome do autor.*/

select A.nome, L.titulo
from Escreve Es
	INNER JOIN Livro L
		ON Es.codlivro = L.codlivro
	INNER JOIN Autor A
		ON Es.Matricula = A.matricula
	ORDER BY nome ASC;
    
/**Exercicio 2) /