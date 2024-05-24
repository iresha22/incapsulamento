public class Auto {
    //le variabili instance
    private String cilindrata;
    private String targa;
    private String marca;
    private String modello;
    // il costruttore
    public Auto(String cilindrata,String targa,String marca,String modello){
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.targa = targa;
    }
    // i getter e setter
    public String getMarca(){
       return marca;
    }
    public void setMarca(String marca){
       this.marca = marca;
    }


    public String getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
    //  il override
     @Override
    public String toString() {
        return "Auto{" +
                "cilindrata='" + cilindrata + '\'' +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}


