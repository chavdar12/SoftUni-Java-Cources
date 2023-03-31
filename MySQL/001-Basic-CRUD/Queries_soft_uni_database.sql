All Information About Departments
SELECT *
FROM `departments`;

SELECT `name`
from `departments`
ORDER BY `department_id` ASC;

SELECT `first_name`, `last_name`, `salary`
FROM soft_uni.`employees`;

SELECT `first_name`, `middle_name`, `last_name`
FROM soft_uni.`employees`;

SELECT concat(`first_name`, '.', `last_name`, '@softuni.bg') AS `full_email_address`
FROM soft_uni.`employees`;

SELECT DISTINCT `salary`
FROM soft_uni.`employees`
ORDER BY `employee_id` ASC;

SELECT *
FROM soft_uni.`employees`
WHERE `job_title` = 'Sales Representative'
ORDER BY `employee_id`;

SELECT `first_name`, `last_name`, `job_title`
FROM soft_uni.`employees`
WHERE `salary` >= 20000
  AND `salary` <= 30000
ORDER BY `employee_id`;

SELECT concat_ws(' ', `first_name`, `middle_name`, `last_name`) as `Full Name`
FROM soft_uni.`employees`
WHERE `salary` = 25000
   or `salary` = 14000
   or `salary` = 12500
   or `salary` = 23600;

SELECT `first_name`, `last_name`
FROM soft_uni.`employees`
WHERE `manager_id` IS NULL;

SELECT `first_name`, `last_name`, `salary`
FROM soft_uni.`employees`
WHERE `salary` > 50000
ORDER BY `salary` DESC;

SELECT `first_name`, `last_name`
FROM soft_uni.`employees`
ORDER BY `salary` DESC LIMIT 5;

SELECT `first_name`, `last_name`
FROM soft_uni.`employees`
WHERE `department_id` != 4;

SELECT *
FROM soft_uni.`employees`
ORDER BY `salary` DESC, `first_name` ASC, `last_name` DESC, `middle_name` ASC;

CREATE VIEW `v_employees_salaries` as
SELECT `first_name`, `last_name`, `salary`
FROM soft_uni.`employees`;

CREATE VIEW `v_employees_job_titles` AS
SELECT concat_ws(' ', `first_name`, ifnull(`middle_name`, ''), `last_name`) AS `full_name`, `job_title`
FROM soft_uni.`employees`;

SELECT DISTINCT `job_title` AS `Job_title`
FROM soft_uni.`employees`
ORDER BY `job_title`;

SELECT *
FROM `projects`
ORDER BY `start_date` ASC, `name` ASC LIMIT 10;

SELECT `first_name`, `last_name`, `hire_date`
FROM soft_uni.`employees`
ORDER BY `hire_date` DESC LIMIT 7;

UPDATE soft_uni.`employees`
SET `salary` = `salary` + (`salary` * 0.12)
WHERE `department_id` = 1
   OR `department_id` = 2
   or `department_id` = 4
   or `department_id` = 11;
SELECT `salary`
FROM soft_uni.`employees`;