package bangunruang;

public class LimasSegitiga {
    double lAlas, tLimas, lSelubung;
    
    double Volume(){
        double V = (double) (lAlas*tLimas/3);
        System.out.println("Volume Limas Segitiga : " + V);
        return V;
    }
    double LuasP(){
        double P = (double) (lAlas+lSelubung);
        System.out.println("Luas Permukaan Limas Segitiga : " +P);
        return P;
    }
}
