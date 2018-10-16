package com.example.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listViewId);

        List<String> nombres =  new ArrayList<String>();
        nombres.add("Max");
        nombres.add("Christian");
        nombres.add("Eric");
        nombres.add("Cristian");
        //Un Adapter es una forma de mostrar los datos en el ListView y se le pasa un layout y lo rellena
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombres);
        //Enlazamos el adaptador con nuestro listView
        listView.setAdapter(adapter);
    }
}




