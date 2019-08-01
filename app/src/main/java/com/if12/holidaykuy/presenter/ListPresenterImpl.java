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
            "Pulau Peucang", "Pulau Umang", "Pulau Badul", "Pantai Carita", "Kampung Domba", "Taman Bunga", "Curug Putri Tahura", "Curug Ciajeung",
            "Air Panas Cisolong", "Kolam Renang Cikoromoy", "CAS Waterpark"
    };

    private String[] location = {
            "Ujungjaya, Sumur, Kabupaten Pandeglang, Banten", "Sumberjaya, Sumur, Kabupaten Pandeglang, Banten",
            "Kec. Sumur, Pandeglang, Banten", "Sukarame, Carita, Kabupaten Pandeglang, Banten", "Juhut, Karangtanjung, Kabupaten Pandeglang, Banten",
            "Jl. Kadukawang, Sukasari, Kaduhejo, Kabupaten Pandeglang, Banten", "Jl. Raya Carita No.KM, Sukarame, Carita, Kabupaten Pandeglang, Banten",
            "Cinoyong, Carita, Kabupaten Pandeglang, Banten", "Sukamanah, Kaduhejo, Kabupaten Pandeglang, Banten", "Jalan Batu Tulis, Lebak, Munjul, Kabupaten Pandeglang, Banten",
            "Jl. AMD Lintas Timur Cikole, Sukaratu, Majasari, Kabupaten Pandeglang, Banten"
    };

    private String[] kontak = {
            "Tidak ada kontak", "022153153008", "Tidak ada kontak", "Tidak ada kontak", "Tidak ada kontak", "089666004372", "Tidak ada kontak", "082114543652",
            "087774891194", "085210122941", "085710416308"
    };

    private String[] web = {
            "Tidak ada alamat web", "https://www.pulau-umang.com/", "Tidak ada alamat web", "Tidak ada alamat web", "Tidak ada alamat web", "Tidak ada alamat web",
            "Tidak ada alamat web", "Tidak ada alamat web", "Tidak ada alamat web", "Tidak ada alamat web", "http://caswaterpark.com/"
    };

    private String[] actImg = {
            "http://liputanbanten.co.id/wp-content/uploads/2017/04/Wisata-Pulau-Peucang-Banten.jpg",
            "https://2.bp.blogspot.com/-4Jbc5N6D9kY/VH17oHO_WtI/AAAAAAAAAF8/e7LuGqmprvo/s1600/Pulau%2BUmang%2BBanten.JPG",
            "https://tempatwisataseru.com/wp-content/uploads/2018/11/Pulau-Badul-via-@ujungkulon_adventure.jpg",
            "https://2.bp.blogspot.com/-s7B9rO6UuzM/XFfsbRrdFVI/AAAAAAAAAbs/EUQpH9lrPzYK-mvf8xj8USKagnHZZCqNQCLcBGAs/s1600/pemandangan%2Bpantai%2Bbebatuan-min.jpeg",
            "https://1.bp.blogspot.com/-s8VrRNQdQiE/WFnnuoHqMxI/AAAAAAAAAWk/FKIWrNtgV7UcBqUEv2P1rLsO3ABydloOwCLcB/s1600/kampung%2Bdomba%2Bpandeglang.png",
            "https://backpackerjakarta.com/wp-content/uploads/2019/03/IMG-20190305-WA0061.jpg",
            "https://explorewisata.com/wp-content/uploads/2018/08/curug-putri-tahura-carita-pandeglang.jpg",
            "https://tempatwisataseru.com/wp-content/uploads/2018/11/Curug-Ciajen-Kembar-via-@muhamadsubana.jpg",
            "https://travelspromo.com/wp-content/uploads/2019/05/Berbagai-jenis-kolam-air-panas-gunung-torong-Danu-Umbara-768x480.jpg",
            "https://tempatwisataseru.com/wp-content/uploads/2018/11/Pemandian-Cikoromoy-via-@rizkido_27.jpg",
            "https://tempatwisataseru.com/wp-content/uploads/2018/11/Wisata-CAS-Water-Park-via-@Caswaterpark.jpg"
    };

    private String[] caption = {
            "Pulau Peucang adalah bagian dari kawasan Taman Nasional Ujung Kulon, di pulau ini dapat dijumpai berbagai satwa seperti Rusa Banteng Jawa, Merak Hijau, Lutung, Kijang, Babi Hutan, Biawak dan berbagai macam Burung. Binatang - binatang tersebut itu berkeliaran disekitar peninapan, Pulau Peucang pun memiliki hutan di tengah pulaunya, Hutan Pulau Peucang merupakan salah satu ekosistem hutan hujan tropis dataran rendah, dan terdapat pohon Kiara yang terkenal.\n" +
                    "Yang Paling menarik dari Pulau Peucang adalah Pantai di pulau ini bener - bener bagus pake BGT, ini adalah salah satu pantai terbaik yang pernah di kunjungi, hamparan pasir putih bersih tidak ada sampah sedikitpun, dengan air laut biru kehijauan, di pantai ini kita bisa berenang, menyelam, memancing, dan snorkeling.",
            "Pulau Umang memiliki pemandangan alam yang sangat indah dengan hamparan pasir putih dan air laut yang biru jernih. Ombaknya pun relatif kecil sehingga aman dan nyaman untuk berwisata bersama keluarga.\n" +
                    "\n" +
                    "Selain itu, terumbu karang di sekitar Pulau Umang indah dan masih sangat alami. Anda bisa menikmati keindahan alam bawah laut yang mempesona dan mengabadikannya dengan kamera bawah laut.\n" +
                    "\n" +
                    "Indahnya matahari yang terbenam adalah daya tarik lain di pulau ini. Anda dapat menimatinya dari gazebo yang banyak tersedia di sekitar pantai.\n" +
                    "\n" +
                    "Pulau Umang memiliki fasilitas yang cukup memadai. Jika anda ingin bermalam di Pulau Umang, terdapat beberapa penginapan berupa resort dan cottage yang menghadap ke laut lepas. Resort-resort di Pulau Umang dilengkapi dengan fasilitas yang lengkap dan modern seperti TV satelit, beach club, toko obat, lounge dan spa. Anda juga bisa berkemah karena di pulau ini terdapat camping ground yang cukup luas dan aman.",
            "Pulau Badul merupakan pulau kecil yang berada di sekitaran Taman Nasional Ujung Kulon. Meskipun pulau ini berukuran kecil dan bisa dikeliling dengan berjalan kaki namun ternyata keindahan yang disajikan dijamin akan membuat anda kagum.\n" +
                    "\n" +
                    "Sebab pulau ini tampak menyerupai gundukan pasir di tengah laut dan terlihat gersang. Terdapat semak belukar yang tumbuh di bagian tengah pulau.\n" +
                    "\n" +
                    "Meskipun perahu tidak bisa bersandar di Pulau Badul namun pengunjung masih bisa berenang sejauh 25 meter untuk mencapai pulau ini. Rasa lelah setelah berenang akan terbayarkan dengan pemandangan indah yang mungkin belum pernah anda temukan.",
            "Pantai Carita merupakan salah satu tempat terbaik untuk menyaksikan keindahan Gunung Krakatau yang begitu fenomenal. Pantai yang berada di pesisir barat wilayah Pandeglang ini ternyata juga berhadapan dengan Selat Sunda.\n" +
                    "\n" +
                    "Kondisi tersebut menjadikan Pantai Carita memiliki ombak yang tidak begitu besar serta kondisi pantai yang landai. Untuk menuju ke Pantai Carita, anda bisa menggunakan mobil pribadi atau bus dan mikrobus. Saat tiba di Pantai Carita, anda bisa melihat hamparan pantai yang indah.\n" +
                    "\n" +
                    "Bahkan wisata anda semakin lengkap di Pantai Carita dengan bersnorkeling untuk melihat taman bawah laut yang juga tak kalah indah. Tak hanya snorkeling, wisatawan juga bisa melakukan aktivitas lain di pantai ini seperti banana boat, jet ski dan berselancar.",
            "kampung domba adalah salah satu tempat yang lagi nge-hits sekarang apalagi untuk anak muda. Lokasinya berada di Kampung Cinyurup, Kelurahan Juhut, Kecamatan Karangtanjung, Pandeglang, Banten.\n" +
                    "\n" +
                    "Kampung Cinyurup, Juhut, Pandeglang, Banten sendiri ditetapkan sebagai kampung domba, karena sebagian besar masyarakatnya secara turun-temurun beternak domba, sehingga tidak heran jika tempat ini mendapat dukungan dari Pemprov Banten. Nah, pupuk kandang dari peternakan itu dimanfaatkan oleh warga sebagai pupuk kompos. Selain itu, pupuk kandang itu juga digunakan menjadi biogas yang dimanfaatkan untuk memenuhi kebutuhan memasak sehari-hari layaknya bahan bakar gas pada umumnya.\n" +
                    "\n" +
                    "Kalau, soal suasana sejuk alamnya jangan diragukan lagi, dengan lokasinya yang berada di kawasan Gunung Karang dan diapit oleh dua gunung Aseupan dan Pulosari tentu akan mampu memanjakkanmu untuk tidak cepat beranjak dari tempat ini.\n" +
                    "\n" +
                    "Kampung domba menyimpan banyak sekali potensi alam, mulai dari sumber air, kawasan hutan lindung, hortikultura, peternakan, perkebunan, dan lainnya. So, tempat ini cocok buat kamu, karena kamu dapat melihat langsung bagaimana cara beternak, sapi, domba, kelinci, atau budidaya sayur-mayur, dan lain sebagainya.\n" +
                    "\n" +
                    "Kampung domba menyimpan banyak sekali potensi alam, mulai dari sumber air, kawasan hutan lindung, hortikultura, peternakan, perkebunan, dan lainnya. So, tempat ini cocok buat kamu, karena kamu dapat melihat langsung bagaimana cara beternak, sapi, domba, kelinci, atau budidaya sayur-mayur, dan lain sebagainya.\n" +
                    "\n" +
                    "Jadi, jangan heran kalo udah sampai ke tempat ini, kamu disambut oleh teriakan domba-domba imut, yah! Domba-domba tersebut adalah hasil persilangan antara domba lokal dan domba Garut, lho!",
            "Baru-baru ini ada wisata yang tengah viral karena menawarkan pesona hamparan bunga warna-warni yang indah. Selain dapat berfoto, pengunjung juga dapat menikmati keindahan alam di sana. Destinasi wisata dengan hamparan bunga itu adalah Taman Bunga Kadung Hejo.\n" +
                    "\n" +
                    "Di taman bunga ini terdapat berbagai jenis tanaman bunga, buah dan sayur-sayuran. Jenis bunga seperti Bunga Gomprema, Jengger Ayam (Selosia ), Finka, Pacar Banyu, dan Bunga Matahari ditanam di area wisata.\n" +
                    "\n" +
                    "Hamparan bunga yang luas ini juga terdiri dari ratusan bunga cantik tumbuh layaknya ladang perkebunan di Eropa. Berbagai jenis bunga impor dari Thailand dan Filipina tumbuh dengan subur diantara jejeran Pohon Jambu dan bentangan sawah.\n" +
                    "\n" +
                    "Fasilitas yang ada di Taman Wisata Bunga Kadung Hejo adalah tempat beristirahat (gazebo), spot foto yang menarik, dan juga hamparan bunga luas. Berbagai peraturan harus ditaati saat berkunjung ke wisata ini seperti dilarang membuang sampah sembarangan, dilarang memegang dan memetik bunga, dan tidak merusak fasilitas yang telah disediakan.\n" +
                    "\n" +
                    "Selain berbagai fasilitas yang telah disediakan, tempat wisata ini juga menyediakan pelatihan berkebun bagi pengunjung yang datang. Pengunjung dapat belajar cara berkebun secara berkelompok dan akan didampingi oleh instruktur yang ahli.\n" +
                    "\n" +
                    "Untuk biaya berkebun ditawarkan paket sebesar Rp20 ribu per orang dengan model demonstrasi panduan oleh instruktur selama dua jam dan dikenakan biaya sebesar Rp30 ribu per orang dengan model praktik manidiri didampingi instruktur selama 3 jam.\n" +
                    "\n" +
                    "Pengunjung juga dapat memetik buah jambu di area tempat wisata dan dikenakan biaya sebesar Rp20 ribu per kg untuk memetik buah jambu di Taman Bunga Kadung Hejo.\n" +
                    "\n" +
                    "Taman Bunga Kadung Hejo dibuka setiap hari mulai dari pukul 9.00--18.00 WIB. Untuk tiket masuk seharga Rp7 ribu per orang untuk mendapatkan minuman atau pot plastik, harga Rp15 ribu per orang untuk mendapatkan benih buah dan sayur, dan harga Rp20 ribu per orang untuk mendapat bunga cantik atau media siap tanam.",
            "Perlu anda ketahui bahwa Curug Putri Tahura memiliki kontur alam yang mirip dengan Green Canyon di Ciamis. Sebab di Curug Putri Tahura ini terdapat aliran sungai yang diapit oleh tebing batu berukuran raksasa.\n" +
                    "\n" +
                    "Air sungai tersebut berwarna hijau bercamur putih sehingga menjadi gradasi warna yang begitu cantik. Untuk menuju ke Curug Putri, anda harus menyusuri sungai dengan berenang atau bisa juga dengan menggunakan pelampung.\n" +
                    "\n" +
                    "Selanjutnya perjalanan dilanjutkan dengan berjalan kaki kurang lebih selama 5 menit dan anda akan disambut oleh pemandangan Curug Putri yang begitu memukau.",
            "Curug yang satu ini berada di dekat kawasan Pantai Carita. Untuk itulah bila anda mengunjungi Pantai Carita maka sebaiknya silakan mampir ke curug Ciajen Kembar.\n" +
                    "\n" +
                    "Sebab curug yang satu ini menyajikan gemercik air terjun yang dingin dan sejuk. Pastinya pemandangan alam sekitar Curug Ciajen Kembar juga tak kalah indah sehingga membuat anda semakin betah berlama-lama di curug ini.\n" +
                    "\n" +
                    "Air terjun yang satu ini memang tidak terlalu tinggi. Air yang jatuh dari ketinggian akan langsung disambut oleh kerasnya batuan cadas sehingga akan menghasilkan dua air terjun yang bersandingan layaknya curug pengantin di sejumlah tempat di pulau Jawa.\n" +
                    "\n" +
                    "Buat anda yang sedang mencari tempat wisata di Pandeglang berupa tempat mandi, air terjun ini bisa anda jadikan pilihan. Apalagi air terjunnya masih sangat alami dan pasti akan membuat anda betah berlama-lama disini.",
            "Wisata pemandian air panas di area ini ada di 2 tempat. Pengunjung bisa memilih di Kampung Torong atau Kampung Cisolong. \n" +
                    "\n" +
                    "Pemandian air panas ini sudah dibuka lebih dari satu dasawarsa yang lalu (2008). Sekitar 15 menit atau 4 km jarak yang ditempuh dari alun-alun Pandeglang. Sumber air panas di sini berasal dari alam, yaitu dari Gunung Torong, Pandeglang.\n" +
                    "\n" +
                    "Mandi air panas dapat menciptakan keadaan rileks bagi tubuh. Hal ini membuat tempat ini sangat cocok untuk melepas penat karena rutinitas harian. Berikut beberapa daya tarik wisata tempat pemandian air panas ini.\n" +
                    "\n" +
                    "Biasanya pemandian air panas digunakan secara bersama-sama oleh semua pengunjung. Bagi pengunjung yang lebih suka privasi, hal ini tentu kurang mengenakkan. Namun tidak pada pemandian ini, karena pengunjung tetap bisa memperoleh privasinya.\n" +
                    "\n" +
                    "Inilah salah satu alasan kenapa tempat ini juga cocok untuk liburan sekeluarga. Karena selain tempat untuk umum, pemandian ini juga menyediakan tempat pribadi (tertutup). Air panas di kolamnya juga bisa dipilih mulai dari yang panas hingga hangat.",
            "Selain pemandian air panas Kampung Torong, ternyata di Pandeglang masih ada lagi wisata pemandian air panas yaitu pemandian cikoromoy.\n" +
                    "\n" +
                    "Dimana lokasi pemandian ini merupakan pemandian alam yang sudah sangat populer di Pandgelang. Bagi anda yang ingin bersantai bersama keluarga, maka tempat wisata ini merupakan pilihan yang tepat.\n" +
                    "\n" +
                    "Selain bisa digunakan sebagai tempat mandi, kolam pemandian air panas ini memiliki kolam dasar alam. Dimana dibagian dasar kolam terdapat pasir dan bebatuan sehingga menjadikan pemnadangan dasar kolam yang jernih dan indah.",
            "Obyek wisata alam yang satu ini sangat pas untuk dikunjungi bersama dengan keluarga. Meskipun CAS Water Park ini menyajikan berbagai wahana permainan dan wahana bermain air namun pemandangan di sekitar CAS Water Park dijamin sangat memanjakan mata.\n" +
                    "\n" +
                    "Udara yang sejuk seolah membuat siapa saja semakin betah bersantai di tempat wisata yang satu ini. Sambil bersantai, anda juga bisa mencicipi aneka hidangan lezat yang memanjakan lidah."
    };

    private double[] lat = {
            -6.739371, -6.642697, -6.700001, -6.295985, -6.286108, -6.336186, -6.294063, -6.257562, -6.345229, -6.328912, -6.336097
    };

    private double[] lng = {
            105.256396, 105.581515, 105.500000, 105.839623, 106.086051, 106.059520, 105.838424, 105.897541, 106.084104, 106.021210, 106.097699
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
            listModel.setKontak(kontak[i]);
            listModel.setWeb(web[i]);

            listModels.add(listModel);
        }

    }

    @Override
    public void loadList() {listView.onLoadList(listModels);}

}
