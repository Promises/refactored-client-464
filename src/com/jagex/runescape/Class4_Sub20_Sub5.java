package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub20_Sub5 extends Class4_Sub20 {
	public static byte[][] aByteArrayArray2887;
	public static Class19 aClass19_2892;
	public static Class4_Sub11_Sub1 aClass4_Sub11_Sub1_2883 = new Class4_Sub11_Sub1(5000);
	public static RSInterface aClass4_Sub13_2882;
	public static Class81 aClass81_2880;
	public static int anInt2867;
	public static int anInt2869;
	public static int anInt2879 = -2;
	public static int anInt2888;
	public static int anInt2889 = 0;


	public static void method362(int arg0) {
		try {
			StringUtilities.aJagexString_2894 = null;
			StringUtilities.aJagexString_2884 = null;
			StringUtilities.aJagexString_2890 = null;
			if (arg0 <= 122)
				method362(27);
			StringUtilities.aJagexStringArray2893 = null;
			aClass4_Sub13_2882 = null;
			StringUtilities.aJagexString_2868 = null;
			aClass4_Sub11_Sub1_2883 = null;
			aByteArrayArray2887 = null;
			StringUtilities.aJagexString_2891 = null;
			StringUtilities.aJagexString_2886 = null;
			aClass19_2892 = null;
			StringUtilities.aJagexString_2873 = null;
			StringUtilities.aJagexString_2885 = null;
			aClass81_2880 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "fd.B("
					+ arg0 + ')');
		}
	}

	public JagexString aJagexString_2878 = StringUtilities.aJagexString_804;
	public JagexString[] aJagexStringArray2877;
	public int anInt2874;
	public int anInt2875 = 0;
	public int anInt2876;
	public int anInt2881;

	public int[] anIntArray2870;

	public int[] anIntArray2872;

	public void method361(int arg0, int arg1, Buffer arg2) {
		anInt2869++;
		if (arg0 != 1) {
			if (arg0 != 2) {
				if (arg0 != 3) {
					if (arg0 == 4)
						anInt2881 = arg2.readInt();
					else if (arg0 == 5) {
						anInt2875 = arg2.readShort();
						anIntArray2870 = new int[anInt2875];
						aJagexStringArray2877 = new JagexString[anInt2875];
						for (int i = 0; (anInt2875 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
							anIntArray2870[i] = arg2.readInt();
							aJagexStringArray2877[i] = arg2.readString();
						}
					} else if ((arg0 ^ 0xffffffff) == -7) {
						anInt2875 = arg2.readShort();
						anIntArray2870 = new int[anInt2875];
						anIntArray2872 = new int[anInt2875];
						for (int i = 0; (i ^ 0xffffffff) > (anInt2875 ^ 0xffffffff); i++) {
							anIntArray2870[i] = arg2.readInt();
							anIntArray2872[i] = arg2.readInt();
						}
					}
				} else
					aJagexString_2878 = arg2.readString();
			} else
				anInt2876 = arg2.get();
		} else
			anInt2874 = arg2.get();
		if (arg1 != -2)
			anInt2879 = 99;
	}

	public void method363(Buffer arg0, boolean arg1) {
		anInt2867++;
		for (;;) {
			int i = arg0.get();
			if (i == 0)
				break;
			method361(i, -2, arg0);
		}
		if (arg1 != false)
			method363(null, false);
	}
}
