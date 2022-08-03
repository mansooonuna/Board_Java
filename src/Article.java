public class Article {
    int articleid;
    String title, body;

    public Article(int articleid, String title, String body) {
        this.articleid = articleid;
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("{글번호 : %d, 제목 : %s, 내용: %s", articleid, title, body);
    }
}
