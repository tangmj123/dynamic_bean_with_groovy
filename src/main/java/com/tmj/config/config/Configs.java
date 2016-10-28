package com.tmj.config.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="connection"/*,locations={"classpath:application2.yml"}*/)
//@Component
public class Configs {

    private List<RemoteAddress> remoteAddress;
    private List<String> username;
    
    public List<RemoteAddress> getRemoteAddress() {
        return remoteAddress;
    }
    public void setRemoteAddress(List<RemoteAddress> remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
    public List<String> getUsername() {
        return username;
    }
    public void setUsername(List<String> username) {
        this.username = username;
    }
    @Override
    public String toString() {
        return "Configs [remoteAddress=" + remoteAddress + ", username=" + username + "]";
    }
    
}