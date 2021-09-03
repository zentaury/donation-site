CREATE DATABASE  IF NOT EXISTS `donationsite` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `donationsite`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: donationsite
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `country` (
  `id` int NOT NULL AUTO_INCREMENT,
  `iso` char(2) NOT NULL,
  `name` varchar(80) NOT NULL,
  `nicename` varchar(80) NOT NULL,
  `iso3` char(3) DEFAULT NULL,
  `numcode` smallint DEFAULT NULL,
  `phonecode` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=240 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'AF','AFGHANISTAN','Afghanistan','AFG',4,93),(2,'AL','ALBANIA','Albania','ALB',8,355),(3,'DZ','ALGERIA','Algeria','DZA',12,213),(4,'AS','AMERICAN SAMOA','American Samoa','ASM',16,1684),(5,'AD','ANDORRA','Andorra','AND',20,376),(6,'AO','ANGOLA','Angola','AGO',24,244),(7,'AI','ANGUILLA','Anguilla','AIA',660,1264),(8,'AQ','ANTARCTICA','Antarctica',NULL,NULL,0),(9,'AG','ANTIGUA AND BARBUDA','Antigua and Barbuda','ATG',28,1268),(10,'AR','ARGENTINA','Argentina','ARG',32,54),(11,'AM','ARMENIA','Armenia','ARM',51,374),(12,'AW','ARUBA','Aruba','ABW',533,297),(13,'AU','AUSTRALIA','Australia','AUS',36,61),(14,'AT','AUSTRIA','Austria','AUT',40,43),(15,'AZ','AZERBAIJAN','Azerbaijan','AZE',31,994),(16,'BS','BAHAMAS','Bahamas','BHS',44,1242),(17,'BH','BAHRAIN','Bahrain','BHR',48,973),(18,'BD','BANGLADESH','Bangladesh','BGD',50,880),(19,'BB','BARBADOS','Barbados','BRB',52,1246),(20,'BY','BELARUS','Belarus','BLR',112,375),(21,'BE','BELGIUM','Belgium','BEL',56,32),(22,'BZ','BELIZE','Belize','BLZ',84,501),(23,'BJ','BENIN','Benin','BEN',204,229),(24,'BM','BERMUDA','Bermuda','BMU',60,1441),(25,'BT','BHUTAN','Bhutan','BTN',64,975),(26,'BO','BOLIVIA','Bolivia','BOL',68,591),(27,'BA','BOSNIA AND HERZEGOVINA','Bosnia and Herzegovina','BIH',70,387),(28,'BW','BOTSWANA','Botswana','BWA',72,267),(29,'BV','BOUVET ISLAND','Bouvet Island',NULL,NULL,0),(30,'BR','BRAZIL','Brazil','BRA',76,55),(31,'IO','BRITISH INDIAN OCEAN TERRITORY','British Indian Ocean Territory',NULL,NULL,246),(32,'BN','BRUNEI DARUSSALAM','Brunei Darussalam','BRN',96,673),(33,'BG','BULGARIA','Bulgaria','BGR',100,359),(34,'BF','BURKINA FASO','Burkina Faso','BFA',854,226),(35,'BI','BURUNDI','Burundi','BDI',108,257),(36,'KH','CAMBODIA','Cambodia','KHM',116,855),(37,'CM','CAMEROON','Cameroon','CMR',120,237),(38,'CA','CANADA','Canada','CAN',124,1),(39,'CV','CAPE VERDE','Cape Verde','CPV',132,238),(40,'KY','CAYMAN ISLANDS','Cayman Islands','CYM',136,1345),(41,'CF','CENTRAL AFRICAN REPUBLIC','Central African Republic','CAF',140,236),(42,'TD','CHAD','Chad','TCD',148,235),(43,'CL','CHILE','Chile','CHL',152,56),(44,'CN','CHINA','China','CHN',156,86),(45,'CX','CHRISTMAS ISLAND','Christmas Island',NULL,NULL,61),(46,'CC','COCOS (KEELING) ISLANDS','Cocos (Keeling) Islands',NULL,NULL,672),(47,'CO','COLOMBIA','Colombia','COL',170,57),(48,'KM','COMOROS','Comoros','COM',174,269),(49,'CG','CONGO','Congo','COG',178,242),(50,'CD','CONGO, THE DEMOCRATIC REPUBLIC OF THE','Congo, the Democratic Republic of the','COD',180,242),(51,'CK','COOK ISLANDS','Cook Islands','COK',184,682),(52,'CR','COSTA RICA','Costa Rica','CRI',188,506),(53,'CI','COTE D\'IVOIRE','Cote D\'Ivoire','CIV',384,225),(54,'HR','CROATIA','Croatia','HRV',191,385),(55,'CU','CUBA','Cuba','CUB',192,53),(56,'CY','CYPRUS','Cyprus','CYP',196,357),(57,'CZ','CZECH REPUBLIC','Czech Republic','CZE',203,420),(58,'DK','DENMARK','Denmark','DNK',208,45),(59,'DJ','DJIBOUTI','Djibouti','DJI',262,253),(60,'DM','DOMINICA','Dominica','DMA',212,1767),(61,'DO','DOMINICAN REPUBLIC','Dominican Republic','DOM',214,1809),(62,'EC','ECUADOR','Ecuador','ECU',218,593),(63,'EG','EGYPT','Egypt','EGY',818,20),(64,'SV','EL SALVADOR','El Salvador','SLV',222,503),(65,'GQ','EQUATORIAL GUINEA','Equatorial Guinea','GNQ',226,240),(66,'ER','ERITREA','Eritrea','ERI',232,291),(67,'EE','ESTONIA','Estonia','EST',233,372),(68,'ET','ETHIOPIA','Ethiopia','ETH',231,251),(69,'FK','FALKLAND ISLANDS (MALVINAS)','Falkland Islands (Malvinas)','FLK',238,500),(70,'FO','FAROE ISLANDS','Faroe Islands','FRO',234,298),(71,'FJ','FIJI','Fiji','FJI',242,679),(72,'FI','FINLAND','Finland','FIN',246,358),(73,'FR','FRANCE','France','FRA',250,33),(74,'GF','FRENCH GUIANA','French Guiana','GUF',254,594),(75,'PF','FRENCH POLYNESIA','French Polynesia','PYF',258,689),(76,'TF','FRENCH SOUTHERN TERRITORIES','French Southern Territories',NULL,NULL,0),(77,'GA','GABON','Gabon','GAB',266,241),(78,'GM','GAMBIA','Gambia','GMB',270,220),(79,'GE','GEORGIA','Georgia','GEO',268,995),(80,'DE','GERMANY','Germany','DEU',276,49),(81,'GH','GHANA','Ghana','GHA',288,233),(82,'GI','GIBRALTAR','Gibraltar','GIB',292,350),(83,'GR','GREECE','Greece','GRC',300,30),(84,'GL','GREENLAND','Greenland','GRL',304,299),(85,'GD','GRENADA','Grenada','GRD',308,1473),(86,'GP','GUADELOUPE','Guadeloupe','GLP',312,590),(87,'GU','GUAM','Guam','GUM',316,1671),(88,'GT','GUATEMALA','Guatemala','GTM',320,502),(89,'GN','GUINEA','Guinea','GIN',324,224),(90,'GW','GUINEA-BISSAU','Guinea-Bissau','GNB',624,245),(91,'GY','GUYANA','Guyana','GUY',328,592),(92,'HT','HAITI','Haiti','HTI',332,509),(93,'HM','HEARD ISLAND AND MCDONALD ISLANDS','Heard Island and Mcdonald Islands',NULL,NULL,0),(94,'VA','HOLY SEE (VATICAN CITY STATE)','Holy See (Vatican City State)','VAT',336,39),(95,'HN','HONDURAS','Honduras','HND',340,504),(96,'HK','HONG KONG','Hong Kong','HKG',344,852),(97,'HU','HUNGARY','Hungary','HUN',348,36),(98,'IS','ICELAND','Iceland','ISL',352,354),(99,'IN','INDIA','India','IND',356,91),(100,'ID','INDONESIA','Indonesia','IDN',360,62),(101,'IR','IRAN, ISLAMIC REPUBLIC OF','Iran, Islamic Republic of','IRN',364,98),(102,'IQ','IRAQ','Iraq','IRQ',368,964),(103,'IE','IRELAND','Ireland','IRL',372,353),(104,'IL','ISRAEL','Israel','ISR',376,972),(105,'IT','ITALY','Italy','ITA',380,39),(106,'JM','JAMAICA','Jamaica','JAM',388,1876),(107,'JP','JAPAN','Japan','JPN',392,81),(108,'JO','JORDAN','Jordan','JOR',400,962),(109,'KZ','KAZAKHSTAN','Kazakhstan','KAZ',398,7),(110,'KE','KENYA','Kenya','KEN',404,254),(111,'KI','KIRIBATI','Kiribati','KIR',296,686),(112,'KP','KOREA, DEMOCRATIC PEOPLE\'S REPUBLIC OF','Korea, Democratic People\'s Republic of','PRK',408,850),(113,'KR','KOREA, REPUBLIC OF','Korea, Republic of','KOR',410,82),(114,'KW','KUWAIT','Kuwait','KWT',414,965),(115,'KG','KYRGYZSTAN','Kyrgyzstan','KGZ',417,996),(116,'LA','LAO PEOPLE\'S DEMOCRATIC REPUBLIC','Lao People\'s Democratic Republic','LAO',418,856),(117,'LV','LATVIA','Latvia','LVA',428,371),(118,'LB','LEBANON','Lebanon','LBN',422,961),(119,'LS','LESOTHO','Lesotho','LSO',426,266),(120,'LR','LIBERIA','Liberia','LBR',430,231),(121,'LY','LIBYAN ARAB JAMAHIRIYA','Libyan Arab Jamahiriya','LBY',434,218),(122,'LI','LIECHTENSTEIN','Liechtenstein','LIE',438,423),(123,'LT','LITHUANIA','Lithuania','LTU',440,370),(124,'LU','LUXEMBOURG','Luxembourg','LUX',442,352),(125,'MO','MACAO','Macao','MAC',446,853),(126,'MK','MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF','Macedonia, the Former Yugoslav Republic of','MKD',807,389),(127,'MG','MADAGASCAR','Madagascar','MDG',450,261),(128,'MW','MALAWI','Malawi','MWI',454,265),(129,'MY','MALAYSIA','Malaysia','MYS',458,60),(130,'MV','MALDIVES','Maldives','MDV',462,960),(131,'ML','MALI','Mali','MLI',466,223),(132,'MT','MALTA','Malta','MLT',470,356),(133,'MH','MARSHALL ISLANDS','Marshall Islands','MHL',584,692),(134,'MQ','MARTINIQUE','Martinique','MTQ',474,596),(135,'MR','MAURITANIA','Mauritania','MRT',478,222),(136,'MU','MAURITIUS','Mauritius','MUS',480,230),(137,'YT','MAYOTTE','Mayotte',NULL,NULL,269),(138,'MX','MEXICO','Mexico','MEX',484,52),(139,'FM','MICRONESIA, FEDERATED STATES OF','Micronesia, Federated States of','FSM',583,691),(140,'MD','MOLDOVA, REPUBLIC OF','Moldova, Republic of','MDA',498,373),(141,'MC','MONACO','Monaco','MCO',492,377),(142,'MN','MONGOLIA','Mongolia','MNG',496,976),(143,'MS','MONTSERRAT','Montserrat','MSR',500,1664),(144,'MA','MOROCCO','Morocco','MAR',504,212),(145,'MZ','MOZAMBIQUE','Mozambique','MOZ',508,258),(146,'MM','MYANMAR','Myanmar','MMR',104,95),(147,'NA','NAMIBIA','Namibia','NAM',516,264),(148,'NR','NAURU','Nauru','NRU',520,674),(149,'NP','NEPAL','Nepal','NPL',524,977),(150,'NL','NETHERLANDS','Netherlands','NLD',528,31),(151,'AN','NETHERLANDS ANTILLES','Netherlands Antilles','ANT',530,599),(152,'NC','NEW CALEDONIA','New Caledonia','NCL',540,687),(153,'NZ','NEW ZEALAND','New Zealand','NZL',554,64),(154,'NI','NICARAGUA','Nicaragua','NIC',558,505),(155,'NE','NIGER','Niger','NER',562,227),(156,'NG','NIGERIA','Nigeria','NGA',566,234),(157,'NU','NIUE','Niue','NIU',570,683),(158,'NF','NORFOLK ISLAND','Norfolk Island','NFK',574,672),(159,'MP','NORTHERN MARIANA ISLANDS','Northern Mariana Islands','MNP',580,1670),(160,'NO','NORWAY','Norway','NOR',578,47),(161,'OM','OMAN','Oman','OMN',512,968),(162,'PK','PAKISTAN','Pakistan','PAK',586,92),(163,'PW','PALAU','Palau','PLW',585,680),(164,'PS','PALESTINIAN TERRITORY, OCCUPIED','Palestinian Territory, Occupied',NULL,NULL,970),(165,'PA','PANAMA','Panama','PAN',591,507),(166,'PG','PAPUA NEW GUINEA','Papua New Guinea','PNG',598,675),(167,'PY','PARAGUAY','Paraguay','PRY',600,595),(168,'PE','PERU','Peru','PER',604,51),(169,'PH','PHILIPPINES','Philippines','PHL',608,63),(170,'PN','PITCAIRN','Pitcairn','PCN',612,0),(171,'PL','POLAND','Poland','POL',616,48),(172,'PT','PORTUGAL','Portugal','PRT',620,351),(173,'PR','PUERTO RICO','Puerto Rico','PRI',630,1787),(174,'QA','QATAR','Qatar','QAT',634,974),(175,'RE','REUNION','Reunion','REU',638,262),(176,'RO','ROMANIA','Romania','ROM',642,40),(177,'RU','RUSSIAN FEDERATION','Russian Federation','RUS',643,70),(178,'RW','RWANDA','Rwanda','RWA',646,250),(179,'SH','SAINT HELENA','Saint Helena','SHN',654,290),(180,'KN','SAINT KITTS AND NEVIS','Saint Kitts and Nevis','KNA',659,1869),(181,'LC','SAINT LUCIA','Saint Lucia','LCA',662,1758),(182,'PM','SAINT PIERRE AND MIQUELON','Saint Pierre and Miquelon','SPM',666,508),(183,'VC','SAINT VINCENT AND THE GRENADINES','Saint Vincent and the Grenadines','VCT',670,1784),(184,'WS','SAMOA','Samoa','WSM',882,684),(185,'SM','SAN MARINO','San Marino','SMR',674,378),(186,'ST','SAO TOME AND PRINCIPE','Sao Tome and Principe','STP',678,239),(187,'SA','SAUDI ARABIA','Saudi Arabia','SAU',682,966),(188,'SN','SENEGAL','Senegal','SEN',686,221),(189,'CS','SERBIA AND MONTENEGRO','Serbia and Montenegro',NULL,NULL,381),(190,'SC','SEYCHELLES','Seychelles','SYC',690,248),(191,'SL','SIERRA LEONE','Sierra Leone','SLE',694,232),(192,'SG','SINGAPORE','Singapore','SGP',702,65),(193,'SK','SLOVAKIA','Slovakia','SVK',703,421),(194,'SI','SLOVENIA','Slovenia','SVN',705,386),(195,'SB','SOLOMON ISLANDS','Solomon Islands','SLB',90,677),(196,'SO','SOMALIA','Somalia','SOM',706,252),(197,'ZA','SOUTH AFRICA','South Africa','ZAF',710,27),(198,'GS','SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS','South Georgia and the South Sandwich Islands',NULL,NULL,0),(199,'ES','SPAIN','Spain','ESP',724,34),(200,'LK','SRI LANKA','Sri Lanka','LKA',144,94),(201,'SD','SUDAN','Sudan','SDN',736,249),(202,'SR','SURINAME','Suriname','SUR',740,597),(203,'SJ','SVALBARD AND JAN MAYEN','Svalbard and Jan Mayen','SJM',744,47),(204,'SZ','SWAZILAND','Swaziland','SWZ',748,268),(205,'SE','SWEDEN','Sweden','SWE',752,46),(206,'CH','SWITZERLAND','Switzerland','CHE',756,41),(207,'SY','SYRIAN ARAB REPUBLIC','Syrian Arab Republic','SYR',760,963),(208,'TW','TAIWAN, PROVINCE OF CHINA','Taiwan, Province of China','TWN',158,886),(209,'TJ','TAJIKISTAN','Tajikistan','TJK',762,992),(210,'TZ','TANZANIA, UNITED REPUBLIC OF','Tanzania, United Republic of','TZA',834,255),(211,'TH','THAILAND','Thailand','THA',764,66),(212,'TL','TIMOR-LESTE','Timor-Leste',NULL,NULL,670),(213,'TG','TOGO','Togo','TGO',768,228),(214,'TK','TOKELAU','Tokelau','TKL',772,690),(215,'TO','TONGA','Tonga','TON',776,676),(216,'TT','TRINIDAD AND TOBAGO','Trinidad and Tobago','TTO',780,1868),(217,'TN','TUNISIA','Tunisia','TUN',788,216),(218,'TR','TURKEY','Turkey','TUR',792,90),(219,'TM','TURKMENISTAN','Turkmenistan','TKM',795,7370),(220,'TC','TURKS AND CAICOS ISLANDS','Turks and Caicos Islands','TCA',796,1649),(221,'TV','TUVALU','Tuvalu','TUV',798,688),(222,'UG','UGANDA','Uganda','UGA',800,256),(223,'UA','UKRAINE','Ukraine','UKR',804,380),(224,'AE','UNITED ARAB EMIRATES','United Arab Emirates','ARE',784,971),(225,'GB','UNITED KINGDOM','United Kingdom','GBR',826,44),(226,'US','UNITED STATES','United States','USA',840,1),(227,'UM','UNITED STATES MINOR OUTLYING ISLANDS','United States Minor Outlying Islands',NULL,NULL,1),(228,'UY','URUGUAY','Uruguay','URY',858,598),(229,'UZ','UZBEKISTAN','Uzbekistan','UZB',860,998),(230,'VU','VANUATU','Vanuatu','VUT',548,678),(231,'VE','VENEZUELA','Venezuela','VEN',862,58),(232,'VN','VIET NAM','Viet Nam','VNM',704,84),(233,'VG','VIRGIN ISLANDS, BRITISH','Virgin Islands, British','VGB',92,1284),(234,'VI','VIRGIN ISLANDS, U.S.','Virgin Islands, U.s.','VIR',850,1340),(235,'WF','WALLIS AND FUTUNA','Wallis and Futuna','WLF',876,681),(236,'EH','WESTERN SAHARA','Western Sahara','ESH',732,212),(237,'YE','YEMEN','Yemen','YEM',887,967),(238,'ZM','ZAMBIA','Zambia','ZMB',894,260),(239,'ZW','ZIMBABWE','Zimbabwe','ZWE',716,263);
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation`
--

DROP TABLE IF EXISTS `donation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donation` (
  `donation_id` int NOT NULL AUTO_INCREMENT,
  `user_fk` int NOT NULL,
  `transaction_fk` int NOT NULL,
  `country_fk` int NOT NULL,
  `institution` varchar(200) DEFAULT NULL,
  `amount` decimal(9,5) NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`donation_id`),
  KEY `user_fk_idx` (`user_fk`),
  KEY `transaction_fk_idx` (`transaction_fk`),
  KEY `country_fk_idx` (`country_fk`),
  CONSTRAINT `donation_country_fk` FOREIGN KEY (`country_fk`) REFERENCES `country` (`id`),
  CONSTRAINT `transaction_fk` FOREIGN KEY (`transaction_fk`) REFERENCES `transaction` (`transaction_id`) ON UPDATE CASCADE,
  CONSTRAINT `user_fk` FOREIGN KEY (`user_fk`) REFERENCES `user` (`user_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation`
--

LOCK TABLES `donation` WRITE;
/*!40000 ALTER TABLE `donation` DISABLE KEYS */;
INSERT INTO `donation` VALUES (2,2,1,64,'ONG El Salvador',100.00000,'1000-01-01 00:00:00'),(3,10,2,64,'SHREK SA. CV.',1000.00000,'2021-09-03 07:06:40'),(4,10,3,64,'SHREK SA. CV.',5000.00000,'2021-09-03 07:59:13'),(5,9,9,52,'ONG El Salvador',500.00000,'2021-09-03 08:09:43'),(6,2,25,47,'ONG El Salvador',1000.00000,'2021-09-03 08:30:32'),(7,2,29,43,'ONG El Salvador',5000.00000,'2021-09-03 08:38:07'),(8,2,30,44,'ONG El Salvador',100.00000,'2021-09-03 08:43:46'),(9,2,31,55,'ONG El Salvador',400.00000,'2021-09-03 08:44:38'),(10,11,37,30,'COCA-COLA S.A. DE C.V.',500.00000,'2021-09-03 08:57:53'),(11,2,38,54,'ONG El Salvador',500.00000,'2021-09-03 10:51:33'),(12,12,40,49,'CORP S.A. de C.V.',500.00000,'2021-09-03 13:58:41'),(13,13,41,62,'Nueva S.A. de C.V.',500.00000,'2021-09-03 16:40:51');
/*!40000 ALTER TABLE `donation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `rol_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `user_fk` int DEFAULT NULL,
  PRIMARY KEY (`rol_id`),
  KEY `user_fk_idx` (`user_fk`),
  CONSTRAINT `user_rol_fk` FOREIGN KEY (`user_fk`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (1,'ROLE_ADMIN',2),(2,'ROLE_USER',2),(7,'ROLE_USER',9),(8,'ROLE_USER',10),(9,'ROLE_USER',11),(10,'ROLE_USER',12),(11,'ROLE_USER',13);
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction` (
  `transaction_id` int NOT NULL AUTO_INCREMENT,
  `card_owner` varchar(150) NOT NULL,
  `bank_issue_id` varchar(500) NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`transaction_id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
INSERT INTO `transaction` VALUES (1,'Juan Carlos Zepeda Abrego','1','1000-01-01 00:00:00'),(2,'Tony Saca','1f77ab54-1aef-4044-8ff5-712e40bb6139','2021-09-03 07:06:40'),(3,'Tony Saca','e70b50ef-dbef-4833-a839-ed0b5c5e05e3','2021-09-03 07:58:19'),(4,'Tony Saca','7314dca3-8de7-4cdf-b14e-854a545ae2af','2021-09-03 07:59:57'),(5,'Tony Saca','82ddb334-fd18-4f20-93a0-0115b8ef91ca','2021-09-03 08:01:56'),(6,'Tony Saca','83166dec-a953-4f3c-92db-983262c10ed9','2021-09-03 08:02:18'),(7,'Tony Saca','b11e5f31-dd73-42b0-aea6-f6f58510a1f8','2021-09-03 08:05:14'),(8,'Tony Saca','785d2082-5aa8-44f6-8614-04bfef7f4526','2021-09-03 08:07:54'),(9,'Luis Ángel Albanez Albeño','5c1e78cd-1dbb-4be9-82d8-921d4081ca1b','2021-09-03 08:09:37'),(10,'Luis Ángel Albanez Albeño','7af3587b-dc3b-4fe0-a9f5-589f5613131b','2021-09-03 08:12:18'),(11,'Luis Ángel Albanez Albeño','04bb3e80-2d04-4127-9296-427c7586e6ae','2021-09-03 08:13:04'),(12,'Luis Ángel Albanez Albeño','78248a58-68bb-4911-a642-84afcf03dba0','2021-09-03 08:16:59'),(13,'Luis Ángel Albanez Albeño','5bc3d9d6-cda9-4ca3-a1cf-5df19352ac97','2021-09-03 08:18:15'),(14,'Luis Ángel Albanez Albeño','00dab971-2325-4fc3-99f9-e13d7f95972c','2021-09-03 08:18:34'),(15,'Luis Ángel Albanez Albeño','898e662b-b4d8-40f3-8c15-213db343ca5f','2021-09-03 08:19:53'),(16,'Luis Ángel Albanez Albeño','d210b042-411c-4a6b-9497-fd6d818d53a5','2021-09-03 08:20:11'),(17,'Luis Ángel Albanez Albeño','c150d873-c249-4d9f-9e04-91dcfd9912f2','2021-09-03 08:21:00'),(18,'Luis Ángel Albanez Albeño','cbebdda7-1141-4a28-99d5-d3634dc76599','2021-09-03 08:23:34'),(19,'Luis Ángel Albanez Albeño','4e53e32b-91ba-40f2-b47f-8cdf17492370','2021-09-03 08:23:39'),(20,'Luis Ángel Albanez Albeño','d3a2a3fb-dd94-45d6-a55d-00764597ab32','2021-09-03 08:24:22'),(21,'Luis Ángel Albanez Albeño','2dae788e-6ffd-4e64-88ba-afa0f3b7dc19','2021-09-03 08:27:41'),(22,'Juan Carlos Zepeda','7d425f30-97d9-4a13-94b8-caadc822aa22','2021-09-03 08:29:02'),(23,'123123','a0bf1cb1-079d-44e3-b37a-64a1928365a2','2021-09-03 08:29:41'),(24,'Juan Carlos Zepeda','60b44cd0-c3dd-442a-97bf-1079e2754df5','2021-09-03 08:30:03'),(25,'Juan Carlos Zepeda','d016e608-debf-4f88-af33-fe7642c92c04','2021-09-03 08:30:32'),(26,'Juan Carlos Zepeda','1359a427-3941-4c59-9e23-aba64c820111','2021-09-03 08:30:55'),(27,'Juan Carlos Zepeda','db63a49f-eb88-4031-a6d7-d790aac3740e','2021-09-03 08:34:12'),(28,'123123','54365392-778f-4bba-9a28-50557477ac3f','2021-09-03 08:34:29'),(29,'Juan Carlos Zepeda','b51afd21-6ee8-444f-b9ce-df2874cc4ae4','2021-09-03 08:38:07'),(30,'1231231','f08ef7b3-6564-4e7e-9123-e5cd51ee2079','2021-09-03 08:43:46'),(31,'Juan Carlos Zepeda','8aabd3f7-5011-497f-996f-88414dd1d9fc','2021-09-03 08:44:38'),(32,'Juan Carlos Zepeda','792ca2c4-f37f-4162-8a2a-e3dc9e16cc2f','2021-09-03 08:46:03'),(33,'Juan Carlos Zepeda','b50144b3-3c60-4cbb-b90d-49188a63fc7f','2021-09-03 08:46:06'),(34,'Juan Carlos Zepeda','9a225f2f-1527-4768-bd6e-6944eaeb56d5','2021-09-03 08:46:09'),(35,'Juan Carlos Zepeda','57c31ac3-445c-479f-8dd8-01f30d7ae610','2021-09-03 08:47:47'),(36,'Benjamin lopez','8884259d-3729-402c-ac1d-8f30e138b15b','2021-09-03 08:57:26'),(37,'Benjamin lopez','af57bd3e-ec10-49a1-a7de-b2282d356b27','2021-09-03 08:57:53'),(38,'Juan Carlos Zepeda','fb00f9d7-86e7-418f-80dc-44b470d85b8a','2021-09-03 10:51:33'),(39,'José Antonio','2421e3aa-55ca-4c15-89fb-6b4ac1426d6a','2021-09-03 13:58:06'),(40,'José Molina','d14a742c-9777-4808-98a2-e332631a261a','2021-09-03 13:58:41'),(41,'Gabriel Gonzales','80a4356a-1f43-4481-9b9d-c409920b1483','2021-09-03 16:40:51'),(42,'Gabriel Gonzales','e44cd5ed-948a-4abd-b565-4d6888b9be51','2021-09-03 16:42:12');
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `country_fk` int NOT NULL,
  `surnames` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `id_document` varchar(45) DEFAULT NULL,
  `institution` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `country_fk_idx` (`country_fk`),
  CONSTRAINT `country_fk` FOREIGN KEY (`country_fk`) REFERENCES `country` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (2,64,'Zepeda Abrego','Juan Carlos','juan97zepda@gmail.com','zentaury','$2a$10$SU6ABtiBk/vEVL0FRXAofeLJnglXIzMoJ4DoziH5KumiXZobIAl4m','05565443-0','ONG El Salvador'),(3,64,'Aguirre Linares','Carlos Ernesto','carlos@email.com','carlosal','123','000000','ONG El Salvador'),(4,64,'Zavaleta Rodas','Julio Antonio','julio@email.com','juliozr','$2a$10$wqqFd90Ycdtio97bAr6O2.bq3PVpNxEW7Umf6xOSY35HAWZGvReRq','00009','ONG El Salvador'),(9,52,'Albanes Albeño','Luis Ángel','luis@email.com','langel','$2a$10$p5VJMh0Vs9TfGHD52F7Dc.YxoBYbAAZk.hw2KNDuksd7ZbuTY.L0G','0132903','ONG El Salvador'),(10,64,'Banderas','Antonio ','gatito@email.com','elgatoconbotas','$2a$10$LAg7uRQ8X1nD4U409Tm3q.zl/gs0IQI/bp.l2A.QJQdrEW2x4dKOW','88898989','SHREK SA. CV.'),(11,64,'Lopez','Benjamin','benja@email.com','benlop','$2a$10$9pJhYYrTP2YBFlO4F5i0LeSqPdurFn1rIebuCZkHZEmPsEASCCvl2','948616','COCA-COLA S.A. DE C.V.'),(12,64,'Molina Santos','José Antonio','chepe@email.com','chepesantos','$2a$10$G0/igXAI5jkVwq/QMEGS4e9keRI7ZU6tzsbPagUH7UCqI3Vnx719S','8766181','CORP S.A. de C.V.'),(13,62,'Gonzales ','Gabriel Enrique','gab@email.com','gabgo','$2a$10$NWBHFYHs7wgjyFGElO0Yfu0Y1C3/ljXsn4LokY5.k/IzlGiSGYJUy','05565443-0','Nueva S.A. de C.V.');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visit`
--

DROP TABLE IF EXISTS `visit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visit` (
  `visit_id` int NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`visit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visit`
--

LOCK TABLES `visit` WRITE;
/*!40000 ALTER TABLE `visit` DISABLE KEYS */;
INSERT INTO `visit` VALUES (1,'2021-09-03 11:10:51'),(2,'2021-09-03 11:11:00'),(3,'2021-09-03 11:30:58'),(4,'2021-09-03 11:31:00'),(5,'2021-09-03 11:51:09'),(6,'2021-09-03 12:31:55'),(7,'2021-09-03 12:32:04'),(8,'2021-09-03 13:56:40'),(9,'2021-09-03 13:57:32'),(10,'2021-09-03 15:14:05'),(11,'2021-09-03 15:18:28'),(12,'2021-09-03 15:18:31'),(13,'2021-09-03 15:18:57'),(14,'2021-09-03 15:19:00'),(15,'2021-09-03 15:21:43'),(16,'2021-09-03 15:21:45'),(17,'2021-09-03 15:58:41'),(18,'2021-09-03 15:58:44'),(19,'2021-09-03 16:04:59'),(20,'2021-09-03 16:05:02'),(21,'2021-09-03 16:06:14'),(22,'2021-09-03 16:26:59'),(23,'2021-09-03 16:35:45'),(24,'2021-09-03 16:36:01'),(25,'2021-09-03 16:38:53'),(26,'2021-09-03 16:44:48');
/*!40000 ALTER TABLE `visit` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-03 10:46:51
