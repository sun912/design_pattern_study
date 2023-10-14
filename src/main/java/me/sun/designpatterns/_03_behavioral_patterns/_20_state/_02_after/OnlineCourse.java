package me.sun.designpatterns._03_behavioral_patterns._20_state._02_after;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private State state = new Draft(this);
    private List<String> reviews = new ArrayList<>();
    private List<Student> students = new ArrayList<>();


    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void addReview(String review, Student student) {
        this.state.addReview(review, student);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void changeState(Private state) {
        this.state = state;
    }
}
