public class Gudang27 {
    Barang27[] tumpukan;
    int size, top;

    Gudang27 (int kapasitas){
        size = kapasitas;
        tumpukan = new Barang27[size];
        top = -1;
    }

    public boolean cekKosong(){// mengecek apakah tumpukan barang masih kosong
        if (top== -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh(){ // mengecek apakah tumpukan barang sdh penuh
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang27 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal!! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang27 ambilBarang(){
        if (!cekKosong()) {
            Barang27 delete = tumpukan[top];
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalkeBiner(delete.kode));
            top--;
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang27 lihatBarangTeratas(){
        if (!cekKosong()) {
            Barang27 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalkeBiner(int kode) {
        StackKonversi27 stack = new StackKonversi27();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang27 lihatBarangTerbawah(){
        if (!cekKosong()) {
            Barang27 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang27 cariBarangKode( int kodeBrg){
        //kode
        for (int i = 0; i <= top; i++) {
            if (kodeBrg != -1 && tumpukan[i].kode == kodeBrg) {
                System.out.println("Barang dengan kode " 
                + kodeBrg + " ditemukan: " + tumpukan[i].nama);
                return tumpukan[i];
            }
        }
        System.out.println("Barang dengan kode " + kodeBrg + " tidak ditemukan.");
        return null;
    }

    public Barang27 cariBarangNama (String namaBrg){
        for (int i = 0; i <= top; i++) {
            if (namaBrg != null && tumpukan[i].nama.equals(namaBrg)) {
                System.out.println("Barang dengan nama " 
                + namaBrg + " ditemukan: " + tumpukan[i].nama);
                return tumpukan[i];
            }
        }
        System.out.println("Barang dengan nama " + namaBrg + " tidak ditemukan.");
        return null;
    }
}
