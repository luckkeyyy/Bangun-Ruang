package bangunruang;

public class BangunRuang {

    public static void main(String[] args) {
        Balok obj = new Balok();
        obj.l = 12;
        obj.p = 23;
        obj.t = 10;
        obj.Volume();
        obj.LuasP();
        
        Bola oke = new Bola();
        oke.r = 7;
        oke.LuasP();
        oke.Volume();
        
        LimasSegitiga bos = new LimasSegitiga();
        bos.lAlas = 12;
        bos.lSelubung = 22;
        bos.tLimas = 30;
        bos.LuasP();
        bos.Volume();
        
        Tabung sap = new Tabung();
        sap.r = 17;
        sap.t = 23;
        sap.Luasp();
        sap.Volume();
    }
    
}
