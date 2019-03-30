
package facebook_contornos;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Post;
import facebook4j.PostUpdate;
import facebook4j.ResponseList;
import facebook4j.conf.ConfigurationBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */

public class Metodos {
    
    
    
    public Facebook facebook;
    ResponseList<Post> results;

    
    public Metodos() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
        .setOAuthAppId("*")
        .setOAuthAppSecret("*")
        .setOAuthAccessToken("*")
        .setOAuthPermissions("*");
    FacebookFactory ff = new FacebookFactory(cb.build());
    facebook = ff.getInstance();
    
    }
       
    
    public void cambEstado(String mensaje){
        try {
            facebook.postStatusMessage(mensaje);
        } catch (FacebookException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void darGusta(){
        JOptionPane.showMessageDialog(null,"Fuera de Servicio. Accede a Facebook dale fisicamente al boton de 'Me Gusta' desde la propia pagina");
    }
    
    
    public void pubImagenURL()throws MalformedURLException{
        try {
            PostUpdate post = new PostUpdate(new URL("https://i.ytimg.com"))
                    .picture(new URL("https://i.ytimg.com/vi/I2siTsRov48/maxresdefault.jpg"))
                    .name("Rick")
                    .caption("i.ytimg.com")
                    .description("Rick & Morty");
            facebook.postFeed(post);
        } catch (FacebookException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarPost() throws FacebookException{ //Busca un tema en la linea de tiempo
        ResponseList<Post> results = facebook.getPosts("reboot");
        System.out.println(results.toString());
    }
    
    public void comentar(){
        try {
            facebook.commentPost(results.get(1).getId(), "Comentario de prueba");
        } catch (FacebookException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
    public void mirarBiografia(){
        try{
            ResponseList<Post> results= facebook.getFeed();
            System.out.println(results);
        } catch (FacebookException ex){
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    
    public void subirImagen(){
        
        JOptionPane.showMessageDialog(null,"Subir imagen");
    }
    
    
    public void extToken(){
        
        JOptionPane.showMessageDialog(null,"Solicitar token");
    
    }
    
    

}
