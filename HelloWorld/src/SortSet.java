import java.util.Collections;
import java.util.HashSet;

public class SortSet {
  public static void main(String[] args) {
    HashSet<Long> hashSet = new HashSet<Long>();

    hashSet.add(new Long("9"));
    hashSet.add(new Long("4"));
    hashSet.add(new Long("2"));
    hashSet.add(new Long("2"));
    hashSet.add(new Long("1"));

    Object obj = Collections.min(hashSet);
    System.out.println("Minimum Element of HashSet is : " + obj);
    
  }
}