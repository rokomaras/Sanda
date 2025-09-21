package model.services;

import model.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Servisna klasa za upravljanje restoranima u sustavu.
 * Omogućuje dodavanje, pretraživanje i dohvaćanje restorana.
 */
public class RestaurantService {
    private final List<Restaurant> restaurants = new ArrayList<>();

    /**
     * Dodaje novi restoran u sustav.
     * 
     * @param restaurant restoran kojeg dodajemo
     */
    public void add(Restaurant restaurant) {
        restaurants.add(restaurant);
        System.out.println("Available restaurants: " + restaurants);
    }

    /**
     * Dohvaća sve restorane u sustavu.
     * 
     * @return lista svih restorana
     */
    public List<Restaurant> getAllRestaurants() {
        return restaurants;

    }

    /**
     * Dohvaća restoran po ID-u.
     * 
     * @param id identifikator restorana
     * @return restoran s danim ID-om ili null ako ne postoji
     */
    public Restaurant getRestaurant(int id) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == id) {
                return restaurant;
            }
        }
        return null;
    }

    /**
     * Dohvaća restoran po ID-u (duplicirana metoda).
     * 
     * @param id identifikator restorana
     * @return restoran s danim ID-om ili null ako ne postoji
     */
    public Restaurant getRestaurantId(int id) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == id) {
                return restaurant;
            }
        }return null;
    }
}
