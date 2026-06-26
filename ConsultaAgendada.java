/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;

import java.util.Scanner;
/**
 *
 * @author cavia
 */
public class ConsultaAgendada {
    static Scanner sc = new Scanner(System.in);
    
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade;
    private String nomeMedico;
    
    
    public ConsultaAgendada(Data d, Hora h, String NomeP, String NomeM)
    {
        this.data = d;
        this.hora = h;
        setNomePaciente(NomeP);
        setNomeMedico(NomeM);
        quantidade++;
    }
    
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String NomeP,String NomeM)
    {
        SetHora(h,mi,s);
        SetData(d,m,a);
        setNomePaciente(NomeP);
        setNomeMedico(NomeM);
        quantidade++;
    }
    
    public void SetData(int d, int m, int a)
    {
        data = new Data(d, m, a);
    }
    
    public void SetHora(int h, int mi, int s)
    { 
        hora = new Hora(h, mi, s);
    }
    
    public void setNomePaciente(String p)
    {
        this.nomePaciente = p;
    }
    
       public void setNomeMedico(String p)
    {
        this.nomeMedico = p;
    }
       
    public ConsultaAgendada()
    {
        SetHora();
        SetData();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }
    
    public void SetData()
    {
        data = new Data();
    }
    
    public void SetHora()
    {
        hora = new Hora();
    }
    
    public void setNomePaciente()
    {
        System.out.println("Digite o seu nome");
        String nome = sc.next();
        this.nomePaciente = nome;
    }
    
    public void setNomeMedico()
    {
        System.out.println("Digite o nome do Medico");
        String nome = sc.next();
        this.nomeMedico = nome;
    }
       
    public String getData()
    {
        return data.mostra1();
    }
    public String getHora() {
        return hora.getHora1();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
    
    public static int getAmostra()
    {
        return quantidade;
    }
}
