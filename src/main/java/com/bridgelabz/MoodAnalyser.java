package com.bridgelabz;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String sad) {
        try {

            if (this.message.contains(null))
                return "HAPPY";
            else
                return "SAD";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}

















