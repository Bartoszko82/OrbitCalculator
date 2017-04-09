package com.bartoszko.App;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.CelestialBody;
import model.Kerbin;
import util.Orbit;
import util.VisViva;
import util.VisVivaImpl;

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
//        - Orbit builder
//        - handling with missing orbital data
//        - wrap my head around log
//        - ChosenBodyParams - loading default field values if not given new
        
        Logger logger = LogManager.getLogger();
        
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");;
        logger.error("error");
        logger.fatal("fatal");
        
        
    }
}
