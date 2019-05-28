/*
SQLyog Ultimate v11.42 (64 bit)
MySQL - 5.7.23-log : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `Age` int(3) DEFAULT NULL COMMENT '年龄',
  `Gender` int(1) DEFAULT '1' COMMENT '性别',
  `Hiredate` date DEFAULT NULL COMMENT '入职时间',
  `Salary` decimal(20,6) DEFAULT '0.000000' COMMENT '薪水',
  `CreateTime` datetime DEFAULT NULL,
  `CreateId` int(11) DEFAULT NULL,
  `UpdateTime` datetime DEFAULT NULL,
  `UpdateId` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `PK_UNIQUE` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3001 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`Id`,`Name`,`Age`,`Gender`,`Hiredate`,`Salary`,`CreateTime`,`CreateId`,`UpdateTime`,`UpdateId`) values (1,'ifllnkityj',113,1,NULL,'4112.000000','2019-05-23 23:50:23',190,NULL,NULL),(2,'sgpfbacskp',72,1,NULL,'3444.000000','2019-05-23 23:50:23',57,NULL,NULL),(3,'sgiwcdakzp',85,0,NULL,'5793.000000','2019-05-23 23:50:23',207,NULL,NULL),(4,'astdbjdlwi',11,1,NULL,'7477.000000','2019-05-23 23:50:23',50,NULL,NULL),(5,'xfadggmydg',100,0,NULL,'1571.000000','2019-05-23 23:50:23',244,NULL,NULL),(6,'bvbnfpoagh',43,1,NULL,'3647.000000','2019-05-23 23:50:23',61,NULL,NULL),(7,'asudtpmiim',87,1,NULL,'3550.000000','2019-05-23 23:50:23',152,NULL,NULL),(8,'flznynrttf',47,0,NULL,'8106.000000','2019-05-23 23:50:23',274,NULL,NULL),(9,'vpuqcsmkhv',7,0,NULL,'5369.000000','2019-05-23 23:50:23',169,NULL,NULL),(10,'lojwhplwei',3,0,NULL,'2339.000000','2019-05-23 23:50:23',290,NULL,NULL),(11,'sgzswjutbi',99,1,NULL,'5516.000000','2019-05-23 23:50:23',233,NULL,NULL),(12,'rprwgceomh',55,0,NULL,'6292.000000','2019-05-23 23:50:23',178,NULL,NULL),(13,'bxatvgaxij',38,0,NULL,'7515.000000','2019-05-23 23:50:23',285,NULL,NULL),(14,'bcrffwagmb',71,1,NULL,'5286.000000','2019-05-23 23:50:23',271,NULL,NULL),(15,'adkggbhehm',129,1,NULL,'5792.000000','2019-05-23 23:50:23',173,NULL,NULL),(16,'dksidvmhky',49,0,NULL,'7786.000000','2019-05-23 23:50:23',268,NULL,NULL),(17,'ptnpctjhwb',36,1,NULL,'6657.000000','2019-05-23 23:50:23',119,NULL,NULL),(18,'apszgmgpfx',7,0,NULL,'4061.000000','2019-05-23 23:50:23',25,NULL,NULL),(19,'ybqbpptkzq',6,1,NULL,'5186.000000','2019-05-23 23:50:23',67,NULL,NULL),(20,'twpfpuskti',24,1,NULL,'7839.000000','2019-05-23 23:50:23',171,NULL,NULL),(21,'nctdxzmhdj',25,1,NULL,'5925.000000','2019-05-23 23:50:23',55,NULL,NULL),(22,'zfkygvapok',15,0,NULL,'2529.000000','2019-05-23 23:50:23',136,NULL,NULL),(23,'ygcommurka',121,1,NULL,'8839.000000','2019-05-23 23:50:23',189,NULL,NULL),(24,'etqyzuaafv',94,1,NULL,'6333.000000','2019-05-23 23:50:23',121,NULL,NULL),(25,'xgklhtkpnb',46,0,NULL,'6417.000000','2019-05-23 23:50:23',216,NULL,NULL),(26,'cgrxhsdtfu',63,1,NULL,'6183.000000','2019-05-23 23:50:23',10,NULL,NULL),(27,'yjhrowomag',116,0,NULL,'4169.000000','2019-05-23 23:50:23',43,NULL,NULL),(28,'lxiqkcqilo',83,0,NULL,'4672.000000','2019-05-23 23:50:23',279,NULL,NULL),(29,'fqdkefnhfh',81,1,NULL,'2797.000000','2019-05-23 23:50:23',69,NULL,NULL),(30,'lqrbwwdtld',125,0,NULL,'7876.000000','2019-05-23 23:50:23',304,NULL,NULL),(31,'xqpvwfeeke',38,0,NULL,'3847.000000','2019-05-23 23:50:23',253,NULL,NULL),(32,'iojzmizjax',105,1,NULL,'3533.000000','2019-05-23 23:50:23',113,NULL,NULL),(33,'psmtfuyaku',70,0,NULL,'3403.000000','2019-05-23 23:50:23',54,NULL,NULL),(34,'ejuautxuvt',90,0,NULL,'3120.000000','2019-05-23 23:50:23',196,NULL,NULL),(35,'kelkrqbkfz',70,1,NULL,'1997.000000','2019-05-23 23:50:23',118,NULL,NULL),(36,'ptrekpydlb',25,1,NULL,'8542.000000','2019-05-23 23:50:23',156,NULL,NULL),(37,'chyujhfsjy',53,1,NULL,'1065.000000','2019-05-23 23:50:23',286,NULL,NULL),(38,'jixhfaferg',125,0,NULL,'5935.000000','2019-05-23 23:50:23',218,NULL,NULL),(39,'voygnzcaza',103,0,NULL,'2424.000000','2019-05-23 23:50:23',58,NULL,NULL),(40,'haflvhwuwx',89,0,NULL,'8216.000000','2019-05-23 23:50:23',116,NULL,NULL),(41,'gayvqswfxv',82,0,NULL,'4001.000000','2019-05-23 23:50:23',85,NULL,NULL),(42,'ublxiffzbj',68,0,NULL,'2191.000000','2019-05-23 23:50:23',6,NULL,NULL),(43,'yzecgouimd',28,0,NULL,'3646.000000','2019-05-23 23:50:23',224,NULL,NULL),(44,'pjhauoekdj',44,0,NULL,'7425.000000','2019-05-23 23:50:23',299,NULL,NULL),(45,'ggbumbphpd',27,1,NULL,'5184.000000','2019-05-23 23:50:23',175,NULL,NULL),(46,'baunfmdzxn',128,0,NULL,'5092.000000','2019-05-23 23:50:23',293,NULL,NULL),(47,'gblualxaxn',129,1,NULL,'1618.000000','2019-05-23 23:50:23',70,NULL,NULL),(48,'chmkryhotj',74,1,NULL,'7998.000000','2019-05-23 23:50:23',199,NULL,NULL),(49,'ruhhvexijw',55,1,NULL,'5655.000000','2019-05-23 23:50:23',116,NULL,NULL),(50,'mrfebutinl',41,0,NULL,'2608.000000','2019-05-23 23:50:23',96,NULL,NULL),(51,'zrmsxlpyrn',81,0,NULL,'2344.000000','2019-05-23 23:50:23',103,NULL,NULL),(52,'jcitjxqzie',111,0,NULL,'8089.000000','2019-05-23 23:50:23',163,NULL,NULL),(53,'qzwwqzqedu',112,1,NULL,'3762.000000','2019-05-23 23:50:23',56,NULL,NULL),(54,'rmofrpoyzw',2,1,NULL,'3610.000000','2019-05-23 23:50:23',195,NULL,NULL),(55,'pxzuhxbctv',6,0,NULL,'1189.000000','2019-05-23 23:50:23',309,NULL,NULL),(56,'kixyigyjhq',60,1,NULL,'7246.000000','2019-05-23 23:50:23',19,NULL,NULL),(57,'lyzqtlzdsn',19,1,NULL,'1784.000000','2019-05-23 23:50:23',128,NULL,NULL),(58,'vaxteyeykn',68,0,NULL,'7091.000000','2019-05-23 23:50:23',15,NULL,NULL),(59,'wsnfomezje',33,0,NULL,'8729.000000','2019-05-23 23:50:23',98,NULL,NULL),(60,'qigumslkwk',32,1,NULL,'6671.000000','2019-05-23 23:50:23',68,NULL,NULL),(61,'qhcxnrdqys',38,0,NULL,'2262.000000','2019-05-23 23:50:23',68,NULL,NULL),(62,'iqzlvemrsu',16,0,NULL,'6966.000000','2019-05-23 23:50:23',101,NULL,NULL),(63,'imfdssmtai',80,1,NULL,'1585.000000','2019-05-23 23:50:23',13,NULL,NULL),(64,'ibysmaktdn',81,0,NULL,'4262.000000','2019-05-23 23:50:23',133,NULL,NULL),(65,'avujmfcnlq',74,1,NULL,'7872.000000','2019-05-23 23:50:23',8,NULL,NULL),(66,'zmafgektpw',52,1,NULL,'8041.000000','2019-05-23 23:50:23',64,NULL,NULL),(67,'qxcedjuamj',92,1,NULL,'3004.000000','2019-05-23 23:50:23',170,NULL,NULL),(68,'dnbkcabbze',12,1,NULL,'8233.000000','2019-05-23 23:50:23',122,NULL,NULL),(69,'nacngdmclp',129,0,NULL,'8027.000000','2019-05-23 23:50:23',8,NULL,NULL),(70,'rtniffptzu',53,0,NULL,'1712.000000','2019-05-23 23:50:23',81,NULL,NULL),(71,'lvikuqvrcc',128,0,NULL,'6977.000000','2019-05-23 23:50:23',253,NULL,NULL),(72,'jckbomjnao',51,0,NULL,'4450.000000','2019-05-23 23:50:23',278,NULL,NULL),(73,'bprcbwoviq',91,0,NULL,'5149.000000','2019-05-23 23:50:23',293,NULL,NULL),(74,'ffdtjlwouh',102,0,NULL,'3019.000000','2019-05-23 23:50:23',195,NULL,NULL),(75,'irhceklwxg',54,0,NULL,'3677.000000','2019-05-23 23:50:23',57,NULL,NULL),(76,'rrigrjptlp',41,0,NULL,'4576.000000','2019-05-23 23:50:23',132,NULL,NULL),(77,'gwiyhidxtp',53,1,NULL,'4008.000000','2019-05-23 23:50:23',239,NULL,NULL),(78,'rrgqjaexuo',113,1,NULL,'4728.000000','2019-05-23 23:50:23',20,NULL,NULL),(79,'nnglbodorw',36,1,NULL,'5279.000000','2019-05-23 23:50:23',199,NULL,NULL),(80,'zotezauitq',56,1,NULL,'1457.000000','2019-05-23 23:50:23',202,NULL,NULL),(81,'ncpfxomaau',88,1,NULL,'3299.000000','2019-05-23 23:50:23',50,NULL,NULL),(82,'jbtaoppyoj',17,1,NULL,'4182.000000','2019-05-23 23:50:23',210,NULL,NULL),(83,'cafescrfps',95,1,NULL,'7233.000000','2019-05-23 23:50:23',123,NULL,NULL),(84,'ktxukxfcwn',19,1,NULL,'1363.000000','2019-05-23 23:50:23',266,NULL,NULL),(85,'qathtaekzj',31,1,NULL,'5180.000000','2019-05-23 23:50:23',308,NULL,NULL),(86,'kfulaimmle',129,1,NULL,'2214.000000','2019-05-23 23:50:23',191,NULL,NULL),(87,'twmmxdjeeg',29,1,NULL,'8216.000000','2019-05-23 23:50:23',99,NULL,NULL),(88,'ttaivevrxb',91,1,NULL,'3579.000000','2019-05-23 23:50:23',180,NULL,NULL),(89,'pkyiccejyw',67,1,NULL,'3727.000000','2019-05-23 23:50:23',266,NULL,NULL),(90,'axwtwmfccj',41,0,NULL,'5905.000000','2019-05-23 23:50:23',124,NULL,NULL),(91,'uwzkmvzkoz',51,1,NULL,'3259.000000','2019-05-23 23:50:23',267,NULL,NULL),(92,'mwfryjdljn',55,1,NULL,'6105.000000','2019-05-23 23:50:23',163,NULL,NULL),(93,'hoaawlmwqr',69,0,NULL,'2016.000000','2019-05-23 23:50:23',14,NULL,NULL),(94,'fnvjzbgscx',79,1,NULL,'4071.000000','2019-05-23 23:50:23',104,NULL,NULL),(95,'jtydxjgijl',79,0,NULL,'7379.000000','2019-05-23 23:50:23',228,NULL,NULL),(96,'fcsjwgxate',12,1,NULL,'6581.000000','2019-05-23 23:50:23',155,NULL,NULL),(97,'fnihjryino',31,1,NULL,'2928.000000','2019-05-23 23:50:23',179,NULL,NULL),(98,'iiirjpjhjn',72,0,NULL,'6309.000000','2019-05-23 23:50:23',261,NULL,NULL),(99,'kdoqfugkgl',90,1,NULL,'7604.000000','2019-05-23 23:50:23',159,NULL,NULL),(100,'frkusfjbwm',80,0,NULL,'2270.000000','2019-05-23 23:50:23',80,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
