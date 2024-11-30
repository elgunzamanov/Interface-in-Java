public interface Playable {
	int MAX_VOLUME = 100;

	void play();
	void stop();

	default void defaultPlayMessage() {
		System.out.println("Playing media.");
	}
}