package com.github.Ukasz09.ticTacToeTDD.applicationLogic;

public class Logger {

    public static void logError(Class classInWithError, String info) {
        System.err.println(classInWithError.getSimpleName() + "-> Error: " + info);
    }

}