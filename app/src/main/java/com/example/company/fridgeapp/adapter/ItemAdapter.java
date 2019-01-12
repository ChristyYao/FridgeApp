package com.example.company.fridgeapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.company.fridgeapp.R;
import com.example.company.fridgeapp.viewholder.ItemViewHolder;
import com.truizlop.sectionedrecyclerview.SimpleSectionedAdapter;

public class ItemAdapter extends SimpleSectionedAdapter<ItemViewHolder> {

    @Override
    protected String getSectionHeaderTitle(int section) {
        return section == 0 ? "Today" : "Tomorrow";
    }

    @Override
    protected int getSectionCount() {
        return 2;
    }

    @Override
    protected int getItemCountForSection(int section) {
        return 3;
    }

    @Override
    protected ItemViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    protected String[][] agenda = {{"Meeting", "Phone call", "Interview"},
            {"Basket match", "Grocery shopping", "Taking a nap"}};

    @Override
    protected void onBindItemViewHolder(ItemViewHolder holder, int section, int position) {
        holder.render(agenda[section][position]);
    }

}
