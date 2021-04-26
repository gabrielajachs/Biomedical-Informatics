-- INSERÇÃO DE DADOS NA TABELA ASSUNTO


INSERT INTO Assunto(sigla, descricao)
VALUES('B', 'BANCO DE DADOS');

INSERT INTO Assunto(sigla, descricao)
VALUES('P', 'PROGRAMAÇÃO');

INSERT INTO Assunto(sigla, descricao)
VALUES('R', 'REDES');

INSERT INTO Assunto(sigla, descricao)
VALUES('S', 'SISTEMAS OPERACIONAIS');



-- INSERÇÃO DE DADOS NA TABELA EDITORA

INSERT INTO Editora(codeditora, nome)
VALUES(1, 'MIRANDELA EDITORA');

INSERT INTO Editora(codeditora, nome)
VALUES(2, 'EDITORA VIA-NORTE');

INSERT INTO Editora(codeditora, nome)
VALUES(3, 'EDITORA ILHAS TIJUCA');

INSERT INTO Editora(codeditora, nome)
VALUES(4, 'MARIA JOSÉ EDITORA');


-- INSERÇÃO DE DADOS NA TABELA LIVRO

INSERT INTO Livro(codlivro, titulo, preco, lancamento, sigla, codeditora)
VALUES(1, 'BANCO DE DADOS PARA WEB', 31.20, '1999-01-10', 'B', 1);

INSERT INTO Livro(codlivro, titulo, preco, lancamento, sigla, codeditora)
VALUES(2, 'PROGRAMANDO EM LINGUAGEM C', 30.00, '1997-10-01', 'P', 1);

INSERT INTO Livro(codlivro, titulo, preco, lancamento, sigla, codeditora)
VALUES(3, 'PROGRAMANDO EM LINGUAGEM C++', 111.50, '1998-11-01', 'P', 3);

INSERT INTO Livro(codlivro, titulo, preco, lancamento, sigla, codeditora)
VALUES(4, 'BANCO DE DADOS NA BIOINFORMÁTICA', 48.00, NULL, 'B', 2);

INSERT INTO Livro(codlivro, titulo, preco, lancamento, sigla, codeditora)
VALUES(5, 'REDES DE COMPUTADORES', 42.00, '1996-09-01', 'R', 2);

INSERT INTO Livro(codlivro, titulo, preco, lancamento, sigla, codeditora)
VALUES(6, 'BANCOS DE DADOS DISTRIBUÍDOS', 32.00, '1998-09-09', 'B', 1);



-- INSERÇÃO DE DADOS NA TABELA AUTOR

INSERT INTO Autor(matricula, cpf, nome, datanascimento, endereco, nacionalidade)
VALUES(111, 80734566, 'Mario da Silva', '1965-10-10', 'Avenida Ipiranga, 456 - Rio Grande do Sul', 'Brasileira');

INSERT INTO Autor(matricula, cpf, nome, datanascimento, endereco, nacionalidade)
VALUES(222, 90534586, 'Alberto Alencar', '1957-02-23', 'Rua Salgado Leite, 245 - Rio de Janeiro', 'Brasileira');

INSERT INTO Autor(matricula, cpf, nome, datanascimento, endereco, nacionalidade)
VALUES(333, 70734466, 'Francisco João Peixoto', '1992-12-11', 'Rua Annes Dias, 444 - Rio Grande do Sul', 'Brasileira');

INSERT INTO Autor(matricula, cpf, nome, datanascimento, endereco, nacionalidade)
VALUES(444, 77765444, 'Pedro Silveira', '1991-01-10', 'Rua Annes Dias, 448 - Rio Grande do Sul', 'Portuguesa');



-- INSERÇÃO DE DADOS NA TABELA ESCREVE

INSERT INTO Escreve(matricula, codlivro)
VALUES(111, 1);

INSERT INTO Escreve(matricula, codlivro)
VALUES(111, 6);

INSERT INTO Escreve(matricula, codlivro)
VALUES(111, 4);

INSERT INTO Escreve(matricula, codlivro)
VALUES(222, 1);

INSERT INTO Escreve(matricula, codlivro)
VALUES(333, 2);

INSERT INTO Escreve(matricula, codlivro)
VALUES(333, 3);

INSERT INTO Escreve(matricula, codlivro)
VALUES(444, 5);

COMMIT;
