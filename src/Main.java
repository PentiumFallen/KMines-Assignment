import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Color Grid");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(400, 150);
		myFrame.setSize(400, 450);

		MineGrid myPanel = new MineGrid();
		myFrame.add(myPanel);

		MineMouseController myMouseAdapter = new MineMouseController();
		myFrame.addMouseListener(myMouseAdapter);

		myFrame.setVisible(true);
	}
}