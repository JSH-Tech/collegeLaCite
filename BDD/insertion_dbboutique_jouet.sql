use boutique_jouet;
insert into client (nom, prenom,date_naissance)
value("Tremblay","Simon","2001-05-18"),
	("Dugal","Steven","1993-08-01"),
    ("Giroux","Claude",null);
    
    select * from client;
    
    insert into produit (nom, description, prix)
    values ("Ordinateur","Un ordinateur",509.99),
			("Clavier","Un clavier",59.66);
	select * from produit;