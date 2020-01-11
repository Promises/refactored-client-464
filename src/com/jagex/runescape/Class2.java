package com.jagex.runescape;

public class Class2 {
	public static long aLong82;
	public static int anInt86;
	public static int anInt87;
	public static int anInt89;
	public static int anInt91;
	public static int anInt94;
	public static int anInt95 = 0;
	public static int anInt96 = 0;
	public static int[] anIntArray84 = new int[32];
	public static int[] anIntArray90;
	public static short[][] aShortArrayArray83 = {
			{ 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433,
					2983, -11343 },
			{ 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153,
					-8915, 4783, 1341, 16578, -30533, 25239 },
			{ 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094,
					10153, -8915, 4783, 1341, 16578, -30533 },
			{ 4626, 11146, 6439, 12, 4758, 10270 },
			{ 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	public static void method42(int arg0, Class4_Sub20_Sub7_Sub1_Sub1 arg1,
			int arg2, int arg3, int arg4) {
		anInt87++;
		if (arg1 != Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302
				&& Class4_Sub20_Sub8.anInt2980 < 400) {
			JagexString jagexString;
			if ((arg1.anInt3586 ^ 0xffffffff) != -1) {
				jagexString = (Class4_Sub24.method639(
						(new JagexString[] { arg1.aJagexString_3593,
								Class4_Sub7.aJagexString_1957,
								Class4_Sub7.aJagexString_1948,
								Class74.method1168(-73, arg1.anInt3586),
								StringUtilities.aJagexString_652}), arg0 + -31187));
			} else {
				jagexString = (Class4_Sub24
						.method639(
								(new JagexString[] {
										arg1.aJagexString_3593,
										(Class19_Sub1
												.method765(
														(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3584),
														arg1.anInt3584,
														(byte) -45)),
										Class4_Sub7.aJagexString_1957,
										RSFont.aJagexString_164,
										Class74.method1168(-80, arg1.anInt3584),
										StringUtilities.aJagexString_652}), -842));
			}
			if ((Class4_Sub20_Sub1.anInt2734 ^ 0xffffffff) == -2) {
				Class4_Sub20_Sub4.method359(
						Class4_Sub24.method639((new JagexString[] {
								Class62.aJagexString_1239, JagexString.aJagexString_1815,
                                jagexString}), -842), arg3, arg2, 30, arg4,
						(byte) 91, Class57.aJagexString_1154);
				Class4_Sub1.anInt1857++;
			} else if (Class4_Sub23.aBoolean2421) {
				if ((Class35.anInt740 & 0x8 ^ 0xffffffff) == -9) {
					Class4_Sub20_Sub4.method359(
							Class4_Sub24.method639((new JagexString[] {
									Class5.aJagexString_194, JagexString.aJagexString_1815,
                                    jagexString}), -842), arg3, arg2, 7, arg4,
							(byte) 32, Class82.aJagexString_1714);
					Class47.anInt964++;
				}
			} else {
				for (int i = 7; i >= 0; i--) {
					if (Class4_Sub22.aJagexStringArray2387[i] != null) {
						Class4_Sub20_Sub16.anInt3170++;
						int i_0_ = 0;
						if (!Class4_Sub22.aJagexStringArray2387[i].method818(
								Class4_Sub16.aJagexString_2305, (byte) -105)) {
							if (Class4_Sub20_Sub7.aBooleanArray2946[i]) {
								i_0_ = 2000;
							}
						} else {
							if (((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3584) ^ 0xffffffff) > (arg1.anInt3584 ^ 0xffffffff)) {
								i_0_ = 2000;
							}
							if ((Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3590) != 0
									&& arg1.anInt3590 != 0) {
								if (arg1.anInt3590 != (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.anInt3590)) {
									i_0_ = 0;
								} else {
									i_0_ = 2000;
								}
							}
						}
						int i_1_ = i_0_ + Class4_Sub20_Sub13.anIntArray3130[i];
						Class4_Sub20_Sub4.method359(Class4_Sub24.method639(
								(new JagexString[] { (Class4_Sub8.aJagexString_1971),
                                        jagexString}), arg0 + -31187), arg3, arg2,
								i_1_, arg4, (byte) 116,
								Class4_Sub22.aJagexStringArray2387[i]);
					}
				}
			}
			for (int i = 0; Class4_Sub20_Sub8.anInt2980 > i; i++) {
				if ((Class82.anIntArray1712[i] ^ 0xffffffff) == -36) {
					Class18.aJagexStringArray462[i] = Class4_Sub24
							.method639((new JagexString[] {
									Class4_Sub8.aJagexString_1971, jagexString}), -842);
					break;
				}
			}
			if (arg0 != 30345) {
				StringUtilities.aJagexString_85 = null;
			}
		}
	}

	public static void method43(int arg0) {
		try {
			Class66.aClass4_Sub11_Sub1_1328.method264(71, 109);
			for (Class4_Sub16 class4_sub16 = ((Class4_Sub16) Class31.aClass16_677
					.method724((byte) 60)); class4_sub16 != null; class4_sub16 = ((Class4_Sub16) Class31.aClass16_677
					.method723((byte) -25))) {
				if ((class4_sub16.anInt2306 ^ 0xffffffff) == -1
						|| class4_sub16.anInt2306 == 3) {
					Class4_Sub20_Sub7_Sub3.method418(-46, true, class4_sub16);
				}
			}
			anInt86++;
			if (RSInterface.aClass4_Sub13_2141 != null) {
				Class67.method1088(RSInterface.aClass4_Sub13_2141);
				RSInterface.aClass4_Sub13_2141 = null;
			}
			Class12.anInt344++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "aa.D("
					+ arg0 + ')');
		}
	}

	public static Class4_Sub20_Sub12_Sub1 method44(int arg0, JagexString arg1,
                                                   JagexString arg2, Class19 arg3) {
		try {
			anInt91++;
			if (arg0 != 24094) {
				StringUtilities.aJagexString_85 = null;
			}
			int i = arg3.method754(arg2, 1);
			int i_2_ = arg3.method747(false, arg1, i);
			return Class4_Sub20_Sub15.method602(true, arg3, i_2_, i);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("aa.E("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static boolean method45(int arg0, int arg1) {
		try {
			if (arg0 >= -98) {
				StringUtilities.aJagexString_85 = null;
			}
			anInt94++;
			if ((arg1 < 97 || (arg1 ^ 0xffffffff) < -123)
					&& ((arg1 ^ 0xffffffff) > -66 || arg1 > 90)) {
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("aa.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method46(int arg0) {
		try {
			StringUtilities.aJagexString_92 = null;
			StringUtilities.aJagexString_85 = null;
			StringUtilities.aJagexString_81 = null;
			aShortArrayArray83 = null;
			StringUtilities.aJagexString_93 = null;
			if (arg0 == 4634) {
				anIntArray84 = null;
				anIntArray90 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "aa.A("
					+ arg0 + ')');
		}
	}

	public static boolean method47(int arg0, int arg1) {
		try {
			if (arg1 != 4626) {
				StringUtilities.aJagexString_92 = null;
			}
			anInt89++;
			if ((0x1 & arg0 >> 2132745916 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("aa.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
