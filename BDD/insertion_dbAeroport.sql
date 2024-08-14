use dbaeroport;

insert into aeroport(nom,province,ville) values("YOW","Ontario","Ottawa");
insert into aeroport(id_aeroport,nom,province,ville) values("YUL","Quebec","MONTREAL");

insert into avion(id_avion,id_aeroport,marque,modele,date_achat) 
values("0","1","NULL","172","1994-05-21"),
        ("1","1","Airbus","A350","2008-07-18"),
        ("2","1","Boeing","757","2001-01-02"),
        ("3","1","Boeing","747","2014-04-05");
update avion set marque="Cesna" where marque="NULL";

select * from avion where marque="Boeing";

SELECT distinct marque FROM dbaeroport.avion;

select * from dbaeroport.avion where date_achat>="2001-01-01" and date_achat<="2014-01-01";
select * from dbaeroport.avion where marque like "A%" order by date_achat asc ;
select * from dbaeroport.avion order by marque asc;
