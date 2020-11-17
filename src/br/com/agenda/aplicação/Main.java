package br.com.agenda.aplicação;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.models.Contato;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        ContatoDAO contatoDAO = new ContatoDAO();
        Contato contato= new Contato();
        contato.setNome("Carlos Henrique");
        contato.setIdade(19);
        contato.setDataCadastro(new Date());


        contatoDAO.save(contato);


    }
}
