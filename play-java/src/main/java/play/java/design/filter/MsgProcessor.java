package play.java.design.filter;

public class MsgProcessor {
    private String msg;
    private FilterChain filterChain;;
//    Filter[] filters = {new HTMLFilter(), new SensitiveFilter()};

    public MsgProcessor() {
    }

    public MsgProcessor(String msg) {
        this.msg = msg;
    }

    public MsgProcessor(String msg, FilterChain filterChain) {
        this.msg = msg;
        this.filterChain = filterChain;
    }

    public String process() {
        return filterChain.doFilter(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
