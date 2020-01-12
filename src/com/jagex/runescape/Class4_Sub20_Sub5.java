package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub20_Sub5 extends Class4_Sub20 {
	public static byte[][] aByteArrayArray2887;
	public static Class19 aClass19_2892;
	public static JagexString aJagexString_2868;
	public static JagexString aJagexString_2871;
	public static JagexString aJagexString_2873 = JagexString.getRs2PreparedString("gr-Un:"
    );
	public static JagexString aJagexString_2884;
	public static JagexString aJagexString_2885;
	public static JagexString aJagexString_2886;
	public static JagexString aJagexString_2890;
	public static JagexString aJagexString_2891;
	public static JagexString aJagexString_2894;
	public static JagexString[] aJagexStringArray2893;
	public static Class4_Sub11_Sub1 aClass4_Sub11_Sub1_2883;
	public static RSInterface aClass4_Sub13_2882;
	public static Class81 aClass81_2880;
	public static int anInt2867;
	public static int anInt2869;
	public static int anInt2879;
	public static int anInt2888;
	public static int anInt2889;
	static {
		aJagexString_2871 = JagexString.getRs2PreparedString("Loading fonts )2 ");
		aJagexString_2868 = JagexString.getRs2PreparedString("headicons_prayer");
		anInt2879 = -2;
		aJagexString_2884 = aJagexString_2871;
		aJagexString_2885 = (JagexString.getRs2PreparedString(
				"Ung-Ultige Verbindung mit einem Anmelde)2Server)3"));
		aClass4_Sub11_Sub1_2883 = new Class4_Sub11_Sub1(5000);
		aJagexString_2886 = JagexString.getRs2PreparedString("::fpson");
		anInt2889 = 0;
		aJagexString_2891 = JagexString.getRs2PreparedString(" )2> <col=00ffff>");
		aJagexString_2890 = JagexString.getRs2PreparedString(
				"Anmelde)2Limit -Uberschritten)3");
		aJagexString_2894 = JagexString.getRs2PreparedString("Ung-Ultige Session)2ID)3"
        );
		aJagexStringArray2893 = new JagexString[200];
	}

	public static void method362(int arg0) {
		try {
			aJagexString_2894 = null;
			aJagexString_2884 = null;
			aJagexString_2890 = null;
			if (arg0 <= 122)
				method362(27);
			aJagexStringArray2893 = null;
			aClass4_Sub13_2882 = null;
			aJagexString_2868 = null;
			aClass4_Sub11_Sub1_2883 = null;
			aByteArrayArray2887 = null;
			aJagexString_2871 = null;
			aJagexString_2891 = null;
			aJagexString_2886 = null;
			aClass19_2892 = null;
			aJagexString_2873 = null;
			aJagexString_2885 = null;
			aClass81_2880 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "fd.B("
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
						anInt2881 = arg2.read_32((byte) 73);
					else if (arg0 == 5) {
						anInt2875 = arg2.read_u16();
						anIntArray2870 = new int[anInt2875];
						aJagexStringArray2877 = new JagexString[anInt2875];
						for (int i = 0; (anInt2875 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
							anIntArray2870[i] = arg2.read_32((byte) 73);
							aJagexStringArray2877[i] = arg2.method212();
						}
					} else if ((arg0 ^ 0xffffffff) == -7) {
						anInt2875 = arg2.read_u16();
						anIntArray2870 = new int[anInt2875];
						anIntArray2872 = new int[anInt2875];
						for (int i = 0; (i ^ 0xffffffff) > (anInt2875 ^ 0xffffffff); i++) {
							anIntArray2870[i] = arg2.read_32((byte) 73);
							anIntArray2872[i] = arg2.read_32((byte) 73);
						}
					}
				} else
					aJagexString_2878 = arg2.method212();
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
