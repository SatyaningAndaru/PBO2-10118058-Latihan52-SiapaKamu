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
public class PBO210118058Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     *  Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen d = new Dosen("41227829930");
        System.out.println("Nip dosen : "+d.getNip());
        d.siapaKamu();
        d.mengajarApa();
        System.out.println();
        Mahasiswa m = new Mahasiswa ("10110269");
        System.out.println("Nim Mahasiswa : "+m.getNim());
        m.siapaKamu();
        m.kelasApa();
    }
    
}
