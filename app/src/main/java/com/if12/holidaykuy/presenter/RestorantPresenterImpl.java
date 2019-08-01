package com.if12.holidaykuy.presenter;

import android.content.Context;
import com.if12.holidaykuy.model.RestorantModel;
import com.if12.holidaykuy.view.RestorantView;

import java.util.ArrayList;
import java.util.List;

public class RestorantPresenterImpl implements RestorantPresenter{

    private RestorantView resorantView;
    private Context mContext;

    private String[] nama = {
            "Ciwidey", "Lembang", "Citarum", "Lembang", "Kota Bandung", "Ciburial", "Cibangkong", "Ciburial", "Cipaganti", "Pasirlayung", "Cihaur Geulis",
            "Pagerwangi"
    };

    private String[] img = {
            "https://i.pinimg.com/originals/b2/e3/d0/b2e3d0e29c003798a16b513f1713e99f.jpg",
            "https://i.pinimg.com/originals/da/e2/bb/dae2bbed8199723e8c3066a3fb09098d.jpg",
            "https://i.pinimg.com/originals/22/7f/b2/227fb2e695b5ad6186cb5c3557ffa48b.jpg",
            "https://i.pinimg.com/originals/4f/04/83/4f048313ba7bb63283f19705e022bc53.jpg",
            "https://www.nativeindonesia.com/wp-content/uploads/2018/09/Jalan-Braga-1.jpg",
            "https://airebobichon.files.wordpress.com/2017/08/6-tahuradjuanda-jabarprov-go-id.jpg",
            "https://meloaku.com/wp-content/uploads/2017/12/trans-studio-bandung-e1512473316400.jpg",
            "https://media.travelingyuk.com/wp-content/uploads/2019/02/mulkisalman_46707263_339891393459402_2875645931633848811_n-1.jpg",
            "https://meloaku.com/wp-content/uploads/2017/12/Cihampelas-Walk-Bandung.jpg",
            "https://meloaku.com/wp-content/uploads/2017/12/art-performance-saung-angklung-udjo-bandung.jpg",
            "https://idetrips.com/wp-content/uploads/2018/10/Museum-Geologi-Bandung.jpg",
            "https://22arahmadini.files.wordpress.com/2017/06/img20170629115542.jpg?w=1400"
    };

    private List<RestorantModel> restorantModels = new ArrayList<>();

    public RestorantPresenterImpl(Context mContext, RestorantView restorantView) {
        this.resorantView = restorantView;
        this.mContext = mContext;
        setData();
    }

    public void setData(){

        for (int i = 0; i < img.length; i++){

            RestorantModel restorantModel = new RestorantModel();
            restorantModel.setNamarestorant(nama[i]);
            restorantModel.setIdgrid(i);
            restorantModel.setImgUrl(img[i]);

            restorantModels.add(restorantModel);
        }

    }

    @Override
    public void loadRestorant() {
        resorantView.onLoadRestorant(restorantModels);
    }
}
