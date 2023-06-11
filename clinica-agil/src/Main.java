import Entidades.Paciente;
import Repositorio.RepositorioPaciente;
import Service.ServicePaciente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome, telefone;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = entrada.nextLine();
        if(ServicePaciente.salvaPaciente(nome, telefone) == true){
            System.out.println("Paciente cadastrado com sucesso");

        } else {
            System.out.println("Numero de telefone já cadastrado, tente novamente");
        }
    }
}