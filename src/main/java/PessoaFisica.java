/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 -18:52
 * @category Model
 */
public class PessoaFisica extends Cliente{

    private String estadoCivil;
    private int CPF;
    private String dataDeNascimento;

    public PessoaFisica(){
        super();
    }

    /**
     *
     * @param codigoCliente Recebe o codigo do cliente
     * @param nome Recebe o nome do cliente
     * @param profissao Recebe a profissão do cliente
     * @param estadoCivil Recebe o estado civil do cliente
     * @param CPF Recebe o CPF do cliente
     * @param dataDeNascimento Recebe a data de nascimento do cliente
     */
    public PessoaFisica(int codigoCliente,String nome,String profissao,
                        String estadoCivil,int CPF,
                        String dataDeNascimento){

        super(codigoCliente,nome,profissao);
        this.estadoCivil = estadoCivil;
        this.CPF = CPF;
        this.dataDeNascimento = dataDeNascimento;
    }


    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString(){
        return "Codigo do cliente: "+this.getCodigoCliente()
                +"\nNome do cliente: "+this.getNome()
                +"\nProfissão do cliente: "+this.getProfissao()
                +"\nEstado civil do cliente: "+this.estadoCivil
                +"\nCPF do cliente: "+this.CPF
                +"\nData de nascimento do cliente: "+this.dataDeNascimento
                ;
    }
}

