package com.bridgelabz;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String i_am_in_happy_mood) {
    }

    public void MoodAnalyse() {
    }

    public void MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {

            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception e) {
            if (message == null)
                throw new MoodAnalysisException("Invalid Mood", MoodAnalysisException.Exception_Type.NULL);
            else
                throw new MoodAnalysisException("Invalid Mood", MoodAnalysisException.Exception_Type.EMPTY);
        }
    }
}

















