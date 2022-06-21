/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dnfapp;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashMap;

/**
 *
 * @author Frans
 */
public class User extends Account implements Serializable{

    private String email;
    private HashMap<String, Package> History;

    public User(String username, String password,String email) {
        super(username, password);
        this.email = email;
        this.History = new HashMap<String, Package>();
    }

    public void addToHistory(String resi,Package newPackage){
        History.put(resi, newPackage);
    }

    public HashMap<String, Package> getHistory() {
        return History;
    }

    public void setHistory(HashMap<String, Package> History) {
        this.History = History;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
}
