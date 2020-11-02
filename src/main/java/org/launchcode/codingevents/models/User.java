package org.launchcode.codingevents.models;

import javax.validation.constraints.NotNull;

public class User extends AbstractEntity{

    @NotNull
    private String userName;

    @NotNull
    private String pwHash;

    public User() { }

    public User(@NotNull String userName, @NotNull String pwHash) {
        this.userName = userName;
        this.pwHash = pwHash;
    }

    public String getUserName() {
        return userName;
    }

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

}
