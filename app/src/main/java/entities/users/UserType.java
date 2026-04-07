package entities.users;

public enum UserType {
    ANNOUNCER("annonceur"),
    BUYER("acheteur"),
    EXPERT("expert");

    private final String displayName;

    UserType(String s) {
        this.displayName = s;
    }

    private String getDisplayName() {
        return this.displayName;
    }

    @Override
    public String toString() {
        return getDisplayName();
    }

    public UserType getUserType(String type) {
        UserType ut = null;
        for (UserType userType : UserType.values()) {
            if (userType.toString().equals(type)) {
                ut = userType;
            }
        }
        return ut;
    }

}
