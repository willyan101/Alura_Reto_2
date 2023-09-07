
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

//"/img/logo dinero.jpg"
// icon-money-jpg.jpg


public class MyIcon implements Icon{
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("/resources/icon-money-jpg.jpg")).getImage();
        g.drawImage(image, x, y, c);
    }
    @Override
    public int getIconWidth() {
        return 20;
    }
    @Override
    public int getIconHeight() {
        return 20;
    }

}