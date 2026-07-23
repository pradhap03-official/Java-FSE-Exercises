CREATE TABLE Employee(
    Id INT PRIMARY KEY,
    Name VARCHAR(50),
    Salary DECIMAL(10,2)
);

INSERT INTO Employee VALUES
(1,'Pradhap',25000),
(2,'Rahul',30000),
(3,'Kumar',28000);

SELECT * FROM Employee;