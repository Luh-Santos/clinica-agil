package Repositorio;

import Entidades.Paciente;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPaciente {

    public static List<Paciente> listaPacientes = new ArrayList<Paciente>();
    public boolean salvaPaciente(Paciente paciente) {
        try {
            listaPacientes.add(paciente);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public List<Paciente> listarPaciente() {
        for (Paciente paciente : listaPacientes) {
            System.out.println("\nId: "+paciente.getId());
            System.out.println("Nome: "+paciente.getNome());
            System.out.println("Telefone: "+paciente.getTelefone());
        }
        return null;
    }


}
