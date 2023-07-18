package com.andrunevchyn.obvious;

import java.util.List;
import java.util.Objects;

public class StreamAnyMatchTest {
    public static void main(String[] args){
        var bool = List.of().stream().anyMatch(value -> Objects.equals(value, "anything"));
        System.out.println(bool);
    }
}
