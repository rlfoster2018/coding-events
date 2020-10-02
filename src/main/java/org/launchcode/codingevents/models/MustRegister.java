package org.launchcode.codingevents.models;

public enum MustRegister {

    YES("Yes"),
    NO("No");

    private final String displayName;

    MustRegister(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
