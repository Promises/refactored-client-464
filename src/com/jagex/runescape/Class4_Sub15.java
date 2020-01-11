package com.jagex.runescape;

public class Class4_Sub15 extends RSFont {
	public static JagexString aJagexString_2291;
	public static JagexString aJagexString_2292 = JagexString.getRs2PreparedString(
			"oder ung-Ultiges Passwort)3");
	public static JagexString aJagexString_2294;
	public static RSInterface aClass4_Sub13_2301;
	public static Class4_Sub20_Sub12_Sub4_Sub1 aClass4_Sub20_Sub12_Sub4_Sub1_2289;
	public static Class4_Sub20_Sub7_Sub1_Sub1 aClass4_Sub20_Sub7_Sub1_Sub1_2302;
	public static int anInt2293;
	public static int anInt2296;
	public static int anInt2297;
	public static int anInt2298;
	public static int anInt2300;
	public static int anInt2303;
	public static int[] anIntArray2290;
	public static int[] anIntArray2295;
	static {
		aJagexString_2291 = JagexString.getRs2PreparedString("Verbindung abgebrochen)3"
        );
		anIntArray2295 = new int[5];
		aJagexString_2294 = JagexString.getRs2PreparedString("Fertigkeit)2");
		aClass4_Sub13_2301 = null;
	}

	public static JagexString method298(int arg0, boolean arg1) {
		try {
			anInt2300++;
			if (arg1 != true)
				aClass4_Sub20_Sub12_Sub4_Sub1_2289 = null;
			if ((Class18.aJagexStringArray462[arg0].method825(-100) ^ 0xffffffff) < -1)
				return Class4_Sub24.method639(
						(new JagexString[] {
								(Class4_Sub20_Sub8.aJagexStringArray2957[arg0]),
								Class46.aJagexString_942,
								(Class18.aJagexStringArray462[arg0]) }), -842);
			return Class4_Sub20_Sub8.aJagexStringArray2957[arg0];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("pd.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method299(int arg0) {
		try {
			if (arg0 < 74)
				aClass4_Sub20_Sub7_Sub1_Sub1_2302 = null;
			aClass4_Sub20_Sub12_Sub4_Sub1_2289 = null;
			anIntArray2295 = null;
			aJagexString_2292 = null;
			aJagexString_2291 = null;
			aClass4_Sub13_2301 = null;
			anIntArray2290 = null;
			aClass4_Sub20_Sub7_Sub1_Sub1_2302 = null;
			aJagexString_2294 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "pd.B("
					+ arg0 + ')');
		}
	}

	public static int method300(int arg0, byte arg1, int arg2) {
		try {
			anInt2297++;
			if ((arg0 ^ 0xffffffff) == 1)
				return 12345678;
			if ((arg0 ^ 0xffffffff) == 0) {
				if ((arg2 ^ 0xffffffff) <= -1) {
					if (arg2 > 127)
						arg2 = 127;
				} else
					arg2 = 0;
				arg2 = -arg2 + 127;
				return arg2;
			}
			arg2 = arg2 * (arg0 & 0x7f) / 128;
			if (arg1 != 96)
				return 77;
			if (arg2 >= 2) {
				if (arg2 > 126)
					arg2 = 126;
			} else
				arg2 = 2;
			return arg2 + (arg0 & 0xff80);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("pd.D("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static int method301(int arg0, int arg1, int arg2, int arg3) {
		try {
			anInt2303++;
			if (arg1 != (Class46.landscapeData[arg2][arg0][arg3] & 0x8))
				return 0;
			if ((arg2 ^ 0xffffffff) < -1
					&& (0x2 & Class46.landscapeData[1][arg0][arg3] ^ 0xffffffff) != -1)
				return arg2 + -1;
			return arg2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("pd.A("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public int anInt2299;

	public Class4_Sub15() {
		/* empty */
	}

	public Class4_Sub15(int arg0) {
		try {
			anInt2299 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"pd.<init>(" + arg0 + ')');
		}
	}
}
