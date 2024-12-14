package framework;

import java.util.Set;

public interface Album {
    MultimediaArchive getArchive(String name);

    void displayArchive(String name);

    Set<String> getArchivesList();

    public boolean insertArchive(MultimediaArchive archive);
}
