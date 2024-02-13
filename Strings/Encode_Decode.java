import java.util.List;
import java.util.ArrayList;
public class Encode_Decode {
    public static String Encode(List<String> strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append((char)str.length()).append(str);
        }
        return sb.toString();
    }

    public static List<String> Decode(String strs){
        List<String> res = new ArrayList<>();
        int index = 0  , length = strs.length();
        while(index < length){
            int size = strs.charAt(index++);
            res.add(strs.substring(index, index+size));
            index+=size;
        }
        return res;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("bc");
        list.add("abc");
        System.out.println(Encode(list));
        System.out.println(Decode(Encode(list)));
    }
}
