
package sesi4;

public class Sapi extends Binatang {
    public void Suara(){
        super.Suara();
        System.out.println("Sapi : Ngoooooo......");
    }
    public static void main(String[] args) {
        Sapi s = new Sapi();
        s.Suara();
    }
}
