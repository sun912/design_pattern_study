package me.sun.designpatterns._03_behavioral_patterns._20_state._02_after;

public class Client {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("geunsun");
        Student keesun = new Student("keesun");

        keesun.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("it's good", student);

        onlineCourse.addStudent(keesun);

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getState());
    }
}
