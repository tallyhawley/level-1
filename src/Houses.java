import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	
	public static void main(String[] args){
		Tortoise.setX(5);
		Tortoise.setY(425);
		Tortoise.setSpeed(10);
		Tortoise.getBackgroundWindow().setColor(Color.black);
		int height = 0;
		for(int i=0;i<10;i++){
			height = new Random().nextInt(175);
			height += 25;
			if(height>75){
				flatHouse(height,PenColors.getRandomColor());
			}
			else{
				pointHouse(height,PenColors.getRandomColor());
			}
		}
	}
	private static void flatHouse(int height, Color color){
		Tortoise.setAngle(0);
		Tortoise.setPenColor(color);
		Tortoise.move(height);
		Tortoise.setAngle(90);
		Tortoise.move(35);
		Tortoise.setAngle(180);
		Tortoise.move(height);
		Tortoise.setAngle(90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(25);
	}
	private static void pointHouse(int height, Color color){
		Tortoise.setAngle(0);
		Tortoise.setPenColor(color);
		Tortoise.move(height);
		Tortoise.setAngle(45);
		Tortoise.move(25);
		Tortoise.setAngle(135);
		Tortoise.move(25);
		Tortoise.setAngle(180);
		Tortoise.move(height);
		Tortoise.setAngle(90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(25);
	}
}
