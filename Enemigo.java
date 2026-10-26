public class Enemigo {

    // ATRIBUTOS PRIVADOS
    private String nombreEnemigo;
    private int hpActuales;
    private int puntosGolpeMaximos;
    private int danioBase;

    // CONSTRUCTOR
    public Enemigo (String nombreEnemigo, int hpActuales, int puntosGolpeMaximos, int danioBase){
        this.nombreEnemigo = nombreEnemigo;
        this.hpActuales = puntosGolpeMaximos;
        this.puntosGolpeMaximos = puntosGolpeMaximos;
        this.danioBase = danioBase;
    }

    public String getNombreEnemigo(){
        return this.nombreEnemigo;
    }

    public int getHpActuales(){
        return this.hpActuales;
    }

    public int getPuntosGolpeMaximo(){
        return this.puntosGolpeMaximos;
    }

    public int getDanioBase(){
        return this.danioBase;
    }

    public void atacar (Aventurero aventurero){
        aventurero.recibirDanio(danioBase);
    }

    public void recibirDanio (int danio){
        hpActuales -= danio;
        if (hpActuales < 0){
            hpActuales = 0;
        }
    }

    public boolean estaDerrotado(){
        return hpActuales <= 0;
    }

}

