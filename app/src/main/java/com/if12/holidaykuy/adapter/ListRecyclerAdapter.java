package com.if12.holidaykuy.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.if12.holidaykuy.Detail;
import com.if12.holidaykuy.DetailHotelFragment;
import com.if12.holidaykuy.GlideApp;
import com.if12.holidaykuy.MainActivity;
import com.if12.holidaykuy.MapsActivity;
import com.if12.holidaykuy.R;
import com.if12.holidaykuy.model.ListModel;

import java.util.List;

public class ListRecyclerAdapter extends RecyclerView.Adapter<ListRecyclerAdapter.ViewHolder> {
    private List<ListModel> listModels;
    private OnCallbackListener listener;
    private Context mContext;

    public ListRecyclerAdapter(Context mContext, List<ListModel> listModels) {
        this.listModels = listModels;
        this.mContext = mContext;
    }

    public void setOnCallbackListener(OnCallbackListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_activity, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final ListModel listModel = listModels.get(position);
        holder.nama_wisata.setText(listModel.getNama());
        holder.cardViewWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Detail.class);

                //passing data to detail
                Bundle bundle = new Bundle();
                bundle.putString("nama", listModel.getNama());
                bundle.putString("lokasi", listModel.getLocation());
                bundle.putString("kontak", listModel.getKontak());
                bundle.putString("caption", listModel.getCaption());
                bundle.putDouble("lat", listModel.getLat());
                bundle.putDouble("lng", listModel.getLng());
                bundle.putString("gambar", listModel.getImgActivityUrl());
                bundle.putString("web", listModel.getWeb());
                intent.putExtras(bundle);

                //start activity
                mContext.startActivity(intent);
            }
        });
        //holder.BtnTracking.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  Intent intent = new Intent(mContext, MapsActivity.class);
                //passing data to maps
                //Bundle bundle = new Bundle();
                //bundle.putDouble("lat", listModel.getLat());
                //bundle.putDouble("lng", listModel.getLng());
                //bundle.putString("nama", listModel.getNama());
                //intent.putExtras(bundle);
                //start the activity
                //mContext.startActivity(intent);

            //}
        //});

        GlideApp.with(mContext)
                .asBitmap()
                .load(listModel.getImgActivityUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.gambar_wisata);


//        holder.blurView.setupWith(holder.root)
//                .setBlurAlgorithm(new RenderScriptBlur(mContext))
//                .setBlurRadius(15f)
//                .setHasFixedTransformationMatrix(true);



    }

    @Override
    public int getItemCount() {
        return (listModels == null) ? 0 : listModels.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView nama_wisata;
        ImageView gambar_wisata;
        CardView cardViewWisata;


        public ViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);

            nama_wisata = itemView.findViewById(R.id.wisata_name_id);
            gambar_wisata = itemView.findViewById(R.id.wisata_img_id);
            cardViewWisata = itemView.findViewById(R.id.cardview_wisata_id);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(listModels.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {
        void onClick(ListModel listModel);
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