package org.launchcode.codingevents.models;

public enum EventLocation {

    CONFERENCEROOM("Conference Room"),
    BALLROOM("Ballroom"),
    INAVANBYTHERIVER("IN A VAN!!!  DOWN BY THE RIVER!!!!!"),
    AREA51("Area 51"),
    STUDIO54("Studio 54");

    private final String displayName;

    EventLocation(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
