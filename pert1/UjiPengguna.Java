package pert1;

public class UjiPengguna {
    public static void main(String[] args) {
    	Pengguna p = new Pengguna();
        p.umur = 25;
        p.berat = 60.0;
        p.tinggi = 170.0;

        p.tampilInfo();
        
        // Uncommenting the following line will cause a compilation error
        // p.faktorAktivitas = 1.5;
    }
}

