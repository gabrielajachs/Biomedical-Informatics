-- Encontre o nome do departamento de todos os instrutores
SELECT name, dept_name 
FROM instructor;

-- Encontre os nomes dos instrutores que recebem salário entre 90.000 e 100.000
SELECT name 
FROM instructor
WHERE salary > 90000 AND salary < 100000; 

-- Encontre o nome do departamento de todos os instrutores com salário superior a 70000 do departamento “Comp. Sci.”
SELECT name, salary 
FROM instructor
WHERE dept_name LIKE 'Comp. Sci.' AND salary > 70000;

/*Encontre os nomes dos departamentos cujos nomes dos prédios incluam a
substring Watson*/

SELECT dept_name
FROM department
WHERE building LIKE '%son%';

/*Selecione todos os instrutores do departamento ‘Physics’ em ordem alfabética*/

SELECT name
FROM instructor
WHERE dept_name LIKE 'Physics'
ORDER BY name ASC;

/*Verifique se existe algum instrutor cujo salário não foi informado*/
SELECT name 
FROM instructor
WHERE salary IS NULL;

/*Ache o salário médio dos instrutores no departamento ‘Comp. Sci’*/
SELECT AVG(salary) as MediaSalarial
FROM instructor
WHERE dept_name LIKE 'Comp. Sci.';

/*Ache o número total de instrutores que ministraram um curso no semestre da
primavera de 2010*/

SELECT DISTINCT(COUNT(ID))
FROM teaches
WHERE semester LIKE 'Spring' AND year LIKE '2010';

/*Ache o salário médio de cada departamento*/
SELECT dept_name, AVG(salary)
FROM instructor
GROUP BY dept_name;

/*Quais os departamentos cujo salário médio dos instrutores é maior que
42000?*/
SELECT dept_name, AVG(salary) as MediaSalario
FROM instructor
GROUP BY dept_name
HAVING MediaSalario > 40000;

/*Ache todos os cursos ministrados nos semestres de outono de 2009 e
primavera de 2010*/

SELECT DISTINCT(course.title)
FROM course
INNER JOIN teaches
	ON teaches.course_id = course.course_id
WHERE (semester LIKE 'Fall' AND year LIKE '2009') OR
	(semester LIKE 'Spring' AND year LIKE '2010');
    
/*---------------------------- JUNÇÕES ----------------------------*/
select * 
from student
NATURAL join takes;

select * 
from student
INNER join takes
	on student.id = takes.id;

INSERT INTO student VALUES('99999', 'Josnel', 'Comp. Sci.', 200);

SELECT *
FROM student
LEFT OUTER JOIN takes
	ON student.id = takes.id;
    
/*Ache todos os alunos que não realizaram curso*/
SELECT student.name
FROM student
LEFT OUTER JOIN takes
	ON student.id = takes.id
WHERE course_id IS NULL;