package model;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Klasa koja predstavlja korisnika u sustavu rezervacije restorana.
 * Implementira Serializable sučelje za serijalizaciju objekata.
 */
public class User implements Serializable{
    private int id = ThreadLocalRandom.current().nextInt(1, 999999);
    private String username;
    private String password;
    private int phoneNumber;
    private Role role;

    /**
     * Vraća string reprezentaciju korisnika.
     * 
     * @return korisničko ime kao string
     */
    @Override
    public String toString() {
        return username;
    }

    /**
     * Dohvaća ID korisnika.
     * 
     * @return jedinstveni identifikator korisnika
     */
    public int getId() {
        return id;
    }

    /**
     * Postavlja ID korisnika.
     * 
     * @param id jedinstveni identifikator korisnika
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Dohvaća korisničko ime.
     * 
     * @return korisničko ime
     */
    public String getUsername() {
        return username;
    }

    /**
     * Postavlja korisničko ime.
     * 
     * @param username korisničko ime
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Dohvaća broj mobitela korisnika.
     * 
     * @return broj mobitela
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Postavlja broj mobitela korisnika.
     * 
     * @param phoneNumber broj mobitela
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Dohvaća ulogu korisnika u sustavu.
     * 
     * @return uloga korisnika
     */
    public Role getRole() {
        return role;
    }

    /**
     * Postavlja ulogu korisnika u sustavu.
     * 
     * @param role uloga korisnika
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Dohvaća lozinku korisnika.
     * 
     * @return lozinka korisnika
     */
    public String getPassword() {
        return password;
    }

    /**
     * Postavlja lozinku korisnika.
     * 
     * @param password lozinka korisnika
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
