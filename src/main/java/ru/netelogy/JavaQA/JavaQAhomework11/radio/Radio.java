package ru.netelogy.JavaQA.JavaQAhomework11.radio;

public class Radio {
    private int firstStation;
    private int lastStation;
    private int numberOfTheCurrentRadioStation;
    private int volumeOfTheSound;
    private int minimumVolumeOfTheSound;
    private int maximumVolumeOfTheSound;

    public Radio(int firstStation, int lastStation, int minimumVolumeOfTheSound, int maximumVolumeOfTheSound) {
        this.firstStation = firstStation;
        this.lastStation = lastStation;
        this.numberOfTheCurrentRadioStation = firstStation;
        this.volumeOfTheSound = minimumVolumeOfTheSound;
        this.minimumVolumeOfTheSound = minimumVolumeOfTheSound;
        this.maximumVolumeOfTheSound = maximumVolumeOfTheSound;
    }

    public void setNumberOfTheCurrentRadioStation(int numberOfTheCurrentRadioStation) {
        if (numberOfTheCurrentRadioStation >= firstStation && numberOfTheCurrentRadioStation < lastStation +1) {
            this.numberOfTheCurrentRadioStation = numberOfTheCurrentRadioStation;
        } else  {
            this.numberOfTheCurrentRadioStation = 0;
        }
    }

    public void setVolumeOfTheSound(int volumeOfTheSound) {
        if (volumeOfTheSound >= minimumVolumeOfTheSound && volumeOfTheSound < maximumVolumeOfTheSound +1) {
            this.volumeOfTheSound = volumeOfTheSound;
        } else  {
            this.volumeOfTheSound = 0;
        }
    }

    public int getNumberOfTheCurrentRadioStation() {
        return numberOfTheCurrentRadioStation;
    }

    public int getVolumeOfTheSound() {
        return volumeOfTheSound;
    }

    public void next() {
        numberOfTheCurrentRadioStation = numberOfTheCurrentRadioStation < lastStation ? ++numberOfTheCurrentRadioStation : 0;
    }

    public void prev() {
        numberOfTheCurrentRadioStation = numberOfTheCurrentRadioStation > firstStation ? --numberOfTheCurrentRadioStation : lastStation;
    }

    public void volumeUp() {
        volumeOfTheSound = volumeOfTheSound < maximumVolumeOfTheSound ? ++volumeOfTheSound : maximumVolumeOfTheSound;
    }

    public void volumeDown() {
        volumeOfTheSound = volumeOfTheSound > minimumVolumeOfTheSound ? --volumeOfTheSound : minimumVolumeOfTheSound;
    }

}
