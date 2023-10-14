package me.sun.designpatterns._03_behavioral_patterns._19_observer._02_after;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("keesun");
        User user2 = new User("whiteship");

        chatServer.register("squadgame", user1);
        chatServer.register("squadgame", user2);

        chatServer.register("designpattern", user1);

        chatServer.sendMessage(user1, "squadgame", "아.. 이름이 기억났어.. 오일남..");
        chatServer.sendMessage(user2, "designpattern", "옵저버 패턴으로 만든 채팅");
    }
}
