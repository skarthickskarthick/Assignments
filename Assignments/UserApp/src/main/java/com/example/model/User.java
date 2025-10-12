
package com.example.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private boolean is_admin;

    public int getId(){ return id; }
    public void setId(int id){ this.id = id; }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = email; }
    public String getPassword(){ return password; }
    public void setPassword(String passwordHash){ this.password = passwordHash; }
    public String getPhone(){ return phone; }
    public void setPhone(String phone){ this.phone = phone; }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }
}
