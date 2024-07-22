package iphone.ipod;

public class ReprodutorMusical implements Ipod{

    @Override
    public void tocar(){
        System.out.println("Tocando musica!");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando musica!");
    }

    public void selecionarMusica(String musica){
        System.out.println("Musica + " + musica + " selecionada!");
    }
}
