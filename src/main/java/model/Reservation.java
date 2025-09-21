package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Klasa koja predstavlja rezervaciju stola u restoranu.
 * Implementira Serializable sučelje za serijalizaciju objekata.
 */
public class Reservation implements Serializable {
    private int id = ThreadLocalRandom.current().nextInt(1, 999999);
    private int restaurantId;
    private String username;
    private int numberOfGuests;
    private LocalDate date;
    private String time;
    private String message = "No message provided";
    private ReservationStatus status = ReservationStatus.PENDING;

    /**
     * Dohvaća ID rezervacije.
     * 
     * @return jedinstveni identifikator rezervacije
     */
    public int getId() {
        return id;
    }

    /**
     * Postavlja ID rezervacije.
     * 
     * @param id jedinstveni identifikator rezervacije
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Dohvaća vrijeme rezervacije.
     * 
     * @return vrijeme rezervacije kao string
     */
    public String getTime() {
        return time;
    }

    /**
     * Postavlja vrijeme rezervacije.
     * 
     * @param time vrijeme rezervacije
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Dohvaća datum rezervacije.
     * 
     * @return datum rezervacije
     */
    public LocalDate getLocalDate() {
        return date;
    }

    /**
     * Postavlja datum rezervacije.
     * 
     * @param date datum rezervacije
     */
    public void setLocalDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Dohvaća broj gostiju za rezervaciju.
     * 
     * @return broj gostiju
     */
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    /**
     * Postavlja broj gostiju za rezervaciju.
     * 
     * @param numberOfGuests broj gostiju
     */
    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    /**
     * Dohvaća korisničko ime osobe koja je napravila rezervaciju.
     * 
     * @return korisničko ime
     */
    public String getUsername() {
        return username;
    }

    /**
     * Postavlja korisničko ime osobe koja pravi rezervaciju.
     * 
     * @param username korisničko ime
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Dohvaća ID restorana za koji se pravi rezervacija.
     * 
     * @return identifikator restorana
     */
    public int getRestaurantId() {
        return restaurantId;
    }

    /**
     * Postavlja ID restorana za koji se pravi rezervacija.
     * 
     * @param restaurantId identifikator restorana
     */
    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * Dohvaća poruku vezanu uz rezervaciju.
     * 
     * @return poruka rezervacije
     */
    public String getMessage() {
        return message;
    }

    /**
     * Postavlja poruku vezanu uz rezervaciju.
     * 
     * @param message poruka rezervacije
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Vraća string reprezentaciju rezervacije s osnovnim podacima.
     * 
     * @return formatiran string s detaljima rezervacije
     */
    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", restaurantId=" + restaurantId +
                ", username=" + username +
                ", numberSeats=" + numberOfGuests +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    /**
     * Dohvaća status rezervacije.
     * 
     * @return status rezervacije
     */
    public ReservationStatus getStatus() {
        return status;
    }

    /**
     * Postavlja status rezervacije.
     * 
     * @param status novi status rezervacije
     */
    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}

