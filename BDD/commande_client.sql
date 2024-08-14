DROP database if exists commande_client;

CREATE database commande_client
character SET utf8mb4
collate utf8mb4_unicode_ci;

USE commande_client;

DROP table IF exists categorie;
CREATE TABLE categorie(
	id_categorie int primary key auto_increment,
    nom_categorie varchar(50)
);

DROP table IF exists produit;
create table produit(
	id_produit int primary key auto_increment,
	id_categorie int,
    nom varchar(50),
    prix float not null
);

drop table if exists commande_produit;
create table commande_produit(
	id_commande int,
    id_produit int,
    quantite int default 1,
    prix_total_produit float,
    constraint primary key (id_commande, id_produit),
    constraint check(quantite>0 and prix_total_produit>0)
);

drop table if exists commande;
create table commande(
	id_commande int primary key auto_increment,
    id_client int,
    prix_total float,
    date_commande DATE
);

drop table if exists client;
create table client(
	id_client int PRIMARY KEY auto_increment,
    prenom varchar(50) unique,
    nom varchar(50),
    adresse varchar(100),
    ville varchar(50) default "Ottawa" not null,
    province varchar(50),
    pays varchar(50)
);

Alter table produit
add constraint foreign key (id_categorie) references categorie(id_categorie);

alter table commande_produit
add constraint foreign key (id_commande) references commande(id_commande);

alter table commande_produit
add constraint foreign key (id_produit) references produit(id_produit);

alter table commande
add constraint foreign key (id_client) references client(id_client);