
import imageviwer.controller.MainFrame;
import imageviwer.model.Image;
import imageviwer.persistence.FileImageLoader;
import java.io.File;

public class Main {
    public static void main(String[] args){
        File file = new File("C:/Users/Lou Minxi/Pictures/01/Fondo de Pantalla");
        FileImageLoader loader = new FileImageLoader(file);
        Image image = loader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
}
