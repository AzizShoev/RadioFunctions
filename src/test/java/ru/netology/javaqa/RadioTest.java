package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        Assertions.assertEquals(4, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        Assertions.assertEquals(4, radio.getCurrentStation());

        radio.setCurrentStation(10);
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();

        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio();

        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.prevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);
        Assertions.assertEquals(50, volume.getCurrentVolume());

        volume.setCurrentVolume(-1);
        Assertions.assertEquals(50, volume.getCurrentVolume());

        volume.setCurrentVolume(101);
        Assertions.assertEquals(50, volume.getCurrentVolume());
    }

    @Test
    public void testUpVolume() {
        Radio volume = new Radio();

        volume.upVolume();
        Assertions.assertEquals(1, volume.getCurrentVolume());

        volume.setCurrentVolume(100);
        volume.upVolume();
        Assertions.assertEquals(100, volume.getCurrentVolume());
    }

    @Test
    public void testDownVolume() {
        Radio volume = new Radio();

        volume.downVolume();
        Assertions.assertEquals(0, volume.getCurrentVolume());

        volume.setCurrentVolume(100);
        volume.downVolume();
        Assertions.assertEquals(99, volume.getCurrentVolume());
    }
}
