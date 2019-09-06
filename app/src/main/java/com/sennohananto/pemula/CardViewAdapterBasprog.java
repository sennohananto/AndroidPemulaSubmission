package com.sennohananto.pemula;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardViewAdapterBasprog extends RecyclerView.Adapter<CardViewAdapterBasprog.CardViewViewHolder> {
    List<Basprog> basprogList;

    public CardViewAdapterBasprog(List<Basprog> basprogList) {
        this.basprogList = basprogList;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_programming_language, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, final int position) {
        holder.img.setImageResource(basprogList.get(position).getImg());
        holder.tvDesc.setText(basprogList.get(position).getDesc());
        holder.tvTitle.setText(basprogList.get(position).getTitle());
        holder.btnSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(basprogList.get(position).getSite())));
            }
        });
        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareBody = basprogList.get(position).getTitle()+". "+basprogList.get(position).getDesc()+" More : "+basprogList.get(position).getSite();
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, basprogList.get(position).getTitle());
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                v.getContext().startActivity(Intent.createChooser(sharingIntent, "Share Using ..."));
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keDetailBasprog = new Intent(v.getContext(),DetailBasprogActivity.class);
                keDetailBasprog.putExtra("basprog",basprogList.get(position));
                v.getContext().startActivity(keDetailBasprog);
            }
        });
    }

    @Override
    public int getItemCount() {
        return basprogList.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tvTitle, tvDesc;
        Button btnSite, btnShare;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgBasProg);
            tvTitle = itemView.findViewById(R.id.tvJudul);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            btnSite = itemView.findViewById(R.id.btnSite);
            btnShare = itemView.findViewById(R.id.btnShare);
        }
    }
}
