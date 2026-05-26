//
//  Copyright (c) 2011, Neil Alexander T.
//  All rights reserved.
//
//  Redistribution and use in source and binary forms, with
//  or without modification, are permitted provided that the following
//  conditions are met:
//
//  - Redistributions of source code must retain the above copyright notice,
//    this list of conditions and the following disclaimer.
//  - Redistributions in binary form must reproduce the above copyright notice,
//    this list of conditions and the following disclaimer in the documentation
//    and/or other materials provided with the distribution.
//
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
//  IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
//  ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
//  LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
//  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
//  SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
//  INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
//  CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
//  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
//  POSSIBILITY OF SUCH DAMAGE.
//
package com.neilalexander.jnacl.crypto;

public class salsa20 {

    final int crypto_core_salsa20_ref_OUTPUTBYTES = 64;

    final int crypto_core_salsa20_ref_INPUTBYTES = 16;

    final int crypto_core_salsa20_ref_KEYBYTES = 32;

    final int crypto_core_salsa20_ref_CONSTBYTES = 16;

    final int crypto_stream_salsa20_ref_KEYBYTES = 32;

    final int crypto_stream_salsa20_ref_NONCEBYTES = 8;

    final static int ROUNDS = 20;

    static long rotate(int u, int c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static int load_littleendian(byte[] x, int offset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void store_littleendian(byte[] x, int offset, int u) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int crypto_core(byte[] outv, byte[] inv, byte[] k, byte[] c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int crypto_stream(byte[] c, int clen, byte[] n, int noffset, byte[] k) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int crypto_stream_xor(byte[] c, byte[] m, int mlen, byte[] n, int noffset, byte[] k) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
