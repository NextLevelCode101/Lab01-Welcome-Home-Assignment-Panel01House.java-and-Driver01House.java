import javax.swing.*;

public class Driver01House extends JPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Farhan's House");
		frame.setSize(2000, 1045);
		frame.setLocation(-10, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel01House());
		frame.setVisible(true);
	}
}
