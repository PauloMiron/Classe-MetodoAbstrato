package Entidades;


public class  Juridica extends Pessoa {

    private Integer numeroDeFuncionarios;

    public Juridica(){}

    public Juridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios(){
        return  numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios){
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double calculaImposto() {
        Double taxa;

        if (numeroDeFuncionarios > 10){
            taxa = getRendaAnual() * 0.14;
        } else {
            taxa = getRendaAnual() * 0.16;
        }
        return taxa;
    }


}
