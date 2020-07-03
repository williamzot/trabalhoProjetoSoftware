/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author willi
 */
public class AvaliacoesBanco {
    private int id;
    private String submissao;
    private String avaliador;
    private String dataParecer;
    private String arquivoProjeto;
    private String status;

    public AvaliacoesBanco(int id, String submissao, String avaliador, String dataParecer, String arquivoProjeto, String status) {
        this.id = id;
        this.submissao = submissao;
        this.avaliador = avaliador;
        this.dataParecer = dataParecer;
        this.arquivoProjeto = arquivoProjeto;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubmissao() {
        return submissao;
    }

    public void setSubmissao(String submissao) {
        this.submissao = submissao;
    }

    public String getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(String avaliador) {
        this.avaliador = avaliador;
    }

    public String getDataParecer() {
        return dataParecer;
    }

    public void setDataParecer(String dataParecer) {
        this.dataParecer = dataParecer;
    }

    public String getArquivoProjeto() {
        return arquivoProjeto;
    }

    public void setArquivoProjeto(String arquivoProjeto) {
        this.arquivoProjeto = arquivoProjeto;
    }

}
