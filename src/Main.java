import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 게시판 v 0.1 ==");
        System.out.println("== 프로그램 시작 ==");

        Scanner scanner = new Scanner(System.in);

        int articleId = 0;
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
                articleId++;
                System.out.println(articleId + "번 게시물이 등록되었습니다.");

            } else if (input.equals("/usr/article/list")) {

            } else if (input.equals("/usr/article/detail")) {

            } else if (input.equals("/usr/article/modify")) {

            } else if (input.equals("/usr/article/delete")) {

            } else {
                System.out.println("입력된 명령어 : " + input);
            }

        }
    }
}