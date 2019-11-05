package play.java.design.filter;

public class HTMLFilter implements Filter {

    @Override
    public String doFilter(String s) {
        return s.replace("<", "[").replace(">", "]");
    }
}
