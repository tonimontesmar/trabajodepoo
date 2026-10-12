package mostrador;

import VECTERIN.Macotas;

public class Mostrador {
    public static void main() {
        Macotas[ ] clientes = new Macotas[3];

        clientes[0]= new Macotas("luna" , 9,"perro",28.5 ) ;
        clientes[1]= new Macotas("michi", 3,"gato", 4.2 ) ;
        clientes[2]= new Macotas("Rocky", 5,"perro",12.5) ;
        clientes[3]= new Macotas("Pepa" ,1,"conejo", 2.1) ;
    }
}
