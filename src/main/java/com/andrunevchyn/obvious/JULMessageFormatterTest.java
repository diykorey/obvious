package com.andrunevchyn.obvious;

import java.text.MessageFormat;
import org.junit.jupiter.api.Test;

public class JULMessageFormatterTest {



    public String format(String format, Object... args) {
        return MessageFormat.format(format, args);
    }

    @Test
    public void test() {
        Object[] parameters = {"P1", 123456};

        //single quotes block placeholder
        String format = "Test '{0}' {1,number,#}";
        System.out.println("Single quotes: " + format(format, parameters));
        assert format(format, parameters).equals("Test 'P1' 123,456");

        //but you could use escaped quotes
        String format2 = "Test \"{0}\" {1}";
        System.out.println("Escaped quotes: " + format(format2, parameters));

        //but not like this it
        String format3 = "Test \'{0}\' {1}";
        System.out.println("escaped single quotes: " + format(format3, parameters));

        //better use back quotes
        String format4 = "Test `{0}` {1}";
        System.out.println("Back quotes: " + format(format4, parameters));
    }


}
