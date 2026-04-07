package entities.users;

import entities.Entity;

public class User extends Entity {

    private String username, password;
    private UserType userType;

    public User(int id, String username, UserType userType) {
        super(id);
        this.username = username;
        this.userType = userType;
        //this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserType getType() {
        return this.userType;
    }

    public void setType(UserType type) {
        this.userType = type;
    }

}
