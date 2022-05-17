package com.bridgelabz;

public class MoodAnalyser {
    String message;

    public String analyseMood(String message) {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
        return null;
    }
}













