package mostrador;

import VECTERIN.Macotas;

public class Mostrador {
     static void main() {
        Macotas[] clientes = new Macotas[4];

        clientes[0]= new Macotas("luna" , 9,"perro",28.5 );
        clientes[1]= new Macotas("michi", 3,"gato", 4.2 );
        clientes[2]= new Macotas("Rocky", 5,"perro",12.5);
        clientes[3]= new Macotas("Pepa" ,1,"conejo", 2.1);

        int total = 0 ;

        for (int i = 0; i < clientes.length; i++) {
        Macotas cliente = clientes[i] ;
        System.out.println(cliente.getNombre() + "valor" + cliente.getValorConsulta() );
        total = total + cliente.getValorConsulta() ;
    }
        System.out.println("total" + total);
    }
}
