package Repositorio;

import Entidades.Consultas;

import java.util.ArrayList;
import java.util.List;


public class RepositorioConsultas {
    public static List<Consultas> listaConsultas = new ArrayList<Consultas>();

    public static boolean salvaConsulta(Consultas consulta) {
        try {
            listaConsultas.add(consulta);
        } catch (Exception e) {
            return false;
        }

        return true;
    }


    public static List<Consultas> listarConsultas() {
        for (Consultas consulta : listaConsultas) {
            System.out.println("Paciente: "+consulta.getPaciente());
            if (consulta.getEspecialidade() == 1) {
                switch (consulta.getData()){
                    case 1:
                        System.out.println("Dia: Segunda");
                        break;
                    case 2:
                        System.out.println("Dia: Quarta");
                        break;
                    case 3:
                        System.out.println("Dia: Sexta");
                        break;
                }
            }
            if (consulta.getEspecialidade() == 2) {
                switch (consulta.getData()){
                    case 1:
                        System.out.println("Dia: Terça");
                        break;
                    case 2:
                        System.out.println("Dia: Quinta");
                        break;

                }
            }
            if (consulta.getEspecialidade() == 3) {
                switch (consulta.getData()){
                    case 1:
                        System.out.println("Dia: Segunda");
                        break;
                    case 2:
                        System.out.println("Dia: Quarta");
                        break;
                    case 3:
                        System.out.println("Dia: Sexta");
                        break;
                }
            }
            System.out.println("Hora: "+consulta.getHora());
            System.out.println("Especialidade: "+consulta.getEspecialidade());

        }
        return null;
    }
}
