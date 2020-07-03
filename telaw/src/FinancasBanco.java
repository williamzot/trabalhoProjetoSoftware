/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi
 */
public class FinancasBanco {
    private int id;
    private int codigo;
    private String movimento;
    private String descricao;
    private float entrada;
    private float saida;
    
    public FinancasBanco(int id, int codigo, String movimento, String descricao, float entrada, float saida) {
        this.id = id;
        this.codigo = codigo;
        this.movimento = movimento;
        this.descricao = descricao;
        this.entrada = entrada;
        this.saida = saida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }

    public void setSaida(float saida) {
        this.saida = saida;
    }

    public int getId() {
        return id;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMovimento() {
        return movimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getEntrada() {
        return entrada;
    }

    public float getSaida() {
        return saida;
    }
}


