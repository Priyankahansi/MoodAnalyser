package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest extends MoodAnalyser {

    @Test
    void givenMessageWhenSadShouldReturnSad() {
        MoodAnalyser mood = new MoodAnalyser();
        String result = MoodAnalyser.analyzeMood("Sad");
        assertEquals("SAD", result);
    }

}



