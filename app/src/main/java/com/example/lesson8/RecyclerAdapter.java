package com.example.lesson8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{
    private ArrayList<MainModel>list;
    private Context context;
    private IFragments listener;

    public RecyclerAdapter(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item,parent,false);
         return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.onBind(list.get(position),position);

    }

    @Override
    public int getItemCount() {
         return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView textTitle;
        private  TextView textSubTitle;
        private ImageView avatarView;
        private MainModel model;
        int pos;



        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textTitle =itemView.findViewById(R.id.tvTitle);
            textSubTitle =itemView.findViewById(R.id.tvDesc);
            avatarView =itemView.findViewById(R.id.avatarView);

        }

        public void onBind(MainModel mainModel, int position) {
            this.model =model;
            this.pos = pos;
            textTitle.setText(model.getTitle());
            textSubTitle.setText(model.getSubTitle());
            avatarView.setImageResource(model.getAvatarView());
        }

        @Override
        public void onClick(View v) {
            if (listener != null){
                listener.displayDetails(model.getTitle(),model.getSubTitle(),model.getAvatarView());
            }

        }
    }

    public void setOnClickListener(IFragments mListener){
        this.listener =mListener;
    }
}
