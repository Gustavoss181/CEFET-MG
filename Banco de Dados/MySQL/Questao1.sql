create database if not exists questao1;
use questao1;
create table if not exists medico(
	cod_med int primary key,
    nome varchar(20) not null,
    crm varchar(20) not null,
    email varchar(20) not null
);

create table if not exists telMedico(
	num int,
    cod_med int,
    constraint pk_telMed primary key(num, cod_med),
    constraint fk_med foreign key(cod_med)
		references medico (cod_med)
);

create table if not exists PlanoSaude(
    cod_plano int primary key,
    nome varchar(20)
);

create table if not exists Paciente(
	cod_pac int primary key,
    nome varchar(20),
    cpf char(11),
    ende varchar(45),
    cod_plano int,
    constraint fk_plano foreign key (cod_plano)
		references PlanoSaude(cod_plano)
);

create table if not exists telPaciente(
	num int,
    cod_pac int,
    constraint pk_telPac primary key(num, cod_pac),
    constraint fk_pac foreign key(cod_pac)
		references paciente (cod_pac)
);

create table if not exists Medicamento(
	cod_medic int primary key,
    nome varchar(20)
);

create table if not exists Exame(
	cod_exame int primary key,
    nome varchar(20)
);

create table if not exists Especialidade(
	cod_espe int primary key,
    nome varchar(20)
);

create table if not exists Consulta(
	cod_med int,
    cod_pac int,
	data_consulta int,
    constraint pk_cons primary key(cod_med, cod_pac, data_consulta),
	constraint fk_medico foreign key(cod_med)
		references medico (cod_med),
	constraint fk_paciente foreign key(cod_pac)
		references paciente (cod_pac)
);

create table if not exists Prescricao(
	cod_med int,
    cod_pac int,
	data_consulta int,
    cod_medic int,
    constraint pk_pres primary key(cod_med, cod_pac, data_consulta, cod_medic),
	constraint fk_cons foreign key(cod_med, cod_pac, data_consulta)
		references consulta (cod_med, cod_pac, data_consulta),
	constraint fk_medic foreign key(cod_medic)
		references medicamento (cod_medic)
);

create table if not exists Solicitacao(
	cod_med int,
    cod_pac int,
	data_consulta int,
    cod_exame int,
    constraint pk_solic primary key(cod_med, cod_pac, data_consulta, cod_exame),
	constraint fk_consu foreign key(cod_med, cod_pac, data_consulta)
		references consulta (cod_med, cod_pac, data_consulta),
	constraint fk_exame foreign key(cod_exame)
		references exame (cod_exame)
);

create table if not exists Especializacao(
	cod_espe int,
    cod_med int,
    constraint primary key (cod_espe, cod_med),
	constraint fk_espe foreign key(cod_espe)
		references especialidade (cod_espe),
	constraint fk_medi foreign key(cod_med)
		references medico (cod_med)
);