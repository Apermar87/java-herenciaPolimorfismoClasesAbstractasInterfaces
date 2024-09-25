public class Camion extends Vehiculo {
    private int tonelada;
    private int tara;

    public Camion(){
        super();
        tonelada = 0;
        tara = 0;
    }

    public Camion ( int tonelada, int tara, String matricula, int diasAlquiler){
        super(matricula, diasAlquiler);
        this.tonelada = tonelada;
        this.tara = tara;
    }

    @Override
    public double importeAlquiler(){
        double alquiler = 50*super.getDiasAlquiler() + (50*tonelada) + 40;
        return alquiler;
    }

    @Override
    public void recibo(){
        System.out.println("--------------------------------\n");
        System.out.println("CAMIÓN\n");
        System.out.println("--------------------------------\n");
        System.out.println("Matricula: " + super.getMatricula() + "\n");
        System.out.println("Duración: " + super.getDiasAlquiler() + "\n");
        System.out.println("TARA: " + tara + "\n");
        System.out.println("Importe del alquiler: " + importeAlquiler() + " €\n");
    }
}
