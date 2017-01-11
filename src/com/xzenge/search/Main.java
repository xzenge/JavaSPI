package com.xzenge.search;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by Administrator on 2017/1/11.
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Search> load = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = load.iterator();
        while(iterator.hasNext()){
            Search next = iterator.next();
            next.serach();
        }
    }
}
