package academy.samela.maratonajava.interfaces.test;

import academy.samela.maratonajava.interfaces.domain.DataLoader;
import academy.samela.maratonajava.interfaces.domain.DatabaseLoader;
import academy.samela.maratonajava.interfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.remove();
        fileLoader.load();
        databaseLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();

    }
}
