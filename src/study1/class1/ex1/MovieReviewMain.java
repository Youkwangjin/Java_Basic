package study1.class1.ex1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mv1 = new MovieReview();
        mv1.title = "파묘";
        mv1.review = "뭐가 나왔다고 거기서 겁나 험한게..";

        MovieReview mv2 = new MovieReview();
        mv2.title = "콩";
        mv2.review = "재밌어요!";

        MovieReview movieReviews[] = new MovieReview[] {mv1, mv2};
        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println("영화제목 :" + movieReviews[i].title + " 리뷰:" + movieReviews[i].review);
        }

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화제목 :" + movieReview.title + " 리뷰:" + movieReview.review);
        }

        // 출력문 반복으로 인해 중복 발생! 고민해보자.. (for 문을 통해 해결)
        System.out.println("영화제목 : " + mv1.title + " 리뷰 : " + mv1.review);
        System.out.println("영화제목 : " + mv2.title + " 리뷰 : " + mv2.review);
    }
}
