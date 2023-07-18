package com.andrunevchyn.obvious;

import java.util.HashMap;
import java.util.Map;

public class NewMapTest {
    public static void main(String[] args){
        Map<Integer, String> map = Map.of(1,"v1", 2,"v2");
        //if you need copy of Map you could like this
        var copyMap1 = new HashMap(map);
        //but copy1 doesn't keep information about types anymore so you have HashMap<Object,Object> copy1

        //This copy of Map - copyMap2 - is much better
        var copyMap2 = new HashMap<>(map);

        //but recommended solution is copyMap3
        var copyMap3 = Map.copyOf(map);
    }
}
