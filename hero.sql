/*
Navicat MySQL Data Transfer

Source Server         : 我的数据库
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : javaproject

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-09-01 15:12:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hero
-- ----------------------------
DROP TABLE IF EXISTS `hero`;
CREATE TABLE `hero` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `xietiao` float DEFAULT NULL,
  `damage` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of hero
-- ----------------------------
INSERT INTO `hero` VALUES ('1', '提莫', '152.5', '300');
INSERT INTO `hero` VALUES ('2', '宫本', '200', '250');
INSERT INTO `hero` VALUES ('3', '猴子', '128.5', '300');
