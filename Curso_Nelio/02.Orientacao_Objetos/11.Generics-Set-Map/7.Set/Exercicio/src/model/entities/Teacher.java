package model.entities;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
    private String name;
    private Set<Course> courses = new HashSet<>();

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public int getTotalDistinctStudents() {
        Set<String> allStudents = new HashSet<>();
        for (Course course : courses) {
            allStudents.addAll(course.getStudents());
        }
        return allStudents.size();
    }

    public int student_toHash(String name) {
        return name.hashCode();
    }

}
