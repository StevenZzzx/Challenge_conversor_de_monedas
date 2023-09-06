package Conversor;

import javax.swing.JOptionPane;

public class Conversor {
    Moneda dolar = new Moneda(539.03,0.0019, "Dolar estadounidense");
    Moneda euro = new Moneda(586.37,0.0017, "Euro");
    Moneda libras = new Moneda(681.37,0.0015, "Libras Esterlinas");
    Moneda yen = new Moneda(3.70,0.27, "Yen Japonés");
    Moneda wonSulCoreano = new Moneda(0.41,2.45, "Won sul-coreano");

    public void ConvertirColones(double Cantidad, Moneda valor) {
        double convertido = Cantidad / valor.getValorEnColones();

        convertido = (double) Math.round(convertido * 100d) / 100;
        JOptionPane.showMessageDialog(null, convertido + "$ " + valor.getNombre());
    }

    public void ConvertirMonedas(double Cantidad, Moneda valor) {
        double convertido = Cantidad / valor.getValorMoneda();

        convertido = (double) Math.round(convertido * 100d) / 100;
        JOptionPane.showMessageDialog(null, convertido + "$ " + "Colon Costarricense");
    }
}