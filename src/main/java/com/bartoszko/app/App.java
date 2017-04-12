package com.bartoszko.app;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bartoszko.model.CelestialBody;
import com.bartoszko.model.Kerbin;
import com.bartoszko.model.Orbit;
import com.bartoszko.util.VisViva;
import com.bartoszko.util.VisVivaImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Orbit Calculator for Kerbal Space Program" );
        
        //TODO
//        - rethink/unify variable types
//        - ChosenBodyParams > singelton
//        - handling with missing orbital data - partly done, rethink
//        - ChosenBodyParams - loading default field values if not given new
        
        Logger logger = LogManager.getLogger();
        
//        logger.trace("trace");
//        logger.debug("debug");
//        logger.info("info");
//        logger.warn("warn");;
//        logger.error("error");
//        logger.fatal("fatal");
        
        
        
    }
}
