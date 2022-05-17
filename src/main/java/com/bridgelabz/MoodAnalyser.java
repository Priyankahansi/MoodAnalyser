package com.bridgelabz;

public class MoodAnalyser {
    String message;

    public static String analyzeMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else if (message.contains("Happy")) {
            return "HAPPY";
        } else {
            return null;
        }
    }
}
