package io.ascending.training.model;

public class Users {
    private long id;
    private String nikename;
    private String password;
    private String email;
    private String first_name;
    private String last_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_Name() {
        return first_name;
    }

    public void setFirst_Name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_Name() {
        return last_name;
    }

    public void setLast_Name(String last_name) {
        this.last_name = last_name;
    }
}
