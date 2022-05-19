package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest extends MoodAnalyser {
    public MoodAnalyserTest(String i_am_in_happy_mood) {
        super(i_am_in_happy_mood);
    }

    @Test
    public void givenMessage_SadMood_Should_Return_Sad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am In a Sad Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            assertEquals("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_AnyMood_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}














