package me.sun.designpatterns._03_behavioral_patterns._20_state._02_after;

public class Published implements State{

    private OnlineCourse onlineCourse;

    public Published(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String content, Student student) {
        this.onlineCourse.getReviews().add(content);
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);
    }
}
