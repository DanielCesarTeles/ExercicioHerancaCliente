/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 -18:49
 * @category Model
 */
public abstract class Cliente {

    private int codigoCliente;
    private String nome;
    private String profissao;

    public Cliente(){
    }

    /**
     *
     * @param codigoCliente Recebe o codigo do cliente
     * @param nome Recebe o nome do cliente
     * @param profissao Recebe a profissão do cliente
     */
    public Cliente(int codigoCliente,String nome, String profissao){

        this.codigoCliente = codigoCliente;
        this.nome = nome;
        this.profissao = profissao;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString(){
        return "Codigo do cliente: "+this.codigoCliente
                +"\nNome do cliente: "+this.nome
                +"\nProfissão do cliente: "+this.profissao
                ;
    }
}
