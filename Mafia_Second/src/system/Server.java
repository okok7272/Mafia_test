package system;

import java.net.*;// buffer�� exception
import java.io.*;//socket�� ���
import java.util.*;//excute
import java.io.IOException;
import system.Client;
import game.GameMain;
//���� : ��ũ�� �ͽ�(������) ���
//�������� �� ��δ� ���� ����
//��ȸ�� : ����

public class Server {
	private static Socket clientSocket;
	
	public Server(Socket clientSocket) {
		this.clientSocket= clientSocket;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}
