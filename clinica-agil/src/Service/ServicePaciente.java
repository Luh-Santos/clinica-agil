package Service;

import Entidades.Paciente;
import Repositorio.RepositorioPaciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServicePaciente {
    static RepositorioPaciente repositorioPaciente = new RepositorioPaciente();

    public static boolean salvaPaciente(String nome, String telefone) {
        int contador = 0;
        int contadorPessoas = 0;
        Paciente paciente = new Paciente();
        paciente.setNome(nome);
        paciente.setTelefone(telefone);
        for (Paciente pacientes : repositorioPaciente.listaPacientes) {
            if (pacientes.getTelefone().equals(paciente.getTelefone())) {
                contador += 1;
                contadorPessoas += 1;
            } else {
                contador += 0;
                contadorPessoas += 1;
            }
        }

        if (contador == 0) {
            paciente.setId(contadorPessoas);
            repositorioPaciente.salvaPaciente(paciente);
            return true;
        } else {
            return false;
        }

    }

    public static void listarPaciente(){
        repositorioPaciente.listarPaciente();
    }


    public static String verificaID(String id) {
        int parseId = Integer.parseInt(id);
        int idAtual;
        String nome = "0";
        for (Paciente pacientes : repositorioPaciente.listaPacientes) {
            idAtual = pacientes.getId();
            if (Objects.equals(pacientes.getId(), parseId)) {
                nome = pacientes.getNome();
            }
        }
        if (nome == "0"){
            System.out.println(nome);
            return "erro";
        } else {
            return nome;
        }
    }
}
