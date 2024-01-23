--1.SELECT country from country 
--where country LIKE 'A%a';

--2.SELECT country from country 
--where country LIKE '_____%n';

--3.SELECT title FROM film
--WHERE title ILIKE '%t%';

SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;
