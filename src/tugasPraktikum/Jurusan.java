/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;

/**
 *
 * @author ASUS
 */
public class Jurusan extends Sekolah {
    private String namaJurusan;
    private String kelas;
    private String nomorAbsen;
    
    public Jurusan (String namaJurusan,String kelas,String nomorAbsen,
            String namaSekolah, String namaSiswa){
        
    super (namaSekolah, namaSiswa);
        this.namaJurusan = namaJurusan;
        this.kelas = kelas;
        this.nomorAbsen = nomorAbsen;
    }
    public void info(){
        System.out.println("Jurusan : "+this.namaJurusan);
        System.out.println("Kelas   : "+this.kelas);
        System.out.println("No.     : "+this.nomorAbsen);
        super.info();
    }
    
}
