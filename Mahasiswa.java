public class Mahasiswa{
        String nama  ;
        String nim   ;
        String kelas ;
        double nilai ;

        public Mahasiswa(String nama, String nim, String kelas, double nilai){
            this.nama = nama ;
            this.nim = nim ;
            this.kelas = kelas ;
            this.nilai = nilai ;
        }
        public String getNama(){
            return nama ;
        }
        public String getNim(){
            return nim ;
        }
        public String getKelas(){
            return kelas ;
        }
        public double getNilai(){
            return nilai ;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((nama == null) ? 0 : nama.hashCode());
            result = prime * result + ((nim == null) ? 0 : nim.hashCode());
            result = prime * result + ((kelas == null) ? 0 : kelas.hashCode());
            long temp;
            temp = Double.doubleToLongBits(nilai);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Mahasiswa other = (Mahasiswa) obj;
            if (nama == null) {
                if (other.nama != null)
                    return false;
            } else if (!nama.equals(other.nama))
                return false;
            if (nim == null) {
                if (other.nim != null)
                    return false;
            } else if (!nim.equals(other.nim))
                return false;
            if (kelas == null) {
                if (other.kelas != null)
                    return false;
            } else if (!kelas.equals(other.kelas))
                return false;
            if (Double.doubleToLongBits(nilai) != Double.doubleToLongBits(other.nilai))
                return false;
            return true;
        }
        @Override
        public String toString(){
            return "Mahasiswa : [ " + "Nama :" + nama + " " + "Nim : "+ nim + " " + "Kelas :" + kelas + " " + " ]"  ;
        }
}
    
