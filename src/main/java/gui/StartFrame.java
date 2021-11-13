/*
 * Created by JFormDesigner on Sat Oct 23 21:42:52 EEST 2021
 */

package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * @author Tania Topciov
 */
public class StartFrame extends JFrame implements ActionListener{

    JButton startButton;
    JPanel buttonPanel;
    ConfigPanel config;
    public StartFrame() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        backgroundPanel1 = new BackgroundPanel();
        buttonPanel = new JPanel();
        startButton = new JButton();

        //======== this ========
        setVisible(true);
        setResizable(false);
        setMinimumSize(new Dimension(880, 660));
        setMaximumSize(new Dimension(880, 660));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        backgroundPanel1.setMaximumSize(new Dimension(880, 640));
        backgroundPanel1.setMinimumSize(new Dimension(880, 640));
        contentPane.add(backgroundPanel1, BorderLayout.CENTER);

        setTitle("Ligretto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonPanel.setBackground(Color.white);
        buttonPanel.setMaximumSize(new Dimension(880, 20));
        buttonPanel.setMinimumSize(new Dimension(880, 20));
        buttonPanel.setLayout(new BorderLayout(2, 2));

        //---- startButton ----
        startButton.setText("Start Game");
        startButton.setForeground(Color.white);
        startButton.setBackground(Color.decode("0x009933"));
        startButton.addActionListener(this::actionPerformed);
        buttonPanel.add(startButton, BorderLayout.CENTER);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        Image frameIcon = new ImageIcon(getClass().getResource("/images/logo.png")).getImage();
        setIconImage(frameIcon);

        pack();
        setLocationRelativeTo(getOwner());

        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private BackgroundPanel backgroundPanel1;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButton)
        {
            GameSettingsFrame gameSettingsFrame = new GameSettingsFrame();
            this.setContentPane(gameSettingsFrame.getContentPane());
            this.setVisible(true);

            //            Masa masa = new Masa();
//            BufferedImage img = null;
//            try{
//                img = ImageIO.read(getClass().getResource("/images/cards/BLUE_ONE.png"));
//            }catch(IOException ex)
//            {
//                ex.printStackTrace();
//            }
//            masa.setCard1(img);
//
//            masa.setCard1ClickEventListener(event->{
//                System.out.println(event);
//            });
//
//            this.setContentPane(masa.getContentPane());
//            this.setVisible(true);
        }
    }

    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
