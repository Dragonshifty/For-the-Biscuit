package com.dsstudios.biscuits;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15;
    private Button b16;

    private TextView hitText;
    private TextView missText;
    private TextView message;

    private TextView remainingText;
    private TextView currentLevelText;
    private TextView highScoreText;
    private TextView targetText;
    private TextView damageText;

    private TextView hitPointsText;
    private TextView roundText;

    boolean[] check;
//    int messageClear;
//    String computer;

    int comp;
    static int player;

    static int total = 50;
    static int round = 1;

    static int hit;
    static int miss;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);

        hitText = (TextView) findViewById(R.id.hitText);
        missText = (TextView) findViewById(R.id.missText);
        message = (TextView)  findViewById((R.id.message));

        remainingText = (TextView) findViewById(R.id.remainingText);
        currentLevelText = (TextView) findViewById(R.id.currentLevel);
        highScoreText = (TextView) findViewById(R.id.highScoreText);
        targetText = (TextView) findViewById(R.id.targetText);
        damageText = (TextView) findViewById((R.id.damageText));

        hitPointsText = (TextView) findViewById(R.id.hitPointsText);
        roundText = (TextView) findViewById(R.id.roundText);

        resetMatrices();

        b1.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[0][0];
            comp = Integer.parseInt(tempButton.getText().toString());
            b1.setTextColor(Color.parseColor("#9b2226"));
            b1.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b2.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[0][1];
            comp = Integer.parseInt(tempButton.getText().toString());
            b2.setTextColor(Color.parseColor("#9b2226"));
            b2.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b3.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[0][2];
            comp = Integer.parseInt(tempButton.getText().toString());
            b3.setTextColor(Color.parseColor("#9b2226"));
            b3.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b4.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[0][3];
            comp = Integer.parseInt(tempButton.getText().toString());
            b4.setTextColor(Color.parseColor("#9b2226"));
            b4.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b5.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[1][0];
            comp = Integer.parseInt(tempButton.getText().toString());
            b5.setTextColor(Color.parseColor("#9b2226"));
            b5.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b6.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[1][1];
            comp = Integer.parseInt(tempButton.getText().toString());
            b6.setTextColor(Color.parseColor("#9b2226"));
            b6.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b7.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[1][2];
            comp = Integer.parseInt(tempButton.getText().toString());
            b7.setTextColor(Color.parseColor("#9b2226"));
            b7.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b8.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[1][3];
            comp = Integer.parseInt(tempButton.getText().toString());
            b8.setTextColor(Color.parseColor("#9b2226"));
            b8.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b9.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[2][0];
            comp = Integer.parseInt(tempButton.getText().toString());
            b9.setTextColor(Color.parseColor("#9b2226"));
            b9.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b10.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[2][1];
            comp = Integer.parseInt(tempButton.getText().toString());
            b10.setTextColor(Color.parseColor("#9b2226"));
            b10.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b11.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[2][2];
            comp = Integer.parseInt(tempButton.getText().toString());
            b11.setTextColor(Color.parseColor("#9b2226"));
            b11.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b12.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[2][3];
            comp = Integer.parseInt(tempButton.getText().toString());
            b12.setTextColor(Color.parseColor("#9b2226"));
            b12.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b13.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[3][0];
            comp = Integer.parseInt(tempButton.getText().toString());
            b13.setTextColor(Color.parseColor("#9b2226"));
            b13.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b14.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[3][1];
            comp = Integer.parseInt(tempButton.getText().toString());
            b14.setTextColor(Color.parseColor("#9b2226"));
            b14.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b15.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[3][2];
            comp = Integer.parseInt(tempButton.getText().toString());
            b15.setTextColor(Color.parseColor("#9b2226"));
            b15.setEnabled(false);
            clearMessage();
            runLogic();
        });

        b16.setOnClickListener((View v) -> {
            Button tempButton = (Button) v;
            player = Matrices.matrix[3][3];
            comp = Integer.parseInt(tempButton.getText().toString());
            b16.setTextColor(Color.parseColor("#9b2226"));
            b16.setEnabled(false);
            clearMessage();
            runLogic();
        });

