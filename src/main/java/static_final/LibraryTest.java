package static_final;

public class LibraryTest {
    static void main(String[] args) {
        Library library1 = new Library();// через сеттер установила значения, но ИИ загуглила реализацию,потмоу что была ошибка в том,что в геттерах и сеттерах не проставила паблик (разобралась)
        library1.setAuthor("Author");
        library1.setBookTitle("Title");
        library1.setYear(2020);
        library1.setCategory("Category");

        System.out.println(library1.getAuthor());
        System.out.println(library1.getBookTitle());
        System.out.println(library1.getYear());
        System.out.println(library1.getCategory());

        //прямой доступ к полям

//        library1.bookTitle; //ошибка тк приват
//        library1.author; // в том же пакете
//        library1.year; // в том же пакете
//        library1.category // паблик


    }
    }


;