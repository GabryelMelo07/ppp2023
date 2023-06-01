drop database if exists facade_clientes;

create database facade_clientes;

\c facade_clientes;

create table cliente (
    id serial,
    nome varchar(255),
    cpf char(11) unique,
    primary key (id)
);

insert into cliente (nome, cpf) values
('Gabryel', '03064462008');