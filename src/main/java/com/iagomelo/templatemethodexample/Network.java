/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iagomelo.templatemethodexample;

/**
 *
 * @author iagom
 */
public abstract class Network {
    String userName;
    String password;

    Network() {}

    /**
     * faz publicações em qualquer rede social
     */
    public boolean post(String message) {
        // Autentica antes de postar
        // Cada rede social tem uma autenticação diferente
        if (logIn(this.userName, this.password)) {
            // envia a postagem
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
