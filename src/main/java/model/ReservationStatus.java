package model;

/**
 * Enumeracija koja predstavlja status rezervacije u sustavu.
 * Definira tri moguća stanja rezervacije: na čekanju, otkazana i završena.
 */
public enum ReservationStatus {
    /** Rezervacija čeka na potvrdu */
    PENDING, 
    /** Rezervacija je otkazana */
    CANCELLED, 
    /** Rezervacija je uspješno završena */
    COMPLETED
}
