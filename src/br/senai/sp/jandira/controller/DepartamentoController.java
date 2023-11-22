package br.senai.sp.jandira.controller;

public class DepartamentoController {

        Conexao conexao =new Conexao();

        Connection conection = conexao.getConexao();

        public void listarFuncionarios() throws SQLException{
            Statement statement = conection.createStatement();
            String queryList = "select * from departamento";

            ResultSet resultSet = statement.executeQuery(queryList);

            Departamento departamento = new Departamento();

            while (resultSet.next()){
                funcionario.setId(resultSet.getInt("id_funcionario"));
                funcionario.setNome(resultSet.getString("nome"));
                funcionario.setCargo(resultSet.getString("cargo"));
                funcionario.setDepartamento(resultSet.getString("departamento"));
                funcionario.setSalario(resultSet.getDouble("salario"));

                System.out.println(funcionario.getId());
                System.out.println(funcionario.getNome());
                System.out.println(funcionario.getCargo());
                System.out.println(funcionario.getDepartamento());
                System.out.println(funcionario.getSalario());

            }
        }

    }
}
