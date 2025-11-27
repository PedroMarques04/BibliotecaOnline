package com.projetopoo.Biblioteca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class IndicacaoLivroDAO {

    private final JdbcTemplate jdbcTemplate;

    public IndicacaoLivroDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void inserirIndicacao(IndicacaoLivro indicacao){
        String sql = "INSERT INTO IndicacaoLivros(nome, livro, autor, categoria) VALUES (?, ?, ?, ?)";
        
        jdbcTemplate.update(sql, 
            indicacao.getNome(),
            indicacao.getLivro(),
            indicacao.getAutor(),
            indicacao.getCategoria());
    }

    public ArrayList<IndicacaoLivro> listar(){
        String sql = "SELECT * FROM IndicacaoLivros";
        List<Map<String,Object>> mapa = jdbcTemplate.queryForList(sql);
        return Conversao.converterIndicacoes(mapa);
    }

    public IndicacaoLivro obterIndicacao(int id){
        String sql = "SELECT * FROM IndicacaoLivros WHERE id=?";
        Map<String,Object> mapa = jdbcTemplate.queryForMap(sql, id);
        
        int idIndicacao = (Integer) mapa.get("id");
        String nome = (String) mapa.get("nome");
        String livro = (String) mapa.get("livro");
        String autor = (String) mapa.get("autor");
        String categoria = (String) mapa.get("categoria");
        
        IndicacaoLivro ind = new IndicacaoLivro(idIndicacao, nome, livro, autor, categoria);
        return ind;
    }

    public void atualizarIndicacao(int id, IndicacaoLivro indicacao){
        String sql = "UPDATE IndicacaoLivros SET nome = ?, livro = ?, autor = ?, categoria = ? WHERE id = ?";
        
        Object[] obj = new Object[5];
        obj[0] = indicacao.getNome();
        obj[1] = indicacao.getLivro();   
        obj[2] = indicacao.getAutor();   
        obj[3] = indicacao.getCategoria(); 
        obj[4] = id;                     
        
        jdbcTemplate.update(sql, obj);
    }

    public void deletar(int id){
        String sql = "DELETE FROM IndicacaoLivros WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}