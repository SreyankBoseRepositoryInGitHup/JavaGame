package GameMenus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class DriveYourCar implements KeyListener, ActionListener,Runnable {
    JLabel label;
    JFrame frame;
    JLabel[] Coins = new JLabel[10];
    Random random = new Random();
    Point[] Coins_Point = new Point[10];
    JButton Close;
    Thread Game_Thread;
    int X_Pos;
    int Y_Pos;
    int[] Coin_X = new int[10];
    int[] Coin_Y = new int[10];
    JLabel Points;
    int Points_Count = 0;

    DriveYourCar() {

        frame = new JFrame("DriveYourCar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.addKeyListener(this);
        frame.getContentPane().setBackground(Color.black);
        frame.setVisible(true);

        Points = new JLabel();
        Points.setFont(new Font("Font",Font.BOLD,50));
        Points.setBounds(10,10,1000,50);
        Points.setForeground(Color.CYAN);
        Points.setText(String.valueOf(Points_Count+1));
        Points.setFocusable(false);
        frame.add(Points);

        label = new JLabel();
        label.setLocation(0,0);
        label.setSize(100,100);
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        frame.add(label);

        Close = new JButton();
        Close.setText("Close");
        Close.setFocusable(false);
        Close.setBounds(1650,10,240,129);
        Close.setFont(new Font("Font",Font.BOLD,50));
        Close.addActionListener(this);
        frame.add(Close);

        for (int i = 0; i < Coins.length; i++) {
            Coins[i] = new JLabel();
            Coins[i].setBounds(random.nextInt(1920), random.nextInt(1080), 100, 100);
            Coins[i].setBackground(Color.CYAN);
            Coins[i].setOpaque(true);

            Coins_Point[i] = Coins[i].getLocation();

            frame.add(Coins[i]);

            Game_Thread = new Thread(this);
            Game_Thread.start();
        }
    }
    @Override
    public void run() {
        for(int i=0;i< Coins.length;i++) {
            Coin_X[i] = Coins[i].getX();
            Coin_Y[i] = Coins[i].getY();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a' -> {
                label.setLocation(label.getX() - 1, label.getY());
                X_Pos = label.getX();
                Y_Pos = label.getY();
                System.out.println(X_Pos+" "+Y_Pos);
                for(int i=0;i<Coins.length;i++) {
                    if(X_Pos == Coin_X[i] && Y_Pos == Coin_Y[i]) {
                        System.out.println("Perceived A Coin");
                        Coins[i].setLocation(10000,10000);
                        Points.setText(String.valueOf(Points_Count+1));
                    }
                }
            }
            case 'w' -> {
                label.setLocation(label.getX(), label.getY() - 1);
                X_Pos = label.getX();
                Y_Pos = label.getY();
                System.out.println(X_Pos+" "+Y_Pos);
                for(int i=0;i<Coins.length;i++) {
                    if(X_Pos == Coin_X[i] && Y_Pos == Coin_Y[i]) {
                        System.out.println("Perceived A Coin");
                        Coins[i].setLocation(10000,10000);
                        Points.setText(String.valueOf(Points_Count+1));
                    }
                }
            }
            case 's' -> {
                label.setLocation(label.getX(), label.getY() + 1);
                X_Pos = label.getX();
                Y_Pos = label.getY();
                System.out.println(X_Pos+" "+Y_Pos);
                for(int i=0;i<Coins.length;i++) {
                    if(X_Pos == Coin_X[i] && Y_Pos == Coin_Y[i]) {
                        System.out.println("Perceived A Coin");
                        Coins[i].setLocation(10000,10000);
                        Points.setText(String.valueOf(Points_Count+1));
                    }
                }
            }
            case 'd' -> {
                label.setLocation(label.getX() + 1, label.getY());
                X_Pos = label.getX();
                Y_Pos = label.getY();
                System.out.println(X_Pos+" "+Y_Pos);
                for(int i=0;i<Coins.length;i++) {
                    if(X_Pos == Coin_X[i] && Y_Pos == Coin_Y[i]) {
                        System.out.println("Perceived A Coin");
                        Coins[i].setLocation(10000,10000);
                        Points.setText(String.valueOf(Points_Count+1));
                    }
                }
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()) {
            case 37 -> {
                label.setLocation(label.getX() - 1, label.getY());
                X_Pos = label.getX();
                Y_Pos = label.getY();
                System.out.println(X_Pos+" "+Y_Pos);
                for(int i=0;i<Coins.length;i++) {
                    if(X_Pos == Coin_X[i] && Y_Pos == Coin_Y[i]) {
                        System.out.println("Perceived A Coin");
                        Coins[i].setLocation(10000,10000);
                        Points.setText(String.valueOf(Points_Count+1));
                    }
                }
            }
            case 38 -> {
                label.setLocation(label.getX(), label.getY() - 1);
                X_Pos = label.getX();
                Y_Pos = label.getY();
                System.out.println(X_Pos+" "+Y_Pos);
                for(int i=0;i<Coins.length;i++) {
                    if(X_Pos == Coin_X[i] && Y_Pos == Coin_Y[i]) {
                        System.out.println("Perceived A Coin");
                        Coins[i].setLocation(10000,10000);
                        Points.setText(String.valueOf(Points_Count+1));
                    }
                }
            }
            case 39 -> {
                label.setLocation(label.getX() + 1, label.getY());
                X_Pos = label.getX();
                Y_Pos = label.getY();
                System.out.println(X_Pos+" "+Y_Pos);
                for(int i=0;i<Coins.length;i++) {
                    if(X_Pos == Coin_X[i] && Y_Pos == Coin_Y[i]) {
                        System.out.println("Perceived A Coin");
                        Coins[i].setLocation(10000,10000);
                        Points.setText(String.valueOf(Points_Count+1));
                    }
                }
            }
            case 40 -> {
                label.setLocation(label.getX(), label.getY() + 1);
                X_Pos = label.getX();
                Y_Pos = label.getY();
                System.out.println(X_Pos+" "+Y_Pos);
                for(int i=0;i<Coins.length;i++) {
                    if(X_Pos == Coin_X[i] && Y_Pos == Coin_Y[i]) {
                        System.out.println("Perceived A Coin");
                        Coins[i].setLocation(10000,10000);
                        Points.setText(String.valueOf(Points_Count+1));
                    }
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == Close) {
            frame.dispose();
            new PlayMenu();
        }
    }


}
