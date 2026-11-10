# Jogja Guide (TugasMyCity)

Jogja Guide adalah aplikasi panduan wisata interaktif di Kota Yogyakarta, dikembangkan dengan Jetpack Compose dan Material 3, mengacu pada codelab Android "My City". Aplikasi ini dirancang dengan gaya visual Pesona Indonesia (terang, bersih, nuansa teal `#0F766E` dan oranye `#F59E0B`, foto berkualitas tinggi, dan latar belakang putih).

## Tujuan Aplikasi
Memberikan rekomendasi wisata terkurasi di Daerah Istimewa Yogyakarta mencakup kategori Budaya & Sejarah, Wisata Alam, Kuliner, dan Belanja beserta detail informasi, tips berkunjung, dan integrasi peta.

## Daftar Fitur
1. **Daftar Kategori Wisata**: Menampilkan 4 kategori utama (Budaya & Sejarah, Wisata Alam, Kuliner, Belanja) lengkap dengan hero banner dan tips wisatawan.
2. **Daftar Destinasi**: Menampilkan daftar tempat wisata sesuai kategori yang dipilih, lengkap dengan rating bintang, lencana tag, dan informasi lokasi.
3. **Detail Destinasi**: Informasi lengkap tempat wisata (deskripsi mendalam, jam operasional, harga tiket, tag, alamat, tips berkunjung, dan tombol integrasi ke Google Maps).
4. **Navigasi Terstruktur**: Menggunakan Jetpack Navigation Compose dengan pengelolaan rute aman dan tombol kembali interaktif.

## Struktur Folder
```
com.example.tugasmycity/
├── data/
│   ├── Models.kt              # Model data Category dan Place
│   └── LocalDataProvider.kt   # Sumber data lokal (4 kategori dan 14 destinasi)
├── navigation/
│   ├── Screen.kt              # Definisi rute Navigasi (sealed class)
│   └── JogjaGuideApp.kt       # Komponen NavHost utama
├── ui/
│   ├── CategoryListScreen.kt  # Layar utama (Daftar Kategori)
│   ├── PlaceListScreen.kt     # layar daftar tempat wisata
│   └── PlaceDetailScreen.kt   # Layar detail tempat wisata
└── ui/theme/
    ├── Color.kt               # Palet warna Pesona Indonesia
    ├── Theme.kt               # Konfigurasi MaterialTheme (Light theme)
    └── Type.kt                # Tipografi kustom
```

## Cara Menjalankan
1. Buka proyek ini di Android Studio.
2. Lakukan sinkronisasi Gradle (`Sync Project with Gradle Files`).
3. Jalankan aplikasi pada emulator atau perangkat fisik Android (minSdk 24, targetSdk 37).
