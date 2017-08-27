package br.com.parcelableexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mListView = (ListView) findViewById(R.id.list_view);

        ArrayList<Person> people = getIntent().getParcelableArrayListExtra("people");
        mListView.setAdapter(new PersonAdapter(this, people));
    }
}
