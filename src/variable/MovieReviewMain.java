package variable;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mr = new MovieReview();
        mr.title = "spiderman";
        mr.review = "wow amazing";

        MovieReview li = new MovieReview();
        li.title = "lion";
        li.review = "horrable";


        MovieReview[] movie = new MovieReview[2];
        movie[0] = mr;
        movie[1] = li;


        for (int i = 0; i < movie.length; i++) {
            System.out.println("title: " + movie[i].title + ", reivew: " + movie[i].review);
        }

        for(MovieReview m : movie){
            System.out.println("title: " + m.title + ", reivew: " + m.review);
        }
    }
}
