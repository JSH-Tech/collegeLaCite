DROP database if exists dbAeroport;

CREATE database dbAeroport
character SET utf8mb4
collate utf8mb4_unicode_ci;

USE dbAeroport;

DROP table IF exists aeroport;
CREATE TABLE aeroport(
	id_aeroport int primary key,
    nom varchar(50),
    province varchar(50),
    ville varchar(50)
);

DROP table if exists passager;
CREATE table passager(
id_passager int primary key,
nom varchar(50),
pays varchar(50) default "Canada"    
);

DROP table if exists avion;
CREATE table avion(
id_avion int primary key,
id_aeroport int,
marque varchar(50),
modele varchar(50),
date_achat Date,
foreign key (id_aeroport) references aeroport(id_aeroport)    
);

DROP table if exists vol;
CREATE table vol(
id_vol int primary key,
id_avion int,
ville_depart varchar(50) not null,
ville_arrivee varchar(50),
date_vol date,
foreign key (id_avion) references avion(id_avion)  
);

DROP table if exists vol_passager;
CREATE table vol_passager(
id_passager int ,
id_vol int,
cout_billet Double check (cout_billet>0 and cout_billet<5000),
constraint primary key(id_passager,id_vol),
foreign key (id_passager) references passager (id_passager),
foreign key (id_vol) references vol (id_vol)
);





