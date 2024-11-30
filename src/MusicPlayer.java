public class MusicPlayer implements AdvancedPlayable {
	public static void main(String[] args) {
		// It can't be changed because it's a final field.
		//MAX_VOLUME = 50;
	}

	@Override
	public void play() {
		System.out.println("Playing music");
	}

	@Override
	public void stop() {
		System.out.println("Stopping music");
	}

	@Override
	public void pause() {
		System.out.println("Pausing music");
	}
}