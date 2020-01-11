package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class32 {
	public static volatile boolean aBoolean702;
	public static boolean aBoolean703;
	public static JagexString aJagexString_695 = JagexString.getRs2PreparedString(
			"blaugr-Un:");
	public static JagexString aJagexString_700;
	public static JagexString aJagexString_701 = JagexString.getRs2PreparedString(
			"Passwort: ");
	public static RSInterface aClass4_Sub13_698;
	public static long[] aLongArray699;
	public static int anInt694;
	public static int anInt696;
	public static int[][] anIntArrayArray697;

	static {
		aJagexString_700 = JagexString.getRs2PreparedString(
				"Lade Benutzeroberfl-=che )2 ");
		anIntArrayArray697 = new int[5][5000];
		aBoolean702 = true;
		aLongArray699 = new long[32];
		aBoolean703 = false;
	}

	public static void method882(int arg0, int arg1) {
		try {
			Class4_Sub20_Sub6.aBoolean2914 = false;
			Class4_Sub21.anInt2374 = -1;
			Class4_Sub20_Sub9.anInt3050 = 0;
			Class25.anInt577 = -1;
			Class67.aClass19_1363 = null;
			StreamBuffer.anInt2085 = 1;
			Class4_Sub20_Sub5.anInt2888 = arg0;
			if (arg1 <= 63)
				method883(115);
			anInt694++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jb.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method883(int arg0) {
		try {
			aClass4_Sub13_698 = null;
			anIntArrayArray697 = null;
			aJagexString_695 = null;
			aJagexString_701 = null;
			aJagexString_700 = null;
			if (arg0 == 1)
				aLongArray699 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "jb.B("
					+ arg0 + ')');
		}
	}
}
