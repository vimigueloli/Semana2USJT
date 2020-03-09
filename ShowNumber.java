import javax.swing.JOptionPane;

public class ShowNumber{
   public static void main(String [] args){
      String numero;
      numero =  JOptionPane.showInputDialog ("Digite um numero");
      JOptionPane.showMessageDialog(null,"o valor do numero é: " + numero );
   }
}   