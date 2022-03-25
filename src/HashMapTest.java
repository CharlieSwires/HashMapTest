import java.util.Date;
import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
//        System.gc();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        Long start = (new Date()).getTime();
        for (int i = 0; i < 1000000; i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("one", "Mary had a little lamb.");
            map.put("two", "I'ts fleece was white as snow.");
            map.put("three", "Who would like to know.");
        }
        Long end = (new Date()).getTime();
        System.out.println("1. Time taken="+(end - start));
//        System.gc();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        start = (new Date()).getTime();
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 1000000; i++) {
            map.clear();
            map.put("one", "Mary had a little lamb.");
            map.put("two", "I'ts fleece was white as snow.");
            map.put("three", "Who would like to know.");
        }
        end = (new Date()).getTime();
        System.out.println("2. Time taken="+(end - start));
//        System.gc();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        start = (new Date()).getTime();
        for (int i = 0; i < 1000000; i++) {
            HashMap<String, String> map2 = new HashMap<String, String>();
            map2.put("one", "Mary had a little lamb.");
            map2.put("two", "I'ts fleece was white as snow.");
            map2.put("three", "Who would like to know.");
        }
        end = (new Date()).getTime();
        System.out.println("3. Time taken="+(end - start));
//        System.gc();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        start = (new Date()).getTime();
        HashMap<String, String> map2 = new HashMap<String, String>();
        for (int i = 0; i < 1000000; i++) {
            map2.clear();
            map2.put("one", "Mary had a little lamb.");
            map2.put("two", "I'ts fleece was white as snow.");
            map2.put("three", "Who would like to know.");
        }
        end = (new Date()).getTime();
        System.out.println("4. Time taken="+(end - start));

    }

}
