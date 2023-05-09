import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ControladorAcesso {
    private List<String> codigosRegistrados;
    private List<LocalDateTime> datasEntrada;

    public ControladorAcesso() {
        codigosRegistrados = new ArrayList<>();
        datasEntrada = new ArrayList<>();
    }
    public void acessar(String codigo) {
        if (!codigosRegistrados.contains(codigo)) {
            codigosRegistrados.add(codigo);
            datasEntrada.add(LocalDateTime.now());
            System.out.println("Bem-vindo, acesso liberado");
        } else {
            System.out.println("Obrigado pela visita");
        }
    }

    public void registrarSaida(String codigo) {
        if (codigosRegistrados.contains(codigo)) {
            int indice = codigosRegistrados.indexOf(codigo);
            LocalDateTime dataEntrada = datasEntrada.get(indice);
            codigosRegistrados.remove(indice);
            datasEntrada.remove(indice);
            LocalDateTime dataSaida = LocalDateTime.now();
            System.out.println("Registro de entrada: " + dataEntrada);
            System.out.println("Registro de saída: " + dataSaida);
        } else {
            System.out.println("Código não encontrado");
        }
    }
}