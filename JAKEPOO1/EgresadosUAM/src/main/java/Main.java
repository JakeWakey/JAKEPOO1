import com.uam.egresados.egresadosuam.model.Egresado;
import com.uam.egresados.egresadosuam.model.TelefonosEgresado;
import service.service.EgresadosIDAO;
import service.service.EgresadosImplIDAO;

import java.util.List;


//Sql manager configuraton
//Protocolo TCP/IP enable
public class Main {
    public static void main(String[] args) {
        EgresadosIDAO dao = new EgresadosImplIDAO();
        List<Egresado> egresadoList = dao.getAll("Egresado.all", Egresado.class);
        Egresado egresado = new Egresado();
        try {
            egresado.setId(1);
            egresado.setPrimerNombre("Daniel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        dao.insert(egresado);

;

    }
}
