import java.util.Scanner;
public class StudiKasus209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Jenis  kegiatan (BELAMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine().trim().toLowerCase();
        
         if (jenis.equals("belmawa") || jenis.equals("bakorma") || jenis.equals("mandiri")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen >= 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara" + juara + ", dokumen lengkap). ");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
            
        } else if (jenis.equals("pkm")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int pendanaan = sc.nextInt();

            if (pendanaan == 1) {
                if (dokumen >= 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
            }
            sc.close();
        }
    }
}