package com.fitbit.weighttracker.common;

public class Utility {
    private static Utility utilityInstance = null;
    private Utility (){}
    public static Utility getInstance(){
        if(utilityInstance == null)
            utilityInstance = new Utility();

        return utilityInstance;
    }
}
