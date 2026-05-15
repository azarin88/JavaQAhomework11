package ru.netelogy.JavaQA.JavaQAhomework11.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/DataTestsForSetNumberOfRadioStation")
    void TestSetNumberOfRadioStation(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(radioStation);
        Assertions.assertEquals(radio.getNumberOfRadioStation(), expected);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/DataTestsForNext")
    void positiveTestNext(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(radioStation);
        radio.next();
        Assertions.assertEquals(radio.getNumberOfRadioStation(), expected);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/DataTestsForPrev")
    void positiveTestPrev(int radioStation, int expected) {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(radioStation);
        radio.prev();
        Assertions.assertEquals(radio.getNumberOfRadioStation(), expected);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/DataTestsForSetVolumeOfTheSound")
    void TestSetVolumeOfTheSound(int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolumeOfTheSound(volume);
        Assertions.assertEquals(radio.getVolumeOfTheSound(), expected);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/DataTestsForVolumeUp")
    void positiveTestVolumeUp(int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolumeOfTheSound(volume);
        radio.volumeUp();
        Assertions.assertEquals(radio.getVolumeOfTheSound(), expected);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/DataTestsForVolumeDown")
    void positiveTestVolumeDown(int volume, int expected) {
        Radio radio = new Radio();
        radio.setVolumeOfTheSound(volume);
        radio.volumeDown();
        Assertions.assertEquals(radio.getVolumeOfTheSound(), expected);
    }
}
