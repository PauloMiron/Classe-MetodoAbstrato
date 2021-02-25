package Entidades;

public class Fisica extends Pessoa{

    private Double despesasMedicas;

    public Fisica(){
    }

    public Fisica(String nome,Double rendaAnual,Double despesasMedicas){
        super(nome,rendaAnual);
        this.despesasMedicas = despesasMedicas;
    }

    public Double getDespesasMedicas(){
        return despesasMedicas;
    }

    public void setDespesasMedicas(Double despesasMedicas){
        this.despesasMedicas = despesasMedicas;
    }

    @Override
    public double calculaImposto() {
        Double taxa;
        if(getRendaAnual() < 20000.00){
            taxa = getRendaAnual() * 0.15 - (despesasMedicas / 2);
        } else {
            taxa = getRendaAnual() * 0.25 - (despesasMedicas /2);
        }
        return taxa;
    }
}
