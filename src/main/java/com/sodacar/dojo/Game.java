package com.sodacar.dojo;

public class Game {

    private int score = 0;

    private int frame = 0;

    private int remainRollNumInFrame = 2;

    private int[][] scoreboard = new int[10][2];

    private int lastPins = 0;

    public void roll(int pins) {
        getBall();
        scoreboard[frame][2 - remainRollNumInFrame] = pins;
        remainRollNumInFrame--;
        lastPins = pins;
    }

    public int score() {
        int[] frameScore = calculateFrameScore();
        for (int eachScore : frameScore) {
            score += eachScore;
        }
        return score;
    }

    private int[] calculateFrameScore() {
        int[] frameScore = new int[10];
        for (int i = 0; i < scoreboard.length; i++) {
            frameScore[i] = scoreboard[i][0] + scoreboard[i][1];
        }
        for (int i = 0; i < frameScore.length; i++) {
            if (frameScore[i] == 10) {
                frameScore[i] = frameScore[i] + frameScore[i + 1];
            }
        }
        return frameScore;
    }

    private void getBall() {
        if (lastPins != 10) {
            if (remainRollNumInFrame == 0) {
                enterNextFrame();
            }
        } else {
            enterNextFrame();
        }
    }

    public int frame() {
        return frame;
    }

    private void enterNextFrame() {
        frame++;
        remainRollNumInFrame = 2;
    }

}