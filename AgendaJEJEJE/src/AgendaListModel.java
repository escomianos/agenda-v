import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import javax.swing.AbstractListModel;



public class AgendaListModel extends AbstractListModel{
     private ArrayList<Cita> citas=new ArrayList<Cita>();
    
    /** Creates a new instance of AgendaListModel */
    public AgendaListModel() {
    }
    
    public void limpiar(){
        citas.clear();
    }
    
    public void addCita(Cita nueva){
        citas.add(nueva);
    }
    
    public void ordenarHora(){
        Collections.sort(citas, new Comparator() {
            public int compare(Object o1, Object o2) {
                Cita c1=(Cita)o1;
                Cita c2=(Cita)o2;
                return c1.getCalendario().get(GregorianCalendar.HOUR)-c2.getCalendario().get(GregorianCalendar.HOUR);
            }
            public boolean equals(Object obj) {
                return true;
            }
        });
    }

    public Object getElementAt(int index) {
        return citas.get(index);
    }

    public int getSize() {
        return citas.size();
    }

}
