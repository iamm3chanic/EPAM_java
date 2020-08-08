USE `motor_depot_db`; 

CREATE TABLE `user` (
    `user_id`     INT NOT NULL AUTO_INCREMENT, 
    `login`       VARCHAR(255) NOT NULL, 
    `password`    VARCHAR(255) NOT NULL, 
    `last_name`   VARCHAR(255) NOT NULL, 
    `first_name`  VARCHAR(255) NOT NULL, 
    `role`        TINYINT NOT NULL COMMENT '0 - client, 1 - bookmaker, 2 - admin', 
    PRIMARY KEY (`user_id`)
)  ENGINE=INNODB DEFAULT CHARACTER SET = UTF8;

CREATE TABLE `race` (
    `race_id`    INT NOT NULL AUTO_INCREMENT, 
    `horses`    TINYINT COMMENT 'number of horses', 
    `date`      DATE NOT NULL,
    `description` VARCHAR(255) NOT NULL, 
    PRIMARY KEY (`race_id`)
)  ENGINE=INNODB DEFAULT CHARACTER SET = UTF8;

CREATE TABLE `client` (
    `client_id` INT NOT NULL AUTO_INCREMENT, 
    `race_id`    INT NOT NULL,
    PRIMARY KEY (`client_id`),
   	FOREIGN KEY (`client_id`) REFERENCES `user` (`user_id`) ON UPDATE RESTRICT ON DELETE RESTRICT, 
   	FOREIGN KEY (`race_id`) REFERENCES `race` (`race_id`) ON UPDATE RESTRICT ON DELETE RESTRICT
)  ENGINE=INNODB DEFAULT CHARACTER SET = UTF8;

CREATE TABLE `bet` (
    `bet_id`  INT NOT NULL AUTO_INCREMENT, 
    `client_id`   INT NOT NULL,
    `race_id`    INT NOT NULL AUTO_INCREMENT, 
    `bet_type`     TINYINT NOT NULL COMMENT '0 - horse wins, 1 - horse loses', 
    `horse`    TINYINT COMMENT 'number of horse', 
    `coeff` FLOAT NOT NULL,
    `place` VARCHAR(255) NOT NULL, 
    `status`      TINYINT COMMENT '0 - loss, 1 - success', 
    PRIMARY KEY (`bet_id`),
    FOREIGN KEY (`client_id`) REFERENCES `client` (`client_id`) ON UPDATE RESTRICT ON DELETE RESTRICT
)  ENGINE=INNODB DEFAULT CHARACTER SET = UTF8;
