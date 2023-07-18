package com.andrunevchyn.obvious;

import java.util.ArrayList;
import java.util.Set;

public class NullComparatorValueTest {
    public static void main(String[] args) {
        var keySet = Set.of("k4", "k1", "k3", "k2", "k5", "k6", "k7", "k8", "k9", "k10", "k11", "k12");
        System.out.println("keySet " + keySet);
        var keyList = new ArrayList<>(keySet);
        keyList.sort(null);
        System.out.println("keyList " + keyList);
    }
}