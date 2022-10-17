package sesi4;
public class Matematika {
    
    //tipe data gabungan
    public static double Penjumlahan (double x, int y){
        return (double) x+y;
    }
    
    //tipe int
    public static int Penjumlahan (int x, int y){
        return x+y;
    }
    
    //tipe double
    public static double penjumlahan (double x, double y){
        return (double) x+y;
    }
    
    public static void main(String[] args) {
        Matematika m = new Matematika(); 
        
        int a = m.Penjumlahan(3, 17);//20
        System.out.println(a);
        int b = m.Penjumlahan(4, 3);//7
        System.out.println(b);
        int c = m.Penjumlahan(4, 4); //8
        System.out.println(c);
    }
}
