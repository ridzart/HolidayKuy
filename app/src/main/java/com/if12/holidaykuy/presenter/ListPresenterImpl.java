package com.if12.holidaykuy.presenter;


import android.content.Context;

import com.if12.holidaykuy.model.ListModel;
import com.if12.holidaykuy.view.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListPresenterImpl implements ListPresenter {
    private ListView listView;
    private Context mContext;

    private String[] nama = {
            "Kawah Putih", "Farmhouse", "Gedung Sate", "Tangkuban Parahu", "Jalan Braga", "Taman Hutan Raya Ir. H. Juanda", "Trans Studio", "Tebing Keraton",
            "Cihampelas Walk (CiWalk)", "Saung Angklung Udjo", "Museum Geologi", "Dago Dreampark"
    };

    private String[] location = {
            "Ciwidey", "Lembang", "Citarum", "Lembang", "Kota Bandung", "Ciburial", "Cibangkong", "Ciburial", "Cipaganti", "Pasirlayung", "Cihaur Geulis",
            "Pagerwangi"
    };

    private String[] actImg = {
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

    private String[] caption = {
            "Dummy caption 1",
            "Dummy caption 2",
            "Dummy caption 3",
            "Dummy caption 4",
            "Dummy caption 5",
            "Dummy caption 6",
            "Dummy caption 7",
            "Dummy caption 8",
            "Dummy caption 9",
            "Dummy caption 10",
            "Dummy caption 11",
            "Dummy caption 12"
    };

    private double[] lat = {
            -7.166574, -6.832954, -6.902463, -6.759487, -6.917103, -6.856578, -6.924922, -6.834039, -6.893243, -6.898021, -6.900707, -6.848443
    };

    private double[] lng = {
            107.404072, 107.605726, 107.618814, 107.616116, 107.608959, 107.632674, 107.636700, 107.663629, 107.605466, 107.654966, 107.621460, 107.626139
    };

    private List<ListModel> listModels = new ArrayList<>();

    public ListPresenterImpl(Context mContext, ListView listView){
        this.listView = listView;
        this.mContext = mContext;
        setData();
    }

    public void setData(){

        for (int i = 0; i < actImg.length; i++){

            ListModel listModel = new ListModel();
            listModel.setNama(nama[i]);
            listModel.setIdActivity(i + 1);
            listModel.setLocation(location[i]);
            listModel.setImgActivityUrl(actImg[i]);
            listModel.setCaption(caption[i]);
            listModel.setLat(lat[i]);
            listModel.setLng(lng[i]);

            listModels.add(listModel);
        }

    }

    @Override
    public void loadList() {listView.onLoadList(listModels);}

}
