package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetCurrentStationWithoutArgument() {
        Assertions.assertEquals(10, radio.getStationCount());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentStationWithArgument() {
        Radio radio = new Radio(20, 5, 50);

        Assertions.assertEquals(20, radio.getStationCount());
        Assertions.assertEquals(5, radio.getCurrentStation());
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentStation() {
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        Assertions.assertEquals(5, radio.getCurrentStation());

        radio.setCurrentStation(10);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchNextStation() {
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchPrevStation() {
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.prevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }


    @Test
    public void shouldSetCurrentVolume() {
        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());

        radio.setCurrentVolume(-1);
        Assertions.assertEquals(50, radio.getCurrentVolume());

        radio.setCurrentVolume(101);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpVolume() {
        radio.upVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.upVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownVolume() {
        radio.downVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.downVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }
}
