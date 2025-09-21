package model.services;

import model.Reservation;
import model.ReservationStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Servisna klasa za upravljanje rezervacijama u sustavu.
 * Omogućuje dodavanje, uklanjanje, ažuriranje i pretraživanje rezervacija.
 */
public class ReservationService {
    private final List<Reservation> reservationList = new ArrayList<>();

    /**
     * Dodaje novu rezervaciju u sustav.
     * 
     * @param reservation rezervacija koju dodajemo
     */
    public void add(Reservation reservation) {
        reservationList.add(reservation);
        System.out.println("Reservation added " + reservation);
    }

    /**
     * Dohvaća sve rezervacije korisnika po korisničkom imenu.
     * 
     * @param username korisničko ime
     * @return lista rezervacija danog korisnika
     */
    public List<Reservation> getUserReservations(String username) {
        List<Reservation> userReservations = new ArrayList<>();
        for (Reservation reservation : reservationList) {
            if (reservation.getUsername().equals(username)) {
                userReservations.add(reservation);
            }
        }
        return userReservations;
    }

    /**
     * Uklanja rezervaciju korisnika po ID-u rezervacije.
     * 
     * @param reservationId identifikator rezervacije
     * @return true ako je rezervacija uspješno uklonjena, false inače
     */
    public boolean removeUserReservation(int reservationId) {
        boolean removed = reservationList.removeIf(r -> r.getId() == reservationId);
        if (removed) {
            System.out.println("Reservation with id " + reservationId + " removed");
        } else {
            System.out.println("Reservation with id " + reservationId + " not found");
        }
        return removed;
    }

    /**
     * Dohvaća sve rezervacije za određeni restoran.
     * 
     * @param restaurantId identifikator restorana
     * @return lista rezervacija za dati restoran
     */
    public List<Reservation> getReservationsByRestaurantId(int restaurantId) {
        List<Reservation> reservations = new ArrayList<>();
        for (Reservation reservation : reservationList) {
            if (reservation.getRestaurantId() == restaurantId) {
                reservations.add(reservation);
                System.out.println("Reservation with id " + reservation.getId() + " added");
            }
        }
        return reservations;
    }

    /**
     * Ažurira status rezervacije.
     * 
     * @param reservationId identifikator rezervacije
     * @param reservationStatus novi status rezervacije
     */
    public void updateReservation(int reservationId, ReservationStatus reservationStatus) {
        for (Reservation reservation : reservationList) {
            if (reservation.getId() == reservationId) {
                reservation.setStatus(reservationStatus);
                System.out.println("Reservation with id " + reservationId + " updated");
                break; // stop after first match
            }
        }
    }

    /**
     * Dohvaća sve rezervacije u sustavu.
     * 
     * @return lista svih rezervacija (defenzivna kopija)
     */
    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservationList); // defensive copy
    }

    /**
     * Učitava rezervacije iz datoteke u sustav.
     * Dodaje samo one rezervacije koje još nisu u sustavu.
     * 
     * @param reservationsFromFile lista rezervacija iz datoteke
     */
    public void loadReservations(List<Reservation> reservationsFromFile) {
        reservationsFromFile.stream()
                .filter(rFromFile -> reservationList.stream()
                        .noneMatch(r -> r.getId() == rFromFile.getId()))
                .forEach(reservationList::add);

        System.out.println("Reservation list loaded: " + reservationList.size() + " reservations");
    }
}
