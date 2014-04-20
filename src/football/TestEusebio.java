package football;

import java.util.Arrays;

public class TestEusebio {

	public static void main(String[] args) {
		Eusebio obj = new Eusebio();
		System.out.println("NAME : " + obj.getName());
		System.out.println("POSITION : " + obj.getPosition());
		System.out.println("FRIEND :" + Arrays.toString(obj.getFriend()));
	}
}
