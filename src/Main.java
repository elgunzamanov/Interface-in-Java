public class Main {
	public static void main(String[] args) {
		Playable mp = new MusicPlayer();
		mp.play();
		mp.stop();

		Playable vp = new VideoPlayer();
		vp.play();
		vp.stop();
	}
}