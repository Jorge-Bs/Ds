package model.wraper;

import google.maps.BookMark;
import google.maps.Coordinates;
import google.maps.Navigator;
import model.Restaurant;

public class BookMarkRestaurant implements BookMark {

    Restaurant restaurant;

    public BookMarkRestaurant(Restaurant restaurant){
        this.restaurant = restaurant;
    }


    @Override
    public Coordinates getCoordinates() {
        return new Navigator().getCoordinates(restaurant.getAddress());
    }

    @Override
    public String getTooltipInfo() {
        return restaurant.getName()+ " " +restaurant.getPhone();
    }

    @Override
    public void open() {
        restaurant.call();
    }
}
