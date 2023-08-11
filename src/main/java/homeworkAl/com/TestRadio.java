package homeworkAl.com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRadio {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                Config.class
        );

       RadioPlayer radioPlayer = context.getBean("radioPlayer", RadioPlayer.class);

       radioPlayer.playSong();

       context.close();

    }
}
// homework
// create 3 radiostations
// радио плеер повинен в собі зберігати лист радіостанцій, а не окремі поля
// конструктор радіо плеера повинен очікувати список із муз жанрів
// створити біни для радіостанцій
// створити бін який з себе представляє список радіо станцій
// внедріти бін список в бін радіо плеера
// метод плей музик повинен рендомно виконати композиціію(Random)
// анотації Component, Autowired, ComponentScan не використовувати все зробити вручну в конфіг файлі