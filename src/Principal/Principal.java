package Principal;

import Model.Veiculo;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();

        v1.setLitros(Integer.parseInt(JOptionPane.showInputDialog("Digite quantos litros: ")));
        v1.setQuilometros(Integer.parseInt(JOptionPane.showInputDialog("Digite quantos km: ")));

        JOptionPane.showMessageDialog(null, "A relação de litros " + v1.getLitros() + " por km/h " + v1.getQuilometros() + " é " + v1.getConsumo());

    }

}
