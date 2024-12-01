public class Main {
	public static void main(String[] args) {
		Document document = new Document();
		document.display();

		Readable readable = new Document();
		readable.display();

		Printable printable = new Document();
		printable.display();
	}
}