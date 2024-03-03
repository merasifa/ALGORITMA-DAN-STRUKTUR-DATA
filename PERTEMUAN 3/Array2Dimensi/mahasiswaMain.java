public class mahasiswaMain {
    public static void main(String[] args) {
    // Membuat array 2 dimensi dari objek Mahasiswa
    mahasiswa[][] dataMahasiswa = new mahasiswa[2][3];

        // Inisialisasi objek-objek Mahasiswa dalam array 2 dimensi
        dataMahasiswa[0][0] = new mahasiswa("John", 20);
        dataMahasiswa[0][1] = new mahasiswa("Jane", 22);
        dataMahasiswa[0][2] = new mahasiswa("Doe", 21);
        dataMahasiswa[1][0] = new mahasiswa("Alice", 23);
        dataMahasiswa[1][1] = new mahasiswa("Bob", 24);
        dataMahasiswa[1][2] = new mahasiswa("Eve", 25);

        // menampilkan data
        for (int i = 0; i < dataMahasiswa.length; i++) {
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                System.out.println("Nama: " + dataMahasiswa[i][j].nama + ", Umur: " + dataMahasiswa[i][j].umur);
            }
        }
    }
}