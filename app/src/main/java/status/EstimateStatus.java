package status;

import entities.Estimate;

import java.io.Serializable;

public enum EstimateStatus {
    NO_ESTIMATE("No estimate"),
    ESTIMATED("New estimate"),
    REFUSED("Refused"),
    ACCEPTED("Accepted");

    private final String displayName;

    EstimateStatus(String s) {
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
