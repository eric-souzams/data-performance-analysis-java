package Telas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        super();
        Font fonte = new Font("SansSerif", Font.BOLD, 20);
        this.setTitle("APS (Estrutura de Dados): Ordenação");
        this.setLayout(new BorderLayout(8, 8));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500); //800x500
        this.setLocationRelativeTo(null);
        JPanel tituloMenu = new JPanel();
        JLabel titulo = new JLabel("Métodos de Ordenação");
        titulo.setFont(fonte);
        tituloMenu.add(titulo);
        this.add(tituloMenu, BorderLayout.NORTH);

        //Painel - Rodade do Menu
        JPanel rodapeMenu = new JPanel();
        JLabel rodape = new JLabel("© 2020 Eric, Lucas e Vitor");
        rodapeMenu.add(rodape);
        this.add(rodapeMenu, BorderLayout.SOUTH);

        //Painel - Apenas para regular a posição
        JPanel preenchimento = new JPanel();
        JLabel textovazio1 = new JLabel("                                                         ");
        preenchimento.add(textovazio1);
        this.add(preenchimento, BorderLayout.WEST);

        JPanel preenchimento2 = new JPanel();
        JLabel textovazio2 = new JLabel("                                                         ");
        preenchimento2.add(textovazio2);
        this.add(preenchimento2, BorderLayout.EAST);
    }

    public void Botoes(ActionListener botao1, ActionListener botao2, ActionListener botao3, ActionListener botao4) {
        //Painel - Menu de Opções
        JPanel opcoesMenu = new JPanel();
        opcoesMenu.setLayout(new GridLayout(6, 8, 8, 8));

        JLabel espaco = new JLabel("");
        JButton quicksort = new JButton("Método Quick Sort");
        JButton selectionsort = new JButton("Método Selection Sort");
        JButton bubblesort = new JButton("Método Bubble Sort");
        JButton sair = new JButton("Sair");

        opcoesMenu.add(espaco);
        opcoesMenu.add(quicksort);
        opcoesMenu.add(selectionsort);
        opcoesMenu.add(bubblesort);
        opcoesMenu.add(sair);

        this.add(opcoesMenu, BorderLayout.CENTER);

        quicksort.addActionListener(botao1);
        selectionsort.addActionListener(botao2);
        bubblesort.addActionListener(botao3);
        sair.addActionListener(botao4);
    }

}
