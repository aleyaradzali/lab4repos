import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTranslateMain {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		ClientTranslateFrame frame = new ClientTranslateFrame();
		
		Socket socket = new Socket(InetAddress.getLocalHost(), 2992);
		
		frame.bttnTranslate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String text;
				String lang;
				
				try {
					
					text = frame.getText();
					lang = frame.getLang();
					
					DataOutputStream output = new DataOutputStream(socket.getOutputStream());
					output.writeUTF(text);
					
					output.writeUTF(lang);
					
					DataInputStream input = new DataInputStream(socket.getInputStream());
					String translated = input.readUTF();
					
					frame.updateTranslatedText(translated);
					
					
					
					
					
				}catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
		});

		
		
		
	}

}
