package me.sun.designpatterns._03_behavioral_patterns._20_state._01_before;

import java.util.ArrayList;
import java.util.List;

import static me.sun.designpatterns._03_behavioral_patterns._20_state._01_before.OnlineCourse.State.*;

public class OnlineCourse {

    private State state = State.DRAFT;

    private List<String> reviews = new ArrayList<>();

    private List<Student> students = new ArrayList<>();

    public void addReview(String content, Student student) {
        if (this.state == PUBLISHED) {
            this.reviews.add(content);
        } else if (this.state == PRIVATE && this.students.contains(student)) {
            this.reviews.add(content);
        } else {
            throw new UnsupportedOperationException("리뷰를 작성할 수 없습니다.");
        }
    }

    public void addStudent(Student student) {
        if (this.state == DRAFT || this.state == PUBLISHED) {
            this.students.add(student);
        } else if (this.state == PRIVATE && availableTo(student)) {
            this.students.add(student);
        } else {
            throw new UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다.");
        }

        if (this.students.size() > 1) {
            this.state = PRIVATE;
        }
    }

    private boolean availableTo(Student student) {
        return student.isEnabledForPrivateClass(this);
    }

    public void changeState(State state) {
        this.state = state;
    }


    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public enum State {
        PRIVATE,DRAFT,PUBLISHED
    }
}
