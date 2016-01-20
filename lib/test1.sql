/*
Navicat MySQL Data Transfer

Source Server         : My Server
Source Server Version : 50543
Source Host           : 46.101.174.194:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50543
File Encoding         : 65001

Date: 2016-01-20 21:24:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for divisions
-- ----------------------------
DROP TABLE IF EXISTS `divisions`;
CREATE TABLE `divisions` (
  `name` varchar(25) DEFAULT NULL,
  `dateadded` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of divisions
-- ----------------------------
INSERT INTO `divisions` VALUES ('Logistirio', '10/12/2015');
INSERT INTO `divisions` VALUES ('Pliroforiki', '10/12/2015');
INSERT INTO `divisions` VALUES ('Anapti3is', '10/12/2015');
INSERT INTO `divisions` VALUES ('Dioikisis', '10/12/2015');

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `name` varchar(30) DEFAULT NULL,
  `date` varchar(30) DEFAULT NULL,
  `division` varchar(30) DEFAULT NULL,
  `dateadded` varchar(20) DEFAULT NULL,
  `afm` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES ('Giorgos Papageorgiou', '19/2/1994', 'Pliroforiki', '5/10/2015', '98204584');
INSERT INTO `employees` VALUES ('Maria Ale3antrou', '5/2/1994', 'Anapti3is', '5/10/2015', '51165116');
INSERT INTO `employees` VALUES ('Aristi Theofanous', '15/5/1996', 'Anapti3is', '5/10/2015', '32566541');
INSERT INTO `employees` VALUES ('Andreas Sergiou', '8/2/1995', 'Dioikisis', '5/10/2015', '55665466');
INSERT INTO `employees` VALUES ('Violeta Lorens', '29/7/1992', 'Dioikisis', '5/10/2015', '65956565');
INSERT INTO `employees` VALUES ('Xara Mikeli', '30/9/1996', 'Logistirio', '5/10/2015', '95656598');
INSERT INTO `employees` VALUES ('Xristodoulos Giapani', '26/8/1990', 'Pliroforiki', '5/10/2015', '77454412');
INSERT INTO `employees` VALUES ('Philippos Vassiliou', '19/1/1994', 'Pliroforiki', '5/10/2015', '92876025');

-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report` (
  `name` varchar(20) DEFAULT NULL,
  `axiol` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of report
-- ----------------------------
INSERT INTO `report` VALUES ('Violeta Lorens', 'para polli kali stin doulia tis!');
INSERT INTO `report` VALUES ('Aristi Theofanous', 'metria stin doulia tis');
INSERT INTO `report` VALUES ('Andreas Sergiou', 'pantote stin ora tou gia doulia');
INSERT INTO `report` VALUES ('Xara Mikeli', 'kali ipalilos');
INSERT INTO `report` VALUES ('Xristodoulos Giapani', 'ena mikros hacker');
INSERT INTO `report` VALUES ('Maria Ale3antrou', 'oso omorfi einai tosi doulia kanei :P..');
INSERT INTO `report` VALUES ('Philippos Vassiliou', 'o kaliteros ipalilos ever!!!!!!');
INSERT INTO `report` VALUES ('Giorgos Papageorgiou', 'KAKOS ipalilos ! na apoli8ei aurio!');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `division` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('philippos', '1234', 'Proistamenos');
INSERT INTO `users` VALUES ('philippos2', '1234', 'HR');
INSERT INTO `users` VALUES ('alkis', '1234', 'Proistamenos');
INSERT INTO `users` VALUES ('passas', '1234', 'HR');
INSERT INTO `users` VALUES ('alkis2', '1234', 'HR');
INSERT INTO `users` VALUES ('passas2', '1234', 'Proistamenos');
