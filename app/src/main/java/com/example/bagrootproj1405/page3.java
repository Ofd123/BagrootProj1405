package com.example.bagrootproj1405;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class page3 extends AppCompatActivity
{
    TextView hebrewGrade,litertureGrade,historyGrade,citizenshipGrade,bibleGrade;
    TextView mathPoints,englishPoints,mathGrade,englishGrade;
    TextView firstReinforcement,firstReinforcementPoints,firstReinforcementGrade,secondReinforcement,secondReinforcementPoints,secondReinforcementGrade,thirdReinforcement,thirdReinforcementPoints,thirdReinforcementGrade;
    TextView sumGradestv,averagestv,name;
    int hebrew,literture,history,citizenship,bible,mathAmountOfPoints,mathScore,englishAmountOfPoints,englishScore,firstReinforcementAmountOfPoints,firstReinforcementScore,secondReinforcementAmountOfPoints,secondReinforcementScore,thirdReinforcementAmountOfPoints,thirdReinforcementScore;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        hebrewGrade = findViewById(R.id.hebrewGrade);
        litertureGrade = findViewById(R.id.litertureGrade);
        historyGrade = findViewById(R.id.historyGrade);
        citizenshipGrade = findViewById(R.id.citizenshipGrade);
        bibleGrade = findViewById(R.id.bibleGrade);
        mathPoints = findViewById(R.id.mathPoints);
        mathGrade = findViewById(R.id.mathGrade);
        englishPoints = findViewById(R.id.englishPoints);
        englishGrade = findViewById(R.id.englishGrade);
        firstReinforcement = findViewById(R.id.firstReinforcement);
        firstReinforcementPoints = findViewById(R.id.firstReinforcementPoints);
        firstReinforcementGrade = findViewById(R.id.firstReinforcementGrade);
        secondReinforcement = findViewById(R.id.secondReinforcement);
        secondReinforcementPoints = findViewById(R.id.secondReinforcementPoints);
        secondReinforcementGrade = findViewById(R.id.secondReinforcementGrade);
        thirdReinforcement = findViewById(R.id.thirdReinforcement);
        thirdReinforcementPoints = findViewById(R.id.thirdReinforcementPoints);
        thirdReinforcementGrade = findViewById(R.id.thirdReinforcementGrade);
        sumGradestv = findViewById(R.id.sumGrades);
        averagestv = findViewById(R.id.averages);
        name = findViewById(R.id.name);

        Intent page2 = getIntent();
        hebrew = page2.getIntExtra("hebrew",1);
        literture = page2.getIntExtra("literture",1);
        history = page2.getIntExtra("history",1);
        citizenship = page2.getIntExtra("citizenship",1);
        bible = page2.getIntExtra("bible",1);
        mathAmountOfPoints = page2.getIntExtra("mathPoints",1);
        mathScore = page2.getIntExtra("mathGrade",1);
        englishAmountOfPoints = page2.getIntExtra("englishPoints",1);
        englishScore = page2.getIntExtra("englishGrade",1);
        firstReinforcementAmountOfPoints = page2.getIntExtra("firstReinforcmentPoints",1);
        firstReinforcementScore = page2.getIntExtra("firstReinformentGrade",1);
        secondReinforcementAmountOfPoints = page2.getIntExtra("secondReinforcementPoints",1);
        secondReinforcementScore = page2.getIntExtra("secondReinforcementS",1);
        name.setText("Hello "+page2.getStringExtra("name"));

        sumGrades();
        averages();
        diploma();



    }
    void diploma()
    {
        Intent page2 = getIntent();

        if(page2.getBooleanExtra("clicked",false))
        {
            thirdReinforcementAmountOfPoints = page2.getIntExtra("thirdReinforcementPoints",1);
            thirdReinforcementScore = page2.getIntExtra("thirdReinforcementGrade",1);
            thirdReinforcementAmountOfPoints = page2.getIntExtra("thirdReinforcementPoints",1);
            thirdReinforcementScore = page2.getIntExtra("thirdReinforcementGrade",1);
            thirdReinforcementGrade.setVisibility(View.VISIBLE);
            thirdReinforcementPoints.setVisibility(View.VISIBLE);
            thirdReinforcement.setVisibility(View.VISIBLE);
            thirdReinforcement.setText(""+page2.getStringExtra("thirdReinforcement"));
            thirdReinforcementPoints.setText((""+thirdReinforcementAmountOfPoints));
            thirdReinforcementGrade.setText(""+thirdReinforcementScore);
        }
        hebrewGrade.setText(""+hebrew);
        litertureGrade.setText(""+literture);
        historyGrade.setText(""+history);
        citizenshipGrade.setText(""+citizenship);
        bibleGrade.setText(""+bible);
        mathPoints.setText(""+mathAmountOfPoints);
        mathGrade.setText(""+mathScore);
        englishGrade.setText(""+englishScore);
        englishPoints.setText(""+englishAmountOfPoints);
        firstReinforcement.setText(""+page2.getStringExtra("firstReinforcment"));
        firstReinforcementPoints.setText(""+firstReinforcementAmountOfPoints);
        firstReinforcementGrade.setText(""+firstReinforcementScore);
        secondReinforcement.setText(""+page2.getStringExtra("secondReinforcement"));
        secondReinforcementPoints.setText(""+secondReinforcementAmountOfPoints);
        secondReinforcementGrade.setText(""+secondReinforcementScore);
    }

    void sumGrades()
    {
        Intent page2 = getIntent();
        sumGradestv.setText("bonuses: ");
        if (mathAmountOfPoints == 5)
        {
            mathScore += 30;
            sumGradestv.setText(sumGradestv.getText().toString() + "math- +30, ");
        }
        else if (mathAmountOfPoints == 4)
        {
            mathScore += 15;
            sumGradestv.setText(sumGradestv.getText().toString() + "math- +15, ");
        }
        //----------------------------------------------------------------
        if (englishAmountOfPoints == 5)
        {
            englishScore += 30;
            sumGradestv.setText(sumGradestv.getText().toString() + "english- +30, ");
        }
        else if (englishAmountOfPoints == 4)
        {
            englishScore += 15;
            sumGradestv.setText(sumGradestv.getText().toString() + "english- +15, ");
        }
        //----------------------------------------------------------------
        if (firstReinforcementAmountOfPoints == 5)
        {
            firstReinforcementScore += 20;
            sumGradestv.setText(sumGradestv.getText().toString() + page2.getStringExtra("firstReinforcment") + "- +20, ");
        }
        else if (firstReinforcementAmountOfPoints == 4)
        {
            firstReinforcementScore += 10;
            sumGradestv.setText(sumGradestv.getText().toString() + page2.getStringExtra("firstReinforcment")  + "- +10, ");
        }
        //----------------------------------------------------------------
        if (secondReinforcementAmountOfPoints == 5)
        {
            secondReinforcementScore += 20;
            sumGradestv.setText(sumGradestv.getText().toString() + page2.getStringExtra("secondReinforcement") + "- +20, ");
        }
        else if (secondReinforcementAmountOfPoints == 4)
        {
            secondReinforcementScore += 10;
            sumGradestv.setText(sumGradestv.getText().toString() + page2.getStringExtra("secondReinforcement") + "- +10, ");
        }

        if (page2.getBooleanExtra("clicked", false))
        {
            if (thirdReinforcementAmountOfPoints == 5)
            {
                thirdReinforcementScore += 20;
                sumGradestv.setText(sumGradestv.getText().toString() + page2.getStringExtra("thirdReinforcement") + "- +20, ");
            }
            else if (secondReinforcementAmountOfPoints == 4)
            {
                secondReinforcementScore += 10;
                sumGradestv.setText(sumGradestv.getText().toString() + page2.getStringExtra("thirdReinforcement") + "- +10, ");
            }
        }
        sumGradestv.setText(sumGradestv.getText()+".");
    }

    void averages() {
        Intent page2 = getIntent();
        double totalSum = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, biggestSum = 0;
        int total = hebrew * 2 + literture * 2 + history * 2 + citizenship * 2 + bible * 2 + mathAmountOfPoints * mathScore + englishAmountOfPoints * englishScore;
        int division = 10 + mathAmountOfPoints + englishAmountOfPoints;

        if (division + firstReinforcementAmountOfPoints >= 21) {
            sum1 = total + firstReinforcementAmountOfPoints * firstReinforcementScore;
            sum1 = sum1 / (division + firstReinforcementAmountOfPoints);
            if (sum1 > biggestSum) {
                biggestSum = sum1;
            }
        }

        if (division + secondReinforcementAmountOfPoints >= 21) {
            sum2 = total + secondReinforcementAmountOfPoints * secondReinforcementScore;
            sum2 = sum2 / (division + secondReinforcementAmountOfPoints);
            if (sum2 > biggestSum) {
                biggestSum = sum2;
            }
        }

        if (division + firstReinforcementAmountOfPoints + secondReinforcementAmountOfPoints >= 21) {
            sum4 = total + firstReinforcementAmountOfPoints * firstReinforcementScore + secondReinforcementAmountOfPoints * secondReinforcementScore;
            sum4 = sum4 / (division + firstReinforcementAmountOfPoints + secondReinforcementAmountOfPoints);
            if (sum4 > biggestSum) {
                biggestSum = sum4;
            }
        }

        if (page2.getBooleanExtra("clicked", false)) {
            if (division + thirdReinforcementAmountOfPoints >= 21) {
                sum3 = total + thirdReinforcementAmountOfPoints * thirdReinforcementScore;
                sum3 = sum3 / (division + thirdReinforcementAmountOfPoints);
                if (sum3 > biggestSum) {
                    biggestSum = sum3;
                }
            }

            if (division + secondReinforcementAmountOfPoints + thirdReinforcementAmountOfPoints >= 21) {
                sum5 = total + thirdReinforcementAmountOfPoints * thirdReinforcementScore + secondReinforcementAmountOfPoints * secondReinforcementScore;
                sum5 = sum5 / (division + thirdReinforcementAmountOfPoints + secondReinforcementAmountOfPoints);
                if (sum5 > biggestSum) {
                    biggestSum = sum5;
                }
            }

            if (division + firstReinforcementAmountOfPoints + thirdReinforcementAmountOfPoints >= 21) {
                sum6 = total + thirdReinforcementAmountOfPoints * thirdReinforcementScore + firstReinforcementAmountOfPoints * firstReinforcementScore;
                sum6 = sum6 / (division + thirdReinforcementAmountOfPoints + firstReinforcementAmountOfPoints);
                if (sum6 > biggestSum)
                {
                    biggestSum = sum6;
                }
            }

            totalSum = total + secondReinforcementScore * secondReinforcementAmountOfPoints + firstReinforcementAmountOfPoints * firstReinforcementScore + thirdReinforcementScore * thirdReinforcementAmountOfPoints;
            totalSum = totalSum / (division + firstReinforcementAmountOfPoints + secondReinforcementAmountOfPoints + thirdReinforcementAmountOfPoints);
            if (totalSum > biggestSum) {
                biggestSum = totalSum;
            }

            //the sums that we calculated are:" + sum1 + ", " + sum2 + ", " + sum3 + ", " + sum4 + ", " + sum5 + ", " + sum6);
            //
        }
        else
        {
            totalSum = total + secondReinforcementScore * secondReinforcementAmountOfPoints + firstReinforcementAmountOfPoints * firstReinforcementScore;
            totalSum = totalSum / (division + firstReinforcementAmountOfPoints + secondReinforcementAmountOfPoints);
            if (totalSum > biggestSum)
            {
                biggestSum = totalSum;
            }
            averagestv.setText("your bagroot grade is: " + totalSum + "\nthe biggest sum found is:" + biggestSum + "\nthe sums that we calculated are:" + sum1 + ", " + sum2 + ", " + sum4);
        }
        averagestv.setText("your bagroot grade is: " + totalSum + "\nthe biggest sum found is:" + biggestSum + "\n");
        if (sum1 != 0)
        {
            averagestv.setText(averagestv.getText() + "" + sum1);
        }
        if (sum2 != 0)
        {
            averagestv.setText(averagestv.getText() + ", " + sum2);
        }
        if (sum3 != 0)
        {
            averagestv.setText(averagestv.getText() + ", " + sum3);
        }
        if (sum4 != 0)
        {
            averagestv.setText(averagestv.getText() + ", " + sum4);
        }
        if (sum5 != 0)
        {
            averagestv.setText(averagestv.getText() + ", " + sum5);
        }
        if (sum6 != 0)
        {
            averagestv.setText(averagestv.getText() + ", " + sum6);
        }
    }

    public void moveToPrevPage(View view)
    {
        finish();
    }
}