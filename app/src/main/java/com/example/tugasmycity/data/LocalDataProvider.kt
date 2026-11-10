package com.example.tugasmycity.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.ShoppingBag
import com.example.tugasmycity.R

object LocalDataProvider {

    val categories = listOf(
        Category(
            id = 1,
            name = "Budaya & Sejarah",
            description = "Jelajahi warisan budaya, istana, dan candi bersejarah di Yogyakarta.",
            icon = Icons.Filled.AccountBalance,
            imageRes = R.drawable.keraton_jogja
        ),
        Category(
            id = 2,
            name = "Wisata Alam",
            description = "Nikmati keindahan alam mulai dari pantai selatan hingga pegunungan.",
            icon = Icons.Filled.Landscape,
            imageRes = R.drawable.merapi_jogja
        ),
        Category(
            id = 3,
            name = "Kuliner",
            description = "Cicipi berbagai hidangan khas Yogyakarta yang menggugah selera.",
            icon = Icons.Filled.Restaurant,
            imageRes = R.drawable.gudeg_jogja
        ),
        Category(
            id = 4,
            name = "Belanja",
            description = "Pusat oleh-oleh, suvenir, dan pasar tradisional yang ikonik.",
            icon = Icons.Filled.ShoppingBag,
            imageRes = R.drawable.malioboro_jogja
        )
    )

