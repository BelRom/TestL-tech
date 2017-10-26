package com.example.roman.testl_tech;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by roman on 25.10.17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private static List<Item> mDataset;
    private static Context mContext;


    public RecyclerAdapter(List<Item>  dataset, Context context) {
        mDataset = dataset;
        mContext = context;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTextViewHeder.setText(mDataset.get(position).getTitle());
        holder.mTextViewText.setText(mDataset.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewHeder, mTextViewText;

        public ViewHolder(View v) {
            super(v);
            mTextViewHeder =  v.findViewById(R.id.textViewHeder);
            mTextViewText = v.findViewById(R.id.textViewText);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int pos = getAdapterPosition();
                    Intent intent = new Intent(mContext, DetailActivity.class);
                    intent.putExtra("EXTRA_HEADER", mDataset.get(pos).getTitle());
                    intent.putExtra("EXTRA_TEXT", mDataset.get(pos).getText());
                    mContext.startActivity(intent);
                }
            });
        }
    }



}