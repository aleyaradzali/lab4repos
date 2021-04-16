import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientWordCounterMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		
		ClientCounterFrame cFrame = new ClientCounterFrame();
		cFrame.setVisible(true);
		
		Socket socket = new Socket(InetAddress.getLocalHost(), 2393);
		
				
		cFrame.bttnClick.addActionListener(new ActionListener() {  //when button is clicked
		
			 public void actionPerformed(ActionEvent e){  
				 
				try {
					
					
					String text = cFrame.txtSentence.getText(); // read textfield
					cFrame.updateWord(text);  // send text updateWord
					
					DataOutputStream output = new DataOutputStream(socket.getOutputStream());
					output.writeUTF(text);
					
					
					DataInputStream input = new DataInputStream(socket.getInputStream());
					String totalWordOfText = input.readUTF();
					
					cFrame.updateCount(Integer.parseInt(totalWordOfText));
								
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
								
				 
			 }
			
		});
						
	}

}
