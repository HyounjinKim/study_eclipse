package ex10;

public class Tv {

	public String color;
	public boolean power;
	public int channel;

	Tv() {
	}; // 생성자 호출

	public void power() {
		System.out.println("power 버튼 누름");
		power = !power;
	}

	public void channelUp() {
		System.out.println("채널 올리기");
		channel++;
	}

	public void channelDown() {
		System.out.println("채널 내리기");
		channel--;
		if (channel == -1) {
			System.out.println("채널이 음수면 0으로 초기화");
			channel = 0;
		}
	}

}
