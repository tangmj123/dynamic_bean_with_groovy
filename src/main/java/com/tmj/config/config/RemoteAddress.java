package com.tmj.config.config;

public class RemoteAddress{
    
    private int id;
    private String ip;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    @Override
    public String toString() {
        return "RemoteAddress [id=" + id + ", ip=" + ip + "]";
    }
}