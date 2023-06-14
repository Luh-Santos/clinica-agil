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


    //como toda a seleção de especialidade, dia e horario foi feita com números,
    //traduzi eles aqui na hora de listar pros valores da tela.
    public static List<Consultas> listarConsultas() {
        for (Consultas consulta : listaConsultas) {
            System.out.println("\nPaciente: "+consulta.getPaciente());
            if (consulta.getEspecialidade() == 1) {
                System.out.println("Especialidade: CLínico Geral");
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
                switch (consulta.getHora()){
                    case 1:
                        System.out.println("Horário: 10:00");
                        break;
                    case 2:
                        System.out.println("Horário: 10:30");
                        break;
                    case 3:
                        System.out.println("Horário: 11:00");
                        break;
                    case 4:
                        System.out.println("Horário: 11:30");
                        break;
                    case 5:
                        System.out.println("Horário: 13:00");
                        break;
                    case 6:
                        System.out.println("Horário: 13:30");
                        break;
                    case 7:
                        System.out.println("Horário: 14:00");
                        break;
                    case 8:
                        System.out.println("Horário: 14:30");
                        break;
                }
            }
            if (consulta.getEspecialidade() == 2) {
                System.out.println("Especialidade: Pediatra");
                switch (consulta.getData()){
                    case 1:
                        System.out.println("Dia: Terça");
                        break;
                    case 2:
                        System.out.println("Dia: Quinta");
                        break;

                }
                switch (consulta.getHora()){
                    case 1:
                        System.out.println("Horário: 10:00");
                        break;
                    case 2:
                        System.out.println("Horário: 11:00");
                        break;
                    case 3:
                        System.out.println("Horário: 13:00");
                        break;
                    case 4:
                        System.out.println("Horário: 14:00");
                        break;
                }
            }
            if (consulta.getEspecialidade() == 3) {
                System.out.println("Especialidade: Psicólogo");
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
                switch (consulta.getHora()){
                    case 1:
                        System.out.println("Horário: 10:00");
                        break;
                    case 2:
                        System.out.println("Horário: 11:00");
                        break;
                    case 3:
                        System.out.println("Horário: 13:00");
                        break;
                    case 4:
                        System.out.println("Horário: 14:00");
                        break;
                    case 5:
                        System.out.println("Horário: 15:00");
                        break;
                }
            }

        }
        return null;
    }
}
