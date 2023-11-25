package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.ModeloEstatistica;
import java.sql.ResultSet;


public class EstatisticaDao {
    private ConexaoBanco conexao;
    
    public EstatisticaDao(){
        this.conexao = new ConexaoBanco();
    }
    
    public void retrieve (ModeloEstatistica estatistica){
        String sql = "SELECT "
                   + "(SELECT count(idLog) FROM log WHERE comando='INSERT'), "
                   + "(SELECT count(idLog) FROM log WHERE comando='UPDATE'), "
                   + "(SELECT count(idLog) FROM log WHERE comando='DELETE');";
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while(resultadoSentenca.next()){
                    
                }
            }
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
}
