package com.bartoszko.app;


import javax.swing.plaf.synth.SynthSpinnerUI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bartoszko.model.CelestialBody;
import com.bartoszko.model.ChosenBody;
import com.bartoszko.model.KerbinTempForTest;
import com.bartoszko.model.Orbit;
import com.bartoszko.model.OrbitingBody;
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
//        - ChosenBody/CelestialBody/Bodies - add field name, unify variable types, add missing setters and final fields where applicable 
//        - handling with missing orbital data - partly done, rethink
//        - ChosenBodyParams - loading default field values if not given new
        
        
//        Logger logger = LogManager.getLogger();
//        logger.trace("trace");
//        logger.debug("debug");
//        logger.info("info");
//        logger.warn("warn");;
//        logger.error("error");
//        logger.fatal("fatal");
    }
}
