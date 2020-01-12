package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class4_Sub22 extends RSFont {
	public static boolean aBoolean2400 = false;
	public static JagexString aJagexString_2395 = JagexString.getRs2PreparedString("null"
    );
	public static JagexString aJagexString_2396;
	public static JagexString aJagexString_2403;
	public static JagexString[] aJagexStringArray2387;
	public static GameShell anApplet_Sub1_2401;
	public static int anInt2385;
	public static int anInt2391;
	public static int anInt2392;
	public static int anInt2398;
	public static int anInt2402;
	public static int anInt2405;
	public static int anInt2406;
	static {
		aJagexString_2396 = JagexString.getRs2PreparedString(
				"m-Ochte sich mit Ihnen duellieren)3");
		anApplet_Sub1_2401 = null;
		aJagexString_2403 = JagexString.getRs2PreparedString(" ");
		aJagexStringArray2387 = new JagexString[8];
	}

	public static int method627(int arg0, int arg1, int arg2) {
		try {
			anInt2398++;
			int i = (-128 + (Class57.method1020(-123, 4, 45365 + arg2,
					91923 + arg0) + ((Class57.method1020(arg1 ^ 0x1589, 2, arg2
					- -10294, 37821 + arg0) - 128 >> 1235243393) - -((Class57
					.method1020(arg1 + 5487, 1, arg2, arg0) + -128) >> -1285894558))));
			i = (int) (0.3 * i) - -35;
			if (i < 10)
				i = 10;
			else if (i > 60)
				i = 60;
			if (arg1 != -5606)
				anApplet_Sub1_2401 = null;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("tf.E("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method628(byte arg0) {
		try {
			anInt2391++;
			if (RSInterface.aBoolean2203) {
				Class65.anIntArray1307 = null;
				Class4_Sub20_Sub17.anIntArray3206 = null;
				JagexException.aImageRGBArray1732 = null;
				Class31.aClass4_Sub20_Sub12_Sub1_676 = null;
				Class28.aClass4_Sub20_Sub12_Sub1Array635 = null;
				Class4_Sub20_Sub16.aImageRGB_3177 = null;
				Class59.aClass4_Sub20_Sub12_Sub1Array1174 = null;
				Actor.aClass4_Sub20_Sub12_Sub1_3288 = null;
				Class52.anIntArray1059 = null;
				GameShell.aClass4_Sub20_Sub12_Sub1Array43 = null;
				Class81.aClass4_Sub20_Sub12_Sub1Array1709 = null;
				Class12.aClass4_Sub20_Sub12_Sub1Array359 = null;
				Class65.anIntArray1284 = null;
				Class76.anIntArray1565 = null;
				Class4_Sub24.anIntArray2450 = null;
				Class80.anIntArray1644 = null;
				Class24.aClass4_Sub20_Sub12_Sub1_549 = null;
				Actor.aClass4_Sub20_Sub12_Sub1_3260 = null;
				Class2.anIntArray90 = null;
				Class34.aImageRGB_1760 = null;
				Class32.method882(2, 106);
				Class4_Sub20_Sub7_Sub5.method426(122, true);
				RSInterface.aBoolean2203 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "tf.B("
					+ arg0 + ')');
		}
	}

	public static JagexString method629(byte arg0, StreamBuffer arg1) {
		try {
			anInt2385++;
			if (arg0 != -83)
				aJagexString_2403 = null;
			return Player.method394(32767, arg1, false);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("tf.F("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method630(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		try {
			anInt2405++;
			Class4_Sub1 class4_sub1 = ((Class4_Sub1) Class31.aClass16_671
					.method725((byte) 117, arg4));
			if (arg3 != -29787)
				method627(2, 26, 64);
			if (class4_sub1 == null) {
				class4_sub1 = new Class4_Sub1();
				Class31.aClass16_671.method720(class4_sub1, arg4, false);
			}
			if (class4_sub1.anIntArray1866.length <= arg2) {
				int[] is = new int[1 + arg2];
				int[] is_0_ = new int[1 + arg2];
				for (int i = 0; class4_sub1.anIntArray1866.length > i; i++) {
					is[i] = class4_sub1.anIntArray1866[i];
					is_0_[i] = class4_sub1.anIntArray1858[i];
				}
				for (int i = class4_sub1.anIntArray1866.length; arg2 > i; i++) {
					is[i] = -1;
					is_0_[i] = 0;
				}
				class4_sub1.anIntArray1866 = is;
				class4_sub1.anIntArray1858 = is_0_;
			}
			class4_sub1.anIntArray1866[arg2] = arg1;
			class4_sub1.anIntArray1858[arg2] = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("tf.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ')'));
		}
	}

	public static void method631(boolean arg0) {
		aJagexString_2396 = null;
		aJagexString_2403 = null;
		aJagexString_2395 = null;
		aJagexStringArray2387 = null;
		if (arg0 != true)
			method629((byte) 67, null);
	}

	public Class4_Sub2_Sub3 aClass4_Sub2_Sub3_2390;
	public Class4_Sub2_Sub3 aClass4_Sub2_Sub3_2393;
	public Class4_Sub20_Sub1 aClass4_Sub20_Sub1_2399;
	public int anInt2384;
	public int anInt2386;
	public int anInt2388;
	public int anInt2389;
	public int anInt2394;

	public int anInt2397;

	public int anInt2404;

	public int anInt2407;

	public int anInt2408;

	public int anInt2409;

	public int[] anIntArray2383;

	public void method626(boolean arg0) {
		anInt2392++;
		if (arg0 != false)
			anIntArray2383 = null;
		int i = anInt2404;
		Class4_Sub20_Sub1 class4_sub20_sub1 = aClass4_Sub20_Sub1_2399
				.method325(-126);
		if (class4_sub20_sub1 == null) {
			anInt2388 = 0;
			anInt2384 = 0;
			anIntArray2383 = null;
			anInt2386 = 0;
			anInt2404 = -1;
		} else {
			anInt2404 = class4_sub20_sub1.anInt2756;
			anInt2386 = class4_sub20_sub1.anInt2743 * 128;
			anInt2388 = class4_sub20_sub1.anInt2721;
			anIntArray2383 = class4_sub20_sub1.anIntArray2736;
			anInt2384 = class4_sub20_sub1.anInt2727;
		}
		if (i != anInt2404 && aClass4_Sub2_Sub3_2393 != null) {
			RSFont.aClass4_Sub2_Sub2_139.method122(aClass4_Sub2_Sub3_2393);
			aClass4_Sub2_Sub3_2393 = null;
		}
	}
}
