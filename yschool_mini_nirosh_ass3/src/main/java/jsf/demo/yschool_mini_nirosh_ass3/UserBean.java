/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf.demo.yschool_mini_nirosh_ass3;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Niroshan
 */
@ManagedBean
@SessionScoped
public class UserBean {
    private String stuName;
    private int grade;
    private String subject;
    private int marks;

    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }

    /**
     * @return the stuName
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * @param stuName the stuName to set
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the Subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param Subject the Subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    
}
