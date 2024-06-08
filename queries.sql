--Part 1

--id int PK, employer varchar(255), name varchar(255), skills varchar(255)

--Part 2

select name from employer where location = "St. Louis City";

--Part 3

drop table job;

--Part 4

--select name from skill s inner join job_skills js on s.id = js.skills_id group by s.id order by name asc;
select name from skill s
inner join job_skills js on s.id = js.skills_id
group by s.id
order by name asc;