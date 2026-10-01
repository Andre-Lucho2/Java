package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<String> students;
    private List<Character> courses;

    public Teacher() {
    }

    public Teacher(String name, List<String> students, List<Character> courses) {
        this.name = name;
        this.students = students;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int student_toHash(String name) {
        return name.hashCode();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + students;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Teacher other = (Teacher) obj;
        if (student != other.student)
            return false;
        return true;
    };

}
