package com.github.uuidcode.yaml;

public class Database {
    private String url;
    private String driver;

    public String getDriver() {
        return this.driver;
    }

    public Database setDriver(String driver) {
        this.driver = driver;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public Database setUrl(String url) {
        this.url = url;
        return this;
    }
}
