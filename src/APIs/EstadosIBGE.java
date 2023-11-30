package APIs;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EstadosIBGE {

    public static String[][] leEstadosIBGE() {
        String[][] nomesEstados = null;
        try {
            String endpoint = "https://servicodados.ibge.gov.br/api/v1/localidades/estados";
            
            URL url = new URL(endpoint);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            int responseCode = conexao.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                Gson gson = new Gson();
                JsonArray estadosArray = gson.fromJson(response.toString(), JsonArray.class);
                nomesEstados = new String[estadosArray.size()][2];
                int i=0;
                for (JsonElement element : estadosArray) {
                    JsonObject estado = element.getAsJsonObject();
                    String nomeEstado = estado.get("nome").getAsString();
                    String silgaEstado = estado.get("sigla").getAsString();
                    nomesEstados[i][0] = nomeEstado;
                    nomesEstados[i++][1] = silgaEstado;
                }
            } else {
                System.out.println("Erro na requisição. Código de resposta: " + responseCode);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return nomesEstados;
    }
}
