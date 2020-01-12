package com.jagex.runescape;

public class Class4_Sub8 extends RSFont {
	public static JagexString aJagexString_1966;
	public static JagexString aJagexString_1968 = JagexString.getRs2PreparedString(
			"Select a world");
	public static JagexString aJagexString_1970;
	public static JagexString aJagexString_1971;
	public static JagexString aJagexString_1974;
	public static JagexString aJagexString_1976;
	public static JagexString aJagexString_1977;
	public static Class66 aClass66_1972;
	public static int anInt1967;
	public static int anInt1978;
	public static int[] minimapHintY;
	public static int[] anIntArray1980;
	static {
		aJagexString_1966 = JagexString.getRs2PreparedString("Freie Welt");
		aJagexString_1970 = JagexString.getRs2PreparedString("Username: ");
		aJagexString_1971 = JagexString.getRs2PreparedString("<col=ffffff>");
		minimapHintY = new int[1000];
		aJagexString_1976 = JagexString.getRs2PreparedString("Hierhin gehen");
		aJagexString_1974 = aJagexString_1968;
		aJagexString_1977 = aJagexString_1970;
		aClass66_1972 = new Class66(30);
		anIntArray1980 = new int[128];
	}

	public static void method189(int arg0, int arg1) {
		try {
			anInt1978++;
			if (arg0 > -117)
				method190(53);
			if (Class13_Sub2.aClass4_Sub8Array2482 != null
					&& (arg1 ^ 0xffffffff) <= -1
					&& Class13_Sub2.aClass4_Sub8Array2482.length > arg1
					&& Class13_Sub2.aClass4_Sub8Array2482[arg1] != null) {
				Class66.aClass4_Sub11_Sub1_1328.method264(161, -30);
				Class9.anInt276++;
				Class66.aClass4_Sub11_Sub1_1328.method255(189354448,
						Class13_Sub2.aClass4_Sub8Array2482[arg1].aLong150);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("hb.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method190(int arg0) {
		try {
			aJagexString_1966 = null;
			anIntArray1980 = null;
			aJagexString_1974 = null;
			aClass66_1972 = null;
			aJagexString_1976 = null;
			aJagexString_1977 = null;
			aJagexString_1968 = null;
			aJagexString_1971 = null;
			minimapHintY = null;
			if (arg0 != 30)
				method190(92);
			aJagexString_1970 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "hb.B("
					+ arg0 + ')');
		}
	}

	public byte aByte1973;

	public JagexString aJagexString_1975;

	public int anInt1969;
}
