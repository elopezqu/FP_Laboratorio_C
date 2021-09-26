import java.util.*;
class negocio {
  public static int contador=0;
  public static int contador2=0;
  public static persona[]sujeto = new persona[10]; 
  public static paquete[]pack = new paquete[20];
  
  public static void main(String[] args){
    for(int i=0;i<sujeto.length;i++){
      sujeto[i] = new persona();
    }
    for(int i=0;i<pack.length;i++){
      pack[i] = new paquete();
      pack[i].setFechaE("n");
    }
    int respuesta;
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("------------------------------------------");
      System.out.println("| Bienvenido a la oficina de paqueteria  |");
      System.out.println("| Desea..                                |");
      System.out.println("| 1.Registrarse                          |");
      System.out.println("| 2.Registrar un paquete                 |");
      System.out.println("| 3.Fechas de entrega                    |");
      System.out.println("| 4.Buscar paquetes por peso superior a  |");
      System.out.println("| 5.Buscar paquete por costo             |");
      System.out.println("| 6.Buscar paquetes que no se han enviado|");
      System.out.println("| 7.Buscar persona por numero de paquete |");
      System.out.println("| 8.Buscar paquete por DNI               |");
      System.out.println("| 9.Salir                                |");
      System.out.println("------------------------------------------");
      System.out.print("Opcion: ");
      respuesta = sc.nextInt();
      if(respuesta==9)
        break;
      switch(respuesta){
        case 1 : registrarPersona();
                 break;
        case 2 : registrarPaquete();
                 break;
        case 3 : fechaEntrega();
                 break;
        case 4 : buscarPorPeso();
                 break;
        case 5 : buscarPorCosto();
                 break;
        case 6 : buscarEntrega();
                 break;
        case 7 : buscarPersona();
                 break;
        case 8 : buscarPaquete();
      } 
    }
  }
  static void registrarPaquete(){
    Scanner sc = new Scanner(System.in);
    String nombre,fechaR,direccion;
    int dni;
    double costo,peso;
    System.out.print("*Ingrese su nombre: ");
    nombre = sc.next();
    System.out.print("*Ingrese su DNI: ");
    dni = sc.nextInt();
    System.out.println("*Ingrese la fecha de hoy");
    System.out.print("*Dia: ");
    int dia = sc.nextInt();
    System.out.print("*Mes: ");
    int mes = sc.nextInt();
    System.out.print("*Año: ");
    int ano = sc.nextInt();
    fechaR = dia+"/"+mes+"/"+ano+"";
    System.out.print("*Ingrese la direccion(usando _ como espaciador): ");
    direccion = sc.next();
    System.out.print("*Ingrese el costo(s/.): ");
    costo = sc.nextDouble();
    System.out.print("*Ingrese el peso del paquete(Kg): ");
    peso = sc.nextDouble();
    if(!verificar(dni)){
      pack[contador].setIdentificador(contador);
      pack[contador].setNombre(nombre);
      pack[contador].setDNI(dni);
      pack[contador].setFechaR(fechaR);
      pack[contador].setDireccion(direccion);
      pack[contador].setCosto(costo);
      pack[contador].setPeso(peso);
      llenarFechaEntrega();
      contador++;
      for(int i=0;i<sujeto.length;i++){
        if(sujeto[i].getDNI()==dni){
          sujeto[i].setID(contador);
          break;
        }
      }
      System.out.println("***Identificador del paquete: "+contador+" ***");
      System.out.println("+++++++Registro exitoso+++++++");
    }
    else 
      System.out.println("No esta registrado, por lo tanto no se considera su paquete");
  }
  static boolean verificar(int dni){
    int aux=0;
    for(int i=0;i<sujeto.length;i++){
      if(sujeto[i].getDNI()==dni)
        aux++;
    }
    if(aux==0)
      return true;
    else
      return false;
  }
  static void registrarPersona(){
    Scanner sc = new Scanner(System.in);
    String nombre;
    int dni;
    double celular;
    System.out.print("*Ingrese su Nombre: ");
    nombre = sc.next();
    System.out.print("*Ingrese su DNI: ");
    dni = sc.nextInt();
    System.out.print("*Ingrese su celular: ");
    celular = sc.nextDouble();
    if(verificar(dni)){
      sujeto[contador2].setNombre(nombre);
      sujeto[contador2].setDNI(dni);
      sujeto[contador2].setCelular(celular);
      contador2++;
      System.out.println("+++++++Registro exitoso+++++++");
    }
    else 
      System.out.println("!Usted ya esta registrado¡");
  }
  static void fechaEntrega(){
    Scanner sc = new Scanner(System.in);
    int dni,id,dia;
    System.out.print("*Ingrese su dni: ");
    dni = sc.nextInt();
    if(!verificar(dni)){
      System.out.print("*Ingrese identificador del paquete: ");
      id = sc.nextInt();
      System.out.println("++Estado del paquete++");
      System.out.println("*"+pack[id-1].getFechaE());
    }
    else 
      System.out.println("Usted no esta registrado");
  }
  static void buscarPorPeso(){
    Scanner sc = new Scanner(System.in);
    double peso;
    System.out.print("*Ingrese peso(Kg): ");
    peso = sc.nextDouble();
    System.out.println("*Los paquetes con peso superior son:");
    for(int i=0;i<pack.length;i++){
      if(pack[i].getPeso()>peso)
        System.out.println("*Paquete con ID: "+ (i+1));
    }
    System.out.println("");
  }
  static void buscarPorCosto(){
    Scanner sc = new Scanner(System.in);
    double costo;
    System.out.print("*Ingrese Costo(s/.): ");
    costo = sc.nextDouble();
    System.out.println("*Los paquetes con costo igual a "+costo+" son:");
    for(int i=0;i<pack.length;i++){
      if(pack[i].getCosto()==costo)
        System.out.println("*Paquete con ID: "+ (i+1));
    }
    System.out.println("");
  }
  static void llenarFechaEntrega(){
    int dia;
    dia=(int)(Math.random()*31);
    if(dia>25)
      pack[contador].setFechaE("No entregado"); 
    else 
      pack[contador].setFechaE("*Fecha de entrega: "+dia+"/09/2021");
  }
  static void buscarEntrega(){
    System.out.println("*Los paquetos por ser enviados son: ");
    for(int i=0;i<pack.length;i++){
      if(pack[i].getFechaE().equals("No entregado"))
        System.out.println("*Paquete con ID: "+(i+1));
    }
  }
  static void buscarPersona(){
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("*Ingrese Identificador de paquete:");
    num = sc.nextInt();
    for(int i=0;i<sujeto.length;i++){
      if(sujeto[i].getID(num)!=-1){
        System.out.println("*Paquete: "+num);
        System.out.println("*Nombre: "+sujeto[i].getNombre());
        System.out.println("*DNI: "+sujeto[i].getDNI());
        System.out.println("*Celular: "+sujeto[i].getCelular());
        break;
      }
    }
  }
  static void buscarPaquete(){
    int dni,aux=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("*Ingrese numero de DNI:  ");
    dni = sc.nextInt();
    for(int i=0;i<sujeto.length;i++){
      if(sujeto[i].getDNI()==dni){
        int[] IDpack = sujeto[i].getArrayID();
        for(int g=0;g<IDpack.length;g++){
          if(IDpack[g]!=0)
            aux++;
        }
        for(int f=0;f<aux;f++){
          System.out.println("*Paquete: "+IDpack[f]);
          System.out.println("*Fecha de Entrega: "+pack[IDpack[f]-1].getFechaE());
          System.out.println("*Fecha de Recepcion: "+pack[IDpack[f]-1].getFechaR());
          System.out.println("*Peso: "+pack[IDpack[f]-1].getPeso());
          System.out.println("*Costo: "+pack[IDpack[f]-1].getCosto());
          System.out.println("*Direccion: "+pack[IDpack[f]-1].getDireccion());
        }
      }
    }
  }
}

