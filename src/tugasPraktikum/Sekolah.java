/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;

class Sekolah {
    protected String namaSiswa;
    protected String namaSekolah;
    
    public Sekolah (String namaSekolah, String namaSiswa){
        this.namaSekolah = namaSekolah;
        this.namaSiswa = namaSiswa;
    }
    
    public void info(){
        System.out.println("Nama    : "+this.namaSiswa);
        System.out.println("Sekolah : "+this.namaSekolah);
    }
}
