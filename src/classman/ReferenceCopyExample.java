package classman;

public class ReferenceCopyExample {
    public static void main(String[] args) {
        MovieHello movieReview = new MovieHello("바람과 함께 사라지다.", "또 보고싶어요.");
        System.out.println("변경 전: " + movieReview); // 변경 전 상태 출력
        movieReview.changeName("치킨먹고싶다.");
        System.out.println("변경 후: " + movieReview); // 변경 후 상태 출력

        Integer age = 30;
        System.out.println(age);
        movieReview.setAge(age);
        System.out.println(age);


    }
}
class MovieHello {
    String name;
    String review;

    public void setAge(Integer age) {
        age = 760;
    }


    public MovieHello(String name, String review) {
        this.name = name;
        this.review = review;
    }

    public void changeName(String newName) {
        this.name = newName;  // 객체 내부 값을 변경
    }

    @Override
    public String toString() {
        return "MovieReview{" +
                "name='" + name + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}
