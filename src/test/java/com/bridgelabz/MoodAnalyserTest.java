package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest extends MoodAnalyser {


    @Test
    public void givenNullMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Sad");
        assertEquals("SAD", mood);
    }
}

    @Test
    void givenMessageWhenIaminanymoodShouldReturnhappy() {
        MoodAnalyser mood = new MoodAnalyser();
        String result = MoodAnalyser.analyzeMood3("i am in any mood");
        assertEquals("Happy", result);
    }
}

    void givenMessageWhenIaminsadmoodShouldReturnHappy() {
        MoodAnalyser mood = new MoodAnalyser();
        String result = MoodAnalyser.analyzeMood3("i am in any mood");
        assertEquals("SAD", result);
    }
}









