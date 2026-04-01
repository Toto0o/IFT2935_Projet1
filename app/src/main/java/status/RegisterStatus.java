package status;

public enum RegisterStatus {
    USERNAME_ALREADY_REGISTERED("Username already registered"),
    REGISTERED("Registered"),;

    private final String displayName;

    RegisterStatus(String s) {
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
