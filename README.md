# Tutorial Modul 1: Coding Standards
### Ramadhan Andika Putra (2206081976) - AdPro A <br>

***[ Reflection 1 ]***<br>

*Clean code* adalah kode program yang mudah dibaca, dipahami, dan diubah oleh kita maupun programmer lain. Kode ini memiliki struktur yang jelas, terformat dengan baik, dan menggunakan nama yang mudah dipahami untuk variabel, fungsi, dan kelas. Singkatnya, tujuan dari *clean code* ini adalah agar kode mudah diubah jika diperlukan dan diperbarui tanpa menimbulkan banyak bug. Sedangkan *secure coding* adalah serangkaian praktik untuk membantu meminimalkan kerentanan dalam *software* dan membuatnya lebih aman digunakan.
<br>

Saya sendiri sudah menerapkan *clean code* serta *secure coing* pada tutorial kali ini. Contohnya adalah saya telah membuat kode saya terstruktur dengan baik dan terbagi menjadi modul-modul yang kecil. Selain itu, saya juga menggunakan *library* dan kerangka kerja yang aman dan teruji untuk menghindari kerentanan keamanan. Lalu, saya juga menggunakan penamaan yang jelas dan deskriptif untuk variabel, fungsi, dan kelas. Terakhir, saya telah melakukan pengujian kode secara menyeluruh serta menambahkan sedikit komentar yang singkat dan jelas untuk menjelaskan bagian kode yang rumit. (terutama pada kode bagian *testing*).
<br>

Jika saya menemukan adanya kesalahan pada *source code* saya pada pengerjaan tutorial kali ini, biasanya beberapa hal yang akan saya lakukan adalah sebagai berikut:<br>
* Mengunakan debugger IntelliJ untuk melacak dan memahami eksekusi kode langkah demi langkah. Menurut saya, hal ini cukup membantu untuk mengidentifikasi dan memperbaiki bug dengan cepat;
* Memastikan semua dependensi proyek saya telah diperbarui ke versi terbaru atau sesuai dengan yang diminta;
* Menggunakan *unit test* dan *functional test* untuk membantu memeriksa agar kode dapat bekerja sesuai dengan yang diharapkan;
* Melakukan review code bersama teman agar bisa saling memeriksa dan memberikan *feedback* terhadap kode satu sama lain.


<br>


***[ Reflection 2 ]***<br>
1. Setelah membuat *unit test* dan berhasil *passed* setelah menjalankannya, saya biasanya akan merasa lebih percaya diri terhadap program yang telah saya buat. Menurut saya, Jumlah unit test yang sebaiknya dibuat dalam suatu *class* tergantung pada kompleksitas dan fungsionalitas kelas tersebut.
    <br>
    <br>
    Dari referensi yang saya baca, *unit test* sebaiknya dibuat untuk setiap fungsi atau logika yang krusial, terutama yang berinteraksi dengan *input/output*, *database*, atau komponen eksternal. Salah satu cara memastikan bahwa unit test yang kita buat sudah cukup untuk memeriksa dan memverifikasi program milik kita adalah dengan cara menetapkan kriteria hasil *passed* dari *unit test* milik kita.
    <br>
    <br>
    Lalu, terkait *code coverage*. Menurut saya, *code coverage* membantu kita untuk memahami bagian kode yang diuji. Tetapi, 100% *coverage* tidak menjamin kode bebas *bug*. Hal ini karena *Code coverage* hanya mengukur sejauh mana kode telah dieksekusi oleh *unit test*, bukan kualitas atau kebenaran logika dalam kode tersebut. Oleh karena itu, meskipun memiliki code coverage yang tinggi, masih perlu dilakukan uji lebih lanjut dan perhatian terhadap kebenaran fungsionalitas program.
<br>
<br>
<br>

2. Jika kita membuat Java *class* baru yang serupa dengan rangkaian functional test sebelumnya dengan prosedur *setup* dan *instance variables* yang sama, maka akan terdapat beberapa masalah terkait cleanliness of the code seperti:
    * **Duplikasi Kode**: Menyalin kode tanpa modifikasi menciptakan duplikasi, mengurangi *readibility*, dan mempersulit pemeliharaan.
    * ***Dependency* yang tidak perlu**: *Test suites* yang bergantung pada struktur dan *variables* dari *test suites* lainnya akan menjadi *fragile*. Selain itu, mengubah satu test suite dapat merusak test suite lain. Hal ini membuat kode menjadi sulit untuk di-*maintain*.
    * ***Lack of Separation of Concerns***: Kedua test suite memiliki tujuan berbeda, sehingga jika *sharing setup* dan variabel antara *test suites* akan menyebabkan terjadinya *mixes responsibilities*. Sehingga membuat kode sulit untuk dipahami dan diubah.
   <br>
   <br>

   Menurut saya, terdapat beberapa cara untuk membuat kodenya lebih *'clean'*, di antara adalah:
    * **Refaktor *Test Suite* Awal**: Ekstrak setup dan variabel umum ke *class* terpisah `ProductTestSetup.java`. Hal ini dapat meningkatkan *reusability* dan mengurangi duplikasi.
    * **Buat *Subclass* Khusus**: *Inherit* `ProductTestSetup` di kedua *test suite* baru dan lama. Setiap *subclass* terdapat *setup* dan variabel khusus sesuai kebutuhannya, menjaga prinsip *Single Responsibility*.
    * **Meminimalkan Duplikasi *Logic***: Periksa *logic* pengujian yang serupa. Jika identik, pertimbangkan untuk mengekstraknya ke *method* terpisah di *base class*, meningkatkan *reusability*, dan mengurangi duplikasi.
    * **Dokumentasi**: Tambahkan *comments* yang jelas ke setiap *class* dan *method* untuk menjelaskan tujuan dan fungsinya, meningkatkan *readibility* dan pemeliharaan.

