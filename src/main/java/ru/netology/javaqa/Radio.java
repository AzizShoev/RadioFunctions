package ru.netology.javaqa;

public class Radio {
    private int stationCount = 10;   //Количество станции, задано 10
    private int currentStation;  //Текущая станция
    private int currentVolume;   //Громкость

    public Radio() {    //Конструктор без заданых парамтров
    }

    public Radio(int stationCount) {    //Конструктор с заданым параметром станций
        this.stationCount = stationCount;
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    public int getStationCount() {  //Заданное кол-во станций
        return stationCount;
    }

    public int getCurrentStation() {    //Заданная станции
        return currentStation;
    }

    public void setCurrentStation(int station) {    //Границы станций 0-9
        if (station >= 0 && station < stationCount) {
            this.currentStation = station;
        }
    }

    public void nextStation() { //Кнопка станция +
        if (currentStation == stationCount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() { //Кнопка станция -
        if (currentStation == 0) {
            currentStation = stationCount - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() { //Заданная громкость

        return currentVolume;
    }

    public void setCurrentVolume(int volume) {  //Границы громкости 0-100
        if (volume < 0 || volume > 100) {
            return;
        }
        currentVolume = volume;
    }

    public void upVolume() {  //Увеличение громкости +
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void downVolume() {   //Уменьшение громкости -
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}