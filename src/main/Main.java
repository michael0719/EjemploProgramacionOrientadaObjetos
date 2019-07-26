package main;

import  static entidades.Mensajes.*;
import entidades.empleados.Salario;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args){

        DecimalFormatSymbols simbolo= new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');
        DecimalFormat formateador = new DecimalFormat("###,###.##",simbolo);

        Salario salario= new Salario();

        double horas =Double.parseDouble(JOptionPane.showInputDialog(null,
                MENSAJE_PETICION_HORAS.getMensajes()));
        double valor =Double.parseDouble(JOptionPane.showInputDialog(null,
                MENSAJE_PETICION_VALOR_HORA.getMensajes()));

        salario.setHorasTrabajadas(horas);
        salario.setValorHora(valor);

        JOptionPane.showMessageDialog(null,MENSAJE_SALARIO_PAGAR.getMensajes() + formateador.format(salario.calcularSalario()));



    }

}
