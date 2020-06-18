/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.5.20 : Database - designmanger
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`designmanger` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `designmanger`;

/*Table structure for table `t_admin` */

DROP TABLE IF EXISTS `t_admin`;

CREATE TABLE `t_admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `anumber` varchar(20) DEFAULT NULL COMMENT '管理员编号',
  `aname` varchar(20) DEFAULT NULL COMMENT '管理员姓名',
  `apassword` varchar(20) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_admin` */

insert  into `t_admin`(`id`,`anumber`,`aname`,`apassword`) values 
(1,'A001','admin','123');

/*Table structure for table `t_clazz` */

DROP TABLE IF EXISTS `t_clazz`;

CREATE TABLE `t_clazz` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) DEFAULT NULL COMMENT '课设题目',
  `info` varchar(500) DEFAULT NULL COMMENT '课设详细信息',
  `deadline` datetime DEFAULT NULL COMMENT '课设截至时间',
  `birth` datetime DEFAULT NULL COMMENT '上传时间',
  `tid` bigint(20) DEFAULT NULL COMMENT '老师id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_clazz` */

insert  into `t_clazz`(`id`,`name`,`info`,`deadline`,`birth`,`tid`) values 
(1,'基于jsp员工管理系统','要求：1.使用jsp技术','2020-06-27 17:32:30','2020-06-15 17:51:19',1),
(2,'基于ssh二手销售','要求：1.使用ssh框架','2020-06-11 17:34:43','2020-07-01 17:51:23',1),
(3,'基于ssm课程设计管理系统','要求i：1. 使用ssm框架',NULL,NULL,1);

/*Table structure for table `t_student` */

DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `snumber` varchar(50) DEFAULT NULL COMMENT '学生学号',
  `sname` varchar(50) DEFAULT NULL COMMENT '学生姓名',
  `spassword` varchar(50) DEFAULT NULL COMMENT '学生密码',
  `email` varchar(20) DEFAULT NULL COMMENT '学生邮箱',
  `phone` varchar(20) DEFAULT NULL COMMENT '学生手机',
  `cid` bigint(20) DEFAULT NULL COMMENT '课设题目',
  `confirm` int(2) DEFAULT NULL COMMENT '确定选题',
  `aid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `begin_url` varchar(50) DEFAULT NULL COMMENT '开题报告url',
  `begin_status` int(2) DEFAULT NULL COMMENT '开题状态',
  `begin_remark` varchar(500) DEFAULT NULL COMMENT '开题评语',
  `begin_sorces` float DEFAULT NULL COMMENT '开题成绩',
  `mid_url` varchar(50) DEFAULT NULL COMMENT '中期报告url',
  `mid_status` int(2) DEFAULT NULL COMMENT '中期状态',
  `mid_remark` varchar(500) DEFAULT NULL COMMENT '中期评语',
  `mid_sorces` float DEFAULT NULL COMMENT '中期成绩',
  `end_url` varchar(50) DEFAULT NULL COMMENT '论文url',
  `end_status` int(2) DEFAULT NULL COMMENT '论文状态',
  `end_remark` varchar(500) DEFAULT NULL COMMENT '论文评语',
  `end_sorces` float DEFAULT NULL COMMENT '论文成绩',
  `t_remark` varchar(500) DEFAULT NULL COMMENT '评教',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

/*Data for the table `t_student` */

insert  into `t_student`(`id`,`snumber`,`sname`,`spassword`,`email`,`phone`,`cid`,`confirm`,`aid`,`begin_url`,`begin_status`,`begin_remark`,`begin_sorces`,`mid_url`,`mid_status`,`mid_remark`,`mid_sorces`,`end_url`,`end_status`,`end_remark`,`end_sorces`,`t_remark`) values 
(8,'S001','张三','123','zhan_z_h@163.com','15227278172',1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(9,'S002','李四','123','zhan_z_h@163.com','15227278172',1,1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(10,'S003','王二','123','zhan_z_h@163.com','15227278172',1,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `t_teacher` */

DROP TABLE IF EXISTS `t_teacher`;

CREATE TABLE `t_teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tnumber` varchar(50) DEFAULT NULL COMMENT '老师工号',
  `tname` varchar(50) DEFAULT NULL COMMENT '老师姓名',
  `tpassword` varchar(50) DEFAULT NULL COMMENT '老师密码',
  `tinfo` varchar(200) DEFAULT NULL COMMENT '老师详细信息',
  `sid` bigint(20) DEFAULT NULL COMMENT '学生id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_teacher` */

insert  into `t_teacher`(`id`,`tnumber`,`tname`,`tpassword`,`tinfo`,`sid`) values 
(1,'T123','java','123','教java',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
