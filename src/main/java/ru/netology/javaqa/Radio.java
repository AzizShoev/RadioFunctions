package ru.netology.javaqa;

public class Radio {
    private int currentStation;  //Станция
    private int currentVolume;   //Громкость

    public int getCurrentStation() { //Текущая станции
        return currentStation;
    }

    public void setCurrentStation(int station) { //Границы станций
        if (station < 0 || station > 9) {
            return;
        }
        currentStation = station;
    }

    public void nextStation() { //Станция 9, если нажать next то станция 0
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() { //Стнация 0, если нажать prev то станция 9
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() { //Текущая громкость
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {  //Границы громкости
        if (volume < 0 || volume > 100) {
            return;
        }
        currentVolume = volume;
    }

    public void upVolume() {  //Увеличение громкости
        if (currentVolume == 100) {
            currentVolume = 100;
        } else {
            currentVolume++;
        }
    }

    public void downVolume() {   //Уменьшение громкости
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume--;
        }
    }
}