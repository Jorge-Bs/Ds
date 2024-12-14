package model.wraper;

import google.maps.BookMark;
import google.maps.Coordinates;
import model.Photo;

public class BookMarkPhoto implements BookMark {
    private Photo photo;

    public BookMarkPhoto(Photo photo) {
        this.photo = photo;
    }

    @Override
    public Coordinates getCoordinates() {
        return photo.getCoordinates();
    }

    @Override
    public String getTooltipInfo() {
        return photo.getDescription()+" "+photo.getUser();
    }

    @Override
    public void open() {
        photo.download();
    }
}
