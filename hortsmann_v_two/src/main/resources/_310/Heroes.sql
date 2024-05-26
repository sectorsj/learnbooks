CREATE TABLE Heroes
(
	Hero_Id CHAR(4),
	Name CHAR(25),
	Fname CHAR(25)
);

INSERT INTO Heroes VALUES (
'Superman', 'Clark', 'Kent'),
('BATMAN', 'Bruce ', 'Wayne'),
('capitan america', 'Steven', 'Rogers'),
('Star Lord', 'Peter', 'Jason Quil');

SELECT * FROM Heroes;

--DELETE FROM Heroes;