select codlivro, titulo, codeditora
from livro;

select nome
from editora
where codeditora = 1;

select codlivro, titulo, nome
from livro
	INNER JOIN Editora
    ON livro.codeditora = livro.codeditora;
    
select *
from escreve;

/*Para ver o nome do autor e o titulo do livro*/
select L.titulo, A.nome
from Escreve Es
	INNER JOIN Livro L
		ON Es.codlivro = L.codlivro
	INNER JOIN Autor A
		ON Es.Matricula = A.matricula
	ORDER BY titulo ASC;
    
/*quais os titulos dos livros ja lancados e a descricao de seus assuntos?*/
select L.titulo, A.descricao
from livro L
	INNER JOIN assunto A
		ON L.sigla = A.sigla
where L.lancamento IS NOT NULL;

/*juncao por colunas com nomes em comum nas duas tabelas*/
/*juntao natural busca quais sao as chaves correspondetes e ja faz isso naturalmente, sem que precise forcar pelo ON
usa o NATURAL JOIN*/
select E.nome, L.titulo
from editora E
	natural join livro L 
where L.lancamento is not null
order by nome, titulo ASC;