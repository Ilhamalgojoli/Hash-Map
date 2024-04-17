import java.util.HashMap ;

public class HashCode {
    HashMap<String, Mahasiswa> mapMahasiswa = new HashMap<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        mapMahasiswa.put(mahasiswa.nim, mahasiswa);
    }
    public void HapusMahasiswa(String nim) {
        mapMahasiswa.remove(nim);
    }
    public void SimpanNilai(String nim, double nilai) {
        if (mapMahasiswa.containsKey(nim)) {
            Mahasiswa mahasiswa = mapMahasiswa.get(nim);
            mahasiswa.nilai = nilai;
            mapMahasiswa.put(nim, mahasiswa);
        }
    }
    public double isiNilai(String nim) {
        if (mapMahasiswa.containsKey(nim)) {
            Mahasiswa mahasiswa = mapMahasiswa.get(nim);
            return mahasiswa.nilai;
        }
        return -1;
    }
    public void CetakData() {
        double totalNilai = 0;
        System.out.println("Daftar Nilai Mahasiswa:");
        for (Mahasiswa mahasiswa : mapMahasiswa.values()) {
            System.out.println(mahasiswa);
            totalNilai += mahasiswa.nilai;
        }
        double hasilRataRata = totalNilai / mapMahasiswa.size();
        System.out.println("Nilai rata-rata : " + hasilRataRata);
    }
}