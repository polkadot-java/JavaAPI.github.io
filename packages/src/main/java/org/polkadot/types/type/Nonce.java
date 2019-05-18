package org.polkadot.types.type;


import org.polkadot.types.primitive.U64;

/**
 * @name Nonce
 * @description
 * The Nonce or number of transactions sent by a specific account. Generally used
 * with extrinsics to determine the order of execution. implemented as a Substrate
 * [[U64]]
 */
public class Nonce extends U64 {
    public Nonce(Object value) {
        super(value);
    }
}
