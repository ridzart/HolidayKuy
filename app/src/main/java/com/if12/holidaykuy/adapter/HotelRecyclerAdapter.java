package com.if12.holidaykuy.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.if12.holidaykuy.GlideApp;
import com.if12.holidaykuy.MapsActivity;
import com.if12.holidaykuy.R;
import com.if12.holidaykuy.model.HotelModel;

import java.util.List;

public class HotelRecyclerAdapter extends RecyclerView.Adapter<HotelRecyclerAdapter.ViewHolder> {

    private Context mContext;
    private List<HotelModel> hotelModels;
    private HotelRecyclerAdapter.OnCallbackListener listener;

    public HotelRecyclerAdapter(Context mContext, List<HotelModel> hotelModels) {
        this.mContext = mContext;
        this.hotelModels = hotelModels;
    }

    public void setOnCallbackListener(OnCallbackListener listener){this.listener=listener;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_hotel,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HotelModel hotelModel = hotelModels.get(position);
        holder.hotel_title.setText(hotelModel.getTitle());
        holder.cardViewHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MapsActivity.class);
                mContext.startActivity(intent);
            }
        });

        GlideApp.with(mContext)
                .asBitmap()
                .load(hotelModel.getImgUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.img_hotel_thumbnail);

    }

    @Override
    public int getItemCount() {
        return hotelModels.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView hotel_title;
        ImageView img_hotel_thumbnail;
        CardView cardViewHotel;

        public ViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);

            hotel_title = itemView.findViewById(R.id.hotel_title_id);
            img_hotel_thumbnail = itemView.findViewById(R.id.hotel_img_id);
            cardViewHotel = itemView.findViewById(R.id.cardview_hotel_id);

        }

        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v) {
            if (listener!=null){
                listener.onClick(hotelModels.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {
        void onClick(HotelModel hotelModel);
    }

}
