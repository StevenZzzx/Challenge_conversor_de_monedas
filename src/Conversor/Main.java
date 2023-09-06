/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversor;

import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class Main {
    public static void main(String[] args) {
        Conversor monedas = new Conversor();

        while(true){
            String opciones  = (JOptionPane.showInputDialog(null,"Elige una opcion de conversor", "Menu",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de monedas", "Conversor de temperatura"}, "Seleccion")).toString();

            switch(opciones){
                case "Conversor de monedas":
                String opcion  = (JOptionPane.showInputDialog(null,"Elige una opcion", "Conversor de monedas",JOptionPane.QUESTION_MESSAGE, null, new Object[] {
                "Colon a Dolar", 
                "Colon a Euro",
                "Colon a Libras",
                "Colon a Yen", 
                "Colon a Won sul-coreano",
                "Dolar a Colon",
                "Euro a Colon",
                "Libras a Colon",
                "Yen a Colon",
                "Won sul-coreano a Colon"}, "Seleccion")).toString();
               
                double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor que deseas convertir"));
                    if(opcion == "Colon a Dolar"){
                        monedas.ConvertirColones(cantidad,monedas.dolar);
                        break;
                    }else if(opcion == "Colon a Euro"){
                        monedas.ConvertirColones(cantidad,monedas.euro);
                        break;
                    }else if(opcion == "Colon a Libras"){
                        monedas.ConvertirColones(cantidad,monedas.libras);
                        break;
                    }else if(opcion == "Colon a Yen"){
                        monedas.ConvertirColones(cantidad,monedas.yen);
                        break;
                    }else if(opcion == "Colon a Won sul-coreano"){
                        monedas.ConvertirColones(cantidad,monedas.wonSulCoreano);
                        break;
                    }else if(opcion == "Dolar a Colon"){
                        monedas.ConvertirMonedas(cantidad,monedas.dolar);
                        break;
                    }else if(opcion == "Euro a Colon"){
                        monedas.ConvertirMonedas(cantidad,monedas.dolar);
                        break;
                    }else if(opcion == "Libras a Colon"){
                        monedas.ConvertirMonedas(cantidad,monedas.dolar);
                        break;
                    }else if(opcion == "Yen a Colon"){
                        monedas.ConvertirMonedas(cantidad,monedas.dolar);
                        break;
                    }else if(opcion == "Won sul-coreano a Colon"){
                        monedas.ConvertirMonedas(cantidad,monedas.dolar);
                        break;
                    }
                case "Conversor de temperatura":
                //String opcion  = (JOptionPane.showInputDialog(null,"Elige una opcion", "Conversor de temperatura",JOptionPane.QUESTION_MESSAGE, null, new Object[] {
                //}, "Seleccion")).toString();
            } 
        }
    }
}
