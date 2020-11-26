package io.github.newlight77.bootstrap;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Calculator {

    public int add(String numbers) throws Exception{
        int som = 0;
        if(numbers != null && !numbers.isEmpty()) {
            String[] arr = numbers.split(",|\\\n");
            for(String s : arr) {
                int val = Integer.parseInt(s);
                if(val>1000) continue;
                if(val<0) throw new Exception();
                som+= val;
            }
            return som;
        }
        return som;
    }
}
