package com.example.a551java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Second_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Watch> list;

    public Second_Adapter(Context context, ArrayList<Watch> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal_apple_watch, parent, false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Watch watch = list.get(position);
        if (holder instanceof MyView) {
            ((MyView) holder).imageView.setImageResource(watch.productImages);
            ((MyView) holder).textView.setText(watch.titles);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public MyView(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.getwatch_image_id);
            textView = itemView.findViewById(R.id.getWatch_text_id);

        }
    }
}
