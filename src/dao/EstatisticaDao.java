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
                       + "(SELECT count(idLog) FROM log WHERE comando='INSERT') AS inserts, "
                       + "(SELECT count(idLog) FROM log WHERE comando='UPDATE') AS updates, "
                       + "(SELECT count(idLog) FROM log WHERE comando='DELETE') AS deletes, "
                       + "(SELECT count(idHumano) FROM humanos WHERE idRotulo=1) AS alunos, "
                       + "(SELECT count(idHumano) FROM humanos WHERE idRotulo=2) AS professores;";
        try{
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                ResultSet resultadoSentenca = sentenca.executeQuery();
                while(resultadoSentenca.next()){
                    estatistica.setCountLogInsert(resultadoSentenca.getInt("inserts"));
                    estatistica.setCountLogDelete(resultadoSentenca.getInt("deletes"));
                    estatistica.setCountLogUpdate(resultadoSentenca.getInt("updates"));
                    estatistica.setCountAlunos(resultadoSentenca.getInt("alunos"));
                    estatistica.setCountProfessores(resultadoSentenca.getInt("professores"));
                }
            }
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
}
