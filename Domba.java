
package sesi4;

public class Domba extends Binatang {
    public void Suara(){
        super.Suara();
        System.out.println("Domba : emmbee....");
    }
    public static void main(String[] args) {
        Domba d = new Domba();
        d.Suara();
    }
}
