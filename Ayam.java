
package sesi4;

public class Ayam extends Binatang {
    public void Suara(){
        super.Suara();
        System.out.println("Ayam : kukuruuuyyyukkkk..... ");
    }
    public static void main(String[] args) {
        Ayam a = new Ayam();
        a.Suara();
    }
}
