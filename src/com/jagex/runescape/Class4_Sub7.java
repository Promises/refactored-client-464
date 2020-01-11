package com.jagex.runescape;

public class Class4_Sub7 extends RSFont {
	public static Class19 aClass19_1956;
	public static JagexString aJagexString_1948;
	public static JagexString aJagexString_1957;
	public static JagexString aJagexString_1960 = JagexString.getRs2PreparedString(
			"skill)2");
	public static JagexString aJagexString_1964 = JagexString.getRs2PreparedString(
			"b12_full");
	public static JagexString aJagexString_1965;
	public static int anInt1944 = 0;
	public static int anInt1945;
	public static int anInt1963;
	public static int[] anIntArray1947 = { 0, 1, 2, 3 };
	static {
		aJagexString_1948 = aJagexString_1960;
		aJagexString_1957 = JagexString.getRs2PreparedString(" (X");
		aJagexString_1965 = JagexString.getRs2PreparedString(
				"RuneScape wurde aktualisiert(Q");
	}

	public static Class4_Sub20_Sub4 method187(int arg0, int arg1) {
		try {
			anInt1963++;
			Class4_Sub20_Sub4 class4_sub20_sub4 = ((Class4_Sub20_Sub4) Class8.aClass66_259
					.method1083(arg0, true));
			if (class4_sub20_sub4 != null)
				return class4_sub20_sub4;
			byte[] is = Class65.aClass19_1312.method746(14, (byte) 95, arg0);
			if (arg1 <= 64)
				aJagexString_1965 = null;
			class4_sub20_sub4 = new Class4_Sub20_Sub4();
			if (is != null)
				class4_sub20_sub4.method358(-1, new StreamBuffer(is));
			Class8.aClass66_259.method1082(true, arg0, class4_sub20_sub4);
			return class4_sub20_sub4;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("g.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method188(int arg0) {
		try {
			aClass19_1956 = null;
			if (arg0 != 1)
				aJagexString_1965 = null;
			aJagexString_1965 = null;
			aJagexString_1960 = null;
			aJagexString_1957 = null;
			aJagexString_1964 = null;
			anIntArray1947 = null;
			aJagexString_1948 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "g.B("
					+ arg0 + ')');
		}
	}

	public int anInt1946;
	public int anInt1949;
	public int anInt1950;
	public int anInt1951;
	public int anInt1952;
	public int anInt1953;
	public int anInt1954 = -1;
	public int anInt1955;
	public int anInt1958;

	public int anInt1959;

	public int anInt1961;

	public int anInt1962;

	public Class4_Sub7() {
		anInt1952 = 0;
	}
}
