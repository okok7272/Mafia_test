package system;

import java.net.*;// buffer�� exception
import java.io.*;//socket�� ���
import java.util.*;//excute


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress LocalAddress = InetAddress.getLocalHost();
			
			try(Socket cSocket = new Socket(LocalAddress, 10000);
					PrintWriter out = new PrintWriter(cSocket.getOutputStream(), true);
					BufferedReader br = new BufferedReader(new InputStreamReader(cSocket.getInputStream()))					
					){
				System.out.println("");
				Scanner king = new Scanner(System.in);
				while(true) {
					System.out.print("Input message : ");
					String inputLine = king.nextLine();
					if ("quit".equalsIgnoreCase(inputLine)) {
						break;
					}
					out.println(inputLine); 
					String response = br.readLine();
					System.out.println("���� ���� : " + response);					
				}
				king.close();				
			}
		}catch (IOException ex) {
		
		
		
		}
	}
}
