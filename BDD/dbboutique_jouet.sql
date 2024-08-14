-- Créer la base de données
DROP DATABASE IF EXISTS boutique_jouet;
CREATE DATABASE boutique_jouet 
CHARACTER SET utf8mb4 
COLLATE utf8mb4_unicode_ci;

-- Utiliser la base de données pour le reste des opérations
USE boutique_jouet;

-- Créer la table client
DROP TABLE IF EXISTS client;
CREATE TABLE client(
    id_client INT,
    prenom VARCHAR(50),
    nom VARCHAR(50),
    adresse VARCHAR(100),
    ville VARCHAR(50),
    province VARCHAR(50),
    pays VARCHAR(50)
);

-- Créer la table commande
DROP TABLE IF EXISTS commande;
CREATE TABLE commande(
    id_commande INT,
    id_client INT,
    prix_total FLOAT,
    date DATE
);

-- Créer la table categorie
DROP TABLE IF EXISTS categorie;
CREATE TABLE categorie(
    id_categorie INT,
    nom_categorie VARCHAR(50)
);

-- Créer la table produit
DROP TABLE IF EXISTS produit;
CREATE TABLE produit(
    id_produit INT,
    id_categorie INT,
    nom VARCHAR(100),
    prix FLOAT
);

-- Créer la table commande_produit
DROP TABLE IF EXISTS commande_produit;
CREATE TABLE commande_produit(
    id_commande INT,
    id_produit INT,
    quantite INT,
    prix_total_produit FLOAT
);