package com.datpv134.convertobjecttojson;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    private int id;
    private boolean check;
    private List<User> users;
    private String msg;

    public Notification(int id, boolean check, List<User> users, String msg) {
        this.id = id;
        this.check = check;
        this.users = users;
        this.msg = msg;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
