package org.launchcode.codingevents.models;

public enum Cancelled {

    YES("Yes"),
    NO("No");

    private final String displayName;

    Cancelled(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}