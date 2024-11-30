public class Main {
	public static void main(String[] args) {
		AdvancedPlayable mp = new MusicPlayer();
		mp.play();
		mp.pause();
		mp.stop();

		AdvancedPlayable vp = new VideoPlayer();
		vp.play();
		vp.pause();
		vp.stop();
	}
}