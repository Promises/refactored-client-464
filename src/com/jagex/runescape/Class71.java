package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class71 {
	public static Class19 aClass19_1474;
	public static JagexString aJagexString_1470;
	public static JagexString aJagexString_1471 = JagexString.getRs2PreparedString(
			"Anmelde)2Zeitlimit -Uberschritten)3");
	public static JagexString aJagexString_1476 = JagexString.getRs2PreparedString(
			"Please wait)3)3)3");
	public static int anInt1467;
	public static int anInt1468;
	public static int anInt1469;
	public static int anInt1472 = 0;
	public static int anInt1473;
	public static int anInt1477;
	public static int anInt1478;
	public static int anInt1479;
	public static int anInt1480;
	public static int anInt1481;

	static {
		aJagexString_1470 = aJagexString_1476;
		anInt1477 = 0;
		anInt1480 = 127;
	}

	public static void method1153(int arg0, RSInterface arg1) {
		anInt1473++;
		int i = arg1.anInt2227;
		if (i == 324) {
			if (Class46.anInt943 == -1) {
				Class46.anInt943 = arg1.anInt2147;
				Class61.anInt1208 = arg1.anInt2228;
			}
			if (!Class4_Sub24.aClass35_2438.aBoolean725)
				arg1.anInt2147 = Class61.anInt1208;
			else
				arg1.anInt2147 = Class46.anInt943;
		} else {
			if (arg0 <= 106)
				method1157((byte) 88);
			if (i == 325) {
				if (Class46.anInt943 == -1) {
					Class61.anInt1208 = arg1.anInt2228;
					Class46.anInt943 = arg1.anInt2147;
				}
				if (Class4_Sub24.aClass35_2438.aBoolean725)
					arg1.anInt2147 = Class61.anInt1208;
				else
					arg1.anInt2147 = Class46.anInt943;
			} else if ((i ^ 0xffffffff) == -328) {
				arg1.anInt2213 = 150;
				arg1.anInt2236 = 0x7ff & (int) (Math
						.sin(Region.anInt134 / 40.0) * 256.0);
				arg1.anInt2137 = 5;
				arg1.anInt2250 = 0;
			} else if ((i ^ 0xffffffff) == -329) {
				arg1.anInt2213 = 150;
				arg1.anInt2236 = 0x7ff & (int) (256.0 * Math
						.sin(Region.anInt134 / 40.0));
				arg1.anInt2137 = 5;
				arg1.anInt2250 = 1;
			}
		}
	}

	public static void method1154(byte arg0, RSInterface arg1, int arg2,
			int arg3) {
		anInt1467++;
		if (arg1.anInt2171 == 1) {
			Class4_Sub7.anInt1945++;
			Class4_Sub20_Sub4.method359(Class4_Sub3.aJagexString_1895,
					arg1.anInt2172, 0, 24, 0, (byte) 51, arg1.aJagexString_2264);
		}
		if ((arg1.anInt2171 ^ 0xffffffff) == -3 && !Class4_Sub23.aBoolean2421) {
			JagexString jagexString = Class4_Sub2_Sub4.method167(-97, arg1);
			if (jagexString != null) {
				Class4_Sub20_Sub4.method359(Class4_Sub24.method639(
						(new JagexString[] { Class50.aJagexString_1016,
								arg1.aJagexString_2202}), -842), arg1.anInt2172,
						-1, 5, 0, (byte) 106, jagexString);
				Class4_Sub20_Sub9.anInt3035++;
			}
		}
		if (arg1.anInt2171 == 3) {
			Class8.anInt249++;
			Class4_Sub20_Sub4.method359(Class4_Sub3.aJagexString_1895,
					arg1.anInt2172, 0, 51, 0, (byte) 68,
					(Player.aJagexString_3592));
		}
		if (arg1.anInt2171 == 4) {
			Class4_Sub20_Sub4.method359(Class4_Sub3.aJagexString_1895,
					arg1.anInt2172, 0, 8, 0, (byte) 28, arg1.aJagexString_2264);
			Class11.anInt330++;
		}
		if (arg1.anInt2171 == 5) {
			Class4_Sub20_Sub7_Sub3.anInt3356++;
			Class4_Sub20_Sub4.method359(Class4_Sub3.aJagexString_1895,
					arg1.anInt2172, 0, 33, 0, (byte) 88, arg1.aJagexString_2264);
		}
		if (arg1.anInt2171 == 6 && RSInterface.aClass4_Sub13_2141 == null) {
			Class4_Sub21.anInt2365++;
			Class4_Sub20_Sub4.method359(Class4_Sub3.aJagexString_1895,
					arg1.anInt2172, -1, 19, 0, (byte) 49, arg1.aJagexString_2264);
		}
		if (arg1.anInt2258 == 2) {
			int i_0_ = 0;
			for (int i_1_ = 0; arg1.anInt2185 > i_1_; i_1_++) {
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (arg1.anInt2156 ^ 0xffffffff); i_2_++) {
					int i_3_ = i_2_ * (32 - -arg1.anInt2190);
					int i_4_ = i_1_ * (32 - -arg1.anInt2232);
					if ((i_0_ ^ 0xffffffff) > -21) {
						i_4_ += arg1.anIntArray2257[i_0_];
						i_3_ += arg1.anIntArray2223[i_0_];
					}
					if ((arg3 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff)
							&& (arg2 ^ 0xffffffff) <= (i_4_ ^ 0xffffffff)
							&& arg3 < i_3_ - -32
							&& (32 + i_4_ ^ 0xffffffff) < (arg2 ^ 0xffffffff)) {
						Class34.anInt1761 = i_0_;
						Class42.aClass4_Sub13_855 = arg1;
						if (arg1.anIntArray2179[i_0_] > 0) {
							Class4_Sub20_Sub8 class4_sub20_sub8 = Class4_Sub23
									.method633(
											-1 + (arg1.anIntArray2179[i_0_]),
											(byte) -107);
							if (((Class4_Sub20_Sub1.anInt2734 ^ 0xffffffff) == -2)
									&& (Class80.method1204((byte) -127,
											Class54.method1011(arg1, -22389)))) {
								if (((arg1.anInt2172 ^ 0xffffffff) != (Class57.anInt1142 ^ 0xffffffff))
										|| (i_0_ ^ 0xffffffff) != (Class43.anInt887 ^ 0xffffffff)) {
									Class4_Sub20_Sub4
											.method359(
													(Class4_Sub24
															.method639(
																	(new JagexString[] {
																			Class62.aJagexString_1239,
																			StringUtilities.aJagexString_842,
																			(class4_sub20_sub8.aJagexString_2991) }),
																	-842)),
													arg1.anInt2172,
													i_0_,
													23,
													class4_sub20_sub8.anInt2954,
													(byte) 106,
													Class57.aJagexString_1154);
									Class65.anInt1310++;
								}
							} else if (!Class4_Sub23.aBoolean2421
									|| !(Class80.method1204((byte) -127,
											Class54.method1011(arg1, -22389)))) {
								JagexString[] jagexStrings = class4_sub20_sub8.aJagexStringArray2988;
								if (Class4_Sub17.aBoolean2319)
									jagexStrings = Class10.method671(false,
                                            jagexStrings);
								if (Class80.method1204((byte) -127,
										Class54.method1011(arg1, -22389))) {
									for (int i_5_ = 4; (i_5_ ^ 0xffffffff) <= -4; i_5_--) {
										if (jagexStrings == null
												|| jagexStrings[i_5_] == null) {
											if (i_5_ == 4) {
												Class4_Sub20_Sub7_Sub5.anInt3393++;
												Class4_Sub20_Sub4
														.method359(
																(Class4_Sub24
																		.method639(
																				(new JagexString[] {
																						(Class62.aJagexString_1230),
																						(class4_sub20_sub8.aJagexString_2991) }),
																				-842)),
																arg1.anInt2172,
																i_0_,
																45,
																(class4_sub20_sub8.anInt2954),
																(byte) 26,
																StringUtilities.aJagexString_564);
											}
										} else {
											Class4_Sub20_Sub7.anInt2942++;
											int i_6_;
											if (i_5_ != 3)
												i_6_ = 45;
											else
												i_6_ = 41;
											Class4_Sub20_Sub4
													.method359(
															(Class4_Sub24
																	.method639(
																			(new JagexString[] {
																					Class62.aJagexString_1230,
																					(class4_sub20_sub8.aJagexString_2991) }),
																			-842)),
															arg1.anInt2172,
															i_0_,
															i_6_,
															class4_sub20_sub8.anInt2954,
															(byte) 74,
															jagexStrings[i_5_]);
										}
									}
								}
								if (Class5.method644((byte) -108,
										Class54.method1011(arg1, -22389))) {
									Class47.anInt958++;
									Class4_Sub20_Sub4
											.method359(
													(Class4_Sub24
															.method639(
																	(new JagexString[] {
																			Class62.aJagexString_1230,
																			(class4_sub20_sub8.aJagexString_2991) }),
																	-842)),
													arg1.anInt2172,
													i_0_,
													50,
													class4_sub20_sub8.anInt2954,
													(byte) 23,
													Class57.aJagexString_1154);
								}
								if ((Class80.method1204((byte) -127,
										Class54.method1011(arg1, -22389)))
										&& jagexStrings != null) {
									for (int i_7_ = 2; (i_7_ ^ 0xffffffff) <= -1; i_7_--) {
										if (jagexStrings[i_7_] != null) {
											Class37.anInt759++;
											int i_8_ = 0;
											if (i_7_ == 0)
												i_8_ = 37;
											if (i_7_ == 1)
												i_8_ = 28;
											if (i_7_ == 2)
												i_8_ = 4;
											Class4_Sub20_Sub4
													.method359(
															(Class4_Sub24
																	.method639(
																			(new JagexString[] {
																					Class62.aJagexString_1230,
																					(class4_sub20_sub8.aJagexString_2991) }),
																			-842)),
															arg1.anInt2172,
															i_0_,
															i_8_,
															class4_sub20_sub8.anInt2954,
															(byte) 48,
															jagexStrings[i_7_]);
										}
									}
								}
								JagexException.anInt1727++;
								jagexStrings = arg1.aJagexStringArray2233;
								if (Class4_Sub17.aBoolean2319)
									jagexStrings = Class10.method671(false,
                                            jagexStrings);
								if (jagexStrings != null) {
									for (int i_9_ = 4; (i_9_ ^ 0xffffffff) <= -1; i_9_--) {
										if (jagexStrings[i_9_] != null) {
											Class1.anInt76++;
											int i_10_ = 0;
											if (i_9_ == 0)
												i_10_ = 29;
											if (i_9_ == 1)
												i_10_ = 39;
											if (i_9_ == 2)
												i_10_ = 20;
											if (i_9_ == 3)
												i_10_ = 21;
											if ((i_9_ ^ 0xffffffff) == -5)
												i_10_ = 31;
											Class4_Sub20_Sub4
													.method359(
															(Class4_Sub24
																	.method639(
																			(new JagexString[] {
																					Class62.aJagexString_1230,
																					(class4_sub20_sub8.aJagexString_2991) }),
																			-842)),
															arg1.anInt2172,
															i_0_,
															i_10_,
															class4_sub20_sub8.anInt2954,
															(byte) 18,
															jagexStrings[i_9_]);
										}
									}
								}
								Class4_Sub20_Sub4
										.method359(
												(Class4_Sub24
														.method639(
																(new JagexString[] {
																		Class62.aJagexString_1230,
																		class4_sub20_sub8.aJagexString_2991}),
																-842)),
												arg1.anInt2172, i_0_, 1002,
												class4_sub20_sub8.anInt2954,
												(byte) 127,
												StringUtilities.aJagexString_665);
							} else if ((Class35.anInt740 & 0x10 ^ 0xffffffff) == -17) {
								Class27.anInt600++;
								Class4_Sub20_Sub4
										.method359(
												(Class4_Sub24
														.method639(
																(new JagexString[] {
																		Class5.aJagexString_194,
																		StringUtilities.aJagexString_842,
																		class4_sub20_sub8.aJagexString_2991}),
																-842)),
												arg1.anInt2172, i_0_, 40,
												class4_sub20_sub8.anInt2954,
												(byte) 82,
												Class82.aJagexString_1714);
							}
						}
					}
					i_0_++;
				}
			}
		}
		if (arg1.aBoolean2178) {
			if (Class4_Sub23.aBoolean2421) {
				if (Class76.method1188(Class54.method1011(arg1, -22389),
						(byte) 121)
						&& (Class35.anInt740 & 0x20 ^ 0xffffffff) == -33) {
					anInt1468++;
					Class4_Sub20_Sub4.method359(
							Class4_Sub24.method639((new JagexString[] {
									Class5.aJagexString_194,
									Class4_Sub1.aJagexString_1868,
									arg1.aJagexString_2196}), -842),
							arg1.anInt2172, arg1.anInt2163, 49, 0, (byte) 59,
							Class82.aJagexString_1714);
				}
			} else {
				for (int i_11_ = 9; (i_11_ ^ 0xffffffff) <= -6; i_11_--) {
					JagexString jagexString = Class38.method919(-10706, arg1, i_11_);
					if (jagexString != null) {
						Class4_Sub20_Sub4.method359(arg1.aJagexString_2196,
								arg1.anInt2172, arg1.anInt2163, 1006,
								i_11_ + 1, (byte) 98, jagexString);
						Class46.anInt931++;
					}
				}
				JagexString jagexString = Class4_Sub2_Sub4.method167(-121, arg1);
				if (jagexString != null) {
					Class4_Sub20_Sub9.anInt3035++;
					Class4_Sub20_Sub4.method359(arg1.aJagexString_2196,
							arg1.anInt2172, arg1.anInt2163, 5, 0, (byte) 86,
                            jagexString);
				}
				for (int i_12_ = 4; (i_12_ ^ 0xffffffff) <= -1; i_12_--) {
					JagexString jagexString_13_ = Class38
							.method919(-10706, arg1, i_12_);
					if (jagexString_13_ != null) {
						Class46.anInt931++;
						Class4_Sub20_Sub4.method359(arg1.aJagexString_2196,
								arg1.anInt2172, arg1.anInt2163, 10, i_12_ + 1,
								(byte) 72, jagexString_13_);
					}
				}
				if (Class6.method647(-127, Class54.method1011(arg1, -22389))) {
					Class4_Sub20_Sub4.method359(Class4_Sub3.aJagexString_1895,
							arg1.anInt2172, arg1.anInt2163, 19, 0, (byte) 119,
							(Class4_Sub20_Sub8.aJagexString_2967));
					Class4_Sub21.anInt2365++;
				}
			}
		}
	}

	public static Class4_Sub20_Sub3 method1155(int arg0, int arg1) {
		try {
			anInt1469++;
			Class4_Sub20_Sub3 class4_sub20_sub3 = ((Class4_Sub20_Sub3) Class4_Sub16.aClass66_2316
					.method1083(arg1, true));
			if (class4_sub20_sub3 != null)
				return class4_sub20_sub3;
			byte[] is = Class4_Sub11_Sub1.aClass19_2691.method746(9, (byte) 92,
					arg1);
			class4_sub20_sub3 = new Class4_Sub20_Sub3();
			class4_sub20_sub3.anInt2820 = arg1;
			if (is != null)
				class4_sub20_sub3.method349((byte) 120, new StreamBuffer(is));
			class4_sub20_sub3.method348(0);
			if (arg0 >= -23)
				aJagexString_1476 = null;
			Class4_Sub16.aClass66_2316
					.method1082(true, arg1, class4_sub20_sub3);
			return class4_sub20_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("u.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static RSInterface method1156(int arg0, RSInterface arg1) {
		try {
			anInt1478++;
			RSInterface class4_sub13 = RS2Font.method338(arg1, true);
			if (arg0 != -20274)
				return null;
			if (class4_sub13 == null)
				class4_sub13 = arg1.aClass4_Sub13_2205;
			return class4_sub13;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("u.D("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1157(byte arg0) {
		try {
			if (arg0 == 124) {
				Class59.aBoolean1189 = false;
				anInt1481++;
				Class69.aBoolean1400 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "u.E("
					+ arg0 + ')');
		}
	}

	public static void method1158(byte arg0) {
		try {
			if (arg0 < 16)
				method1155(71, -24);
			aClass19_1474 = null;
			aJagexString_1476 = null;
			aJagexString_1470 = null;
			aJagexString_1471 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "u.F("
					+ arg0 + ')');
		}
	}
}
