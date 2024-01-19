package bangunruang;

public class Balok extends BangunRuang{
    double p, l, t;
    
    double Volume(){
        double v = (double) (p*l*t);
        System.out.println("Volume Balok : " + v);
        return v;
    }
    double LuasP(){
        double P = (double) (2*((p*l) + (p*t) + (l*t)));
        System.out.println("Luas Permukaan Balok : " + P);
        return P;
    }
}
