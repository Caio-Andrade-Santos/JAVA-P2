/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2;

/**
 *
 * @author cavia
 */
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d = new Data();
        Hora h = new Hora();
        ConsultaAgendada p3 = new ConsultaAgendada(d, h, "luis", "Carlos");
        System.out.println( p3.getHora() + " - "
                + p3.getData() + " - "
                + p3.getNomePaciente() + " - "
                + p3.getNomeMedico());
        
        /*ConsultaAgendada p1 = new ConsultaAgendada(12, 20, 59, 28, 2, 2025, "caio", "andre");
        System.out.println(
                p1.getHora() + " - "
                + p1.getData() + " - "
                + p1.getNomePaciente() + " - "
                + p1.getNomeMedico()
        );
        
        ConsultaAgendada p2 = new ConsultaAgendada();
        System.out.println(p2.getHora() + " - "
                + p2.getData() + " - "
                + p2.getNomePaciente() + " - "
                + p2.getNomeMedico()
        );
        
        p1.SetData();
        p1.SetHora();
        p1.setNomeMedico();
        p1.setNomePaciente();
        
         System.out.println(
                p1.getHora() + " - "
                + p1.getData() + " - "
                + p1.getNomePaciente() + " - "
                + p1.getNomeMedico()
        );
         */
        System.out.println(ConsultaAgendada.getAmostra());
   
    }
    
}
