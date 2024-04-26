public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv() {
        ligada = true;
        System.out.println("Tv ligada!");
    }

    public void desligarTv() {
        ligada = false;
        System.out.println("Tv desligada!");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void abaixarVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void abaixarCanal() {
        canal--;
        System.out.println("Canal: " + canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }

}
