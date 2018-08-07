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

public class Adapter2 extends RecyclerView.Adapter<Adapter2.Adapter2Holder>{

    private Context context;
    private ArrayList<String> modelArrayList = new ArrayList<>();

    public Adapter2(Context context, ArrayList<String> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public Adapter2Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout2,parent,false);
        Adapter2.Adapter2Holder adapterHolder = new Adapter2.Adapter2Holder(view);
        return adapterHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter2Holder holder, int position) {
        holder.name.setText(modelArrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class Adapter2Holder extends RecyclerView.ViewHolder{

        private TextView name;
        private CardView cardView;
        public Adapter2Holder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name2);
            cardView = itemView.findViewById(R.id.cardView2);
        }
    }
}
