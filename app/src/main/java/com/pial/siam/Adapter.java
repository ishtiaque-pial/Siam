package com.pial.siam;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterHolder> {

    private Context context;
    private ArrayList<Model> modelArrayList = new ArrayList<>();
    private Listener listener;

    public Adapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
        listener = (Listener) context;
    }

    @NonNull
    @Override
    public AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout,parent,false);
        AdapterHolder adapterHolder = new AdapterHolder(view);
        return adapterHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHolder holder, int position) {
        holder.name.setText(modelArrayList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class  AdapterHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private CardView cardView;
        public AdapterHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            cardView = itemView.findViewById(R.id.cardView);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(modelArrayList.get(getAdapterPosition()).getName());
                }
            });
        }
    }
}
