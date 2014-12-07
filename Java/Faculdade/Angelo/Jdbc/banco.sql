-- MySQL dump 9.08
--
-- Host: localhost    Database: banco
---------------------------------------------------------
-- Server version	4.0.14-max-debug

--
-- Current Database: banco
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ banco;

USE banco;

--
-- Table structure for table 'cliente'
--

DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente (
  codcliente int(11) NOT NULL default '0',
  nome varchar(30) default NULL,
  tel varchar(8) default NULL,
  PRIMARY KEY  (codcliente)
) TYPE=MyISAM;

--
-- Dumping data for table 'cliente'
--

INSERT INTO cliente VALUES (1001,'Joao','70707070');
INSERT INTO cliente VALUES (1002,'Pedro','80808080');
INSERT INTO cliente VALUES (1003,'Maria','90909090');

--
-- Table structure for table 'conta'
--

DROP TABLE IF EXISTS conta;
CREATE TABLE conta (
  nconta int(11) NOT NULL default '0',
  saldo float default NULL,
  codcliente int(11) default NULL,
  PRIMARY KEY  (nconta)
) TYPE=MyISAM;

--
-- Dumping data for table 'conta'
--

INSERT INTO conta VALUES (5001,113,1001);
INSERT INTO conta VALUES (5002,28,1002);
INSERT INTO conta VALUES (5003,39,1003);
INSERT INTO conta VALUES (5004,66,1002);

--
-- Table structure for table 'movimento'
--

DROP TABLE IF EXISTS movimento;
CREATE TABLE movimento (
  nconta int(11) default NULL,
  data date default NULL,
  valor float default NULL,
  tipoOP char(1) default NULL
) TYPE=MyISAM;

--
-- Dumping data for table 'movimento'
--

INSERT INTO movimento VALUES (5001,'2000-00-05',150,'C');
INSERT INTO movimento VALUES (5003,'2000-00-05',96,'C');
INSERT INTO movimento VALUES (5003,'2000-00-05',33,'D');
INSERT INTO movimento VALUES (5002,'2000-00-06',41,'D');
INSERT INTO movimento VALUES (5001,'2000-00-06',23,'C');
INSERT INTO movimento VALUES (5002,'2000-00-07',21,'C');
INSERT INTO movimento VALUES (5002,'2000-00-07',57,'D');
INSERT INTO movimento VALUES (5001,'2000-00-08',90,'C');
INSERT INTO movimento VALUES (5002,'2000-00-08',60,'C');
INSERT INTO movimento VALUES (5003,'2000-00-09',30,'C');
INSERT INTO movimento VALUES (5003,'2000-00-09',70,'D');
INSERT INTO movimento VALUES (5004,'2000-00-09',45,'D');

