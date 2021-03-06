package com.example.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<String> nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listViewId);

        nombres =  new ArrayList<String>();
        nombres.add("Max");
        nombres.add("Christian");
        nombres.add("Eric");
        nombres.add("Cristian");
        //Un Adapter es una forma de mostrar los datos en el ListView y se le pasa un layout y lo rellena
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombres);
        //Enlazamos el adaptador con nuestro listView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Clickeado: "+nombres.get(position),
                        Toast.LENGTH_SHORT).show();
            }
        });
        //Enlazamos con nuestro adaptador,creamos la instancia de nuestro adaptador
        MyAdapter myAdapter = new MyAdapter(this,R.layout.item,nombres);
        //adjuntamos
        listView.setAdapter(myAdapter);
    }
}



