use bdaula;

CREATE TABLE if not exists vendedores (
cod_vend INTEGER NOT NULL UNIQUE,
nome_vend VARCHAR(50),
PRIMARY KEY (cod_vend)
);

CREATE TABLE if not exists clientes (
nro_cli INTEGER NOT NULL UNIQUE,
nome_cli VARCHAR(50),
end_cli VARCHAR(50),
saldo_cli DECIMAL,
cod_vend INTEGER,
PRIMARY KEY (nro_cli),
FOREIGN KEY (cod_vend) REFERENCES vendedores(cod_vend)
);

INSERT INTO vendedores VALUES
(1, 'Adriana'),
(2, 'Roberto');

INSERT INTO clientes VALUES
(1, 'Márcia', 'Rua X', 100.00, 1),
(2, 'Cristina', 'Avenida 1', 10.00, 1),
(3, 'Manoel', 'Avenida 3', 234.00, 1),
(4, 'Rodrigo', 'Rua X', 137.00, 2);

select * from clientes where end_cli = "Rua X";

select * from clientes where saldo_cli > 100;

select nome_cli as "Nome", saldo_cli as "Saldo" from clientes where saldo_cli > 100;

select sum(saldo_cli) from clientes;

select nome_cli as Nomes from clientes union select nome_vend from vendedores;

INSERT INTO clientes VALUES (5, "Adriana", "Rua Z", 37.50, 1);

select nome_cli as Nomes from clientes join vendedores on nome_cli = nome_vend;

select * from clientes, vendedores where clientes.cod_vend = vendedores.cod_vend;

select * from clientes join vendedores on clientes.cod_vend = vendedores.cod_vend;

select sum(c.saldo_cli) from clientes as c join vendedores as v on c.cod_vend=v.cod_vend group by v.cod_vend;