/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviwer.model;

import java.io.InputStream;

/**
 *
 * @author Lou Minxi
 */
public interface Image {
    String name();
    InputStream stream();
    Image next();
    Image prev();
}
