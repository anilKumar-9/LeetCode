# Write your MySQL query statement below
SELECT 
    class 
FROM 
    Courses
Group BY
    class
HAVING 
    COUNT(class)>=5;