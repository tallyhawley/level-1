 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String url = "http://www.fractalsciencekit.com/fractals/large/Fractal-Mobius-Dragon-IFS-13.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component img1;
		// 3. use the "createImage()" method below to initialize your Component
		img1 = createImage(url);
		// 4. add the image to the quiz window
		quizWindow.add(img1, null);;
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String q1 = JOptionPane.showInputDialog("What kind of fractal is this?");
		// 7. print "CORRECT" if the user gave the right answer
		q1.toLowerCase();
		if(q1.equals("mobius")||q1.equals("mobius dragon") || q1.equals("mobius dragon fractal")){
			JOptionPane.showMessageDialog(null,"CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else{
			JOptionPane.showMessageDialog(null,"INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(img1);
		// 10. find another image and create it (might take more than one line of code)
		String url2 = "http://vignette4.wikia.nocookie.net/phineasandferb/images/7/71/Phineas_and_Ferb_Interrupted_Image140.jpg/revision/latest/scale-to-width-down/325?cb=20130803052600";
		Component img2;
		img2 = createImage(url2);
		// 11. add the second image to the quiz window
		quizWindow.add(img2, null);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String q2 = JOptionPane.showInputDialog("what is his name");
		// 14+ check answer, say if correct or incorrect, etc.
		q2.toLowerCase();
		if(q2.equals("phineas")||q2.equals("phineas flynn")||q2.equals("phineas flynn-fletcher")){
			JOptionPane.showMessageDialog(null,"CORRECT");
		}
		else{
			JOptionPane.showMessageDialog(null,"INCORRECT");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}


