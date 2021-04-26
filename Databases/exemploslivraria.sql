select * from editora;

select * from livro
ORDER BY codeditora;

SELECT E.nome , L.titulo
FROM editora E
	RIGHT OUTER JOIN Livro L 
    ON E.codeditora = L.codeditora
ORDER BY nome, titulo;

/*exercicio: desejamos obter uma listagem das editoras que nao publicaram livros*/
SELECT E.nome, E.codeditora
FROM editora E
	LEFT OUTER JOIN Livro L 
    ON E.codeditora = L.codeditora
WHERE titulo is null
ORDER BY codeditora;

