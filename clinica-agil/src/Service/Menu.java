package Service;

import Entidades.Paciente;
import Service.ServicePaciente;

import java.util.Scanner;

public class Menu {
    static Scanner entrada = new Scanner(System.in);
    public static void menu() {
        String menu = "0";
        System.out.println("Bem vindo!");
        do {
            System.out.println("O que você deseja fazer? Digite o número correspondente");
            System.out.println("1 - Cadastrar paciente");
            System.out.println("2 - Marcar consulta");
            System.out.println("3 - Cancelar consulta");
            System.out.println("4 - Sair");
            menu = entrada.nextLine();
            switch (menu) {
                case "1":
                    System.out.println("Cadastrar paciente selecionado!");
                   cadastrarPaciente();
                   break;
                case "2":
                    System.out.println("Marcar consulta selecionado!");
                    marcarConsulta();
                    break;
                case "3":
                    System.out.println("Cancelar consulta selecionado!");
                    cancelarConsulta();
                break;
                case "4":
                    System.out.println("Obrigado, volte sempre!");
                    menu = "4";
                    break;
                default:
                    System.out.println("Comando inválido, tente novamente");
                    break;
            }
        } while(menu!="4");

    }

    public static void cadastrarPaciente() {
        String nome, telefone;
        System.out.println("Primeiro, digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Agora digite seu telefone: ");
        telefone = entrada.nextLine();
        if(ServicePaciente.salvaPaciente(nome, telefone) == true){
            System.out.println("Paciente cadastrado com sucesso");

        } else {
            System.out.println("Numero de telefone já cadastrado, tente novamente");
            cadastrarPaciente();
        }
    }

    private static void marcarConsulta() {
        ServicePaciente.listarPaciente();
        System.out.println("Digite o ID do paciente que deseja marcar a consulta: ");

    }

    private static void cancelarConsulta() {
    }


}
