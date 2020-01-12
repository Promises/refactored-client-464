package com.jagex.runescape;

public class Class4_Sub16 extends RSFont {
	public static Class66 aClass66_2316 = new Class66(64);
	public static int anInt2304;
	public static int anInt2308;
	public static int anInt2309 = -16 + (int) (Math.random() * 33.0);
	public static int anInt2313;
	public static int cameraRandomisationA = 0;

	public static void method302(int arg0) {
		try {
			Class4_Sub20_Sub8.aClass66_3014.method1084(0);
			anInt2313++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "qa.B("
					+ arg0 + ')');
		}
	}

	public static void method303(int arg0, Class19_Sub1 arg1, int arg2,
			Class10 arg3) {
		try {
			anInt2308++;
			byte[] is = null;
			synchronized (Class37.aClass65_766) {
				for (Class4_Sub12 class4_sub12 = ((Class4_Sub12) Class37.aClass65_766
						.method1071(-123)); class4_sub12 != null; class4_sub12 = ((Class4_Sub12) Class37.aClass65_766
						.method1075(18485))) {
					if (arg2 == class4_sub12.aLong150
							&& arg3 == class4_sub12.aClass10_2117
							&& (class4_sub12.anInt2124 ^ 0xffffffff) == -1) {
						is = class4_sub12.aByteArray2122;
						break;
					}
				}
			}
			if (is != null)
				arg1.method762(arg3, arg2, is, true, false);
			else {
				if (arg0 != -6207)
					StringUtilities.aJagexString_2317 = null;
				byte[] is_0_ = arg3.method670(arg2, 255);
				arg1.method762(arg3, arg2, is_0_, true, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("qa.D("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ',' + (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static JagexString method304(int arg0, boolean arg1) {
		try {
			anInt2304++;
			if (arg1 != true)
				method305(false);
			if ((arg0 ^ 0xffffffff) > -1000000000)
				return Class74.method1168(-70, arg0);
			return JagexException.aJagexString_1733;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("qa.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method305(boolean arg0) {
		try {
			if (arg0 != true)
				StringUtilities.aJagexString_2305 = null;
			StringUtilities.aJagexString_2305 = null;
			StringUtilities.aJagexString_2312 = null;
			StringUtilities.aJagexString_2317 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "qa.A("
					+ arg0 + ')');
		}
	}

	public boolean aBoolean2310 = false;

	public int anInt2306;

	public int anInt2311;
}
