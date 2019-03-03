/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg4;

class waktu{
    int input, hari, jam, menit, detik;
    
    public waktu (int input){
        this.input= input;
        this.hari = input/86400;
        int sisa1= input%86400, sisa2=sisa1%3600;
        this.jam= sisa1/3600;
        this.menit = sisa2/60;
        this.detik= sisa2%60;
    }
    
    public void cetakwaktu(){
            System.out.println("input detik     : " +this.input);
            System.out.println("hari            : " +this.hari);
            System.out.println("jam             : " +this.jam);
            System.out.println("menit           : " +this.menit);
            System.out.println("detik           : " +this.detik);
}
    
}


public class konversidetik {
    public static void main(String[] args) {
        waktu waktuku= new waktu(180061);
        waktuku.cetakwaktu();
        
    }
}
