package org.example.generics;
import java.util.Arrays;

public class CajaSinGenericos {
    Object[] content;

    public CajaSinGenericos() {
    }

    @Override
    public String toString() {
        return "CajaSinGenericos{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

    public CajaSinGenericos(Object[] content) {
        this.content = content;
    }
    public void add(int pos , Object objeto){
        content[pos] = objeto;
    }
    public Object get(int pos){
        return content[pos];
    }
}