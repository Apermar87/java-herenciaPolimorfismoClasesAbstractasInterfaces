public class Bus extends Vehiculo {
    private int plazas ;

    public Bus() {
        super();
        plazas = 0;
    }

    public Bus(int plazas, String matricula, int diasAlquiler) {
        super(matricula, diasAlquiler);
        this.plazas = plazas;
    }

    @Override
    public double importeAlquiler(){
        double alquiler = 50*super.getDiasAlquiler() + (1.5*plazas*super.getDiasAlquiler())+ (2 *plazas);
        return alquiler;
    }

    @Override
    public void recibo(){
        System.out.println("--------------------------------\n");
        System.out.println("BUS\n");
        System.out.println("--------------------------------\n");
        System.out.println("Matricula: " + super.getMatricula() + "\n");
        System.out.println("Duración: " + super.getDiasAlquiler() + "\n");
        System.out.println("Plazas: " + plazas + "\n");
        System.out.println("Importe del alquiler: " + importeAlquiler() + " €\n");
    }

    
}
