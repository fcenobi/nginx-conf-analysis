package com.github.onlyguo.nginx.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Properties Classe dello strumento di manipolazione dei file
 * Properties file manager util
 * @author gsk
 */
public class PropertiesUtil {


    /**
     *Leggi il file Proprietà sotto il percorso specificato
     * Read properties file in the path
     * @param path
     *      Percorso del file delle proprietà
     *      Properties file path
     * @return
     */
    public static Properties read(String path){
        Properties properties = new Properties();
        try (InputStream stream = PropertiesUtil.class.getClassLoader().getResourceAsStream(path)){
            properties.load(stream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

}
