-- Write your PostgreSQL query statement below
select unique_id , name FROM Employees AS emp
LEFT JOIN EmployeeUNI empI on emp.id=empI.id;