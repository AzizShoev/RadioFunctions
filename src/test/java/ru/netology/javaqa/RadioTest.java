package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentStationWithoutArgument() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getStationCount());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentStationWithArgument() {
        Radio radio = new Radio(20);

        Assertions.assertEquals(20, radio.getStationCount());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        Assertions.assertEquals(5, radio.getCurrentStation());

        radio.setCurrentStation(10);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();

        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchPrevStation() {
        Radio radio = new Radio();

        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.prevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }


    @Test
    public void shouldSetCurrentVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);
        Assertions.assertEquals(50, volume.getCurrentVolume());

        volume.setCurrentVolume(-1);
        Assertions.assertEquals(50, volume.getCurrentVolume());

        volume.setCurrentVolume(101);
        Assertions.assertEquals(50, volume.getCurrentVolume());
    }

    @Test
    public void shouldUpVolume() {
        Radio volume = new Radio();

        volume.upVolume();
        Assertions.assertEquals(1, volume.getCurrentVolume());

        volume.setCurrentVolume(100);
        volume.upVolume();
        Assertions.assertEquals(100, volume.getCurrentVolume());
    }

    @Test
    public void shouldDownVolume() {
        Radio volume = new Radio();

        volume.downVolume();
        Assertions.assertEquals(0, volume.getCurrentVolume());

        volume.setCurrentVolume(100);
        volume.downVolume();
        Assertions.assertEquals(99, volume.getCurrentVolume());
    }
}
