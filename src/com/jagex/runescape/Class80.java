package com.jagex.runescape;

public class Class80 {
	public static JagexString aJagexString_1634;
	public static JagexString aJagexString_1635;
	public static JagexString aJagexString_1636;
	public static JagexString aJagexString_1638 = JagexString.getRs2PreparedString(
			"http:)4)4www)3runescape)3com");
	public static JagexString aJagexString_1640;
	public static JagexString aJagexString_1641;
	public static JagexString aJagexString_1642;
	public static JagexString aJagexString_1647;
	public static JagexString aJagexString_1648;
	public static Class66 aClass66_1639;
	public static int anInt1637;
	public static int anInt1643;
	public static int anInt1646;
	public static int anInt1649;
	public static int[] anIntArray1644;
	public static int[] anIntArray1645;
	public static int[][][] anIntArrayArrayArray1650;

	static {
		anInt1637 = 0;
		aJagexString_1641 = JagexString.getRs2PreparedString("<col=ffff00>");
		anInt1646 = 0;
		aJagexString_1642 = JagexString.getRs2PreparedString("M");
		aJagexString_1636 = JagexString.getRs2PreparedString("slide:");
		aJagexString_1640 = aJagexString_1636;
		aJagexString_1635 = aJagexString_1636;
		aJagexString_1634 = JagexString.getRs2PreparedString(
				"nicht hergestellt werden)3");
		anIntArray1645 = new int[128];
		aJagexString_1647 = JagexString.getRs2PreparedString(
				"und loggen sich dann erneut ein)3");
		aJagexString_1648 = JagexString.getRs2PreparedString("null");
		aClass66_1639 = new Class66(30);
		anIntArrayArrayArray1650 = new int[4][13][13];
	}

	public static void method1202(int arg0) {
		try {
			if (arg0 != 128)
				method1204((byte) -18, -34);
			aJagexString_1648 = null;
			aJagexString_1634 = null;
			aJagexString_1638 = null;
			aJagexString_1636 = null;
			anIntArray1644 = null;
			aJagexString_1635 = null;
			anIntArrayArrayArray1650 = null;
			aJagexString_1641 = null;
			aClass66_1639 = null;
			aJagexString_1642 = null;
			anIntArray1645 = null;
			aJagexString_1647 = null;
			aJagexString_1640 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "wb.B("
					+ arg0 + ')');
		}
	}

	public static JagexString method1203(int arg0, int arg1) {
		try {
			anInt1643++;
			if (arg1 >= -18)
				aJagexString_1640 = null;
			return (Class4_Sub24
					.method639(
							(new JagexString[] {
									Class74.method1168(-9,
											arg0 >> -1815177096 & 0xff),
									Class4_Sub20_Sub4.aJagexString_2864,
									Class74.method1168(-63,
											(arg0 & 0xff9b81) >> -1321169712),
									Class4_Sub20_Sub4.aJagexString_2864,
									Class74.method1168(-9,
											(0xff47 & arg0) >> -86774776),
									Class4_Sub20_Sub4.aJagexString_2864,
									Class74.method1168(-97, arg0 & 0xff) }),
							-842));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("wb.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static boolean method1204(byte arg0, int arg1) {
		try {
			if (arg0 != -127)
				aJagexString_1636 = null;
			anInt1649++;
			if (((0x41617635 & arg1) >> 167845054 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("wb.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
