public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
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

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina Web: "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
}
