package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.ModeloHumano;

public class HumanoDao {
    private ConexaoBanco conexao;
    
    public HumanoDao(){
        this.conexao = new ConexaoBanco();
    }
    
    public ArrayList<ModeloHumano> retrieve (){
        String sql = "SELECT h.idHumano, h.nomeHumano, h.idSexo, h.idRotulo, h.fotoHumano, "
                   + "s.nomeSexo, "
                   + "r.nomeRotulo, "
                   + "e.logradouro, e.numero, e.complemento, e.bairro, e.cidade, e.estado "
                   + "FROM humanos AS h "
                   + "INNER JOIN sexos AS s ON h.idSexo=s.idSexo "
                   + "INNER JOIN rotulos AS r ON h.idRotulo = r.idRotulo "
                   + "INNER JOIN enderecos AS e ON h.idHumano = e.idEndereco;";
        ArrayList<ModeloHumano> listaHumanos = new ArrayList<ModeloHumano>();
        
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca =  this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while (resultadoSentenca.next()) {
                    ModeloHumano humano = new ModeloHumano();
                    humano.setIdHumano(resultadoSentenca.getInt("h.idHumano"));
                    humano.setNomeHumano(resultadoSentenca.getString("h.nomeHumano"));
                    humano.setIdSexo(resultadoSentenca.getInt("h.idSexo"));
                    humano.setIdRotulo(resultadoSentenca.getInt("h.idRotulo"));
                    humano.setSexo(resultadoSentenca.getString("s.nomeSexo"));
                    humano.setRotulo(resultadoSentenca.getString("r.nomeRotulo"));
                    humano.setFotoHumano(resultadoSentenca.getString("h.fotoHumano"));
                    
                    humano.setLogradouro(resultadoSentenca.getString("e.logradouro"));
                    humano.setNumero(resultadoSentenca.getInt("e.numero"));
                    humano.setComplemento(resultadoSentenca.getString("e.complemento"));
                    humano.setBairro(resultadoSentenca.getString("e.bairro"));
                    humano.setCidade(resultadoSentenca.getString("e.cidade"));
                    humano.setEstado(resultadoSentenca.getString("e.estado"));

                    listaHumanos.add(humano);
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return listaHumanos;
    }
}
