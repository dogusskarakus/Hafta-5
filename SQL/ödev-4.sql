--1.Select DISTINCT replacement_cost from film;

--2.Select COUNT (DISTINCT replacement_cost) from film;

--3.SELECT  COUNT(title) from film 
--WHERE title LIKE 'T%' AND rating = 'G';

--4.select COUNT (country) from country
--where country LIKE '_____'

SELECT COUNT (city) FROM city
WHERE city LIKE '%R' or city ILIKE'%r';
