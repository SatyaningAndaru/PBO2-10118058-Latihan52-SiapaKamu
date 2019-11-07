/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan52.siapakamu;

/**
 *
 * @author user
 */
public class Dosen extends Manusia{
    private String nip,matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 Tahun sedang mengajar matakuliah PBO");
    }
    @Override
    public void siapaKamu() {
      
        System.out.println("Saya dosen");
    }

    public Dosen(String nip) {
        this.nip = nip;
    }
    
    
    
}
