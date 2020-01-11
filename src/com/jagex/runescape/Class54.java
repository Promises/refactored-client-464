package com.jagex.runescape;

public class Class54 {
	public static boolean aBoolean1103;
	public static Class19_Sub1 aClass19_Sub1_1107;
	public static JagexString aJagexString_1093;
	public static JagexString aJagexString_1095 = JagexString.getRs2PreparedString(
			"zur-Uck auf die RuneScape)2Webseite gehen");
	public static JagexString aJagexString_1100;
	public static JagexString aJagexString_1101;
	public static JagexString aJagexString_1102;
	public static JagexString aJagexString_1104 = JagexString.getRs2PreparedString(
			"m-Ochte mit Ihnen handeln)3");
	public static JagexString aJagexString_1105;
	public static JagexString aJagexString_1106;
	public static Class4_Sub20_Sub12_Sub2[] aClass4_Sub20_Sub12_Sub2Array1092;
	public static int anInt1091;
	public static int anInt1098;
	public static int anInt1099;
	public static int anInt1108;
	public static int anInt1109;
	static {
		aBoolean1103 = false;
		aJagexString_1102 = JagexString.getRs2PreparedString("Konfig geladen)3");
		aJagexString_1101 = JagexString.getRs2PreparedString("glow3:");
		aJagexString_1106 = aJagexString_1101;
		aJagexString_1105 = JagexString.getRs2PreparedString(" has logged out)3");
		aJagexString_1093 = aJagexString_1101;
		aJagexString_1100 = aJagexString_1105;
		anInt1109 = 0;
	}

	public static int method1011(RSInterface arg0, int arg1) {
		try {
			Class4_Sub15 class4_sub15 = ((Class4_Sub15) Class64.aClass16_1259
					.method725(
							(byte) 117,
							(((long) arg0.anInt2172 << 1345088992) + arg0.anInt2163)));
			if (arg1 != -22389)
				method1011(null, -114);
			anInt1108++;
			if (class4_sub15 != null)
				return class4_sub15.anInt2299;
			return arg0.anInt2246;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("pa.A("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static RSInterface method1012(int arg0, int arg1, int arg2) {
		try {
			anInt1098++;
			RSInterface class4_sub13 = Class4_Sub20.method322(true, arg0);
			if (arg1 == arg2)
				return class4_sub13;
			if (class4_sub13 == null
					|| class4_sub13.aClass4_Sub13Array2215 == null
					|| class4_sub13.aClass4_Sub13Array2215.length <= arg2)
				return null;
			return class4_sub13.aClass4_Sub13Array2215[arg2];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("pa.C("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method1013(int arg0) {
		try {
			aClass19_Sub1_1107 = null;
			aJagexString_1106 = null;
			aJagexString_1104 = null;
			aClass4_Sub20_Sub12_Sub2Array1092 = null;
			aJagexString_1100 = null;
			aJagexString_1095 = null;
			aJagexString_1101 = null;
			aJagexString_1093 = null;
			aJagexString_1102 = null;
			aJagexString_1105 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "pa.B("
					+ arg0 + ')');
		}
	}

	public int anInt1094;

	public int anInt1096;

	public int anInt1097;
}
