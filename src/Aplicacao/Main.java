package Aplicacao;

import Metodos.*;
import Telas.*;
import Database.Queries;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){
      
        Queries query = new Queries();
        
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        MetodoQuickSort metodoQuickSort = new MetodoQuickSort();
        MetodoSelectionSort metodoSelectionSort = new MetodoSelectionSort();
        MetodoBubbleSort metodoBubbleSort = new MetodoBubbleSort();
     
        QuickSort processo1_1 = new QuickSort();
        QuickSort processo1_2 = new QuickSort();
        QuickSort processo1_3 = new QuickSort();
        
        SelectionSort processo2_1 = new SelectionSort();
        SelectionSort processo2_2 = new SelectionSort();
        SelectionSort processo2_3 = new SelectionSort();
        
        BubbleSort processo3_2 = new BubbleSort();
        BubbleSort processo3_1 = new BubbleSort();
        BubbleSort processo3_3 = new BubbleSort();
        
        //Botões da tela de menu principal
        menuPrincipal.Botoes( 
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                menuPrincipal.setVisible(false);
                metodoQuickSort.setVisible(true);
            }
        }, 
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                menuPrincipal.setVisible(false);
                metodoSelectionSort.setVisible(true);
            }
        },
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
               menuPrincipal.setVisible(false); 
               metodoBubbleSort.setVisible(true);
            }
        },
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                menuPrincipal.dispose();
            }
        });
        
        //Botões da tela de menu do método quick sort
        metodoQuickSort.Botoes( 
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoQuickSort.dispose();
                processo1_1.run(
                         new ActionListener() {
                         @Override
                         public void actionPerformed(ActionEvent evt) {
                            processo1_1.dispose();
                            menuPrincipal.setVisible(true);
                            }
                        },
                        query.queryAleatoria500, 
                        query.queryAleatoria5000, 
                        query.queryAleatoria10000, 
                        query.queryAleatoria30000,
                        "Aleatória");
                processo1_1.setVisible(true);
            }
        }, 
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoQuickSort.dispose();
                processo1_2.run(
                         new ActionListener() {
                         @Override
                         public void actionPerformed(ActionEvent evt) {
                            processo1_2.dispose();
                            menuPrincipal.setVisible(true);
                            }
                        },
                        query.queryCrescente500, 
                        query.queryCrescente5000, 
                        query.queryCrescente10000, 
                        query.queryCrescente30000,
                        "Crescente");
                processo1_2.setVisible(true);
            }
        },
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoQuickSort.dispose();
                processo1_3.run(
                         new ActionListener() {
                         @Override
                         public void actionPerformed(ActionEvent evt) {
                            processo1_3.dispose();
                            menuPrincipal.setVisible(true);
                            }
                        },
                        query.queryDecrescente500, 
                        query.queryDecrescente5000, 
                        query.queryDecrescente10000, 
                        query.queryDecrescente30000,
                        "Decrescente");
                processo1_3.setVisible(true);
            }
        },
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoQuickSort.dispose();
                menuPrincipal.setVisible(true);
            }
        });
        
        //Botões da tela de menu do método selection sort
        metodoSelectionSort.Botoes( 
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoSelectionSort.dispose();
                processo2_1.run(
                         new ActionListener() {
                         @Override
                         public void actionPerformed(ActionEvent evt) {
                            processo2_1.dispose();
                            menuPrincipal.setVisible(true);
                            }
                        },
                        query.queryAleatoria500, 
                        query.queryAleatoria5000, 
                        query.queryAleatoria10000, 
                        query.queryAleatoria30000,
                        "Aleatória");
                processo2_1.setVisible(true);
            }
        }, 
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoSelectionSort.dispose();
                processo2_2.run(
                         new ActionListener() {
                         @Override
                         public void actionPerformed(ActionEvent evt) {
                            processo2_2.dispose();
                            menuPrincipal.setVisible(true);
                            }
                        },
                        query.queryCrescente500, 
                        query.queryCrescente5000, 
                        query.queryCrescente10000, 
                        query.queryCrescente30000,
                        "Crescente");
                processo2_2.setVisible(true);
            }
        },
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoSelectionSort.dispose();
                processo2_3.run(
                         new ActionListener() {
                         @Override
                         public void actionPerformed(ActionEvent evt) {
                            processo2_3.dispose();
                            menuPrincipal.setVisible(true);
                            }
                        },
                        query.queryDecrescente500, 
                        query.queryDecrescente5000, 
                        query.queryDecrescente10000, 
                        query.queryDecrescente30000,
                        "Decrescente");
                processo2_3.setVisible(true);
            }
        },
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoSelectionSort.dispose();
                menuPrincipal.setVisible(true);
            }
        });
        
        //Botões da tela de menu do método bubble sort
        metodoBubbleSort.Botoes( 
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoBubbleSort.setVisible(false);
                processo3_1.run(
                         new ActionListener() {
                         @Override
                         public void actionPerformed(ActionEvent evt) {
                            processo3_1.dispose();
                            menuPrincipal.setVisible(true);
                            }
                        },
                        query.queryAleatoria500, 
                        query.queryAleatoria5000, 
                        query.queryAleatoria10000, 
                        query.queryAleatoria30000,
                        "Aleatória");
                processo3_1.setVisible(true);
            }
        }, 
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoBubbleSort.setVisible(false);
                processo3_2.run(
                         new ActionListener() {
                         @Override
                         public void actionPerformed(ActionEvent evt) {
                            processo3_2.dispose();
                            menuPrincipal.setVisible(true);
                            }
                        },
                        query.queryCrescente500, 
                        query.queryCrescente5000, 
                        query.queryCrescente10000, 
                        query.queryCrescente30000,
                        "Crescente");
                processo3_2.setVisible(true);
            }
        },
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoBubbleSort.setVisible(false);
                processo3_3.run(
                         new ActionListener() {
                         @Override
                         public void actionPerformed(ActionEvent evt) {
                            processo3_3.dispose();
                            menuPrincipal.setVisible(true);
                            }
                        },
                        query.queryDecrescente500, 
                        query.queryDecrescente5000, 
                        query.queryDecrescente10000, 
                        query.queryDecrescente30000,
                        "Decrescente");
                processo3_3.setVisible(true);
            }
        },
            new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                metodoBubbleSort.dispose();
                menuPrincipal.setVisible(true);
            }
        });
        
        menuPrincipal.setVisible(true);
    }
}