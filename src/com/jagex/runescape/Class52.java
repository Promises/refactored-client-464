package com.jagex.runescape;

import com.jagex.runescape.util.Signlink;

public class Class52 {
	public static JagexString aJagexString_1051;
	public static JagexString aJagexString_1054;
	public static JagexString aJagexString_1055;
	public static JagexString aJagexString_1057 = JagexString.getRs2PreparedString(
			"headicons_pk");
	public static JagexString aJagexString_1060 = JagexString.getRs2PreparedString(
			"Error connecting to server)3");
	public static JagexString aJagexString_1061;
	public static JagexString aJagexString_1063;
	public static JagexString aJagexString_1065;
	public static JagexString aJagexString_1066;
	public static int anInt1050;
	public static int anInt1052;
	public static int anInt1056;
	public static int anInt1058;
	public static int anInt1062;
	public static int anInt1064;
	public static int[] anIntArray1059;

	static {
		anInt1052 = 0;
		aJagexString_1051 = aJagexString_1060;
		aJagexString_1063 = JagexString.getRs2PreparedString(
				"and choose the (Wcreate account(W");
		GameShell.eventMouseButtonPressed = 0;
		aJagexString_1065 = (JagexString.getRs2PreparedString(
				"You need a members account to login to this world)3"));
		aJagexString_1054 = aJagexString_1063;
		aJagexString_1055 = aJagexString_1065;
		aJagexString_1066 = JagexString.getRs2PreparedString("Loaded sprites");
		aJagexString_1061 = aJagexString_1066;
	}

	public static void method1000(int arg0, byte arg1, int arg2, int arg3) {
		if (arg1 != 6)
			method1003(-113, 7);
		for (int i = 0; (i ^ 0xffffffff) > -9; i++) {
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -9; i_0_++)
				Class4_Sub23.anIntArrayArrayArray2416[arg0][arg3 - -i][i_0_
						+ arg2] = 0;
		}
		if (arg3 > 0) {
			for (int i = 1; i < 8; i++)
				Class4_Sub23.anIntArrayArrayArray2416[arg0][arg3][i + arg2] = (Class4_Sub23.anIntArrayArrayArray2416[arg0][-1
						+ arg3][arg2 + i]);
		}
		anInt1062++;
		if ((arg2 ^ 0xffffffff) < -1) {
			for (int i = 1; (i ^ 0xffffffff) > -9; i++)
				Class4_Sub23.anIntArrayArrayArray2416[arg0][i + arg3][arg2] = (Class4_Sub23.anIntArrayArrayArray2416[arg0][i
						+ arg3][arg2 - 1]);
		}
		if ((arg3 ^ 0xffffffff) < -1
				&& (Class4_Sub23.anIntArrayArrayArray2416[arg0][arg3 + -1][arg2] != 0))
			Class4_Sub23.anIntArrayArrayArray2416[arg0][arg3][arg2] = Class4_Sub23.anIntArrayArrayArray2416[arg0][-1
					+ arg3][arg2];
		else if ((arg2 ^ 0xffffffff) >= -1
				|| ((Class4_Sub23.anIntArrayArrayArray2416[arg0][arg3][arg2
						+ -1]) ^ 0xffffffff) == -1) {
			if ((arg3 ^ 0xffffffff) < -1
					&& (arg2 ^ 0xffffffff) < -1
					&& ((Class4_Sub23.anIntArrayArrayArray2416[arg0][-1 + arg3][arg2
							+ -1]) ^ 0xffffffff) != -1)
				Class4_Sub23.anIntArrayArrayArray2416[arg0][arg3][arg2] = (Class4_Sub23.anIntArrayArrayArray2416[arg0][arg3
						+ -1][-1 + arg2]);
		} else
			Class4_Sub23.anIntArrayArrayArray2416[arg0][arg3][arg2] = Class4_Sub23.anIntArrayArrayArray2416[arg0][arg3][-1
					+ arg2];
	}

	public static void method1001(byte arg0) {
		try {
			if (arg0 >= -2)
				method1004(true);
			anInt1050++;
			if (Signlink.jVendor.toLowerCase().indexOf("microsoft") == -1) {
				Class14.anIntArray392[46] = 72;
				Class14.anIntArray392[61] = 27;
				Class14.anIntArray392[44] = 71;
				Class14.anIntArray392[47] = 73;
				Class14.anIntArray392[92] = 74;
				Class14.anIntArray392[59] = 57;
				Class14.anIntArray392[45] = 26;
				Class14.anIntArray392[91] = 42;
				Class14.anIntArray392[93] = 43;
				if (Signlink.aMethod1537 == null) {
					Class14.anIntArray392[192] = 58;
					Class14.anIntArray392[222] = 59;
				} else {
					Class14.anIntArray392[222] = 58;
					Class14.anIntArray392[192] = 28;
					Class14.anIntArray392[520] = 59;
				}
			} else {
				Class14.anIntArray392[189] = 26;
				Class14.anIntArray392[220] = 74;
				Class14.anIntArray392[186] = 57;
				Class14.anIntArray392[190] = 72;
				Class14.anIntArray392[222] = 59;
				Class14.anIntArray392[219] = 42;
				Class14.anIntArray392[221] = 43;
				Class14.anIntArray392[188] = 71;
				Class14.anIntArray392[191] = 73;
				Class14.anIntArray392[192] = 58;
				Class14.anIntArray392[223] = 28;
				Class14.anIntArray392[187] = 27;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "oe.D("
					+ arg0 + ')');
		}
	}

	public static synchronized long method1002(byte arg0) {
		try {
			anInt1064++;
			long l = System.currentTimeMillis();
			if (arg0 != -42)
				method1002((byte) -124);
			if ((l ^ 0xffffffffffffffffL) > (Class4_Sub20_Sub7_Sub3.aLong3335 ^ 0xffffffffffffffffL))
				Class2.aLong82 += Class4_Sub20_Sub7_Sub3.aLong3335 + -l;
			Class4_Sub20_Sub7_Sub3.aLong3335 = l;
			return l + Class2.aLong82;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "oe.B("
					+ arg0 + ')');
		}
	}

	public static void method1003(int arg0, int arg1) {
		try {
			anInt1056++;
			if ((arg1 ^ 0xffffffff) != 0 && Class72.aBooleanArray1487[arg1]) {
				Class9.aClass19_275.method755(-91, arg1);
				if (Class28.aClass4_Sub13ArrayArray632[arg1] != null) {
					boolean bool = true;
					for (int i = 0; Class28.aClass4_Sub13ArrayArray632[arg1].length > i; i++) {
						if (Class28.aClass4_Sub13ArrayArray632[arg1][i] != null) {
							if (((Class28.aClass4_Sub13ArrayArray632[arg1][i].anInt2258) ^ 0xffffffff) != -3)
								Class28.aClass4_Sub13ArrayArray632[arg1][i] = null;
							else
								bool = false;
						}
					}
					if (arg0 >= -113)
						aJagexString_1063 = null;
					if (bool)
						Class28.aClass4_Sub13ArrayArray632[arg1] = null;
					Class72.aBooleanArray1487[arg1] = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("oe.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method1004(boolean arg0) {
		try {
			aJagexString_1055 = null;
			aJagexString_1054 = null;
			if (arg0 == false) {
				aJagexString_1063 = null;
				aJagexString_1065 = null;
				aJagexString_1051 = null;
				aJagexString_1061 = null;
				aJagexString_1060 = null;
				anIntArray1059 = null;
				aJagexString_1066 = null;
				aJagexString_1057 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "oe.A("
					+ arg0 + ')');
		}
	}
}
