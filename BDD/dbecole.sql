drop database if exists ecole;
create database ecole
character set utf8mb4
collate utf8mb4_general_ci;

use ecole;

drop table if exists etudiant;
create table etudiant(
	id_etudiant char(7) primary key,
    prenom varchar(50),
    nom varchar(50),
    telephone char(14),
    note_moyenne float
);

drop table if exists professeur;
create table professeur(
	id_professeur char(7) primary key,
    prenom varchar(50),
    nom varchar(50),
    nas char(9)
);

drop table if exists saison;
create table saison (
	id_saison int primary key not null,
    saison varchar(10)
);

drop table if exists cours;
create table cours(
	id_cours char(9) primary key not null,
    nom varchar(50),
    description text
);

drop table if exists programme;
create table programme(
	id_programme int primary key,
    nom varchar(50)
);

drop table if exists semestre;
create table semestre(
	id_semestre int primary key,
    id_saison int,
    anne year,
   foreign key (id_saison) references saison(id_saison)     
);

drop table if exists classe;
create table classe(
	id_classe int primary key,
    id_semestre int,
    id_cours char(9),
    foreign key (id_semestre) references semestre(id_semestre),
    foreign key (id_cours) references cours(id_cours)
);

drop table if exists classe_professeur;
create table classe_professeur(
	id_class int,
    id_professeur char(7),
    primary key (id_class, id_professeur)
);

drop table if exists classe_etudiant;
create table classe_etudiant(
	id_classe int,
    id_etudiant char(7),
    note float,
    primary key(id_classe, id_etudiant)
);

drop table if exists cours_programme;
create table cours_programme(
	id_cours char(9),
    id_programme int,
    primary key(id_cours, id_programme),
    foreign key (id_cours) references cours(id_cours),
    foreign key (id_programme) references programme(id_programme)
);
