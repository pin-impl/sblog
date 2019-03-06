import com.my.blog.website.utils.TaleUtils;

/**
 * @Author admin
 * @Date 2019/3/6 1:44 PM
 **/
public class Test {

    @org.junit.Test
    public void test() {
        String s = TaleUtils.MD5encode("admin123456");
        System.out.println(s);
    }
}
