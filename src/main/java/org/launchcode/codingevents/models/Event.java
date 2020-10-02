package org.launchcode.codingevents.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and  50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long.")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message="Invalid E-Mail. Try again.")
    private String contactEmail;

    private EventType type;

    private EventLocation location;

    private MustRegister register;

    @NotBlank(message = "Attendance is required")
    private String attendance;

    private Cancelled cancelled;

    public Event(String name, String description, String contactEmail, EventType type, EventLocation location, MustRegister register, String attendance, Cancelled cancelled) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
        this.location = location;
        this.register = register;
        this.attendance = attendance;
        this.cancelled = cancelled;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public EventLocation getLocation() {
        return location;
    }

    public void setLocation(EventLocation location) {
        this.location = location;
    }

    public MustRegister getRegister() {
        return register;
    }

    public void setRegister(MustRegister register) {
        this.register = register;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public Cancelled getCancelled() {
        return cancelled;
    }

    public void setCancelled(Cancelled cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
