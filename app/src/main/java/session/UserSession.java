package session;

import entities.users.User;

public class UserSession {

    private static UserSession instance;
    private User user;
    private boolean isLogin;

    private UserSession() {}

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void login(User user) {
        this.isLogin = true;
        this.user = user;
    }

    public void logout() {
        this.isLogin = false;
        this.user = null;
        instance = null;
    }

    public User getUser() {
        return this.user;
    }

    public boolean isLogin() {
        return isLogin;
    }


}
