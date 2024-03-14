package Aula7.Atividade;

public class DiaDosNamorados extends CartaoWeb{
    public DiaDosNamorados(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String showMessage() {
        return "Feliz dia dos Namorados " + this.getDestinatario();
    }
}
