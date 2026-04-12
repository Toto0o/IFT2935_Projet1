package entities.users;

import entities.Entity;

public class User extends Entity {

    private String email, password, lname, fname;
    private boolean expert;
    

    public User(int id, String email, boolean expert) {
        super(id);
        this.email = email;
        this.expert = expert;
        //this.password = password;
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

}
