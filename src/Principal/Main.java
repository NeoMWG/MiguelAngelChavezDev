package Principal;

import PTraductor.DBTraductor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        DBTraductor c = new DBTraductor();
        DBTraductor t = new DBTraductor();
        
        int opcion = 1;
            while(opcion >= 1 && opcion <=3){
                System.out.println("\nMENU");
                System.out.println("1. Traducir");
                System.out.println("2. Leer Diccionario");
                System.out.println("3. Salir\n\n");

                opcion = Integer.parseInt(leer.readLine());
                switch(opcion){
                    case 1:
                        c.CrearAchivo();
                        break;
                        
                    case 2:
                        t.LeerArchivo("DBTraductor.txt");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;                    
                }
            }
         }
    }
