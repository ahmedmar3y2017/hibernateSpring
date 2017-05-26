package Entities;

import javax.persistence.*;

/**
 * Created by ahmed on 5/26/2017.
 */
@Entity
public class Subjects {
    private int id;
    private String name;
    private double degree;
    private int year;
    private Student studentByUserId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "degree")
    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    @Basic
    @Column(name = "year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subjects subjects = (Subjects) o;

        if (id != subjects.id) return false;
        if (Double.compare(subjects.degree, degree) != 0) return false;
        if (year != subjects.year) return false;
        if (name != null ? !name.equals(subjects.name) : subjects.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(degree);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + year;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public Student getStudentByUserId() {
        return studentByUserId;
    }

    public void setStudentByUserId(Student studentByUserId) {
        this.studentByUserId = studentByUserId;
    }
}
