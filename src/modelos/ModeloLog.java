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

    public ModeloLog(int idLog, Timestamp datahora, String usuario, String ip, String depoisString, JsonObject depoisJson, String tabelaEditada, String comando) {
        this.idLog = idLog;
        this.datahora = datahora;
        this.usuario = usuario;
        this.ip = ip;
        this.depoisString = depoisString;
        this.depoisJson = depoisJson;
        this.tabelaEditada = tabelaEditada;
        this.comando = comando;
    }
    
    
}
