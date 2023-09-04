
package Modelo;

public class Empleados {
    
    private String Nombre ;
    private int Cedula;
    private String Cargo;
    private int Telefono;
    private int FechaDeIngreso;
    private int SalarioFijo ;
    private int SalarioMasComisiones;

    public Empleados() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getFechaDeIngreso() {
        return FechaDeIngreso;
    }

    public void setFechaDeIngreso(int FechaDeIngreso) {
        this.FechaDeIngreso = FechaDeIngreso;
    }

    public int getSalarioFijo() {
        return SalarioFijo;
    }

    public void setSalarioFijo(int SalarioFijo) {
        this.SalarioFijo = SalarioFijo;
    }

    public int getSalarioMasComisiones() {
        return SalarioMasComisiones;
    }

    public void setSalarioMasComisiones(int SalarioMasComisiones) {
        this.SalarioMasComisiones = SalarioMasComisiones;
    }

    
    
}
