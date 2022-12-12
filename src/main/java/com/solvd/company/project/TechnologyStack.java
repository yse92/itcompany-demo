package com.solvd.company.project;

public final class TechnologyStack {
    private String language;
    private String framework;
    private String database;

    public TechnologyStack() {
    }

    public TechnologyStack(String language, String framework, String database) {
        this.language = language;
        this.framework = framework;
        this.database = database;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
}
