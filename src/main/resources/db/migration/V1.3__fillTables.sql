insert into vuss(id, name, adress) values
(1, 'ВГУ', 'Университетская площадь 1'),
(2, 'ВГТУ', 'Московский проспект 14'),
(3, 'СХИ', 'Мичурина 1');
insert into sotr(id, idvuss, name, fone) values
(1, 1, 'Алексей Михайлович', '9231233442'),
(2, 1, 'Евгений Александрович', '9507321358'),
(3, 2, 'Татьяна Вячеславовна', '9081738945'),
(4, 2, 'Юрий Андреевич', '9781347658'),
(5, 3, 'Андрей Юрьевич', '9082377595'),
(6, 3, 'Евгений Васильевич', '9563147568');
insert into spec(id, idvuss, name, info) values
(1, 1, 'Теоретическая физика', 'Станешь гением по теоретической физике если не вылетишь после первой сессии'),
(2, 1, 'Математика', 'Как теоретическая физика, только математика'),
(3, 2, 'Мехатроника и робототехника', 'Будешь строить автоботов'),
(4, 2, 'Менеджмент', 'Таких как ты тысячи и все безработные, это жизнь на высоком уровне сложности, не стоит'),
(5, 3, 'Агроинженерия', 'Что-то про тракторы'),
(6, 3, 'Агрономия', 'Что-то связанное с сельхозом');