    val places = listOf(
        // --- BUDAYA & SEJARAH (categoryId = 1) ---
        Place(
            id = 1,
            categoryId = 1,
            name = "Keraton Yogyakarta",
            shortInfo = "Istana resmi Kesultanan Ngayogyakarta Hadiningrat.",
            description = "Keraton Yogyakarta adalah pusat istana kesultanan yang kaya akan nilai sejarah dan budaya Jawa. Pengunjung dapat melihat koleksi pusaka, arsitektur megah, serta pertunjukan seni tradisional yang rutin diadakan. Tempat ini wajib dikunjungi untuk memahami filosofi dan kehidupan keraton.",
            area = "Kraton",
            address = "Jl. Rotowijayan Blok No. 1, Panembahan, Kec. Kraton, Kota Yogyakarta",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.6,
            reviewCount = 12500,
            openHours = "08.00 - 14.00 WIB",
            ticketPrice = "Rp 15.000 / orang",
            tags = listOf("Cagar Budaya", "Sejarah", "Museum"),
            tips = listOf(
                "Datanglah pagi hari untuk menghindari cuaca panas.",
                "Gunakan pakaian sopan dan penutup lutut.",
                "Sewa pemandu lokal agar mendapat penjelasan sejarah yang mendalam."
            ),
            imageRes = R.drawable.keraton_jogja
        ),
        Place(
            id = 2,
            categoryId = 1,
            name = "Taman Sari",
            shortInfo = "Kompleks taman air dan pemandian para sultan masa lampau.",
            description = "Taman Sari Yogyakarta dulunya merupakan kebun istana dan tempat rekreasi keluarga kerajaan. Terkenal dengan kolam pemandian air yang indah, lorong bawah tanah, serta arsitektur perpaduan Jawa dan Portugis yang fotogenik. Destinasi favorit bagi pecinta sejarah dan fotografi.",
            area = "Patehan",
            address = "Patehan, Kec. Kraton, Kota Yogyakarta",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.5,
            reviewCount = 9800,
            openHours = "09.00 - 15.00 WIB",
            ticketPrice = "Rp 15.000 / orang",
            tags = listOf("Situs Sejarah", "Fotografi", "Arsitektur"),
            tips = listOf(
                "Gunakan alas kaki yang nyaman karena banyak berjalan di tangga dan lorong.",
                "Eksplorasi area Sumur Gumuling yang unik.",
                "Datanglah sebelum pukul 12 siang."
            ),
            imageRes = R.drawable.tamansari_jogja
        ),
        Place(
            id = 3,
            categoryId = 1,
            name = "Candi Prambanan",
            shortInfo = "Candi Hindu terbesar dan termegah di Indonesia.",
            description = "Candi Prambanan merupakan kompleks candi Hindu abad ke-9 yang megah dan diakui sebagai Situs Warisan Dunia UNESCO. Relief pada dinding candi menceritakan kisah epos Ramayana yang memukau. Suasana senja di sekitar candi sangat indah dan romantis.",
            area = "Prambanan",
            address = "Jl. Raya Solo - Yogyakarta No.KM.16, Kranggan, Bokoharjo, Kec. Prambanan",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.8,
            reviewCount = 24000,
            openHours = "06.30 - 17.00 WIB",
            ticketPrice = "Rp 50.000 / wisatawan domestik",
            tags = listOf("UNESCO", "Candi", "Sejarah"),
            tips = listOf(
                "Bawa topi atau payung karena area kompleks sangat terbuka dan panas.",
                "Sediakan waktu minimal 2-3 jam untuk menjelajahi seluruh kompleks.",
                "Saksikan pertunjukan Sendratari Ramayana di malam hari jika ada jadwal."
            ),
            imageRes = R.drawable.candi_prambanan
        ),
        Place(
            id = 4,
            categoryId = 1,
            name = "Tugu Yogyakarta",
            shortInfo = "Monumen ikonik yang menjadi lambang kota Yogyakarta.",
            description = "Tugu Jogja adalah landmark bersejarah yang dibangun pada tahun 1755 dan memiliki makna filosofis yang kuat bagi sumbu imajiner antara Merapi, Kraton, dan Pantai Selatan. Kawasan sekitar tugu selalu ramai oleh wisatawan yang ingin berfoto mengabadikan momen di Jogja.",
            area = "Jetis",
            address = "Jl. Jend. Sudirman, Gowongan, Kec. Jetis, Kota Yogyakarta",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.5,
            reviewCount = 8500,
            openHours = "24 Jam (Area Publik)",
            ticketPrice = "Gratis",
            tags = listOf("Landmark", "Ikon Jogja", "Pusat Kota"),
            tips = listOf(
                "Waktu terbaik untuk foto adalah malam hari saat lampu jalanan menyala terang.",
                "Hati-hati dengan kendaraan yang melintas karena berada di bundaran jalan.",
                "Parkir kendaraan di kantong parkir terdekat."
            ),
            imageRes = R.drawable.tugu_jogja
        ),

        // --- WISATA ALAM (categoryId = 2) ---
        Place(
            id = 5,
            categoryId = 2,
            name = "Pantai Parangtritis",
            shortInfo = "Pantai legendaris di pesisir selatan Yogyakarta.",
            description = "Pantai Parangtritis terkenal dengan panorama deburan ombak Samudra Hindia yang luas serta hamparan pasir hitam yang eksotis. Pengunjung dapat menikmati matahari terbenam yang memukau atau menyewa ATV dan delman untuk menyusuri garis pantai. Tempat ini juga sarat akan mitos dan legenda Ratu Kidul.",
            area = "Kretek",
            address = "Jl. Pantai Parangtritis, Parangtritis, Kec. Kretek, Kab. Bantul",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.4,
            reviewCount = 16000,
            openHours = "24 Jam",
            ticketPrice = "Rp 10.000 / orang",
            tags = listOf("Pantai", "Sunset", "Wisata Alam"),
            tips = listOf(
                "Dilarang berenang di laut karena ombak pantai selatan sangat kuat dan berbahaya.",
                "Nikmati sore hari menjelang matahari terbenam di pinggir pantai.",
                "Coba naik delman hias saat sore menjelang malam."
            ),
            imageRes = R.drawable.pantai_parangtritis
        ),
        Place(
            id = 6,
            categoryId = 2,
            name = "Lava Tour Gunung Merapi",
            shortInfo = "Petualangan seru menyusuri sisa erupsi Merapi dengan jeep.",
            description = "Lava Tour Merapi menawarkan pengalaman wisata petualangan off-road menggunakan mobil Jeep terbuka menyusuri kawasan lereng Gunung Merapi yang terdampak erupsi. Anda akan mengunjungi museum sisa harta, bunker alien, dan batu alien sambil menikmati pemandangan alam pegunungan yang megah.",
            area = "Cangkringan",
            address = "Kaliurang, Hargobinangun, Kec. Pakem, Kab. Sleman",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.8,
            reviewCount = 11000,
            openHours = "07.00 - 16.00 WIB",
            ticketPrice = "Mulai Rp 400.000 / jeep",
            tags = listOf("Petualangan", "Jeep", "Gunung Merapi"),
            tips = listOf(
                "Kenakan pakaian kasual yang nyaman dan kacamata hitam untuk menahan debu.",
                "Bawa jaket karena udara di lereng Merapi cukup dingin.",
                "Pesan paket jeep terpercaya sebelumnya."
            ),
            imageRes = R.drawable.merapi_jogja
        ),
        Place(
            id = 7,
            categoryId = 2,
            name = "Hutan Pinus Mangunan",
            shortInfo = "Kawasan hutan pinus asri dengan spot foto dan gardu pandang.",
            description = "Hutan Pinus Mangunan menyajikan suasana sejuk dan asri di tengah deretan pohon pinus yang menjulang tinggi. Terdapat berbagai gardu pandang kayu yang menawarkan pemandangan perbukitan hijau dilingkupi kabut tipis yang sangat menenangkan jiwa.",
            area = "Dlingo",
            address = "Sukorame, Mangunan, Kec. Dlingo, Kab. Bantul",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.6,
            reviewCount = 9200,
            openHours = "06.00 - 18.00 WIB",
            ticketPrice = "Rp 5.000 / orang",
            tags = listOf("Hutan Pinus", "Alam", "Spot Foto"),
            tips = listOf(
                "Datanglah pagi-pagi sekali untuk menikmati kabut pagi yang magis.",
                "Bawa kamera atau ponsel dengan baterai penuh karena banyak spot foto menarik.",
                "Jaga kebersihan lingkungan hutan pinus."
            ),
            imageRes = R.drawable.hutan_pinus_mangunan
        ),
        Place(
            id = 8,
            categoryId = 2,
            name = "Goa Pindul",
            shortInfo = "Menyusuri sungai bawah tanah dengan ban pelampung (cave tubing).",
            description = "Goa Pindul menawarkan pengalaman unik menyusuri sungai bawah tanah di dalam gua karst yang dihiasi stalaktit dan stalagmit megah. Aktivitas cave tubing ini aman dan dipandu oleh instruktur berpengalaman menggunakan ban pelampung dan jaket keselamatan.",
            area = "Bejiharjo",
            address = "Gelaran II, Bejiharjo, Kec. Karangmojo, Kab. Gunungkidul",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.5,
            reviewCount = 13500,
            openHours = "07.30 - 16.00 WIB",
            ticketPrice = "Rp 40.000 / orang",
            tags = listOf("Cave Tubing", "Goa", "Air"),
            tips = listOf(
                "Bawa pakaian ganti dan kantong kedap air untuk ponsel.",
                "Gunakan alas kaki anti selip karena lantai gua dan bebatuan basah.",
                "Dengarkan instruksi pemandu selama menyusuri sungai."
            ),
            imageRes = R.drawable.goa_pindul
        ),

        // --- KULINER (categoryId = 3) ---
        Place(
            id = 9,
            categoryId = 3,
            name = "Gudeg Yu Djum",
            shortInfo = "Legenda kuliner gudeg manis khas Yogyakarta yang otentik.",
            description = "Gudeg Yu Djum merupakan salah satu pelopor kuliner gudeg paling ikonik di Jogja. Menyajikan nangka muda yang dimasak berjam-jam dengan santan dan gula jawa, disajikan dengan krecek pedas, ayam opor, dan nasi hangat yang menggugah selera.",
            area = "Wirobrajan",
            address = "Jl. Wijilan No.31, Panembahan, Kec. Kraton, Kota Yogyakarta",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.6,
            reviewCount = 15000,
            openHours = "07.00 - 20.00 WIB",
            ticketPrice = "Mulai Rp 25.000 / porsi",
            tags = listOf("Kuliner Legendaris", "Gudeg", "Makanan Khas"),
            tips = listOf(
                "Pilih paket kendil jika ingin membungkus gudeg sebagai oleh-oleh.",
                "Datang lebih awal saat jam makan siang untuk menghindari antrean.",
                "Tingkat kepedasan sambal krecek dapat disesuaikan."
            ),
            imageRes = R.drawable.gudeg_jogja
        ),
        Place(
            id = 10,
            categoryId = 3,
            name = "Bakpia Pathok",
            shortInfo = "Kue tradisional isi kacang hijau yang renyah dan lembut.",
            description = "Bakpia Pathok adalah oleh-oleh wajib dari Yogyakarta berupa kue berukuran kecil berisi pasta kacang hijau manis yang dipanggang sempurna. Kini tersedia berbagai varian rasa modern seperti keju, cokelat, dan kumbu hitam.",
            area = "Ngampilan",
            address = "Jl. KS Tubun No.50, Ngampilan, Kota Yogyakarta",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.7,
            reviewCount = 18000,
            openHours = "08.00 - 21.00 WIB",
            ticketPrice = "Rp 35.000 / kotak",
            tags = listOf("Oleh-oleh", "Kue Tradisional", "Camilan"),
            tips = listOf(
                "Beli langsung di sentra pembuatan aslinya di kawasan Pathok.",
                "Perhatikan tanggal kedaluwarsa pada kemasan.",
                "Coba varian rasa keju dan cokelat selain kacang hijau original."
            ),
            imageRes = R.drawable.bakpia_pathok
        ),
        Place(
            id = 11,
            categoryId = 3,
            name = "Angkringan Kopi Joss",
            shortInfo = "Sensasi ngopi khas Jogja dengan arang panas membara.",
            description = "Angkringan Kopi Joss menyajikan kopi hitam panas yang dicelupkan sepotong bara arang menyala (joss), menciptakan sensasi rasa karamel yang unik. Dinikmati bersama nasi kucing dan aneka sate tusuk khas angkringan di pinggir rel kereta api.",
            area = "Malioboro",
            address = "Jl. Pangeran Mangkubumi, Sosromenduran, Gedtengen, Kota Yogyakarta",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.5,
            reviewCount = 9500,
            openHours = "17.00 - 02.00 WIB",
            ticketPrice = "Mulai Rp 5.000 / menu",
            tags = listOf("Kopi Joss", "Kuliner Malam", "Angkringan"),
            tips = listOf(
                "Datang malam hari untuk merasakan suasana khas angkringan malam Jogja.",
                "Ambil makanan secukupnya dan tanyakan harga jika ragu.",
                "Nikmati obrolan santai bersama warga lokal."
            ),
            imageRes = R.drawable.kopi_joss
        ),
        Place(
            id = 12,
            categoryId = 3,
            name = "Sate Klathak Mbah Bari",
            shortInfo = "Sate kambing muda unik yang dibakar menggunakan jeruji besi.",
            description = "Sate Klathak adalah sate kambing khas Pleret Bantul yang dibumbui minimalis dengan garam saja, namun menghasilkan cita rasa daging yang empuk dan gurih alami. Keunikan utamanya adalah penggunaan jeruji sepeda sebagai tusuk sate agar panas merata hingga ke bagian dalam.",
            area = "Pleret",
            address = "Jl. Imogiri Timur No.5, Wonokromo, Pleret, Kab. Bantul",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.7,
            reviewCount = 10200,
            openHours = "10.00 - 23.00 WIB",
            ticketPrice = "Rp 30.000 / porsi",
            tags = listOf("Sate Klathak", "Kuliner Legendaris", "Daging Kambing"),
            tips = listOf(
                "Pesan gulai kambing sebagai pendamping sate yang gurih berkuah hangat.",
                "Siapkan waktu tunggu agak lama karena selalu ramai pengunjung.",
                "Datang sebelum jam makan malam utama."
            ),
            imageRes = R.drawable.sate_klatak
        ),

        // --- BELANJA (categoryId = 4) ---
        Place(
            id = 13,
            categoryId = 4,
            name = "Jalan Malioboro",
            shortInfo = "Pusat perbelanjaan dan jalan ikonik paling populer di Jogja.",
            description = "Jalan Malioboro adalah jantung kota Yogyakarta yang dipenuhi pertokoan suvenir, pedagang kaki lima, dan musisi jalanan. Tempat terbaik untuk berburu batik, kerajinan tangan, cinderamata khas Jogja, atau sekadar berjalan-jalan menikmati suasana malam kota.",
            area = "Malioboro",
            address = "Jl. Malioboro, Sosromenduran, Gedtengen, Kota Yogyakarta",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.7,
            reviewCount = 35000,
            openHours = "24 Jam",
            ticketPrice = "Gratis",
            tags = listOf("Pusat Belanja", "Batik", "Ikon Jogja"),
            tips = listOf(
                "Lakukan tawar-menawar dengan sopan jika berbelanja di pedagang kaki lima.",
                "Waspadai barang bawaan pribadi di tengah keramaian.",
                "Nikmati berjalan kaki santai di area pedestrian yang luas."
            ),
            imageRes = R.drawable.malioboro_jogja
        ),
        Place(
            id = 14,
            categoryId = 4,
            name = "Pasar Beringharjo",
            shortInfo = "Pasar tradisional tertua dan pusat grosir batik terbesar di Jogja.",
            description = "Pasar Beringharjo adalah pasar bersejarah yang sudah ada sejak ratusan tahun lalu. Menawarkan ribuan kios yang menjual berbagai macam pakaian batik berkualitas, kain lurik, rempah-rempah tradisional, hingga jajanan pasar dengan harga terjangkau.",
            area = "Malioboro",
            address = "Jl. Margo Mulyo No.16, Ngupasan, Kec. Gondomanan, Kota Yogyakarta",
            // TODO: verifikasi ke sumber resmi di atas data tersebut.
            rating = 4.6,
            reviewCount = 14000,
            openHours = "08.30 - 17.00 WIB",
            ticketPrice = "Gratis masuk",
            tags = listOf("Pasar Tradisional", "Grosir Batik", "Belanja"),
            tips = listOf(
                "Masuk ke lantai atas untuk pilihan batik grosir yang lebih lengkap.",
                "Jangan ragu menawar harga barang dagangan.",
                "Bawa uang tunai pecahan kecil untuk memudahkan transaksi."
            ),
            imageRes = R.drawable.pasar_beringharjo
        )
    )

    fun getCategory(id: Int): Category? {
        return categories.find { it.id == id }
    }

    fun getPlacesByCategory(categoryId: Int): List<Place> {
        return places.filter { it.categoryId == categoryId }
    }

    fun getPlace(id: Int): Place? {
        return places.find { it.id == id }
    }
}
