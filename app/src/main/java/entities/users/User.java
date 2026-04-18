package entities.users;

import entities.Entity;

public class User extends Entity {

    private String email, password, lname, fname;
    private boolean expert;
    

    public User(int id, String email, String password, String lname, String fname, boolean expert) {
        super(id);
        this.email = email;
        this.expert = expert;
        this.password = password;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public boolean isExpert() {
        return this.expert;
    }

    public void setExpert(boolean expert) {
        this.expert = expert;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }


}
