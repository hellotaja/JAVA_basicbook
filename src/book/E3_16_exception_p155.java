package book;

public class E3_16_exception_p155 {
	// 배열의 인덱스가 범위를 벗어날 때 발생하는 ArrayIndexOutOfBoundsException 처리
	public static void main(String[] args) {
		int [] intArray = new int[5];
		intArray[0] = 0;
		
		try {
			for (int i=0; i<5; i++) {
				intArray[i+1] = i+1 + intArray[i]; // i=4 인 경우 예외 발생
				System.out.println("intArray[" + i + "] = " + intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}
