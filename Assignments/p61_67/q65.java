/* 66. Write a program to store your shopping details in a binary file(shopping.dat)
 *  with information itemName, price, quantity. 
 *  (Use ObjectOutputStream to store Item class object ). 
 */

package p61_67;



	import java.awt.image.BufferedImage;
	import java.io.ByteArrayInputStream;
	import java.io.ByteArrayOutputStream;
	import java.io.File;
	import java.io.IOException;
	import javax.imageio.ImageIO;
	import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
	 
	 
	public class q65 {
		public static void main(String[] args) throws IOException{
			String dirName="C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots";
			ByteArrayOutputStream baos=new ByteArrayOutputStream(1000);
			BufferedImage img=ImageIO.read(new File(dirName,"adi.png"));
			ImageIO.write(img, "jpg", baos);
			baos.flush();
	 
			String base64String=Base64.encode(baos.toByteArray());
			baos.close();
	 
			byte[] bytearray = Base64.decode(base64String);
	 
			BufferedImage imag=ImageIO.read(new ByteArrayInputStream(bytearray));
			ImageIO.write(imag, "jpg", new File(dirName,"snap.jpg"));
		}
	}