select *,  max(Credit) as `Max Credit`
from subject;

select *, max(mark) from mark ;


select student.*, AVG(Mark) as `Diem Trung Binh`
from student 
join mark on student.StudentId=mark.StudentId
group by StudentId
order by avg(Mark) desc;

