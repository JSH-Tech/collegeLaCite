use boutique_jouet;

update client set prenom="Bob" where nom="Duval";

delete from client where nom="Tremblay" and prenom="Simon";
update client set nom="Roger" and prenom="Robert" where id_client="3";
delete from client where nom="Laporte" and date_naissance<"1993-01-01";
update produit set prix=(prix/2);