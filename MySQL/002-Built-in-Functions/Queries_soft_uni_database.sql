SELECT `first_name`, `last_name`
FROM `employees`
WHERE left (`first_name`, 2) = 'Sa'
ORDER BY `employee_id`;

SELECT `first_name`, `last_name`
FROM `employees`
WHERE locate('ei', `last_name`)
ORDER BY `employee_id`;

SELECT `first_name`
FROM `employees`
WHERE `department_id` IN (3, 10)
  AND `hire_date` BETWEEN '1995-01-01' AND '2005-12-31'
ORDER BY `employee_id`;

SELECT `first_name`, `last_name`
FROM `employees`
WHERE locate('engineer', `job_title`) is FALSE
ORDER BY `employee_id`;

SELECT `name`
FROM `towns`
WHERE char_length(`name`) in (5, 6)
ORDER BY `name`;

SELECT `town_id`, `name`
FROM `towns`
WHERE lower(left (`name`, 1)) IN ('m', 'k', 'b', 'e')
ORDER BY `name`;

SELECT `town_id`, `name`
FROM `towns`
WHERE lower(left (`name`, 1)) IN ('r', 'b', 'd') is FALSE
ORDER BY `name`;

CREATE VIEW `v_employees_hired_after_2000` AS
SELECT `first_name`, `last_name`
FROM `employees`
WHERE `hire_date` > '2000-12-31';

SELECT `first_name`, `last_name`
FROM `employees`
WHERE char_length(`last_name`) = 5;