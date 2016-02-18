package com.github.uuidcode.yaml;

public class Config {
    private Database database;

    public Database getDatabase() {
        return this.database;
    }

    public Config setDatabase(Database database) {
        this.database = database;
        return this;
    }
}
