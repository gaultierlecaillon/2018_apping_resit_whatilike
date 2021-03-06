package fr.epita.android.whatilike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
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
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int pos,
                                    long id) {
                Intent i = new Intent(getApplicationContext(), DetailActivity.class);
                i.putExtra("Position", pos);
                startActivity(i);
            }
        });
        thingAdapter.addAll(myList);
    }

    private void createList() {
        myList = new ArrayList<>();
        myList.add(new Thing("Les Cookies", "Delicious biscuits", "cookies",true));
        myList.add(new Thing("PHP", "F**k the haters", "php",true));
        myList.add(new Thing("La SNCF", "Bunch of incompetent people", "sncf",false));
        myList.add(new Thing("La Vaporwave", "Vaporwave is a microgenre of electronic music and an Internet meme that emerged in the early 2010s", "vaporwave",true));
        myList.add(new Thing("Bitcoin", "A cryptocurrency", "btc",true));
        myList.add(new Thing("Rick & Morty", "The best anime show so far", "rick_and_morty",true));
        myList.add(new Thing("Kenan Lejosne", "A useless student", "kenan",false));
        myList.add(new Thing("Annecy", "The most beautifull city in France", "annecy",true));
    }
}
