public class MethodOverloading {
	public static void main(String[] args) {
		printValue(30);
		printValue(3.14);
		printValue("Hello!");
	}
	
	public static void printValue (int number) {
	    System.out.println("Internet Value: " + number);
	}
	public static void printValue (double number) {
	    System.out.println("Double Value: " + number);
	}
	public static void printValue (String text) {
	    System.out.println("String Value: " + text);
	}
}