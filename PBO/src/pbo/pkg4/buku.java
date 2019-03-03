/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg4;

class book{
    String judul, pengarang, penerbit;
    int tahun;
    
    public book(String judul , String pengarang , String penerbit, int tahun){
        this.judul= judul;
        this.pengarang= pengarang;
        this.penerbit= penerbit;
        this.tahun= tahun;
    }
    
    public void cetakbuku(){
        System.out.println(""+this.judul+","+this.pengarang+","+this.penerbit+","+this.tahun);
    }
    
}



public class buku {
    
    public static void main(String[] args) {
        
        book bukuku= new book("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo",2007);
        book bukumu= new book("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset",2004);
        bukuku.cetakbuku();
        bukumu.cetakbuku();
    }
    
}
