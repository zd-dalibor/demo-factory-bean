package com.exacttarget.fuelsdk;

import java.util.Properties;

public class ETConfiguration {
    private Properties properties;

    public ETConfiguration() {
        properties = new Properties();
    }

    public String get(String key) {
        return (String) properties.get(key);
    }

    public void set(String key, String val) {
        properties.put(key, val);
    }
}
