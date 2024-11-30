public class MusicPlayer implements AdvancedPlayable {
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