//        b1.setOnClickListener((View v) -> {
//            Button tempButton = (Button) v;
//            player = Matrices.matrix[0][0];
//            comp = Integer.parseInt(tempButton.getText().toString());
//            b1.setEnabled(false);
//            runLogic();
//        });
    }

    public void resetMatrices(){
        Matrices mat = new Matrices();
        mat.setMatrices();

//        roundText.setText(String.valueOf(Brains.roundMain));
        setDisplay();

        b1.setText(String.valueOf(mat.compMatrix[0][0]));
        b2.setText(String.valueOf(mat.compMatrix[0][1]));
        b3.setText(String.valueOf(mat.compMatrix[0][2]));
        b4.setText(String.valueOf(mat.compMatrix[0][3]));
        b5.setText(String.valueOf(mat.compMatrix[1][0]));
        b6.setText(String.valueOf(mat.compMatrix[1][1]));
        b7.setText(String.valueOf(mat.compMatrix[1][2]));
        b8.setText(String.valueOf(mat.compMatrix[1][3]));
        b9.setText(String.valueOf(mat.compMatrix[2][0]));
        b10.setText(String.valueOf(mat.compMatrix[2][1]));
        b11.setText(String.valueOf(mat.compMatrix[2][2]));
        b12.setText(String.valueOf(mat.compMatrix[2][3]));
        b13.setText(String.valueOf(mat.compMatrix[3][0]));
        b14.setText(String.valueOf(mat.compMatrix[3][1]));
        b15.setText(String.valueOf(mat.compMatrix[3][2]));
        b16.setText(String.valueOf(mat.compMatrix[3][3]));

        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        b15.setEnabled(true);
        b16.setEnabled(true);
    }

    public void clearMessage(){
        if (message.getText() != ""){
            message.setText("");
        }
    }

    public void setDisplay(){
        hitText.setText(String.valueOf(hit));
        missText.setText(String.valueOf(miss));
        hitPointsText.setText(String.valueOf(total));
        roundText.setText(String.valueOf(Brains.roundMain));
        remainingText.setText(String.valueOf(Brains.totalHighScoreStore));

//        currentLevelText.setText(String.valueOf(Brains.level));
//        if (messageClear == 2){
//            messageClear++;
//        } else if (messageClear == 3){
//            message.setText("");
//            messageClear = 1;
//        }
//        switch (messageClear){
//            case 0:
//                messageClear++;
//                break;
//            case 1:
//                messageClear++;
//                break;
//            default:
//                message.setText("");
//                messageClear = 0;
//                break;
//        }

        switch (Brains.level) {
            case 1:
                targetText.setText("30");
                currentLevelText.setText("Vanilla Cream");
                break;
            case 2:
                targetText.setText("40");
                currentLevelText.setText("Wealthy Tea");
                break;
            case 3:
                targetText.setText("50");
                currentLevelText.setText("BobNob");
                break;
            case 4:
                targetText.setText("60");
                currentLevelText.setText("Wealthy Tea");
                break;
            case 5:
                targetText.setText("70");
                currentLevelText.setText("GarriWigHead");
                break;
            case 6:
                targetText.setText("80");
                currentLevelText.setText("Jammy Evader");
                break;
            case 7:
                targetText.setText("90");
                currentLevelText.setText("Pink Leopard");
                break;
            default:
                targetText.setText("???");
                currentLevelText.setText("BISCUITS!");
                break;
        }

        b1.setTextColor(Color.parseColor("#FFFFFFFF"));
        b2.setTextColor(Color.parseColor("#FFFFFFFF"));
        b3.setTextColor(Color.parseColor("#FFFFFFFF"));
        b4.setTextColor(Color.parseColor("#FFFFFFFF"));
        b5.setTextColor(Color.parseColor("#FFFFFFFF"));
        b6.setTextColor(Color.parseColor("#FFFFFFFF"));
        b7.setTextColor(Color.parseColor("#FFFFFFFF"));
        b8.setTextColor(Color.parseColor("#FFFFFFFF"));
        b9.setTextColor(Color.parseColor("#FFFFFFFF"));
        b10.setTextColor(Color.parseColor("#FFFFFFFF"));
        b11.setTextColor(Color.parseColor("#FFFFFFFF"));
        b12.setTextColor(Color.parseColor("#FFFFFFFF"));
        b13.setTextColor(Color.parseColor("#FFFFFFFF"));
        b14.setTextColor(Color.parseColor("#FFFFFFFF"));
        b15.setTextColor(Color.parseColor("#FFFFFFFF"));
        b16.setTextColor(Color.parseColor("#FFFFFFFF"));
    }

    public void runLogic(){
        Brains brain = new Brains(comp, player);
        check = brain.run(); // Returns a boolean array for hit/miss, hits < 5, miss < 5

        hitPointsText.setText(String.valueOf(total));
        hitText.setText(String.valueOf(hit));
        missText.setText(String.valueOf(miss));

        // On successful hit and above a 5, apply hit points
        if (check[0]) {

            if (comp >= 5) {
                switch(comp) {
                    case 5:
                        if (Brains.bonusBiscuit == 3){
                            damageText.setText("Hit +10!");
                            message.setText("Bonus Biscuit!!");
                            Brains.totalHighScoreStore += 10;
                        } else {
                            damageText.setText("Hit! +5");
                            Brains.totalHighScoreStore += 5;
                        }
                        break;
                    case 6:
                        if (Brains.bonusBiscuit == 3){
                            damageText.setText("Hit +12!");
                            message.setText("Bonus Biscuit!!");
                            Brains.totalHighScoreStore += 12;
                        } else {
                            damageText.setText("Hit! +5");
                            Brains.totalHighScoreStore += 6;
                        }
                        break;
                    case 7:
                        if (Brains.bonusBiscuit == 3){
                            damageText.setText("Hit +14!");
                            message.setText("Bonus Biscuit!!");
                            Brains.totalHighScoreStore += 14;
                        } else {
                            damageText.setText("Hit! +7");
                            Brains.totalHighScoreStore += 7;
                        }
                        break;
                    case 8:
                        if (Brains.bonusBiscuit == 3){
                            damageText.setText("Crit +32!");
                            message.setText("Bonus Biscuit!!");
                            Brains.totalHighScoreStore += 32;
                        } else {
                            damageText.setText("Hit! +16");
                            Brains.totalHighScoreStore += 16;
                        }
                        break;
                    case 9:
                        if (Brains.bonusBiscuit == 3){
                            damageText.setText("Crit! +40!");
                            message.setText("Bonus Biscuit!!");
                            Brains.totalHighScoreStore += 40;
                        } else {
                            damageText.setText("Hit! +20");
                            Brains.totalHighScoreStore += 20;
                        }
                        break;
                }
            } else {
                // Successful hit but under 5 so deduct hit points with difference
                String hitAmount = String.valueOf(player - comp);
                damageText.setText("Hit! -" + hitAmount);
                Brains.totalHighScoreStore -= player - comp;
            }
            remainingText.setText(String.valueOf(Brains.totalHighScoreStore));
        } else if (!check[0]) {
            // Miss, deduct hit points
            switch (comp) {
                // Deduct points, progressively fewer for higher risk numbers
                case 5:
                    damageText.setText("Miss! -8");
                    Brains.totalHighScoreStore -= 8;
                    break;
                case 6:
                    damageText.setText("Miss! -6");
                    Brains.totalHighScoreStore -= 6;
                    total -= 8;
                    break;
                case 7:
                    damageText.setText("Miss! -5");
                    Brains.totalHighScoreStore -= 5;
                    total -= 6;
                    break;
                case 8:
                    damageText.setText("Miss! -4");
                    Brains.totalHighScoreStore -= 4;
                    total -= 5;
                    break;
                case 9:
                    damageText.setText("Miss! -3");
                    Brains.totalHighScoreStore -= 3;
                    total -= 4;
                    break;
                default:
                    damageText.setText("Miss! -10");
                    Brains.totalHighScoreStore -= 10;
                    break;
            }
            // Display highscore
            remainingText.setText(String.valueOf(Brains.totalHighScoreStore));
        }

        if (miss > 4 | total <= 0) {
            // Miss and five misses in a row. Reset board.
            message.setText("Game Over!");
            hit=0;
            miss=0;
            total=50;
            Brains.totalMain = 50;
            Brains.roundMain = 1;
            Brains.totalHighScoreStore = 135;
            resetMatrices();
//            setDisplay();
        }

        if (hit > 4 & round != 3 & total > 0) {
            // Five successful hits, not the final round, and hit points not negative
            hit=0;
            miss=0;
            Brains.totalMain -= 5; // Reduce round hit points by five
            Brains.roundMain++; // Increment round
            if (Brains.roundMain == 4) {
                // Three rounds cleared, run level logic
                boolean levelCheck = brain.checkLevel();
                String levelText = "Excellent! On to level: " + Brains.level;
                if (Brains.totalHighScore == 8) {
                    message.setText("You've completed the game!!");
//                    setDisplay();
//                    total++;
                } else if (levelCheck) {
                    message.setText(levelText);
//                    setDisplay();
                } else {
                    message.setText("No Biscuit!");
//                    setDisplay();
                }
                // reset
                total=50;
                Brains.totalMain = 50;
                Brains.roundMain = 1;
                // Check highscore and overwrite if new highscore higher
                if (Brains.totalHighScoreStore > Brains.totalHighScore) {
                    Brains.totalHighScore = Brains.totalHighScoreStore;
                }
                Brains.totalHighScoreStore = 135;
                resetMatrices();
//                setDisplay();
            } else {
                message.setText("On to the next round!");
                if (Brains.totalMain == 45) {
                    total = 45;
//                    setDisplay();
                } else {
                    total = 40;
//                    setDisplay();
                }
                resetMatrices();
//                setDisplay();
            }
        }
    }
}