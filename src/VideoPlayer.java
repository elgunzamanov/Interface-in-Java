public class VideoPlayer implements AdvancedPlayable {
	@Override
	public void play() {
		System.out.println("Playing video");
	}

	@Override
	public void stop() {
		System.out.println("Stopping video");
	}

	@Override
	public void pause() {
		System.out.println("Pausing video");
	}
}