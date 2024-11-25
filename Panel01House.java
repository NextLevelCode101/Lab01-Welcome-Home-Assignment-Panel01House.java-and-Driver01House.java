import javax.swing.*;
import java.awt.*;

public class Panel01House extends JPanel {
	
	public void paintComponent(Graphics g) {
		Color blue = new Color(51, 204, 255);
        g.setColor(blue);
        g.fillRect(-10, 0, 2000, 1045);
        g.setColor(Color.BLUE);
        g.fillRect(1050, 100, 50, 100);//chimney
        Color green = new Color(0, 153, 0);
        g.setColor(green);
        g.fillRect(0, 840, 2000, 180);//grass
        Color brown = new Color(101, 67, 33);
        g.setColor(brown);
        g.fillRect(510, 240, 900, 600);//house
        int[] xPoints = {510, 960, 1410};
        int[] yPoints = {240, 130, 240}; 
        int nPoints = 3; 
        Color red = new Color(153, 0, 0);
        g.setColor(red);
        g.fillPolygon(xPoints, yPoints, nPoints);//roof

        g.setColor(Color.GRAY); 

        g.fillOval(1060, 70, 40, 20);//smoke
        g.fillOval(1070, 50, 60, 30);//smoke
        g.fillOval(1090, 30, 80, 40);//smoke
        
        g.fillRect(0,690,20,150);//fence
        g.fillRect(98,690,20,150);
        g.fillRect(196,690,20,150);
        g.fillRect(294,690,20,150);
        g.fillRect(392,690,20,150);
        g.fillRect(490,690,20,150);
        g.fillRect(0,730,510,20);
        
        
        g.fillRect(1410,690,20,150);//fence
        g.fillRect(1508,690,20,150);
        g.fillRect(1606,690,20,150);
        g.fillRect(1704,690,20,150);
        g.fillRect(1802,690,20,150);
        g.fillRect(1902,690,20,150);
        g.fillRect(1410,730,492,20);
        
        g.setColor(Color.WHITE); // Set color to white for the clouds
        // First cloud
        g.fillOval(100, 100, 50, 40);
        g.fillOval(130, 90, 60, 50);
        g.fillOval(150, 110, 50, 40);
        g.fillOval(160, 100, 50, 40);
        // Second cloud
        g.fillOval(300, 200, 70, 50);
        g.fillOval(330, 190, 80, 60);
        g.fillOval(350, 210, 70, 50);
        g.fillOval(360, 200, 70, 50);
        
        g.fillOval(1500, 100, 50, 40);
        g.fillOval(1530, 90, 60, 50);
        g.fillOval(1550, 110, 50, 40);
        g.fillOval(1560, 100, 50, 40);
        // Second cloud
        g.fillOval(1700, 200, 70, 50);
        g.fillOval(1730, 190, 80, 60);
        g.fillOval(1750, 210, 70, 50);
        g.fillOval(1760, 200, 70, 50);
        
        Color Brown = new Color(101, 67, 33);
        g.setColor(Brown);
        g.fillRect(90, 550, 50, 400);
        Color leafGreen = new Color (0, 102, 0);
        g.setColor(leafGreen); // Green color for leaves
        g.fillOval(10, 460, 120, 120); // Draw leafy top
        g.fillOval(60, 390, 120, 120);
        g.fillOval(110, 460, 120, 120);
        
        g.setColor(Color.WHITE); // Set color to white for windows
        // First window with light
        g.fillRect(880, 300, 150, 150); // Draw window frame
        g.setColor(Color.YELLOW); // Set color to represent light
        g.fillRect(880, 300, 150, 150); // Draw window light
        
        Color Peach = new Color(255, 204, 153);
        g.setColor(Peach);
        g.fillRect(600, 300, 150, 150); // Draw window frame

        Color peach = new Color(255, 204, 153);
        g.setColor(peach); // Room color reflection        
        g.fillRect(1170, 300, 150, 150);
        
        g.setColor(Color.BLACK);
        g.fillRect(880, 610, 150, 230);
        
        g.setColor(Color.WHITE);
        g.fillOval(980, 730, 15, 15);
        

        
	}
}