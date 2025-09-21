package model.services;

import model.Role;
import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Servisna klasa za upravljanje korisnicima u sustavu.
 * Omogućuje dodavanje, uklanjanje, pretraživanje i autentifikaciju korisnika.
 */
public class UserService {
    private final Map<String, User> userMap = new HashMap<>();

    /**
     * Dodaje novog korisnika u sustav.
     * 
     * @param user korisnik kojeg dodajemo
     */
    public void addUser(User user) {
        userMap.put(user.getUsername(), user);
        System.out.println("User " + user.getUsername() + " added");
    }

    /**
     * Uklanja korisnika iz sustava.
     * 
     * @param username korisničko ime korisnika kojeg uklanjamo
     */
    public void removeUser(String username) {
        userMap.remove(username);
        System.out.println("User " + username + " removed");
    }

    /**
     * Dohvaća korisnika po korisničkom imenu.
     * 
     * @param username korisničko ime
     * @return korisnik s danim korisničkim imenom ili null ako ne postoji
     */
    public User getUserByUsername(String username) {
        System.out.println("User " + username + " found");
        return userMap.get(username);
    }

    /**
     * Pokušava prijavu korisnika s danim podacima.
     * 
     * @param username korisničko ime
     * @param password lozinka
     * @return true ako su podaci točni, false inače
     */
    public boolean attemptLogin(String username, String password) {
        if (userMap.containsKey(username)) {
            User user = userMap.get(username);
            return user.getPassword().equals(password);
        } else {
            return false;
        }
    }

    /**
     * Dohvaća listu svih korisnika s ulogom restorana.
     * 
     * @return lista korisnika s ulogom RESTAURANT
     */
    public List<User> getAllUsersWithRestaurantRole() {
        List<User> users = new ArrayList<>();

        for (Map.Entry<String, User> entry : userMap.entrySet()) {
            if (entry.getValue().getRole() == Role.RESTAURANT) {
                users.add(entry.getValue());
            }
        }
        System.out.println("Users found: " + users.size());
        return users;
    }
}
