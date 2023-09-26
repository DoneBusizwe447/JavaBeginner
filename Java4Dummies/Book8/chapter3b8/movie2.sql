use movies;
select * from movie;
SELECT title, year
FROM movie
ORDER BY year;

SELECT * FROM movie ORDER BY year;

SELECT title, year
FROM movie
WHERE year <= 1980
ORDER BY year DESC;

SELECT title, year
FROM movie
WHERE year < 1970 OR year > 1979
ORDER BY year DESC;

SELECT id, title, year
FROM movie
WHERE id = 7;

SELECT id, title, year
FROM movie
WHERE title like "%princess%";

SELECT count(*)as count, min(year), max(year) FROM movie;

SELECT count(*)  FROM movie WHERE year < 1970;

create table friend (
 lastname varchar(50),
 firstname varchar(50),
 movieid int
);

insert into friend (lastname, firstname, movieid)
 values ("Haskell", "Eddie", 3);
insert into friend (lastname, firstname, movieid)
 values ("Haskell", "Eddie", 5);
insert into friend (lastname, firstname, movieid)
 values ("Cleaver", "Wally", 9);
insert into friend (lastname, firstname, movieid)
 values ("Mondello", "Lumpy", 2);
insert into friend (lastname, firstname, movieid)
 values ("Cleaver", "Wally", 3);

 
 SELECT lastname, firstname, title
 FROM movie, friend
 WHERE movie.id = friend.movieid;
 
  select distinct lastname, firstname from friend;
  SELECT * FROM movie;
  DELETE FROM movie
  WHERE id = 10;
  
  use movies;
  DELETE FROM friend WHERE lastname = "Haskell";
  SELECT * FROM friend;