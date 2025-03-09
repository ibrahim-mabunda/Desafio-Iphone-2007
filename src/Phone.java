public class Phone implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("Efectuando uma chamada");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
