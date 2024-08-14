DROP DATABASE IF EXISTS boutique_jouet;
CREATE DATABASE boutique_jouet CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE boutique_jouet;

CREATE TABLE client(
	id_client INT NOT NULL AUTO_INCREMENT,
	nom VARCHAR(50) NOT NULL,
	prenom VARCHAR(50) NOT NULL,
	date_naissance DATE NULL,
	CONSTRAINT pk_client PRIMARY KEY(id_client)
);

CREATE TABLE produit(
	id_produit INT NOT NULL AUTO_INCREMENT,
	nom VARCHAR(50) NOT NULL,
	description TINYTEXT NOT NULL,
	prix DOUBLE NOT NULL,
	CONSTRAINT pk_produit PRIMARY KEY(id_produit)
);

CREATE TABLE commande(
	id_commande INT NOT NULL AUTO_INCREMENT,
	id_client INT NOT NULL,
	date_commande DATE NOT NULL,
	CONSTRAINT pk_commande PRIMARY KEY(id_commande),
	CONSTRAINT fk_commande FOREIGN KEY(id_client)
		REFERENCES client(id_client)
		ON DELETE RESTRICT
		ON UPDATE CASCADE
);

CREATE TABLE commande_produit(
	id_commande INT NOT NULL,
	id_produit INT NOT NULL,
	quantite INT NOT NULL,
	CONSTRAINT pk_commande_produit PRIMARY KEY(id_commande, id_produit),
	CONSTRAINT fk_commande2 FOREIGN KEY(id_commande)
		REFERENCES commande(id_commande)
		ON DELETE RESTRICT
		ON UPDATE CASCADE,
	CONSTRAINT fk_produit FOREIGN KEY(id_produit)
		REFERENCES produit(id_produit)
		ON DELETE RESTRICT
		ON UPDATE CASCADE
);