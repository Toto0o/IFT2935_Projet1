package status;

public enum LoginStatus {
    SUCCESS("Success!"),
    USERNAME_NOT_FOUND("Username not found"),
    PASSWORD_ERROR("Incorrect password");

    private final String displayName;

    LoginStatus(String s) {
        this.displayName = s;
    }

    private String getDisplayName() {
        return this.displayName;
    }

    @Override
    public String toString() {
        return getDisplayName();
    }
}
