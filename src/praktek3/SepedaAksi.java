/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek3;

/**
 *
 * @author ASUS
 */
public class SepedaAksi {
    public static void main(String[] args) {
       Sepeda s = new Sepeda();
       s.setMerk("butterfly");
       s.setWarna("Merah");
       s.setHarga(1000.0);
       
       
       s.cetakInfo();
       
       System.out.print("Merknya    \t: ");
       System.out.println(s.getMerk());
       System.out.print("Warnanya   \t: ");
       System.out.println(s.getWarna());
       System.out.print("Harganya   \t: ");
       System.out.println(s.getHarga());
       
       SepedaMotor sm = new SepedaMotor();
       sm.setMerk("Hamaya");
       sm.setWarna("Hitam");
       sm.setHarga(10000.0);
       sm.setJenisMotor("Listrik");
       sm.cetakInfo();
       System.out.println("Jenis \t: "+sm.getJenisMotor());
       sm.throttle();
    }
}
