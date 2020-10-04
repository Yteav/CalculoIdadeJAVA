
package calculandovetoridade;

import javax.swing.*;

public class calculandovetoridade{

    public static void main(String[] args) {

        String[] nomes = new String[5];
        int[] anoNascimento = new int[5];
        int[] idadeAproximada = new int[5];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Nomes: " + (i + 1));
        }

        for (int i = 0; i < anoNascimento.length; i++) {
            anoNascimento[i] = Integer.parseInt(JOptionPane.showInputDialog("Ano: " + (i + 1)));
        }

        for (int i = 0; i < idadeAproximada.length; i++) {
            idadeAproximada[i] = 2019 - anoNascimento[i];
            JOptionPane.showMessageDialog(null, "Nome: " + nomes[i] + "\n Idade Aproximada: " + idadeAproximada[i]);
        }

    }

}
