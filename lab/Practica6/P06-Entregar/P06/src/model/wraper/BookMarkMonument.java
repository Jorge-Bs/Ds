package model.wraper;

import google.maps.BookMark;
import google.maps.Coordinates;
import google.maps.Navigator;
import model.Monument;

public class BookMarkMonument implements BookMark {
    private Monument monument;

    public BookMarkMonument(Monument monument) {
        this.monument = monument;
    }

    @Override
    public Coordinates getCoordinates() {
        return new Navigator().getCoordinates(monument.getAddress());
    }

    @Override
    public String getTooltipInfo() {
        return monument.getName()+" "+monument.getAuthor();
    }

    @Override
    public void open() {
        new Navigator().navigateTo(monument.getAddress());
    }
}
