package abstractFramework;

import framework.MultimediaArchive;

public abstract class AbstractMultimediaArchive implements MultimediaArchive {
    private String name;

    protected AbstractMultimediaArchive(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        load();
        doDisplay();
        close();
    }

    protected abstract void load();
    protected abstract void doDisplay();
    protected abstract void close();

}
