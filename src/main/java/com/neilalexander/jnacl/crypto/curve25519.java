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

public class curve25519 {

    final int CRYPTO_BYTES = 32;

    final int CRYPTO_SCALARBYTES = 32;

    static byte[] basev = { 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    static int[] minusp = { 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128 };

    public static int crypto_scalarmult_base(byte[] q, byte[] n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void add(int[] outv, int outvoffset, int[] a, int aoffset, int[] b, int boffset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void sub(int[] outv, int outvoffset, int[] a, int aoffset, int[] b, int boffset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void squeeze(int[] a, int aoffset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void freeze(int[] a, int aoffset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void mult(int[] outv, int outvoffset, int[] a, int aoffset, int[] b, int boffset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void mult121665(int[] outv, int[] a) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void square(int[] outv, int outvoffset, int[] a, int aoffset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void select(int[] p, int[] q, int[] r, int[] s, int b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void mainloop(int[] work, byte[] e) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void recip(int[] outv, int outvoffset, int[] z, int zoffset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static int crypto_scalarmult(byte[] q, byte[] n, byte[] p) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
