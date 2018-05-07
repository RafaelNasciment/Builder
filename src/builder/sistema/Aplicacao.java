/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.sistema;

import builder.construtor.ConstrutorDePaciente;
import builder.paciente.Paciente;

/**
 *
 * @author Alunos
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConstrutorDePaciente construtor = new ConstrutorDePaciente();
        
        // Construcao passo a passo 
        construtor.buildNome("Rafael");
        construtor.buildCpf("606.369.643-10");
        construtor.buildDataNasc("21/11/1993");
        construtor.buildEndereco("Rua Paraiba nº25");
        construtor.buildsexo("M");
        construtor.builPeso(64);
        construtor.buildAltura(1.75);
        construtor.buildTipoSanguineo("B+");
        
        
        Paciente paciente = construtor.construir();
        paciente.mostrarDados();
        
    }
    
}
