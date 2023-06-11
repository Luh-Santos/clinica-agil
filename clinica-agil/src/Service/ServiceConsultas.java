package Service;

import Entidades.Consultas;
import Repositorio.RepositorioConsultas;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ServiceConsultas {
    static Scanner entrada = new Scanner(System.in);

    static RepositorioConsultas repositorioConsultas = new RepositorioConsultas();

    public static void salvaConsulta(int data, int hora, int especialidade, String nome) {
        Consultas consulta = new Consultas();
        consulta.setData(data);
        consulta.setHora(hora);
        consulta.setEspecialidade(especialidade);
        consulta.setPaciente(nome);
        RepositorioConsultas.salvaConsulta(consulta);
        RepositorioConsultas.listarConsultas();
    }

    public static void selecionarEspecialidade(String nome) {
        System.out.println("Selecione a especialidade: ");
        System.out.println("1 - Clinico geral");
        System.out.println("2 - Pediatra");
        System.out.println("3 - Psicólogo");
        String especialidade = entrada.nextLine();
        switch (especialidade){
            case "1": selecionarDataClinico(nome);
                break;
            case "2": selecionarDataPediatra();
            break;
            case "3": selecionarDataPsicologo();
            break;
            default:
                System.out.println("Comando não identificado, tente novamente");
                selecionarEspecialidade(nome);
                break;
        }

    }
    public static void selecionarDataClinico(String nome) {
        System.out.println("Selecione a data: ");
        System.out.println("1 - Segunda");
        System.out.println("2 - Quarta");
        System.out.println("3 - Sexta");
        String data = entrada.nextLine();
        switch (data) {
            case "1":
                selecionarHoraClinico(1, nome);
                break;
            case "2":
                selecionarHoraClinico(2, nome);
                break;
            case "3":
                selecionarHoraClinico(3, nome);
                break;
            default:
                System.out.println("Comando não identificado, tente novamente");
                selecionarDataClinico(nome);
        }
    }

    public static void selecionarDataPediatra() {
        System.out.println("Selecione a data: ");
        System.out.println("1 - terça");
        System.out.println("2 - quinta");
        String data = entrada.nextLine();
        switch (data){
            case "1":



        }

    }
    public static void selecionarDataPsicologo() {
        System.out.println("Selecione a data: ");
        System.out.println("1 - segunda");
        System.out.println("2 - quarta");
        System.out.println("3 - sexta");
        String data = entrada.nextLine();
        switch (data){
            case "1":



        }

    }

    public static void selecionarHoraClinico(int data, String nome) {
        String hora;
        System.out.println("Selecione a hora: ");
        System.out.println("1 - 10:00");
        System.out.println("2 - 10:30");
        System.out.println("3 - 11:00");
        System.out.println("4 - 11:30");
        System.out.println("5 - 13:00");
        System.out.println("6 - 13:30");
        System.out.println("7 - 14:00");
        System.out.println("8 - 14:30");
        hora = entrada.nextLine();

        int horaCerta = parseInt(hora);
        boolean disponivel = verificaDisponibilidade(data, horaCerta);
        if(disponivel == true) {
            salvaConsulta(data, horaCerta, 1, nome);
        }


    }


    public static void selecionarHoraPediatra() {
        System.out.println("Selecione a hora: ");
        System.out.println("1 - segunda");
        System.out.println("2 - quarta");
        System.out.println("3 - sexta");
        String hora = entrada.nextLine();
        switch (hora){
            case "1":




        }

    }
    public static void selecionarHoraPsicologo() {
        System.out.println("Selecione a hora: ");
        System.out.println("1 - segunda");
        System.out.println("2 - quarta");
        System.out.println("3 - sexta");
        String hora = entrada.nextLine();
        switch (hora){
            case "1":




        }

    }
    private static boolean verificaDisponibilidade(int data, int hora) {
        boolean resultado = false;
        for (Consultas consulta : repositorioConsultas.listaConsultas){
            System.out.println("entra");
            if(consulta.getData() == data && consulta.getHora() == hora) {
                System.out.println("Horário não disponível, tente novamente");
                resultado = false;
            }else {
                System.out.println("teste");
                resultado = true;
            }
        }
        return resultado;
    }




}
