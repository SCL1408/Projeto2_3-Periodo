package modelos;

public class ModeloHumano {

    int idHumano;
    String nomeHumano;
    int idSexo;
    int idRotulo;
    String sexo;
    String rotulo;
    String fotoHumano;

    public ModeloHumano() {
    }

    public ModeloHumano(int idHumano, String nomeHumano, int idSexo, int idRotulo, String sexo, String rotulo, String fotoHumano) {
        this.idHumano = idHumano;
        this.nomeHumano = nomeHumano;
        this.idSexo = idSexo;
        this.idRotulo = idRotulo;
        this.sexo = sexo;
        this.rotulo = rotulo;
        this.fotoHumano = fotoHumano;
    }

    public int getIdHumano() {
        return this.idHumano;
    }

    public void setIdHumano(int idHumano) {
        this.idHumano = idHumano;
    }

    public String getNomeHumano() {
        return this.nomeHumano;
    }

    public void setNomeHumano(String nomeHumano) {
        this.nomeHumano = nomeHumano;
    }

    public int getIdSexo() {
        return this.idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public int getIdRotulo() {
        return this.idRotulo;
    }

    public void setIdRotulo(int idRotulo) {
        this.idRotulo = idRotulo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRotulo() {
        return this.rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getFotoHumano() {
        return this.fotoHumano;
    }

    public void setFotoHumano(String fotoHumano) {
        this.fotoHumano = fotoHumano;
    }
}
