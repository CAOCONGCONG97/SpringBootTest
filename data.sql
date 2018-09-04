# Host: localhost  (Version: 5.5.29)
# Date: 2018-08-29 19:23:16
# Generator: MySQL-Front 5.3  (Build 4.13)

/*!40101 SET NAMES utf8 */;

#
# Source for table "info"
#

DROP TABLE IF EXISTS `info`;
CREATE TABLE `info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '车辆标识',
  `number` varchar(50) NOT NULL COMMENT '车牌号码',
  `type` varchar(30) NOT NULL COMMENT '汽车类型',
  `enter_time` datetime DEFAULT NULL COMMENT '汽车的进入时间',
  `leave_time` datetime DEFAULT NULL COMMENT '汽车的离开时间', 
  `cost` int(10) not null COMMENT '停车金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

#
# Data for table "info"
#

#INSERT INTO `info` VALUES ...
#
# Source for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户标识',
  `uName` varchar(50) NOT NULL COMMENT '用户名称',
  `uPassword` varchar(50) NOT NULL COMMENT '用户密码',
  `uEmail` varchar(50) NOT NULL COMMENT '用户邮箱',
  PRIMARY KEY (`uId`),
  UNIQUE KEY `uName` (`uName`),
  UNIQUE KEY `uEmail` (`uEmail`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'admin','admin','admin@qq.com'),(3,'admin123','sadsa','asdsafdsafdsa');
