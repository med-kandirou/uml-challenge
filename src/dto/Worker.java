package dto;

import java.util.List;

public class Worker {
    private int id;
    private String registrationNumber;
    private String fname;
    private String lname;
    private String phoneNumber;
    private String email;
    private String login;
    private String password;
    private List<Phase> phases;
    public List<Phase> getPhases() {
        return phases;
    }

    public void setPhases(List<Phase> phases) {
        this.phases = phases;
    }
    
    public Worker() {
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
