package imageviwer.ui;

import imageviwer.model.Image;

public interface ImageDisplay {
    Image current();
    void show(Image image);
    //funcional, no deberia tener metodo que no return nada
    
}
