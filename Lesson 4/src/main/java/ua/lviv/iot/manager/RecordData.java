package ua.lviv.iot.manager;

import java.nio.file.FileAlreadyExistsException;

public interface RecordData {
    void recordDataAboutStudent() throws FileAlreadyExistsException;
    void recordDataAboutGroup() throws FileAlreadyExistsException;
}
