package com.jagex.runescape;

public class Class4_Sub3 extends RSFont {
	public static Class22 aClass22_1896;
	public static JagexString aJagexString_1888 = JagexString.getRs2PreparedString(
			"leuchten3:");
	public static JagexString aJagexString_1895;
	public static JagexString aJagexString_1899;
	public static JagexString aJagexString_1903;
	public static JagexString aJagexString_1907;
	public static JagexString aJagexString_1911;
	public static JagexString aJagexString_1912;
	public static Class66 aClass66_1882 = new Class66(64);
	public static Class66 aClass66_1902;
	public static int anInt1875;
	public static int anInt1876;
	public static int anInt1880;
	public static int anInt1900;
	public static short[][] aShortArrayArray1886;
	static {
		aShortArrayArray1886 = new short[][] { new short[0], new short[0],
				new short[0], new short[0], new short[0] };
		aJagexString_1895 = JagexString.getRs2PreparedString("");
		aJagexString_1899 = JagexString.getRs2PreparedString("Untersuchen");
		aJagexString_1903 = aJagexString_1895;
		aClass66_1902 = new Class66(260);
		aJagexString_1911 = JagexString.getRs2PreparedString("Loaded fonts");
		aJagexString_1912 = (JagexString.getRs2PreparedString(
				"Bitte geben Sie Ihren Benutzenamen ein)3"));
		aJagexString_1907 = aJagexString_1911;
	}

	public static void method173(int arg0, int arg1, RSInterface[] arg2) {
		anInt1900++;
		for (int i = 0; arg2.length > i; i++) {
			RSInterface class4_sub13 = arg2[i];
			if (class4_sub13 != null
					&& arg0 == class4_sub13.anInt2183
					&& (!class4_sub13.aBoolean2178 || !Class53.method1005(110,
							class4_sub13))) {
				if ((class4_sub13.anInt2258 ^ 0xffffffff) == -1) {
					if (!class4_sub13.aBoolean2178
							&& Class53.method1005(116, class4_sub13)
							&& class4_sub13 != Class32.aClass4_Sub13_698)
						continue;
					method173(class4_sub13.anInt2172, arg1, arg2);
					if (class4_sub13.aClass4_Sub13Array2215 != null)
						method173(class4_sub13.anInt2172, 31,
								class4_sub13.aClass4_Sub13Array2215);
					Class4_Sub16 class4_sub16 = ((Class4_Sub16) (Class31.aClass16_677
							.method725((byte) 117, class4_sub13.anInt2172)));
					if (class4_sub16 != null)
						Player.method390(
								class4_sub16.anInt2311, arg1 ^ ~0x4f6d);
				}
				if (class4_sub13.anInt2258 == 6) {
					if ((class4_sub13.anInt2210 ^ 0xffffffff) != 0
							|| class4_sub13.anInt2173 != -1) {
						boolean bool = Class35.method902(class4_sub13, 2);
						int i_0_;
						if (bool)
							i_0_ = class4_sub13.anInt2173;
						else
							i_0_ = class4_sub13.anInt2210;
						if ((i_0_ ^ 0xffffffff) != 0) {
							Class4_Sub20_Sub17 class4_sub20_sub17 = Class68
									.method1093(i_0_, (byte) -109);
							class4_sub13.anInt2241 += Class4_Sub20_Sub6.anInt2906;
							while (((class4_sub20_sub17.anIntArray3200[class4_sub13.anInt2153]) ^ 0xffffffff) > (class4_sub13.anInt2241 ^ 0xffffffff)) {
								class4_sub13.anInt2241 -= (class4_sub20_sub17.anIntArray3200[class4_sub13.anInt2153]);
								class4_sub13.anInt2153++;
								if ((class4_sub13.anInt2153 ^ 0xffffffff) <= ((class4_sub20_sub17.anIntArray3211).length ^ 0xffffffff)) {
									class4_sub13.anInt2153 -= class4_sub20_sub17.anInt3202;
									if (class4_sub13.anInt2153 < 0
											|| ((class4_sub20_sub17.anIntArray3211).length <= class4_sub13.anInt2153))
										class4_sub13.anInt2153 = 0;
								}
								Class67.method1088(class4_sub13);
							}
						}
					}
					if ((class4_sub13.anInt2245 ^ 0xffffffff) != -1
							&& !class4_sub13.aBoolean2178) {
						int i_1_ = class4_sub13.anInt2245 >> 574531184;
						i_1_ *= Class4_Sub20_Sub6.anInt2906;
						class4_sub13.anInt2213 = i_1_ + class4_sub13.anInt2213
								& 0x7ff;
						int i_2_ = (class4_sub13.anInt2245 << 176389488 >> -519421328);
						i_2_ *= Class4_Sub20_Sub6.anInt2906;
						class4_sub13.anInt2236 = 0x7ff & i_2_
								+ class4_sub13.anInt2236;
						Class67.method1088(class4_sub13);
					}
				}
			}
		}
		if (arg1 != 31)
			method175(-35, 104, -116, null, -107, -109, -48, -35, -39);
	}

