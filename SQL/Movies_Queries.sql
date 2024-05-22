--Ερώτημα 1
SELECT lname, fname
	FROM actors
	WHERE lname LIKE 'Κ%'
	ORDER BY lname;

--Ερώτημα 2
SELECT title, pyear
	FROM movies
	WHERE pyear BETWEEN 1990 AND 2007
	ORDER BY pyear DESC;

--Ερώτημα 3
SELECT title, lname, fname, pcountry
	FROM movies INNER JOIN directors ON directors.did=movies.did 
	WHERE pcountry LIKE 'GRC';

--Ερώτημα 4
SELECT title, pyear
	FROM movies INNER JOIN directors ON directors.did=movies.did 
	WHERE lname LIKE 'Σακελλάριος';

--Ερώτημα 5
SELECT DISTINCT title, pyear
	FROM actors INNER JOIN movie_actor ON movie_actor.actid=actors.actid
				INNER JOIN movies ON movies.mid=movie_actor.mid
	WHERE lname LIKE 'Eastwood';

--Ερώτημα 6
SELECT lname, fname
	FROM actors INNER JOIN movie_actor ON movie_actor.actid=actors.actid
				INNER JOIN movies ON movies.mid=movie_actor.mid
	WHERE title LIKE 'Amelie';

--Ερώτημα 7
SELECT COUNT (DISTINCT title) AS titles_on_DVD
	FROM movies INNER JOIN copies ON movies.mid=copies.mid
	WHERE cmedium LIKE 'DVD';

--Ερώτημα 8
SELECT COUNT (barcode) AS num_of_copies
	FROM copies	
	WHERE cmedium LIKE 'DVD';

--Ερώτημα 9
SELECT MAX (price) AS max_price
	FROM copies;

--Ερώτημα 10
SELECT SUM (price) AS total_worth_BLU_RAY
	FROM copies	
	WHERE cmedium LIKE 'BLU RAY';

--Ερώτημα 11
SELECT lname, fname, COUNT (title) AS title
	FROM directors INNER JOIN movies ON directors.did=movies.did
	GROUP BY lname, fname;

--Ερώτημα 12
SELECT COUNT (mid)
	FROM actors INNER JOIN movie_actor ON movie_actor.actid=actors.actid
	WHERE lname LIKE 'Παπαγιαννόπουλος'

--Ερώτημα 13
SELECT lname, fname
	FROM actors INNER JOIN movie_actor ON movie_actor.actid=actors.actid
				INNER JOIN movies ON movies.mid=movie_actor.mid
	WHERE pcountry NOT LIKE 'GRC';

--Ερώτημα 14
SELECT title
	FROM actors INNER JOIN movie_actor ON movie_actor.actid=actors.actid
				INNER JOIN movies ON movies.mid=movie_actor.mid
	WHERE lname LIKE 'Κούρκουλος'

INTERSECT

SELECT title
	FROM actors INNER JOIN movie_actor ON movie_actor.actid=actors.actid
				INNER JOIN movies ON movies.mid=movie_actor.mid
	WHERE lname LIKE 'Καρέζη';

--Ερώτημα 15
SELECT title
	FROM actors INNER JOIN movie_actor ON movie_actor.actid=actors.actid
				INNER JOIN movies ON movies.mid=movie_actor.mid
	WHERE lname LIKE 'Καρέζη'

EXCEPT

SELECT title
	FROM actors INNER JOIN movie_actor ON movie_actor.actid=actors.actid
				INNER JOIN movies ON movies.mid=movie_actor.mid
	WHERE lname LIKE 'Κούρκουλος';

--Ερώτημα 16
SELECT title
	FROM categories INNER JOIN movie_cat ON categories.catid=movie_cat.catid
				INNER JOIN movies ON movie_cat.mid=movies.mid
	WHERE category LIKE 'Κωμωδία'

UNION

SELECT title
	FROM categories INNER JOIN movie_cat ON categories.catid=movie_cat.catid
				INNER JOIN movies ON movie_cat.mid=movies.mid
	WHERE category LIKE 'Αισθηματική';

--Ερώτημα 17
SELECT category, COUNT (*) AS num_of_movies
	FROM categories INNER JOIN movie_cat ON categories.catid=movie_cat.catid
	GROUP BY category HAVING COUNT(*) >= 5;

--Ερώτημα 18
SELECT lname, fname, COUNT (*) AS directed_movies
	FROM directors LEFT OUTER JOIN movies ON movies.did=directors.did
	GROUP BY lname, fname HAVING COUNT(*) >= 0;

--Ερώτημα 19
DELETE FROM categories
	WHERE category = 'Βιογραφία';
	
--Ερώτημα 20
UPDATE copies
	SET price = 70
	WHERE mid=19 AND cmedium = 'DVD';