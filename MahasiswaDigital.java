public class MahasiswaDigital extends Mahasiswa implements DapatDigital {
    public MahasiswaDigital(String id, String nama, String nim) {
        super(id, nama, nim);
    }

    // Wajib override method abstrak dari interface DapatDigital
    @Override
    public void aksesEBook(String url) {
        System.out.println("Mahasiswa " + getNama() + " mengakses e-book di: " + url);
        System.out.println("Maksimal download per hari: " + MAX_DOWNLOAD_PER_HARI + " file");
    }

    // Getter untuk nama (karena atribut nama di parent bersifat protected)
    public String getNama() {
        return super.nama;
    }
}