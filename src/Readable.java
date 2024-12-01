public interface Readable {
	default void display() {
		System.out.println("Displaying content");
	}
}