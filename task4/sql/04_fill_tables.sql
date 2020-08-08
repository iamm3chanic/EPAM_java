INSERT INTO `user` 
(`user_id`, `login`,         `password`, `last_name`, `first_name`,  `role`) 
VALUES 
(1,         'администратор1', '12345adm',   'Петров',    'Петр',       2), 
(2,         'букмекер1',      '12345book',  'Сергеев',   'Сергей',     1), 
(3,         'клиент1',        '12345',      'Иванов',    'Иван',       0), 
(4,         'клиент2',        '123456',     'Алексеев',  'Алексей',    0), 
(5,         'клиент3',        '1234567',    'Янов',      'Ян',         0);

INSERT INTO `race` 
(`race_id`, `horses`, `date`, `place`)
VALUES 
(1,         10,       2020-08-22,     'Минск'), 
(2,         15,       2019-03-03,     'Могилев'),
(3,         20,       2021-04-14,     'Витебск');

INSERT INTO `client` 
(`client_id`)
VALUES 
(1),
(2),
(3);

INSERT INTO `bet` 
(`bet_id`, `client_id`,`race_id`, `bet_type`, `horse`, `coeff`,
`description`,  `status` )
VALUES 
(1,  1, 3, 0, 19, 1.4, 'Horse 19 loses', 1),
(2,  1, 2, 1, 1, 1.4, 'Horse 1 wins', 1),
(3,  2, 1, 0, 3, 1.4, 'Horse 3 loses', 0),
(4,  3, 1, 1, 10, 1.4, 'Horse 10 wins', 1),
(5,  3, 2, 1, 15, 1.4, 'Horse 15 wins', 0);
