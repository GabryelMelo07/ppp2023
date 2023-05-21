package apresentacao;

import java.time.LocalDate;

import negocio.CarroProxy;
import negocio.Empregado;

public class App {
    public static void main(String[] args) throws Exception {

        Empregado gabryel = new Empregado("Gabryel", LocalDate.of(2000, 02, 17), 12345678910L);
     
        Empregado igor = new Empregado("Igor avila", LocalDate.of(1995, 01, 01));

        Empregado joaquim = new Empregado("Joaquim Guilherme Galvão", LocalDate.of(2006, 03, 17));

        CarroProxy fusca = new CarroProxy(1960, "fusca", "volkswagen", "IVA5I90", 1235469742L);

        System.out.println(fusca.manobrar(gabryel)); // Maior de idade e tem CNH, pode manobrar.
        System.out.println(fusca.manobrar(igor)); // Maior de idade e NÃO tem CNH, NÃO pode manobrar.
        System.out.println(fusca.manobrar(joaquim)); // Menor de idade e NÃO tem CNH, NÃO pode manobrar.
        
    }
}
