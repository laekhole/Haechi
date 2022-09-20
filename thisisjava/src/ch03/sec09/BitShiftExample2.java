package ch03.sec09;

public class BitShiftExample2 {

	public static void main(String[] args) {
		int value = 772; // [00000000] [00000000] [00000011] [00000100]
		//우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음 : [00000000]\
		
		System.out.println(value >>> 24);
		byte byte1 = (byte)(value>>>24);
		System.out.println(byte1);
	
		int int1 = byte1 & 255;
		System.out.println("첫 번째 바이트 부호 없는 값: " + int1);
		
		//우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음 : [00000000]
		byte byte2 = (byte)(value >>>16);//[00000000] [00000000] [00000000] [00000000]
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두 번째 바이트 부호 없는 값: "+ int2);
		
		//우측으로 1byte(8bit)이동하고 끝 1바이트만 읽음 : [00000011]
		byte byte3 = (byte)(value >>>8);//[00000000] [00000000] [00000000] [00000011]
		int int3 = byte3 & 255;
		System.out.println("두 번째 바이트 부호 없는 값: "+ int2);

		/*
		//체크 및 연습
		System.out.println(value);
		System.out.println(Integer.toBinaryString(value));
		System.out.println(value>>>3);
		System.out.println(Integer.toBinaryString(value>>>3));
		System.out.println(value>>3);
		System.out.println(Integer.toBinaryString(value>>3));
		System.out.println(value<<3);
		System.out.println(Integer.toBinaryString(value<<3));
		int prtc=-8;
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println(-8>>3);
		System.out.println(Integer.toBinaryString(-8>>3));
		System.out.println(Integer.toBinaryString(-1));
		System.out.println((-8<<3));
		System.out.println(Integer.toBinaryString(-8<<3));
*/
		
		
	}

}
