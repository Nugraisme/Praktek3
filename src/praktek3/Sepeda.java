/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek3;

/**
 *
 * @author ASUS
 */
public class Sepeda {
    private String merk;
    private String warna;
    private Double harga;
    
    void cetakInfo(){
        System.out.println("Merk \t : "+merk+"\n"+
                "Warna \t : "+warna+"\n"+
                "Harga \t : "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
    
    
}
