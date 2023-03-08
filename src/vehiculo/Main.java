package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoVicenteSantosAntonio2223 miVehiculoVicenteSantosAntonio2223;
        int stockActual;
        
        miVehiculoVicenteSantosAntonio2223 = new VehiculoVicenteSantosAntonio2223("Seat",18000,100);
        operativaVehiculosVicenteSantosAntonio2223(miVehiculoVicenteSantosAntonio2223, 50); 
    }

    private static void operativaVehiculosVicenteSantosAntonio2223(VehiculoVicenteSantosAntonio2223 miVehiculoVicenteSantosAntonio2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoVicenteSantosAntonio2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoVicenteSantosAntonio2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoVicenteSantosAntonio2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
