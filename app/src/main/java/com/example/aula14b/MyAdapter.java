package com.example.aula14b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;

    public MyAdapter(Context context, List<Item> itens) {
        this.context = context;
        this.itens = itens;
    }

    List<Item> itens;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new
                MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(itens.get(position).getName());
        holder.emailView.setText(itens.get(position).getEmail());
        holder.imageView.setImageResource(itens.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
