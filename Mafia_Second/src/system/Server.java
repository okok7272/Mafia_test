package system;

import java.net.*;// buffer와 exception
import java.io.*;//socket등 기능
import java.util.*;//excute
import java.io.IOException;
import system.Client;
import game.GameMain;
//직업 : 스크럴 귀신(관전자) 사람
//게임종료 시 모두다 연결 끊김
//사회자 : 서버

public class Server {
	private static Socket clientSocket;
	
	public Server(Socket clientSocket) {
		this.clientSocket= clientSocket;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}
