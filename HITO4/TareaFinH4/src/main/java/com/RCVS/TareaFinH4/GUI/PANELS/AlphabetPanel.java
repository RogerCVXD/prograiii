package com.RCVS.TareaFinH4.GUI.PANELS;

import com.RCVS.TareaFinH4.MODEL.AlphabetModel;
import com.RCVS.TareaFinH4.SERVICE.AlphabetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.List;

@Component
public class AlphabetPanel extends JPanel {
    @Autowired
    private AlphabetService alphabetService;

    public AlphabetPanel() {
        System.setProperty("ButBackColor", "#C1ECF1");
        System.setProperty("TextColor", "#0B0BF6");
        this.setPreferredSize(new Dimension(600, 190));
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(3, 0));
    }

    @PostConstruct
    public void createButtonsLetters() {
        java.util.List<AlphabetModel> firstRow = alphabetService.getAllLettersFirst();
        String[] titleAlphabet = firstRow.get(0).getLetter().split(" ");
        JPanel panelQ_P = this.CreatePanelButton(titleAlphabet);
        this.add(panelQ_P);

        java.util.List<AlphabetModel> secondRow = alphabetService.getAllLettersSecond();
        String[] titleAlphabet1 = secondRow.get(0).getLetter().split(" ");
        JPanel panelA_L = this.CreatePanelButton(titleAlphabet1);
        this.add(panelA_L);

        List<AlphabetModel> threeRow = alphabetService.getAllLettersThree();
        String[] titleAlphabet2 = threeRow.get(0).getLetter().split(" ");
        JPanel panelZ_M = this.CreatePanelButton(titleAlphabet2);
        this.add(panelZ_M);
    }


    public JPanel CreatePanelButton(String[] titleAlphabet) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        ButtonListener listener = new ButtonListener();

        for (String title : titleAlphabet) {
            JButton button = new JButton(title);
            button.setPreferredSize(new Dimension(55, 40));
            button.addActionListener(listener);
            button.setBackground(Color.getColor("butBackColor"));
            button.setForeground(Color.getColor("textColor"));
            button.setBorder(BorderFactory.createEmptyBorder());
//            button.setFont(Util.FONT_TEXT);
            mainPanel.add(button);
        }

        return mainPanel;
    }
}
