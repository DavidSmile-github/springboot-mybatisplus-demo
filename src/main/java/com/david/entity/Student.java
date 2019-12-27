package com.david.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author David
 * @since 2019-12-27
 */
@TableName("student")
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    private Integer age;

    /**
     * 班级
     */
    @TableField("stu_class")
    private String stuClass;

    /**
     * 年级
     */
    private String grade;

    /**
     * 家庭地址
     */
    @TableField("family_address")
    private String familyAddress;

    /**
     * 是否删除
     */
    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }
    public Integer getAge() {
        return age;
    }

    public Student setAge(Integer age) {
        this.age = age;
        return this;
    }
    public String getStuClass() {
        return stuClass;
    }

    public Student setStuClass(String stuClass) {
        this.stuClass = stuClass;
        return this;
    }
    public String getGrade() {
        return grade;
    }

    public Student setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getFamilyAddress() {
        return familyAddress;
    }

    public Student setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
        return this;
    }
    public Integer getIsDelete() {
        return isDelete;
    }

    public Student setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Student{" +
        "id=" + id +
        ", name=" + name +
        ", age=" + age +
        ", stuClass=" + stuClass +
        ", grade=" + grade +
        ", familyAddress=" + familyAddress +
        ", isDelete=" + isDelete +
        "}";
    }
}
