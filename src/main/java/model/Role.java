package model;

/**
 * Enumeracija koja predstavlja različite uloge korisnika u sustavu.
 * Definira tri glavne uloge: korisnik, restoran i administrator.
 */
public enum Role {
    /** Standardni korisnik koji može rezervirati stolove */
    USER, 
    /** Restoran koji može upravljati rezervacijama */
    RESTAURANT, 
    /** Administrator s punim pristupom sustavu */
    ADMIN
}
