package me.sun.designpatterns._03_behavioral_patterns._23_visitor._03_java;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;

public class VisitorInJava {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/Users/sun/Library/Mobile Documents/com~apple~CloudDocs/design-patterns-study");
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor("Triangle.java", path);
        Files.walkFileTree(path, searchFileVisitor);
    }

}
