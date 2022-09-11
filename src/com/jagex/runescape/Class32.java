package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class32 {
	public static volatile boolean aBoolean702 = true;
	public static boolean aBoolean703 = false;
	public static RSInterface aClass4_Sub13_698;
	public static long[] aLongArray699 = new long[32];
	public static int anInt694;
	public static int anInt696;
	public static int[][] anIntArrayArray697 = new int[5][5000];

	public static void method882(int arg0, int arg1) {
		try {
			Class4_Sub20_Sub6.aBoolean2914 = false;
			Class4_Sub21.anInt2374 = -1;
			Class4_Sub20_Sub9.anInt3050 = 0;
			Class25.anInt577 = -1;
			Class67.aClass19_1363 = null;
			Buffer.anInt2085 = 1;
			Class4_Sub20_Sub5.anInt2888 = arg0;
			if (arg1 <= 63)
				method883(115);
			anInt694++;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("jb.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method883(int arg0) {
		try {
			aClass4_Sub13_698 = null;
			anIntArrayArray697 = null;
			StringUtilities.aJagexString_695 = null;
			StringUtilities.aJagexString_701 = null;
			StringUtilities.aJagexString_700 = null;
			if (arg0 == 1)
				aLongArray699 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "jb.B("
					+ arg0 + ')');
		}
	}
}
