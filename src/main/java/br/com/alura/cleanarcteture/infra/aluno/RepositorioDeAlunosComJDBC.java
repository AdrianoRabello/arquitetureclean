package br.com.alura.cleanarcteture.infra.aluno;

import br.com.alura.cleanarcteture.dominio.aluno.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @autor adriano rabello 11/04/2021 10:42 AM
 **/
public class RepositorioDeAlunosComJDBC implements RepositorioDeAluno{

    private final Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection){

        this.connection = connection;
    }


    @Override
    public void matricular(Aluno aluno) {


        try {

            String sql = "INSET INTO ALUNO VALUES(?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCpf());
            ps.setString(3, aluno.getEmail());

            ps.execute();

            sql = "INSERT INTO TELEFOE VALUES(?, ?)";

            for(Telefone telefone: aluno.getTelefones()){

                ps.setString(1, telefone.getDdd());
                ps.setString(2, telefone.getNumero());
                ps.execute();
            }

        }catch (SQLException e){
            e.getStackTrace();
        }
    }

    @Override
    public Aluno buscarPorCpf(String cpf){

        try {

            String sql = "SELECT * FROM ALUNE QHERE CPF =  ?" + cpf;
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cpf);
            ResultSet result = ps.executeQuery();
            boolean encontrou = result.next();
            if(!encontrou){

                throw new AlunoNaoEncontratoException(cpf);
            }

            String nome = result.getString("nome");
            Email email = new Email(result.getString("email"));

            Aluno aluno = new Aluno(nome,new Cpf(cpf),email);

            Long id = result.getLong("id");
            sql = "SELECT * FROM TELEFONE WHERE auluno_id = ?";
            ps.setLong(1, id);
            result = ps.executeQuery(sql);

            encontrou = result.next();

            if(encontrou){

                while (result.next()){

                    String ddd = result.getString("ddd");
                    String numero = result.getString("numero");

                    aluno.adicionarTelefone(ddd, numero);
                }
            }

            return aluno;

        }catch (SQLException e){

            throw new RuntimeException(e.getCause());
        }
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }
}
