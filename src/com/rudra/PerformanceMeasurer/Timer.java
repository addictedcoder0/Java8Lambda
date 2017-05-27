package com.rudra.PerformanceMeasurer;

/**
 * Created by abhishek.
 */
public class Timer {
    public static void code (Runnable codeblock){
        long start = System.nanoTime();
        try{
            codeblock.run();
        }catch (Exception ex){

        }finally {
            long end = System.nanoTime();
            System.out.println(" time taken : "+(end-start)/1.0e9);
        }
    }
}
