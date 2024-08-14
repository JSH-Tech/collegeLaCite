drop database if exists dbsession;
create database dbsession
character set utf8mb4
collate utf8mb4_general_ci;

use dbsession;

drop table if exists saison;
create table saison (
	id_saison int primary key not null auto_increment,
    saison varchar(10)
);

drop table if exists cours;
create table cours(
	code_cours char(9) primary key not null,
    nom varchar(50),
    description text
);

drop table if exists semestre;
create table semestre(
	id_semestre int primary key not null auto_increment,
    id_saison int,
    annee year
);

drop table if exists classe;
create table classe(
	id_classe int primary key not null auto_increment,
    id_semestre int,
    code_cours char(9)
);

alter table semestre
add constraint foreign key (id_saison) references saison(id_saison);

alter table classe
add constraint foreign key (id_semestre) references semestre (id_semestre);

alter table classe
add constraint foreign key (code_cours) references cours(code_cours)