package play.java.design.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    List<Filter> filterList = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public String doFilter(String msg){
        for (Filter filter : filterList) {
            msg = filter.doFilter(msg);
        }
        return msg;
    }
}
