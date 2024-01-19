package bangunruang;

public class Tabung {
    double r, t;
    
    double Volume(){
        double V = (double) (Math.PI*r*t*2);
        System.out.println("Volume Tabung : " +V);
        return V;
    }
    double Luasp(){
        double P = (double) ((Math.PI*2*r*t)+(Math.PI*2*r*r));
        System.out.println("Luas Permukaan Tabung : " + P);
        return P;
    }
}
