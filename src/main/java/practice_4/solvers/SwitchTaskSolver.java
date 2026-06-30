package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {

    public static void main(String[] args){


//        SwitchTaskSolver switchTaskSolver = new SwitchTaskSolver(); // засчет статика можно удалить конструктор
        // проверка метода возвращающего день недели по числу
        System.out.println(dayOfWeek(4));
        System.out.println(dayOfWeek(22));
        // проверка метода возвращаюшая описание сезона

        System.out.println(describeSeason(Season.AUTUMN));


    }


    public static String dayOfWeek(int day){
        String dayOfWeek = "";
        switch (day){
            case 1:
                dayOfWeek = "ПН";
                break;
            case 2:
                dayOfWeek = "ВТ";
                break;
            case 3:
                dayOfWeek = "СР";
                break;
            case 4:
                dayOfWeek = "ЧТ";
                break;
            case 5:
                dayOfWeek = "ПТ";
                break;
            case 6:
                dayOfWeek = "СБ";
                break;
            case 7:
                dayOfWeek = "ВС";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";
        }

        return dayOfWeek;

    }


    public static String describeSeason(Season season){
        String description = "";
        switch (season){
            case WINTER -> description = "Зима — холодно и снежно";
            case SPRING -> description = "Все цветет";
            case SUMMER -> description = "Лето — жарко";
            case AUTUMN -> description = "Осень - день рождения";
        }

        return description;

    }



}
