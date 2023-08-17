#----------- CREATE TABLE ------------
CREATE TABLE `food`
    (id INT PRIMARY KEY AUTO_INCREMENT,
     name VARCHAR(200),
     food_group VARCHAR(200),
     description VARCHAR(500),
     price INT);

#------------ INSERT DATA --------------
INSERT INTO `restaurant`.`food`
(name,food_group,description,price)
VALUES ('کوبیده','IRANI','---',650000),
       ('جوجه با استخوان','IRANI','---',700000),
       ('جوجه بدون استخوان','IRANI','---',750000),
       ('کتف و بال','IRANI','---',700000),
       ('چلو کره','IRANI','---',450000),
       ('گوجه تک سیخ','IRANI','---',200000),
       ('قورمه سبزی','IRANI','---',600000),
       ('قیمه','IRANI','---',600000),
       ('زرشک پلو با مرغ','IRANI','---',700000),
       ('باقالی پلو با گوشت','IRANI','---',750000),
       ('سبزی پلو با ماهی','IRANI','---',850000),
       ('ماست','IRANI','---',100000),
       ('دوغ بزرگ','IRANI','---',150000),
       ('دوغ کوچک','IRANI','---',70000),
       ('نوشابه بزرگ','IRANI','---',120000),
       ('نوشابه کوچک','IRANI','---',60000),
       ('آب معدنی بزرگ','IRANI','---',70000),
       ('آب معدنی کوچک','IRANI','---',50000),
       ('ترشی','IRANI','---',150000);


