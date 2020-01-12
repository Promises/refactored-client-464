package com.jagex.runescape;

public class Class4_Sub17 extends RSFont {
	public static boolean aBoolean2319 = false;
    public static Class19 aClass19_2323;
	public static Class19_Sub1 aClass19_Sub1_2321;
	public static Class19_Sub1 aClass19_Sub1_2327;
	public static int anInt2324;
	public static int anInt2326;
	public static int anInt2329 = 0;
	public static int anInt2330;
	public static int anInt2331;

	public static Class4_Sub20_Sub12_Sub1 method306(int arg0) {
		try {
			anInt2331++;
			if (arg0 != 2640)
				method307(-74);
			Class4_Sub20_Sub12_Sub1 class4_sub20_sub12_sub1 = new Class4_Sub20_Sub12_Sub1();
			class4_sub20_sub12_sub1.anInt3513 = Class4_Sub20_Sub7_Sub5.anIntArray3395[0];
			class4_sub20_sub12_sub1.anInt3511 = Class30.anIntArray650[0];
			class4_sub20_sub12_sub1.anInt3509 = Class53.anInt1080;
			class4_sub20_sub12_sub1.anInt3507 = Class32.anInt696;
			class4_sub20_sub12_sub1.aByteArray3510 = Class4_Sub23.aByteArrayArray2426[0];
			class4_sub20_sub12_sub1.anInt3508 = Class35.anIntArray726[0];
			class4_sub20_sub12_sub1.anInt3514 = Class13_Sub2.anIntArray2480[0];
			class4_sub20_sub12_sub1.anIntArray3512 = Class67.anIntArray1367;
			Class43.method953(true);
			return class4_sub20_sub12_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "qc.A("
					+ arg0 + ')');
		}
	}

	public static void method307(int arg0) {
		try {
			Game.keyStatus = null;
			StringUtilities.aJagexString_2322 = null;
			if (arg0 != 0)
				anInt2329 = 93;
			StringUtilities.aJagexString_2334 = null;
			aClass19_2323 = null;
			StringUtilities.aJagexString_2325 = null;
			aClass19_Sub1_2321 = null;
			StringUtilities.aJagexString_2328 = null;
			aClass19_Sub1_2327 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "qc.C("
					+ arg0 + ')');
		}
	}

	public static void method308(boolean arg0) {
		try {
			Class4_Sub12.aClass66_2123.method1084(0);
			if (arg0 != false)
				method308(false);
			anInt2326++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "qc.B("
					+ arg0 + ')');
		}
	}

	public byte[] aByteArray2332;

	public Class4_Sub17(byte[] arg0) {
		try {
			aByteArray2332 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("qc.<init>(" + (arg0 != null ? "{...}" : "null") + ')'));
		}
	}
}
