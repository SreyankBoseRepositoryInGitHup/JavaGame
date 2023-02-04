package TheMenus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreditsMenu extends JFrame implements ActionListener {

    JButton back = new JButton("Back");
    JLabel[] credits = new JLabel[3];
    CreditsMenu() {

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setSize(1920,1080);

        for (int i = 0;i<credits.length;i++) {
            credits[i] = new JLabel();
            credits[i].setFont(new Font("text", Font.BOLD,60));
            credits[i].setBounds(150,i*50,1820,1080);
            credits[i].setText("Hello, I am the creator of this game My Name Is Sreyank Bose I made this game so that I can get an RC Cat Maybe Bye Bye");
            this.add(credits[i]);
        }

        credits[0].setText("Hello, I am the creator of this game");
        credits[1].setText("My Name Is Sreyank Bose");
        credits[2].setText("I made this game so that I can get an RC Car, Bye Bye");

        back.setFont(new Font("text", Font.BOLD,35));
        back.setBounds(1400,760,480,258);
        back.addActionListener(this);
        this.add(back);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back) {
            new Menu();
            this.dispose();
        }
    }
}
