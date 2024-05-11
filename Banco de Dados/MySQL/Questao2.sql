create database if not exists questao2;
use questao2;

create table if not exists aeronave(
	num int primary key,
    marca varchar(20) not null,
    modelo varchar(20) not null,
    ano_fab int not null,
    data_aq int not null
);

create table if not exists piloto(
	cod_pil int primary key,
    cpf varchar(11) not null,
    nome varchar(20) not null,
    tel int
);

create table if not exists cliente(
	cpf varchar(11) primary key,
    nome varchar(20) not null,
    tel int not null
);

create table if not exists voo(
	num int,
    cod_pil int,
    cpf varchar(11),
    constraint pk_voo primary key(num, cod_pil, cpf),
    constraint fk_aero foreign key (num)
		references aeronave (num),
	constraint fk_pilo foreign key (cod_pil)
		references piloto (cod_pil),
	constraint fk_cliente foreign key (cpf)
		references cliente (cpf)
);

create table if not exists aviao(
	num int,
    capacid int,
    constraint pk_aviao primary key (num),
    constraint fk_aeronave foreign key(num)
		references aeronave (num)
);