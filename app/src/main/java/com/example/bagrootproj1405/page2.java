package com.example.bagrootproj1405;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Space;
import android.content.Intent;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class page2 extends AppCompatActivity {
    EditText mathGrade, mathPoints, englishGrade, englishPoints, firstReinforcement, firstReinforcementPoints, firstReinforcementGrade;
    EditText secondReinforcement, secondReinforcementPoints, secondReinforcementGrade, thirdReinforcement, thirdReinforcementPoints, thirdReinforcementGrade;
    Button anotherReinforcement;
    Space hiddenSpace1, hiddenSpace2, hiddenSpace3, hiddenSpace4;

    String mathGrades, mathPointsS, englishGradeS, englishPointsS, firstReinforcementS, firstReinforcementPointsS, firstReinforcementGradeS; //S for String
    String secondReinforcementS, secondReinforcementPointsS, secondReinforcementGradeS, thirdReinforcementS, thirdReinforcementPointsS, thirdReinforcementGradeS;

    Boolean clicked;

    int[] reinforcement1 = new int[2];
    int[] reinforcement2 = new int[2];
    int[] reinforcement3 = new int[2];
    int[] math = new int[2];
    int[] english = new int[2];
    //arr[0] = points, arr[1] = grade

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        mathGrade = findViewById(R.id.mathGrade);
        mathPoints = findViewById(R.id.mathPoints);

        englishGrade = findViewById(R.id.englishGrade);
        englishPoints = findViewById(R.id.englishPoints);

        firstReinforcement = findViewById(R.id.firstReinforcement);
        firstReinforcementPoints = findViewById(R.id.firstReinforcementPoints);
        firstReinforcementGrade = findViewById(R.id.firstReinforcementGrade);

        secondReinforcement = findViewById(R.id.secondReinforcement);
        secondReinforcementPoints = findViewById(R.id.secondReinforcementPoints);
        secondReinforcementGrade = findViewById(R.id.secondReinforcementGrade);

        thirdReinforcement = findViewById(R.id.thirdReinforcement);
        thirdReinforcementPoints = findViewById(R.id.thirdReinforcementPoints);
        thirdReinforcementGrade = findViewById(R.id.thirdReinforcementGrade);

        anotherReinforcement = findViewById(R.id.anotherReinforcement);

        hiddenSpace1 = findViewById(R.id.hiddenSpace1);
        hiddenSpace2 = findViewById(R.id.hiddenSpace2);
        hiddenSpace3 = findViewById(R.id.hiddenSpace3);
        hiddenSpace4 = findViewById(R.id.hiddenSpace4);

        clicked = false;


    }

    public boolean valid(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch < '0' || ch > '9') {
                if (ch != '-' && ch != '.' && ch != ' ') {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean validString(String input)
    {
        if (input == null || input.isEmpty())
        {
            return false;
        }
        for (int i = 0; i < input.length(); i++)
        {
            char tempChar = input.charAt(i);
            if (!(tempChar >= 'A' && tempChar <= 'Z' || tempChar >= 'a' && tempChar <= 'z'))
            {
                return false;
            }
        }
        return true;
    }


    public void anotherReinforcement(View view)
    {
        firstReinforcementS = firstReinforcement.getText().toString();
        firstReinforcementPointsS = firstReinforcementPoints.getText().toString();
        firstReinforcementGradeS = firstReinforcementGrade.getText().toString();

        secondReinforcementS = secondReinforcement.getText().toString();
        secondReinforcementPointsS = secondReinforcementPoints.getText().toString();
        secondReinforcementGradeS = secondReinforcementGrade.getText().toString();

        if (validString(firstReinforcementS) && validString(secondReinforcementS) && valid(firstReinforcementPointsS) && valid(firstReinforcementGradeS) && valid(secondReinforcementPointsS) && valid(secondReinforcementGradeS)) {
            reinforcement1[0] = Integer.parseInt(firstReinforcementPointsS);
            reinforcement1[1] = Integer.parseInt(firstReinforcementGradeS);
            reinforcement2[0] = Integer.parseInt(secondReinforcementPointsS);
            reinforcement2[1] = Integer.parseInt(secondReinforcementGradeS);
            if (reinforcement1[0] >= 3 && reinforcement1[1] >= 0 && reinforcement1[0] <= 5 && reinforcement1[1] <= 100 && reinforcement2[0] >= 3 && reinforcement2[1] >= 0 && reinforcement2[0] <= 5 && reinforcement2[1] <= 100) {
                clicked = true;
                anotherReinforcement.setVisibility(View.GONE);
                hiddenSpace1.setVisibility(View.VISIBLE);
                hiddenSpace2.setVisibility(View.VISIBLE);
                hiddenSpace3.setVisibility(View.VISIBLE);
                hiddenSpace4.setVisibility(View.VISIBLE);
                thirdReinforcement.setVisibility(View.VISIBLE);
                thirdReinforcementGrade.setVisibility(View.VISIBLE);
                thirdReinforcementPoints.setVisibility(View.VISIBLE);
            } else {
                Toast.makeText(this, "Index Range is invalid", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        }


    }

    public void moveToNextPage(View view)
    {

        firstReinforcementS = firstReinforcement.getText().toString();
        firstReinforcementPointsS = firstReinforcementPoints.getText().toString();
        firstReinforcementGradeS = firstReinforcementGrade.getText().toString();

        secondReinforcementS = secondReinforcement.getText().toString();
        secondReinforcementPointsS = secondReinforcementPoints.getText().toString();
        secondReinforcementGradeS = secondReinforcementGrade.getText().toString();

        mathGrades = mathGrade.getText().toString();
        mathPointsS = mathPoints.getText().toString();
        englishGradeS = englishGrade.getText().toString();
        englishPointsS = englishPoints.getText().toString();
        Intent page1 = getIntent();
        Intent page2 = new Intent(this, page3.class);
        if (clicked)
        {
            thirdReinforcementS = thirdReinforcement.getText().toString();
            thirdReinforcementPointsS = thirdReinforcementPoints.getText().toString();
            thirdReinforcementGradeS = thirdReinforcementGrade.getText().toString();
            if (validString(thirdReinforcementS) && valid(thirdReinforcementPointsS) && valid(thirdReinforcementGradeS))
            {
                if (validString(firstReinforcementS) && validString(secondReinforcementS) && valid(firstReinforcementPointsS) && valid(firstReinforcementGradeS) && valid(secondReinforcementPointsS) && valid(secondReinforcementGradeS))
                {
                    if (valid(mathGrades) && valid(mathPointsS) && valid(englishPointsS) && valid(englishGradeS))
                    {
                        reinforcement1[0] = Integer.parseInt(firstReinforcementPointsS);
                        reinforcement1[1] = Integer.parseInt(firstReinforcementGradeS);
                        reinforcement2[0] = Integer.parseInt(secondReinforcementPointsS);
                        reinforcement2[1] = Integer.parseInt(secondReinforcementGradeS);
                        reinforcement3[0] = Integer.parseInt(thirdReinforcementPointsS);
                        reinforcement3[1] = Integer.parseInt(thirdReinforcementGradeS);
                        math[0] = Integer.parseInt(mathPointsS);
                        math[1] = Integer.parseInt(mathGrades);
                        english[0] = Integer.parseInt(englishPointsS);
                        english[1] = Integer.parseInt(englishGradeS);
                        if (reinforcement1[0] >= 3 && reinforcement1[1] >= 0 && reinforcement1[0] <= 5 && reinforcement1[1] <= 100 && reinforcement2[0] >= 3 && reinforcement2[1] >= 0 && reinforcement2[0] <= 5 && reinforcement2[1] <= 100 && reinforcement3[0] >= 3 && reinforcement3[1] >= 0 && reinforcement3[0] <= 5 && reinforcement3[1] <= 100)
                        {
                            if (math[0] >= 3 && math[0] <= 5 && math[1] >= 0 && math[1] <= 100 && english[0] >= 3 && english[0] <= 5 && english[1] >= 0 && english[1] <= 100)
                            {
                                page2.putExtra("firstReinforcment", firstReinforcementS);
                                page2.putExtra("firstReinforcmentPoints", reinforcement1[0]);
                                page2.putExtra("firstReinformentGrade", reinforcement1[1]);
                                page2.putExtra("secondReinforcement", secondReinforcementS);
                                page2.putExtra("secondReinforcementPoints", reinforcement2[0]);
                                page2.putExtra("secondReinforcementGrade", reinforcement2[1]);
                                page2.putExtra("thirdReinforcement", thirdReinforcementS);
                                page2.putExtra("thirdReinforcementPoints", reinforcement3[0]);
                                page2.putExtra("thirdReinforcementGrade", reinforcement3[1]);
                                page2.putExtra("clicked", clicked);
                                page2.putExtra("mathPoints", math[0]);
                                page2.putExtra("mathGrade", math[1]);
                                page2.putExtra("englishPoints", english[0]);
                                page2.putExtra("englishGrade", english[1]);
                                page2.putExtra("hebrew", page1.getIntExtra("hebrew", 1));
                                page2.putExtra("literture", page1.getIntExtra("literture", 1));
                                page2.putExtra("history", page1.getIntExtra("history", 1));
                                page2.putExtra("citizenship", page1.getIntExtra("citizenship", 1));
                                page2.putExtra("bible", page1.getIntExtra("bible", 1));
                                page2.putExtra("name", page1.getIntExtra("name", 1));
                                startActivity(page2);
                            }
                            else
                            {
                                Toast.makeText(this, "Index Range is invalid", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(this, "Index Range is invalid", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            if (validString(firstReinforcementS) && validString(secondReinforcementS) && valid(firstReinforcementPointsS) && valid(firstReinforcementGradeS) && valid(secondReinforcementPointsS) && valid(secondReinforcementGradeS))
            {
                if (valid(mathGrades) && valid(mathPointsS) && valid(englishPointsS) && valid(englishGradeS))
                {
                    reinforcement1[0] = Integer.parseInt(firstReinforcementPointsS);
                    reinforcement1[1] = Integer.parseInt(firstReinforcementGradeS);
                    reinforcement2[0] = Integer.parseInt(secondReinforcementPointsS);
                    reinforcement2[1] = Integer.parseInt(secondReinforcementGradeS);
                    reinforcement3[0] = 0;
                    reinforcement3[1] = 0;
                    math[0] = Integer.parseInt(mathPointsS);
                    math[1] = Integer.parseInt(mathGrades);
                    english[0] = Integer.parseInt(englishPointsS);
                    english[1] = Integer.parseInt(englishGradeS);
                    if (reinforcement1[0] >= 3 && reinforcement1[1] >= 0 && reinforcement1[0] <= 5 && reinforcement1[1] <= 100 && reinforcement2[0] >= 3 && reinforcement2[1] >= 0 && reinforcement2[0] <= 5 && reinforcement2[1] <= 100)
                    {
                        if (math[0] >= 3 && math[0] <= 5 && math[1] >= 0 && math[1] <= 100 && english[0] >= 3 && english[0] <= 100 && english[1] >= 0 && english[1] <= 100)
                        {
                            page2.putExtra("firstReinforcment", firstReinforcementS);
                            page2.putExtra("firstReinforcmentPoints", reinforcement1[0]);
                            page2.putExtra("firstReinformentGrade", reinforcement1[1]);
                            page2.putExtra("secondReinforcement", secondReinforcementS);
                            page2.putExtra("secondReinforcementPoints", reinforcement2[0]);
                            page2.putExtra("secondReinforcementS", reinforcement2[1]);
                            page2.putExtra("clicked", clicked);
                            page2.putExtra("mathPoints", math[0]);
                            page2.putExtra("mathGrade", math[1]);
                            page2.putExtra("englishPoints", english[0]);
                            page2.putExtra("englishGrade", english[1]);
                            page2.putExtra("hebrew", page1.getIntExtra("hebrew", 1));
                            page2.putExtra("literture", page1.getIntExtra("literture", 1));
                            page2.putExtra("history", page1.getIntExtra("history", 1));
                            page2.putExtra("citizenship", page1.getIntExtra("citizenship", 1));
                            page2.putExtra("bible", page1.getIntExtra("bible", 1));
                            page2.putExtra("name", page1.getIntExtra("name", 1));
                            startActivity(page2);
                        }
                        else
                        {
                            Toast.makeText(this, "Index Range is invalid", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(this, "Index Range is invalid", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void moveToPrevPage(View view)
    {
        finish();
    }
}