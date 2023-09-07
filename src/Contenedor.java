//librerias 
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

//Cuerpo 
public class Contenedor {
    public static void main(String[] args){
        Object[] options = { "Conversor de Divisas", "Conversor de Temperaturas","Conversor de Distancias", "Salir" };
        int choice = JOptionPane.showOptionDialog(null, "Bienvenido(a) que deseas hacer hoy,  por favor seleccione una de las siguiente opciones?", "Alura Challenge #2 Conversor de Divisas, Temperaturas y Distancias",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice == 3) {
            // MyIcon icon = new MyIcon();
            JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de conversiones, vuelva pronto", "Sistema de Conversiones", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        if (choice == 0) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = {"Pesos (MXN) a Dólares Americanos (USA)","Pesos (MXN) a Dólares Canadienses (CAD)", "Pesos (MXN) a Euros (EUR)", "Pesos (MXN) a Yenes (YUN)", "Pesos (MXN) a WONES (WON)", "Pesos (MXN) a Soles Argentinos (ARG)"  };
                // MyIcon icon = new MyIcon();
                String divisa = (String) JOptionPane.showInputDialog(null, "Por favor elija una opción de cambio de Divisas:",
                        "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad en pesos: ", "Conversor de Divisas", JOptionPane.WARNING_MESSAGE);
                double pesos;
                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido.", "Convesor de Divisas", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                //PRUBEA DE GIT
                
                //MODIFICAR LOS CAMBIOS DE DIVISAS EN LOS 3ULTIOMOS//
                if (/*divisa*/ divisa.equals("Pesos (MXN) a Dólares Americanos (USA)")) {
                    double dollars = pesos / 17.51;
                    JOptionPane.showMessageDialog(null, 
                            pesos + " Pesos mexicanos son " + FormatearDecimal.format(dollars) + " Dólares Americanos (USA).", "Convesor de Divisas", JOptionPane.WARNING_MESSAGE);
                } else if (/*divisa*/divisa.equals("Pesos (MXN) a Euros (EUR)")) {
                    double euros = pesos / 18.76;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos mexicanos son " + FormatearDecimal.format(euros) + " Euros (EUR).", "Convesor de Divisas", JOptionPane.WARNING_MESSAGE);
                } else if (/*divisa*/divisa.equals("Pesos (MXN) a Soles Argentinos (ARG)")) {
                    double soles = pesos / 0.0499741;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos mexicanos son " + FormatearDecimal.format(soles) + " Soles Argentinos (ARG)", "Convesor de Divisas", JOptionPane.WARNING_MESSAGE);
                } else if (/*divisa*/divisa.equals("Pesos (MXN) a Dólares Canadienses (CAD)")) {
                    double soles = pesos / 12.82;
                    JOptionPane.showMessageDialog(null,
                            pesos + " Pesos mexicanos son " + FormatearDecimal.format(soles) + " Dólares Canadienses (CAD)", "Convesor de Divisas", JOptionPane.WARNING_MESSAGE);           
                } else if (/*divisa*/divisa.equals("Pesos (MXN) a Yenes (YUN)")) {
                    double yen = pesos / 0.12;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos mexicanos son " + FormatearDecimal.format(yen) + " Yenes (YUN).", "Convesor de Divisas", JOptionPane.WARNING_MESSAGE);
                } else if (/*divisa*/divisa.equals("Pesos (MXN) a WONES (WON)")) {
                    double won = pesos / 0.13;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos mexicanos son " + FormatearDecimal.format(won) + " wones surcoreanos.", "Convesor de Divisas", JOptionPane.WARNING_MESSAGE);
                }

                int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Conversor de Divisas",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el conversor de divisas, vuelva pronto !", "Convesor de Divisas", JOptionPane.WARNING_MESSAGE);
                }
            }

        }       //////////////////////////////////////////////////////////////////////////////
        if (choice == 1) {
            //MODIFICAR LOS PARAMETROSD DE REDONDEO//
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            Boolean SeguirPrograma = true;
            while (SeguirPrograma) {

                String[] opciones = { "Celsius a Fahrenheit (C° a F°)", "Fahrenheit a Celsius (F° a C°)" };
                int opcion = JOptionPane.showOptionDialog(null, "Por favor seleccione una opción de conversión en los siguientes sistemas de temperatura:",
                        "Conversor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, opciones, opciones[0]);

                String valorStr = JOptionPane.showInputDialog(null, "Ingrese la temperatura (°) a convertir: ", "Convesor de Temperatura", JOptionPane.WARNING_MESSAGE);

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Inserte un valor valido para su converión", "Convesor de Temperatura", JOptionPane.WARNING_MESSAGE );
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + " Grados Celsius (C°) son " + FormatearDecimal.format(resultado) + " Grados Fahrenheit (F°)", "Convesor de Temperatura", JOptionPane.WARNING_MESSAGE);
                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " Grados Fahrenheit (F°) son " + FormatearDecimal.format(resultado) + " Grados Celsius (C°)", "Convesor de Temperatura", JOptionPane.WARNING_MESSAGE);
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "Conversor de Temperatura",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de conversión, vuelva pronto! ", "Convesor de temperatura", JOptionPane.WARNING_MESSAGE); //agregar una palomita o un adios 

                }
            }

        }
        ///////// distancias /////
        if (choice == 2) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            Boolean SeguirPrograma = true;
            while (SeguirPrograma) {

                String[] opciones = { "Metros (Mts) a Kilometros (Kms)", "Metros (Mts) a Pies (Fts)"," Metros (Mts) a Millas (Mi)"};
                int opcion = JOptionPane.showOptionDialog(null, "Por favor seleccione una opción de conversión en los siguientes sistemas de distancia:",
                        "Conversor de Distancias", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, opciones, opciones[0]);

                String valorStr = JOptionPane.showInputDialog(null, "Ingrese los metros a convertir: ", "Convesor de Distancias", JOptionPane.WARNING_MESSAGE);

                double metros = 0;
                try {
                    metros = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Inserte un valor valido para su converión", "Convesor de Distancias", JOptionPane.WARNING_MESSAGE );
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = metros * 0.001;
                    JOptionPane.showMessageDialog(null,
                            metros + " Metros (Mts) son " + resultado + " Kilometros (Kms)", "Convesor de Distancias", JOptionPane.WARNING_MESSAGE);
                } else if (opcion == 1) {
                    resultado = metros / 0.328084;
                    JOptionPane.showMessageDialog(null,
                            metros + " Metros (Mts) son " + FormatearDecimal.format(resultado) + " Pies (Fts)", "Convesor de Distancias", JOptionPane.WARNING_MESSAGE);
                } else if (opcion == 2) {
                    resultado = metros * 0.00621371;
                    JOptionPane.showMessageDialog(null,
                            metros + " Metros (Mts) son " + FormatearDecimal.format(resultado) + " Millas (Mi)", "Convesor de Distancias", JOptionPane.WARNING_MESSAGE);
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "Conversor de Distancias",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de conversión, vuelva pronto! ", "Convesor de Distancias", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
}
