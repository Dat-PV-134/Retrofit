package com.datpv134.convertobjecttojson.model;

import java.util.List;

public class Notification {
    private int id;
    private boolean check;
    private String msg;
    private List<User> users;

    public Notification(int id, boolean check, String msg, List<User> users) {
        this.id = id;
        this.check = check;
        this.msg = msg;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
