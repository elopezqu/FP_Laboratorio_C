import java.util.*;
class Main {
  private int contador=0;
  private int contador2=0;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String nombreR,direccion,fechaR;
    int identificador,DNIr,respuesta;
    double costo,peso;
    persona[]Persona = new persona[10];
    paquete[]Paquete = new paquete[20];
    System.out.println("1.Registro de persona");
    System.out.println("2.Registro de paquetes");
    System.out.println("3.Fecha de entrega del paquete");
    System.out.println("4.Buscar paquetes por peso mayor a:");
    System.out.printlN("5.Buscar paquetes por costo");
    System.out.println("6.Mostrar paquetes pendientes");
    System.out.println("7.Mostrar datos de la persona por medio de un paquete");
    System.out.println("8.Mostrar datos del paquete por medio del dni");
    System.out.println("9.Salir");
    respuesta=sc.nextInt();
    if(respuesta==1){
      if(contador!=10){
       registrarse(Persona,Paquete); 
      }
      else{
        System.out.println("Limite de personas superado");
        break;
      }
    }
    if(respuesta==2){
      System.out.println("¿Ya se ha registrado o es nuevo usuario?");
      System.out.println("1. Nuevo");
      System.out.println("2. Ya me registre");
      if(contador2==20){
        System.out.println("Limite de paquetes exedidos");
        break;
      }
      else {
        System.out.print("Ingrese fecha de recepcion: ");
        fechaR=sc.next();
        System.out.print("Ingrese peso: ");
        peso=sc.nextDouble();
        System.out.print("Ingrese costo: ");
        costo=sc.nextDouble();
        System.out.print("Ingrese direccion: ");
        direccion=sc.next();
        System.out.print("Ingrese su nombre: ");
        nombreR=sc.next();
        System.out.print("Ingrese su DNI: ");
        DNIr=sc.nextInt();
        Paquete[contador2].setIdentificador("I"+contador2);
        Paquete[contador2].setFechaR(fechaR);
        Paquete[contador2].serPeso(peso);
        Paquete[contador2].setCosto(costo);
        Paquete[contador2].setDireccion(direccion);
        Paquete[contador2].setNombre(nombreR);
        Paquete[contador2].setNDI(DNIr);
      }
    }
    if(respuesta==3){
    }
    if(respuesta==4){
    }
    if(respuesta==5){
    }
    if(respuesta==6){
    }
    if(respuesta==7){
    }
    if(respuesta==8){
    }
    if(respuesta==9){
    }
  }
  static void registrarse(persona[]sujeto){
    String nombre;
    int dni,celular;
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese nombre: ");
    nombre=sc.next();
    System.out.print("Ingrese DNI: ");
    dni=sc.nextInt();
    System.out.print("Ingrese celular: ");
    celular=sc.nextInt();
    sujeto[contador].setNombre(nombre);
    sujeto[contador].setDNI(dni);
    sujeto[contador].setCelular(celular);
    contador++;
  }
}
