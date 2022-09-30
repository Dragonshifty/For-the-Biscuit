package com.dsstudios.biscuits;

import java.util.Random;

public class Matrices {

    public static int[][] matrix = new int[4][4];
    public int[][] compMatrix = new int[4][4];

    public void setMatrices(){

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < compMatrix.length; i++) {
            for (int j = 0; j < compMatrix[i].length; j++) {
                compMatrix[i][j] = random.nextInt(10);
            }
        }
    }
}
