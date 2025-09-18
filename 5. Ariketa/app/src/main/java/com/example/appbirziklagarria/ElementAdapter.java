package com.example.appbirziklagarria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ElementAdapter extends RecyclerView.Adapter<ElementAdapter.ElementViewHolder> {

    private Element[] elements;

    public ElementAdapter(Element[] elements) {
        this.elements = elements;
    }

    @NonNull
    @Override
    public ElementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ElementViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ElementViewHolder holder, int position) {
        holder.bind(elements[position]);
    }

    @Override
    public int getItemCount() {
        return elements.length;
    }

    static class ElementViewHolder extends RecyclerView.ViewHolder {
        private ImageView icon;
        private TextView title, description;

        public ElementViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.element_icon);
            title = itemView.findViewById(R.id.element_title);
            description = itemView.findViewById(R.id.element_description);
        }

        public void bind(Element element) {
            title.setText(element.name);
            description.setText(element.description);
            icon.setImageResource(element.img);
        }
    }

}