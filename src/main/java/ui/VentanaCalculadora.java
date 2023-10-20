package ui;


import javax.swing.*;


/**
 * En esta clase se contruye una calculadora
 */

public class VentanaCalculadora extends JFrame {
    private JPanel jpesultado;
    private JButton a1Button;
    private JButton a8Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a2Button;
    private JButton a7Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton btnsumar;
    private JButton btnrestar;
    private JButton btnmultiplicar;
    private JButton btndividir;
    private JButton btnborrar;
    private JButton btnraiz;
    private JButton btnigual;
    private JButton btncomaButton;
    private JPanel panel1;
    private JPanel panelComp;
    private JLabel lblresultado;
    private JLabel lblresultadoFinal;
    private JButton btnsigno;
    private JButton btnborrarTodo;

    private double num1;
    private String operacion = "nula";
    private double resultado;
    private boolean activado = true;
    private boolean punto = true;
    private String cadenaNumeros = "";

    /**
     * public ventanaCalculadora es el constructor de nuestra clase
     */
    public VentanaCalculadora() {
        this.setContentPane(panelComp);
        setSize(400, 565);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora");

        //botones numericos
        a7Button.addActionListener(e -> {
            if (lblresultado.getText().equals("0")) {
                cadenaNumeros = "7";
            } else {
                cadenaNumeros += "7";
            }
            lblresultado.setText(cadenaNumeros);
            activado = true;

        });
        a8Button.addActionListener(e -> {
            if (lblresultado.getText().equals("0")) {
                cadenaNumeros = "8";
            } else {
                cadenaNumeros += "8";
            }
            lblresultado.setText(cadenaNumeros);
            activado = true;

        });
        a9Button.addActionListener(e -> {
            if (lblresultado.getText().equals("0")) {
                cadenaNumeros = "9";
            } else {
                cadenaNumeros += "9";
            }
            lblresultado.setText(cadenaNumeros);
            activado = true;

        });
        a4Button.addActionListener(e -> {
            if (lblresultado.getText().equals("0")) {
                cadenaNumeros = "4";
            } else {
                cadenaNumeros += "4";
            }
            lblresultado.setText(cadenaNumeros);
            activado = true;

        });
        a5Button.addActionListener(e -> {
            if (lblresultado.getText().equals("0")) {
                cadenaNumeros = "5";
            } else {
                cadenaNumeros += "5";
            }
            lblresultado.setText(cadenaNumeros);
            activado = true;

        });
        a6Button.addActionListener(e -> {
            if (lblresultado.getText().equals("0")) {
                cadenaNumeros = "6";
            } else {
                cadenaNumeros += "6";
            }
            lblresultado.setText(cadenaNumeros);
            activado = true;

        });
        a1Button.addActionListener(e -> {
            if (lblresultado.getText().equals("0")) {
                cadenaNumeros = "1";
            } else {
                cadenaNumeros += "1";
            }
            lblresultado.setText(cadenaNumeros);
            activado = true;

        });
        a2Button.addActionListener(e -> {
            if (lblresultado.getText().equals("0")) {
                cadenaNumeros = "2";
            } else {
                cadenaNumeros += "2";
            }
            lblresultado.setText(cadenaNumeros);
            activado = true;

        });
        a3Button.addActionListener(e -> {
            if (lblresultado.getText().equals("0")) {
                cadenaNumeros = "3";
            } else {
                cadenaNumeros += "3";
            }
            lblresultado.setText(cadenaNumeros);
            activado = true;

        });
        a0Button.addActionListener(e -> {
            if (lblresultado.getText().equals("0")) {
                cadenaNumeros = "0";
            } else {
                cadenaNumeros += "0";
            }
            lblresultado.setText(cadenaNumeros);
            activado = true;

        });

        //botones de las operaciones
        btnsumar.addActionListener(e -> {
            if (activado == true) {
                num1 = Double.parseDouble(cadenaNumeros);
                lblresultadoFinal.setText(cadenaNumeros + "+");
                cadenaNumeros = "";
                operacion = "sumar";
                activado = false;
                punto = true;
            }
        });
        btnigual.addActionListener(e -> {
            double num2;
            if (operacion.equals("nula")) {
                lblresultado.setText(cadenaNumeros);
            } else if (operacion.equals("sumar")) {
                num2 = Double.parseDouble(cadenaNumeros);
                resultado = num1 + num2;
                lblresultado.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            } else if (operacion.equals("restar")) {
                num2 = Double.parseDouble(cadenaNumeros);
                resultado = num1 - num2;
                lblresultado.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            } else if (operacion.equals("multiplicar")) {
                num2 = Double.parseDouble(cadenaNumeros);
                resultado = num1 * num2;
                lblresultado.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            } else if (operacion.equals("dividir")) {
                num2 = Double.parseDouble(cadenaNumeros);
                if (num2 == 0) {
                    lblresultado.setText("NoSePuedeDividirPor0");
                } else {
                    resultado = num1 / num2;
                    lblresultado.setText(String.format("% .2f", resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                }
            }
            lblresultadoFinal.setText("");
            activado = true;
        });
        btnrestar.addActionListener(e -> {
            if (activado == true) {
                num1 = Double.parseDouble(cadenaNumeros);
                lblresultadoFinal.setText(cadenaNumeros + " - ");
                cadenaNumeros = "";
                operacion = "restar";
                activado = false;
                punto = true;
            }
        });
        btnmultiplicar.addActionListener(e -> {
            if (activado == true) {
                num1 = Double.parseDouble(cadenaNumeros);
                lblresultadoFinal.setText(cadenaNumeros + " x ");
                cadenaNumeros = "";
                operacion = "multiplicar";
                activado = false;
                punto = true;
            }
        });
        btndividir.addActionListener(e -> {
            if (activado == true) {
                num1 = Double.parseDouble(cadenaNumeros);
                lblresultadoFinal.setText(cadenaNumeros + " / ");
                cadenaNumeros = "";
                operacion = "dividir";
                activado = false;
                punto = true;
            }
        });
        btnraiz.addActionListener(e -> {
            num1 = Double.parseDouble(cadenaNumeros);
            lblresultadoFinal.setText(cadenaNumeros);
            resultado = Math.sqrt(num1);
            lblresultado.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            punto = true;
        });
        btncomaButton.addActionListener(e -> {
            if (punto == true) {
                if (cadenaNumeros.equals("")) {
                    cadenaNumeros = "0.";
                } else {
                    cadenaNumeros += ".";

                }
                lblresultado.setText(cadenaNumeros);
                punto = false;
            }

        });
        btnsigno.addActionListener(e -> {
            if (cadenaNumeros.charAt(0) != '-') {
                cadenaNumeros = "-" + cadenaNumeros;
            } else {
                cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
            }
            lblresultado.setText(cadenaNumeros);
        });
        //botones para borrar
        btnborrarTodo.addActionListener(e -> {
            lblresultadoFinal.setText("");
            lblresultado.setText("0");
            cadenaNumeros = "";
            operacion = "nula";
            activado = true;
            punto = true;
        });
        btnborrar.addActionListener(e -> {
            int tamaño = cadenaNumeros.length();
            if (tamaño > 0) {
                if (tamaño == 1) {
                    cadenaNumeros = "0";
                } else {
                    cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length() - 1);

                }
                lblresultado.setText(cadenaNumeros);
            }
        });
    }

    /**
     * En el método createUIComponents se crean las instancias de los componentes y se le asignan valores iniciales.
     */
    private void createUIComponents() {
        jpesultado = new JPanel();
        lblresultado = new JLabel();
        lblresultadoFinal = new JLabel();
        a1Button = new JButton("1");
        a8Button = new JButton("8");
        a3Button = new JButton("3");
        a4Button = new JButton("4");
        a5Button = new JButton("5");
        a6Button = new JButton("6");
        a2Button = new JButton("2");
        a7Button = new JButton("7");
        a9Button = new JButton("9");
        a0Button = new JButton("0");
        btnsumar = new JButton("+");
        btnrestar = new JButton("-");
        btnmultiplicar = new JButton("*");
        btndividir = new JButton("/");
        btnborrar = new JButton("Borrar");
        btnborrarTodo = new JButton("BorrarTodo");
        btnraiz = new JButton("Raíz");
        btnigual = new JButton("=");
        btncomaButton = new JButton(".");
        btnsigno = new JButton("-/+");
    }

    /**
     * El método load es el método principal para cargar y mostrar la calculadora.
     */
    public void load() {
        setVisible(true);
    }
}