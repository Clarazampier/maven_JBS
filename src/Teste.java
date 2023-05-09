public class Teste {
    public static void main(String[] args) {
        ControladorAcesso controlador = new ControladorAcesso();

        //teste 1: acesso liberado
        controlador.acessar("1234");
        //teste 2: visita repetida
        controlador.acessar("1234");
        //teste 3: acesso liberado para outro código
        controlador.acessar("5678");
        //teste 4: registro de saída
        controlador.registrarSaida("1234");
    }
}
