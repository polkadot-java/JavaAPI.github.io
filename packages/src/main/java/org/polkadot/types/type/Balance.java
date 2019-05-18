package org.polkadot.types.type;


import org.polkadot.types.primitive.U128;

/**
 * @name Balance
 * @description The Substrate Balance representation as a [[U128]].
 */
public class Balance extends U128 {
    public Balance(Object value) {
        super(value);
    }


    public static class BalanceOf extends Balance {
        public BalanceOf(Object value) {
            super(value);
        }
    }
}

