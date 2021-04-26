select *
from livro 
where preco >50 and sigla = 'P';

select *
from livro;

select count(*) from livro;

select count(lancamento) from livro;

select sum(preco) from livro;

select avg(preco) from livro;

select max(preco) from livro
where sigla = 'P';

select max(preco) from livro;

select min(preco) from livro
where sigla ='B';

select descricao from assunto 
where sigla = 'B';

select sigla, avg(preco) from livro
group by sigla;

select sigla, count(*) from livro
group by sigla; /*agrupando as siglas e contando quantos livros tem cadastrados nas siglas. 3 dentro da b. 2 dentro da p. 1 dentro da sigla r*/


select sigla, max(preco) from livro
where lancamento is not null
group by sigla; /*retornar o preco mais caro da tabela livro, dentre aqueles que ja foram lancados. no null eh pq ele ainda nao foi lancado. agrupando pela sigla*/


select max(preco) from livro
where lancamento is not null
group by sigla; /*ele vai retornar tudo do maximo de preco mas tu nao vai fazer de qual sigla que ele esta agrupando*/

select sigla from livro;

select preco, sigla
from livro
where sigla = 'B';

select codeditora, count(*)
from livro
where lancamento is not null
group by codeditora;

select codeditora, avg(preco)
from livro
group by codeditora;

select sigla, avg(preco)
from livro
group by sigla
having avg(preco)>50.00; /*para que o preco medio dos livros seja maior do que 50*/

select sigla, count(*)
from livro
group by sigla
having count(*) >1; 

select sigla, count(*)
from livro
group by sigla
having count(*) >1; /*agrupa por sigla. selecionando as linhas que vamos querer contar, pra depois aparecer a contagem*/


select sigla, count(*)
from livro
where lancamento is not null
group by sigla
having count(*) >1;

select max(preco) as PrecoMaximo
from livro
where sigla = "B";/* serve para mudar o nome da coluna, que mostra o preco maximo*/

select max(preco) as PrecoMaximo
from livro where sigla = "B";

select distinct sigla as assunto
from livro; /*facilita para agrupar*/

select count(sigla)
from livro; /*vai contar 6 elementos pro atributo sigla, mesmo que tenha elementos repetidos. vai contar quantas linhas tem preenchidas pro atributo sigla*/

/* e se coloca DISTINCT ele vai mostrar só os que tem diferente e vai retornar so 3*/

select count(distinct sigla)
from livro;

select sigla, titulo, preco
from livro
order by sigla, preco desc; /*vai ordenar por sigla e por preco. por preco de ordem descendente, e sigla por ordem de menor letra,  e o titulo por ordem tambem*/

select titulo, preco
from livro
order by preco desc;

select sigla, titulo, preco
from livro
order by 2, preco desc;

/*exercicios - 1*/
/*exercicio 1)*/






/*exercicios - 2*/
/*exercicio 1)Escreva o comando para contar quantos são os autores cadastrados na tabela Autor */
select count(*)
from autor;

/*exercicio 2)Monte o comando SQL que retorna a quantidade de autores distintos que estão
associados a livros na tabela Escreve.*/
select count(distinct matricula)
from escreve;

/*exercicio 3)Escreva o comando que apresenta qual o número de autores de cada livro. Você deve
utilizar, novamente, a tabela Escreve.*/
select count(distinct matricula)
from escreve
group by codlivro;

/*exercicio 4)Apresente o comando SQL para gerar uma listagem dos códigos dos livros que possuem
pelo menos menos dois autores.*/
select codlivro, count(matricula)
from escreve
group by codlivro
having count(matricula) >=2;

/*exercicio 5)Escreva o comando para apresentar o preço médio dos livros por código de editora.
Considere somente aqueles que custam mais de R$45,00.*/
select avg(preco)
from livro
where preco>45
group by codeditora;

/*exercicio 6)Apresente o preço máximo, o preço mínimo e o preço médio dos livros cujos assuntos
(sigla) são ‘S’ ou ‘P’ ou ‘B’ para cada código de editora.*/
select sigla, max(preco), min(preco), avg(preco)
from livro
where sigla = 'S' or sigla = 'P' or sigla =  'B';

/*exercicio 7)Apresente quantos autores estão cadastrados no banco de dados para cada
nacionalidade.*/
select nacionalidade, count(distinct matricula) 
from autor
group by nacionalidade;

/*exercicio 8)Escreva o comando para apresentar quantos autores nasceram antes de 01 de janeiro de
1990 para cada nacionalidade.*/
select nacionalidade, count(distinct matricula)
from autor
where datanascimento>'01-01-1009'
group by nacionalidade;