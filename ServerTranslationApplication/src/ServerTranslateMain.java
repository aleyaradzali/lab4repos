import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerTranslateMain {

	public static void main(String[] args) throws IOException{
		
		String engText = "";
		String lang = "";

		ServerSocket serverSocket = new ServerSocket(2992);
		
		System.out.println("> Server: waiting for connection.\n");
		
		while(true) {
			
			Socket socket = serverSocket.accept();
			System.out.println("> Server: New connection at Translation App.");
			System.out.println("");
			
			try {
			
			DataInputStream input = new DataInputStream(socket.getInputStream());
			engText = input.readUTF();
			
			lang = input.readUTF();
			
			System.out.println("> The server has received text. and translating it now.");
			System.out.println();
			
			
			Translate translationDB = new Translate(engText, lang);
			String translated = translationDB.getTranslatedText();
			
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			output.writeUTF(translated);
			
			System.out.println("> Server: The translated text for " + engText + " in " + lang + " is " + translated);
			System.out.println();
			System.out.println("> Server: Translated text is sent.");
			System.out.println();
			System.out.println(">>>> Connection has ended.");
			System.out.println("");
			
			
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
			
		
		}
		
	}

}
