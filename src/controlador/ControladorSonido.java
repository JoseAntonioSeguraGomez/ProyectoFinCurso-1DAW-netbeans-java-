package controlador;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ControladorSonido {
    //Metodo para llamar los distintos efectos de sonido
    public void reproducirSonidos(URL url){
        try {
            // Crear un Clip de audio
            Clip clip = AudioSystem.getClip();

            // Obtener un flujo de entrada de audio desde el archivo
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);

            // Abrir el Clip con el flujo de entrada de audio
            clip.open(audioInputStream);

            // Reproducir el sonido
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void sonidoConfirmar(){
        //Añado la url del efecto de sonido
        URL sonido = getClass().getResource("/Sonidos/confirmar.wav");
        
        //Llamo al metodo reproducirSonidos
        reproducirSonidos(sonido);
    }
        public void sonidoIntro(){
        //Añado la url del efecto de sonido
        URL sonido = getClass().getResource("/Sonidos/intro.wav");
        
        //Llamo al metodo reproducirSonidos
        reproducirSonidos(sonido);
    }
        
    public void sonidoFinalizado(){
        //Añado la url del efecto de sonido
        URL sonido = getClass().getResource("/Sonidos/acabar.wav");
        
        //Llamo al metodo reproducirSonidos
        reproducirSonidos(sonido);
    }
    
    
}
