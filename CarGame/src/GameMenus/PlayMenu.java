package GameMenus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlayMenu extends JFrame implements ActionListener {

    JButton[] buttons = new JButton[20];

    public PlayMenu() {
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(1920,1080);
        this.setLayout(new GridLayout(10,10,10,10));

        for(int i =0;i< buttons.length;i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("text",Font.BOLD,50));
            buttons[i].setSize(500,200);
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            this.add(buttons[i]);
        }
        buttons[0].setText("Drive Your Car:");
        buttons[1].setText("Customize Your Car:");
        buttons[2].setText("Statistics:");
        buttons[3].setText("Code Behind:");
        buttons[4].setText("Events:");
        buttons[5].setText("Website:");
        buttons[6].setText("Car Purchase:");
        buttons[7].setText("Multiplayer:");
        buttons[8].setText("Battle:");
        buttons[9].setText("Map Creator:");
        buttons[10].setText("Car Importer:");
        buttons[11].setText("");
        buttons[12].setText("");
        buttons[13].setText("");
        buttons[14].setText("");
        buttons[15].setText("");
        buttons[16].setText("");
        buttons[17].setText("");
        buttons[18].setText("");
        buttons[19].setText("Back");

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttons[19]) {
            new TheMenus.Menu();
            this.dispose();
        }
        else if (e.getSource()==buttons[0]) {
            this.dispose();
            new DriveYourCar();
        }
    }
}
