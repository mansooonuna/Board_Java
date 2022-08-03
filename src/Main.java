import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 게시판 v 0.1 ==");
        System.out.println("== 프로그램 시작 ==");


        Scanner scanner = new Scanner(System.in);

        int articleId = 1;
        Article lastArticle = null;
        ArrayList<Article> articles = new ArrayList<>();
        test(articles);


        while (true) {
            System.out.print("명령) ");
            String input = scanner.nextLine();


            if (input.equals("exit")) {
                System.out.println("== 프로그램 종료 ==");
                break;


            } else if (input.equals("/usr/article/write")) {
                System.out.println("- 게시물 등록 -");
                System.out.print("제목 : ");
                String title = scanner.nextLine();
                System.out.print("내용 : ");
                String body = scanner.nextLine();

                Article article = new Article(articleId, title, body);
                lastArticle = article;
                articles.add(article);
                articleId++;

                System.out.println(lastArticle.articleid + "번 게시물이 등록되었습니다.");


            } else if (input.equals("/usr/article/detail")) {
                if (lastArticle == null) {
                    System.out.println("* 게시물이 존재하지 않습니다.");
                    continue;
                }

                Article article = lastArticle;

                System.out.println("- 최근 게시물 상세보기 -");
                System.out.println("글번호 : " + article.articleid);
                System.out.println("제목 : " + article.title);
                System.out.println("내용 : " + article.body);


            } else if (input.equals("/usr/article/list")) {
                if (articles.size() == 0) {
                    System.out.println("* 게시물이 존재하지 않습니다.");
                    continue;
                }

                System.out.println("- 모든 게시물 목록보기 -");
                System.out.println("_________________");
                System.out.println("  글번호 / 제 목 ");
                System.out.println("-----------------");

                for (int i = articles.size()-1; i >= 0; i--) {
                    Article article = articles.get(i);
                    System.out.println("    " + article.articleid + "     " + article.title);
                }

            } else if (input.equals("/usr/article/modify")) {

            } else if (input.equals("/usr/article/delete")) {

            } else {
                System.out.println("입력된 명령어 : " + input);
            }

        }
    }

    public static void test(ArrayList<Article> testArticles) {

        for (int i = 1; i <= 100; i++) {
            testArticles.add(new Article(i, "제목" + i, "내용" + i));

        }
    }
}