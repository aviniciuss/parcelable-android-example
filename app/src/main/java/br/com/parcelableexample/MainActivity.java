package br.com.parcelableexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private ArrayList<Person> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton= (Button) findViewById(R.id.button);
        mList= new ArrayList<>();
        mList.add(create());
        mList.add(create());
        mList.add(create());

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putParcelableArrayListExtra("people", mList);
                startActivity(intent);
            }
        });
    }


    private Person create() {
        Person person = new Person();
        person.name = "Anderson Vinicius";
        person.addPhones(new Phone("453223-2255"));
        return person;
    }
}
