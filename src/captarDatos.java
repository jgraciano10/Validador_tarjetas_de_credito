import javax.swing.*;

public class captarDatos extends JFrame{
    private JPanel Panel1;
    private JTextField textEntered;
    private JButton validarButton;
    private JButton limpiarButton;
    private JTextArea textArea1;

    public JPanel getPanel1() {
        return Panel1;
    }

    public void addListener(procesador listener){
        limpiarButton.addActionListener(listener);
        validarButton.addActionListener(listener);

    }

    public void revisarNumero(){
        String validacion = validarTarjeta.validar(textEntered.getText());
        textArea1.setText(validacion);
    }

    public void limpiarPantalla(){
        textArea1.setText("");
        textEntered.setText("");
    }
}
