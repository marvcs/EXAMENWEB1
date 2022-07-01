CREATE DATABASE conciertos;

use conciertos;

CREATE TABLE `artistas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

INSERT INTO `artistas` VALUES (1,'Bad Bunny'),(2,'Juice Wrld'),(3,'21 savage'),(4,'Kanye West');

SELECT * from artistas;

CREATE TABLE `conciertos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `costo` int(45) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `capacidad` int(45) NOT NULL,
  `lugar` varchar(20) NOT NULL,
  `artista_id` int(11) NOT NULL,
  
  PRIMARY KEY (`id`,`artista_id`),
  KEY `fk_conciertos_artistas_idx` (`artista_id`),
  CONSTRAINT `fk_conciertos_artistas` FOREIGN KEY (`artista_id`) REFERENCES `artistas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;

INSERT INTO `conciertos` VALUES (1,25000,"22-nov-22", 50000, "Estadio Nac",1);
INSERT INTO `conciertos` VALUES (2,35000,"15-ene-23", 45000, "Pedregal",2);
INSERT INTO `conciertos` VALUES (3,45000, "11-marzo-23", 65000,"San Carlos",3);

SELECT * from conciertos;