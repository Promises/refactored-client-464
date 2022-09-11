package com.jagex.runescape;

public class Class4_Sub21 extends RSFont {
	public static byte[] aByteArray2367 = { 95, 97, 98, 99, 100, 101, 102, 103,
			104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116,
			117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56,
			57 };
	public static JagexString aJagexString_2366 = JagexString.getRs2PreparedString(
			"Das ist eine Mitglieder)2Welt(Q");
	public static JagexString garbageCollection;
	public static JagexString aJagexString_2371 = JagexString.getRs2PreparedString("wave2:"
	);
	public static JagexString aJagexString_2372;
	public static JagexString aJagexString_2375 = aJagexString_2371;
	public static JagexString aJagexString_2376;
	public static JagexString aJagexString_2377;
	public static ImageRGB aImageRGB_2368;
	public static ImageRGB[] aImageRGBArray2378;
	public static int anInt2365;
	public static int anInt2369;
	public static int anInt2374;
	public static volatile int idleTime;
	public static int anInt2380 = 0;
	public static int anInt2381;
	public static int anInt2382;
	public static int[] anIntArray2373;
	static {
		aJagexString_2377 = aJagexString_2371;
		garbageCollection = JagexString.getRs2PreparedString("::gc");
		aJagexString_2376 = (JagexString.getRs2PreparedString(
				"Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie"));
		aJagexString_2372 = JagexString.getRs2PreparedString("null");
		idleTime = 0;
	}

	public static Object method623(byte[] arg0, boolean arg1, byte arg2) {
		try {
			anInt2381++;
			if (arg2 != 75)
				return null;
			if (arg0 == null)
				return null;
			if (arg0.length > 136 && !Class57.aBoolean1127) {
				try {
					Class45 class45 = new Class45_Sub1();
					class45.method970(arg2 ^ ~0x1a, arg0);
					return class45;
				} catch (Throwable throwable) {
					Class57.aBoolean1127 = true;
				}
			}
			if (arg1)
				return Class47.method982(-24158, arg0);
			return arg0;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("t.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public static void method624(byte arg0) {
		try {
			aJagexString_2366 = null;
			anIntArray2373 = null;
			aJagexString_2377 = null;
			aJagexString_2375 = null;
			aJagexString_2372 = null;
			aJagexString_2376 = null;
			aByteArray2367 = null;
			if (arg0 == 95) {
				aJagexString_2371 = null;
				garbageCollection = null;
				aImageRGBArray2378 = null;
				aImageRGB_2368 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "t.A("
					+ arg0 + ')');
		}
	}

	public static ImageRGB[] method625(JagexString arg0,
                                       Class19 arg1, JagexString arg2, boolean arg3) {
		try {
			int i = arg1.method754(arg0, 1);
			if (arg3 != true)
				aByteArray2367 = null;
			anInt2382++;
			int i_0_ = arg1.method747(!arg3, arg2, i);
			return Class4_Sub20_Sub7.method376(i, i_0_, arg1, 0);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("t.B("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public JagexString aJagexString_2364;
}
