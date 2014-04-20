package football;

public class Eusebio {
	private String name;
	private String position;
	private String friend[];

	public Eusebio() {
		name = "Eusebio";
		position = "vanguard";
		friend = new String[] { "pepe", "beto", "dooda", "baolo" };
		System.out.println("Constructor Eusebio");
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String[] getFriend() {
		return friend;
	}
}
