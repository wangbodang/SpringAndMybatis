--############################################ 存储过程
DELIMITER$$
CREATE PROCEDURE `test`.`prod_insert_a_emp` (
  IN empId INT,
  IN empName VARCHAR(50),
  IN empAge INT
)

BEGIN
  INSERT INTO `test`.`employee` (`Id`, `NAME`, `Age`)
  VALUES
    (empId, empName, empAge);
  COMMIT;
END$$

DELIMITER;

--############################################ 存储过程
DELIMITER //
CREATE PROCEDURE proc1(OUT s INT)
BEGIN
  SELECT COUNT(*) INTO s FROM `test`.`employee`;
END //
DELIMITER ;

--############################################ 调用存储过程
SET @P_out=1;
CALL test.`proc1`(@P_out);
SELECT @P_out;

CALL test.`prod_insert_a_emp`(12121212, 'xsdfsdfs', 34);


--############################################# 查询函数状态

SHOW FUNCTION STATUS;

--##### 生成函数 READS SQL DATA  // DETERMINISTIC
DELIMITER $$

CREATE FUNCTION `test`.`func_cal_emp_counts`(p_id INT) RETURNS INT
  READS SQL DATA
BEGIN
DECLARE temp INT;

 SELECT COUNT(*) INTO temp
 FROM `test`.`employee`
 WHERE `test`.`employee`.`Id` < p_id;
 RETURN (temp);

END $$

DELIMITER ;

--#############################################测试函数
SET @Temp_Count = 2;
SELECT @Temp_Count := test.`func_cal_emp_counts`(11003);

SELECT @Temp_Count;