package com.github.onlyguo.nginx.conf;

import com.github.onlyguo.nginx.utils.PropertiesUtil;

import java.util.Properties;

/**
 * Profilo di classe pubblica
 * Common config content
 * @author gsk
 */
public interface Configer {

    Properties PROPERTIES = PropertiesUtil.read("conf.properties");

    /**
     * T
     * Language for application or UI display
     */
    String LANGUAGE = PROPERTIES.getOrDefault("language", "zh_cn").toString();

    /**
     * Percorso del file di configurazione di Nginx
     * Nginx config file path
     */
    String CONF_DIR = PROPERTIES.getProperty("conf.path");

    /**
     * Messaggi in diverse lingue
     * Message expression configuration in different languages
     */
    interface MESSAGE_TEMPLATE{
        Properties PROPERTIES = PropertiesUtil.read(LANGUAGE + ".properties");

        String CONF_ITEM_UNCHECKED_CAST = PROPERTIES.getProperty("CONF_ITEM_UNCHECKED_CAST");
        String CONF_ITEM_NOF_FOUNT_NAME = PROPERTIES.getProperty("CONF_ITEM_NOF_FOUNT_NAME");
        String CONF_ITEM_NAME_CAN_NOT_EMPTY = PROPERTIES.getProperty("CONF_ITEM_NAME_CAN_NOT_EMPTY");
    }


}
