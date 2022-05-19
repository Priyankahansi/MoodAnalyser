package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest extends MoodAnalyser {

    public MoodAnalyserTest(String message) {
        super(message);
    }

    @Test
    public void givenNullMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Sad");
        String mood = moodAnalyser.analyseMood("SAD");
        assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_SadMood_Should_Return_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am In a Sad Mood");
        String mood = moodAnalyzer.analyseMood("SAD");
        assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_AnyMood_Should_HandleException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood("Happy");
        assertEquals("HAPPY", mood);
    }
}














