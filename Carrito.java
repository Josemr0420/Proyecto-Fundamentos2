public class Carrito extends Vehiculo{
    public String tipo;
    public Carrito(String p, String m, String c, int v){
        super(p,m,c,v,"carro");
        this.tipo = "carro";

    }
    public Carrito(String p, String m, String c){
        super(p,m,c,"carro");
        this.tipo = "carro";
    }
    public Carrito(){
    }
    public String getTipo(){
        return this.tipo;
    }
}