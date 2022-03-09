package com.example.demo;

import com.exacttarget.fuelsdk.ETConfiguration;
import org.springframework.beans.factory.FactoryBean;

import java.util.Map;

public class ETConfigurationFactory implements FactoryBean<ETConfiguration> {

    private Map<String, String> properties;

    @Override
    public ETConfiguration getObject() throws Exception {
        ETConfiguration etConfiguration = new ETConfiguration();
        if (properties != null) {
            for (String key : properties.keySet()) {
                etConfiguration.set(key, properties.get(key));
            }
        }
        return etConfiguration;
    }

    @Override
    public Class<?> getObjectType() {
        return ETConfiguration.class;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
