
package Modelo;

public class Ventas {
    
    private String NombreV; 
    private int CedulaV ;
    private String TipoDeAuto ;
    private int CodigoDelAuto;
    private int MontoDeLaVenta ;

    public Ventas() {
    }

    public Ventas(String NombreV, int CedulaV, String TipoDeAuto, int CodigoDelAuto, int MontoDeLaVenta) {
        this.NombreV = NombreV;
        this.CedulaV = CedulaV;
        this.TipoDeAuto = TipoDeAuto;
        this.CodigoDelAuto = CodigoDelAuto;
        this.MontoDeLaVenta = MontoDeLaVenta;
    }

    public String getNombreV() {
        return NombreV;
    }

    public void setNombreV(String NombreV) {
        this.NombreV = NombreV;
    }

    public int getCedulaV() {
        return CedulaV;
    }

    public void setCedulaV(int CedulaV) {
        this.CedulaV = CedulaV;
    }

    public String getTipoDeAuto() {
        return TipoDeAuto;
    }

    public void setTipoDeAuto(String TipoDeAuto) {
        this.TipoDeAuto = TipoDeAuto;
    }

    public int getCodigoDelAuto() {
        return CodigoDelAuto;
    }

    public void setCodigoDelAuto(int CodigoDelAuto) {
        this.CodigoDelAuto = CodigoDelAuto;
    }

    public int getMontoDeLaVenta() {
        return MontoDeLaVenta;
    }

    public void setMontoDeLaVenta(int MontoDeLaVenta) {
        this.MontoDeLaVenta = MontoDeLaVenta;
    }
    
    
    
    
    
}
