
package facebook_contornos;

import facebook4j.FacebookException;
import java.net.MalformedURLException;
import javax.swing.JOptionPane;

public class Facebook_Contornos {

    /**
     * @param args the command line arguments
     * @throws FacebookException
     */
    
    public static void main(String[] args) throws FacebookException, MalformedURLException{
        
        Metodos met=new Metodos();
        
        int opciones;
        do{
            opciones=Integer.parseInt(JOptionPane.showInputDialog("1- Cambiar Estado \n2- 'Me Gusta' un Post \n3- Publicar Imagen por URL \n4- Buscar en TimeLine/Post \n5- Hacer un Comentario \n6- Mostrar Biografia y Comentarios de Publicaciones \n7- Publicar Imagen \n8- Extender Token \n0- Salir"));
                switch(opciones){
                    case 1: //Cambiar Estado 
                        met.cambEstado(JOptionPane.showInputDialog("Introduce el nuevo Estado: "));
                        break;
                    case 2: //'Me Gusta' un Post 
                        met.darGusta();
                        break;
                    case 3: //Publicar Imagen por URL
                        met.pubImagenURL();
                        break;
                    case 4: //Buscar en TimeLine
                        met.buscarPost();
                        break;
                    case 5: //Comentar Publicacion 
                        met.comentar();
                        break;  
                    case 6: //Ver Biografia y Mostrar Comentarios Publicacion
                        met.mirarBiografia();   
                        break;
                    case 7: //Publicar Imagen
                        met.subirImagen();
                        break;
                    case 8: //Extender Token
                        met.extToken();
                        break;
                    case 0: //Salir del Programa
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Error");
                }
            }while(opciones!=0);
    }
    
}