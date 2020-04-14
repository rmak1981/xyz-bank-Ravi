package com.bank.loadproperty;/*
Ravi's Creation
Date of Creation :-
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

    //project path
    String projectpath = System.getProperty("user.dir");
    //creating object
    static Properties prop;
    static FileInputStream input;
    // parameter given as "String key" to assign value of key form .config file
    public String getProperty(String key) {
        //initialise the object
        prop = new Properties();
        //to catch exception thrown by FileInputStream
        try {
            input = new FileInputStream(projectpath + "/src/test/java/com/bank/resources/properties/Config.Properties");
            prop.load(input); // copy  content root path from properties - config file and paste up after + " project wise diff"

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

}
