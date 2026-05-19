import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

  private CustomButton1 button1;

  public MainWindow() {
    setTitle("MainWindow");
    setSize(1024, 768);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);

    button1 = new CustomButton1();
    button1.setBounds(109, 433, 120, 36);
    button1.addActionListener(e -> check());
    this.add(button1);

    setLocationRelativeTo(null);
  }

  private void check() {
    // TODO: implement
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      MainWindow frame = new MainWindow();
      frame.setVisible(true);
    });
  }
}
