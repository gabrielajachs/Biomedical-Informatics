/*Questao 2)*/
select unome, salario, salario as salarioacrescido
from funcionario
group by salario
having salario * 1.1;

/*Questao 3)*/
select unome, endereco
from funcionario
where endereco like '%houston%';

/*Questao 4)*/
select count(unome), avg(salario)
from funcionario;

/*Questao 5)*/
select sum(salario), max(salario), min(salario), avg(salario)
from funcionario; F
inner join departamento D
	on F.departamento = D.funcionario;
	
/*Questao 6)*/
select projnumero, projnome, count(projnome)
from projeto;

/*Questao 7)*/
select D.cpf, F.dependente_name
from dependente D
inner join funcionario F
	on D.funcionario = F.dependente
where dependente_name is null;

/*Questao 8)*/
select unome, dnumero
from funcionario;

/*CORREÇÃO DA PROVA*/

/*Questão 2*/
select pnome, unome, salario, salario*1.1 as reajuste
from funcionario;

/*Questão 3*/
select unome, endereco
from funcionario
where endereco like '%houston%';

/*Questão 4*/
select D.dnome, count(F.cpf), avg(F.salario)
from departamento D
inner join funcionario F 
on D.dnumero = F.dnumero
group by D.dnome;

/*Questão 5*/
select sum(F.salario), max(F.salario), min(F.salario), avg(salario)
from funcionario
inner join departamento D 
on D.dnumero = F.dnumero
where D.dnome = 'Research';

/*Questão 6*/
select P.projnumero, P.projnome, count(*)
from projeto P
inner join trabalha_em T
on P.pnumero = T.projnumero
group by P.projnumero, P.projnome
having count(*) > 2;

/*Questão 7*/
select pnome, unome
from funcionario F 
left outer join dependente D
on F.cpf = D.cpf
where D.cpf is null;

/*Questão 8*/
select F.dnumero, count(F.cpf)
from funcionario F 
inner join departamento D
on F.dnumero = D.dnumero
where salario > 40000 and F.dnumero IN
	(select F2.dnumero
	from funcionario F2
	group by F2.dnumero
	having count(F2.cpf) > 5)
group by F.dnumero;



