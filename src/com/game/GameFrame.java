package com.game;

import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame()
    {
        //game frame
        this.add(new GamePanel());
        this.setTitle("Snake Game Internship");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
