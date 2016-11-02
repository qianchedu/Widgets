package com.dsz.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2;

    PersonDB personDB;
    Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         personDB = new PersonDB(MainActivity.this);
        person = new Person("yousss1",true);

        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                personDB.addPerson(person);
                break;

            case R.id.button2:
                Person persons = personDB.getPerson("yousss1");
                System.out.print(persons.getName() + "时间" + persons.isFalg());
                Toast.makeText(this, persons.getName() + "时间" + persons.isFalg(), Toast.LENGTH_SHORT).show();
                if(persons.isFalg()){
                    Toast.makeText(this, "mei", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
