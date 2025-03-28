package classman;

public class MovieReview {

	private String name;
	private String review;

	public MovieReview(String name, String review) {
		this.name = name;
		this.review = review;
	}

	public MovieReview() {}

	public MovieReview changeName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String toString() {
		return "MovieReview{" +
			"name='" + name + '\'' +
			", review='" + review + '\'' +
			'}';
	}

	static class MovieReviewMain {
		public static void main(String[] args) {
			MovieReview inception = new MovieReview("인셉션", "인생은 무한 루프");
			MovieReview aboutTime = new MovieReview("어바웃 타임", "인생 시간 영화!");
			MovieReview[] movies = new MovieReview[2];
			movies[0] = inception;
			movies[1] = aboutTime;
			for (int i = 0; i < movies.length; i++) {
				System.out.println("영화제목: " + movies[i].name + ", " + " 리뷰: " + movies[i].review);
			}

			for (MovieReview movie : movies) {
				System.out.println("영화제목: " + movie.name + ", 리뷰: " + movie.review);
			}
		}
	}

}
