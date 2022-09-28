public class Controle {
    private int volume;
    private int canal;

    public Controle(TV tv) {
        this.canal = getCanal();
        this.volume = getVolume();
    }

    public int getVolume() {
        return volume;
    }

    public void aumentarVolume(TV tv) {
        this.volume++;
        tv.setVolume(this.volume);
    }

    public void diminuirVolume(TV tv) {
        this.volume--;
        tv.setVolume(this.volume);
    }

    public int getCanal() {
        return canal;
    }

    public void aumentarCanal(TV tv) {
        this.canal++;
        tv.setCanal(this.canal);
    }

    public void diminuirCanal(TV tv) {
        this.canal--;
        tv.setCanal(this.canal);
    }

}
