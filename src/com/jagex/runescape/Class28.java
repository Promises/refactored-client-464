package com.jagex.runescape;

public class Class28 {
	public static JagexString aJagexString_634 = JagexString.getRs2PreparedString("Hidden"
    );
	public static JagexString aJagexString_638;
	public static RSInterface[][] aClass4_Sub13ArrayArray632;
	public static Class4_Sub20_Sub12_Sub1[] aClass4_Sub20_Sub12_Sub1Array635;
	public static int anInt633 = 0;
	public static int anInt636;
	public static int anInt637;
	public static int anInt640;
	public static short[] aShortArray639 = { -1, -1, -1, -1, -1 };

	static {
		aJagexString_638 = aJagexString_634;
		anInt640 = 0;
	}

	public static int method854(byte arg0, Class19 arg1, Class19 arg2) {
		try {
			anInt637++;
			if (arg0 >= -21)
				aShortArray639 = null;
			int i = 0;
			if (arg1.method744((byte) 127, JagexString.aJagexString_1824,
					Class34.aJagexString_1767))
				i++;
			if (arg2.method744((byte) 126, RSApplet.aJagexString_25,
					Class34.aJagexString_1767))
				i++;
			if (arg2.method744((byte) 6, Class2.aJagexString_92,
					Class34.aJagexString_1767))
				i++;
			if (arg2.method744((byte) 127, Class4_Sub20_Sub11.aJagexString_3090,
					Class34.aJagexString_1767))
				i++;
			if (arg2.method744((byte) 126, Class4_Sub20_Sub17.aJagexString_3214,
					Class34.aJagexString_1767))
				i++;
			if (arg2.method744((byte) 124,
					Class4_Sub20_Sub7_Sub3.aJagexString_3337, Class34.aJagexString_1767))
				i++;
			arg2.method744((byte) -1, Class31.aJagexString_678,
					Class34.aJagexString_1767);
			arg2.method744((byte) 35, RSFont.aJagexString_142,
					Class34.aJagexString_1767);
			arg2.method744((byte) -31, Class12.aJagexString_361,
					Class34.aJagexString_1767);
			arg2.method744((byte) 126, Class11.aJagexString_324,
					Class34.aJagexString_1767);
			arg2.method744((byte) 127, Class63.aJagexString_1250,
					Class34.aJagexString_1767);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ic.B("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method855(int arg0) {
		try {
			aJagexString_638 = null;
			if (arg0 != 16589)
				method855(28);
			aShortArray639 = null;
			aClass4_Sub13ArrayArray632 = null;
			aJagexString_634 = null;
			aClass4_Sub20_Sub12_Sub1Array635 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ic.A("
					+ arg0 + ')');
		}
	}
}
