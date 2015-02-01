package textfiles;
import java.io.IOException;

public class FileData {

	public static void main(String[ ] args) throws IOException {
		
		String file_name = "E:/Academics/4805B_Workspace/basicScrape.txt";
		
		try {
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			
			int i;
			for ( i=0; i < aryLines.length; i++ ) {
			System.out.println( aryLines[ i ] ) ;
			}
			
		}
		catch (IOException e) {
			System.out.println( e.getMessage() );
		}
		
		try {
		WriteFile data = new WriteFile( file_name , true );
		data.writeToFile("This is another line of text");
		}
		catch (IOException e) {
			System.out.println( e.getMessage());
		}
		
		System.out.println("Text File Written To");

	}
}