create database if not exists AtividadeData;
use AtividadeData;
-- 2
create table if not exists usuario(
	id int auto_increment primary key,
    nome varchar(50),
    email varchar(100) unique,
    senha varchar(20)
);

create table if not exists tarefas(
	id int auto_increment primary key,
    id_usuario int,
    tarefa varchar(100),
    descricao varchar(100),
    dataCriacao date,
    dataLimite date,
    finalizada boolean
);
-- 3
insert into usuario(nome, email, senha) values
	("Ana", "ana@email.com", "123456"),
	("João", "joao@email.com", "qwerty"),
	("Maria", "maria@email.com", "q1w2e3r4t5"),
	("Paulo", "paulo@email.com", "s3nh4");
-- 4
insert into tarefas(id_usuario, tarefa, descricao, dataCriacao, dataLimite, finalizada) values
	(1, "Revisão de BD", "Estudar álgebra relacional", "2018-08-29", "2018-09-04", true),
    (1, "Prova de BD", "Prova de álgebra relacional", "2018-08-29", "2018-09-05", false),
    (2, "Academia", "Avaliação física", "2018-08-05", "2018-08-10", false),
    (3, "Inglês", "Realizar mátricula no curso de inglês intermediário 2019-1", "2018-09-01", "2018-10-31", false),
    (3, "Leitura", "Finalizar a leitura do livro O mundo assombrado pelos demônios", "2018-09-25", "2018-09-08", false),
    (4, "Aula de Redes", "Modelo OSI: camada de transporte", "2018-07-31", "2018-08-14", true),
    (4, "Contas", "Não esquecer de pagar as contas do mês", "2018-08-30", "2018-09-10", false),
    (4, "Estágio", "Entregar primeiro relatório de estágio obrigatório", "2018-07-05", "2018-08-31", false);

-- 5
select * from tarefas;
-- a
select u.nome, t.tarefa, t.dataLimite from tarefas as t join usuario as u on t.id_usuario = u.id;
-- b
select nome, tarefa, dataLimite from usuario as u join tarefas as t on u.id_usuario = t.id where curdate() <= dataLimite;
-- c
select nome, tarefa, dataLimite from usuario as u join tarefas as t on u.id = t.id_usuario 
	where dataLimite >= "2018-09-01" and dataLimite <= curdate();
-- d
select tarefa from usuario join tarefas on id_usuario = (select id from usuario where nome = "Paulo") group by tarefa;
-- e
select tarefa from usuario join tarefas on id_usuario = (select id from usuario where nome = "Paulo") 
	where dataLimite < curdate() group by tarefa;
-- f
select count(tarefa) from tarefas where dataLimite < curdate();
-- g
select nome from usuario 
	join tarefas on id_usuario = usuario.id 
    join (select id_usuario as i, count(tarefa) as c from tarefas group by id_usuario) as tarefasAgrupadas on id_usuario = tarefasAgrupadas.i
    where c = (select count(tarefa) as n from tarefas group by id_usuario order by n desc limit 1) group by nome;

-- h
select count(tarefa) from tarefas where finalizada = false;
-- i
select avg(c) from (select count(tarefa) as c from tarefas group by id_usuario) as n;

-- 6
delete from tarefas where curdate() > dataLimite and id_usuario = (select id from usuario where nome = "Paulo");

-- 7
update tarefas set finalizada = true where curdate() > dataLimite;






