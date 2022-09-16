		//초를 입력 받고 입력 받은 초를 시 분 초로 나눠서 출력하는 p/g
		//예) 5000초 = 1시간 23분 ?초
		//반복문으로 계속 할 지 여부 확인 후 "q"를 입력 받으면 종료하도록 작성
							//스캐너 - byte단위의 입력 스트림을 문자열타입으로 변환하여 리턴해주는 객체
		//내 접근 방식
		//시=inputsec/3600
		//분=(inputsec%3600)/60
		//초=inputsec%60\
		//반복문

package practice;
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args) {

	boolean run = true;
	while(run) {
		Scanner scanner = new Scanner(System.in);//byte => String 변환
		System.out.println("소요 시간(초)을 입력하세요.");
		String inputsec = scanner.nextLine();
		int is = Integer.parseInt(inputsec);
		System.out.printf("%d초 = ", is);
		int h = is/3600;
		int m = (is%3600)/60;
		int s = is%60;
		System.out.printf("%d시간 %d분 %d초\n", h, m, s);
		
			System.out.print("그만하시려면 q를 입력해주세요.\n");
			String data=scanner.nextLine();
			if(data.equals("q")) {
				System.out.println("수고하셨습니다.");
				run=!run;
			}
		}
	}
}