
public class Java14 {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "sasaki";
		Hero h1 = new Hero();
		h1.name = "sasaki";
		System.out.println(h.equals(h1));
		
		Object o = new Hero();
		
	}

}
