package me.sun.designpatterns._01_creational_patterns._05_prototype._02_after;

import org.modelmapper.ModelMapper;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("user1");
        repository.setName("name1");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과졔: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        System.out.println(githubIssue.getUrl());

        GithubIssue clone = githubIssue.clone();
        System.out.println(clone.getUrl());

        repository.setName("name2");
        repository.setUser("user2");

        System.out.println(clone.getUrl());

        ModelMapper modelMapper = new ModelMapper();

        
    }
}
