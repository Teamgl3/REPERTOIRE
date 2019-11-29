package com.teamgl.gl3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class MonAdapter extends  RecyclerView.Adapter<MyHolder> {

    private List<Fruit> fruits;


    public MonAdapter(List<Fruit> donnees) {


        fruits = donnees;    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.activity_liste, viewGroup, false);
        MyHolder holder = new MyHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {

        Fruit fruit = fruits.get(i);
        myHolder.getNomTextView().setText("Nom : "+fruit.getNom());
        myHolder.getOrigineTextView().setText("Origine: " + fruit.getOrigine());
        myHolder.getNomTextView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }        });

    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }


    public void add(int position, Fruit fruitItem) {
         fruits.add(position, fruitItem);

        notifyItemInserted(position);
      notifyItemRangeChanged(position, fruits.size());    }

    public void remove(int position) {

        fruits.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, fruits.size());



    }
    public void changerNom(int position, String nouveauNom) {

        fruits.get(position).setNom(nouveauNom);
        notifyItemChanged(position);    }
}
