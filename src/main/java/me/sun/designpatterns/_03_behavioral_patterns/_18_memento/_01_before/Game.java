package me.sun.designpatterns._03_behavioral_patterns._18_memento._01_before;

public class Game {
    private int redTeamScore;
    private int blueTeamScore;

    public void setRedTeamScore(int redScore) {
        this.redTeamScore = redScore;
    }

    public void setBlueTeamScore(int blueScore) {
        this.blueTeamScore = blueScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore ;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }
}
