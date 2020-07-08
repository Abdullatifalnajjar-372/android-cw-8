package com.example.pokemon;

import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemon> mypokemons = new ArrayList<>();
         pokemon p1 = new pokemon("Bulbasaur",R.drawable.Bulbasaur,49,49,318);
        pokemon p2 = new pokemon("Charizard",R.drawable.Charizard,49,49,318);
        pokemon p3 = new pokemon("Pikachu",R.drawable.Pikachu,49,49,318);
        pokemon p4 = new pokemon("clefabe",R.drawable.clefabe,49,49,318);

        mypokemons.add(p1);
        mypokemons.add(p2);
        mypokemons.add(p3);
        mypokemons.add(p4);


        AlertController.RecycleListView rv = findViewById(R.id.deadpool);

        rv.setHasFixedSize(true);
        AlertController.RecycleListView.LayoutManager la = new LinearLayoutManager(this);



    }
}
