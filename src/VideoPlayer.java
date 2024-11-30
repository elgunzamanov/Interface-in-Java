public class VideoPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("Playing video");
	}

	@Override
	public void stop() {
		System.out.println("Stopping video");
	}
}