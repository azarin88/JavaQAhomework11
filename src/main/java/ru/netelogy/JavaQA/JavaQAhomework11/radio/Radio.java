package ru.netelogy.JavaQA.JavaQAhomework11.radio;

public class Radio {
    private int firstStation = 0;
    private int lastStation = 9;
    private int numberOfTheCurrentRadioStation = firstStation;
    private int volumeOfTheSound = 0;
    private int minimumVolumeOfTheSound = 0;
    private int maximumVolumeOfTheSound = 100;

    public Radio() {
    }

    public Radio(int stationsThatTheRadioPicksUpn) {
        lastStation = firstStation + stationsThatTheRadioPicksUpn - 1;
    }

    public void next() {
        numberOfTheCurrentRadioStation = numberOfTheCurrentRadioStation < lastStation ? ++numberOfTheCurrentRadioStation : 0;
    }

    public void prev() {
        numberOfTheCurrentRadioStation = numberOfTheCurrentRadioStation > firstStation ? --numberOfTheCurrentRadioStation : lastStation;
    }

    public void setNumberOfRadioStation(int numberOfRadioStation) {
        numberOfTheCurrentRadioStation = numberOfRadioStation >= firstStation && numberOfRadioStation < lastStation + 1 ? numberOfRadioStation : numberOfTheCurrentRadioStation;
    }

    public int getNumberOfRadioStation() {
        return numberOfTheCurrentRadioStation;
    }

    public void volumeUp() {
        volumeOfTheSound = volumeOfTheSound < maximumVolumeOfTheSound ? ++volumeOfTheSound : maximumVolumeOfTheSound;
    }

    public void volumeDown() {
        volumeOfTheSound = volumeOfTheSound > minimumVolumeOfTheSound ? --volumeOfTheSound : minimumVolumeOfTheSound;
    }

    public void setVolumeOfTheSound(int volume) {
        volumeOfTheSound = volume >= minimumVolumeOfTheSound && volume < maximumVolumeOfTheSound + 1 ? volume : volumeOfTheSound;
    }

    public int getVolumeOfTheSound() {
        return volumeOfTheSound;
    }
}
