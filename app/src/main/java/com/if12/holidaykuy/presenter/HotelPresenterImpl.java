package com.if12.holidaykuy.presenter;

import android.content.Context;
import com.if12.holidaykuy.model.HotelModel;
import com.if12.holidaykuy.view.HotelView;

import java.util.ArrayList;
import java.util.List;

public class HotelPresenterImpl implements HotelPresenter {

    private HotelView hotelView;
    private Context mContext;

    private String[] nama = {
            "S'Rizki Hotel", "Hotel Paranti", "Pandeglang Raya Hotel"
    };

    private String[] actiImg = {
            "https://origin.pegipegi.com/jalan/images/pict1L/Y2/Y914152/Y914152014.jpg",
            "https://1.bp.blogspot.com/-iJ5fzErZkWY/WQPmsdohqAI/AAAAAAAACAI/LOOsHrGPU8sOuNDTfoCF37sZrQrnfRg6QCLcB/s1600/images%2B%25281%2529.jpg",
            "https://fastly.4sqi.net/img/general/200x200/25437314_Z1DNHe-8ProyrPu2WBVGfp78Z4owdPzMSZuLPMySZUE.jpg"
    };

    private String[] location = {
            "Jl. Raya Serang KM1, Pandeglang, Kec. Pandeglang, Kabupaten Pandeglang, Banten",
            "Jl. Mayor Widagdo No.3, Kabayan, Kec. Pandeglang, Kabupaten Pandeglang, Banten",
            "Jl. Raya Labuan No. 7, Gardu Tanjak, Pandeglang, Pandeglang Sub-District, Pandeglang Regency, Banten "
    };

    private String[] kontak = {
            "0253206600", "0253201176", "081911194399"
    };

    private String[] web = {
            "http://rizhotelpandeglang.blogspot.com/", "Tidak memiliki alamat web", "https://pandeglang-raya-hotel.business.site/"
    };

    private String[] caption = {
            "Penginapan Yang Tenang Dan Nyaman di Pandeglang.\n" +
                    "\n" +
                    "Sebuah hunian yang nyaman, bersih, dan desain yang minimalis. Pandeglang S'Rizki Hotel menawarkan pelayanan yang istimewa dan fasilitas yang akan membuat pengalaman menginap Anda tidak terlupakan, seperti Wi-Fi gratis di semua kamar, TV, AC, kulkas, restoran, layanan kebersihan, resepsionis yang ramah, Wi-fi di tempat umum dan tempat parkir yang menjamin kenyamanan bagi Anda semua.",
            "Hotel yang berada di Kabupaten Pandeglang. Hotel ini merupakan salah satu hotel berbintang / bintang yang banyak direkomendasikan (hotel recommended) di Kabupaten Pandeglang. Dilengkapi dengan fasilitas penunjang seperti parkiran, listrik air lancar, wifi (jika tersedia), tempat tidur, lemari, TV, AC, kamar-kamar yang nyaman dan lainnya. Hotel Paranti menawarkan kamar hotel Kabupaten Pandeglang dengan harga yang murah karena ada potongan harga, diskon, dan promo dengan kualitas bagus dan terbaik.\n" +
                    "\n" +
                    "Cocok untuk menjadi tempat menginap dan istirahat bagi wisatawan, turis, backpacker, traveller, keluarga (family) dan lainnya. Cara booking hotel ini juga sangat mudah karna bisa dilakukan dengan mudah melalui aplikasi pemesanan dan booking online (jika tersedia). Booking dapat dilakukan baik untuk pemesanan kamar hotel harian dan mingguan. Hotel yang dekat dari Jl.Mayor Widagdo (3rd Jalan Mayor Jenderal Widagdo), Pandeglang, Banten INA, Indonesia ini bisa menjadi pilihan Anda untuk menginap di Kabupaten Pandeglang baik sendiri, group, kelompok dan keluarga.\n" +
                    "\n" +
                    "Segera kunjungi hotel terdekat ini (hotel near you) untuk informasi lainnya seperti informasi cari kamar hotel murah Kabupaten Pandeglang, harga sewa hotel, booking hotel Kabupaten Pandeglang, ketersediaan kamar, pesan / booking dan daftar hotel Kabupaten Pandeglang, fasilitas book now pay later dan lainnya. Anda juga bisa menghubungi kontak pengelola atau pengurus hotel ini untuk informasi lainnya atau melalui website jika tersedia.\n" +
                    "\n",
            "Pandeglang Raya hotel, penginapan yang berlokasi di pusat kota Pandeglang memiliki suasana yang asri juga lokasi yang strategis serta memiliki area parkir yang luas akan memberi kenyamanan lebih untuk Anda. Terdapat beberapa pilihan kamar dari VIP, Utama, Hingga Ekonomi, dengan fasilitas AC, TV, Kipas Angin, dan Extra Bed Disini juga terdapat MEETING ROOM yang berkapasitas 80  orang."
    };

    private Double[] lat = {
            -6.298974, -6.309808, -6.313498
    };

    private Double[] lng = {
            106.110394, 106.109111, 106.103395
    };

    private List<HotelModel> hotelModels = new ArrayList<>();

    public HotelPresenterImpl(Context mContext, HotelView hotelView) {
        this.hotelView = hotelView;
        this.mContext = mContext;
        setData();
    }

    public void setData(){

        for (int i = 0; i < actiImg.length; i++){

            HotelModel hotelModel = new HotelModel();
            hotelModel.setNama(nama[i]);
            hotelModel.setImgActivityUrl(actiImg[i]);
            hotelModel.setLocation(location[i]);
            hotelModel.setKontak(kontak[i]);
            hotelModel.setWeb(web[i]);
            hotelModel.setCaption(caption[i]);
            hotelModel.setLat(lat[i]);
            hotelModel.setLng(lng[i]);

            hotelModels.add(hotelModel);
        }

    }

    @Override
    public void loadHotel() {hotelView.onLoadHotel(hotelModels);
    }
}
