package com.example.Notes_project.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.Notes_project.classes.NoteBook;
import com.example.Notes_project.R;

import java.util.ArrayList;


public class horizontalAdapter extends RecyclerView.Adapter<horizontalAdapter.ViewHolder> {

    private ArrayList<NoteBook> data;

    public horizontalAdapter(ArrayList<NoteBook> data){
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_of_book, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bookName.setText(data.get(position).getName());
        holder.bookImage.setImageResource(data.get(position).getImageIcon());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView bookImage;
        public TextView bookName;

        public ViewHolder(View itemView) {
            super(itemView);
            bookImage=itemView.findViewById(R.id.book_image);
            bookName=itemView.findViewById(R.id.book_name);

        }
    }
}