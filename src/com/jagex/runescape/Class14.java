package com.jagex.runescape;

public abstract class Class14 {
	public static ImageRGB[] aImageRGBArray405;
	public static Class66 aClass66_408 = new Class66(64);
	public static int anInt389;
	public static int anInt391;
	public static int anInt394;
	public static int anInt395;
	public static int anInt399;
	public static int anInt401;
	public static int anInt404;
	public static int anInt410 = 0;
	public static int anInt412 = 0;
	public static int[] anIntArray392 = { -1, -1, -1, -1, -1, -1, -1, -1, 85,
			80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1,
			-1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1,
			-1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1,
			-1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55,
			56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1,
			-1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89,
			87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1,
			-1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1 };



	public static int method698(boolean arg0, int arg1, boolean arg2) {
		try {
			int i = 0;
			if (arg2)
				i += Class31.anInt686 + Class63.anInt1245;
			if (arg0)
				i += Class76.anInt1581 - -Class5.anInt188;
			anInt394++;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("df.F("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static int method700(int arg0, int arg1, int arg2, int arg3,
			byte arg4) {
		try {
			int i = ((-Class4_Sub20_Sub12_Sub3.COSINE[arg3 * 1024
					/ arg1] + 65536) >> 1072078657);
			if (arg4 < 106)
				StringUtilities.aJagexString_403 = null;
			anInt389++;
			return ((arg0 * i >> -551652816) + ((-i + 65536) * arg2 >> -49237744));
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception,
					("df.H(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ')'));
		}
	}

	public static void method701(int arg0) {
		try {
			if (arg0 != -1)
				method698(false, -102, true);
			anInt395++;
			Class66.aClass66_1330.method1084(0);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "df.G("
					+ arg0 + ')');
		}
	}

	public static void method702(int arg0) {
		try {
			int i = Class4_Sub20_Sub17.anInt3195;
			anInt404++;
			int i_1_ = Class4_Sub1.anInt1860;
			int i_2_ = Class63.anInt1243;
			int i_3_ = Class45.anInt926;
			if (arg0 == 105) {
				int i_4_ = 6116423;
				Class4_Sub20_Sub12.method488(i, i_1_, i_2_, i_3_, i_4_);
				Class4_Sub20_Sub12.method488(1 + i, 1 + i_1_, i_2_ - 2, 16, 0);
				Class4_Sub20_Sub12.method502(i - -1, 18 + i_1_, i_2_ - 2, -19
						+ i_3_, 0);
				Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.method577(
						StringUtilities.aJagexString_563, i - -3, i_1_ + 14, i_4_, -1);
				int i_5_ = Class37.anInt767;
				int i_6_ = Class4_Sub1.anInt1859;
				for (int i_7_ = 0; ItemDefinition.anInt2980 > i_7_; i_7_++) {
					int i_8_ = (15 * (-i_7_ + ItemDefinition.anInt2980 + -1)
							+ i_1_ + 31);
					int i_9_ = 16777215;
					if (i < i_5_ && i_5_ < i - -i_2_
							&& (-13 + i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)
							&& 3 + i_8_ > i_6_)
						i_9_ = 16776960;
					Class68.aClass4_Sub20_Sub12_Sub4_Sub1_1384.method577(
							Class4_Sub15.method298(i_7_, true), i + 3, i_8_,
							i_9_, 0);
				}
				Class67.method1087(-30024, Class4_Sub20_Sub17.anInt3195,
						Class63.anInt1243, Class45.anInt926,
						Class4_Sub1.anInt1860);
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "df.J("
					+ arg0 + ')');
		}
	}

	public static int method703(int arg0, int arg1) {
		try {
			arg1 = (arg1 & 0x55555555) - -(~0x2aaaaaaa & arg1 >>> -307596799);
			arg1 = ((~0x33333330 & arg1) >>> 1965635618) + (arg0 & arg1);
			anInt401++;
			arg1 = 0xf0f0f0f & arg1 - -(arg1 >>> -1956577276);
			arg1 += arg1 >>> 835168552;
			arg1 += arg1 >>> -937050608;
			return arg1 & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("df.K("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method704(int arg0, int arg1, byte arg2, int arg3,
			int arg4) {
		do {
			try {
				if (Class4_Sub20_Sub1.anInt2734 == 0
						&& !Class4_Sub23.aBoolean2421) {
					Class4_Sub20_Sub4.method359(Class4_Sub3.aJagexString_1895,
							-arg0 + arg1, arg4 + -arg3, 35, 0, (byte) 122,
							StringUtilities.aJagexString_434);
					Class19_Sub1.anInt2526++;
				}
				anInt391++;
				int i = -1;
				for (int i_10_ = 0; i_10_ < Class4_Sub20_Sub7_Sub7.anInt3495; i_10_++) {
					int i_11_ = Class4_Sub20_Sub7_Sub7.anIntArray3479[i_10_];
					int i_12_ = i_11_ >> 1296754749 & 0x3;
					int i_13_ = (i_11_ & 0x1fffcd1f) >> -1697264210;
					int i_14_ = i_11_ & 0x7f;
					int i_15_ = (0x3fe5 & i_11_) >> 2127546567;
					if (i != i_11_) {
						i = i_11_;
						if ((i_12_ ^ 0xffffffff) == -3
								&& (Class4_Sub20_Sub7_Sub6.aClass69_3439
										.method1146(Class82.plane, i_14_,
												i_15_, i_11_)) >= 0) {
							Class4_Sub20_Sub1 class4_sub20_sub1 = Region
									.method56(true, i_13_);
							if (class4_sub20_sub1.anIntArray2732 != null)
								class4_sub20_sub1 = class4_sub20_sub1
										.method325(-95);
							if (class4_sub20_sub1 == null)
								continue;
							if ((Class4_Sub20_Sub1.anInt2734 ^ 0xffffffff) == -2) {
								Class4_Sub10.anInt2023++;
								Class4_Sub20_Sub4
										.method359(
												(Class4_Sub24
														.method639(
																(new JagexString[] {
																		Class62.aJagexString_1239,
																		StringUtilities.aJagexString_2891,
																		class4_sub20_sub1.aJagexString_2713}),
																arg2 + -906)),
												i_15_, i_14_, 15, i_11_,
												(byte) 39,
												Class57.aJagexString_1154);
							} else if (Class4_Sub23.aBoolean2421) {
								if ((Class35.anInt740 & 0x4 ^ 0xffffffff) == -5) {
									Class4_Sub20_Sub4
											.method359(
													(Class4_Sub24
															.method639(
																	(new JagexString[] {
																			Class5.aJagexString_194,
																			StringUtilities.aJagexString_2891,
																			(class4_sub20_sub1.aJagexString_2713) }),
																	arg2 + -906)),
													i_15_, i_14_, 25, i_11_,
													(byte) 118,
													Class82.aJagexString_1714);
									Class30.anInt655++;
								}
							} else {
								Class77.anInt1584++;
								JagexString[] jagexStrings = class4_sub20_sub1.aJagexStringArray2716;
								if (Class4_Sub17.aBoolean2319)
									jagexStrings = Class10.method671(false,
                                            jagexStrings);
								if (jagexStrings != null) {
									for (int i_16_ = 4; i_16_ >= 0; i_16_--) {
										if (jagexStrings[i_16_] != null) {
											Class46.anInt932++;
											int i_17_ = 0;
											if ((i_16_ ^ 0xffffffff) == -1)
												i_17_ = 12;
											if (i_16_ == 1)
												i_17_ = 36;
											if ((i_16_ ^ 0xffffffff) == -3)
												i_17_ = 14;
											if ((i_16_ ^ 0xffffffff) == -4)
												i_17_ = 13;
											if (i_16_ == 4)
												i_17_ = 1003;
											Class4_Sub20_Sub4
													.method359(
															(Class4_Sub24
																	.method639(
																			(new JagexString[] {
																					StringUtilities.aJagexString_303,
																					(class4_sub20_sub1.aJagexString_2713) }),
																			-842)),
															i_15_, i_14_,
															i_17_, i_11_,
															(byte) 54,
															jagexStrings[i_16_]);
										}
									}
								}
								Class4_Sub20_Sub4
										.method359(
												(Class4_Sub24
														.method639(
																(new JagexString[] {
																		StringUtilities.aJagexString_303,
																		class4_sub20_sub1.aJagexString_2713}),
																-842)),
												i_15_,
												i_14_,
												1005,
												class4_sub20_sub1.anInt2700 << 802017966,
												(byte) 118,
												StringUtilities.aJagexString_665);
							}
						}
						if ((i_12_ ^ 0xffffffff) == -2) {
							Npc npc = (Class57.npcs[i_13_]);
							if (((npc.npcDefinition.anInt2791) ^ 0xffffffff) == -2
									&& ((0x7f & npc.worldX) ^ 0xffffffff) == -65
									&& ((npc.worldY & 0x7f) ^ 0xffffffff) == -65) {
								for (int i_18_ = 0; ((GameShell.anInt12 ^ 0xffffffff) < (i_18_ ^ 0xffffffff)); i_18_++) {
									Npc npc_19_ = (Class57.npcs[(Class4_Sub11_Sub1.anIntArray2695[i_18_])]);
									if (npc_19_ != null
											&& (npc_19_ != npc)
											&& ((npc_19_.npcDefinition.anInt2791) ^ 0xffffffff) == -2
											&& ((npc.worldX) == (npc_19_.worldX))
											&& ((npc.worldY) == (npc_19_.worldY)))
										Class42.method946(
												(npc_19_.npcDefinition),
												i_14_,
												1170,
												i_15_,
												(Class4_Sub11_Sub1.anIntArray2695[i_18_]));
								}
								for (int i_20_ = 0; i_20_ < Class4_Sub20_Sub7_Sub6.anInt3431; i_20_++) {
									Player player = (Class4_Sub20_Sub7_Sub4.aPlayerArray3358[(Class4_Sub23.anIntArray2432[i_20_])]);
									if (player != null
											&& (((player.worldX) ^ 0xffffffff) == ((npc.worldX) ^ 0xffffffff))
											&& (((player.worldY) ^ 0xffffffff) == ((npc.worldY) ^ 0xffffffff)))
										Class2.method42(
												30345,
												player,
												i_14_,
												i_15_,
												(Class4_Sub23.anIntArray2432[i_20_]));
								}
							}
							Class42.method946(
									(npc.npcDefinition),
									i_14_, arg2 ^ 0x4d2, i_15_, i_13_);
						}
						if ((i_12_ ^ 0xffffffff) == -1) {
							Player player = (Class4_Sub20_Sub7_Sub4.aPlayerArray3358[i_13_]);
							if ((player.worldX & 0x7f ^ 0xffffffff) == -65
									&& (player.worldY & 0x7f) == 64) {
								for (int i_21_ = 0; i_21_ < GameShell.anInt12; i_21_++) {
									Npc npc = (Class57.npcs[(Class4_Sub11_Sub1.anIntArray2695[i_21_])]);
									if (npc != null
											&& ((npc.npcDefinition.anInt2791) ^ 0xffffffff) == -2
											&& (((player.worldX) ^ 0xffffffff) == ((npc.worldX) ^ 0xffffffff))
											&& ((player.worldY) == (npc.worldY)))
										Class42.method946(
												(npc.npcDefinition),
												i_14_,
												1170,
												i_15_,
												(Class4_Sub11_Sub1.anIntArray2695[i_21_]));
								}
								for (int i_22_ = 0; i_22_ < Class4_Sub20_Sub7_Sub6.anInt3431; i_22_++) {
									Player player_23_ = (Class4_Sub20_Sub7_Sub4.aPlayerArray3358[(Class4_Sub23.anIntArray2432[i_22_])]);
									if (player_23_ != null
											&& (player_23_ != player)
											&& ((player.worldX) == (player_23_.worldX))
											&& ((player.worldY) == (player_23_.worldY)))
										Class2.method42(
												30345,
												player_23_,
												i_14_,
												i_15_,
												(Class4_Sub23.anIntArray2432[i_22_]));
								}
							}
							Class2.method42(30345, player,
									i_14_, i_15_, i_13_);
						}
						if ((i_12_ ^ 0xffffffff) == -4) {
							Class65 class65 = (Class40.aClass65ArrayArrayArray787[Class82.plane][i_14_][i_15_]);
							if (class65 != null) {
								for (Class4_Sub20_Sub7_Sub4 class4_sub20_sub7_sub4 = ((Class4_Sub20_Sub7_Sub4) class65
										.method1078(0)); class4_sub20_sub7_sub4 != null; class4_sub20_sub7_sub4 = ((Class4_Sub20_Sub7_Sub4) class65
										.method1067(false))) {
									ItemDefinition itemDefinition = (Class4_Sub23
											.method633(
													class4_sub20_sub7_sub4.anInt3379,
													(byte) -112));
									if (Class4_Sub20_Sub1.anInt2734 != 1) {
										if (Class4_Sub23.aBoolean2421) {
											if ((0x1 & Class35.anInt740) == 1) {
												Class30.anInt656++;
												Class4_Sub20_Sub4
														.method359(
																(Class4_Sub24
																		.method639(
																				(new JagexString[] {
																						Class5.aJagexString_194,
																						StringUtilities.aJagexString_842,
																						(itemDefinition.name) }),
																				-842)),
																i_15_,
																i_14_,
																11,
																(class4_sub20_sub7_sub4.anInt3379),
																(byte) 71,
																Class82.aJagexString_1714);
											}
										} else {
											Class43.anInt883++;
											JagexString[] jagexStrings = (itemDefinition.ops);
											if (Class4_Sub17.aBoolean2319)
												jagexStrings = (Class10.method671(
														false, jagexStrings));
											for (int i_24_ = 4; i_24_ >= 0; i_24_--) {
												if (jagexStrings != null
														&& (jagexStrings[i_24_] != null)) {
													int i_25_ = 0;
													if ((i_24_ ^ 0xffffffff) == -1)
														i_25_ = 1;
													if ((i_24_ ^ 0xffffffff) == -2)
														i_25_ = 42;
													if (i_24_ == 2)
														i_25_ = 32;
													if ((i_24_ ^ 0xffffffff) == -4)
														i_25_ = 6;
													if (i_24_ == 4)
														i_25_ = 22;
													Class4_Sub20_Sub4
															.method359(
																	(Class4_Sub24
																			.method639(
																					(new JagexString[] {
																							(Class62.aJagexString_1230),
																							(itemDefinition.name) }),
																					arg2
																							^ ~0x309)),
																	i_15_,
																	i_14_,
																	i_25_,
																	(class4_sub20_sub7_sub4.anInt3379),
																	(byte) 115,
																	jagexStrings[i_24_]);
												} else if ((i_24_ ^ 0xffffffff) == -3) {
													Class4_Sub20_Sub3.anInt2802++;
													Class4_Sub20_Sub4
															.method359(
																	(Class4_Sub24
																			.method639(
																					(new JagexString[] {
																							(Class62.aJagexString_1230),
																							(itemDefinition.name) }),
																					arg2
																							^ ~0x309)),
																	i_15_,
																	i_14_,
																	32,
																	(class4_sub20_sub7_sub4.anInt3379),
																	(byte) 34,
																	(Class4_Sub6.localizedTake));
												}
											}
											Class4_Sub20_Sub4
													.method359(
															(Class4_Sub24
																	.method639(
																			(new JagexString[] {
																					Class62.aJagexString_1230,
																					(itemDefinition.name) }),
																			arg2
																					+ -906)),
															i_15_,
															i_14_,
															1001,
															(class4_sub20_sub7_sub4.anInt3379),
															(byte) 79,
															StringUtilities.aJagexString_665);
										}
									} else {
										Class4_Sub20_Sub4
												.method359(
														(Class4_Sub24
																.method639(
																		(new JagexString[] {
																				Class62.aJagexString_1239,
																				StringUtilities.aJagexString_842,
																				(itemDefinition.name) }),
																		-842)),
														i_15_,
														i_14_,
														9,
														class4_sub20_sub7_sub4.anInt3379,
														(byte) 93,
														Class57.aJagexString_1154);
										RS2Font.anInt2781++;
									}
								}
							}
						}
					}
				}
				if (arg2 == 64)
					break;
			} catch (RuntimeException runtimeexception) {
				throw JagexException.create(runtimeexception,
						("df.I(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
								+ ',' + arg4 + ')'));
			}
			break;
		} while (false);
	}

	public static void method706(byte arg0) {
		try {
			aClass66_408 = null;
			StringUtilities.aJagexString_390 = null;
			StringUtilities.aJagexString_407 = null;
			StringUtilities.aJagexString_398 = null;
			StringUtilities.aJagexString_393 = null;
			StringUtilities.aJagexString_402 = null;
			anIntArray392 = null;
			if (arg0 < 17)
				method701(101);
			StringUtilities.aJagexString_396 = null;
			StringUtilities.aJagexString_413 = null;
			StringUtilities.aJagexString_397 = null;
			StringUtilities.aJagexString_400 = null;
			StringUtilities.aJagexString_411 = null;
			StringUtilities.aJagexString_403 = null;
			aImageRGBArray405 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "df.L("
					+ arg0 + ')');
		}
	}

	public abstract void method699(int i);

	public abstract int method705(boolean bool, int i, int i_26_);
}
