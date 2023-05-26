CREATE DATABASE DB_CL2CORNEJOCANCINO;

USE DB_CL2CORNEJOCANCINO;

CREATE TABLE tb_Area( 
CodigoArea varchar(3) PRIMARY KEY,
NombreArea varchar(90),
JefeArea varchar(90)
);


CREATE TABLE tb_Personal(
Nombre varchar(90),
CódigoTrabajador varchar(3) PRIMARY KEY, 
Sueldo varchar(5),
CodigoArea varchar(3) references tb_Area(CodigoArea)
);
 
 insert into tb_Area values(1,'ADMINISTRACION','FELIPE MOSCOSO');
insert into tb_Area values(2,'SEGURIDAD','JESUS CORNEJO');
insert into tb_Area values(3,'LOGISTICA','VERONICA CANCINO');

insert into tb_Personal values('JUAN DE LA CRUZ',1,'2000',3);
insert into tb_Personal values('MARIZELA CANCINO',2,'1500',1);
insert into tb_Personal values('PEDRO CARRERA',3,'2000',2);
insert into tb_Personal values('FERNANDO ZOLORZANO',4,'2000',2);
insert into tb_Personal values('ALEJANDRO CANCINO',5,'1200',3);
insert into tb_Personal values('PEDRO FIGUEROA',6,'1000',2);
insert into tb_Personal values('ADRIANA PORTOCARRERO',7,'2000',1);
insert into tb_Personal values('ANDRE CALLATA',8,'1200',3);

SELECT * FROM tb_Area;
SELECT * FROM tb_Personal;

SELECT P.Nombre, P.CódigoTrabajador,P.Sueldo,A.NombreArea,A.JefeArea FROM tb_Personal P where P.CodigoArea = A.CodigoArea 
