package com.dsstudios.biscuits;

import java.util.Random;

public class Brains {

    private int comp;
    private int player;
    boolean[] check = new boolean[3];

    public static int totalMain = 50;
    public static int roundMain = 1;
    public static int totalHighScore;
    public static int totalHighScoreStore = 135;
    public static int level = 1;
    public static int bonusBiscuit;

    public Brains(int comp, int player) {
        this.comp = comp;
        this.player = player;
    }

    public boolean[] run(){
        Random random = new Random();
        bonusBiscuit = random.nextInt(4);

        if (player > comp & comp < 5) {
            // Check for successful hit and if it's below 5
            int temp = player - comp;
            MainActivity.total -= temp;
            check[0] = true;
            if (MainActivity.hit < 5){
                MainActivity.hit++;
                check[1] = false;
            } else if (MainActivity.hit >= 5){
                check[1] = true;
            }
        } else if (player > comp & comp >= 5) {
            // Check for successful hit and if it's 5 or above
            switch(comp) {
                case 5:
                    if (bonusBiscuit == 3){
                        MainActivity.total += 10;
                    } else {
                        MainActivity.total += 5;
                    }
                    break;
                case 6:
                    if (bonusBiscuit == 3) {
                        MainActivity.total += 12;
                    } else {
                        MainActivity.total += 6;
                    }
                    break;
                case 7:
                    if (bonusBiscuit == 3) {
                        MainActivity.total += 14;
                    } else {
                        MainActivity.total += 7;
                    }
                    break;
                case 8:
                    if (bonusBiscuit == 3) {
                        MainActivity.total += 32;
                    } else {
                        MainActivity.total += 16;
                    }
                case 9:
                    if (bonusBiscuit == 3) {
                        MainActivity.total += 20;
                    } else {
                        MainActivity.total += 40;
                    }
            }
            // Boolean for successful hit
            check[0] = true;

            if (MainActivity.hit < 5){
                MainActivity.hit++;
                check[1] = false;
            } else if (MainActivity.hit >= 5){
                check[1] = true;
            }
        } else {
            // Miss
            switch (comp) {
                // Deduct points, progressively less for higher risk numbers
                case 5:
                    MainActivity.total -= 8;
                    break;
                case 6:
                    MainActivity.total -= 6;
                    break;
                case 7:
                    MainActivity.total -= 5;
                    break;
                case 8:
                    MainActivity.total -= 4;
                    break;
                case 9:
                    MainActivity.total -= 3;
                    break;
                default:
                    MainActivity.total -= 10;
            }


            check[0] = false;
            if (MainActivity.miss < 5) {
                MainActivity.miss++;
                check[2] = false;
            } else {
                check[2] = true;
            }
        }
        // Returns a boolean array for hit/miss, hits < 5, miss < 5
        return check;
    }

    public boolean checkLevel() {
        switch (level) {
            case 1:
                if (totalHighScoreStore > 30) {
                    level++;
                    return true;
                }
            case 2:
                if (totalHighScoreStore > 40) {
                    level++;
                    return true;
                }
            case 3:
                if (totalHighScoreStore > 50) {
                    level++;
                    return true;
                }
            case 4:
                if (totalHighScoreStore > 60) {
                    level++;
                    return true;
                }
            case 5:
                if (totalHighScoreStore > 70) {
                    level++;
                    return true;
                }
            case 6:
                if (totalHighScoreStore > 80) {
                    level++;
                    return true;
                }
            case 7:
                if (totalHighScoreStore > 90) {
                    level++;
                    return true;
                }
            default:
                return false;
        }
    }

}
