package br.edu.ifnmg.credential;

import br.edu.ifnmg.entity.Entity;
import br.edu.ifnmg.user.User;

import java.time.LocalDate;

public class Credential extends Entity {

    private String username;
    private String password;
    private LocalDate lastAccess;
    private Boolean enabled;
    private User user;

    public Credential() {
        setEnabled(null);
    }

    public Credential(Long id, String username, String password, LocalDate lastAccess, Boolean enabled, User user)
            throws Exception {
//        this.id = id;
        setId(id);

//        this.username = username;
        setUsername(username);  // Security problem!

//        this.password = passwords;
        setPassword(password);  // Security problem!

//        this.lastAcess = lastAcess;
        setLastAccess(lastAccess);  // Security problem!

//        this.enabled = enabled;
        setEnabled(enabled);  // Security problem!

//        this.user = user;
        setUser(user);  // Security problem!
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws Exception {
        if (username.equals("")) {
            throw new IllegalArgumentException("Credencial: nome de usuario nulo");
        } else if (username.length() > 15) {
            throw new IllegalArgumentException("Credencial: O nome de usuario excede 15 caracteres");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        this.password = password;
    }

    public LocalDate getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(LocalDate lastAccess) {
        this.lastAccess = lastAccess;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        if (enabled == null) {
            this.enabled = true;
            return;
        }
        this.enabled = enabled;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Credential{" + "username=" + username
                + ", password=" + password
                + ", lastAccess=" + lastAccess
                + ", enabled=" + enabled
                + ", user=" + user
                + '}';
    }

}
