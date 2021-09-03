import java.util.ArrayList;
import java.util.List;

public class Consulta {

    List<AnimalPaciente> pacientes = new ArrayList<>();
    private AnimalPaciente paciente;
    private String data;
    private String motivo;
    private String possivelDiagnostico;
    private String tratamentoRecomendado;

    public Consulta() {
    }

    public Consulta(AnimalPaciente paciente, String data, String motivo, String possivelDiagnostico, String tratamentoRecomendado) {
        this.paciente = paciente;
        this.data = data;
        this.motivo = motivo;
        this.possivelDiagnostico = possivelDiagnostico;
        this.tratamentoRecomendado = tratamentoRecomendado;
    }

    public List<AnimalPaciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<AnimalPaciente> pacientes) {
        this.pacientes = pacientes;
    }

    public AnimalPaciente getPaciente() {
        return paciente;
    }

    public void setPaciente(AnimalPaciente paciente) {
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getPossivelDiagnostico() {
        return possivelDiagnostico;
    }

    public void setPossivelDiagnostico(String possivelDiagnostico) {
        this.possivelDiagnostico = possivelDiagnostico;
    }

    public String getTratamentoRecomendado() {
        return tratamentoRecomendado;
    }

    public void setTratamentoRecomendado(String tratamentoRecomendado) {
        this.tratamentoRecomendado = tratamentoRecomendado;
    }
}
