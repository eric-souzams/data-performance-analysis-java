package Metodos;

import Database.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.time.LocalDate;

public class SelectionSort extends JFrame{

    private static void selection(LocalDate []vetor){
        for(int i = 0; i < vetor.length; i++){
            int menor = i;
            for(int x = i + 1; x < vetor.length; x++){
                if((vetor[x].compareTo(vetor[menor])) < 0){
                    menor = x;
                }
            };
            trocarPosicao(vetor, i, menor);
        };
    };
    
    private static void trocarPosicao(LocalDate []vetor, int i, int menor){
        LocalDate temp = vetor[i];
        vetor[i] = vetor[menor];
        vetor[menor] = temp;
    };
    
    public void run(ActionListener botao1, String query1, String query2, String query3, String query4, String tipoOrdem) {
        
        LocalDate[] i1 = new LocalDate[500];
        LocalDate[] i2 = new LocalDate[5000];
        LocalDate[] i3 = new LocalDate[10000];
        LocalDate[] i4 = new LocalDate[30000];
        int y = 0;
        
        Font fonte = new Font("SansSerif", Font.BOLD, 20);
        this.setTitle("APS (Estrutura de Dados): Ordenação");
        this.setLayout(new BorderLayout(8, 8));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 450); //800x450
        this.setLocationRelativeTo(null);
        JPanel tituloMenu = new JPanel();
        JLabel titulo = new JLabel("Método Selection Sort – Ordem " + tipoOrdem);
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
        JLabel textovazio1 = new JLabel("                                       ");
        preenchimento.add(textovazio1);
        this.add(preenchimento, BorderLayout.WEST);

        JPanel preenchimento2 = new JPanel();
        JLabel textovazio2 = new JLabel("                                       ");
        preenchimento2.add(textovazio2);
        this.add(preenchimento2, BorderLayout.EAST);
        
        JPanel opcoesMenu = new JPanel();
        opcoesMenu.setLayout(new GridLayout(10, 1, 8, 8));
        
        JLabel area500 = new JLabel("Calculando tempo de execução...");
        JLabel area5000 = new JLabel("Calculando tempo de execução...");
        JLabel area10000 = new JLabel("Calculando tempo de execução...");
        JLabel area30000 = new JLabel("Calculando tempo de execução...");
        JLabel espaco1 = new JLabel("");
        JLabel espaco2 = new JLabel("");
        JLabel obs = new JLabel("                                 TEMPO DE EXECUÇÃO MOSTRADO EM MILISSEGUNDOS");
        JButton voltar = new JButton("Voltar ao Menu Principal");
        JLabel antes = new JLabel("Antes");
        JLabel depois = new JLabel("Depois");
        
        opcoesMenu.add(antes);
        opcoesMenu.add(depois);
        opcoesMenu.add(espaco1);
        opcoesMenu.add(area500);
        opcoesMenu.add(area5000);
        opcoesMenu.add(area10000);
        opcoesMenu.add(area30000);
        opcoesMenu.add(espaco2);
        opcoesMenu.add(obs);
        opcoesMenu.add(voltar);
        this.add(opcoesMenu, BorderLayout.CENTER);  
        
        voltar.addActionListener(botao1);
        
        try {
            Connection conexao = null;
            Statement stmt = null;
            ResultSet rs = null;
            
            ConexaoBanco db = new ConexaoBanco();
            conexao = db.getConexao();
            stmt = conexao.createStatement();         

            rs = stmt.executeQuery(query1);
            while(rs.next()){
                i1[y] = rs.getDate(1).toLocalDate();
                y++;
            }
            rs.close();
            antes.setText("Antes da Ordenação: " + Arrays.toString(i1));
            double startTime1 = System.currentTimeMillis();
            selection(i1);
            double endTime1 = System.currentTimeMillis();
            double duration1 = (endTime1 - startTime1);
            area500.setText("500 dados ordenados em: " + Double.toString(duration1) + "ms (" + Double.toString(duration1 / 1000) + "s)");
            depois.setText("Depois da Ordenação: " + Arrays.toString(i1));
            
            rs = stmt.executeQuery(query2);
            y = 0;
            while(rs.next()){
                i2[y] = rs.getDate(1).toLocalDate();
                y++;
            }
            rs.close();
            double startTime2 = System.currentTimeMillis();
            selection(i2);
            double endTime2 = System.currentTimeMillis();
            double duration2 = (endTime2 - startTime2);
            area5000.setText("5000 dados ordenados em: " + Double.toString(duration2) + "ms (" + Double.toString(duration2 / 1000) + "s)");
            
            rs = stmt.executeQuery(query3);
            y = 0;
            while(rs.next()){
                i3[y] = rs.getDate(1).toLocalDate();
                y++;
            }
            rs.close();
            double startTime3 = System.currentTimeMillis();
            selection(i3);
            double endTime3 = System.currentTimeMillis();
            double duration3 = (endTime3 - startTime3);
            area10000.setText("10000 dados ordenados em: " + Double.toString(duration3) + "ms (" + Double.toString(duration3 / 1000) + "s)");
            
            rs = stmt.executeQuery(query4);
            y = 0;
            while(rs.next()){
                i4[y] = rs.getDate(1).toLocalDate();
                y++;
            }
            rs.close();
            double startTime4 = System.currentTimeMillis();
            selection(i4);
            double endTime4 = System.currentTimeMillis();
            double duration4 = (endTime4 - startTime4);
            area30000.setText("30000 dados ordenados em: " + Double.toString(duration4) + "ms (" + Double.toString(duration4 / 1000) + "s)");
            
            stmt.close();
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        };
    };
}
