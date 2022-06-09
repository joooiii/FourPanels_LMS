package CasePackage;
import validation.Ensurer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class MediaSection extends Section
{

    private String mimeType;
    private Path path;

    public MediaSection(Path path, String title)
    {

        super(title);
        this.path = Path.of(Ensurer.ensureValidPath(path.toString()));
        this.mimeType = Ensurer.ensureValidMimeType(path);


    }

    public Path getPath()
    {
        return path;
    }

    public void displayImage(MediaSection media)
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }

        try {
            System.out.println("Get Image from " + media.getPath().toString());
            File folderInput = new File(media.getPath().toString());
            BufferedImage image = ImageIO.read(folderInput);
            System.out.println("Load image into frame...");
            JLabel label = new JLabel(new ImageIcon(image));
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(label);
            f.pack();
            f.setLocation(200, 200);
            f.setVisible(true);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }


    @Override
    public String toString()
    {
        return super.toString() + "\n" + "Pfad: "+ path.toString()+ "\nMimeType: " + mimeType;
    }

}
