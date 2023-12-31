package me.sun.designpatterns._03_behavioral_patterns._22_template._02_after;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("numbers.txt");
        int result = fileProcessor.process((result1, number) -> result1 *= number);
        System.out.println(result);

    }
}
