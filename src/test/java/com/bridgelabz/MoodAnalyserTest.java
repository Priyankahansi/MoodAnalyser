package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest extends MoodAnalyser {
    @Test
    void givenMessageWhenSadShouldReturnSad() {
        MoodAnalyser mood = new MoodAnalyser();
        String result = MoodAnalyser.analyzeMood("sad");
        assertEquals("SAD", result);
    }

    @Test
    void givenMessageWhenIaminsadmoodShouldReturnSad() {
        MoodAnalyser mood = new MoodAnalyser();
        String result = MoodAnalyser.analyzeMood2("i am in sad mood");
        assertEquals("SAD", result);
    }
}









