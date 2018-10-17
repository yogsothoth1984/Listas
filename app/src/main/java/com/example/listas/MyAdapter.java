package com.example.listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;    //Donde va a ser cargado el Adaptador
    private int layout;
    private List<String> nombres;

    //Constructor se le pasan los datos para que sean rellenados
    public MyAdapter(Context context, int layout, List<String> nombres) {
        this.context = context;
        this.layout = layout;
        this.nombres = nombres;
    }

    @Override
    public int getCount() {
        return this.nombres.size();
    }//numero de elementos a dibujar

    @Override
    public Object getItem(int position) {
        return this.nombres.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        //copiamos la vista
        View v= convertView;

        //Inflamos la vista con nuestro layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.item,null);

        //Nos traemos el valor dependiendo de la posicion
        String currentNombres = nombres.get(position);

        //<<<<<rellenar el TextView>>>>>
        //En la vista view inflada hace referencia al textView y lo modificamos
        TextView textView =(TextView) v.findViewById(R.id.textView);
        textView.setText(currentNombres);//le carga al textView el currentNombres

        //Devolvemos la vista inflada y modificada
        return v;
    }
}
