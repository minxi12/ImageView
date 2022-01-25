package imageviwer.controller;

import imageviwer.ui.ImageDisplay;
import imageviwer.ui.SwingImageDisplay;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MainFrame extends JFrame{
    private ImageDisplay imageDisplay;
    
    public MainFrame(){
        this.setTitle("Image Viewer");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(imageDisplay());
        this.getContentPane().add(toolBar(), BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public ImageDisplay getImageDisplay(){
        return imageDisplay;
    }
    
    
    private JPanel imageDisplay() {
        SwingImageDisplay sid = new SwingImageDisplay();
        this.imageDisplay = sid;
        return sid;
    }

    private JPanel toolBar() {
        JPanel panel = new JPanel();
        panel.add(prevButton());
        panel.add(nextButton());
        return panel;
    }

    private JButton prevButton() {
        JButton button = new JButton("<");
        button.addActionListener(prevImage());
        return button;
    }
    
    

    private JButton nextButton() {
        JButton button = new JButton(">");
        button.addActionListener(nextImage());
        return button;
    }

    private ActionListener prevImage() {
        return (ActionEvent e) -> imageDisplay.show(imageDisplay.current().prev());
        
    }

    private ActionListener nextImage() {
        return (ActionEvent e) -> imageDisplay.show(imageDisplay.current().next());
    }
    
    
    
    
    
}
