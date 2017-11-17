// Appel de la classe Pile

public class NPI {

    static double interpret(String[] expr){
        Pile<Double> pile = new Pile<Double>();
        double nombre1, nombre2;

        for(int i=0; i<expr.length;i++){
            String charactere = expr[i];

            if(charactere.equals("+") || charactere.equals("-") || charactere.equals("*") || charactere.equals("/")){
                switch (charactere){
                    case "+":
                        nombre1 = pile.pop();
                        nombre2 = pile.pop();
                        System.out.println(nombre1+ " + " +nombre2);
                        break;

                    case "-":
                        nombre1 = pile.pop();
                        nombre2 = pile.pop();
                        System.out.println(nombre1+ " - " +nombre2);
                        break;

                    case "/":
                        nombre1 = pile.pop();
                        nombre2 = pile.pop();
                        System.out.println(nombre1+ " / "+nombre2);
                        break;

                    case "*":
                        nombre1 = pile.pop();
                        nombre2 = pile.pop();
                        System.out.println(nombre1+ " * " +nombre2);
                        break;
                }
            }

            else {
                double a = double.parseDouble(charactere);
                pile.push(a);
            }
        }

        return 0;

    }

}


































/*

import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class NPI {

    public static void main(String[] args) {


 */