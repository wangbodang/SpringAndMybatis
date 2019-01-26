package com.wangbodang.demo.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private Integer id;

    private String name;

    private Integer age;

    private Integer gender;

    @DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
    //@JSONField(format="yyyy-MM-dd")//数据库导出页面时json格式化
    private Date hiredate;

    private BigDecimal salary;

    private Date createTime;

    private Integer createId;

    private Date updateTime;

    private Integer updateId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hiredate=" + hiredate +
                ", salary=" + salary +
                '}';
    }
}

/*


--Create Table

CREATE TABLE `employee_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `hiredatePeriod` varchar(6) DEFAULT NULL,
  `remark` varchar(150) DEFAULT NULL,
  `summary` varchar(150) DEFAULT NULL,
  `decimalNumber` decimal(20,6) DEFAULT NULL,
  `idcard` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `birthday` varchar(10) DEFAULT NULL,
  `gendercn` varchar(1) DEFAULT NULL COMMENT '性别',
  `officedate` varchar(10) DEFAULT NULL COMMENT '入职日期',
  `testdate` varchar(10) DEFAULT NULL COMMENT '测试数据',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41034 DEFAULT CHARSET=utf8 COMMENT='Emp 测试表'



Create Table

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `hiredatePeriod` varchar(6) DEFAULT NULL,
  `remark` varchar(150) DEFAULT NULL,
  `summary` varchar(150) DEFAULT NULL,
  `decimalNumber` decimal(20,6) DEFAULT NULL,
  `idcard` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `birthday` varchar(10) DEFAULT NULL,
  `gendercn` varchar(1) DEFAULT NULL COMMENT '性别',
  `officedate` varchar(10) DEFAULT NULL COMMENT '入职日期',
  `testdate` varchar(10) DEFAULT NULL COMMENT '测试数据',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41034 DEFAULT CHARSET=utf8 COMMENT='Emp 测试表'


*/