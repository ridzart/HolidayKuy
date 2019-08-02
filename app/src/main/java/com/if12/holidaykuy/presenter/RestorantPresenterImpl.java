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
            "Saung Banyu Djawi", "S'Rizki Restoran", "Dapur Liwet Pandeglang", "Dapoer Iboe Resto", "Mc Bamm Corner Cafe", "RM Abah Udin",
            "RM Rizquna", "Ayam Bakar Pak Raden"
    };

    private String[] lokasi = {
            "Jl. Jend. Sudirman Komplek Perkantoran Cikupa Dpn Dinas ", "Jl. Raya Serang KM. 01, No. 26, Picung, Pandeglang, Kec. Pandeglang, Kabupaten Pandeglang, Banten",
            "Jl. Bank Banten No.3-2, Kabayan, Kec. Pandeglang, Kabupaten Pandeglang, Banten", "Jl. Kyai H. Moh. Idrus No.2, Pandeglang, Kec. Pandeglang, Kabupaten Pandeglang, Banten",
            "Pandeglang, Kec. Pandeglang, Kabupaten Pandeglang, BantenKabupaten Pandeglang, Banten", "Jl. AMD Lintas Tim. No.777, Kabayan, Kec. Pandeglang, Kabupaten Pandeglang, Banten",
            "JL Raya Labuan, Km. 4, Cipacung, Saruni, Pandeglang, Kabupaten Pandeglang, Banten", "Jalan Raya Labuan KM.2, Karaton, Majasari, Karaton, Kabupaten Pandeglang, Banten"
    };

    private String[] kontak = {
            "087773942098", "0253203210", "087772555898", "0253204321", "08176815508", "Tidak ada kontak", "087871687007", "081906063149"
    };

    private String[] web = {
            "https://www.facebook.com/pg/saungbanyudajwi", "https://rumah-makan-s-rizki-pandeglang.business.site/", "Tidak memiliki alamat web",
            "Tidak memiliki alamat web", "Tidak memiliki alamat web", "Tidak memiliki alamat web", "Tidak memiliki alamat web", "Tidak memiliki alamat web"
    };

    private String[] caption = {
            "Saung Banyu Djawi merupakan rumah makan dengan desain dan hidangan yang berbeda sama sekali. Luas, asri dan santai, yaitu dengan keberadaan lesehan",
            "Restoran “S” Rizki Pandeglang terletak di kawasan Pandeglang terpatnya di Jalan Raya Serang Km. 1 No. 26 Curugsawer, Pandeglang – Banten bersebelahan dengan kantor Pengadilan Tinggi Negeri dan depan kantor Kejaksaan Pandeglang.\n" +
                    "\n" +
                    "Konsep awal usaha ini adalah Rumah Makan Keluarga, dengan Aneka macam makanan dan minuman, tetapi dengan berkembangnya pertumbuhan ekonomi di Daerah, akhirnya rumah makan ini tidak hanya berbisnis dibidang kuliner saja, juga mulai mengembangkan usaha dibidang lain seperti membuka Butik, tempat penginapan dan Hotel.\n" +
                    "\n" +
                    "Visi:\n" +
                    "Menjadikan Hotel dan Restoran yang presentatif, dalam rasa lebih mengutamakan kualitas dan kuantitas.\n" +
                    "\n" +
                    "Misi:\n" +
                    "Mengutamakan 4 kepuasan : Tamu Puas, Karyawan Puas, Investor Puas dan Pemerintah Puas.",
            "Bagi kalian yang ingin menikmati nasi liwet yang enak, murah dan terjangkau kini tak perlu jauh-jauh untuk pergi ke Kota Solo. Kini kenikmatan nasi liwet yang enak, praktis bisa ditemui di Dapur Nasi Liwet yang beralamat Jl. Bank Banten No. 3, Pandeglang, Kec. Pandeglang, Kabupaten Pandeglang tepat disamping SMAN YPP.\n" +
                    "\n" +
                    "Dapur Nasi Liwet buka dari hari senin-sabtu, mulai pukul 10.00 pagi – 20.00 malam. Menu yang tersedia pun variatif ada paket nasi liwet cumi asin, dan ada paket nasi liwet ayam goreng, selain itu tersedia juga tahu tempe sebagai menu pelengkap. Harga nasi liwetnya pun cukup terjangkau, hanya dengan Rp. 15.000 – Rp. 20.000 saja kalian sudah bisa menikmatinya dengan kenyang.",
            "Letaknya yang sangat strategis yakni di jantung Kota Pandeglang tepatnya di samping alun-alun Berkah Pandeglang, memudahkan para pecinta kuliner untuk mencicipi menu yang ditawarkan. Ya, Dapoer Iboe resto, cookies, cake, dan bakery ini menawarkan berbagai menu makanan yang bervariatif.\n" +
                    "\n" +
                    "Mulai dari makanan Sunda hingga Eropa. Sebut saja gurame goreng cobek dan otak-otak khas Dapoer Iboe yang disajikan bersama jus sirsak sehat yang siap menggoyang lidah. Saya sendiri sudah beberapa kali nongkrong disini bersama keluarga dan juga kadang teman-teman yang lain. Karena tempatnya cukup nyaman walaupun berada di jantung kota.\n" +
                    "\n" +
                    "Dalam jam operasinya, restoran yang berdiri sejak Juli 2008 ini buka setiap hari dari 09.30-22.00.",
            "Mc Bamm Corner merupakan salah satu tempat nongkrong favorit yang ada di Pandeglang. Di sini menjual beraneka macam makanan khas Pandeglang seperti nasi bakar, nasi ceker, apem, dll. Suasana cafenya sangat nyaman untuk berkumpul bersama keluarga dan kawan-kawan.",
            "Warung nasi Abah Udin berada sekitar 50 meter dari lampu merah kadubanen ini berada di lintasan Jalan AMD Lintas Timur.\n" +
                    "ada lokasi parkir yang dapat memuat mobil sekitar hingga tujuh mobil. lokasi di dalamnya luas ada tempat lesehan, ada juga tersedia meja dan kursi, kemudian juga ada saung-saung Gazebo di sampingnya untuk makan bersama keluarga dan grup, ada juga mushola kecil, saya pernah menjadi imam di mushola tersebut ketika bulan puasa, di samping mushola adalah jurang. ada toilet tentunya, untuk menu makanannya bervariasi mengutamakan olahan jenis ikan ikan laut bakar, cumi, udang, ayam, pepes ikan, ikan asin,olahan ikan air tawar, rasanya enak, mantap, harganya hemat terjangkau.\n" +
                    "\n" +
                    "lokasi ini biasanya ramai dikunjungi Pada saat jam makan siang.\n" +
                    "\n" +
                    "Berhati-hatilah saat Anda keluar dari lokasi parkir rumah makan ini karena jalurnya dekat dengan lampu merah di mana mobil terkadang keluar masuk dari dua arah.\n" +
                    "\n" +
                    "di dekat dengan lokasi ini ada terminal kadubanen, ada Alfamart kadubanen, dan juga SPBU, pengisian bensin kadubanen. Selamat menikmati hidangan makannya di warung nasi Abah Udin",
            "Senin\n" +
                    "08:00 - 21:00\n" +
                    "Selasa\n" +
                    "08:00 - 21:00\n" +
                    "Rabu\n" +
                    "08:00 - 21:00\n" +
                    "Kamis\n" +
                    "08:00 - 21:00\n" +
                    "Jumat\n" +
                    "08:00 - 21:00\n" +
                    "Sabtu\n" +
                    "08:00 - 21:00\n" +
                    "Minggu\n" +
                    "08:00 - 21:00",
            "Ayam bakar dan goreng Pak Raden adalah salah satu tempat makan di ceqek Pandeglang lokasi dalemnya cukup luas terdapat beberapa kursi dan meja dan kita bisa memesan makanan di sini langsung makan di tempat atau kita juga bisa memesan untuk dibawa pulang melalui telepon juga bisa saya sering memesan ayam bakar maupun Ayam gorengnya per ekor dan diantar langsung ke lokasi pemesan instal di charge waterpark Cikole harganya relatif terjangkau Kalau tidak salah harga untuk satu ekor bisa Rp45.000. sebagai pelengkap kita juga diberikan lalapan dan sambal.\n" +
                    "\n" +
                    "Kekurangan dari tempat ini adalah tidak ada lokasi parkir jaraknya hanya 4 meter dari jalan raya paling bisa dimuat oleh dua mobil saja. Selamat menikmati ayam bakar dan ayam goreng Pak Raden"
    };

    private String[] gambar = {
            "https://fastly.4sqi.net/img/general/width960/4709074_JzTcmjprmROfUtnzZL7kIZGFjSzKmUcP9uFwxGPTAxI.jpg",
            "https://lh6.googleusercontent.com/-qOd0Tc452uo/TYG0gMWM4PI/AAAAAAAAAFU/iziK2Ph37g4/s1600/SL380013.JPG",
            "https://badakpos.com/wp-content/uploads/2018/04/IMG-20180428-WA0027.jpg",
            "https://1.bp.blogspot.com/-EeJgnRV_QqE/UcSXtn4NTEI/AAAAAAAAHig/nrwTeHLYuGI/s1600/dapoer.jpg",
            "https://www.jejakpiknik.com/wp-content/uploads/2019/04/mm-1-1-630x380.jpg",
            "https://fastly.4sqi.net/img/general/width960/21735309_6o5Rg3L-c9ES-tQSQsGYYCFdBo7zll90RC-KGgblfps.jpg",
            "https://fastly.4sqi.net/img/general/1398x536/951949_66OkdJHmnV6O_u4StbztMLpoES-I9EQs8waS9N1Q7So.jpg",
            "https://fastly.4sqi.net/img/general/width960/2458976_784vSaKL7GhNitzi7bmGRc6XMFjmq_gs16mV4T4bzKQ.jpg"
    };

    private Double[] lat = {
            -6.313395, -6.298974, -6.310711, -6.310754, -6.306290, -6.319060, -6.3304162, -6.319681
    };

    private Double[] lng = {
            -106.100820, 106.110394, 106.108438, 106.106439, 106.105876, 106.118467, 106.081101, 106.098817
    };


    private List<RestorantModel> restorantModels = new ArrayList<>();

    public RestorantPresenterImpl(Context mContext, RestorantView restorantView) {
        this.resorantView = restorantView;
        this.mContext = mContext;
        setData();
    }

    public void setData(){

        for (int i = 0; i < gambar.length; i++){

            RestorantModel restorantModel = new RestorantModel();
            restorantModel.setNama(nama[i]);
            restorantModel.setIdgrid(i);
            restorantModel.setImgActivityUrl(gambar[i]);
            restorantModel.setLocation(lokasi[i]);
            restorantModel.setKontak(kontak[i]);
            restorantModel.setWeb(web[i]);
            restorantModel.setCaption(caption[i]);
            restorantModel.setLat(lat[i]);
            restorantModel.setLng(lng[i]);

            restorantModels.add(restorantModel);
        }

    }

    @Override
    public void loadRestorant() {
        resorantView.onLoadRestorant(restorantModels);
    }
}