	public static void method174(byte arg0, int arg1) {
		try {
			anInt1880++;
			for (Class4_Sub15 class4_sub15 = ((Class4_Sub15) Class64.aClass16_1259
					.method724((byte) -61)); class4_sub15 != null; class4_sub15 = (Class4_Sub15) Class64.aClass16_1259
					.method723((byte) -25)) {
				if ((class4_sub15.aLong150 >> -358625744 & 0xffffL ^ 0xffffffffffffffffL) == (arg1 ^ 0xffffffffffffffffL))
					class4_sub15.clear();
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("db.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method175(int arg0, int arg1, int arg2,
			RSInterface[] arg3, int arg4, int arg5, int arg6, int arg7,
			int arg8) {
		try {
			if (arg4 < 94)
				aClass66_1882 = null;
			anInt1875++;
			int i = 0;
			for (/**/; arg3.length > i; i++) {
				RSInterface class4_sub13 = arg3[i];
				if (class4_sub13 != null
						&& (!class4_sub13.aBoolean2178
								|| (class4_sub13.anInt2258 ^ 0xffffffff) == -1
								|| class4_sub13.aBoolean2237
								|| Class54.method1011(class4_sub13, -22389) != 0 || class4_sub13 == Class58.aClass4_Sub13_1159)
						&& class4_sub13.anInt2183 == arg8
						&& (!class4_sub13.aBoolean2178 || !Class53.method1005(
								114, class4_sub13))) {
					int i_3_ = arg1 + class4_sub13.anInt2212;
					int i_4_ = class4_sub13.anInt2181 + arg0;
					if (Class4_Sub20_Sub16.aClass4_Sub13_3179 == class4_sub13) {
						Class33.anInt714 = i_4_;
						Actor.anInt3287 = i_3_;
						Class57.aBoolean1132 = true;
					}
					int i_5_;
					int i_6_;
					int i_7_;
					int i_8_;
					if ((class4_sub13.anInt2258 ^ 0xffffffff) != -3) {
						if ((class4_sub13.anInt2258 ^ 0xffffffff) != -10) {
							i_8_ = i_4_ > arg7 ? i_4_ : arg7;
							int i_9_ = i_4_ - -class4_sub13.anInt2156;
							i_7_ = ((arg5 ^ 0xffffffff) >= (i_9_ ^ 0xffffffff) ? arg5
									: i_9_);
							i_5_ = ((i_3_ ^ 0xffffffff) >= (arg2 ^ 0xffffffff) ? arg2
									: i_3_);
							int i_10_ = class4_sub13.anInt2185 + i_3_;
							i_6_ = ((arg6 ^ 0xffffffff) >= (i_10_ ^ 0xffffffff) ? arg6
									: i_10_);
						} else {
							int i_11_ = i_4_;
							int i_12_ = class4_sub13.anInt2156 + i_4_;
							int i_13_ = i_3_;
							int i_14_ = i_3_ - -class4_sub13.anInt2185;
							if (i_11_ > i_12_) {
								int i_15_ = i_11_;
								i_11_ = i_12_;
								i_12_ = i_15_;
							}
							if ((i_14_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
								int i_16_ = i_13_;
								i_13_ = i_14_;
								i_14_ = i_16_;
							}
							i_14_++;
							i_12_++;
							i_7_ = arg5 <= i_12_ ? arg5 : i_12_;
							i_5_ = arg2 < i_13_ ? i_13_ : arg2;
							i_6_ = arg6 > i_14_ ? i_14_ : arg6;
							i_8_ = i_11_ <= arg7 ? arg7 : i_11_;
						}
					} else {
						i_5_ = arg2;
						i_6_ = arg6;
						i_7_ = arg5;
						i_8_ = arg7;
					}
					if (!class4_sub13.aBoolean2178
							|| ((i_8_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff) && (i_6_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff))) {
						if ((class4_sub13.anInt2227 ^ 0xffffffff) == -1338)
							Class67.method1088(class4_sub13);
						else if (class4_sub13.anInt2227 == 1338)
							Class40.method934(i_3_, i_4_, 0);
						else {
							if (class4_sub13.anInt2258 == 0) {
								if (!class4_sub13.aBoolean2178
										&& Class53
												.method1005(110, class4_sub13)
										&& (Class32.aClass4_Sub13_698 != class4_sub13))
									continue;
								method175(i_4_ - class4_sub13.anInt2231, i_3_
										- class4_sub13.anInt2238, i_5_, arg3,
										111, i_7_, i_6_, i_8_,
										class4_sub13.anInt2172);
								if (class4_sub13.aClass4_Sub13Array2215 != null)
									method175(
											i_4_ + -class4_sub13.anInt2231,
											i_3_ - class4_sub13.anInt2238,
											i_5_,
											(class4_sub13.aClass4_Sub13Array2215),
											106, i_7_, i_6_, i_8_,
											class4_sub13.anInt2172);
								Class4_Sub16 class4_sub16 = ((Class4_Sub16) (Class31.aClass16_677
										.method725((byte) 117,
												class4_sub13.anInt2172)));
								if (class4_sub16 != null)
									Class4_Sub20_Sub3.method350(i_4_, i_7_, 0,
											(class4_sub16.anInt2311), i_3_,
											i_6_, i_5_, i_8_);
							}
							if (class4_sub13.aBoolean2178) {
								boolean bool;
								if (Class37.anInt767 >= i_8_
										&& i_5_ <= Class4_Sub1.anInt1859
										&& i_7_ > Class37.anInt767
										&& i_6_ > Class4_Sub1.anInt1859)
									bool = true;
								else
									bool = false;
								boolean bool_17_ = false;
								if ((Class62.anInt1227 ^ 0xffffffff) == -2
										&& i_8_ <= Class37.anInt758
										&& ((i_5_ ^ 0xffffffff) >= (JagexException.anInt1729 ^ 0xffffffff))
										&& (i_7_ ^ 0xffffffff) < (Class37.anInt758 ^ 0xffffffff)
										&& (JagexException.anInt1729 ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
									bool_17_ = true;
								boolean bool_18_ = false;
								if ((Player.anInt3587 ^ 0xffffffff) == -2
										&& bool)
									bool_18_ = true;
								if (bool_17_)
									Region.method54(
											(byte) 85,
											(-i_3_ + (JagexException.anInt1729)),
											-i_4_ + Class37.anInt758,
											class4_sub13);
								if ((Class4_Sub20_Sub16.aClass4_Sub13_3179 != null)
										&& (Class4_Sub20_Sub16.aClass4_Sub13_3179 != class4_sub13)
										&& bool
										&& (Class7.method653(Class54
												.method1011(class4_sub13,
														-22389), 126)))
									Class4_Sub15.aClass4_Sub13_2301 = class4_sub13;
								if (Class58.aClass4_Sub13_1159 == class4_sub13) {
									Class4_Sub20_Sub1.anInt2740 = i_4_;
									Class4_Sub20_Sub7.anInt2941 = i_3_;
									Class33.aBoolean711 = true;
								}
								if (class4_sub13.aBoolean2237) {
									if (bool
											&& RS2Font.anInt2768 != 0
											&& (class4_sub13.anObjectArray2169 != null)) {
										Class4_Sub14 class4_sub14 = new Class4_Sub14();
										class4_sub14.aClass4_Sub13_2282 = class4_sub13;
										class4_sub14.anInt2280 = RS2Font.anInt2768;
										class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2169;
										RSFont.aClass65_144.method1068(
												class4_sub14, (byte) -125);
									}
									if ((Class4_Sub20_Sub16.aClass4_Sub13_3179 != null)
											|| (RS2Font.aClass4_Sub13_2763) != null
											|| Class4_Sub20_Sub16.aBoolean3169) {
										bool = false;
										bool_17_ = false;
										bool_18_ = false;
									}
									if (!class4_sub13.aBoolean2132 && bool_17_) {
										class4_sub13.aBoolean2132 = true;
										if (class4_sub13.anObjectArray2167 != null) {
											Class4_Sub14 class4_sub14 = new Class4_Sub14();
											class4_sub14.anInt2268 = -i_4_
													+ Class37.anInt758;
											class4_sub14.anInt2280 = (-i_3_ + (JagexException.anInt1729));
											class4_sub14.aClass4_Sub13_2282 = class4_sub13;
											class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2167);
											RSFont.aClass65_144.method1068(
													class4_sub14, (byte) -118);
										}
									}
									if (class4_sub13.aBoolean2132
											&& bool_18_
											&& (class4_sub13.anObjectArray2221 != null)) {
										Class4_Sub14 class4_sub14 = new Class4_Sub14();
										class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2221;
										class4_sub14.aClass4_Sub13_2282 = class4_sub13;
										class4_sub14.anInt2268 = -i_4_
												+ Class37.anInt767;
										class4_sub14.anInt2280 = Class4_Sub1.anInt1859
												- i_3_;
										RSFont.aClass65_144.method1068(
												class4_sub14, (byte) -118);
									}
									if (class4_sub13.aBoolean2132 && !bool_18_) {
										class4_sub13.aBoolean2132 = false;
										if (class4_sub13.anObjectArray2252 != null) {
											Class4_Sub14 class4_sub14 = new Class4_Sub14();
											class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2252);
											class4_sub14.aClass4_Sub13_2282 = class4_sub13;
											class4_sub14.anInt2280 = (Class4_Sub1.anInt1859 + -i_3_);
											class4_sub14.anInt2268 = -i_4_
													+ Class37.anInt767;
											Class18.aClass65_463.method1068(
													class4_sub14, (byte) -125);
										}
									}
									if (bool_18_
											&& (class4_sub13.anObjectArray2220 != null)) {
										Class4_Sub14 class4_sub14 = new Class4_Sub14();
										class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2220;
										class4_sub14.anInt2280 = -i_3_
												+ Class4_Sub1.anInt1859;
										class4_sub14.aClass4_Sub13_2282 = class4_sub13;
										class4_sub14.anInt2268 = Class37.anInt767
												+ -i_4_;
										RSFont.aClass65_144.method1068(
												class4_sub14, (byte) -119);
									}
									if (!class4_sub13.aBoolean2189 && bool) {
										class4_sub13.aBoolean2189 = true;
										if (class4_sub13.anObjectArray2265 != null) {
											Class4_Sub14 class4_sub14 = new Class4_Sub14();
											class4_sub14.anInt2280 = (-i_3_ + Class4_Sub1.anInt1859);
											class4_sub14.aClass4_Sub13_2282 = class4_sub13;
											class4_sub14.anInt2268 = -i_4_
													+ Class37.anInt767;
											class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2265);
											RSFont.aClass65_144.method1068(
													class4_sub14, (byte) -127);
										}
									}
									if (class4_sub13.aBoolean2189
											&& bool
											&& (class4_sub13.anObjectArray2222 != null)) {
										Class4_Sub14 class4_sub14 = new Class4_Sub14();
										class4_sub14.aClass4_Sub13_2282 = class4_sub13;
										class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2222;
										class4_sub14.anInt2280 = -i_3_
												+ Class4_Sub1.anInt1859;
										class4_sub14.anInt2268 = Class37.anInt767
												- i_4_;
										RSFont.aClass65_144.method1068(
												class4_sub14, (byte) -126);
									}
									if (class4_sub13.aBoolean2189 && !bool) {
										class4_sub13.aBoolean2189 = false;
										if (class4_sub13.anObjectArray2182 != null) {
											Class4_Sub14 class4_sub14 = new Class4_Sub14();
											class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2182);
											class4_sub14.anInt2268 = -i_4_
													+ Class37.anInt767;
											class4_sub14.aClass4_Sub13_2282 = class4_sub13;
											class4_sub14.anInt2280 = (Class4_Sub1.anInt1859 + -i_3_);
											Class18.aClass65_463.method1068(
													class4_sub14, (byte) -121);
										}
									}
									if (class4_sub13.anObjectArray2200 != null) {
										Class4_Sub14 class4_sub14 = new Class4_Sub14();
										class4_sub14.aClass4_Sub13_2282 = class4_sub13;
										class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2200;
										Class13.aClass65_381.method1068(
												class4_sub14, (byte) -124);
									}
									if (class4_sub13.anObjectArray2259 != null
											&& (Class77.anInt1587 > class4_sub13.anInt2140)) {
										if (class4_sub13.anIntArray2261 == null
												|| ((Class77.anInt1587 + -class4_sub13.anInt2140) > 32)) {
											Class4_Sub14 class4_sub14 = new Class4_Sub14();
											class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2259);
											class4_sub14.aClass4_Sub13_2282 = class4_sub13;
											RSFont.aClass65_144.method1068(
													class4_sub14, (byte) -121);
										} else {
											while_5_: for (int i_19_ = class4_sub13.anInt2140; ((Class77.anInt1587 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++) {
												int i_20_ = (Class4_Sub20_Sub6.anIntArray2902[0x1f & i_19_]);
												for (int i_21_ = 0; (((class4_sub13.anIntArray2261).length ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++) {
													if ((i_20_ ^ 0xffffffff) == ((class4_sub13.anIntArray2261[i_21_]) ^ 0xffffffff)) {
														Class4_Sub14 class4_sub14 = (new Class4_Sub14());
														class4_sub14.aClass4_Sub13_2282 = class4_sub13;
														class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2259);
														RSFont.aClass65_144
																.method1068(
																		class4_sub14,
																		(byte) -124);
														break while_5_;
													}
												}
											}
										}
										class4_sub13.anInt2140 = Class77.anInt1587;
									}
									if (class4_sub13.anObjectArray2155 != null
											&& ((Class10.anInt306 ^ 0xffffffff) < (class4_sub13.anInt2138 ^ 0xffffffff))) {
										if (class4_sub13.anIntArray2234 == null
												|| ((-class4_sub13.anInt2138 + Class10.anInt306) ^ 0xffffffff) < -33) {
											Class4_Sub14 class4_sub14 = new Class4_Sub14();
											class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2155);
											class4_sub14.aClass4_Sub13_2282 = class4_sub13;
											RSFont.aClass65_144.method1068(
													class4_sub14, (byte) -121);
										} else {
											while_6_: for (int i_22_ = class4_sub13.anInt2138; i_22_ < Class10.anInt306; i_22_++) {
												int i_23_ = (Class2.anIntArray84[i_22_ & 0x1f]);
												for (int i_24_ = 0; (i_24_ < (class4_sub13.anIntArray2234).length); i_24_++) {
													if (((class4_sub13.anIntArray2234[i_24_]) ^ 0xffffffff) == (i_23_ ^ 0xffffffff)) {
														Class4_Sub14 class4_sub14 = (new Class4_Sub14());
														class4_sub14.aClass4_Sub13_2282 = class4_sub13;
														class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2155);
														RSFont.aClass65_144
																.method1068(
																		class4_sub14,
																		(byte) -119);
														break while_6_;
													}
												}
											}
										}
										class4_sub13.anInt2138 = Class10.anInt306;
									}
									if (class4_sub13.anObjectArray2188 != null
											&& (class4_sub13.anInt2175 < Class73.anInt1502)) {
										if (class4_sub13.anIntArray2230 == null
												|| ((Class73.anInt1502 + -class4_sub13.anInt2175) ^ 0xffffffff) < -33) {
											Class4_Sub14 class4_sub14 = new Class4_Sub14();
											class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2188);
											class4_sub14.aClass4_Sub13_2282 = class4_sub13;
											RSFont.aClass65_144.method1068(
													class4_sub14, (byte) -117);
										} else {
											while_7_: for (int i_25_ = class4_sub13.anInt2175; ((Class73.anInt1502 ^ 0xffffffff) < (i_25_ ^ 0xffffffff)); i_25_++) {
												int i_26_ = (Class42.anIntArray841[i_25_ & 0x1f]);
												for (int i_27_ = 0; (((class4_sub13.anIntArray2230).length ^ 0xffffffff) < (i_27_ ^ 0xffffffff)); i_27_++) {
													if ((class4_sub13.anIntArray2230[i_27_]) == i_26_) {
														Class4_Sub14 class4_sub14 = (new Class4_Sub14());
														class4_sub14.aClass4_Sub13_2282 = class4_sub13;
														class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2188);
														RSFont.aClass65_144
																.method1068(
																		class4_sub14,
																		(byte) -122);
														break while_7_;
													}
												}
											}
										}
										class4_sub13.anInt2175 = Class73.anInt1502;
									}
									if (((Class67.anInt1341 ^ 0xffffffff) < (class4_sub13.anInt2240 ^ 0xffffffff))
											&& (class4_sub13.anObjectArray2180 != null)) {
										Class4_Sub14 class4_sub14 = new Class4_Sub14();
										class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2180;
										class4_sub14.aClass4_Sub13_2282 = class4_sub13;
										RSFont.aClass65_144.method1068(
												class4_sub14, (byte) -128);
									}
									if (((class4_sub13.anInt2240 ^ 0xffffffff) > (Class4_Sub20_Sub1.anInt2718 ^ 0xffffffff))
											&& (class4_sub13.anObjectArray2251 != null)) {
										Class4_Sub14 class4_sub14 = new Class4_Sub14();
										class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2251;
										class4_sub14.aClass4_Sub13_2282 = class4_sub13;
										RSFont.aClass65_144.method1068(
												class4_sub14, (byte) -121);
									}
									if ((class4_sub13.anInt2240 < Class4_Sub20_Sub7.anInt2948)
											&& (class4_sub13.anObjectArray2255 != null)) {
										Class4_Sub14 class4_sub14 = new Class4_Sub14();
										class4_sub14.aClass4_Sub13_2282 = class4_sub13;
										class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2255;
										RSFont.aClass65_144.method1068(
												class4_sub14, (byte) -124);
									}
									if ((class4_sub13.anInt2240 < Class43.anInt868)
											&& (class4_sub13.anObjectArray2204 != null)) {
										Class4_Sub14 class4_sub14 = new Class4_Sub14();
										class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2204;
										class4_sub14.aClass4_Sub13_2282 = class4_sub13;
										RSFont.aClass65_144.method1068(
												class4_sub14, (byte) -120);
									}
									class4_sub13.anInt2240 = Class4_Sub20_Sub10.anInt3053;
									if (class4_sub13.anObjectArray2130 != null) {
										for (int i_28_ = 0; ((i_28_ ^ 0xffffffff) > (Class77.anInt1583 ^ 0xffffffff)); i_28_++) {
											Class4_Sub14 class4_sub14 = new Class4_Sub14();
											class4_sub14.aClass4_Sub13_2282 = class4_sub13;
											class4_sub14.anInt2273 = (Class4_Sub20_Sub13.anIntArray3133[i_28_]);
											class4_sub14.anInt2281 = (Class4_Sub20_Sub13.anIntArray3122[i_28_]);
											class4_sub14.anObjectArray2267 = (class4_sub13.anObjectArray2130);
											RSFont.aClass65_144.method1068(
													class4_sub14, (byte) -118);
										}
									}
								}
							}
							if (!class4_sub13.aBoolean2178) {
								if ((Class4_Sub20_Sub16.aClass4_Sub13_3179 != null)
										|| (RS2Font.aClass4_Sub13_2763 != null)
										|| Class4_Sub20_Sub16.aBoolean3169)
									break;
								if ((class4_sub13.anInt2136 >= 0 || class4_sub13.anInt2197 != 0)
										&& ((Class37.anInt767 ^ 0xffffffff) <= (i_8_ ^ 0xffffffff))
										&& i_5_ <= Class4_Sub1.anInt1859
										&& ((Class37.anInt767 ^ 0xffffffff) > (i_7_ ^ 0xffffffff))
										&& i_6_ > Class4_Sub1.anInt1859) {
									if (class4_sub13.anInt2136 >= 0)
										Class32.aClass4_Sub13_698 = arg3[class4_sub13.anInt2136];
									else
										Class32.aClass4_Sub13_698 = class4_sub13;
								}
								if ((class4_sub13.anInt2258 ^ 0xffffffff) == -9
										&& (i_8_ ^ 0xffffffff) >= (Class37.anInt767 ^ 0xffffffff)
										&& ((Class4_Sub1.anInt1859 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff))
										&& (i_7_ ^ 0xffffffff) < (Class37.anInt767 ^ 0xffffffff)
										&& ((i_6_ ^ 0xffffffff) < (Class4_Sub1.anInt1859 ^ 0xffffffff)))
									Class4_Sub20_Sub10.aClass4_Sub13_3064 = class4_sub13;
								if (class4_sub13.anInt2185 < class4_sub13.anInt2206)
									RSFont.method74(Class37.anInt767, i_4_
											- -(class4_sub13.anInt2156), 124,
											class4_sub13.anInt2206,
											class4_sub13.anInt2185,
											class4_sub13, i_3_,
											Class4_Sub1.anInt1859);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("db.D("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
					+ arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')'));
		}
	}

	public static void method176(boolean arg0) {
		try {
			aJagexString_1907 = null;
			aClass66_1882 = null;
			aShortArrayArray1886 = null;
			aJagexString_1899 = null;
			aJagexString_1895 = null;
			aJagexString_1903 = null;
			aClass22_1896 = null;
			if (arg0 != true)
				method175(108, -47, 67, null, 14, 10, -64, -112, 21);
			aClass66_1902 = null;
			aJagexString_1888 = null;
			aJagexString_1911 = null;
			aJagexString_1912 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "db.B("
					+ arg0 + ')');
		}
	}

	public boolean aBoolean1877;
	public boolean aBoolean1881;
	public boolean aBoolean1885;
	public Class25 aClass25_1879;
	public Class4_Sub3 aClass4_Sub3_1893;
	public Class5 aClass5_1904;
	public Class51 aClass51_1878;
	public Class61 aClass61_1891;
	public Class67[] aClass67Array1890 = new Class67[5];
	public Class68 aClass68_1898;
	public Class74 aClass74_1910;
	public int anInt1884;
	public int anInt1887;
	public int anInt1889 = 0;
	public int anInt1892;
	public int anInt1894;
	public int anInt1897;
	public int anInt1901;

	public int anInt1905;

	public int anInt1906;

	public int anInt1908;

	public int anInt1909;

	public int[] anIntArray1883 = new int[5];

	public Class4_Sub3(int arg0, int arg1, int arg2) {
		try {
			anInt1887 = arg2;
			anInt1894 = arg1;
			anInt1906 = anInt1901 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception,
					("db.<init>(" + arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}
}
