public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
   
   //ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Musica: "+ musica);
    }

    //AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Alô?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz iniciado...");
    }

    //NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Navegador - Pagina Web: "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador - Abrindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador - Atualizando pagina...");
    }
}
