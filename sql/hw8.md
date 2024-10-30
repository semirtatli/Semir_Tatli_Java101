1.test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee (
id INTEGER PRIMARY KEY,
name VARCHAR(50),
birthday DATE,
email VARCHAR(100)
);

2.Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
INSERT INTO employee (id, name, birthday, email) VALUES
(1, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(2, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(3, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(4, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(5, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(6, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(7, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(8, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(9, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(10, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(11, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(12, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(13, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(14, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(15, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(16, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(17, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(18, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(19, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(20, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(21, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(22, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(23, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(24, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(25, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(26, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(27, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(28, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(29, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(30, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(31, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(32, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(33, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(34, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(35, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(36, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(37, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(38, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(39, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(40, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(41, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(42, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(43, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(44, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(45, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(46, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(47, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(48, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(49, 'John Doe', '1985-06-15', 'johndoe@example.com'),
(50, 'John Doe', '1985-06-15', 'johndoe@example.com');

3.Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

UPDATE employee
SET birthday = '1990-01-01'
WHERE name = 'John Doe';

UPDATE employee
SET email = 'newemail@example.com'
WHERE id = 5;

UPDATE employee
SET name = 'Updated Name'
WHERE birthday = '1985-06-15';

UPDATE employee
SET birthday = '1980-01-01'
WHERE email = 'johndoe@example.com';

UPDATE employee
SET name = 'Michael Johnson'
WHERE id = 50;

4.Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

DELETE FROM employee
WHERE name = 'Michael Johnson';

DELETE FROM employee
WHERE id = 2;

DELETE FROM employee
WHERE birthday = '1980-01-01';

DELETE FROM employee
WHERE email = 'newemail@example.com';

DELETE FROM employee
WHERE id = 25;
