package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub10 extends RSFont {
	public static Class16 aClass16_2045 = new Class16(4096);
	public static ImageRGB[] aImageRGBArray2022;
	public static int anInt2020;
	public static int anInt2021;
	public static int anInt2023;
	public static int anInt2024;
	public static int anInt2025;
	public static int anInt2027;
	public static int anInt2032;
	public static int anInt2038;

	public static void method202(int arg0) {
		aImageRGBArray2022 = null;
		StringUtilities.aJagexString_2049 = null;
		StringUtilities.aJagexString_2048 = null;
		aClass16_2045 = null;
		StringUtilities.aJagexString_2046 = null;
		StringUtilities.aJagexString_2047 = null;
		if (arg0 != 0) {
			method205((byte) -104, 46);
		}
	}

	public static Class4_Sub20_Sub15 method203(int arg0, int arg1) {
		try {
			anInt2020++;
			Class4_Sub20_Sub15 class4_sub20_sub15 = ((Class4_Sub20_Sub15) ItemDefinition.aClass66_3014
					.method1083(arg1, true));
			if (class4_sub20_sub15 != null) {
				return class4_sub20_sub15;
			}
			byte[] is = RSFont.aClass19_158.method746(16, (byte) 119, arg1);
			class4_sub20_sub15 = new Class4_Sub20_Sub15();
			if (is != null) {
				class4_sub20_sub15.method605(new Buffer(is), 4606);
			}
			ItemDefinition.aClass66_3014.method1082(true, arg1,
					class4_sub20_sub15);
			return class4_sub20_sub15;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("kc.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static JagexString method205(byte arg0, int arg1) {
		try {
			anInt2032++;
			JagexString jagexString = new JagexString();
			jagexString.anInt1805 = 0;
			jagexString.aByteArray1803 = new byte[arg1];
			if (arg0 >= -73) {
				return null;
			}
			return jagexString;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("kc.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public Class4_Sub2_Sub3 aClass4_Sub2_Sub3_2028;
	public Class4_Sub23 aClass4_Sub23_2035;
	public Class4_Sub4_Sub1 aClass4_Sub4_Sub1_2031;
	public Class57 aClass57_2036;
	public int anInt2015;
	public int anInt2016;
	public int anInt2017;
	public int anInt2018;
	public int anInt2019;
	public int anInt2026;
	public int anInt2029;
	public int anInt2030;
	public int anInt2033;
	public int anInt2034;
	public int anInt2037;
	public int anInt2039;
	public int anInt2040;

	public int anInt2041;

	public int anInt2042;

	public int anInt2043;

	public int anInt2044;

	public void method204(byte arg0) {
		try {
			anInt2025++;
			aClass4_Sub4_Sub1_2031 = null;
			aClass57_2036 = null;
			if (arg0 != 74) {
				aClass4_Sub23_2035 = null;
			}
			aClass4_Sub2_Sub3_2028 = null;
			aClass4_Sub23_2035 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "kc.D("
					+ arg0 + ')');
		}
	}
}
