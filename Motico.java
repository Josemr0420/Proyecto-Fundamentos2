public class Motico extends Vehiculo{
    public String tipo;
    public Motico(String p, String m, String c, int v){
        super(p,m,c,v,"moto");
        this.tipo = "moto";
    }
    public Motico(String p, String m, String c){
        super(p,m,c,"moto");
        this.tipo = "moto";
    }
    public Motico(){
    }
    public String getTipo(){
        return this.tipo;
    }
}
