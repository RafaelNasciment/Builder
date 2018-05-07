package builder.construtor;

import builder.paciente.Paciente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConstrutorDePaciente {
    private Paciente paciente = new Paciente();
    
    
    public void buildNome(String nome){
        paciente.setNome(nome);
    }
    public void buildCpf(String cpf){
        paciente.setCpf(cpf);
    }
    public void buildDataNasc(String dataNasc){
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        paciente.setDataNasc(data);
    }
    public void buildEndereco(String endereco){
        
        paciente.setEndereco(endereco);
    }
    public void builPeso(double peso){
        paciente.setPeso(peso);
    }
    public void buildAltura(double altura){
        paciente.setAltura(altura);
    }
//    public void buildIdade(int idade){
////        LocalDate dataAtual  = LocalDate.now();
//        Period periodo = Period.between(LocalDate.now(), paciente.getDataNasc());
//        paciente.setIdade(periodo.getYears());
//    }
    public void buildsexo(String sexo){
        paciente.setSexo(sexo);
    }
    public void buildTipoSanguineo(String tipoSanguineo){
        paciente.setTipoSanguineo(tipoSanguineo);
    }
    public Paciente construir(){
        return this.paciente;
        
    }
}
