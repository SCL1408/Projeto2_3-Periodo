package modelos;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.security.Timestamp;

public class ModeloLog {

    int idLog;
    Timestamp datahora;
    String usuario;
    String ip;
    String depoisString;
    JsonObject depoisJson;
    String tabelaEditada;
    String comando;

    public ModeloLog() {
    }

    public ModeloLog(int idLog, Timestamp datahora, String usuario, String ip, String depoisString, String tabelaEditada, String comando) {
        this.idLog = idLog;
        this.datahora = datahora;
        this.usuario = usuario;
        this.ip = ip;
        this.depoisString = depoisString;
        this.tabelaEditada = tabelaEditada;
        this.comando = comando;
        Gson gson = new Gson();
        this.depoisJson = gson.fromJson(depoisString, JsonObject.class);
    }

    public int getIdLog() {
        return this.idLog;
    }

    public void setIdLog(int idLog) {
        this.idLog = idLog;
    }

    public Timestamp getDatahora() {
        return this.datahora;
    }

    public void setDatahora(Timestamp datahora) {
        this.datahora = datahora;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDepoisString() {
        return this.depoisString;
    }

    public void setDepoisString(String depoisString) {
        this.depoisString = depoisString;
    }

    public JsonObject getDepoisJson() {
        return this.depoisJson;
    }

    public void setDepoisJson(JsonObject depoisJson) {
        this.depoisJson = depoisJson;
    }

    public String getTabelaEditada() {
        return this.tabelaEditada;
    }

    public void setTabelaEditada(String tabelaEditada) {
        this.tabelaEditada = tabelaEditada;
    }

    public String getComando() {
        return this.comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }
}
