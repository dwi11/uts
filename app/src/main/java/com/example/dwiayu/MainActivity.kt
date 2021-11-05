package com.example.dwiayu
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.sma,"Demokrat","Demokrat","Visi : Menjadi Institusi yang profesional, antisipatif dan responsif dalam mendukung serta memfasilitasi kinerja dan hasil kerja DPRD\n" +
                "Misi :Mewujudkan Peningkatan Pelayanan Internal,Mewujudkan Peningkatan Pelayanan Eksternal,Menjadi sumber informasi kegiatan DPRD dan studi bidang Politik "
        ))

        data?.add(DataModel(R.drawable.lap2,"Sejarah SMA N 1 Dukuhwaru","Sejarah", "SMA Negeri 1 Dukuhwaru adalah salah satu institusi pendidikan yang berlokasi di Jln. Pramuka No. 48 Desa Dukuhwaru, Kecamatan Dukuhwaru, Kabupaten Tegal. Berdasarkan Surat Kepala Kantor Wilayah Departemen Pendidikan dan Kebudayaan Provinsi Jawa Tengah, Nomor 761/I 03.28/U-1996, Tanggal 5 Juni 1996, tentang pengadaan paket unit gedung baru SMP dan SMA di Kabupaten Tegal untuk tahun anggaran 1996/1997 maka SMA Negeri 1 Dukuhwaru dinyatakan berdiri tanggal 5 Juni 1996."+"Tahun pelajaran 1996/1997 adalah awal SMA Negeri 1 Dukuhwaru menerima siswa baru untuk ikut berkiprah dan mewarnai dunia pendidikan di Kabupaten Tegal. dan pada tahun pelajaran 1998/1999 SMA Negeri 1 Dukuhwaru untuk pertama kalinya berhasil meluluskan putra putri terbaiknya dengan menyandang predikat terbaik ke-4 SMA se-Kabupaten Tegal. Seiring perjuangan SMA Negeri 1 Dukuhwaru di dunia pendidikan, berikut adalah tokoh-tokoh pemimpin SMA Negeri 1 Dukuhwaru"+
                "Drs. Washadun Kepala Sekolah periode 1998-1999" + "Drs. MZ Mutaqien Kepala Sekolah Periode 1999-2003" + "Drs. FX Suprihartanta Kepala Sekolah periode 2003-2004" + "Harjono, S.Pd, M.M. Kepala Sekolah periode 2004-2011" + "Drs. Munaseh Plt Kepala Sekolah periode 2011-2012"
                + "Drs. Sussono Hadi, M.M. Kepala Sekolah periode 2012-2014" + "Sumanto, S.Pd, M.M. Kepala Sekolah periode 2014 – 2020" + "Heris Samekto, S.Pd, M.M. Kepala Sekolah periode 2020 – Sekarang" + "Tekad kami sekaligus sebagai visi SMA Negeri 1 Dukuhwaru adalah “Sekolah berbasis IMTAQ, unggul dalam IPTEK, berprestasi dalam olahraga dan seni serta siap bersaing dalam menghadapi era global dengan semangat nasionalisme.”" + "SEMOGA SMA NEGERI 1 DUKUHWARU MENJADI TELAGA ILMU UNTUK MELEPAS DAHAGA CENDIKIA BANGSA"
        ))

        data?.add(DataModel(R.drawable.pre,"Presatasi","Prestasi", "ukuhwaru – Selama pandemi Covid-19, siswa SMAN 1 Dukuhwaru tidak berhenti berkreativitas dan menyumbang prestasi untuk SMAN 1 Dukuhwaru dalam berbagai bidang kompetisi. Salah satunya perlombaan penulisan karya tulis kesejarahan tingkat Kabupaten yang diadakan oleh Dinas Pendidikan dan Kebudayaan Kabupaten Tegal." + "Aulia Azizul Hakim kelas XII MIPA 3 SMAN 1 Dukuhwaru raih juara III penulisan\n" + "karya tulis kesejarahan pada kegiatan Lawatan Sejarah, dan Asika Rizma Imelda kelas XII MIPA 3 SMAN 1 Dukuhwaru raih Juara III penulisan karya tulis kesejarahan pada kegiatan Jejak Tradisi.Setelah diumumkan pada Selasa, 21 September 2021 kemarin. Kedua siswa ini menerima apresiasi serta banyak ucapan selamat dari keluarga besar SMAN 1 Dukuhwaru yang berbangga atas juara yang mereka raih dalam perlombaan yang diikuti oleh siswa/siswi SMA/SMK/MA se-Kabupaten Tegal Kepala SMAN 1 Dukuhwaru mengaku turut berbangga atas prestasi yang diraih oleh Siswa SMAN 1 Dukuhwaru dan memberikan apresiasi kepada Aulia Azizul Hakim dan Asika Rizma Imelda serta bapak dan ibu guru pembimbing. Ia mengaku mendukung segala bentuk kreativitas yang membawa nama baik SMAN 1 Dukuhwaru"))

        data?.add(DataModel(R.drawable.lap,"Visi Dan Misi","Visi Dan Misi", "Visi :\n" +
                "\n" +
                "Sekolah berbasis IMTAQ dan IPTEK berprstasi dalam meghadapi Revolusi Industri 4.0 dengan semangat Nasionalisme serta Berwawasan Lingkungan.\n" +
                "\n" +
                "Misi :\n" +
                "\n" +
                "Meningkatkan keimanan dan ketaqwaan kepada Tuhan Yang Maha Esa sebagai dasar pengabdian kepada bangsa dan Negara Kesatuan Republik Indonesia.\n" +
                "\n" +
                "Mengembangkan Teknologi Informasi dan Komunikasi dalam pembelajaran dan administrasi sekolah.\n" +
                "\n" +
                "Meningkatkan komitmen seluruh tenaga pendidik dan kependidikan terhadap tugas pokok dan fungsinya untuk meningkatkan pretasi sekolah.\n" +
                "\n" +
                "Menumbuh kembangkan semangat nasionalisme dan kecintaan terhadap tanah air.\n" +
                "\n" +
                "Menciptakan Lingkungan yang bersih dan asri untuk pembelajaran yang kondusif, sehat dan nyaman.\n" +
                "\n" +
                "Tujuan\n" +
                "\n" +
                "Mempersiapkan peserta didik yang bertaqwa kepada Allah Tuhan Yang Maha Esa dan berakhlak mulia\n" +
                "\n" +
                "Mempersiapkan peserta didik agar menjadi manusia yang berkepribadian cerdas, berkualitas dan berprestasi dalam bidang olahraga dan seni\n" +
                "\n" +
                "Membekali peserta didik agar memiliki keterampilan teknologi dan informasi serta mampu mengembangkan diri secara mandiri\n" +
                "\n" +
                "Menanamkan peserta didik sikap ulet dan gigih dalam berkompetisi, beradaptasi dengan lingkungan dan mengembangkan sikap sportifitas\n" +
                "\n" +
                "Membekali peserta didik dengan budi pekerti yang luhur sesuai dengan nilai-nilai sosial yang diterima\n" +
                "\n" +
                "Menanamkan peserta didik nilai-nilai kebangsaan dan cinta tanah air"))

        data?.add(DataModel(R.drawable.profil,"Sambutan Kepala Sekolah ","Sambutan", "Assalamualaikum Wr. Wb.\n" +
                "" +
                "Alhamdulillah segala puji bagi Allah SWT, atas hidayah-Nya, dan kerja keras segenap keluarga besar SMA Negeri 1 Dukuhwaru yang tiada henti sehingga website resmi SMA Negeri 1 Dukuhwaru dapat kembali online sebagai salah satu bentuk media komunikasi keluarga besar SMA Negeri 1 Dukuhwaru.\n" +
                "\n" +
                "Pada kesempatan yang membanggakan ini, saya menyambut baik penayangan kembali website resmi SMA Negeri 1 Dukuhwaru sebagai bagian publikasi, ajang silaturahmi, serta kenangan bagi alumni , Stakeholder, dan masyarakat pendidikan di Dukuhwaru dan sekitarnya. Semoga ke depan SMAN 1 Dukuhwaru tetap konsisten menjadi pelayanan pendidikan bermutu yang mampu ikut mencerdaskan kehidupan bangsa, meningkatkan derajat kehidupan masyarakat, serta selalu siap bersaing di era global, untuk menjadi institusi pendidikan yang baik, unggul, dan bermutu.\n" +
                "\n" +
                "Dalam rangka peningkatan kualitas secara signifikan di waktu mendatang, website ini akan memberi gambaran sekilas tentang program-program dalam upaya, meningkatkan kualitas pendidikan, kegiatan-kegiatan sekolah, informasi-informasi di SMA Negeri 1 Dukuhwaru, dan reportase kegiatan sekolah. Informasi ini diharapkan dapat memberikan kemudahan bagi pihak-pihak luar untuk mengakses informasi di SMA Negeri 1 Dukuhwaru.\n" +
                "\n" +
                "Akhir kata saya ucapkan selamat belajar, selamat berkarya, semoga Tuhan Yang Maha Kuasa meridhoi dan membimbing kita dalam menapaki masa depan yang penuh tantangan.\n" +
                "\n" +
                "Wassalamu’alaikum Wr. Wb.\n" +
                "\n" +
                "Kepala SMA Negeri 1 Dukuhwaru\n" +
                "\n" +
                "HERIS SAMEKTO, S.Pd.,M.M."))

        data?.add(DataModel(R.drawable.pra,"Ekstrakulikuler","Ekstrakulikuler", "Pramuka adalah singkatan dari Praja Muda Karana dan merupakan organisasi atau gerakan kepanduan. Pramuka adalah sebuah organisasi yang merupakan wadah proses pendidikan kepramukaan yang dilaksanakan di Indonesia. Dalam dunia internasional, Pramuka disebut"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("deskripsi", item?.deskripsi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}