class persona {
  public int contador3=0;
  private String nombre;
  private int dni;
  private double celular;
  private int[]identificadores = new int[20];
  
  public void setCelular(double cel){
    celular=cel;
  }
  public void setDNI(int DNI){
    dni=DNI;
  }
  public void setNombre(String name){
    nombre=name;
  }
  public void setID(int id){
    identificadores[contador3]=id;
    contador3++;
  }
  public String getNombre(){
    return nombre;
  }
  public int  getDNI(){
    return dni;
  }
  public double getCelular(){
    return celular;
  }
  public int[] getArrayID(){
    return identificadores;
  }
  public int getID(int id){
    int posicion = -1;
    for(int i=0;i<identificadores.length;i++){
      if(identificadores[i]==id)
        return i+1;
    }
    return posicion;
  }
}
