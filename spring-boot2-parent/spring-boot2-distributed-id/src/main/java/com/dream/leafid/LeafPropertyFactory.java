package com.dream.leafid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * @author 20172462
 */
public class LeafPropertyFactory {
    private static final Logger logger = LoggerFactory.getLogger(LeafPropertyFactory.class);
    private static final Properties prop = new Properties();

    static {
        try {
            prop.load(LeafPropertyFactory.class.getClassLoader().getResourceAsStream("leaf.properties"));
        } catch (IOException e) {
            logger.warn("Load Properties Ex", e);
        }
    }

    public static Properties getProperties() {
        return prop;
    }
}
