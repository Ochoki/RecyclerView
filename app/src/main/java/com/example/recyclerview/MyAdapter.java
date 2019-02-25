package com.example.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    ArrayList<Integer> arrayList;


    MyAdapter(ArrayList<Integer> arrayList){

        this.arrayList=arrayList;

    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_row,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.bind(arrayList.get(myViewHolder.getAdapterPosition()));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void addItems(ArrayList<Integer> arrayList) {

        this.arrayList.addAll(arrayList);
        notifyDataSetChanged();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView ;

       public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv);
        }


        public void bind(Integer data) {

           textView.setText(data.toString());


        }
    }
}
