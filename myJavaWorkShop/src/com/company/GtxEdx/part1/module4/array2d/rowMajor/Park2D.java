package com.georgiaEdx.part1.module4.array2d.rowMajor;

public class Park2D {
    public static void main(String[] args) {
        double[][] array2d ={{80,70,75},
                             {69,78,74,76}
                            };
        //int row1 = array2d.length;
        //System.out.println(row1);
        //System.out.println(array2d[row1].length);
        final double MIN_TEMP = 75;
        final double MAX_TEMP = 90;

        for(int row = 0; row < array2d.length; row++){
            for(int col = 0; col < array2d[row].length; col++){
                if((array2d[row][col]>= MIN_TEMP)&&
                        (array2d[row][col]<=MAX_TEMP)){
                    System.out.println("Go to the park.");
                }
            }
        }

        /*
        for (int col = 0; col < array2d[0].length; col++) {
            for (int row = 0; row < array2d.length; row++) {
                if ((array2d[row][col] >= MIN_TEMP) && (array2d[row][col] <= MAX_TEMP)) {
                    System.out.println("Go to the park.");
                }
            }

        }

         */
    }
}
