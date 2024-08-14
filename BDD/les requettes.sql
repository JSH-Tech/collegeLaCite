USE boutique_jouet;
-- Nom commencant par g
select * from client where nom like ("G%");
-- Nom commencant par g et se termine par x
select * from client where nom like "G%x";
-- nom se terminant par x
select * from client where nom like "%x";
-- nom commence par g et se termine par 6 carac
select * from client where nom like "G______";
-- nom commence par g et se termine par 2 carac
select * from client where nom like "G_";
-- ordonne ascendant
select * from produit order by nom asc;

