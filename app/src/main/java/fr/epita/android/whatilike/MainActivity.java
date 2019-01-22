package fr.epita.android.whatilike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Thing> myList;
    private ListView myListView;
    private ThingAdapter thingAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createList();

        myListView = findViewById(R.id.listView);
        thingAdapter = new ThingAdapter(getApplicationContext(), 0);
        myListView.setAdapter(thingAdapter);
        thingAdapter.addAll(myList);

    }

    private void createList() {
        myList = new ArrayList<>();
        myList.add(new Thing("Cookies", "Delicious biscuit", true));
        myList.add(new Thing("PHP", "F**k the haters", true));
        myList.add(new Thing("La SNCF", "incompetent people", false));
    }
}
