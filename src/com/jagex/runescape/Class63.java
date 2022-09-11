package com.jagex.runescape;
import java.awt.Component;

public class Class63 {
	public static JagexString aJagexString_1242;
	public static JagexString aJagexString_1246 = JagexString.getRs2PreparedString(
			"New User");
	public static JagexString aJagexString_1250;
	public static int anInt1243;
	public static int anInt1244;
	public static int anInt1245 = 0;
	public static int anInt1247;
	public static int anInt1248;
	public static int anInt1249;
	public static int anInt1251;

	static {
		aJagexString_1242 = aJagexString_1246;
		aJagexString_1250 = JagexString.getRs2PreparedString("sl_button");
	}

	public static void method1053(int arg0, boolean arg1, int arg2, int arg3) {
		try {
			anInt1249++;
			if (arg0 < 128 || (arg3 ^ 0xffffffff) > -129
					|| (arg0 ^ 0xffffffff) < -13057
					|| (arg3 ^ 0xffffffff) < -13057) {
				Class27.anInt604 = -1;
				SceneGraph.anInt2502 = -1;
			} else {
				int i = -arg2
						+ Class67.getFloorDrawHeight(arg0, arg3, Class82.plane
				);
				int i_0_ = (Class4_Sub20_Sub12_Sub3.COSINE[Class4_Sub20_Sub13.cameraVerticalRotation]);
				arg3 -= Class33.cameraY;
				if (arg1 == false) {
					int i_1_ = (Class4_Sub20_Sub12_Sub3.SINE[Class4_Sub6.cameraHorizontalRotation]);
					arg0 -= Class6.cameraX;
					int i_2_ = (Class4_Sub20_Sub12_Sub3.COSINE[Class4_Sub6.cameraHorizontalRotation]);
					int i_3_ = (Class4_Sub20_Sub12_Sub3.SINE[Class4_Sub20_Sub13.cameraVerticalRotation]);
					int i_4_ = arg0 * i_2_ + i_1_ * arg3 >> -284408944;
					i -= RSInterface.cameraZ;
					arg3 = -(arg0 * i_1_) + i_2_ * arg3 >> -476228752;
					arg0 = i_4_;
					i_4_ = -(arg3 * i_3_) + i * i_0_ >> -1457811312;
					arg3 = i * i_3_ - -(arg3 * i_0_) >> -838621136;
					i = i_4_;
					if ((arg3 ^ 0xffffffff) <= -51) {
						Class27.anInt604 = 256 + (arg0 << 391232041) / arg3;
						SceneGraph.anInt2502 = (i << -1623205367) / arg3
								+ 167;
					} else {
						Class27.anInt604 = -1;
						SceneGraph.anInt2502 = -1;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("s.D("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method1054(boolean arg0) {
		try {
			Class69.aBoolean1400 = arg0;
			anInt1248++;
			Class59.aBoolean1189 = true;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "s.A("
					+ arg0 + ')');
		}
	}

	public static Class4_Sub20_Sub12_Sub1[] method1055(JagexString arg0,
                                                       Class19 arg1, int arg2, JagexString arg3) {
		try {
			if (arg2 <= 6)
				aJagexString_1246 = null;
			int i = arg1.method754(arg3, 1);
			anInt1244++;
			int i_5_ = arg1.method747(false, arg0, i);
			return Class4_Sub20_Sub6.method364(arg1, i_5_, i, (byte) 111);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("s.F("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1056(int arg0) {
		aJagexString_1250 = null;
		aJagexString_1246 = null;
		aJagexString_1242 = null;
		if (arg0 > -2)
			method1055(null, null, 114, null);
	}

	public static int method1057(int arg0, byte arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		try {
			arg3 &= 0x3;
			if ((0x1 & arg4 ^ 0xffffffff) == -2) {
				int i = arg0;
				arg0 = arg6;
				arg6 = i;
			}
			anInt1247++;
			if (arg3 == 0)
				return arg2;
			if ((arg3 ^ 0xffffffff) == -2)
				return arg5;
			if ((arg3 ^ 0xffffffff) == -3)
				return -arg0 + 1 + (7 + -arg2);
			if (arg1 != 23)
				return -59;
			return -arg5 + (7 + (-arg6 + 1));
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("s.E("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public static Class13 method1058(int arg0, int arg1, Component arg2,
			int arg3) {
		try {
			anInt1251++;
			if (arg0 >= -81)
				return null;
			try {
				Class13 class13 = new Class13_Sub1();
				class13.method686(arg2, arg3, -87, arg1);
				return class13;
			} catch (Throwable throwable) {
				Class13_Sub2 class13_sub2 = new Class13_Sub2();
				class13_sub2.method686(arg2, arg3, -103, arg1);
				return class13_sub2;
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("s.B("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}
}
