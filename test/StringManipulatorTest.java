import module5_3.Task2.StringManipulator;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {
    String str1 = "Hello";
    String str2 = "World";
    String subStr = "lo";

    @Test
    void concatenateTest(){
        StringManipulator sm = new StringManipulator();
        String result = sm.concatenate(str1, str2);
        assert result.equals("HelloWorld");
    }
    @Test
    void findLengthTest(){
        StringManipulator sm = new StringManipulator();
        int result = sm.findLength(str1);
        assert result == 5;
    }
    @Test
    void convertToUpperCaseTest(){
        StringManipulator sm = new StringManipulator();
        String result = sm.convertToUpperCase(str1);
        assert result.equals("HELLO");
    }
    @Test
    void convertToLowerCaseTest(){
        StringManipulator sm = new StringManipulator();
        String result = sm.convertToLowerCase(str1);
        assert result.equals("hello");
    }
    @Test
    void containsSubstringTest(){
        StringManipulator sm = new StringManipulator();
        boolean result = sm.containsSubstring(str1, subStr);
        assert result;
    }
}
