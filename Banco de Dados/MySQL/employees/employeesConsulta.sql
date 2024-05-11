use employees;

-- Questão 1 -> tempo = 0.422sec
select sql_no_cache * from employees where last_name = "Garrabrants";

-- Questão 2 -> tempo = 4.937sec, tipo -> secundário
create index sobrenome on employees(last_name);

-- Questão 3 -> tempo = 0.141sec, desmpenho melhor
select sql_no_cache * from employees where last_name = "Garrabrants";

-- Questão 4 -> tempo = 7.828sec
select sql_no_cache first_name, last_name from employees as e join salaries as s on e.emp_no = s.emp_no where salary = 63810 and to_date < "1988-05-04";

-- Questão 5 -> tempo = 30.016sec
create index salario on salaries(salary);

-- Questão 6 -> tempo = 0.532sec, desmpenho melhor
select sql_no_cache first_name, last_name from employees as e join salaries as s on e.emp_no = s.emp_no where salary = 63810 and to_date < "1988-05-04";