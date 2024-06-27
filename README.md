# Aplikasi KAS-RT Menggunakan Google Spreadsheet

| Nama  | NIM | KELAS |
| ------------- | ------------- | ------------- |
| Ferdyana Eka Prasetya | 312210121 | TI.22.A.1 |
| Danang Nurcahyo |  312210004 | TI.22.A.1 |
| Rhendy Diki Nugraha | 312210150 | TI.22.A.1 |


# Tetangga Kita App

Aplikasi ini memanfaatkan API spreadsheet untuk mengakses data keuangan secara real-time dari spreadsheet yang tersedia. Dengan ini, aplikasi selalu mendapatkan informasi terkini tanpa perlu intervensi manual.

## Keuntungan Penggunaan Parsing JSON

- **Otomatisasi Proses:** Parsing JSON memungkinkan aplikasi secara otomatis memproses data yang diambil dari spreadsheet, seperti perhitungan saldo, pembuatan laporan, dan visualisasi data.
- **Integrasi Mudah:** Metode ini memudahkan integrasi dengan aplikasi lain yang membutuhkan data keuangan real-time, seperti aplikasi pembukuan atau analisis keuangan.

## Fitur-fitur Aplikasi

- **Data Warga:** Menampilkan informasi lengkap warga yang terdaftar, termasuk nama, alamat, email, nomor telepon, dan iuran yang telah dibayarkan.
- **Laporan Keuangan:** Menyajikan informasi mengenai jumlah iuran bulanan, total pengeluaran, rekap total, jumlah unit rumah, dan unit rumah yang sudah membayar kas.
- **Bagikan Info:** Fasilitas untuk membagikan informasi melalui WhatsApp.
- **Pusat Bantuan:** Menyajikan Pdf Tutorial cara penggunaan Aplikasi Tetangga Kita.
- **Pengaduan:** Fitur untuk menyampaikan keluhan atau masukan.
- **Hot New:** Sebuah fitur Berita Terkini.
- **Riwayat Notifikasi:** Menyimpan catatan notifikasi yang telah diterima pengguna.

## Langkah-langkah Praktikum

1. **Registrasi dan Peroleh API Key:**
   - Daftar dan dapatkan API key dari [ApiSpreadsheets](https://apidocs.api-spreadsheets.com/).
2. **Tentukan ID Spreadsheet:**
   - Identifikasi ID spreadsheet yang berisi data keuangan RT.
3. **Buat Proyek Android:**
   - Buat proyek Android baru di Android Studio.
4. **Rancang Antarmuka Pengguna:**
   - Desain UI sesuai kebutuhan aplikasi.
5. **Implementasi Koneksi API:**
   - Gunakan Retrofit atau pustaka HTTP klien lainnya untuk menghubungkan ke API.
6. **Parsing JSON:**
   - Terapkan logika parsing JSON untuk mengambil dan memproses data dari respons API.
7. **Tampilkan Data:**
   - Tampilkan data yang diperoleh dalam antarmuka pengguna aplikasi Android.
8. **Pengujian Menyeluruh:**
   - Lakukan pengujian menyeluruh untuk memastikan semua fitur berjalan dengan baik dan data ditampilkan dengan benar.

## Build Gradle Dependencies

Tambahkan dependensi berikut ke file `build.gradle` proyek Anda:

    ```groovy
    dependencies {
        implementation 'com.squareup.retrofit2:retrofit:2.9.0'
        implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
        implementation 'com.google.code.gson:gson:2.8.6'
        // Tambahkan dependensi lainnya sesuai kebutuhan proyek
    }


**Tutorial**<br>
Tutorila Youtube : [*Tutorial-APP-kasRT-Youtube*](https://youtube.com/playlist?list=PLiYEX83BzXp9HkvQgeTzwZ2Eo8UflZOFe&si=gu-1iKdB4hPGOI4d)<br>
Tutorial PDF : [*Tutorial-APP-kasRT-PDF*](https://drive.google.com/file/d/15FxaZ8k_uAQm8uKxShqEx-lFvNk4l85S/view)


  <p align="center">
  <b>TERIMAKASIH</b>
</p>

 <p align="center">
  <b>SALAM DARI TIM DDYYFE;)</b>
</p>

