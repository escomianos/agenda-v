
import java.io.Serializable;
import java.util.GregorianCalendar;

public class Cita implements Serializable{
    private GregorianCalendar calendario;
    private String texto;
    /** Creates a new instance of Cita */
    public Cita(GregorianCalendar calendario, String texto) {
        this.setCalendario(calendario);
        this.setTexto(texto);
    }

    public GregorianCalendar getCalendario() {
        return calendario;
    }

    public void setCalendario(GregorianCalendar calendario) {
        this.calendario = calendario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String toString() {
        int hora = calendario.get(GregorianCalendar.HOUR_OF_DAY);
        return hora + "- " + texto;
    }
    

}// ultima
