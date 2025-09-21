package controller;

import model.Reservation;
import model.ReservationStatus;
import model.Restaurant;
import model.User;
import model.services.ReservationService;
import model.services.RestaurantService;
import model.services.UserService;
import utils.FileStorage;

import java.util.List;

/**
 * Glavna kontrolerska klasa koja koordinira komunikaciju između korisničkog sučelja i servisnih klasa.
 * Implementira Singleton pattern za osiguravanje jedne instance kontrolera.
 */
public class Controller {
    private final static UserService userService = new UserService();
    private static Controller instance;
    private static User loggedInUser;
    private final static RestaurantService restaurantService = new RestaurantService();
    private final static ReservationService reservationService = new ReservationService();
    
    /**
     * Dohvaća jedinu instancu kontrolera (Singleton pattern).
     * 
     * @return instanca kontrolera
     */
    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    /**
     * Dohvaća trenutno prijavljenog korisnika.
     * Ako nema prijavljenog korisnika, stvara se novi prazan korisnik.
     * 
     * @return prijavljeni korisnik ili novi korisnik ako nitko nije prijavljen
     */
    public static User getLoggedInUser() {
        if (loggedInUser == null) {
            loggedInUser = new User();
        }
        return loggedInUser;
    }

    /**
     * Postavlja trenutno prijavljenog korisnika.
     * 
     * @param user korisnik koji se prijavljuje
     */
    public static void setLoggedInUser(User user) {
        loggedInUser = user;
    }

    /**
     * Dohvaća sve rezervacije određenog korisnika.
     * 
     * @param username korisničko ime
     * @return lista korisničkih rezervacija
     */
    public List<Reservation> getUserReservations(String username) {
        return reservationService.getUserReservations(username);
    }

    /**
     * Dodaje novog korisnika u sustav.
     * 
     * @param user korisnik kojeg dodajemo
     */
    public void addUser(User user) {
        userService.addUser(user);
    }

    /**
     * Uklanja korisnika iz sustava.
     * 
     * @param username korisničko ime korisnika kojeg uklanjamo
     */
    public void removeUser(String username) {
         userService.removeUser(username);
    }
    
    /**
     * Dohvaća korisnika po korisničkom imenu.
     * 
     * @param username korisničko ime
     * @return korisnik s danim imenom ili null ako ne postoji
     */
    public User getUserByUsername(String username) {
        return userService.getUserByUsername(username);
    }

    /**
     * Pokušava prijavu korisnika s danim podacima.
     * 
     * @param username korisničko ime
     * @param password lozinka
     * @return true ako su podaci točni, false inače
     */
    public boolean attemptLogin(String username, String password) {
        return userService.attemptLogin(username, password);
    }

    /**
     * Dohvaća sve korisnike s ulogom restorana.
     * 
     * @return lista korisnika s ulogom RESTAURANT
     */
    public List<User> getAllUsersWithRestaurantRole(){
        return userService.getAllUsersWithRestaurantRole();
    }

    /**
     * Dodaje novi restoran u sustav.
     * 
     * @param restaurant restoran kojeg dodajemo
     */
    public void addRestaurant(Restaurant restaurant) {
        restaurantService.add(restaurant);
    }

    /**
     * Dohvaća sve restorane u sustavu.
     * 
     * @return lista svih restorana
     */
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    /**
     * Dodaje novu rezervaciju u sustav.
     * 
     * @param reservation rezervacija koju dodajemo
     */
    public void addReservation(Reservation reservation) {
        reservationService.add(reservation);
    }

    //TODO dovrsiti ovu metodu, dodati u restaurant service klasi metodu koja vraca objekt restaurant po parametru
    //TODO tipa String restaurantId
    /**
     * Dohvaća restoran po ID-u.
     * 
     * @param restaurantId identifikator restorana
     * @return restoran s danim ID-om ili null ako ne postoji
     */
    public Restaurant getRestaurantById(int restaurantId) {
        return restaurantService.getRestaurant(restaurantId);
    }

    /**
     * Uklanja rezervaciju po ID-u.
     * 
     * @param reservationId identifikator rezervacije
     * @return true ako je rezervacija uspješno uklonjena, false inače
     */
    public boolean removeReservation(int reservationId) {
       return reservationService.removeUserReservation(reservationId);
    }

    /**
     * Dohvaća sve rezervacije za određeni restoran.
     * 
     * @param restaurantId identifikator restorana
     * @return lista rezervacija za dati restoran
     */
    public List<Reservation> getReservationsByRestaurantId(int restaurantId) {
        return reservationService.getReservationsByRestaurantId(restaurantId);
    }

    /**
     * Dohvaća restoran po ID-u (duplicirana metoda).
     * 
     * @param restaurantId identifikator restorana
     * @return restoran s danim ID-om ili null ako ne postoji
     */
    public Restaurant getRestaurantByRestaurantId(int restaurantId) {
        return restaurantService.getRestaurantId(restaurantId);
    }
    
    /**
     * Ažurira status rezervacije.
     * 
     * @param reservationId identifikator rezervacije
     * @param reservationStatus novi status rezervacije
     */
    public void updateReservation(int reservationId, ReservationStatus reservationStatus ) {
        reservationService.updateReservation(reservationId, reservationStatus);
    }

    /**
     * Dohvaća sve rezervacije u sustavu.
     * 
     * @return lista svih rezervacija
     */
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    /**
     * Učitava rezervacije iz datoteke u sustav.
     * 
     * @param reservations lista rezervacija za učitavanje
     */
    public void loadReservations( List<Reservation> reservations) {
        reservationService.loadReservations(reservations);
    }
}
