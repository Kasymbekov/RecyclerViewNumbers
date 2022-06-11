package com.example.recyclerviewnumbers;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;
    private TextView textView2;

    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.logo);
        textView = itemView.findViewById(R.id.contact_name);
        textView2 = itemView.findViewById(R.id.number);
    }

    public void bind(int image, String contact_name, String number) {
        imageView.setImageResource(image);
        textView.setText(contact_name);
        textView2.setText(number);
    }
}
