package com.example.recyclerviewnumbers;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumberAdapter extends RecyclerView.Adapter<NumberViewHolder> {

    private ArrayList<String> data1;
    private ArrayList<String> data2;

    public NumberAdapter(ArrayList<String> data1, ArrayList<String> data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NumberViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_number, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.bind(R.drawable.updated_logo, data1.get(position), data2.get(position));
    }

    @Override
    public int getItemCount() {
        return data1.size();
    }
}
