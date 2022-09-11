package com.jagex.runescape;

public class Class28 {
	public static RSInterface[][] aClass4_Sub13ArrayArray632;
	public static Class4_Sub20_Sub12_Sub1[] aClass4_Sub20_Sub12_Sub1Array635;
	public static int anInt633 = 0;
	public static int anInt636;
	public static int anInt637;
	public static int anInt640 = 0;
	public static short[] aShortArray639 = { -1, -1, -1, -1, -1 };

	public static int method854(byte arg0, Class19 arg1, Class19 arg2) {
		try {
			anInt637++;
			if (arg0 >= -21) {
				aShortArray639 = null;
			}
			int i = 0;
			if (arg1.method744((byte) 127, JagexString.aJagexString_1824,
					StringUtilities.aJagexString_1767)) {
				i++;
			}
			if (arg2.method744((byte) 126, GameShell.aJagexString_25,
					StringUtilities.aJagexString_1767)) {
				i++;
			}
			if (arg2.method744((byte) 6, StringUtilities.aJagexString_92,
					StringUtilities.aJagexString_1767)) {
				i++;
			}
			if (arg2.method744((byte) 127, StringUtilities.aJagexString_3090,
					StringUtilities.aJagexString_1767)) {
				i++;
			}
			if (arg2.method744((byte) 126, StringUtilities.aJagexString_3214,
					StringUtilities.aJagexString_1767)) {
				i++;
			}
			if (arg2.method744((byte) 124,
					StringUtilities.aJagexString_3337, StringUtilities.aJagexString_1767)) {
				i++;
			}
			arg2.method744((byte) -1, StringUtilities.aJagexString_678,
					StringUtilities.aJagexString_1767);
			arg2.method744((byte) 35, RSFont.aJagexString_142,
					StringUtilities.aJagexString_1767);
			arg2.method744((byte) -31, StringUtilities.aJagexString_361,
					StringUtilities.aJagexString_1767);
			arg2.method744((byte) 126, StringUtilities.aJagexString_324,
					StringUtilities.aJagexString_1767);
			arg2.method744((byte) 127, Class63.aJagexString_1250,
					StringUtilities.aJagexString_1767);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("ic.B("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method855(int arg0) {
		try {
			StringUtilities.hidden = null;
			if (arg0 != 16589) {
				method855(28);
			}
			aShortArray639 = null;
			aClass4_Sub13ArrayArray632 = null;
			aClass4_Sub20_Sub12_Sub1Array635 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "ic.A("
					+ arg0 + ')');
		}
	}
}
