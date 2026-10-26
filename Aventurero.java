public class Aventurero {
    // PRIVADOS
    private String nombreAventurero;
    private int hpActuales;
    private int puntosGolpeMaximo;
    private int danioBase;
    private int cantidadPociones;

    private final int curacionPocion = 20;

    public Aventurero (String nombreAventurero, int hpActuales, int puntosGolpeMaximo, int danioBase, int cantidadPociones){
        this.nombreAventurero = nombreAventurero;
        this.hpActuales = puntosGolpeMaximo;
        this.puntosGolpeMaximo = puntosGolpeMaximo;
        this.danioBase = danioBase;
        this.cantidadPociones = cantidadPociones;
    }

    public void recibirDanio(int danio){
        hpActuales -= danio;
        if (hpActuales < 0){
            hpActuales = 0;
        }
    }

    public String getNombreAventurero(){
        return this.nombreAventurero;
    }

    public int getHpActuales(){
        return this.hpActuales;
    }

    public int getPuntosGolpeMaximo(){
        return this.puntosGolpeMaximo;
    }

    public int getDanioBase(){
        return this.danioBase;
    }

    public int getCantidadPociones(){
        return this.cantidadPociones;
    }
}