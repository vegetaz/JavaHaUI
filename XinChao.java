import javax.swing.JFrame;
import javax.swing.JLabel;

public class XinChao extends JFrame {
	public XinChao(){
		setSize(500, 500);
		setVisible(true);
		JLabel lb = new JLabel("Con Cec!");
		add(lb);
	}
	
	public static void main(String[] args){
		XinChao xc = new XinChao();
	}
}