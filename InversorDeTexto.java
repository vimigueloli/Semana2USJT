import javax.swing.JOptionPane;

public class InversorDeTexto{
   public static void main(String [] args){
      String palavra1;
      String palavra2;
      String palavra3;
      palavra1 =  JOptionPane.showInputDialog ("Digite uma palavra");
      palavra2 =  JOptionPane.showInputDialog ("Digite outra palavra");
      palavra3 =  JOptionPane.showInputDialog ("Digite mais uma palavra");
      JOptionPane.showMessageDialog(null,palavra3 +" "+ palavra2 +" "+palavra1);
   }
}   