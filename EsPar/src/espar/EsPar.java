package espar;

import javax.swing.JOptionPane;

public class EsPar
{

    public static boolean validarPar(int n)
    {
        boolean paridad;
        
        paridad=false;
        
        if ((n%2)==0)
        {
            paridad = true;
        }
        
        return paridad;
    }
    
    public static void imprimirMensaje(String mensaje) //Funcion que imprime un mensaje
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static int leerInt(String mensaje) //Funcion que lee un entero
    {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    public static void imprimirMensajeDesicion(String men1, String men2, boolean condicion)
    {
        if (condicion)
        {
            imprimirMensaje(men1);
        }
        else
        {
            imprimirMensaje(men2);
        }
    }
    
    public static String ar()
    {
        int i, j;
        String b="";
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                b+="N"+i+"T"+j+".setEditable(false);\n";
            }
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                b+="O"+i+"T"+j+".setEditable(false);\n";
            }
        }
        return b;
    }
    
    public static void main(String[] args)
    {
        int numero;
        boolean par;
        String texto1, texto2;
        
        JOptionPane.showMessageDialog(null,ar());
        
        texto1="El numero es par";
        texto2="El numero es impar";
        
        numero=leerInt("Ingrese un numero entero: ");
        
        par=validarPar(numero);
        
        imprimirMensajeDesicion(texto1, texto2, par);
    }  
}