package modelos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conversor {
    private String baseMoneda;
    private String monedaDestino;
    private double cantidad;
    private double conversion;
    private List<Conversor>historicoConversiones;

    public Conversor(String baseMoneda, String monedaDestino, double cantidad, double conversion){
        this.baseMoneda=baseMoneda;
        this.monedaDestino=monedaDestino;
        this.cantidad=cantidad;
        this.conversion=conversion;
        this.historicoConversiones = new ArrayList<>();
    }



    public double getConversion() {
        return conversion;
    }

    public void setBaseMoneda(String baseMoneda) {
        this.baseMoneda = baseMoneda;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setConversion(double conversion) {
        this.conversion = conversion;
    }

    public void setHistoricoConversiones(List<Conversor> historicoConversiones) {
        this.historicoConversiones = historicoConversiones;
    }

    public List<Conversor> getHistoricoConversiones() {
        return historicoConversiones;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }


    public String getBaseMoneda() {
        return baseMoneda;
    }


    public double getCantidad() {
        return cantidad;
    }
    public void añadirRegistro(Conversor registro){
        this.historicoConversiones.add(registro);
    }

    @Override
    public String toString() {
        return "Conversion de "+baseMoneda+ "por el valor de "+cantidad+" a "+monedaDestino+" da como resultado "+conversion;
    }
}
