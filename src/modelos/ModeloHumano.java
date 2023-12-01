package modelos;

public class ModeloHumano {

    int idHumano;
    String nomeHumano;
    int idSexo;
    int idRotulo;
    String sexo;
    String rotulo;
    String fotoHumano;
    
    
    String logradouro;
    int numero;
    String complemento;
    String bairro;
    String cidade;
    String estado;
    String sigla;
    String cep;

    public ModeloHumano() {
    }

    public ModeloHumano(int idHumano, String nomeHumano, int idSexo, int idRotulo, String sexo, String rotulo, String fotoHumano, String logradouro, int numero, String complemento, String bairro, String cidade, String estado, String cep) {
        this.idHumano = idHumano;
        this.nomeHumano = nomeHumano;
        this.idSexo = idSexo;
        this.idRotulo = idRotulo;
        this.sexo = sexo;
        this.rotulo = rotulo;
        this.fotoHumano = fotoHumano;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        switch (sigla.toUpperCase()) {
            case "AC":
                this.estado = "Acre";
                break;
            case "AL":
                this.estado = "Alagoas";
                break;
            case "AP":
                this.estado = "Amapá";
                break;
            case "AM":
                this.estado = "Amazonas";
                break;
            case "BA":
                this.estado = "Bahia";
                break;
            case "CE":
                this.estado = "Ceará";
                break;
            case "DF":
                this.estado = "Distrito Federal";
                break;
            case "ES":
                this.estado = "Espírito Santo";
                break;
            case "GO":
                this.estado = "Goiás";
                break;
            case "MA":
                this.estado = "Maranhão";
                break;
            case "MT":
                this.estado = "Mato Grosso";
                break;
            case "MS":
                this.estado = "Mato Grosso do Sul";
                break;
            case "MG":
                this.estado = "Minas Gerais";
                break;
            case "PA":
                this.estado = "Pará";
                break;
            case "PB":
                this.estado = "Paraíba";
                break;
            case "PR":
                this.estado = "Paraná";
                break;
            case "PE":
                this.estado = "Pernambuco";
                break;
            case "PI":
                this.estado = "Piauí";
                break;
            case "RJ":
                this.estado = "Rio de Janeiro";
                break;
            case "RN":
                this.estado = "Rio Grande do Norte";
                break;
            case "RS":
                this.estado = "Rio Grande do Sul";
                break;
            case "RO":
                this.estado = "Rondônia";
                break;
            case "RR":
                this.estado = "Roraima";
                break;
            case "SC":
                this.estado = "Santa Catarina";
                break;
            case "SP":
                this.estado = "São Paulo";
                break;
            case "SE":
                this.estado = "Sergipe";
                break;
            case "TO":
                this.estado = "Tocantins";
                break;
            default:
                this.estado = estado;
                break;
        }
        switch (estado.toUpperCase()) {
            case "ACRE":
                this.sigla = "AC";
                break;
            case "ALAGOAS":
                this.sigla = "AL";
                break;
            case "AMAPÁ":
                this.sigla = "AP";
                break;
            case "AMAZONAS":
                this.sigla = "AM";
                break;
            case "BAHIA":
                this.sigla = "BA";
                break;
            case "CEARÁ":
                this.sigla = "CE";
                break;
            case "DISTRITO FEDERAL":
                this.sigla = "DF";
                break;
            case "ESPÍRITO SANTO":
                this.sigla = "ES";
                break;
            case "GOIÁS":
                this.sigla = "GO";
                break;
            case "MARANHÃO":
                this.sigla = "MA";
                break;
            case "MATO GROSSO":
                this.sigla = "MT";
                break;
            case "MATO GROSSO DO SUL":
                this.sigla = "MS";
                break;
            case "MINAS GERAIS":
                this.sigla = "MG";
                break;
            case "PARÁ":
                this.sigla = "PA";
                break;
            case "PARAÍBA":
                this.sigla = "PB";
                break;
            case "PARANÁ":
                this.sigla = "PR";
                break;
            case "PERNAMBUCO":
                this.sigla = "PE";
                break;
            case "PIAUÍ":
                this.sigla = "PI";
                break;
            case "RIO DE JANEIRO":
                this.sigla = "RJ";
                break;
            case "RIO GRANDE DO NORTE":
                this.sigla = "RN";
                break;
            case "RIO GRANDE DO SUL":
                this.sigla = "RS";
                break;
            case "RONDÔNIA":
                this.sigla = "RO";
                break;
            case "RORAIMA":
                this.sigla = "RR";
                break;
            case "SANTA CATARINA":
                this.sigla = "SC";
                break;
            case "SÃO PAULO":
                this.sigla = "SP";
                break;
            case "SERGIPE":
                this.sigla = "SE";
                break;
            case "TOCANTINS":
                this.sigla = "TO";
                break;
            default:
                this.sigla = sigla;
                break;
        }
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
    
    public String getLogradouro(){
        return this.logradouro;
    }
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public String getComplemento(){
        return this.complemento;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public String getBairro(){
        return this.bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getCidade(){
        return this.cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getSigla(){
        return this.sigla;
    }
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public String getCep(){
        return this.cep;
    }
    public void setCep(String cep){
        this.cep = cep;
    }
}
