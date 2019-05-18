package domain.bussines;

import java.util.Date;

public class Tarjeta {
    private int CVC;
    private int numero;
    private Date fechaVencimiento;
    private String nombreTitular;

    public Tarjeta(int CVC, int numero, Date fechaVencimiento, String nombreTitular) {
        this.CVC = CVC;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreTitular = nombreTitular;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public boolean esVisa(){
        boolean esVisa = false;
        if(Integer.toString(numero).indexOf(0)=='4'){
            esVisa=true;
        }
        return esVisa;
    }
}
