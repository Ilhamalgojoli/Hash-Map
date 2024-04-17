import java.util.Scanner ;

public class Output {
    public static void main(String[] args) {
        HashCode daftarMahasiswa = new HashCode();
        Scanner scanner = new Scanner(System.in);

        int i = 0 ;

        while (i != 5) {
            System.out.println("\nPilih menu:");
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Hapus mahasiswa");
            System.out.println("3. simpan nilai mahasiswa");
            System.out.println("4. lihat rerata mahasiswa");
            System.out.println("5. Keluar");

            int pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Masukkan nilai: ");
                    double nilai = scanner.nextDouble();
                    scanner.nextLine(); // baca baris kosong
                    daftarMahasiswa.tambahMahasiswa(new Mahasiswa(nim, kelas, nama, nilai));
                    break;
                case 2:
                    System.out.print("Masukkan NIM: ");
                    nim = scanner.nextLine();
                    daftarMahasiswa.HapusMahasiswa(nim);
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan nilai: ");
                    nilai = scanner.nextDouble();
                    scanner.nextLine(); // baca baris kosong
                    daftarMahasiswa.SimpanNilai(nim, nilai);
                    break;
                case 4:
                    daftarMahasiswa.CetakData();
                    break;
                case 5:
                    System.out.println("Terima kasih O_-");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
