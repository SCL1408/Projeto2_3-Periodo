package APIs;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CIdadesIBGE {

    public static String[] leCidadesIBGE(String siglaEstado) {
        String[] nomesCidades = null;
        try {
            String endpoint = "https://servicodados.ibge.gov.br/api/v1/localidades/estados/"+siglaEstado+"/municipios";
            
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
                JsonArray cidadesArray = gson.fromJson(response.toString(), JsonArray.class);
                nomesCidades = new String[cidadesArray.size()];
                int i=0;
                for (JsonElement element : cidadesArray) {
                    JsonObject cidade = element.getAsJsonObject();
                    String nomeCidade = cidade.get("nome").getAsString();
                    //System.out.println("Nome da cidade: " + nomeCidade);
                    nomesCidades[i++] = nomeCidade;
                }
            } else {
                System.out.println("Erro na requisição. Código de resposta: " + responseCode);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return nomesCidades;
    }
}
