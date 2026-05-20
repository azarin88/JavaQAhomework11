package ru.netelogy.JavaQA.JavaQAhomework11.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int firstStation;
    private int lastStation;
    private int numberOfTheCurrentRadioStation;
    private int volumeOfTheSound;
    private int minimumVolumeOfTheSound;
    private int maximumVolumeOfTheSound;




    public void setNumberOfRadioStation(int numberOfRadioStation) {
        numberOfTheCurrentRadioStation = numberOfRadioStation >= firstStation && numberOfRadioStation < lastStation + 1 ? numberOfRadioStation : numberOfTheCurrentRadioStation;
    }

    public void setVolumeOfTheSound(int volume) {
        volumeOfTheSound = volume >= minimumVolumeOfTheSound && volume < maximumVolumeOfTheSound + 1 ? volume : volumeOfTheSound;
    }




    public void next() {
        numberOfTheCurrentRadioStation = numberOfTheCurrentRadioStation < lastStation ? ++numberOfTheCurrentRadioStation : firstStation;
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
