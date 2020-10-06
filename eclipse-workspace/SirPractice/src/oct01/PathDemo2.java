package oct01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {

	public static void main(String[] args) {
		Path path = Paths.get("dir//abc//p1//my.txt");
		System.out.println(path.toString()); 
		System.out.println(path.isAbsolute()); 
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
		System.out.println(path.getNameCount());
		System.out.println(path.getParent());
		System.out.println(path.getName(1)); 
		
		System.out.println(path.toAbsolutePath().toString());
		
		System.out.println(path.toFile().exists()); 
		
		
	}

}
