package com.cphjs284;
/*
 * MinMax
 */
public class MinMax {

    public int[] FindMinMax(String[] args) {
        
        int mi, ma;
        if(args.length < 2){
            System.out.println("Invalid number of arguments given - must be two or more");
            return new int[]{};
        }else{
            try {
                mi = ma = Integer.parseInt(args[0]);    
         
                for (int i = 1; i < args.length; i++) {
                    int obs = Integer.parseInt(args[i]);
                    if (obs > ma) {
                        ma = obs;
                    }else{
                        if (obs < mi) {
                            mi = obs;
                        }
                    }
                }
                System.out.println("Min : " + mi + " Max : "+ ma);
                return new int[]{mi,ma};
         
            } catch (NumberFormatException e) {
                System.out.println("Input must be numbers.");
                throw new NumberFormatException(e.getMessage());
            }
        }

    }
}