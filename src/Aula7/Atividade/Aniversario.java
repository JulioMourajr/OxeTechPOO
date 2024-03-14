package Aula7.Atividade;

public class Aniversario extends CartaoWeb{
    public Aniversario(String destinatario) {
        this.destinatario=destinatario;
    }

    @Override
    public String showMessage() {
        return "Parabens " + this.getDestinatario();
    }
}
