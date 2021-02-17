package escola;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(ddd == null || !ddd.matches("^\\([1-9]{2}\\)")){
            throw new IllegalArgumentException("DDD Inválido");
        }
        if(numero == null || !numero.matches("/^\\d{5}\\-\\d{4}$/")){
            throw new IllegalArgumentException("Número inválido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
