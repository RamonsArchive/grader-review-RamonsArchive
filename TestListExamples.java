import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testMergeLeftEnd(){
    List<String> left = Arrays.asList("a", "d");
    List<String> right = Arrays.asList("a", "b", "c");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }
  @Test(timeout = 500)
   public void testMergeRightAgain(){
    List<String> left = Arrays.asList("b","c","d");
    List<String> right = Arrays.asList("a","b","a","c","c");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a","b","a","b","c","c","c","d");
    assertEquals(expected,merged);
  }
  @Test(timeout = 500)
  public void testFilter(){
    List<String> list = Arrays.asList("moon","sun","moon","pluto");
    List<String> result = ListExamples.filter(list,new IsMoon());
    List<String> expected = new ArrayList<>();
    expected.add("moon");
    expected.add("moon");
    assertEquals(expected,result);
  }

  
}
