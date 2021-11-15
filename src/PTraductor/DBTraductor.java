package PTraductor;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Flow;

public class DBTraductor {
    
    public void CrearAchivo(){
        
        try {
            
            String palabra1, palabra2,val = null;
            HashMap<String,String> traductorEI = new HashMap<String, String>();
            traductorEI.put("Perro", "Dog");
            traductorEI.put("Gato", "Cat");
            traductorEI.put("Jirafa", "Giraffe");
            traductorEI.put("Caballo", "Horse");
            traductorEI.put("Leon", "Lion");
            Set<String> keys = traductorEI.keySet();
//            Set<String> values = traductorEI.values();
            System.out.println("El listado de palabras disponibles para traducir son: \n");
            for(String key:keys){
                String valor = traductorEI.get(key);
                System.out.println(key);
                }
            System.out.println("");
                        
            String ruta = "D:\\MACH\\All Mach Perfil\\My Docs\\NetBeansProjects\\Traductor_Esp_Ing\\DBTraductor.txt";
            Scanner Scan = new Scanner(System.in);
            System.out.println("Ingrese la palabra en español del listado que desea traducir: ");
            palabra1 = Scan.nextLine();                     
          
              if(!palabra1.equals("Gato")){
            } else {
                val = traductorEI.get("Gato").toString();
                System.out.println("La traduccion de la palabra escogida es: \n"+val);
            } if(!palabra1.equals("Perro")){
            } else {
                val = traductorEI.get("Perro").toString();
                System.out.println("La traduccion de la palabra escogida es: \n"+val);
            } if(!palabra1.equals("Jirafa")){
            } else {
                val = traductorEI.get("Jirafa").toString();
                System.out.println("La traduccion de la palabra escogida es: \n"+val);
            } if(!palabra1.equals("Caballo")){
            } else {
                val = traductorEI.get("Caballo").toString();
                System.out.println("La traduccion de la palabra escogida es: \n"+val);
            }if(!palabra1.equals("Leon")){
            } else {
                val = traductorEI.get("Leon").toString();
                System.out.println("La traduccion de la palabra escogida es: \n"+val);
            } if(!palabra1.equals("")){
            } else {
                System.out.println("La palabra escrita no esta en la DB");
                return;
            }
         
                      
     
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(palabra1);
            bw.newLine();
            bw.write(val);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void LeerArchivo(String nombreArchivo){
        
        try{
            System.out.println("\nLectura del archivo\n");
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);

            String temp = "";

            while (temp!=null){
                temp = buffer.readLine();

                if (temp==null)
                    break;
                System.out.println(temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



    
