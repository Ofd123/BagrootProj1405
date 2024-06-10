package com.example.bagrootproj1405;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText hebrewGrade,litertureGrade,historyGrade,citizenshipGrade,bibleGrade,username;
    Button nextPage;
    String hebrewInput,litertureInput,historyInput,citizenshipInput,bibleInput,usernameInput;
    int hebrew,literture,history,citizenship,bible;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hebrewGrade = findViewById(R.id.hebrewGrade);
        litertureGrade = findViewById(R.id.litertureGrade); //if i type liteture it gives me an error
        historyGrade = findViewById(R.id.historyGrade);
        citizenshipGrade = findViewById(R.id.citizenshipGrade);
        bibleGrade = findViewById(R.id.bibleGrade);
        username = findViewById(R.id.username);
        nextPage = findViewById(R.id.nextPage);

    }

    public boolean valid(String input)
    {
        if (input == null || input.isEmpty())
        {
            return false;
        }
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch < '0' || ch > '9')
            {
                if (ch != '-' && ch != '.' && ch != ' ')
                {
                    return false;
                }
            }
        }
        return true;
    }



    public boolean validString(String input)
    {
        if (input.isEmpty())
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


    public void moveToTheNextPage(View view)
    {
        hebrewInput = hebrewGrade.getText().toString();
        litertureInput = litertureGrade.getText().toString();
        historyInput = historyGrade.getText().toString();
        citizenshipInput = citizenshipGrade.getText().toString();
        bibleInput = bibleGrade.getText().toString();
        usernameInput = username.getText().toString();
        if (valid(hebrewInput) && valid(litertureInput) && valid(bibleInput) && valid(historyInput) && valid(citizenshipInput) && validString(usernameInput))
        {
            hebrew = Integer.parseInt(hebrewInput);
            literture = Integer.parseInt(litertureInput);
            history = Integer.parseInt(historyInput);
            citizenship = Integer.parseInt(citizenshipInput);
            bible = Integer.parseInt(bibleInput);
            if (hebrew >= 0 && hebrew<= 100 && literture >= 0 && literture<= 100 && history >= 0 && history<= 100 && citizenship >= 0 && citizenship<= 100 && bible >= 0 && bible<= 100)
            {
                Intent page1 = new Intent(this, page2.class);
                page1.putExtra("hebrew",hebrew);
                page1.putExtra("literture",literture);
                page1.putExtra("history",history);
                page1.putExtra("citizenship",citizenship);
                page1.putExtra("bible",bible);
                page1.putExtra("name",usernameInput);
                startActivity(page1);
            }

            else
            {
                Toast.makeText(this,"Index Range is invalid",Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(this,"Invalid input",Toast.LENGTH_SHORT).show();
        }
    }
}
