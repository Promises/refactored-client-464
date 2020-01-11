package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class67 {
	public static Class19 aClass19_1363;
	public static JagexString aJagexString_1355;
	public static JagexString aJagexString_1360;
	public static JagexString aJagexString_1365;
	public static Class66 aClass66_1357;
	public static int anInt1339;
	public static int anInt1341 = 0;
	public static int anInt1344;
	public static int anInt1346;
	public static int anInt1348;
	public static int anInt1349;
	public static int anInt1352;
	public static int anInt1354;
	public static int anInt1364;
	public static int[] anIntArray1340;
	public static int[] anIntArray1367;
	static {
		anIntArray1340 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
		aJagexString_1355 = (JagexString.getRs2PreparedString(
				"Too many connections from your address)3"));
		aJagexString_1360 = aJagexString_1355;
		anInt1352 = 0;
		aClass66_1357 = new Class66(30);
		aJagexString_1365 = JagexString.getRs2PreparedString("::errortest");
	}

	public static void method1086(boolean arg0, byte arg1) {
		try {
			Class4_Sub22.aBoolean2400 = arg0;
			if (arg1 <= 4)
				method1086(false, (byte) -24);
			if (!Class4_Sub22.aBoolean2400) {
				int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method223(0); // shorta,
																				// regiony
				int i_0_ = ((-Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion + Class4_Sub20_Sub15.anInt3157) / 16);
				Class4_Sub20_Sub7_Sub4.anIntArrayArray3375 = new int[i_0_][4];
				for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
					for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -5; i_2_++)
						Class4_Sub20_Sub7_Sub4.anIntArrayArray3375[i_1_][i_2_] = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.method241(4); // int1
				}
				int i_3_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
						.method213((byte) -114); // leshort, regionx
				int i_4_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
						.method209((byte) -103); // short
				int i_5_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get(); // byte
				boolean bool = false;
				if (((i_3_ / 8 ^ 0xffffffff) == -49 || i_3_ / 8 == 49)
						&& i / 8 == 48)
					bool = true;
				if (i_3_ / 8 == 48 && i / 8 == 148)
					bool = true;
				int i_6_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
						.method209((byte) -103); // short
				Class4_Sub20_Sub5.aByteArrayArray2887 = new byte[i_0_][];
				Class47.regionIds = new int[i_0_];
				GameShell.regionsData = new byte[i_0_][];
				Class4_Sub15.anIntArray2290 = new int[i_0_];
				Class61.anIntArray1222 = new int[i_0_];
				i_0_ = 0;
				for (int i_7_ = (-6 + i_3_) / 8; (i_7_ ^ 0xffffffff) >= ((6 + i_3_) / 8 ^ 0xffffffff); i_7_++) {
					for (int i_8_ = (i + -6) / 8; i_8_ <= (i - -6) / 8; i_8_++) {
						int i_9_ = i_8_ + (i_7_ << 1617839784);
						if (!bool
								|| ((i_8_ ^ 0xffffffff) != -50 && i_8_ != 149
										&& i_8_ != 147 && i_7_ != 50 && (i_7_ != 49 || (i_8_ ^ 0xffffffff) != -48))) {
							Class47.regionIds[i_0_] = i_9_;
							Class4_Sub15.anIntArray2290[i_0_] = (Class4_Sub20_Sub6.aClass19_Sub1_2911
									.method754(
											(Class4_Sub24
													.method639(
															(new JagexString[] {
																	Class4_Sub20_Sub7_Sub1.aJagexString_3294,
																	Class74.method1168(
																			-84,
																			i_7_),
																	StringUtilities.aJagexString_85,
																	Class74.method1168(
																			-54,
																			i_8_) }),
															-842)), 1));
							Class61.anIntArray1222[i_0_] = (Class4_Sub20_Sub6.aClass19_Sub1_2911
									.method754((Class4_Sub24.method639(
											(new JagexString[] {
													StringUtilities.aJagexString_368,
													Class74.method1168(-125,
															i_7_),
													StringUtilities.aJagexString_85,
													Class74.method1168(-94,
															i_8_) }), -842)), 1));
							i_0_++;
						}
					}
				}
				Class47.method978(i_3_, i_4_, false, i_5_, i_6_, i);
			} else {
				int i = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
						.method235((byte) 126);
				int i_10_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
						.method240(32767);
				int i_11_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
						.method235((byte) 106);
				int i_12_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
						.method235((byte) -50);
				int i_13_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
						.method223(0);
				Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method271((byte) -58);
				for (int i_14_ = 0; i_14_ < 4; i_14_++) {
					for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -14; i_15_++) {
						for (int i_16_ = 0; i_16_ < 13; i_16_++) {
							int i_17_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
									.method266(-1432215741, 1);
							if ((i_17_ ^ 0xffffffff) == -2)
								Class80.anIntArrayArrayArray1650[i_14_][i_15_][i_16_] = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
										.method266(-1432215741, 26);
							else
								Class80.anIntArrayArrayArray1650[i_14_][i_15_][i_16_] = -1;
						}
					}
				}
				Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.method274((byte) 67);
				int i_18_ = ((Class4_Sub20_Sub15.anInt3157 + -Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointion) / 16);
				Class4_Sub20_Sub7_Sub4.anIntArrayArray3375 = new int[i_18_][4];
				for (int i_19_ = 0; (i_18_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
					for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -5; i_20_++)
						Class4_Sub20_Sub7_Sub4.anIntArrayArray3375[i_19_][i_20_] = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883
								.method219((byte) 73);
				}
				Class47.regionIds = new int[i_18_];
				GameShell.regionsData = new byte[i_18_][];
				Class4_Sub15.anIntArray2290 = new int[i_18_];
				Class4_Sub20_Sub5.aByteArrayArray2887 = new byte[i_18_][];
				Class61.anIntArray1222 = new int[i_18_];
				i_18_ = 0;
				for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > -5; i_21_++) {
					for (int i_22_ = 0; i_22_ < 13; i_22_++) {
						for (int i_23_ = 0; i_23_ < 13; i_23_++) {
							int i_24_ = (Class80.anIntArrayArrayArray1650[i_21_][i_22_][i_23_]);
							if (i_24_ != -1) {
								int i_25_ = (0xffcd3b & i_24_) >> -2107931090;
								int i_26_ = (i_24_ & 0x3ffb) >> -103046685;
								int i_27_ = (i_25_ / 8 << -612065144)
										- -(i_26_ / 8);
								for (int i_28_ = 0; i_28_ < i_18_; i_28_++) {
									if ((Class47.regionIds[i_28_] ^ 0xffffffff) == (i_27_ ^ 0xffffffff)) {
										i_27_ = -1;
										break;
									}
								}
								if (i_27_ != -1) {
									int i_29_ = 0xff & i_27_;
									int i_30_ = (0xffa2 & i_27_) >> -1073196216;
									Class47.regionIds[i_18_] = i_27_;
									Class4_Sub15.anIntArray2290[i_18_] = (Class4_Sub20_Sub6.aClass19_Sub1_2911
											.method754(
													(Class4_Sub24
															.method639(
																	(new JagexString[] {
																			(Class4_Sub20_Sub7_Sub1.aJagexString_3294),
																			Class74.method1168(
																					-109,
																					i_30_),
																			StringUtilities.aJagexString_85,
																			Class74.method1168(
																					-61,
																					i_29_) }),
																	-842)), 1));
									Class61.anIntArray1222[i_18_] = (Class4_Sub20_Sub6.aClass19_Sub1_2911
											.method754(
													(Class4_Sub24
															.method639(
																	(new JagexString[] {
																			StringUtilities.aJagexString_368,
																			Class74.method1168(
																					-11,
																					i_30_),
																			StringUtilities.aJagexString_85,
																			Class74.method1168(
																					-77,
																					i_29_) }),
																	-842)), 1));
									i_18_++;
								}
							}
						}
					}
				}
				Class47.method978(i_11_, i_13_, false, i_10_, i_12_, i);
			}
			anInt1344++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("tb.E("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method1087(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		try {
			for (int i = 0; (i ^ 0xffffffff) > (SceneGraph.anInt2493 ^ 0xffffffff); i++) {
				if (Class77.anIntArray1585[i] + Class24.anIntArray568[i] > arg1
						&& arg2 + arg1 > Class24.anIntArray568[i]
						&& arg4 < (Class42.anIntArray852[i] + Class4_Sub20_Sub7_Sub1.anIntArray3268[i])
						&& (arg4 - -arg3 ^ 0xffffffff) < (Class42.anIntArray852[i] ^ 0xffffffff))
					Class16.aBooleanArray452[i] = true;
			}
			if (arg0 != -30024)
				anIntArray1340 = null;
			anInt1349++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("tb.D(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ')'));
		}
	}

	public static void method1088(RSInterface arg0) {
		anInt1346++;
		if ((Class4_Sub20_Sub5.anInt2879 ^ 0xffffffff) == (arg0.anInt2235 ^ 0xffffffff))
			Class4_Sub20_Sub11.aBooleanArray3083[arg0.anInt2193] = true;
	}

	public static boolean method1089(int arg0, int arg1, byte arg2, byte[] arg3) {
		try {
			if (arg2 != -97)
				method1091(-15);
			anInt1348++;
			boolean bool = true;
			int i = -1;
			StreamBuffer buffer = new StreamBuffer(arg3);
			for (;;) {
				int i_31_ = buffer.getSmart();
				if (i_31_ == 0)
					break;
				i += i_31_;
				int i_32_ = 0;
				boolean bool_33_ = false;
				for (;;) {
					if (!bool_33_) {
						int i_34_ = buffer.getSmart();
						if ((i_34_ ^ 0xffffffff) == -1)
							break;
						i_32_ += i_34_ - 1;
						int i_35_ = 0x3f & i_32_;
						int i_36_ = buffer.get() >> 16946178;
						int i_37_ = i_32_ >> 905693702 & 0x3f;
						int i_38_ = i_37_ + arg1;
						int i_39_ = i_35_ - -arg0;
						if (i_38_ > 0 && i_39_ > 0
								&& (i_38_ ^ 0xffffffff) > -104 && i_39_ < 103) {
							Class4_Sub20_Sub1 class4_sub20_sub1 = Region
									.method56(true, i);
							if (i_36_ != 22 || !Class59.aBoolean1189
									|| class4_sub20_sub1.anInt2726 != 0
									|| class4_sub20_sub1.anInt2741 == 1
									|| class4_sub20_sub1.aBoolean2730) {
								bool_33_ = true;
								if (!class4_sub20_sub1.method330((byte) 109)) {
									Class77.anInt1591++;
									bool = false;
								}
							}
						}
					} else {
						int i_40_ = buffer.getSmart();
						if (i_40_ == 0)
							break;
						buffer.get();
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("tb.B("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static int method1090(int arg0, int arg1, boolean arg2, int arg3) {
		try {
			anInt1364++;
			int i = arg0 >> 365354023;
			if (arg2 != true)
				anIntArray1367 = null;
			int i_41_ = arg1 >> -1969970553;
			if ((i ^ 0xffffffff) > -1 || i_41_ < 0 || (i ^ 0xffffffff) < -104
					|| i_41_ > 103)
				return 0;
			int i_42_ = arg3;
			if (i_42_ < 3 && (Class46.landscapeData[1][i][i_41_] & 0x2) == 2)
				i_42_++;
			int i_43_ = 0x7f & arg1;
			int i_44_ = arg0 & 0x7f;
			int i_45_ = ((((-i_44_ + 128) * Class4_Sub23.anIntArrayArrayArray2416[i_42_][i][i_41_]) + i_44_
					* (Class4_Sub23.anIntArrayArrayArray2416[i_42_][1 + i][i_41_])) >> 2118087367);
			int i_46_ = (((-i_44_ + 128)
					* (Class4_Sub23.anIntArrayArrayArray2416[i_42_][i][1 + i_41_]) - -((Class4_Sub23.anIntArrayArrayArray2416[i_42_][i
					- -1][1 + i_41_]) * i_44_)) >> -443854329);
			return i_43_ * i_46_ + i_45_ * (128 - i_43_) >> 1955771719;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("tb.F("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method1091(int arg0) {
		try {
			aClass19_1363 = null;
			aJagexString_1365 = null;
			if (arg0 != 1)
				method1087(96, -23, 108, 114, 95);
			anIntArray1340 = null;
			aClass66_1357 = null;
			anIntArray1367 = null;
			aJagexString_1355 = null;
			aJagexString_1360 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "tb.A("
					+ arg0 + ')');
		}
	}

	public Class4_Sub20_Sub7 aClass4_Sub20_Sub7_1366;
	public int anInt1338;
	public int anInt1342;
	public int anInt1343;
	public int anInt1345;
	public int anInt1347;
	public int anInt1350;

	public int anInt1351;

	public int anInt1353;

	public int anInt1356;

	public int anInt1358;

	public int anInt1359;

	public int anInt1361;

	public int anInt1362 = 0;

	public Class67() {
		anInt1361 = 0;
	}
}
