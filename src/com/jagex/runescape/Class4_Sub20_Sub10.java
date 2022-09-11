package com.jagex.runescape;

public class Class4_Sub20_Sub10 extends Class4_Sub20 {
	public static byte[][][] aByteArrayArrayArray3054;
	public static byte[][][] aByteArrayArrayArray3065;
	public static Class19 aClass19_3062;
	public static RSInterface aClass4_Sub13_3064;
	public static long aLong3063 = 0L;
	public static int anInt3053 = 1;
	public static int anInt3055 = 0;
	public static int anInt3057 = 0;
	public static int anInt3060 = 0;
	public static int anInt3066 = 0;
	public static int anInt3068;

	public static void method482(boolean arg0, long arg1) {
		do {
			try {
				anInt3068++;
				if (arg1 != 0L) {
					Class66.aClass4_Sub11_Sub1_1328.method264(218, 125);
					Class66.aClass4_Sub11_Sub1_1328.method255(189354448, arg1);
					Class43.anInt859++;
					if (arg0 == true)
						break;
					anInt3053 = -61;
				}
			} catch (RuntimeException runtimeexception) {
				throw JagexException.create(runtimeexception,
						("ma.B(" + arg0 + ',' + arg1 + ')'));
			}
			break;
		} while (false);
	}

	public static void method483(byte arg0) {
		try {
			aClass19_3062 = null;
			StringUtilities.aJagexString_3071 = null;
			aByteArrayArrayArray3065 = null;
			StringUtilities.aJagexString_3069 = null;
			StringUtilities.aJagexString_3067 = null;
			aClass4_Sub13_3064 = null;
			if (arg0 >= -40)
				method482(true, -36L);
			StringUtilities.aJagexString_3072 = null;
			StringUtilities.aJagexString_3056 = null;
			aByteArrayArrayArray3054 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "ma.A("
					+ arg0 + ')');
		}
	}

	public byte aByte3052;

	public Class19_Sub1 aClass19_Sub1_3061;

	public int anInt3070;
}
