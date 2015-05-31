-- MySQL dump 9.11
--
-- Host: localhost    Database: banco2
-- ------------------------------------------------------
-- Server version	4.0.20a-nt

--
-- Current Database: banco2
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ banco2;

USE banco2;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente (
  CODCLIENTE int(11) default NULL,
  NOME varchar(15) default NULL,
  TEL varchar(12) default NULL
) TYPE=MyISAM;

--
-- Dumping data for table `cliente`
--

INSERT INTO cliente VALUES (1,'marcus','2555252');
INSERT INTO cliente VALUES (2,'HUDSON','25550999252');
INSERT INTO cliente VALUES (3,'ROMULO','3432423423');

--
-- Table structure for table `conta`
--

DROP TABLE IF EXISTS conta;
CREATE TABLE conta (
  NCONTA int(11) default NULL,
  SALDO int(11) default NULL,
  CODCLIENTE int(11) default NULL
) TYPE=MyISAM;

--
-- Dumping data for table `conta`
--


--
-- Table structure for table `movimento`
--

DROP TABLE IF EXISTS movimento;
CREATE TABLE movimento (
  NCONTA int(11) default NULL,
  DATA date default NULL,
  VALOR int(11) default NULL,
  TIPOOP char(1) default NULL
) TYPE=MyISAM;

--
-- Dumping data for table `movimento`
--


