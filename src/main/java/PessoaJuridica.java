/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 -18:55
 * @category Model
 */
public class PessoaJuridica extends Cliente {

    private String razaoSocial;
    private int CNPJ;
    private int inscricao;
    private String estadual;
    private double capitalInicial;

    public PessoaJuridica(){
        super();
    }

    /**
     *
     * @param codigoCliente Recebe o codigo do cliente
     * @param nome Recebe o nome do cliente
     * @param profissao Recebe a profissão do cliente
     * @param razaoSocial Recebe a razão social do cliente
     * @param CNPJ Recebe o CNPJ do cliente
     * @param inscricao Recebe a inscrição do cliente
     * @param estadual Recebe a estadual do cliente
     * @param capitalInicial Recebe o capital inicial do cliente
     */
    public PessoaJuridica(int codigoCliente,String nome, String profissao,
                          String razaoSocial,int CNPJ,int inscricao,
                          String estadual,double capitalInicial){

        super(codigoCliente,nome,profissao);
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.inscricao = inscricao;
        this.estadual = estadual;
        this.capitalInicial = capitalInicial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public String getEstadual() {
        return estadual;
    }

    public void setEstadual(String estadual) {
        this.estadual = estadual;
    }

    public double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    @Override
    public String toString(){
        return "Codigo do cliente: "+this.getCodigoCliente()
                +"\nNome do cliente: "+this.getNome()
                +"\nProfissão do cliente: "+this.getProfissao()
                +"\nRazão social: "+this.razaoSocial
                +"\nCNPJ: "+this.CNPJ
                +"\nNumero da inscrição: "+this.inscricao
                +"\nEstadual: "+this.estadual
                +"\nCapital inicial: "+this.capitalInicial
                ;
    }
}
