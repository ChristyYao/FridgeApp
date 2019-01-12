package com.example.company.fridgeapp.viewholder;

import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.TextView;

import com.example.company.fridgeapp.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.title);
    }

    public void render(String text){
        textView.setText(text);
    }

}


