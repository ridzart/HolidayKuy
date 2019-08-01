package com.if12.holidaykuy.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.if12.holidaykuy.Detail;
import com.if12.holidaykuy.DetailHotelFragment;
import com.if12.holidaykuy.GlideApp;
import com.if12.holidaykuy.MainActivity;
import com.if12.holidaykuy.MapsActivity;
import com.if12.holidaykuy.R;
import com.if12.holidaykuy.model.RestorantModel;

import java.util.List;

public class RestorantRecyclerAdapter extends RecyclerView.Adapter<RestorantRecyclerAdapter.ViewHolder> {
    private Context mContext;
    private List<RestorantModel> restorantModels;
    private RestorantRecyclerAdapter.OnCallbackListener listener;

    public RestorantRecyclerAdapter(Context mContext, List<RestorantModel> restorantModels) {
        this.mContext = mContext;
        this.restorantModels = restorantModels;
    }

    public void setOnCallbackListener(OnCallbackListener listener){this.listener=listener;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_restorant,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final RestorantModel restorantModel = restorantModels.get(position);
        holder.nama_restoran.setText(restorantModel.getNama());
        holder.cardViewRestoran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Detail.class);

                //passing data to detail
                Bundle bundle = new Bundle();
                bundle.putString("nama", restorantModel.getNama());
                bundle.putString("lokasi", restorantModel.getLocation());
                bundle.putString("kontak", restorantModel.getKontak());
                bundle.putString("caption", restorantModel.getCaption());
                bundle.putDouble("lat", restorantModel.getLat());
                bundle.putDouble("lng", restorantModel.getLng());
                bundle.putString("gambar", restorantModel.getImgActivityUrl());
                bundle.putString("web", restorantModel.getWeb());
                intent.putExtras(bundle);

                //start activity
                mContext.startActivity(intent);
            }
        });

        GlideApp.with(mContext)
                .asBitmap()
                .load(restorantModel.getImgActivityUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.gambar_restoran);
    }

    @Override
    public int getItemCount() {
        return restorantModels.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView nama_restoran;
        ImageView gambar_restoran;
        CardView cardViewRestoran;


        public ViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);

            nama_restoran = itemView.findViewById(R.id.restoran_name_id);
            gambar_restoran = itemView.findViewById(R.id.restoran_img_id);
            cardViewRestoran = itemView.findViewById(R.id.cardview_restoran_id);

        }

        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v) {
            if (listener!=null){
                listener.onClick(restorantModels.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {
        void onClick(RestorantModel restorantModel);
    }
    private void loadFragment (MainActivity activity, Fragment fragment) {
        //load fragment
        activity.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
