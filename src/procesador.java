import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class procesador implements ActionListener {

    private captarDatos ventana;

    public procesador() {
        ventana = new captarDatos();
        ventana.addListener(this);
        ventana.setSize(800, 400);
        ventana.setVisible(true);
        ventana.setContentPane(ventana.getPanel1());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Validar":
                ventana.revisarNumero();
                break;
            case "Limpiar":
                ventana.limpiarPantalla();
                break;
        }

    }
}
