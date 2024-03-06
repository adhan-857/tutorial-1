
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=adhan-857_tutorial-1&metric=coverage) ](https://sonarcloud.io/summary/new_code?id=adhan-857_tutorial-1)[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=adhan-857_tutorial-1&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=adhan-857_tutorial-1) [![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=adhan-857_tutorial-1&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=adhan-857_tutorial-1) [![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=adhan-857_tutorial-1&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=adhan-857_tutorial-1)<br>
[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=adhan-857_tutorial-1)](https://sonarcloud.io/summary/new_code?id=adhan-857_tutorial-1)

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

<br>
<br>

# Tutorial Modul 3: OO Principles & Software Maintainability
### Ramadhan Andika Putra (2206081976) - AdPro A <br><br>

1. Beberapa prinsip S.O.L.I.D. yang saya terapkan pada *project* saya pada projet ini adalah sebagai berikut:<br>
    * **Single Responsibility Principle (SRP)**<br>
      Setiap *class* harus sesuai dengan fungsinya masing-masing.
      Pada *branch* `before-solid`, *class* `CarController` diletakkan di dalam *class* `ProductController`. Oleh karena itu, perlu dilakukan pemisahan agar `CarController` memiliki file *class* sendiri. Selain itu, sebaiknya *constructor class model* `Product` tidak memiliki *assign value* dalam constructornya. Oleh karena itu, saya menghapus *constructor* yang memberikan nilai UUID ke *id Product* dan memindahkannya ke dalam *method create* pada `ProductRepository`.
   <br>
   <br>
      Selain itu, setiap *controller* memiliki tanggung jawab untuk melakukan *mapping* dengan *endpoint*-nya masing-masing, sehingga sebaiknya dipisahkan menjadi tiga *class* yang berbeda:
        * `HomePageController` bertanggung jawab untuk melakukan *mapping* dengan *endpoint* `/`.
        * `ProductController` bertanggung jawab untuk melakukan *mapping* dengan *endpoint* `/product`.
        * `CarController` memiliki tanggung jawab untuk melakukan *mapping* dengan *endpoint* `/car`.
   <br>
   <br>
   
   * **Open-closed principle (OCP)**<br>
     Pada *class* `CarController`, atribut `carService` diubah menjadi menggunakan *interface* `CarService` dan bukan menggunakan *class* `CarServiceImpl`, hal ini agar menjadi bersifat *open-closed*.
   <br>
   <br>
   
   * **Liskov Substitution Principle (LSP)**<br>
     Pada branch *before-solid*, `ProductController.java` terdapat *subclass* `CarController`. Padahal, `CarController` memiliki *behaviour* yang berbeda dengan *superclass*-nya. Sehingga, `CarController` tidak perlu meng-*extend* `ProductController` (bisa menjadi file *class* tersendiri) dan *attribute* `carService` dapat diubah menjadi menggunakan *interface* `CarService`.
   <br>
   <br>
   
   * **Interface segregation principle (ISP)**<br>
    Karena atribut dari `carService` tersebut telah diganti, maka *class* `CarServiceImpl` tidak perlu mengimplementasikan *method* dari *interface* yang mereka gunakan.
   <br>
   <br>

   * **Dependency inversion principle (DIP)**<br>
     Pada *branch* `before-solid`, `CarController` bergantung langsung dengan `CarServiceImpl`. Menurut saya, hal tersebut tidak baik karena `CarController` seharusnya bergantung dengan *interface* `CarService`. Oleh karena itu, saya mengganti tipe data dari variabel `carService` pada `CarController` menjadi `CarService`.
<br>
<br>
<br>

2. Dengan menerapkan prinsip S.O.L.I.D, menurut saya telah memberikan cukup banyak keuntungan pada tutorial dan *exercise* pada modul kali ini. Saya dapat meningkatkan modularitas, kualitas, kerapihan, dan memberikan kemudahan *maintain* secara berkelanjutan dari kode yang telah saya buat. Jika saya ingin melakukan modifikasi kode pun akan menjadi lebih efisien karena telah meminimalkan kebutuhan untuk melakukan perubahan pada banyak bagian kode. Terakhir, ketika bekerja dalam tim, menurut saya, prinsip S.O.L.I.D juga memberikan kemudahan dalam melakukan review kode dan menghindari kode yang sulit dipahami.<br>
   <br>
   Untuk contoh penerapannya sendiri sudah saya jelaskan pada nomor sebelumnya.
<br>
<br>
<br>

3. Jika kita tidak menerapkan prinsip S.O.L.I.D, kekurangannya menurut saya kode yang saya buat menjadi sulit untuk di-*maintain* dan membutuhkan *effort* yang lebih besar untuk melakukan modifikasi kode. Selain itu, apabila bekerja dalam tim, akan sulit untuk melakukan review kode dan kode pun menjadi sulit dipahami.<br>
   <br>
   Contohnya, bayangkan jika saya tidak menerapkan SRP pada `CarController`. Jika ada orang lain membaca kode milik saya, maka mereka akan kesulitan mencari kode tersebut karena disatukan dengan file `ProductController`. Selain itu, jika saya tidak meterapkan LSP, *subclass* `CarController` tidak dapat menggantikan *superclass*-nya.

<br>
<br>

# Tutorial Modul 4: Test-Driven Development & Refactoring
### Ramadhan Andika Putra (2206081976) - AdPro A <br><br>

***[ Reflection ]***<br>

1. Setelah mempelajari lebih dalam mengenai alur TDD dan mengerjakan tutorial ini, menurut saya, alur TDD seperti ini cukup menyulitkan walau saya yakin sebenarnya banyak manfaat dari jika kita mengimplementasikannya. Saya sendiri merasa kesulitan karena mungkin tidak terbiasa dalam membuat *testing* terlebih dahulu sebelum membuat implementasi dari *class*-nya.
    <br>
    <br>

    Di sisi yang lain, saya juga merasa bahwa alur TDD ini membantu saya dalam mengevaluasi apakah hal yang saya lakukan sudah mencapai *correctness*, *maintainability*, dan *productive workflow*. Alur seperti ini membuat saya harus sering memerika apakah *tests* yang sebelumnya saya buat telah terpenuhi *correctness*-nya. Selain itu, alur seperti ini bagi saya dapat mengurangi kecenderungan membuat dua *method* atau fungsi yang saling terkait.
   <br>
   <br>
   <br>

2. Menurut saya, F.I.R.S.T *principle* sudah diterapkan dengan cukup baik pada pengerjaan tutorial kali ini. Test berlangsung cepat dan tidak mengganggu *workflow* yang lain. *Unit test* dan *functional* test telah dipisahkan dan tidak ada peristiwa menunggu suatu *subsystem*/fungsi pada saat menggunakan *unit test*. Akan tetapi, saya Saya tidak yakin bahwa saya sudah mengimplementasi F.I.R.S.T sepenuhnya. Karena saya belum menerima 100% *line/branch coverage*. Sehingga, saya masih harus menambahkan *tests* untuk mencapai hal tersebut.