package com.practice;

public class State {
    private String code;
    private String city;

    public State() {
    }

    public State(String code, String city) {
        this.city = city;
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
