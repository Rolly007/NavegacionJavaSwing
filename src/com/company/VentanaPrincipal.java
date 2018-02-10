package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JMenuBar menubar;
    private JMenu menu, menu2, menu3;
    private JMenuItem item;
    private Login login;

    public VentanaPrincipal(Login l){
        super("Ventana Principal");
        setSize(600,600);
        login = l;

        menubar = new JMenuBar();
        menu = new JMenu("Archivo");
        menu2 = new JMenu("Edicion");

        item = new JMenuItem("Salir");

        setJMenuBar(menubar);
        menubar.add(menu);
        menu.add(item);

        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.setVisible(true);
                setVisible(false);
            }
        });
    }
}
