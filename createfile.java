import java.io.File;
import java.io.IOException;

public class createfile{
	public static void main(String args[]){
		try{
			File f0 = new File("rahul.txt");
			if(f0.createNewFile()){
				System.out.println("File" + f0.getName()+"is created suceccfully");
			}else{
				System.out.println("File Already Exists in the same location");
			}
		}catch(IOException exception){
			System.out.println("An unexpected error occurred");
			exception.printStackTrace();
		}
	}
}