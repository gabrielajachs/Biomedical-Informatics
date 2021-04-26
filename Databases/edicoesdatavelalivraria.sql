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







