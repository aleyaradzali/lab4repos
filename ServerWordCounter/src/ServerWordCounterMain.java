import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerWordCounterMain {

	public static void main(String[] args) throws Exception{
		
	
		ServerCounterFrame serverFrame = new ServerCounterFrame();
		serverFrame.setVisible(true);


		ServerSocket serverSocket = new ServerSocket(2393);	

		
		int totalRequest = 0;



		while(true) {
			
			Socket clientSocket = serverSocket.accept();
			
			serverFrame.updateServerStatus(clientSocket.isConnected());
			
			
			DataInputStream input = new DataInputStream(clientSocket.getInputStream());
			String text = input.readUTF();
			
			
			ServerCounter wc = new ServerCounter();
			wc.setText(text);
			
			int totalword = 0;
			
			totalword =	wc.getWordCount();
			
			
			DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());
			output.writeUTF(String.valueOf(totalword));
			
			//serverFrame.updateRequestStatus("Server found " + totalword + " word(s) from '"+ text + "' ");

			
			serverFrame.updateRequestStatus("Accepted connection from the client. Total request = " + ++totalRequest);
			serverFrame.updateRequestStatus("Text counted : " + text);
			
			clientSocket.close();


		}
	
		
				
				
	}

}
