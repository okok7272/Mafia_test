package game;

/*
 * 서버
 * 클라이언트 : 다수
 * room :
 * system:
 * 낮
 * 밤
 * 낮의 채팅 서버
 * 낮의 투표 서버
 * 마피아 살해 시작
 * "<N>번째 아침이 밝았습니다. 오늘 밤에는 <대상>이 사망하였습니다."
 * "투표 결과 : 'user name': %d표... 마을 사람들의 의견에 따라 'user name'이 용의자로 지정되었습니다." 
 * 모두에게 의견을 전달하는 곳에서 마지막 반론 시간 제어 끝
 * 마지막 투표 서버 : 결과
 * 대상 :죽으면 클라이언트 서버 연결 끝 사망하셨습니다.
 * 게임 내 모두에게 정체 알려줌
 * 다시 밤으로
 */
import java.util.*;
import java.io.*;
import java.net.*;

import system.Client;
import system.Server;


public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	
	public void Votingsystem() {
		
	}
	public void LastObjection() {
		//반론  timer나 sleep이용하여 말하고 나서 생 사 투표 시작
	}
	public void DeadorAlive() {
		/*
		 * 생 입력 Scanner 사용 살리고 
		 * 사 입력 Scanner 사용 죽임
		 * 만약 죽으면 game 종료 subprogram확인 
		 * 		
		 */
		//투표 결과 정체 -> 게임이 끝났니? 아뉘-> 그럼 밤으로
	}
	
	//저녁에 사람 죽이기-> 게임에 마피아만 남았냐? ㄴㄴ-> 계속
	//낮에 투표 결과 
	
}


