create database supermark;
use supermark;

create table tipo_usuario(
id_tipo_usuario int primary key,
nombre_tipo varchar(10),
rol varchar (40));

create table usuario(id_usuario int primary key,
nombre_usuario varchar(15),
apellido_usuario varchar(15),
email_usuario varchar(20),
telefono_usuario int,
contrasenia_usuario varchar(8),
id_tipo_usuario int, 
tiene_tarjeta_usuario boolean,
foreign key (id_tipo_usuario) 
references tipo_usuario (id_tipo_usuario));

create table ventas (
id_venta int primary key,
fecha date,
total double,
id_usuario int,
foreign key (id_usuario)references usuario(id_usuario));

create table categoria(
id_categoria int primary key,
nombre_categoria varchar(30));

create table producto(
id_producto int primary key,
nombre_producto varchar(30),
stock_producto int,
precio_unit_producto double,
id_categoria int, foreign key (id_categoria)references categoria(id_categoria));

create table detallePxV(
id_detalle int primary key,
id_venta int,
id_producto int,
foreign key (id_venta) references ventas (id_venta),
foreign key (id_producto)references producto(id_producto));







