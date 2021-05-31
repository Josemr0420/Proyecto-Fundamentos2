import java.io.File;
import java.text.BreakIterator;
import java.io.FileWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
public class Principal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de pisos en el edificio");
        int tamanoPisos = scan.nextInt();
        System.out.println("Por favor ingrese la cantidad de espacios por piso del edificio");
        int tamanoEspacios = scan.nextInt();
        Vehiculo.vehiculos = new Vehiculo[tamanoPisos][tamanoEspacios];
        Sensor.sensores = new Sensor[tamanoPisos][tamanoEspacios];
        Sensor.OrganizarArray();
        Vehiculo.tamano = tamanoPisos*tamanoEspacios;
        System.out.println("Cantidad maxima de vehiculos posibles" + Vehiculo.getTamano());
        System.out.println("Que desea hacer." );
        System.out.println("1: Numero de sensores desocupados."+"\n"+"2: Deseas parquear"+"\n"+"3: Deseas parquear (incluye valor comercial)"+"\n"
                +"4: Informacion de los vehiculos parqueados"+"\n"+"5. Historial de vehiculos"+"\n"+"6: Estado de espacio"+"\n"+"7: Estado de todos los sensores."+
                "\n"+"8: Filtro Vehiculo por color"+"\n"+"9: Filtro por valor comercial"+"\n"+"10: Retirar Vehiculo"+"\n"+"11: Modificar txt"+ "\n"+"0: Salir");
        int accion = scan.nextInt();
        while(accion != 0){
            switch(accion) {
                case 0:
                    System.out.println("Salir");
                    break;
                case 1:
                    System.out.println(Sensor.sensorLibre());
                    System.out.println("Que desea hacer.");
                    accion = scan.nextInt();
                    break;
                case 2:
                    System.out.println("Que tipo de Vehiculo desea parquear");
                    String tipo = scan.next();
                    if(tipo.equalsIgnoreCase("Carro")) {
                        System.out.println("por favor ingrese piso y espacio que quiere parquear");
                        int piso = scan.nextInt();
                        int espacio = scan.nextInt();
                        if ((piso < tamanoPisos) && (espacio < tamanoEspacios)) {
                            if (Sensor.sensores[piso][espacio].getEstado() == 1) {
                                System.out.println("Puesto ocupado");
                            } else if (Sensor.sensores[piso][espacio].getEstado() == 0) {
                                System.out.println("Ingrese la placa, la marca y el color");
                                String placa = scan.next();
                                String marca = scan.next();
                                String color = scan.next();
                                Carrito cr = new Carrito(placa, marca, color);
                                Vehiculo.vehiculos[piso][espacio] = cr;
                                Sensor.sensores[piso][espacio].setEstado(1);
                            }
                        } else {
                            System.out.println("Error");
                        }
                        System.out.println("Que desea hacer.");
                        accion = scan.nextInt();
                        break;
                    }else if(tipo.equalsIgnoreCase("Moto")){
                        System.out.println("por favor ingrese piso y espacio que quiere parquear");
                        int piso = scan.nextInt();
                        int espacio = scan.nextInt();
                        if ((piso < tamanoPisos) && (espacio < tamanoEspacios)) {
                            if (Sensor.sensores[piso][espacio].getEstado() == 1) {
                                System.out.println("Puesto ocupado");
                            } else if (Sensor.sensores[piso][espacio].getEstado() == 0) {
                                System.out.println("Ingrese la placa, la marca y el color");
                                String placa = scan.next();
                                String marca = scan.next();
                                String color = scan.next();
                                Motico mt = new Motico(placa, marca, color);
                                Vehiculo.vehiculos[piso][espacio] = mt;
                                Sensor.sensores[piso][espacio].setEstado(1);
                            }
                        } else {
                            System.out.println("Error");
                        }
                        System.out.println("Que desea hacer.");
                        accion = scan.nextInt();
                        break;
                    }else{
                        System.out.println("Vehiculo no permitido");
                    }
                case 3:
                    System.out.println("Que tipo de Vehiculo desea parquear");
                    tipo = scan.next();
                    if(tipo.equalsIgnoreCase("Carro")) {
                        System.out.println("por favor ingrese piso y espacio que quiere parquear");
                        int piso = scan.nextInt();
                        int espacio = scan.nextInt();
                        if ((piso < tamanoPisos) && (espacio < tamanoEspacios)) {
                            if (Sensor.sensores[piso][espacio].getEstado() == 1) {
                                System.out.println("Puesto ocupado");
                            } else if (Sensor.sensores[piso][espacio].getEstado() == 0) {
                                System.out.println("Ingrese la placa, la marca, el color y el valor");
                                String placa = scan.next();
                                String marca = scan.next();
                                String color = scan.next();
                                int precio = scan.nextInt();
                                Carrito cr = new Carrito(placa, marca, color, precio);
                                Vehiculo.vehiculos[piso][espacio] = cr;
                                Sensor.sensores[piso][espacio].setEstado(1);
                            }
                        } else {
                            System.out.println("Error");
                        }
                        System.out.println("Que desea hacer.");
                        accion = scan.nextInt();
                        break;
                    }else if(tipo.equalsIgnoreCase("Moto")){
                        System.out.println("por favor ingrese piso y espacio que quiere parquear");
                        int piso = scan.nextInt();
                        int espacio = scan.nextInt();
                        if ((piso < tamanoPisos) && (espacio < tamanoEspacios)) {
                            if (Sensor.sensores[piso][espacio].getEstado() == 1) {
                                System.out.println("Puesto ocupado");
                            } else if (Sensor.sensores[piso][espacio].getEstado() == 0) {
                                System.out.println("Ingrese la placa, la marca, el color y el valor");
                                String placa = scan.next();
                                String marca = scan.next();
                                String color = scan.next();
                                int precio = scan.nextInt();
                                Motico mt = new Motico(placa, marca, color, precio);
                                Vehiculo.vehiculos[piso][espacio] = mt;
                                Sensor.sensores[piso][espacio].setEstado(1);
                            }
                        } else {
                            System.out.println("Error");
                        }
                        System.out.println("Que desea hacer.");
                        accion = scan.nextInt();
                        break;
                    }
                case 4:
                    int m = 0;
                    while(m<Vehiculo.vehiculos.length){
                        int k = 0;
                        while(k<Vehiculo.vehiculos[m].length){
                            if(Vehiculo.vehiculos[m][k] != null){
                                System.out.println(Vehiculo.vehiculos[m][k].toString());
                            }
                            k++;
                        }
                        m++;
                    }
                    System.out.println("Que desea hacer.");
                    accion = scan.nextInt();
                    break;
                case 5:
                    System.out.println(Vehiculo.cantidadVehiculos());
                    System.out.println("Que desea hacer.");
                    accion = scan.nextInt();
                    break;
                case 6:
                    System.out.println("por favor ingrese piso y espacio que quiere parquear");
                    int piso = scan.nextInt();
                    int espacio = scan.nextInt();
                    if((piso<tamanoPisos) && (espacio<tamanoEspacios)) {
                        if (Sensor.sensores[piso][espacio].getEstado() == 1) {
                            System.out.println("Puesto ocupado");
                        } else if (Sensor.sensores[piso][espacio].getEstado() == 0) {
                            System.out.println("Puesto desocupado");
                        }
                    }
                    System.out.println("Que desea hacer.");
                    accion = scan.nextInt();
                    break;
                case 7:
                    System.out.println(Sensor.sensoresEstado());
                    System.out.println("Que desea hacer.");
                    accion = scan.nextInt();
                    break;
                case 8:
                    System.out.println(Vehiculo.sortearPorColor());
                    System.out.println("Que desea hacer.");
                    accion = scan.nextInt();
                    break;
                case 9:
                    Vehiculo.mostrarVehiculosOrdenados();
                    System.out.println("Que desea hacer.");
                    accion = scan.nextInt();
                    break;
                case 10:
                    System.out.println("En que posicion está el vehiculo a retirar?. Primero ingrese el piso y luego el espacio");
                    piso = scan.nextInt();
                    espacio = scan.nextInt();
                    if(Vehiculo.vehiculos[piso][espacio] != null){
                        Vehiculo.vehiculos[piso][espacio] = null;
                        Sensor.sensores[piso][espacio].setEstado(0);
                        System.out.println("Su vehiculo ha sido retirado con exito");
                    }else{
                        System.out.println("No hay vehiculo a retirar");
                    }
                    System.out.println("Que desea hacer.");
                    accion = scan.nextInt();
                    break;
                case 11:
                    System.out.println("modificando txt");
                    m = 0;
                    String texto = "";
                    while(m<Vehiculo.vehiculos.length){
                        int k = 0;
                        while(k<Vehiculo.vehiculos[m].length){
                            if(Vehiculo.vehiculos[m][k] != null){
                                texto = texto + Vehiculo.vehiculos[m][k].toString();
                            }
                            k++;
                        }
                        m++;
                    }
                
                
                    try {
                        PrintWriter writer = new PrintWriter("/Users/Usuario/Desktop/xdnt.txt", "UTF-8");
                        writer.println("Informacion de los vehiculos");
                        writer.println(texto);
                        writer.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("texto listo");
                    System.out.println("Que desea hacer.");
                    accion = scan.nextInt();
                    break;
            }
        }

    }
}