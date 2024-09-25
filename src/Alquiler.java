import java.util.ArrayList;
import java.util.Scanner;

public class Alquiler implements Facturacion {
    private ArrayList<Vehiculo> pedido;

    public Alquiler(int numeroVehiculos) {
        char tipo;
        String matricula;
        int dias, plazas;

        Scanner input = new Scanner(System.in);

        pedido = new ArrayList<Vehiculo>();

        for (int i = 0; i < numeroVehiculos; i++) {
            System.out.println("Introduce el tipo de vehículo a introducir");
            tipo = input.next().charAt(0);

            // Para limpiar el buffer podemos hacer otro nextLine
            input.nextLine();

            System.out.println("Introduce la matrícula del vehículo");
            matricula = input.nextLine();

            System.out.println("Introduce los días de alquiler");
            dias = input.nextInt();

            System.out.println("Introduce las plazas");
            plazas = input.nextInt();

            if (tipo == 'C') {
                Coche c = new Coche(plazas, matricula, dias);
                pedido.add(c);
            } else {
                Bus b = new Bus(plazas, matricula, dias);
                pedido.add(b);
            }
        }
        input.close();
    }

    public double getImporteTotal() {
        double total = 0;
        for (int i = 0; i < pedido.size(); i++) {
            total += getImporteVehiculo(i);
        }
        return total;
    }

    public double getImporteVehiculo(int pos) {
        double importe;
        importe = pedido.get(pos).importeAlquiler();
        return importe;
    }

    @Override
    public void mostrarFactura() {
        System.out.println("Total alquiler: " + getImporteTotal() + " €\n");
        System.out.println("--------------------------------------------\n");
        System.out.println("DETALLE\n");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < pedido.size(); i++) {
            System.out.println("VEHÍCULO " + i + "\n");
            pedido.get(i).recibo();
        }
    }
}
