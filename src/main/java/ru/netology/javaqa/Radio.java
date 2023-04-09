package ru.netology.javaqa;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Radio {
    private int stationCount = 10;   //Количество станции, задано 10
    private int currentStation;  //Текущая станция
    private int currentVolume;   //Громкость


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