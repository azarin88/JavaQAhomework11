package ru.netelogy.JavaQA.JavaQAhomework11.radio;

public class Radio {
    private int numberOfTheCurrentRadioStation = 0;
    private int volumeOfTheSound = 0;


    public void next() {
        numberOfTheCurrentRadioStation = numberOfTheCurrentRadioStation < 9 ? ++numberOfTheCurrentRadioStation : 0;
    }

    public void prev() {
        numberOfTheCurrentRadioStation = numberOfTheCurrentRadioStation > 0 ? --numberOfTheCurrentRadioStation : 9;
    }

    public void setNumberOfRadioStation(int numberOfRadioStation) {
        numberOfTheCurrentRadioStation = numberOfRadioStation >= 0 && numberOfRadioStation < 10 ? numberOfRadioStation : numberOfTheCurrentRadioStation;
    }

    public int getNumberOfRadioStation() {
        return numberOfTheCurrentRadioStation;
    }

    public void volumeUp() {
        volumeOfTheSound = volumeOfTheSound < 100 ? ++volumeOfTheSound : 100;
    }

    public void volumeDown() {
        volumeOfTheSound = volumeOfTheSound > 0 ? --volumeOfTheSound : 0;
    }

    public void setVolumeOfTheSound(int volume) {
        volumeOfTheSound = volume >= 0 && volume < 101 ? volume : volumeOfTheSound;
    }

    public int getVolumeOfTheSound() {
        return volumeOfTheSound;
    }
}
