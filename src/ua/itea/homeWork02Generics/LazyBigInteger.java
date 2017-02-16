package ua.itea.homeWork02Generics;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.function.LongSupplier;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/2/17
 */
public class LazyBigInteger extends BigInteger implements LongSupplier, Serializable {

    public LazyBigInteger(String val) {
        super(val);
    }

    @Override
    public long getAsLong() {
        return this.longValue();
    }

    public String toString(){
        return ""+getAsLong();
    }

}
