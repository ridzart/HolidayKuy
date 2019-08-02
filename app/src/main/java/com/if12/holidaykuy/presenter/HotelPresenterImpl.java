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
            "S'Rizki Hotel", "Hotel Paranti", "Pandeglang Raya Hotel", "Mutiara Carita", "Kalicaa Villa", "Villa Carita Asri", "Villa Lippo Carita", "Horison Altama"
    };

    private String[] location = {
            "Jl. Raya Serang KM1, Pandeglang, Kec. Pandeglang, Kabupaten Pandeglang, Banten",
            "Jl. Mayor Widagdo No.3, Kabayan, Kec. Pandeglang, Kabupaten Pandeglang, Banten",
            "Jl. Raya Labuan No. 7, Gardu Tanjak, Pandeglang, Pandeglang Sub-District, Pandeglang Regency, Banten",
            "Jl. Raya Carita Km. 07, Carita, Kabupaten Pandeglang, Banten",
            "Tanjungjaya, Pandeglang, Kabupaten Pandeglang, Banten ",
            "Jl. Raya Labuan KM. 12, RT.11 / RW.04, Kec. Carita, Sukarame, Pandeglang, Banten",
            "Jl. Raya Carita No.Km.09, Sukajadi, Carita, Kabupaten Pandeglang, Banten",
            "Kadumerak, Karangtanjung, Kabupaten Pandeglang, Banten"
    };

    private String[] kontak = {
            "0253206600", "0253201176", "081911194399", "082111500461", "0253881771", "0253802147", "081297207373", "0253202000"
    };

    private String[] web = {
            "http://rizhotelpandeglang.blogspot.com/", "Tidak memiliki alamat web", "https://pandeglang-raya-hotel.business.site/", "www.mutiara-carita.com/",
            "http://www.kalicaavilla.com/", "http://www.caritaasri.com/", "Tidak memiliki alamat web", "https://myhorison.com/"
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
            "Pandeglang Raya hotel, penginapan yang berlokasi di pusat kota Pandeglang memiliki suasana yang asri juga lokasi yang strategis serta memiliki area parkir yang luas akan memberi kenyamanan lebih untuk Anda. Terdapat beberapa pilihan kamar dari VIP, Utama, Hingga Ekonomi, dengan fasilitas AC, TV, Kipas Angin, dan Extra Bed Disini juga terdapat MEETING ROOM yang berkapasitas 80  orang.",
            "Mutiara Carita Cottages memiliki kolam renang luar ruangan, fasilitas olahraga air, dan area pantai pribadi. Tersedia berbagai kegiatan seperti biliar, memancing, dan pijat. Resor alam ini menawarkan suasana santai dengan pemandangan pegunungan, pantai, dan laut.\n" +
                    "\n" +
                    "Suite-suitenya yang luas memiliki AC dan teras dengan pemandangan taman. TV kabel/satelit dan area tempat duduk juga tersedia. Kamar mandinya dilengkapi dengan shower.\n" +
                    "\n" +
                    "Mutiara Carita Cottages dapat dicapai dalam 3,5 jam berkendara dari Bandara Internasional Soekarno Hatta. Tempat parkir di akomodasi tersedia gratis.\n" +
                    "\n" +
                    "Anda dapat merencanakan wisata sehari di meja layanan wisata atau memesan layanan laundry. Resepsionis beroperasi 24 jam.\n" +
                    "\n" +
                    "Restoran di akomodasi menyajikan hidangan Indonesia. Layanan kamar juga tersedia.",
            "Menawarkan vila-vila pribadi dengan kolam renang kecil pribadi atau kolam renang, Resor Kalicaa Villa bintang-4 menawarkan akomodasi mewah di Banten. Resor ini memiliki restoran dan Wi-Fi gratis di lobi.\n" +
                    "\n" +
                    "Interior modern dan sentuhan warna yang menenangkan hadir di seluruh vila-vilanya yang luas. Semuanya dilengkapi dengan ruang makan, dapur yang lengkap, dan ruang tamu. Bathtub dan fasilitas shower terdapat di kamar mandi en suiten.\n" +
                    "\n" +
                    "Dengan meja depan 24-jam, staf dapat mengatur berbagai kegiatan olahraga air dan pemesanan wisata. Layanan penyewaan mobil dan pramutamu juga tersedia berdasarkan permintaan.\n" +
                    "\n" +
                    "Menghadap ke Pantai Kalicaa, Bale Bale Restaurant & Bar menyajikan pilihan hidangan Indonesia dan internasional.\n" +
                    "\n" +
                    "Resor Kalicaa Villa, Tanjung Lesung berada dalam jarak 2 menit berjalan kaki dari Pantai Kalicaa dan berjarak 30 menit berkendara dari gerai perbelanjaan di Kota Labuan. Bandara Internasional Soekarno Hatta dapat dicapai dalam waktu 2 jam berkendara.",
            "Carita Asri Villas & Resort terletak di Banten dan menawarkan kolam renang luar ruangan, taman, pusat kebugaran, serta area pantai pribadi. Fasilitas di resor ini termasuk restoran, layanan resepsionis 24 jam, dapur bersama, dan Wi-Fi gratis. Akomodasi ini menyediakan staf hiburan dan layanan pramutamu.\n" +
                    "\n" +
                    "Kamar-kamar di resor ini memiliki area tempat duduk dan TV. Semua kamar ber-AC dan dilengkapi dengan lemari pakaian.",
            "Villa Lippo Carita Anyer terletak di Carita dan memiliki fasilitas barbekyu. Vila bintang 2 ini menyuguhkan pemandangan taman dan berjarak 32 km dari Anyer.\n" +
                    "\n" +
                    "Vila dilengkapi dengan TV satelit, AC, dan dapur.\n" +
                    "\n" +
                    "Anda dapat bersantai di taman.",
            "Hotel bintang 3 dengan layanan penuh dengan harga terjangkau. Memenuhi kebutuhan hotel dengan brand Horison untuk bintang 3, Horison Ultima di bintang 4 dan Grand Horison untuk bintang 5 yang melayani kebutuhan hotel mewah dengan spektrum penuh, pelayanan superior dilengkapi fasilitas lainnya.\n" +
                    "\n" +
                    "Mengenai Metropolitan Golden Management\n" +
                    "\n" +
                    "Metropolitan Golden Management berpengalaman dalam manajemen hotel dengan lebih dari 14 tahun. Komponen utama yang terdapat di dalamnya yaitu kombinasi standar Internasional dengan budaya lokal.\n" +
                    "\n" +
                    "Hingga saat ini, Metropolitan Golden Management mengoperasikan lebih dari 50 hotel dengan jumlah 5.733 kamar. Sebagai perusahaan yang sedang berkembang, Metropolitan Golden Management juga akan mengembangkan lebih dari 10 hotel lagi. Terdapat empat nama brand hotel yang beroperasi dibawah manajemen, yaitu Horison, @Hom Hotel, Aziza Hotel, Horison Express (Horex), Erbe Style dan beberapa hotel lain dengan brand managed by Horison."
    };

    private String[] actiImg = {
            "https://origin.pegipegi.com/jalan/images/pict1L/Y2/Y914152/Y914152014.jpg",
            "https://1.bp.blogspot.com/-iJ5fzErZkWY/WQPmsdohqAI/AAAAAAAACAI/LOOsHrGPU8sOuNDTfoCF37sZrQrnfRg6QCLcB/s1600/images%2B%25281%2529.jpg",
            "https://fastly.4sqi.net/img/general/200x200/25437314_Z1DNHe-8ProyrPu2WBVGfp78Z4owdPzMSZuLPMySZUE.jpg",
            "https://q-ak.bstatic.com/images/hotel/max1024x768/206/206141235.jpg",
            "https://r-ak.bstatic.com/images/hotel/max1024x768/946/94645996.jpg",
            "https://q-ak.bstatic.com/images/hotel/max1280x900/209/209373298.jpg",
            "https://q-ak.bstatic.com/images/hotel/max1280x900/130/130362053.jpg",
            "https://myhorison.com/assets/images/room/room-2.jpg"
    };

    private Double[] lat = {
            -6.298974, -6.309808, -6.313498, -6.316592, -6.480381, -6.283279, -6.303067, -6.285055
    };

    private Double[] lng = {
            106.110394, 106.109111, 106.103395, 105.833318, 105.652275, 105.827135, 105.843976, 106.117998
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
