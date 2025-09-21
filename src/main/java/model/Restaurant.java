package model;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Klasa koja predstavlja restoran u sustavu rezervacije.
 * Implementira Serializable sučelje za serijalizaciju objekata.
 */
public class Restaurant implements Serializable {
private int id = ThreadLocalRandom.current().nextInt(1, 999999);
    private int username;
    private String name;
    private String address;
    private String phone;
    private User manager;

    /**
     * Dohvaća menadžera restorana.
     * 
     * @return korisnik koji upravlja restoranom
     */
    public User getManager() {
        return manager;
    }

    /**
     * Postavlja menadžera restorana.
     * 
     * @param manager korisnik koji će upravljati restoranom
     */
    public void setManager(User manager) {
        this.manager = manager;
    }

    /**
     * Vraća string reprezentaciju restorana.
     * 
     * @return naziv restorana
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Dohvaća korisničko ime restorana.
     * 
     * @return korisničko ime
     */
    public int getUsername() {
        return username;
    }

    /**
     * Postavlja korisničko ime restorana.
     * 
     * @param username korisničko ime
     */
    public void setUsername(int username) {
        this.username = username;
    }

    /**
     * Dohvaća ID restorana.
     * 
     * @return jedinstveni identifikator restorana
     */
    public int getId() {
        return id;
    }

    /**
     * Postavlja ID restorana.
     * 
     * @param id jedinstveni identifikator restorana
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Dohvaća naziv restorana.
     * 
     * @return naziv restorana
     */
    public String getName() {
        return name;
    }

    /**
     * Postavlja naziv restorana.
     * 
     * @param name naziv restorana
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Dohvaća adresu restorana.
     * 
     * @return adresa restorana
     */
    public String getAddress() {
        return address;
    }

    /**
     * Postavlja adresu restorana.
     * 
     * @param address adresa restorana
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Dohvaća telefonski broj restorana.
     * 
     * @return telefonski broj
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Postavlja telefonski broj restorana.
     * 
     * @param phone telefonski broj
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
