package bangunruang;

public class Bola extends BangunRuang {
    double r;
    
    double Volume(){
        double V = (double) (Math.PI*r*r*4);
        System.out.println("Volume Bola " + V);
        return V;
    }
    double LuasP(){
        double p = (double) (Math.PI*r*r*4);
        System.out.println("Luas Permukaan  " + p);
        return p;
}
}
