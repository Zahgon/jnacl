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

public class poly1305 {

    final int CRYPTO_BYTES = 16;

    final int CRYPTO_KEYBYTES = 32;

    static final int[] minusp = { 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 252 };

    public static int crypto_onetimeauth_verify(byte[] h, int hoffset, byte[] inv, int invoffset, long inlen, byte[] k) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void add(int[] h, int[] c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void squeeze(int[] h) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void freeze(int[] h) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void mulmod(int[] h, int[] r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int crypto_onetimeauth(byte[] outv, int outvoffset, byte[] inv, int invoffset, long inlen, byte[] k) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
