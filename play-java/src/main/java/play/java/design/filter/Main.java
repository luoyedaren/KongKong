package play.java.design.filter;

public class Main {
    public static void main(String[] args) {
        String s = "大家好：我是<script/> ni hao shuang 11 敏感:cnm";
        FilterChain filterChain = new FilterChain().addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());
        FilterChain filterChain1 = new FilterChain().addFilter(new FaceFilter());
        filterChain.addFilter(filterChain1);
        MsgProcessor msgProcessor = new MsgProcessor(s, filterChain);
        String process = msgProcessor.process();
        System.out.println(process);
    }
}
