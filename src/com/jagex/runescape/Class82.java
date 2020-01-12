package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class82 {
	public static JagexString aJagexString_1713;
	public static JagexString aJagexString_1714;
	public static JagexString aJagexString_1717;
	public static JagexString aJagexString_1719 = JagexString.getRs2PreparedString("Nehmen"
    );
	public static JagexString aJagexString_1721;
	public static JagexString aJagexString_1724;
	public static int plane;
	public static int anInt1715;
	public static int anInt1716;
	public static int anInt1718;
	public static int anInt1720;
	public static int anInt1722;
	public static int anInt1723;
	public static int[] anIntArray1712;

	static {
		aJagexString_1714 = null;
		aJagexString_1717 = JagexString.getRs2PreparedString("Fps:");
		aJagexString_1721 = JagexString.getRs2PreparedString("Cancel");
		anIntArray1712 = new int[500];
		aJagexString_1713 = aJagexString_1721;
		aJagexString_1724 = JagexString.getRs2PreparedString("<col=ffff00>");
	}

	public static void method1213(byte arg0) {
		try {
			if (arg0 > -65)
				aJagexString_1719 = null;
			anInt1720++;
			Class8.aClass65_252 = new Class65();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "wd.A("
					+ arg0 + ')');
		}
	}

	public static void method1214(byte arg0) {
		try {
			anIntArray1712 = null;
			aJagexString_1717 = null;
			aJagexString_1724 = null;
			aJagexString_1714 = null;
			if (arg0 < 13)
				method1215(false, 70);
			aJagexString_1719 = null;
			aJagexString_1721 = null;
			aJagexString_1713 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "wd.D("
					+ arg0 + ')');
		}
	}

	public static boolean method1215(boolean arg0, int arg1) {
		try {
			anInt1723++;
			if ((arg1 ^ 0xffffffff) > -33)
				return false;
			if ((arg1 ^ 0xffffffff) == -128)
				return false;
			if (arg0 != false)
				method1213((byte) 72);
			if (arg1 >= 129 && (arg1 ^ 0xffffffff) >= -160)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("wd.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static int method1216(int arg0, int arg1, int arg2) {
		try {
			anInt1722++;
			if (arg1 >= -30)
				aJagexString_1713 = null;
			int i = arg0 >>> -2143271329;
			return (i + arg0) / arg2 - i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("wd.E("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method1217(int arg0, int arg1, int arg2,
                                  Buffer arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (arg5 != -105)
				method1217(-108, -72, -54, null, -111, 32, -17, 87);
			if (arg1 >= 0 && (arg1 ^ 0xffffffff) > -105
					&& (arg2 ^ 0xffffffff) <= -1 && arg2 < 104) {
				Class46.currentSceneTileFlags[arg0][arg1][arg2] = (byte) 0;
				for (;;) {
					int i = arg3.get();
					if ((i ^ 0xffffffff) == -1) {
						if (arg0 != 0)
							Class4_Sub23.intGroundArray[arg0][arg1][arg2] = (Class4_Sub23.intGroundArray[-1
									+ arg0][arg1][arg2]) - 240;
						else
							Class4_Sub23.intGroundArray[0][arg1][arg2] = -Class4_Sub22
									.method627((arg4 + 556238 - -arg2), arg5
											+ -5501, arg6 + (932731 + arg1)) * 8;
						break;
					}
					if (i == 1) {
						int i_0_ = arg3.get();
						if ((i_0_ ^ 0xffffffff) == -2)
							i_0_ = 0;
						if (arg0 == 0)
							Class4_Sub23.intGroundArray[0][arg1][arg2] = 8 * -i_0_;
						else
							Class4_Sub23.intGroundArray[arg0][arg1][arg2] = (Class4_Sub23.intGroundArray[arg0
									+ -1][arg1][arg2])
									- i_0_ * 8;
						break;
					}
					if (i <= 49) {
						Class59.aByteArrayArrayArray1181[arg0][arg1][arg2] = arg3
								.method229(45);
						Class4_Sub20_Sub10.aByteArrayArrayArray3054[arg0][arg1][arg2] = (byte) ((-2 + i) / 4);
						Class4_Sub20_Sub10.aByteArrayArrayArray3065[arg0][arg1][arg2] = (byte) Class59
								.method1035(arg7 + (-2 + i), 3);
					} else if (i <= 81)
						Class46.currentSceneTileFlags[arg0][arg1][arg2] = (byte) (-49 + i);
					else
						Class4_Sub20_Sub4.aByteArrayArrayArray2861[arg0][arg1][arg2] = (byte) (i + -81);
				}
			} else {
				for (;;) {
					int i = arg3.get();
					if ((i ^ 0xffffffff) == -1)
						break;
					if (i == 1) {
						arg3.get();
						break;
					}
					if (i <= 49)
						arg3.get();
				}
			}
			anInt1716++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("wd.B("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
					+ arg5 + ',' + arg6 + ',' + arg7 + ')'));
		}
	}
}
