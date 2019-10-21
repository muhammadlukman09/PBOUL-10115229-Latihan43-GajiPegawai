/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan43.gajipegawai;
import java.util.Scanner;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class PBOUL10115229Latihan43GajiPegawai {
    private static int gajtot;
    private static int massajenis;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gaji gaji1 = new Gaji();
        
        System.out.println("#### Data Gaji Karyawan PT. KAKATU ####");
        System.out.println("---------------------------------------");
        
        gaji1.setNama("Rizki Adam Kurniawan");
        gaji1.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaji1.setUangTransport(250000);
        gaji1.setUangTunjangan(300000);
        gaji1.setGajiPokok(4500000);
        gaji1.totalGaji(gaji1.getUangTransport(), gaji1.getUangTunjangan(), gaji1.getGajiPokok());
        
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        gaji1.tampilData(gaji1.getNama(), 
                gaji1.getAlamat(), 
                gaji1.getUangTransport(), 
                gaji1.getUangTunjangan(), 
                gaji1.getGajiPokok(), 
                gaji1.getTotalGaji());
      
        
        
        
        
        
        
        
        
    }
    
}
