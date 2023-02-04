package TheMenus;

import GameMenus.PlayMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {

    JLabel text = new JLabel("Welcome to the Car Game");
    JLabel car = new JLabel();
    ImageIcon icon;
    JFrame frame = new JFrame("CarGame");
    JButton[] buttons = new JButton[4];
    JButton close = new JButton("Close");
    public Menu() {

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(1920,1080);

        icon = new ImageIcon(this.getClass().getResource("Car2.png"));
        car.setIcon(icon);
        car.setLocation(1500,50);
        car.setSize(500,500);
        frame.add(car);

        close.setFont(new Font("large",Font.BOLD,35));
        close.setBounds(1400,760,480,258);
        frame.add(close);

        for(int i=0;i < buttons.length;i++) {

            buttons[i] = new JButton();
            buttons[i].setSize(480,258);
            buttons[i].setLocation(100,i*262);
            buttons[i].setFont(new Font("large",Font.BOLD,35));
            frame.add(buttons[i]);

        }

        buttons[0].setText("Play");
        buttons[1].setText("Settings");
        buttons[2].setText("Unknown");
        buttons[3].setText("Credits");

        text.setFont(new Font("text",Font.BOLD,45));
        text.setLocation(850,10);
        text.setSize(1920,100);
        frame.add(text);

        buttons[0].addActionListener(this);
        buttons[1].addActionListener(this);
        buttons[2].addActionListener(this);
        buttons[3].addActionListener(this);
        close.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttons[0]) {
            new PlayMenu();
            frame.dispose();
        }
        else if(e.getSource()==buttons[1]) {
            new SettingsMenu();
            frame.dispose();
        }
        else if(e.getSource()==buttons[2]) {
            frame.dispose();
        }
        else if(e.getSource()==buttons[3]) {
            new CreditsMenu();
            frame.dispose();
        }
        else {
            frame.dispose();
        }
    }
}
