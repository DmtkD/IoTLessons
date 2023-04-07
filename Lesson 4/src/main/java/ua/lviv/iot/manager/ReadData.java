package ua.lviv.iot.manager;

import java.io.FileNotFoundException;

public interface ReadData {
    void readDataAboutStudent(String file) throws FileNotFoundException;
}
