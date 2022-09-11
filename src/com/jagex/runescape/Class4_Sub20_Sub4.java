package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub20_Sub4 extends Class4_Sub20 {
	public static volatile boolean aBoolean2849 = true;
	public static boolean aBoolean2857;
	public static byte[][][] aByteArrayArrayArray2861;
	public static Class66 aClass66_2848 = new Class66(50);
	public static int anInt2843;
	public static int anInt2844;
	public static int anInt2845;
	public static int anInt2847;
	public static int anInt2850;
	public static int anInt2856;
	public static int anInt2858 = 1;
	public static short[] aShortArray2859 = { 6798, 8741, 25238, 4626, 4550 };


	public static Class4_Sub20_Sub12_Sub4_Sub1 method357(Class19 arg0,
			int arg1, Class19 arg2, int arg3, int arg4) {
		try {
			anInt2850++;
			if (!Class4_Sub20_Sub14.method594(-30384, arg4, arg3, arg2))
				return null;
			if (arg1 != 4550)
				method359(null, -77, 57, 47, -70, (byte) 57, null);
			return Class4_Sub2_Sub4.method170(-21408,
					arg0.method746(arg3, (byte) 126, arg4));
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("de.B("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ arg4 + ')'));
		}
	}

	public static void method359(JagexString arg0, int arg1, int arg2, int arg3,
                                 int arg4, byte arg5, JagexString arg6) {
		do {
			try {
				anInt2843++;
				if (!Class4_Sub20_Sub16.aBoolean3169) {
					if ((ItemDefinition.anInt2980 ^ 0xffffffff) > -501) {
						ItemDefinition.aJagexStringArray2957[(ItemDefinition.anInt2980)] = arg6;
						Class18.aJagexStringArray462[ItemDefinition.anInt2980] = arg0;
						Class82.anIntArray1712[ItemDefinition.anInt2980] = arg3;
						Class4_Sub1.anIntArray1862[ItemDefinition.anInt2980] = arg4;
						Class43.anIntArray885[ItemDefinition.anInt2980] = arg2;
						Class40.anIntArray789[ItemDefinition.anInt2980] = arg1;
						ItemDefinition.anInt2980++;
					}
					if (arg5 > 16)
						break;
					aBoolean2849 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw JagexException.create(runtimeexception,
						("de.C(" + (arg0 != null ? "{...}" : "null") + ','
								+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
								+ ',' + arg5 + ','
								+ (arg6 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method360(int arg0) {
		try {
			aClass66_2848 = null;
			StringUtilities.aJagexString_2853 = null;
			aShortArray2859 = null;
			StringUtilities.aJagexString_2860 = null;
			StringUtilities.aJagexString_2854 = null;
			aByteArrayArrayArray2861 = null;
			StringUtilities.aJagexString_2852 = null;
			StringUtilities.aJagexString_2864 = null;
			StringUtilities.aJagexString_2855 = null;
			if (arg0 > -117)
				method359(null, -107, -22, -53, -121, (byte) -80, null);
			StringUtilities.aJagexString_2866 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "de.A("
					+ arg0 + ')');
		}
	}

	public int anInt2846;

	public int anInt2862;

	public int anInt2865;

	public void method356(int arg0, Buffer arg1, int arg2) {
		anInt2856++;
		if (arg2 == (arg0 ^ 0xffffffff)) {
			anInt2862 = arg1.readShort();
			anInt2865 = arg1.get();
			anInt2846 = arg1.get();
		}
	}

	public void method358(int arg0, Buffer arg1) {
		for (;;) {
			int i = arg1.get();
			if ((i ^ 0xffffffff) == -1)
				break;
			method356(i, arg1, -2);
		}
		anInt2845++;
		if (arg0 != -1)
			method357(null, 101, null, -10, 98);
	}
}
