class paquete{
  private int identificador;
  private String fechaEntrega;
  private String fechaRecepcion;
  private double peso;
  private String direccion;
  private double costo;
  private String nombre;
  private int dni;

  public void setIdentificador(int ide){
    identificador=ide;
  }
  public void setFechaE(String fecha){
    fechaEntrega=fecha;
  }
  public void setFechaR(String fecha){
    fechaRecepcion=fecha;
  }
  public void setPeso(double Peso){
    peso=Peso;
  }
  public void setDireccion(String ruta){
    direccion=ruta;
  }
  public void setCosto(double Costo){
    costo=Costo;
  }
  public void setNombre(String name){
    nombre=name;
  }
  public void setDNI(int DNI){
    dni=DNI;
  }
  public int getIdentificador(){
    return identificador;
  }
  public String getFechaE(){
    return fechaEntrega;
  }
  public String getFechaR(){
    return fechaRecepcion;
  }
  public double getPeso(){
    return peso;
  }
  public String getDireccion(){
    return direccion;
  }
  public double getCosto(){
    return costo;
  }
  public String getNombre(){
    return nombre;
  }
  public int getDNI(){
    return dni;
  }
}

