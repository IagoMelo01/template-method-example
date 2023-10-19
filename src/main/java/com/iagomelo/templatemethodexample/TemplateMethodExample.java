/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.iagomelo.templatemethodexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author iagom
 */
public class TemplateMethodExample {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Insira o usuário: ");
        String userName = reader.readLine();
        System.out.print("Insira a senha: ");
        String password = reader.readLine();

        // Entra com a mensagem.
        System.out.print("Insira a mensagem: ");
        String message = reader.readLine();

        System.out.println("\nEscolha a rede social que deseja publicar.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Cria o objeto correto e envia a mensagem.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
