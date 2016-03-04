package Lab6;

import java.io.IOException;
import java.util.ArrayList;

public class FileArrayDriver {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> writeArray = new ArrayList<>();
		writeArray.add(0);
		writeArray.add(2);
		writeArray.add(4);
		writeArray.add(6);
		writeArray.add(8);
		
		ArrayList<Integer> readArray = new ArrayList<>();
		
		FileArray.writeArray("NewContents", writeArray);
		FileArray.readArray("NewContents", readArray);

	}

}
