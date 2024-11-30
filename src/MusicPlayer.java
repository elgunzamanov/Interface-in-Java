public class MusicPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("Playing music");
	}

	@Override
	public void stop() {
		System.out.println("Stopping music");
	}
}