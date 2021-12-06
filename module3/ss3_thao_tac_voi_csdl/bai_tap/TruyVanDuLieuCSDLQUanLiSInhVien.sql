use quanlysinhvien;

select * from student
where StudentName like 'h%';

select * from class
where Month(StartDate)='12';	

select * from subject
where credit between 3 and 5;
 
set SQL_SAFE_UPDATES =0;
update student
set ClassId='2' where StudentName='Hung';
set SQL_SAFE_UPDATES =1;

select studentName,subname ,mark from student
inner join mark on student.StudentId=mark.StudentId
inner join subject on mark.SubId=subject.SubId
order by mark desc, studentName asc
