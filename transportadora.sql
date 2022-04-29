create database transportadora;
use transportadora;
create table remetente(
	id int not null auto_increment primary key,
    remetente varchar(50) not null,
    cpfcnpj varchar(18) not null,
    cep char(9) not null,
    logradouro varchar(100) not null,
    numero varchar(8) not null,
    bairro varchar(30) not null,
    estado varchar(50) not null,
    cidade varchar(50) not null,
    telefone char(14) not null,
    email varchar(50)
);

create table destinatario(
	id int not null auto_increment primary key,
    destinatario varchar(50) not null,
    cpf char(14) not null,
    cep char(9) not null,
    logradouro varchar(100) not null,
    numero varchar(8) not null,
    bairro varchar(30) not null,
    estado varchar(50) not null,
    cidade varchar(50) not null,
    telefone char(14) not null,
    email varchar(50)
);

create table mercadoria(
	id int not null auto_increment primary key,
    id_remetente int not null,
    mercadoria varchar(50) not null,
    dimensao varchar(30) not null,
    peso double not null,
    fragil boolean not null,
    foreign key (id_remetente) references remetente(id)
);

create table envio(
	id int not null auto_increment primary key,
    id_remetente int not null,
    id_mercadoria int not null,
    id_destinatario int not null,
    tipo_envio boolean not null,
    frete double not null,
    foreign key (id_remetente) references remetente(id),
    foreign key (id_mercadoria) references mercadoria(id),
    foreign key (id_destinatario) references destinatario(id)
);

create table entrega(
	id int not null auto_increment primary key,
    id_envio int not null,
    status_envio tinyint not null,
    forma_entrega tinyint not null,
    entregador varchar(50) not null,
    tempo varchar(20) not null,
    foreign key (id_envio) references envio(id)
);