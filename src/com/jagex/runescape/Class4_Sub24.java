package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub24 extends RSFont {
	public static Class19_Sub1 aClass19_Sub1_2451;
	public static JagexString aJagexString_2435;
	public static JagexString aJagexString_2442;
	public static JagexString aJagexString_2446 = JagexString.getRs2PreparedString("green:"
    );
	public static JagexString aJagexString_2448;
	public static JagexString aJagexString_2449;
	public static Class35 aClass35_2438;
	public static int anInt2437;
	public static int anInt2439;
	public static int anInt2440;
	public static int anInt2441;
	public static int anInt2445;
	public static int[] anIntArray2450;
	static {
		aJagexString_2442 = aJagexString_2446;
		aJagexString_2435 = aJagexString_2446;
		aClass35_2438 = new Class35();
		aJagexString_2449 = JagexString.getRs2PreparedString(" loggt sich ein)3");
		aJagexString_2448 = JagexString.getRs2PreparedString("null");
	}

	public static void method637(byte arg0) {
		Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method271((byte) -28);
		int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
				-1432215741, 1);
		if (arg0 != 42)
			aJagexString_2448 = null;
		anInt2445++;
		if ((i ^ 0xffffffff) != -1) {
			int i_0_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
					-1432215741, 2);
			if (i_0_ == 0)
				Class48.anIntArray979[JagexException.anInt1726++] = 2047;
			else if ((i_0_ ^ 0xffffffff) == -2) {
				int i_1_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						arg0 + -1432215783, 3);
				Class4_Sub15.localPlayer.method386(false,
						false, i_1_);
				int i_2_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 1);
				if (i_2_ == 1)
					Class48.anIntArray979[JagexException.anInt1726++] = 2047;
			} else if (i_0_ == 2) {
				int i_3_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						arg0 + -1432215783, 3);
				Class4_Sub15.localPlayer.method386(false,
						true, i_3_);
				int i_4_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 3);
				Class4_Sub15.localPlayer.method386(false,
						true, i_4_);
				int i_5_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 1);
				if (i_5_ == 1)
					Class48.anIntArray979[JagexException.anInt1726++] = 2047;
			} else if ((i_0_ ^ 0xffffffff) == -4) {
				Class82.plane = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
						.method266(arg0 ^ ~0x555de096, 2);
				int i_6_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 7);
				int i_7_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 1);
				int i_8_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 7);
				int i_9_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method266(
						-1432215741, 1);
				if ((i_9_ ^ 0xffffffff) == -2)
					Class48.anIntArray979[JagexException.anInt1726++] = 2047;
				Class4_Sub15.localPlayer.method385(i_6_,
						(i_7_ ^ 0xffffffff) == -2, arg0 ^ 0xaa, i_8_);
			}
		}
	}

	public static void method638(int arg0, long arg1) {
		try {
			anInt2441++;
			if (arg0 != 2)
				aJagexString_2449 = null;
			if (arg1 != 0L) {
				for (int i = 0; (JagexString.anInt1827 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
					if ((Class9.aLongArray284[i] ^ 0xffffffffffffffffL) == (arg1 ^ 0xffffffffffffffffL)) {
						Class4_Sub22.anInt2406++;
						JagexString.anInt1827--;
						for (int i_10_ = i; ((i_10_ ^ 0xffffffff) > (JagexString.anInt1827 ^ 0xffffffff)); i_10_++)
							Class9.aLongArray284[i_10_] = Class9.aLongArray284[1 + i_10_];
						Class4_Sub20_Sub1.anInt2718 = Class4_Sub20_Sub10.anInt3053;
						Class66.aClass4_Sub11_Sub1_1328.method264(214, 122);
						Class66.aClass4_Sub11_Sub1_1328.method255(
								arg0 ^ 0xb4951d2, arg1);
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ud.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static JagexString method639(JagexString[] arg0, int arg1) {
		try {
			anInt2439++;
			if ((arg0.length ^ 0xffffffff) > -3)
				throw new IllegalArgumentException();
			if (arg1 != -842)
				return null;
			return Class64.method1065(arg1 ^ ~0x32a, arg0.length, 0, arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ud.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method640(byte arg0) {
		try {
			aClass19_Sub1_2451 = null;
			anIntArray2450 = null;
			aJagexString_2435 = null;
			aJagexString_2442 = null;
			aClass35_2438 = null;
			if (arg0 <= -113) {
				aJagexString_2449 = null;
				aJagexString_2446 = null;
				aJagexString_2448 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ud.A("
					+ arg0 + ')');
		}
	}

	public int anInt2436;

	public int anInt2447;

	public int[] anIntArray2444;

	public int[][] anIntArrayArray2443;

	public Class4_Sub24(int arg0, byte[] arg1) {
		try {
			anInt2436 = arg0;
			Buffer class4_sub11 = new Buffer(arg1);
			anInt2447 = class4_sub11.get();
			anIntArrayArray2443 = new int[anInt2447][];
			anIntArray2444 = new int[anInt2447];
			for (int i = 0; anInt2447 > i; i++)
				anIntArray2444[i] = class4_sub11.get();
			for (int i = 0; anInt2447 > i; i++)
				anIntArrayArray2443[i] = new int[class4_sub11.get()];
			for (int i = 0; (anInt2447 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				for (int i_11_ = 0; i_11_ < anIntArrayArray2443[i].length; i_11_++)
					anIntArrayArray2443[i][i_11_] = class4_sub11.get();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ud.<init>(" + arg0 + ','
							+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}
}
