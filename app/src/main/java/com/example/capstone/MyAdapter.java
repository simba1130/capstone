package com.example.capstone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<sangill>sangillArrayList;

    public MyAdapter(Context context, ArrayList<sangill> sangillArrayList) {
        this.context = context;
        this.sangillArrayList = sangillArrayList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        sangill sangill = sangillArrayList.get(position);

        holder.cars.setText(String.valueOf(sangill.cars));
        holder.humans.setText(String.valueOf(sangill.humans));
        holder.totalcars.setText(String.valueOf(sangill.totalcars));
        holder.totalhumans.setText(String.valueOf(sangill.totalhumans));

    }

    @Override
    public int getItemCount() {
        return sangillArrayList.size();
    }

    public static class  MyViewHolder extends RecyclerView.ViewHolder{

        TextView cars, humans, totalcars, totalhumans;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cars=itemView.findViewById(R.id.tvcars);
            humans=itemView.findViewById(R.id.tvhumans);
            totalcars=itemView.findViewById(R.id.tvtotalcars);
            totalhumans=itemView.findViewById(R.id.tvtotalhumans);
        }
    }
}
