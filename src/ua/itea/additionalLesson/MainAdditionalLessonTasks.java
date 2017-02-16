package ua.itea.additionalLesson;

import java.io.IOException;

/**
 * Additional lesson ITEA with Alexander Sulzhenko
 *
 * Were topics: Enum, Logger, Lambda, Reflection API, RandomAccessFile
 * @author vitaliy
 * @version 1.0
 * @since 2/4/17
 */
public class MainAdditionalLessonTasks {

//    private static final Logger logger = Logger.getLogger("MainAdditionalLessonTasks");

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchFieldException {



        //Write&Read file with RandomAccessFile

//        RandomAccessFile raf = new RandomAccessFile("test1.txt", "rw");
//        raf.seek(10);
//        raf.writeUTF("hello world");
//        raf.seek(12);
//        char c = (char)raf.readAllFromFile();
//        System.out.println(c);
//        raf.close();


        //Reflection API example

//        Class<? extends Demo> demo = Demo.class;
//        Demo demoObject = new Demo("Alex");
//        //System.out.println("Write your class with package path");
//        //Class<?> demo = Class.forName(new Scanner(System.in).nextLine());
//        try {
//            System.out.println("Write field");
//            Field field = demo.getDeclaredField(new Scanner(System.in).nextLine());
//            //System.out.println("Write method");
//            //Method method = demo.getDeclaredMethod(new Scanner(System.in).nextLine());
//            field.setAccessible(true);
//            System.out.println(field.get(demoObject));
//            //method.setAccessible(true);
//            //method.invoke(demoObject);
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        } catch (SecurityException e) {
//            e.printStackTrace();
//        }


        //Lambda example

//        Runnable runnable = System.out::println;
//        new Thread(runnable).start();


        //Test logger (Add to edit configuration -> VM option: -Djava.util.logging.config.file=config.txt)

//        System.out.println(123);
//        logger.warning("hello world");


        //Task with Enum

//        Mobile[] mobiles = Mobile.values();
//
//        for (int i = 0; i < mobiles.length; i++){
//            System.out.println(mobiles[i].toString() + ": price "+mobiles[i].getPrice());
//        }
//
//        Mobile mobile = Mobile.IPHONE;
//        System.out.println(mobile.ordinal());
//
//        String x = Mobile.IPHONE.name();
//        Mobile m = Mobile.valueOf(x);
//        System.out.println(m.name());

    }
}