<br>
<br>

# Tutorial Modul 2: CI/CD & DevOps
### Ramadhan Andika Putra (2206081976) - AdPro A <br><br>

1. Selama proses pengerjaan tutorial 2 ini, saya melakukan sejumlah perbaikan terhadap masalah kualitas kode, yang melibatkan langkah-langkah berikut:
    <br><br>
    * **Memperbaiki Izin Eksekusi pada Gradlew di Dockerfile:**

        Saya telah menangani isu izin eksekusi pada file `gradlew` di `Dockerfile` dengan memberikan izin yang sesuai menggunakan perintah `chmod +x gradlew`. Hal ini penting agar file tersebut dapat dijalankan dengan benar dalam Docker *environment*.
    <br>
    
    * **Penyesuaian Versi Java untuk Analisis SonarCloud:**

        Saya menyesuaikan konfigurasi analisis `SonarCloud` untuk menggunakan Java 21, mengingat versi Java sebelumnya sudah tidak lagi didukung. Dengan mengubah versi Java, maka kita telah memastikan konsistensi dan keamanan dalam proses analisis kode.
    <br>
    
    * **Menghilangkan Modifier `Public` pada File Terkait dengan Test:**

        Untuk meningkatkan implementasi terbaik pada pengujian, saya menghilangkan modifier "public" pada file yang berkaitan dengan pengujian. Pendekatan terbaik pada pengujian adalah menggunakan modifier default, yang lebih sesuai dengan prinsip encapsulation.
    <br>
    
    * **Melakukan *handle duplication* yang terjadi**

      Saya sempat menemukan adanya dupilkasi kode yang tidak perlu pada beberapa *unit test* dan *functional test*. Oleh karena itu, saya mencoba menggabungkan kode yang duplikat tersebut ke dalam suatu *method* yang sama.
    <br>
    
   * **Menambahkan Konfigurasi pada GitHub Actions Workflow:**

     Saya mencoba menambahkan konfigurasi yang diperlukan dalam file GitHub Actions workflow untuk mencoba memastikan bahwa analisis `SonarCloud` berjalan dengan benar. Termasuk di dalamnya adalah spesifikasi versi Java yang digunakan, sehingga alur kerja GitHub Actions dapat dijalankan secara konsisten.

   <br>

    Dengan melakukan perubahan-perubahan ini, saya berharap kualitas keseluruhan dari kode tutorial 2 saya dapat meningkat, dan proses analisis `SonarCloud` dapat berjalan dengan lancar.
<br>
<br>
<br>

2. Dalam mengembangkan *project* ini, saya cukup berhasil dalam mengimplementasikan Continuous Integration (CI) secara efektif dengan memanfaatkan GitHub Actions. Saya telah mencoba merancang dan mengonfigurasi beberapa workflow, seperti `ci.yml`, `scorecard.yml`, dan `sonarcloud.yml`, yang secara otomatis diaktifkan setiap kali terjadi *push* atau *pull request* ke suatu *branch*. Semuanya dilakukan untuk memastikan bahwa setiap perubahan kode dapat diperiksa dan diuji secara otomatis, meningkatkan kualitas dan ketepatan kode saya.
   <br>
   <br>
   Selanjutnya, saya telah mecoba dengan mengimplementasikan *Continuous Deployment (CD)* menggunakan Koyeb. Platform ini menjadi platform utama dalam otomatisasi proses *deployment* aplikasi saya, sehingga setiap kali terjadi perubahan pada *branch*, Koyeb secara otomatis melakukan *deployment*. Dengan kombinasi CI/CD ini, saya dapat memastikan bahwa perubahan kode yang telah diuji dengan baik dapat segera diterapkan ke lingkungan produksi, sehingga mempercepat siklus pengembangan dan meningkatkan efisiensi keseluruhan *project*.
<br>
<br>

***Tambahan lampiran untuk bonus:***<br>
<img width="960" alt="image" src="https://github.com/adhan-857/tutorial-1/assets/119088782/dd27dde3-9e76-43e6-accd-e0b64ec002ed"><br>
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=adhan-857_tutorial-1&metric=coverage) ](https://sonarcloud.io/summary/new_code?id=adhan-857_tutorial-1)[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=adhan-857_tutorial-1&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=adhan-857_tutorial-1) [![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=adhan-857_tutorial-1&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=adhan-857_tutorial-1) [![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=adhan-857_tutorial-1&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=adhan-857_tutorial-1)<br>
[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=adhan-857_tutorial-1)](https://sonarcloud.io/summary/new_code?id=adhan-857_tutorial-1)
