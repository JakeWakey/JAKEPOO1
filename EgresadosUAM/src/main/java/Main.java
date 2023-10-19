import com.uam.egresados.egresadosuam.model.Egresado;
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
        egresado.setId(1);
        egresado.setPrimerNombre("Daniel");
        dao.insert(egresado);
    }
}
