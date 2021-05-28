package serg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Computer.xml");) {
            Computer computer = context.getBean(Computer.class);
            System.out.println("данные о процессоре");
            System.out.println("Частота - " +computer.getCpu().getFreqency());
            System.out.println("Количество ядер - " +computer.getCpu().getYdro());
            System.out.println("Производитель - " +computer.getCpu().getManufacture());
            System.out.println("Вес - " +computer.getCpu().getWeight());
            //
            System.out.println("данные о памяти");
            System.out.println("Тип - " +computer.getMemory().getType());
            System.out.println("Объем - " +computer.getMemory().getVolume());
            System.out.println("Вес - " +computer.getMemory().getWeight());
            //
            System.out.println("данные о жестком диске");
            System.out.println("Тип - " +computer.getHard().getType());
            System.out.println("Объем - " +computer.getHard().getVolume());
            System.out.println("Вес - " +computer.getHard().getWeight());
            //
            System.out.println("данные о Экране");
            System.out.println("Тип - " +computer.getMonitor().getType());
            System.out.println("Диагональ - " +computer.getMonitor().getDiagonal());
            System.out.println("Вес - " +computer.getMonitor().getWeight());
            //
            System.out.println("данные о клавиатуре");
            System.out.println("Тип - " +computer.getClipboard().getType());
            System.out.println("Подсветка - " +computer.getClipboard().isLight());
            System.out.println("Вес - " +computer.getClipboard().getWeight());
            //
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
