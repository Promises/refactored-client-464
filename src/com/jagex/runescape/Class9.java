package com.jagex.runescape;

public class Class9 {
	public static byte aByte280;
	public static Class19 aClass19_275;
	public static JagexString aJagexString_269 = JagexString.getRs2PreparedString(
			"scape main");
	public static JagexString aJagexString_278;
	public static RSInterface aClass4_Sub13_285;
	public static Class66 aClass66_277;
	public static volatile long aLong281;
	public static long[] aLongArray284;
	public static int anInt266;
	public static int anInt268;
	public static int anInt270;
	public static int anInt273;
	public static int anInt276;
	public static int anInt283;
	public static int[][] anIntArrayArray274 = new int[104][104];
	public static short[] aShortArray272;
	static {
		aShortArray272 = new short[] { -1, 9104, -1, -1, -1 };
		GameShell.lastClick = 0L;
		aJagexString_278 = JagexString.getRs2PreparedString("<col=40ff00>");
		aLong281 = 0L;
		aByte280 = (byte) 0;
		aLongArray284 = new long[100];
		aClass66_277 = new Class66(100);
	}

	public static void method661(RSInterface[] interfaces, int arg1, int arg2,
			int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		Class4_Sub20_Sub12.method492(arg8, arg6, arg3, arg1);
		anInt266++;
		Class4_Sub20_Sub12_Sub3.method543();
		for (int i = 0; (i ^ 0xffffffff) > (interfaces.length ^ 0xffffffff); i++) {
			RSInterface rsInterface = interfaces[i];
			if (rsInterface != null
					&& (rsInterface.anInt2183 == arg7 || (arg7 == -1412584499 && (Class4_Sub20_Sub16.aClass4_Sub13_3179 == rsInterface)))) {
				int i_0_;
				if ((arg5 ^ 0xffffffff) != 0)
					i_0_ = arg5;
				else {
					Class24.anIntArray568[SceneGraph.anInt2493] = arg4
							+ rsInterface.anInt2181;
					Class42.anIntArray852[SceneGraph.anInt2493] = rsInterface.anInt2212
							- -arg2;
					Class77.anIntArray1585[SceneGraph.anInt2493] = rsInterface.anInt2156;
					Class4_Sub20_Sub7_Sub1.anIntArray3268[(SceneGraph.anInt2493)] = rsInterface.anInt2185;
					i_0_ = SceneGraph.anInt2493++;
				}
				rsInterface.anInt2193 = i_0_;
				rsInterface.anInt2235 = Region.anInt134;
				if (!rsInterface.aBoolean2178
						|| !Class53.method1005(110, rsInterface)) {
					if ((rsInterface.anInt2227 ^ 0xffffffff) < -1)
						Class71.method1153(127, rsInterface);
					int i_1_ = rsInterface.anInt2181 - -arg4;
					int i_2_ = rsInterface.anInt2212 + arg2;
					int i_3_ = rsInterface.anInt2266;
					if (rsInterface == Class4_Sub20_Sub16.aClass4_Sub13_3179) {
						if ((arg7 ^ 0xffffffff) != 1412584498
								&& !rsInterface.aBoolean2160) {
							Class4_Sub10.anInt2027 = arg2;
							Class4_Sub20_Sub7_Sub4.aClass4_Sub13Array3377 = interfaces;
							Class1.anInt62 = arg4;
							continue;
						}
						if (Class4_Sub6.aBoolean1922 && Class33.aBoolean711) {
							int i_4_ = Class37.anInt767;
							int i_5_ = Class4_Sub1.anInt1859;
							i_4_ -= Class74.anInt1513;
							i_5_ -= Class72.anInt1494;
							if ((i_5_ ^ 0xffffffff) > (Class4_Sub20_Sub7.anInt2941 ^ 0xffffffff))
								i_5_ = Class4_Sub20_Sub7.anInt2941;
							if (Class4_Sub20_Sub1.anInt2740 > i_4_)
								i_4_ = Class4_Sub20_Sub1.anInt2740;
							if (((Class58.aClass4_Sub13_1159.anInt2156 + Class4_Sub20_Sub1.anInt2740) ^ 0xffffffff) > (i_4_
									- -rsInterface.anInt2156 ^ 0xffffffff))
								i_4_ = (-rsInterface.anInt2156 + (Class58.aClass4_Sub13_1159.anInt2156 + Class4_Sub20_Sub1.anInt2740));
							if (rsInterface.anInt2185 + i_5_ > (Class58.aClass4_Sub13_1159.anInt2185 + Class4_Sub20_Sub7.anInt2941))
								i_5_ = (Class4_Sub20_Sub7.anInt2941 + (Class58.aClass4_Sub13_1159.anInt2185 - rsInterface.anInt2185));
							i_2_ = i_5_;
							i_1_ = i_4_;
						}
						if (!rsInterface.aBoolean2160)
							i_3_ = 128;
					}
					int i_6_;
					int i_7_;
					int i_8_;
					int i_9_;
					if ((rsInterface.anInt2258 ^ 0xffffffff) != -3) {
						if ((rsInterface.anInt2258 ^ 0xffffffff) == -10) {
							int i_10_ = i_1_;
							int i_11_ = i_2_ - -rsInterface.anInt2185;
							int i_12_ = i_1_ + rsInterface.anInt2156;
							if (i_10_ > i_12_) {
								int i_13_ = i_10_;
								i_10_ = i_12_;
								i_12_ = i_13_;
							}
							i_12_++;
							i_7_ = ((arg8 ^ 0xffffffff) <= (i_10_ ^ 0xffffffff) ? arg8
									: i_10_);
							int i_14_ = i_2_;
							i_9_ = ((arg3 ^ 0xffffffff) < (i_12_ ^ 0xffffffff) ? i_12_
									: arg3);
							if ((i_11_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
								int i_15_ = i_14_;
								i_14_ = i_11_;
								i_11_ = i_15_;
							}
							i_11_++;
							i_6_ = ((arg6 ^ 0xffffffff) > (i_14_ ^ 0xffffffff) ? i_14_
									: arg6);
							i_8_ = ((arg1 ^ 0xffffffff) < (i_11_ ^ 0xffffffff) ? i_11_
									: arg1);
						} else {
							i_6_ = i_2_ <= arg6 ? arg6 : i_2_;
							i_7_ = i_1_ <= arg8 ? arg8 : i_1_;
							int i_16_ = rsInterface.anInt2185 + i_2_;
							i_8_ = ((i_16_ ^ 0xffffffff) > (arg1 ^ 0xffffffff) ? i_16_
									: arg1);
							int i_17_ = i_1_ + rsInterface.anInt2156;
							i_9_ = arg3 > i_17_ ? i_17_ : arg3;
						}
					} else {
						i_6_ = arg6;
						i_7_ = arg8;
						i_8_ = arg1;
						i_9_ = arg3;
					}
					if (!rsInterface.aBoolean2178
							|| (i_9_ > i_7_ && (i_6_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff))) {
						if (rsInterface.anInt2227 != 0) {
							if (rsInterface.anInt2227 == 1337) {
								Class4_Sub12.anInt2128 = i_1_;
								Class40.anInt780 = i_2_;
								Class61.method1045(false, i_1_,
										rsInterface.anInt2156, i_2_,
										rsInterface.anInt2185);
								Class4_Sub20_Sub12.method492(arg8, arg6, arg3,
										arg1);
								continue;
							}
							if ((rsInterface.anInt2227 ^ 0xffffffff) == -1339) {
								Class13.method679(i_1_, i_0_, true, i_2_);
								Class4_Sub20_Sub12.method492(arg8, arg6, arg3,
										arg1);
								continue;
							}
						}
						int i_18_ = Class37.anInt767;
						int i_19_ = Class4_Sub1.anInt1859;
						if (!Class4_Sub20_Sub16.aBoolean3169
								&& (i_18_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff)
								&& i_6_ <= i_19_ && i_9_ > i_18_
								&& i_19_ < i_8_)
							Class71.method1154((byte) -108, rsInterface, -i_2_
									+ i_19_, -i_1_ + i_18_);
						if ((rsInterface.anInt2258 ^ 0xffffffff) == -1) {
							if (!rsInterface.aBoolean2178
									&& Class53.method1005(110, rsInterface)
									&& rsInterface != Class32.aClass4_Sub13_698)
								continue;
							if (!rsInterface.aBoolean2178) {
								if (rsInterface.anInt2238 > (rsInterface.anInt2206 - rsInterface.anInt2185))
									rsInterface.anInt2238 = (-rsInterface.anInt2185 + rsInterface.anInt2206);
								if (rsInterface.anInt2238 < 0)
									rsInterface.anInt2238 = 0;
							}
							method661(interfaces, i_8_, -rsInterface.anInt2238
									+ i_2_, i_9_, i_1_
									+ -rsInterface.anInt2231, i_0_, i_6_,
									rsInterface.anInt2172, i_7_, -114);
							if (rsInterface.aClass4_Sub13Array2215 != null)
								method661(rsInterface.aClass4_Sub13Array2215,
										i_8_, i_2_ + -rsInterface.anInt2238,
										i_9_, -rsInterface.anInt2231 + i_1_,
										i_0_, i_6_, rsInterface.anInt2172,
										i_7_, -108);
							Class4_Sub16 class4_sub16 = ((Class4_Sub16) (Class31.aClass16_677
									.method725((byte) 117,
											rsInterface.anInt2172)));
							if (class4_sub16 != null) {
								if (class4_sub16.anInt2306 == 0
										&& i_7_ <= Class37.anInt767
										&& ((Class4_Sub1.anInt1859 ^ 0xffffffff) <= (i_6_ ^ 0xffffffff))
										&& (i_9_ ^ 0xffffffff) < (Class37.anInt767 ^ 0xffffffff)
										&& Class4_Sub1.anInt1859 < i_8_
										&& !Class4_Sub20_Sub16.aBoolean3169
										&& !Class19_Sub1.aBoolean2538) {
									Class4_Sub20_Sub8.anInt2980 = 1;
									Class82.anIntArray1712[0] = 1007;
									Class4_Sub20_Sub8.aJagexStringArray2957[0] = Class82.aJagexString_1713;
									Class18.aJagexStringArray462[0] = Class4_Sub3.aJagexString_1895;
								}
								Region.method53(i_8_, i_1_, i_9_, i_0_, i_2_,
										i_7_, i_6_, class4_sub16.anInt2311,
										(byte) 101);
							}
							Class4_Sub20_Sub12
									.method492(arg8, arg6, arg3, arg1);
							Class4_Sub20_Sub12_Sub3.method543();
						}
						if (Class4_Sub20_Sub7_Sub3.aBooleanArray3342[i_0_]
								|| (Class52.anInt1052 ^ 0xffffffff) < -2) {
							if (rsInterface.anInt2258 == 0
									&& !rsInterface.aBoolean2178
									&& (rsInterface.anInt2185 < rsInterface.anInt2206))
								RS2Font.method345((byte) -116,
										rsInterface.anInt2238,
										rsInterface.anInt2206,
										rsInterface.anInt2156 + i_1_, i_2_,
										rsInterface.anInt2185);
							if ((rsInterface.anInt2258 ^ 0xffffffff) != -2) {
								if ((rsInterface.anInt2258 ^ 0xffffffff) == -3) {
									int i_20_ = 0;
									for (int i_21_ = 0; ((rsInterface.anInt2185 ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++) {
										for (int i_22_ = 0; rsInterface.anInt2156 > i_22_; i_22_++) {
											int i_23_ = (((32 - -rsInterface.anInt2190) * i_22_) + i_1_);
											int i_24_ = (((32 - -rsInterface.anInt2232) * i_21_) + i_2_);
											if ((i_20_ ^ 0xffffffff) > -21) {
												i_24_ += (rsInterface.anIntArray2257[i_20_]);
												i_23_ += (rsInterface.anIntArray2223[i_20_]);
											}
											if (((rsInterface.anIntArray2179[i_20_]) ^ 0xffffffff) < -1) {
												int i_25_ = -1
														+ (rsInterface.anIntArray2179[i_20_]);
												if ((32 + i_23_ > arg8
														&& ((arg3 ^ 0xffffffff) < (i_23_ ^ 0xffffffff))
														&& ((arg6 ^ 0xffffffff) > (32 + i_24_ ^ 0xffffffff)) && i_24_ < arg1)
														|| (((RS2Font.aClass4_Sub13_2763) == rsInterface) && (i_20_ == (Class4_Sub20_Sub14.anInt3139)))) {
													Class4_Sub20_Sub12_Sub2 class4_sub20_sub12_sub2;
													if ((Class4_Sub20_Sub1.anInt2734) != 1
															|| ((i_20_ ^ 0xffffffff) != ((Class43.anInt887) ^ 0xffffffff))
															|| ((Class57.anInt1142 ^ 0xffffffff) != ((rsInterface.anInt2172) ^ 0xffffffff)))
														class4_sub20_sub12_sub2 = (Class4_Sub20_Sub7_Sub4
																.method421(
																		false,
																		i_25_,
																		(rsInterface.anIntArray2216[i_20_]),
																		1,
																		(byte) -97,
																		3153952));
													else
														class4_sub20_sub12_sub2 = (Class4_Sub20_Sub7_Sub4
																.method421(
																		false,
																		i_25_,
																		(rsInterface.anIntArray2216[i_20_]),
																		2,
																		(byte) -97,
																		0));
													if (class4_sub20_sub12_sub2 == null)
														Class67.method1088(
																rsInterface);
													else if (((RS2Font.aClass4_Sub13_2763) != rsInterface)
															|| ((Class4_Sub20_Sub14.anInt3139) != i_20_)) {
														if (((Class46.rsInterface) != rsInterface)
																|| (i_20_ != (Class4_Sub20_Sub7_Sub6.anInt3443)))
															class4_sub20_sub12_sub2
																	.method532(
																			i_23_,
																			i_24_);
														else
															class4_sub20_sub12_sub2
																	.method515(
																			i_23_,
																			i_24_,
																			128);
													} else {
														int i_27_ = (-(AppletListener.anInt1464) + (Class37.anInt767));
														if (i_27_ < 5
																&& ((i_27_ ^ 0xffffffff) < 4))
															i_27_ = 0;
														int i_28_ = (-(Class58.anInt1161) + (Class4_Sub1.anInt1859));
														if (i_28_ < 5
																&& i_28_ > -5)
															i_28_ = 0;
														if (RSFont.anInt161 < 5) {
															i_28_ = 0;
															i_27_ = 0;
														}
														class4_sub20_sub12_sub2
																.method515(
																		i_27_
																				+ i_23_,
																		i_24_
																				- -i_28_,
																		128);
														if ((arg7 ^ 0xffffffff) != 0) {
															RSInterface class4_sub13_29_ = (interfaces[(0xffff & arg7)]);
															if ((i_24_ + i_28_ < (Class4_Sub20_Sub12.anInt3103))
																	&& (((class4_sub13_29_.anInt2238) ^ 0xffffffff) < -1)) {
																int i_30_ = ((Class4_Sub20_Sub6.anInt2906)
																		* (-i_28_
																				+ -i_24_ + Class4_Sub20_Sub12.anInt3103) / 3);
																if ((i_30_ ^ 0xffffffff) < ((10 * (Class4_Sub20_Sub6.anInt2906)) ^ 0xffffffff))
																	i_30_ = ((Class4_Sub20_Sub6.anInt2906) * 10);
																if ((class4_sub13_29_.anInt2238) < i_30_)
																	i_30_ = (class4_sub13_29_.anInt2238);
																class4_sub13_29_.anInt2238 -= i_30_;
																Class58.anInt1161 += i_30_;
																Class67.method1088(
																		class4_sub13_29_
                                                                );
															}
															if ((((32 + i_28_ + i_24_) ^ 0xffffffff) < ((Class4_Sub20_Sub12.anInt3100) ^ 0xffffffff))
																	&& ((-(class4_sub13_29_.anInt2185) + (class4_sub13_29_.anInt2206)) > (class4_sub13_29_.anInt2238))) {
																int i_31_ = ((Class4_Sub20_Sub6.anInt2906)
																		* (32
																				+ i_24_
																				- -i_28_ + -Class4_Sub20_Sub12.anInt3100) / 3);
																if ((i_31_ ^ 0xffffffff) < (((Class4_Sub20_Sub6.anInt2906) * 10) ^ 0xffffffff))
																	i_31_ = ((Class4_Sub20_Sub6.anInt2906) * 10);
																if ((((class4_sub13_29_.anInt2206) - ((class4_sub13_29_.anInt2185) - -class4_sub13_29_.anInt2238)) ^ 0xffffffff) > (i_31_ ^ 0xffffffff))
																	i_31_ = (-class4_sub13_29_.anInt2185 + (class4_sub13_29_.anInt2206 - class4_sub13_29_.anInt2238));
																Class58.anInt1161 -= i_31_;
																class4_sub13_29_.anInt2238 += i_31_;
																Class67.method1088(
																		class4_sub13_29_
                                                                );
															}
														}
													}
												}
											} else if (((rsInterface.anIntArray2177) != null)
													&& ((i_20_ ^ 0xffffffff) > -21)) {
												Class4_Sub20_Sub12_Sub2 class4_sub20_sub12_sub2 = (rsInterface
														.method292(i_20_,
																(byte) -107));
												if (class4_sub20_sub12_sub2 != null)
													class4_sub20_sub12_sub2
															.method532(i_23_,
																	i_24_);
												else if (Class4_Sub20_Sub13.aBoolean3116)
													Class67.method1088(
															rsInterface);
											}
											i_20_++;
										}
									}
								} else if (rsInterface.anInt2258 == 3) {
									int i_32_;
									if (!Class35.method902(rsInterface, 2)) {
										i_32_ = rsInterface.anInt2195;
										if ((rsInterface == Class32.aClass4_Sub13_698)
												&& (rsInterface.anInt2197 ^ 0xffffffff) != -1)
											i_32_ = rsInterface.anInt2197;
									} else {
										i_32_ = rsInterface.anInt2256;
										if ((rsInterface == Class32.aClass4_Sub13_698)
												&& (rsInterface.anInt2142 ^ 0xffffffff) != -1)
											i_32_ = rsInterface.anInt2142;
									}
									if ((i_3_ ^ 0xffffffff) == -1) {
										if (!rsInterface.aBoolean2165)
											Class4_Sub20_Sub12.method502(i_1_,
													i_2_,
													rsInterface.anInt2156,
													rsInterface.anInt2185,
													i_32_);
										else
											Class4_Sub20_Sub12.method488(i_1_,
													i_2_,
													rsInterface.anInt2156,
													rsInterface.anInt2185,
													i_32_);
									} else if (!rsInterface.aBoolean2165)
										Class4_Sub20_Sub12.method497(i_1_,
												i_2_, rsInterface.anInt2156,
												rsInterface.anInt2185, i_32_,
												-(i_3_ & 0xff) + 256);
									else
										Class4_Sub20_Sub12.method498(i_1_,
												i_2_, rsInterface.anInt2156,
												rsInterface.anInt2185, i_32_,
												256 + -(i_3_ & 0xff));
								} else if ((rsInterface.anInt2258 ^ 0xffffffff) == -5) {
									Class4_Sub20_Sub12_Sub4_Sub1 class4_sub20_sub12_sub4_sub1 = rsInterface
											.method289(0);
									if (class4_sub20_sub12_sub4_sub1 == null) {
										if (Class4_Sub20_Sub13.aBoolean3116)
											Class67.method1088(rsInterface);
									} else {
										JagexString jagexString = rsInterface.aJagexString_2150;
										int i_33_;
										if (Class35.method902(rsInterface, 2)) {
											i_33_ = rsInterface.anInt2256;
											if ((rsInterface == Class32.aClass4_Sub13_698)
													&& (rsInterface.anInt2142 ^ 0xffffffff) != -1)
												i_33_ = rsInterface.anInt2142;
											if ((rsInterface.aJagexString_2149
													.method825(-112) ^ 0xffffffff) < -1)
												jagexString = (rsInterface.aJagexString_2149);
										} else {
											i_33_ = rsInterface.anInt2195;
											if ((rsInterface == Class32.aClass4_Sub13_698)
													&& rsInterface.anInt2197 != 0)
												i_33_ = rsInterface.anInt2197;
										}
										if (rsInterface.aBoolean2178
												&& rsInterface.anInt2226 != -1) {
											Class4_Sub20_Sub8 class4_sub20_sub8 = (Class4_Sub23
													.method633(
															rsInterface.anInt2226,
															(byte) -105));
											jagexString = (class4_sub20_sub8.aJagexString_2991);
											if (jagexString == null)
												jagexString = (Class4_Sub24.aJagexString_2448);
											if (((class4_sub20_sub8.anInt3012 == 1) || (rsInterface.anInt2143 != 1))
													&& (rsInterface.anInt2143 != -1))
												jagexString = (Class4_Sub24
														.method639(
																(new JagexString[] {
																		(Class62.aJagexString_1230),
                                                                        jagexString,
																		(Class18.aJagexString_484),
																		(Class35.method912(
																				(byte) 97,
																				(rsInterface.anInt2143))) }),
																-842));
										}
										if (RSInterface.aClass4_Sub13_2141 == rsInterface) {
											jagexString = Class71.aJagexString_1470;
											i_33_ = rsInterface.anInt2195;
										}
										if (!rsInterface.aBoolean2178)
											jagexString = (Class65.method1076(
                                                    jagexString, rsInterface,
													false));
										class4_sub20_sub12_sub4_sub1.method566(
                                                jagexString, i_1_, i_2_,
												rsInterface.anInt2156,
												rsInterface.anInt2185, i_33_,
												(rsInterface.aBoolean2159 ? 0
														: -1),
												rsInterface.anInt2214,
												rsInterface.anInt2262,
												rsInterface.anInt2161);
									}
								} else if (rsInterface.anInt2258 == 5) {
									if (!rsInterface.aBoolean2178) {
										Class4_Sub20_Sub12_Sub2 class4_sub20_sub12_sub2 = (rsInterface
												.method286(
														1,
														Class35.method902(
																rsInterface, 2)));
										if (class4_sub20_sub12_sub2 != null)
											class4_sub20_sub12_sub2.method532(
													i_1_, i_2_);
										else if (Class4_Sub20_Sub13.aBoolean3116)
											Class67.method1088(rsInterface);
									} else {
										Class4_Sub20_Sub12_Sub2 class4_sub20_sub12_sub2;
										if (rsInterface.anInt2226 == -1)
											class4_sub20_sub12_sub2 = rsInterface
													.method286(1, false);
										else
											class4_sub20_sub12_sub2 = (Class4_Sub20_Sub7_Sub4
													.method421(
															false,
															rsInterface.anInt2226,
															rsInterface.anInt2143,
															rsInterface.anInt2201,
															(byte) -97,
															rsInterface.anInt2162));
										if (class4_sub20_sub12_sub2 == null) {
											if (Class4_Sub20_Sub13.aBoolean3116)
												Class67.method1088(
														rsInterface);
										} else {
											int i_34_ = (class4_sub20_sub12_sub2.anInt3519);
											int i_35_ = (class4_sub20_sub12_sub2.anInt3517);
											if (rsInterface.aBoolean2253) {
												Class4_Sub20_Sub12
														.method503(
																i_1_,
																i_2_,
																i_1_
																		- -(rsInterface.anInt2156),
																i_2_
																		- -(rsInterface.anInt2185));
												int i_36_ = ((-1 - (-i_34_ - (rsInterface.anInt2156))) / i_34_);
												int i_37_ = ((rsInterface.anInt2185
														- -i_35_ + -1) / i_35_);
												for (int i_38_ = 0; ((i_36_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff)); i_38_++) {
													for (int i_39_ = 0; ((i_37_ ^ 0xffffffff) < (i_39_ ^ 0xffffffff)); i_39_++) {
														if ((rsInterface.anInt2218) == 0) {
															if ((i_3_ ^ 0xffffffff) == -1)
																class4_sub20_sub12_sub2
																		.method532(
																				((i_34_ * i_38_) + i_1_),
																				((i_35_ * i_39_) + i_2_));
															else
																class4_sub20_sub12_sub2
																		.method515(
																				(i_1_ - -(i_38_ * i_34_)),
																				(i_2_ - -(i_35_ * i_39_)),
																				(-(0xff & i_3_) + 256));
														} else
															class4_sub20_sub12_sub2
																	.method519(
																			(i_34_
																					/ 2
																					+ i_1_ + (i_34_ * i_38_)),
																			(i_35_
																					* i_39_
																					+ i_2_ - -(i_35_ / 2)),
																			(rsInterface.anInt2218),
																			4096);
													}
												}
												Class4_Sub20_Sub12.method492(
														arg8, arg6, arg3, arg1);
											} else {
												int i_40_ = (4096 * rsInterface.anInt2156 / i_34_);
												if ((rsInterface.anInt2218 ^ 0xffffffff) != -1)
													class4_sub20_sub12_sub2
															.method519(
																	i_1_
																			- -((rsInterface.anInt2156) / 2),
																	((rsInterface.anInt2185) / 2 + i_2_),
																	(rsInterface.anInt2218),
																	i_40_);
												else if (i_3_ == 0) {
													if ((rsInterface.anInt2156 == i_34_)
															&& (((rsInterface.anInt2185) ^ 0xffffffff) == (i_35_ ^ 0xffffffff)))
														class4_sub20_sub12_sub2
																.method532(
																		i_1_,
																		i_2_);
													else
														class4_sub20_sub12_sub2
																.method521(
																		i_1_,
																		i_2_,
																		(rsInterface.anInt2156),
																		(rsInterface.anInt2185));
												} else
													class4_sub20_sub12_sub2
															.method511(
																	i_1_,
																	i_2_,
																	(rsInterface.anInt2156),
																	(rsInterface.anInt2185),
																	-(0xff & i_3_) + 256);
											}
										}
									}
								} else if ((rsInterface.anInt2258 ^ 0xffffffff) == -7) {
									boolean bool = Class35.method902(
											rsInterface, 2);
									int i_41_;
									if (!bool)
										i_41_ = rsInterface.anInt2210;
									else
										i_41_ = rsInterface.anInt2173;
									int i_42_ = 0;
									Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = null;
									if (rsInterface.anInt2226 != -1) {
										Class4_Sub20_Sub8 class4_sub20_sub8 = (Class4_Sub23
												.method633(
														rsInterface.anInt2226,
														(byte) -105));
										if (class4_sub20_sub8 != null) {
											class4_sub20_sub8 = (class4_sub20_sub8
													.method469(
															0,
															rsInterface.anInt2143));
											class4_sub20_sub7_sub7 = class4_sub20_sub8
													.method461(-11, 1);
											if (class4_sub20_sub7_sub7 == null)
												Class67.method1088(
														rsInterface);
											else {
												class4_sub20_sub7_sub7
														.method446();
												i_42_ = (class4_sub20_sub7_sub7.anInt2938) / 2;
											}
										}
									} else if (rsInterface.anInt2137 == 5) {
										if (rsInterface.anInt2250 == 0)
											class4_sub20_sub7_sub7 = (Class4_Sub24.aClass35_2438
													.method904(-1, null, -1,
															850, null));
										else
											class4_sub20_sub7_sub7 = Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302
													.method378(false);
									} else if (i_41_ != -1) {
										Class4_Sub20_Sub17 class4_sub20_sub17 = Class68
												.method1093(i_41_, (byte) -110);
										class4_sub20_sub7_sub7 = (rsInterface
												.method282(
														(byte) -92,
														class4_sub20_sub17,
														(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.aClass35_3609),
														bool,
														rsInterface.anInt2153));
										if (class4_sub20_sub7_sub7 == null
												&& Class4_Sub20_Sub13.aBoolean3116)
											Class67.method1088(rsInterface);
									} else {
										class4_sub20_sub7_sub7 = (rsInterface
												.method282(
														(byte) -113,
														null,
														(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.aClass35_3609),
														bool, -1));
										if (class4_sub20_sub7_sub7 == null
												&& Class4_Sub20_Sub13.aBoolean3116)
											Class67.method1088(rsInterface);
									}
									Class4_Sub20_Sub12_Sub3
											.method546(
													rsInterface.anInt2156 / 2
															+ i_1_,
													i_2_
															- -(rsInterface.anInt2185 / 2));
									int i_43_ = ((rsInterface.anInt2168 * (Class4_Sub20_Sub12_Sub3.anIntArray3524[rsInterface.anInt2213])) >> -1637374736);
									int i_44_ = (((Class4_Sub20_Sub12_Sub3.anIntArray3528[rsInterface.anInt2213]) * rsInterface.anInt2168) >> -758703024);
									if (class4_sub20_sub7_sub7 != null) {
										if (!rsInterface.aBoolean2178)
											class4_sub20_sub7_sub7.method437(0,
													rsInterface.anInt2236, 0,
													rsInterface.anInt2213, 0,
													i_43_, i_44_);
										else {
											class4_sub20_sub7_sub7.method446();
											if (!rsInterface.aBoolean2263)
												class4_sub20_sub7_sub7
														.method437(
																0,
																rsInterface.anInt2236,
																rsInterface.anInt2151,
																rsInterface.anInt2213,
																rsInterface.anInt2224,
																(rsInterface.anInt2148
																		+ i_43_ - -i_42_),
																i_44_
																		- -(rsInterface.anInt2148));
											else
												class4_sub20_sub7_sub7
														.method450(
																0,
																rsInterface.anInt2236,
																rsInterface.anInt2151,
																rsInterface.anInt2213,
																rsInterface.anInt2224,
																(i_42_ + i_43_ + (rsInterface.anInt2148)),
																i_44_
																		- -(rsInterface.anInt2148),
																rsInterface.anInt2168);
										}
									}
									Class4_Sub20_Sub12_Sub3.method554();
								} else {
									if ((rsInterface.anInt2258 ^ 0xffffffff) == -8) {
										Class4_Sub20_Sub12_Sub4_Sub1 class4_sub20_sub12_sub4_sub1 = rsInterface
												.method289(0);
										if (class4_sub20_sub12_sub4_sub1 == null) {
											if (Class4_Sub20_Sub13.aBoolean3116)
												Class67.method1088(
														rsInterface);
											continue;
										}
										int i_45_ = 0;
										for (int i_46_ = 0; ((i_46_ ^ 0xffffffff) > (rsInterface.anInt2185 ^ 0xffffffff)); i_46_++) {
											for (int i_47_ = 0; ((rsInterface.anInt2156 ^ 0xffffffff) < (i_47_ ^ 0xffffffff)); i_47_++) {
												if (((rsInterface.anIntArray2179[i_45_]) ^ 0xffffffff) < -1) {
													Class4_Sub20_Sub8 class4_sub20_sub8 = (Class4_Sub23
															.method633(
																	(rsInterface.anIntArray2179[i_45_]) - 1,
																	(byte) -123));
													JagexString jagexString;
													if ((class4_sub20_sub8.anInt3012) == 1
															|| (((rsInterface.anIntArray2216[i_45_]) ^ 0xffffffff) != -2))
														jagexString = (Class4_Sub24
																.method639(
																		(new JagexString[] {
																				(Class62.aJagexString_1230),
																				(class4_sub20_sub8.aJagexString_2991),
																				(Class18.aJagexString_484),
																				(Class35.method912(
																						(byte) 83,
																						(rsInterface.anIntArray2216[i_45_]))) }),
																		-842));
													else
														jagexString = (Class4_Sub24
																.method639(
																		(new JagexString[] {
																				(Class62.aJagexString_1230),
																				(class4_sub20_sub8.aJagexString_2991),
																				(Class8.aJagexString_240) }),
																		-842));
													int i_48_ = ((i_47_ * ((rsInterface.anInt2190) + 115)) + i_1_);
													int i_49_ = (i_2_ - -(i_46_ * (12 - -(rsInterface.anInt2232))));
													if (rsInterface.anInt2214 != 0) {
														if (((rsInterface.anInt2214) ^ 0xffffffff) == -2)
															class4_sub20_sub12_sub4_sub1
																	.method571(
                                                                            jagexString,
																			((rsInterface.anInt2156) / 2)
																					+ i_48_,
																			i_49_,
																			(rsInterface.anInt2195),
																			(!(rsInterface.aBoolean2159) ? -1
																					: 0));
														else
															class4_sub20_sub12_sub4_sub1
																	.method557(
                                                                            jagexString,
																			(i_48_ + ((rsInterface.anInt2156) + -1)),
																			i_49_,
																			(rsInterface.anInt2195),
																			(!(rsInterface.aBoolean2159) ? -1
																					: 0));
													} else
														class4_sub20_sub12_sub4_sub1
																.method577(
                                                                        jagexString,
																		i_48_,
																		i_49_,
																		(rsInterface.anInt2195),
																		(!(rsInterface.aBoolean2159) ? -1
																				: 0));
												}
												i_45_++;
											}
										}
									}
									if (rsInterface.anInt2258 == 8
											&& ((Class4_Sub20_Sub10.aClass4_Sub13_3064) == rsInterface)
											&& (Class78.anInt1598 == Class5.anInt196)) {
										int i_50_ = 0;
										Class4_Sub20_Sub12_Sub4_Sub1 class4_sub20_sub12_sub4_sub1 = (Class4_Sub15.aClass4_Sub20_Sub12_Sub4_Sub1_2289);
										int i_51_ = 0;
										JagexString jagexString = rsInterface.aJagexString_2150;
										jagexString = Class65.method1076(jagexString,
												rsInterface, false);
										while (jagexString.method825(-120) > 0) {
											int i_52_ = (jagexString.method803(
													Class11.aJagexString_316,
													(byte) 122));
											JagexString jagexString_53_;
											if (i_52_ != -1) {
												jagexString_53_ = (jagexString
														.method829((byte) -112,
																0, i_52_));
												jagexString = jagexString.method805(
														(i_52_ - -4), -47);
											} else {
												jagexString_53_ = jagexString;
												jagexString = (Class4_Sub3.aJagexString_1895);
											}
											int i_54_ = class4_sub20_sub12_sub4_sub1
													.method560(jagexString_53_);
											if (i_51_ < i_54_)
												i_51_ = i_54_;
											i_50_ += (1 + (class4_sub20_sub12_sub4_sub1.anInt3546));
										}
										i_51_ += 6;
										i_50_ += 7;
										int i_55_ = (-i_51_ + (i_1_ + (rsInterface.anInt2156 + -5)));
										int i_56_ = 5 + (rsInterface.anInt2185 + i_2_);
										if ((i_55_ ^ 0xffffffff) > (i_1_ + 5 ^ 0xffffffff))
											i_55_ = 5 + i_1_;
										if ((arg3 ^ 0xffffffff) > (i_55_
												+ i_51_ ^ 0xffffffff))
											i_55_ = -i_51_ + arg3;
										if (arg1 < i_56_ + i_50_)
											i_56_ = -i_50_ + arg1;
										Class4_Sub20_Sub12.method488(i_55_,
												i_56_, i_51_, i_50_, 16777120);
										Class4_Sub20_Sub12.method502(i_55_,
												i_56_, i_51_, i_50_, 0);
										int i_57_ = ((class4_sub20_sub12_sub4_sub1.anInt3546)
												+ i_56_ - -2);
										jagexString = rsInterface.aJagexString_2150;
										jagexString = Class65.method1076(jagexString,
												rsInterface, false);
										while ((jagexString.method825(-110) ^ 0xffffffff) < -1) {
											int i_58_ = (jagexString.method803(
													Class11.aJagexString_316,
													(byte) 119));
											JagexString jagexString_59_;
											if (i_58_ != -1) {
												jagexString_59_ = (jagexString
														.method829((byte) -120,
																0, i_58_));
												jagexString = (jagexString.method805(
														4 + i_58_, 121));
											} else {
												jagexString_59_ = jagexString;
												jagexString = (Class4_Sub3.aJagexString_1895);
											}
											class4_sub20_sub12_sub4_sub1
													.method577(jagexString_59_,
															3 + i_55_, i_57_,
															0, -1);
											i_57_ += (class4_sub20_sub12_sub4_sub1.anInt3546)
													- -1;
										}
									}
									if (rsInterface.anInt2258 == 9) {
										if (rsInterface.anInt2199 == 1)
											Class4_Sub20_Sub12
													.method501(
															i_1_,
															i_2_,
															i_1_
																	+ rsInterface.anInt2156,
															rsInterface.anInt2185
																	+ i_2_,
															rsInterface.anInt2195);
										else {
											int i_60_ = (rsInterface.anInt2156 >= 0 ? rsInterface.anInt2156
													: -rsInterface.anInt2156);
											int i_61_ = ((rsInterface.anInt2185 ^ 0xffffffff) <= -1 ? rsInterface.anInt2185
													: -rsInterface.anInt2185);
											int i_62_ = i_60_;
											if ((i_61_ ^ 0xffffffff) < (i_62_ ^ 0xffffffff))
												i_62_ = i_61_;
											if (i_62_ != 0) {
												int i_63_ = ((rsInterface.anInt2156 << -193024016) / i_62_);
												int i_64_ = ((rsInterface.anInt2185 << -2127090384) / i_62_);
												if (i_63_ < i_64_)
													i_64_ = -i_64_;
												else
													i_63_ = -i_63_;
												int i_65_ = (1
														+ (rsInterface.anInt2199)
														* i_64_ >> -178932271);
												int i_66_ = ((rsInterface.anInt2199 * i_63_) >> 10206993);
												int i_67_ = (i_64_
														* (rsInterface.anInt2199) >> -1056030639);
												int i_68_ = -i_65_ + i_1_;
												int i_69_ = i_1_ + i_67_;
												int i_70_ = (rsInterface.anInt2156
														+ i_1_ - i_65_);
												int i_71_ = i_1_
														+ ((rsInterface.anInt2156) - -i_67_);
												int i_72_ = i_2_ - -i_66_;
												int i_73_ = ((1 + i_63_
														* (rsInterface.anInt2199)) >> -889056367);
												int i_74_ = -i_73_ + i_2_;
												int i_75_ = (-i_73_
														+ rsInterface.anInt2185 + i_2_);
												int i_76_ = i_2_
														- (-(rsInterface.anInt2185) + -i_66_);
												Class4_Sub20_Sub12_Sub3
														.method545(i_69_,
																i_68_, i_70_);
												Class4_Sub20_Sub12_Sub3
														.method547(
																i_72_,
																i_74_,
																i_75_,
																i_69_,
																i_68_,
																i_70_,
																rsInterface.anInt2195);
												Class4_Sub20_Sub12_Sub3
														.method545(i_69_,
																i_70_, i_71_);
												Class4_Sub20_Sub12_Sub3
														.method547(
																i_72_,
																i_75_,
																i_76_,
																i_69_,
																i_70_,
																i_71_,
																rsInterface.anInt2195);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (arg9 >= -106)
			method661(null, -21, -53, 27, -107, 49, 16, -52, -99, 14);
	}

	public static void method662(int arg0, int arg1, int arg2) {
		anInt268++;
		if (arg2 == -27222 && Class57.anInt1141 == 2) {
			Class63.method1053(
					(Class11.anInt329 + (-Class6.anInt217 + Class76.anInt1582 << -1544118329)),
					false,
					2 * Class4_Sub17.anInt2329,
					((-Class4_Sub20_Sub8.anInt2987 + Class76.anInt1550) << 588365671)
							- -Class11.anInt320);
			if (Class27.anInt604 > -1 && Region.anInt134 % 20 < 10)
				Class14.aClass4_Sub20_Sub12_Sub2Array405[0].method532(-12
						+ Class27.anInt604 + arg0, arg1
						- -SceneGraph.anInt2502 - 28);
		}
	}

	public static void method663(int arg0) {
		try {
			if (arg0 != -18722)
				method665(-61, -38);
			Class13_Sub2.aClass66_2468.method1084(0);
			anInt273++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "c.D("
					+ arg0 + ')');
		}
	}

	public static void method664(byte arg0) {
		try {
			anIntArrayArray274 = null;
			aClass19_275 = null;
			aJagexString_269 = null;
			if (arg0 <= 7)
				GameShell.lastClick = -112L;
			aShortArray272 = null;
			aClass66_277 = null;
			aJagexString_278 = null;
			aClass4_Sub13_285 = null;
			aLongArray284 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "c.B("
					+ arg0 + ')');
		}
	}

	public static void method665(int arg0, int arg1) {
		try {
			anInt283++;
			if (arg0 >= -120)
				method662(-36, 63, -69);
			if ((arg1 ^ 0xffffffff) == 2)
				Class4_Sub20_Sub9.method477(Class14.aJagexString_398, 16,
						Class4_Sub6.aJagexString_1942, Class81.aJagexString_1675);
			else if (arg1 == -2)
				Class4_Sub20_Sub9.method477(Class52.aJagexString_1051, 74,
						Class81.aJagexString_1679, Class81.aJagexString_1655);
			else if ((arg1 ^ 0xffffffff) != 0) {
				if ((arg1 ^ 0xffffffff) == -4)
					Class4_Sub20_Sub9.method477(
							(Class4_Sub20_Sub16.aJagexString_3165), 62,
							Class81.aJagexString_1699, Class81.aJagexString_1702);
				else if (arg1 == 4)
					Class4_Sub20_Sub9.method477(
							(Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3623), 100,
							Class72.aJagexString_1489, Class81.aJagexString_1705);
				else if (arg1 != 5) {
					if (arg1 != 6) {
						if ((arg1 ^ 0xffffffff) != -8) {
							if ((arg1 ^ 0xffffffff) == -9)
								Class4_Sub20_Sub9.method477(
										Class43.aJagexString_905, 110,
										Class4_Sub20_Sub14.aJagexString_3147,
										Class81.aJagexString_1706);
							else if (arg1 == 9)
								Class4_Sub20_Sub9.method477(
										Class67.aJagexString_1360, 44,
										RSFont.aJagexString_153,
										Class81.aJagexString_1692);
							else if (arg1 == 10)
								Class4_Sub20_Sub9.method477(
										Class31.aJagexString_692, 75,
										Class4_Sub20_Sub14.aJagexString_3136,
										Class81.aJagexString_1662);
							else if (arg1 != 11) {
								if (arg1 == 12)
									Class4_Sub20_Sub9.method477(
											Class37.aJagexString_765, 31,
											Class52.aJagexString_1055,
											Class81.aJagexString_1687);
								else if (arg1 == 13)
									Class4_Sub20_Sub9.method477(
											Class14.aJagexString_400, 19,
											Region.aJagexString_120,
											Class81.aJagexString_1669);
								else if ((arg1 ^ 0xffffffff) == -15)
									Class4_Sub20_Sub9.method477(
											Class61.aJagexString_1210, 45,
											Class4_Sub10.aJagexString_2049,
											Class81.aJagexString_1684);
								else if (arg1 == 16)
									Class4_Sub20_Sub9.method477(
											Game.aJagexString_1850, 94,
											Class53.aJagexString_1068,
											Class81.aJagexString_1668);
								else if ((arg1 ^ 0xffffffff) != -18) {
									if (arg1 == 18)
										Class4_Sub20_Sub9.method477(
												Class72.aJagexString_1485, 87,
												Class4_Sub16.aJagexString_2312,
												Class81.aJagexString_1703);
									else if ((arg1 ^ 0xffffffff) != -20) {
										if ((arg1 ^ 0xffffffff) != -21) {
											if (arg1 == 22)
												Class4_Sub20_Sub9
														.method477(
																(Class4_Sub20_Sub8.aJagexString_2996),
																7,
																Class12.aJagexString_346,
																Class81.aJagexString_1677);
											else if (arg1 != 23) {
												if (arg1 != 24) {
													if ((arg1 ^ 0xffffffff) != -26) {
														if ((arg1 ^ 0xffffffff) != -27) {
															if (arg1 == 27)
																Class4_Sub20_Sub9
																		.method477(
																				(Class12.aJagexString_363),
																				41,
																				(Class81.aJagexString_1686),
																				(Class81.aJagexString_1664));
															else
																Class4_Sub20_Sub9
																		.method477(
																				(Class14.aJagexString_397),
																				23,
																				(Class8.aJagexString_250),
																				(Class81.aJagexString_1694));
														} else
															Class4_Sub20_Sub9
																	.method477(
																			(Class43.aJagexString_867),
																			46,
																			(Class41.aJagexString_797),
																			(Class81.aJagexString_1690));
													} else
														Class4_Sub20_Sub9
																.method477(
																		(Class14.aJagexString_411),
																		110,
																		(Class4_Sub20_Sub11.aJagexString_3089),
																		(Class81.aJagexString_1663));
												} else
													Class4_Sub20_Sub9
															.method477(
																	Class48.aJagexString_985,
																	18,
																	Class13.aJagexString_370,
																	(Class81.aJagexString_1696));
											} else
												Class4_Sub20_Sub9.method477(
														Class61.aJagexString_1221,
														23,
														JagexString.aJagexString_1775,
														Class81.aJagexString_1658);
										} else
											Class4_Sub20_Sub9.method477(
													Class14.aJagexString_396, 73,
													Class30.aJagexString_651,
													Class81.aJagexString_1680);
									} else
										Class4_Sub20_Sub9
												.method477(
														Class35.aJagexString_753,
														68,
														Class4_Sub20_Sub1.aJagexString_2731,
														(Class4_Sub20_Sub7_Sub5.aJagexString_3410));
								} else
									Class4_Sub20_Sub9.method477(
											RS2Font.aJagexString_2786,
											15, Class35.aJagexString_728,
											Class81.aJagexString_1682);
							} else
								Class4_Sub20_Sub9.method477(
										Class66.aJagexString_1319, 97,
										Class40.aJagexString_788,
										Class81.aJagexString_1657);
						} else
							Class4_Sub20_Sub9.method477(
									(Class4_Sub20_Sub7_Sub5.aJagexString_3383), 88,
									Class7.aJagexString_235, Class81.aJagexString_1676);
					} else
						Class4_Sub20_Sub9.method477(
								(Class4_Sub20_Sub6.aJagexString_2931), 93,
								SceneGraph.aJagexString_2497,
								Class81.aJagexString_1708);
				} else
					Class4_Sub20_Sub9.method477(Class18.aJagexString_470, 51,
							Game.aJagexString_1852, Class81.aJagexString_1698);
			} else
				Class4_Sub20_Sub9.method477(Class14.aJagexString_393, 127,
						Class2.aJagexString_93, Class81.aJagexString_1674);
			Region.method50(10, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("c.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean aBoolean267;

	public JagexString aJagexString_264;

	public int anInt263;

	public int anInt265;

	public int anInt271;

	public int anInt279;
}
