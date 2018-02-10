package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JLabel login, password;
    private JTextField campo1;
    private JPasswordField campo2;
    private JButton boton1, boton2;
    private VentanaPrincipal v1;

    public Login(){
        super("Login");
        setSize(500,400);
        login = new JLabel("Usuario :");
        password = new JLabel("Password :");

        campo1 = new JTextField(20);
        campo2 = new JPasswordField(20);

        boton1 = new JButton("Entrar");
        boton2 = new JButton("Cancelar");

        setLayout(null);
        login.setBounds(100,75,75,30);
        campo1.setBounds(150,75,75,30);
        password.setBounds(100,125,90,30);
        campo2.setBounds(150,125,75,30);

        boton1.setBounds(100,175,75,30);
        boton2.setBounds(200,175,100,30);

        add(login);
        add(campo1);
        add(password);
        add(campo2);
        add(boton1);
        add(boton2);

        v1 = new VentanaPrincipal(this);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1.setVisible(true);
                setVisible(false);
            }
        });
    }

}
