package Service;

import Entidades.Paciente;
import Repositorio.RepositorioPaciente;

import java.util.ArrayList;
import java.util.List;

public class ServicePaciente {
    static RepositorioPaciente repositorioPaciente = new RepositorioPaciente();

    public static boolean salvaPaciente(String nome, String telefone) {
        int contador = 0;
        Paciente paciente = new Paciente();
        paciente.setNome(nome);
        paciente.setTelefone(telefone);
        for (Paciente pacientes : repositorioPaciente.listaPacientes) {
            if (pacientes.getTelefone().equals(paciente.getTelefone())) {
                contador += 1;
            } else {
                contador += 0;
            }
        }

        if (contador == 0) {
            repositorioPaciente.salvaPaciente(paciente);
            return true;
        } else {
            return false;
        }

    }




}
