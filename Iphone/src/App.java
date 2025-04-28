public class App {
    public static void main(String[] args) throws Exception {
        Iphone Iphone_15 = new Iphone();

        Iphone_15.adicionarNovaAba();
        Iphone_15.exibirPagina("www.dio.me");
        Iphone_15.atualizarPagina();

        Iphone_15.selecionarMusica("O Rappa - Anjos pra quem tem fé");
        Iphone_15.tocar();
        Iphone_15.pausar();

        Iphone_15.atender();
        Iphone_15.ligar("1191234-5678");
        Iphone_15.iniciarCorreioVoz();
        
    }
}
