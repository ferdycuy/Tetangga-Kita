# Aplikasi KAS-RT Tetangga Kita

Demo Aplikasi : [*Demo-App-TetanggaKita-kasRT*](https://youtu.be/D1AgWG92r88?si=l-yqSluedo2ZwGTS)


Download Aplikasi : [*Download-APP-TetanggaKita*](https://s.id/APK-Tetangga-Kita)


Tutorial PDF : [*Tutorial-APP-TetanggaKita-kasRT-PDF*](https://drive.google.com/file/d/1Qk__4uNwtWf3fqOvomfaRmAuBBLPwLTw/view?usp=sharing)



| Nama  | NIM | KELAS |
| ------------- | ------------- | ------------- |
| Ferdyana Eka Prasetya | 312210121 | TI.22.A.1 |
| Danang Nurcahyo |  312210004 | TI.22.A.1 |
| Rhendy Diki Nugraha | 312210150 | TI.22.A.1 |


# Tetangga Kita App

Aplikasi Tetangga Kita adalah sebuah aplikasi berbasis mobile yang dirancang untuk membantu pengelolaan data warga, keuangan RT, dan berbagai informasi penting lainnya yang relevan bagi komunitas atau lingkungan RT/RW. Aplikasi ini memudahkan ketua RT, pengurus, dan warga dalam mengakses informasi dan berkomunikasi.

## Fitur-fitur Aplikasi

- **Data Warga:** Menampilkan informasi lengkap warga yang terdaftar, termasuk nama, alamat, email, nomor telepon, dan iuran yang telah dibayarkan.
- **Laporan Keuangan:** Menyajikan informasi mengenai jumlah iuran bulanan, total pengeluaran, rekap total, jumlah unit rumah, dan unit rumah yang sudah membayar kas.
- **Bagikan Info:** Fasilitas untuk membagikan informasi melalui WhatsApp.
- **Pusat Bantuan:** Menyajikan Pdf Tutorial cara penggunaan Aplikasi Tetangga Kita.
- **Pengaduan:** Fitur untuk menyampaikan keluhan atau masukan.
- **Hot News:** Sebuah fitur Berita Terkini.
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

      dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("com.github.bumptech.glide:glide:4.11.0")
    implementation("com.loopj.android:android-async-http:1.4.9")

    implementation("com.google.code.gson:gson:2.8.9")

    implementation("com.squareup.retrofit2:retrofit:2.6.4")
    implementation("com.squareup.retrofit2:converter-gson:2.6.4")

    implementation("com.squareup.okhttp3:logging-interceptor:3.8.0")
    debugImplementation("com.github.chuckerteam.chucker:library:3.3.0")
    implementation("com.squareup.picasso:picasso:2.71828")

    implementation("com.google.firebase:firebase-config-ktx:22.0.0")
    implementation(platform("com.google.firebase:firebase-bom:32.8.1"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-messaging-ktx:23.2.1")

      }
## Keuntungan Penggunaan Parsing JSON

- **Otomatisasi Proses:** Parsing JSON memungkinkan aplikasi secara otomatis memproses data yang diambil dari spreadsheet, seperti perhitungan saldo, pembuatan laporan, dan visualisasi data.
- **Integrasi Mudah:** Metode ini memudahkan integrasi dengan aplikasi lain yang membutuhkan data keuangan real-time, seperti aplikasi pembukuan atau analisis keuangan.



  <p align="center">
  <b>TERIMAKASIH</b>
</p>

 <p align="center">
  <b>SALAM DARI TIM DDYYFE;)</b>
</p>

