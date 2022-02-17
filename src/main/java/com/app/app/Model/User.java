package com.app.app.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String email;
    private String password;
    private String user_role;
    
    public User() {
        super();
    }

    public User(int id, String username, String email, String password, String user_role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.user_role = user_role;
    }

    

    @Override
    public String toString() {
        return "User [email=" + email + ", id=" + id + ", password=" + password + ", user_role=" + user_role
                + ", username=" + username + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    

}
