/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg4;

class mobil {
    
    String warna;
    int tahunproduksi;
    
    public mobil (String warna, int tahunproduksi){
        this.warna = warna;
        this.tahunproduksi = tahunproduksi;
    }
    
    public void info(){
        System.out.println("warna : " +this.warna);
        System.out.println("tahun : " +this.tahunproduksi);
    }
}


public class PBO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mobil mobilku = new mobil("hijau", 2003);
        mobilku.info();
        
        
    }
    
}
