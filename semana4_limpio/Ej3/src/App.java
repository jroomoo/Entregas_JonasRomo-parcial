import java.util.ArrayList;
import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) {

        // 1. El tendero introduce los precios del día
        float precioManzana = Esdia.readFloat("Precio por kg de manzanas (sin IVA): ");
        float precioPera = Esdia.readFloat("Precio por kg de peras (sin IVA): ");

        Producto manzana = new Producto("Manzanas", precioManzana);
        Producto pera = new Producto("Peras",    precioPera);

        int cliente = 1;
        boolean otroCliente = true;
        while (otroCliente) {
            
            System.out.println("           CLIENTE " + cliente);
           
            ArrayList<Item> compra = new ArrayList<>();
            float kgManzanas = Esdia.readFloat("Kilos de manzanas (0 si ninguno): ");
            if (kgManzanas > 0) compra.add(new Item(manzana, kgManzanas));
            float kgPeras = Esdia.readFloat("Kilos de peras (0 si ninguno): ");
            if (kgPeras > 0) compra.add(new Item(pera, kgPeras));
            if (!compra.isEmpty()) {
                System.out.println("┌──────────────────────────────────────────────────────┐");
                System.out.printf("│ %-20s %30d │\n", "Cliente", cliente);
                System.out.println("├──────────────────────────────────────────────────────┤");

                float total = 0;

                for (Item item : compra) {
                    float subtotal = item.subtotal();
                    total += subtotal;

                    System.out.printf("│ %-11s │ %7.2f kg │ %7.2f €/kg │ %8.2f € │\n",
                            item.producto.nombre,
                            item.kilos,
                            item.producto.precioConIva(),
                            subtotal);
                }

                System.out.println("├──────────────────────────────────────────────────────┤");
                System.out.printf("│ %-40s %10.2f € │\n", "Total a pagar:", total);
                System.out.println("└──────────────────────────────────────────────────────┘");
            } else {
                System.out.println("El cliente no compró nada.");
            }
            cliente++;
            String respuesta = Esdia.readString("\n¿Otro cliente? (s/n): ");
            if (respuesta.equals("n")) otroCliente = false;

        }
    }
}