package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class61 {
	public static Class19 aClass19_1202;
	public static Class19 aClass19_1218;
	public static JagexString aJagexString_1198 = (JagexString.getRs2PreparedString(
			"Sie haben gerade eine andere Welt verlassen)3"));
	public static JagexString aJagexString_1203;
	public static JagexString aJagexString_1206;
	public static JagexString aJagexString_1210;
	public static JagexString aJagexString_1212 = JagexString
			.getRs2PreparedString("");
	public static JagexString aJagexString_1220;
	public static JagexString aJagexString_1221;
	public static int anInt1199;
	public static int anInt1201;
	public static int anInt1207;
	public static int anInt1208;
	public static int anInt1209;
	public static int anInt1213;
	public static int anInt1215;
	public static int[] anIntArray1222;
	static {
		anInt1208 = -1;
		aJagexString_1203 = JagexString.getRs2PreparedString(
				"Please wait 1 minute and try again)3");
		aJagexString_1210 = aJagexString_1203;
		anInt1201 = 1;
		GameShell.clickTime = 0L;
		aJagexString_1206 = JagexString.getRs2PreparedString("mapdots");
		aJagexString_1220 = JagexString.getRs2PreparedString("compass");
		aJagexString_1221 = aJagexString_1203;
	}

	public static void method1042(int arg0) {
		try {
			aJagexString_1220 = null;
			anIntArray1222 = null;
			aJagexString_1203 = null;
			aClass19_1218 = null;
			if (arg0 <= -74) {
				aJagexString_1221 = null;
				aClass19_1202 = null;
				aJagexString_1212 = null;
				aJagexString_1210 = null;
				aJagexString_1198 = null;
				aJagexString_1206 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "re.D("
					+ arg0 + ')');
		}
	}

	public static int method1043(int arg0, int arg1, int arg2) {
		try {
			anInt1199++;
			if ((arg1 ^ 0xffffffff) == 0)
				return 12345678;
			arg0 = arg0 * (arg1 & 0x7f) / arg2;
			if ((arg0 ^ 0xffffffff) <= -3) {
				if (arg0 > 126)
					arg0 = 126;
			} else
				arg0 = 2;
			return (arg1 & 0xff80) - -arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("re.B("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method1044(int arg0) {
		if (Class78.anInt1599 > 0)
			Class78.anInt1599--;
		anInt1207++;
		if (Class57.anInt1130 > 1)
			Class57.anInt1130--;
		if (Region.aBoolean129) {
			Region.aBoolean129 = false;
			Class11.method674(-1);
		} else {
			for (int i = 0; (i ^ 0xffffffff) > -101; i++) {
				if (!Class49.method991((byte) 50))
					break;
			}
			if (Class54.anInt1109 == 30) {
				Class78.method1197(226, (byte) -61,
						Class66.aClass4_Sub11_Sub1_1328);
				synchronized (Class31.aClass53_690.anObject1086) {
					if (!Class54.aBoolean1103)
						Class31.aClass53_690.anInt1089 = 0;
					else if (Class62.anInt1227 != 0
							|| ((Class31.aClass53_690.anInt1089 ^ 0xffffffff) <= -41)) {
						Class4_Sub22.anInt2402++;
						int i = 0;
						Class66.aClass4_Sub11_Sub1_1328.method264(185, arg0
								^ ~0x3b);
						Class66.aClass4_Sub11_Sub1_1328
								.method227((byte) -27, 0);
						int i_0_ = Class66.aClass4_Sub11_Sub1_1328.pointion;
						for (int i_1_ = 0; Class31.aClass53_690.anInt1089 > i_1_; i_1_++) {
							if ((-i_0_ + Class66.aClass4_Sub11_Sub1_1328.pointion) >= 240)
								break;
							i++;
							int i_2_ = Class31.aClass53_690.anIntArray1088[i_1_];
							if (i_2_ < 0)
								i_2_ = 0;
							else if ((i_2_ ^ 0xffffffff) < -503)
								i_2_ = 502;
							int i_3_ = Class31.aClass53_690.anIntArray1090[i_1_];
							if ((i_3_ ^ 0xffffffff) <= -1) {
								if ((i_3_ ^ 0xffffffff) < -765)
									i_3_ = 764;
							} else
								i_3_ = 0;
							int i_4_ = i_3_ + i_2_ * 765;
							if ((Class31.aClass53_690.anIntArray1088[i_1_] ^ 0xffffffff) == 0
									&& (Class31.aClass53_690.anIntArray1090[i_1_] == -1)) {
								i_2_ = -1;
								i_3_ = -1;
								i_4_ = 524287;
							}
							if (Class4_Sub11_Sub1.anInt2682 == i_3_
									&& (i_2_ ^ 0xffffffff) == (Class2.anInt95 ^ 0xffffffff)) {
								if ((Class59.anInt1184 ^ 0xffffffff) > -2048)
									Class59.anInt1184++;
							} else {
								int i_5_ = i_3_ + -Class4_Sub11_Sub1.anInt2682;
								Class4_Sub11_Sub1.anInt2682 = i_3_;
								int i_6_ = i_2_ + -Class2.anInt95;
								Class2.anInt95 = i_2_;
								if ((Class59.anInt1184 ^ 0xffffffff) > -9
										&& (i_5_ ^ 0xffffffff) <= 31
										&& i_5_ <= 31
										&& (i_6_ ^ 0xffffffff) <= 31
										&& (i_6_ ^ 0xffffffff) >= -32) {
									i_5_ += 32;
									i_6_ += 32;
									Class66.aClass4_Sub11_Sub1_1328
											.method207(
													(i_6_
															+ (Class59.anInt1184 << -556237204) + (i_5_ << 842787718)),
													2018779304);
									Class59.anInt1184 = 0;
								} else if (Class59.anInt1184 < 8) {
									Class66.aClass4_Sub11_Sub1_1328
											.method231(
													8388608
															+ (Class59.anInt1184 << -866912941)
															+ i_4_, 98);
									Class59.anInt1184 = 0;
								} else {
									Class66.aClass4_Sub11_Sub1_1328
											.method236(
													181,
													-1073741824
															- (-(Class59.anInt1184 << 2031999891) - i_4_));
									Class59.anInt1184 = 0;
								}
							}
						}
						Class66.aClass4_Sub11_Sub1_1328
								.method258(
										Class66.aClass4_Sub11_Sub1_1328.pointion
												- i_0_, (byte) 109);
						if (Class31.aClass53_690.anInt1089 > i) {
							Class31.aClass53_690.anInt1089 -= i;
							for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (Class31.aClass53_690.anInt1089 ^ 0xffffffff)); i_7_++) {
								Class31.aClass53_690.anIntArray1090[i_7_] = (Class31.aClass53_690.anIntArray1090[i_7_
										+ i]);
								Class31.aClass53_690.anIntArray1088[i_7_] = (Class31.aClass53_690.anIntArray1088[i
										+ i_7_]);
							}
						} else
							Class31.aClass53_690.anInt1089 = 0;
					}
				}
				if ((Class62.anInt1227 ^ 0xffffffff) != -1) {
					Class16.anInt444++;
					int i = JagexException.anInt1729;
					int i_8_ = Class37.anInt758;
					if (i < 0)
						i = 0;
					else if (i > 502)
						i = 502;
					if ((i_8_ ^ 0xffffffff) > -1)
						i_8_ = 0;
					else if ((i_8_ ^ 0xffffffff) < -765)
						i_8_ = 764;
					int i_9_ = i_8_ + i * 765;
					int i_10_ = 0;
					if ((Class62.anInt1227 ^ 0xffffffff) == -3)
						i_10_ = 1;
					long l = (-Class4_Sub20_Sub10.aLong3063 + GameShell.clickTime) / 50L;
					Class4_Sub20_Sub10.aLong3063 = GameShell.clickTime;
					if ((l ^ 0xffffffffffffffffL) < -4096L)
						l = 4095L;
					Class66.aClass4_Sub11_Sub1_1328.method264(99, arg0 + -74);
					int i_11_ = (int) l;
					Class66.aClass4_Sub11_Sub1_1328.method236(181,
							(i_11_ << 532905652)
									+ ((i_10_ << 517677395) + i_9_));
				}
				if ((Class40.anInt781 ^ 0xffffffff) < -1)
					Class40.anInt781--;
				if (Game.keyStatus[96]
						|| Game.keyStatus[97]
						|| Game.keyStatus[98]
						|| Game.keyStatus[99])
					RSFont.aBoolean152 = true;
				if (RSFont.aBoolean152 && Class40.anInt781 <= 0) {
					Class77.anInt1595++;
					RSFont.aBoolean152 = false;
					Class40.anInt781 = 20;
					Class66.aClass4_Sub11_Sub1_1328.method264(128, -23);
					Class66.aClass4_Sub11_Sub1_1328.method251(Class1.cameraVerticalPosition,
							(byte) 53);
					Class66.aClass4_Sub11_Sub1_1328.method207(Class49.cameraHorizontalPosition,
							2018779304);
				}
				if (!Region.aBoolean126 != true
						&& !Class59.aBoolean1188 == true) {
					Class4_Sub3.anInt1876++;
					Class59.aBoolean1188 = true;
					Class66.aClass4_Sub11_Sub1_1328.method264(7, -59);
					Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27, 1);
				}
				if (Region.aBoolean126 == false && Class59.aBoolean1188 == true) {
					Class4_Sub3.anInt1876++;
					Class59.aBoolean1188 = false;
					Class66.aClass4_Sub11_Sub1_1328.method264(7, -94);
					Class66.aClass4_Sub11_Sub1_1328.method227((byte) -27, 0);
				}
				Class77.method1191((byte) -71);
				if (Class54.anInt1109 == 30) {
					Class57.method1021(-80);
					Class53.method1006((byte) 120);
					AppletListener.anInt1448++;
					if (AppletListener.anInt1448 > 750)
						Class11.method674(-1);
					else {
						Class6.method648(-1);
						Class4_Sub20.method318(14931);
						Class57.method1023(49);
						if ((Class28.anInt640 ^ 0xffffffff) != -1) {
							Class11.anInt331 += 20;
							if (Class11.anInt331 >= 400)
								Class28.anInt640 = 0;
						}
						Class4_Sub20_Sub6.anInt2906++;
						if (Class46.rsInterface != null) {
							Class18.anInt475++;
							if ((Class18.anInt475 ^ 0xffffffff) <= -16) {
								Class67.method1088(Class46.rsInterface);
								Class46.rsInterface = null;
							}
						}
						if (RS2Font.aClass4_Sub13_2763 != null) {
							Class67.method1088(
									(RS2Font.aClass4_Sub13_2763));
							if (5 + AppletListener.anInt1464 < Class37.anInt767
									|| Class37.anInt767 < -5
											+ AppletListener.anInt1464
									|| (5 + Class58.anInt1161 < Class4_Sub1.anInt1859)
									|| ((-5 + Class58.anInt1161 ^ 0xffffffff) < (Class4_Sub1.anInt1859 ^ 0xffffffff)))
								Class4_Sub23.aBoolean2419 = true;
							RSFont.anInt161++;
							if (Player.anInt3587 == 0) {
								if (Class4_Sub23.aBoolean2419
										&& RSFont.anInt161 >= 5) {
									if ((RS2Font.aClass4_Sub13_2763 == Class42.aClass4_Sub13_855)
											&& (Class34.anInt1761 != Class4_Sub20_Sub14.anInt3139)) {
										Class16.anInt427++;
										RSInterface class4_sub13 = (RS2Font.aClass4_Sub13_2763);
										int i = 0;
										if (Class19_Sub1.anInt2525 == 1
												&& class4_sub13.anInt2227 == 206)
											i = 1;
										if ((class4_sub13.anIntArray2179[Class34.anInt1761]) <= 0)
											i = 0;
										if (Class72.method1161(1, Class54
												.method1011(class4_sub13,
														-22389))) {
											int i_12_ = Class4_Sub20_Sub14.anInt3139;
											int i_13_ = Class34.anInt1761;
											class4_sub13.anIntArray2179[i_13_] = (class4_sub13.anIntArray2179[i_12_]);
											class4_sub13.anIntArray2216[i_13_] = (class4_sub13.anIntArray2216[i_12_]);
											class4_sub13.anIntArray2179[i_12_] = -1;
											class4_sub13.anIntArray2216[i_12_] = 0;
										} else if ((i ^ 0xffffffff) == -2) {
											int i_14_ = Class34.anInt1761;
											int i_15_ = Class4_Sub20_Sub14.anInt3139;
											while ((i_14_ ^ 0xffffffff) != (i_15_ ^ 0xffffffff)) {
												if ((i_14_ ^ 0xffffffff) <= (i_15_ ^ 0xffffffff)) {
													if (i_14_ > i_15_) {
														class4_sub13.method288(
																i_15_ - -1,
																arg0 ^ 0x541c,
																i_15_);
														i_15_++;
													}
												} else {
													class4_sub13.method288(-1
															+ i_15_, 21533,
															i_15_);
													i_15_--;
												}
											}
										} else
											class4_sub13
													.method288(
															Class34.anInt1761,
															21533,
															Class4_Sub20_Sub14.anInt3139);
										Class66.aClass4_Sub11_Sub1_1328
												.method264(121, arg0 + -41);
										Class66.aClass4_Sub11_Sub1_1328
												.method218(-110,
														Class34.anInt1761);
										Class66.aClass4_Sub11_Sub1_1328
												.method225(i, (byte) 97);
										Class66.aClass4_Sub11_Sub1_1328
												.method211(
														(RS2Font.aClass4_Sub13_2763.anInt2172),
														-1387540232);
										Class66.aClass4_Sub11_Sub1_1328
												.method224(
														13421,
														Class4_Sub20_Sub14.anInt3139);
									}
								} else if ((Class81.anInt1681 == 1 || (Class42
										.method942(-86, -1
												+ (Class4_Sub20_Sub8.anInt2980))))
										&& (Class4_Sub20_Sub8.anInt2980 ^ 0xffffffff) < -3)
									SceneGraph.method707(-21);
								else if ((Class4_Sub20_Sub8.anInt2980 ^ 0xffffffff) < -1)
									StreamBuffer.method221(0, -1
											+ Class4_Sub20_Sub8.anInt2980);
								Class62.anInt1227 = 0;
								Class18.anInt475 = 10;
								RS2Font.aClass4_Sub13_2763 = null;
							}
						}
						Class33.aBoolean711 = false;
						Class57.aBoolean1132 = false;
						Class77.anInt1583 = 0;
						Class4_Sub15.aClass4_Sub13_2301 = null;
						RSInterface class4_sub13 = Class32.aClass4_Sub13_698;
						RSInterface class4_sub13_16_ = Class4_Sub20_Sub10.aClass4_Sub13_3064;
						Class32.aClass4_Sub13_698 = null;
						Class4_Sub20_Sub10.aClass4_Sub13_3064 = null;
						for (/**/; (RSCanvas.method34(127) && (Class77.anInt1583 ^ 0xffffffff) > -129); Class77.anInt1583++) {
							Class4_Sub20_Sub13.anIntArray3133[(Class77.anInt1583)] = Class4_Sub15.anInt2298;
							Class4_Sub20_Sub13.anIntArray3122[(Class77.anInt1583)] = Class48.anInt980;
						}
						Class4_Sub20_Sub3.method350(0, 765, arg0 ^ arg0,
								Class4_Sub6.anInt1932, 0, 503, 0, 0);
						Class4_Sub20_Sub10.anInt3053++;
						for (;;) {
							Class4_Sub14 class4_sub14 = ((Class4_Sub14) Class13.aClass65_381
									.method1072(-2));
							if (class4_sub14 == null)
								break;
							RSInterface class4_sub13_17_ = class4_sub14.aClass4_Sub13_2282;
							if (class4_sub13_17_.anInt2163 >= 0) {
								RSInterface class4_sub13_18_ = Class4_Sub20
										.method322(true,
												(class4_sub13_17_.anInt2183));
								if (class4_sub13_18_ == null
										|| (class4_sub13_18_.aClass4_Sub13Array2215 == null)
										|| ((class4_sub13_17_.anInt2163 ^ 0xffffffff) <= ((class4_sub13_18_.aClass4_Sub13Array2215).length ^ 0xffffffff))
										|| ((class4_sub13_18_.aClass4_Sub13Array2215[class4_sub13_17_.anInt2163]) != class4_sub13_17_))
									continue;
							}
							Class16.method721(arg0, class4_sub14);
						}
						for (;;) {
							Class4_Sub14 class4_sub14 = ((Class4_Sub14) Class18.aClass65_463
									.method1072(-2));
							if (class4_sub14 == null)
								break;
							RSInterface class4_sub13_19_ = class4_sub14.aClass4_Sub13_2282;
							if ((class4_sub13_19_.anInt2163 ^ 0xffffffff) <= -1) {
								RSInterface class4_sub13_20_ = Class4_Sub20
										.method322(true,
												(class4_sub13_19_.anInt2183));
								if (class4_sub13_20_ == null
										|| (class4_sub13_20_.aClass4_Sub13Array2215 == null)
										|| (((class4_sub13_20_.aClass4_Sub13Array2215).length ^ 0xffffffff) >= (class4_sub13_19_.anInt2163 ^ 0xffffffff))
										|| (class4_sub13_19_ != (class4_sub13_20_.aClass4_Sub13Array2215[class4_sub13_19_.anInt2163])))
									continue;
							}
							Class16.method721(1, class4_sub14);
						}
						for (;;) {
							Class4_Sub14 class4_sub14 = ((Class4_Sub14) RSFont.aClass65_144
									.method1072(-2));
							if (class4_sub14 == null)
								break;
							RSInterface class4_sub13_21_ = class4_sub14.aClass4_Sub13_2282;
							if ((class4_sub13_21_.anInt2163 ^ 0xffffffff) <= -1) {
								RSInterface class4_sub13_22_ = Class4_Sub20
										.method322(true,
												(class4_sub13_21_.anInt2183));
								if (class4_sub13_22_ == null
										|| (class4_sub13_22_.aClass4_Sub13Array2215 == null)
										|| ((class4_sub13_22_.aClass4_Sub13Array2215).length <= class4_sub13_21_.anInt2163)
										|| ((class4_sub13_22_.aClass4_Sub13Array2215[class4_sub13_21_.anInt2163]) != class4_sub13_21_))
									continue;
							}
							Class16.method721(1, class4_sub14);
						}
						if (Class4_Sub20_Sub16.aClass4_Sub13_3179 != null)
							Class50.method996(-109);
						if (Class69.anInt1420 != -1) {
							int i = Class69.anInt1420;
							int i_23_ = Class69.anInt1413;
							boolean bool = (Class4_Sub20
									.method319(
											0,
											(Class4_Sub15.localPlayer.anIntArray3247[0]),
											i_23_,
											i,
											0,
											0,
											true,
											0,
											0,
											0,
											0,
											(Class4_Sub15.localPlayer.anIntArray3248[0])));
							Class69.anInt1420 = -1;
							if (bool) {
								Class2.anInt96 = JagexException.anInt1729;
								Class57.anInt1155 = Class37.anInt758;
								Class11.anInt331 = 0;
								Class28.anInt640 = 1;
							}
						}
						Class13.method682((byte) 48);
						if (class4_sub13 != Class32.aClass4_Sub13_698) {
							if (class4_sub13 != null)
								Class67.method1088(class4_sub13);
							if (Class32.aClass4_Sub13_698 != null)
								Class67.method1088(Class32.aClass4_Sub13_698);
						}
						if ((class4_sub13_16_ != Class4_Sub20_Sub10.aClass4_Sub13_3064)
								&& Class5.anInt196 == Class78.anInt1598) {
							if (class4_sub13_16_ != null)
								Class67.method1088(class4_sub13_16_);
							if (Class4_Sub20_Sub10.aClass4_Sub13_3064 != null)
								Class67.method1088(
										(Class4_Sub20_Sub10.aClass4_Sub13_3064)
                                );
						}
						if (Class4_Sub20_Sub10.aClass4_Sub13_3064 != null) {
							if (Class78.anInt1598 < Class5.anInt196) {
								Class78.anInt1598++;
								if ((Class5.anInt196 ^ 0xffffffff) == (Class78.anInt1598 ^ 0xffffffff))
									Class67.method1088(
											(Class4_Sub20_Sub10.aClass4_Sub13_3064)
                                    );
							}
						} else if ((Class78.anInt1598 ^ 0xffffffff) < -1)
							Class78.anInt1598--;
						Class24.method789();
						if (Class25.aBoolean582)
							Class78.calculateCameraPosition();
						for (int i = 0; i < 5; i++)
							Class4_Sub15.quakeTimes[i]++;
						int i = Class41.method941(arg0 ^ 0x9);
						int i_24_ = Class31.method881(-10051);
						if (i > 4500 && (i_24_ ^ 0xffffffff) < -4501) {
							Class4_Sub2_Sub4.anInt2646++;
							Class78.anInt1599 = 250;
							Class13_Sub2.method692(4000);
							Class66.aClass4_Sub11_Sub1_1328
									.method264(230, -101);
						}
						Class80.anInt1637++;
						Class38.anInt770++;
						if ((Class38.anInt770 ^ 0xffffffff) < -501) {
							int i_25_ = (int) (8.0 * Math.random());
							if ((0x4 & i_25_) == 4)
								Class4_Sub16.anInt2318 += Class4_Sub20_Sub4.anInt2858;
							if ((0x1 & i_25_) == 1)
								Class4_Sub23.anInt2412 += Class33.anInt715;
							Class38.anInt770 = 0;
							if ((i_25_ & 0x2 ^ 0xffffffff) == -3)
								Class4_Sub20_Sub7_Sub3.anInt3354 += Class73.anInt1498;
						}
						if (Class4_Sub23.anInt2412 < -50)
							Class33.anInt715 = 2;
						Class4_Sub20_Sub6.anInt2903++;
						if ((Class4_Sub16.anInt2318 ^ 0xffffffff) > 39)
							Class4_Sub20_Sub4.anInt2858 = 1;
						if ((Class4_Sub23.anInt2412 ^ 0xffffffff) < -51)
							Class33.anInt715 = -2;
						if ((Class80.anInt1637 ^ 0xffffffff) < -501) {
							int i_26_ = (int) (Math.random() * 8.0);
							Class80.anInt1637 = 0;
							if ((0x1 & i_26_ ^ 0xffffffff) == -2)
								Class31.anInt680 += Class4_Sub20_Sub7_Sub5.anInt3415;
							if ((i_26_ & 0x2 ^ 0xffffffff) == -3)
								Class4_Sub20_Sub5.anInt2889 += Class42.anInt844;
						}
						if ((Class4_Sub20_Sub7_Sub3.anInt3354 ^ 0xffffffff) > 54)
							Class73.anInt1498 = 2;
						if (Class31.anInt680 < -60)
							Class4_Sub20_Sub7_Sub5.anInt3415 = 2;
						if (Class31.anInt680 > 60)
							Class4_Sub20_Sub7_Sub5.anInt3415 = -2;
						if ((Class4_Sub16.anInt2318 ^ 0xffffffff) < -41)
							Class4_Sub20_Sub4.anInt2858 = -1;
						if (Class4_Sub20_Sub7_Sub3.anInt3354 > 55)
							Class73.anInt1498 = -2;
						if ((Class4_Sub20_Sub5.anInt2889 ^ 0xffffffff) > 19)
							Class42.anInt844 = 1;
						if (Class4_Sub20_Sub5.anInt2889 > 10)
							Class42.anInt844 = -1;
						if ((Class4_Sub20_Sub6.anInt2903 ^ 0xffffffff) < -51) {
							Class66.aClass4_Sub11_Sub1_1328.method264(202, -96);
							Class4_Sub11_Sub1.anInt2686++;
						}
						do {
							try {
								if (Class4_Sub20_Sub17.aClass76_3189 == null
										|| ((Class66.aClass4_Sub11_Sub1_1328.pointion) ^ 0xffffffff) >= -1)
									break;
								Class4_Sub20_Sub17.aClass76_3189
										.method1183(
												Class66.aClass4_Sub11_Sub1_1328.pointion,
												0,
												arg0 ^ 0x7d,
												(Class66.aClass4_Sub11_Sub1_1328.byteBuffer));
								Class4_Sub20_Sub6.anInt2903 = 0;
								Class66.aClass4_Sub11_Sub1_1328.pointion = 0;
							} catch (java.io.IOException ioexception) {
								Class11.method674(-1);
								break;
							}
							break;
						} while (false);
					}
				}
			}
		}
	}

	public static void method1045(boolean arg0, int arg1, int arg2, int arg3,
			int arg4) {
		Class4_Sub20_Sub12.method492(arg1, arg3, arg1 + arg2, arg3 + arg4);
		Class4_Sub20_Sub12_Sub3.method543();
		Class43.anInt860++;
		Class4_Sub20_Sub7_Sub6.method435(111, true);
		Class38.method920(true, 12981);
		Class4_Sub20_Sub7_Sub6.method435(94, false);
		Class38.method920(arg0, 12981);
		anInt1213++;
		Actor.method381((byte) 10);
		Class25.method796((byte) 103);
		if (!Class25.aBoolean582) {
			int i = Class1.cameraVerticalPosition;
			if ((i ^ 0xffffffff) > (Class74.secondaryCameraVertical / 256 ^ 0xffffffff))
				i = Class74.secondaryCameraVertical / 256;
			int i_27_ = Class4_Sub16.anInt2318 + Class49.cameraHorizontalPosition & 0x7ff;
			if (RS2Font.aBooleanArray2765[4]
					&& 128 + SceneGraph.anIntArray2504[4] > i)
				i = 128 + SceneGraph.anIntArray2504[4];
			Class16.method718(
					i,
					Class24.currentCameraPositionH,
					Class67.getFloorDrawHeight(
							(Class4_Sub15.localPlayer.worldX),
							(Class4_Sub15.localPlayer.worldY),
                            Class82.plane)
							+ -50, 600 + 3 * i, Class24.currentCameraPositionV, i_27_,
					(byte) 76);
		}
		int i;
		if (!Class25.aBoolean582)
			i = Class4_Sub6.method180(0);
		else
			i = Class48.getCameraPlaneCutscene();
		int i_28_ = Class4_Sub20_Sub13.cameraVerticalRotation;
		int i_29_ = Class6.cameraX;
		int i_30_ = Class33.cameraY;
		int i_31_ = RSInterface.cameraZ;
		int i_32_ = Class4_Sub6.cameraHorizontalRotation;
		for (int i_33_ = 0; i_33_ < 5; i_33_++) {
			if (RS2Font.aBooleanArray2765[i_33_]) {
				int i_34_ = (int) (-Class78.anIntArray1607[i_33_]
						+ ((1 + Class78.anIntArray1607[i_33_] * 2) * Math
								.random()) + (Math
						.sin((Class4_Sub15.quakeTimes[i_33_])
								* ((Class58.anIntArray1163[i_33_]) / 100.0)) * (SceneGraph.anIntArray2504[i_33_])));
				if (i_33_ == 0)
					Class6.cameraX += i_34_;
				if (i_33_ == 3)
					Class4_Sub6.cameraHorizontalRotation = Class4_Sub6.cameraHorizontalRotation + i_34_
							& 0x7ff;
				if (i_33_ == 2)
					Class33.cameraY += i_34_;
				if ((i_33_ ^ 0xffffffff) == -2)
					RSInterface.cameraZ += i_34_;
				if (i_33_ == 4) {
					Class4_Sub20_Sub13.cameraVerticalRotation += i_34_;
					if ((Class4_Sub20_Sub13.cameraVerticalRotation ^ 0xffffffff) > -129)
						Class4_Sub20_Sub13.cameraVerticalRotation = 128;
					if ((Class4_Sub20_Sub13.cameraVerticalRotation ^ 0xffffffff) < -384)
						Class4_Sub20_Sub13.cameraVerticalRotation = 383;
				}
			}
		}
		int i_35_ = Class37.anInt767;
		int i_36_ = Class4_Sub1.anInt1859;
		if ((arg1 ^ 0xffffffff) < (i_35_ ^ 0xffffffff) || arg2 + arg1 <= i_35_
				|| (i_36_ ^ 0xffffffff) > (arg3 ^ 0xffffffff)
				|| (arg4 + arg3 ^ 0xffffffff) >= (i_36_ ^ 0xffffffff)) {
			Class4_Sub20_Sub7_Sub7.aBoolean3490 = false;
			Class4_Sub20_Sub7_Sub7.anInt3495 = 0;
		} else {
			Class4_Sub20_Sub7_Sub7.anInt3493 = Class37.anInt767 - arg1;
			Class4_Sub20_Sub7_Sub7.anInt3486 = Class4_Sub1.anInt1859 - arg3;
			Class4_Sub20_Sub7_Sub7.anInt3495 = 0;
			Class4_Sub20_Sub7_Sub7.aBoolean3490 = true;
		}
		Class41.method938((byte) 0);
		Class4_Sub20_Sub12.method488(arg1, arg3, arg2, arg4, 0);
		Class41.method938((byte) 0);
		Class4_Sub20_Sub7_Sub6.aClass69_3439.method1121(Class6.cameraX,
				RSInterface.cameraZ, Class33.cameraY,
				Class4_Sub20_Sub13.cameraVerticalRotation, Class4_Sub6.cameraHorizontalRotation, i);
		Class41.method938((byte) 0);
		Class4_Sub20_Sub7_Sub6.aClass69_3439.method1140();
		Class4_Sub2_Sub1.method100(arg1, arg3, arg2, (byte) -78, arg4);
		Class9.method662(arg1, arg3, -27222);
		((Class34) Class4_Sub20_Sub12_Sub3.anInterface2_3530).method893(
				Class4_Sub20_Sub6.anInt2906, (byte) -118);
		Class24.method788(arg2, arg1, 20, arg3, arg4);
		Class33.cameraY = i_30_;
		Class4_Sub6.cameraHorizontalRotation = i_32_;
		Class4_Sub20_Sub13.cameraVerticalRotation = i_28_;
		RSInterface.cameraZ = i_31_;
		Class6.cameraX = i_29_;
		if (Class34.aBoolean1770 && Class14.method698(false, -104, true) == 0)
			Class34.aBoolean1770 = false;
		if (Class34.aBoolean1770) {
			Class4_Sub20_Sub12.method488(arg1, arg3, arg2, arg4, 0);
			Class19.method735(false, Class7.aJagexString_228, (byte) -126);
		}
		if (!Class34.aBoolean1770 && !Class4_Sub20_Sub16.aBoolean3169
				&& (arg1 ^ 0xffffffff) >= (i_35_ ^ 0xffffffff)
				&& (i_35_ ^ 0xffffffff) > (arg2 + arg1 ^ 0xffffffff)
				&& (i_36_ ^ 0xffffffff) <= (arg3 ^ 0xffffffff)
				&& i_36_ < arg4 + arg3)
			Class14.method704(arg3, i_36_, (byte) 64, arg1, i_35_);
	}

	public static JagexString method1046(int arg0, byte arg1, int arg2, byte[] arg3) {
		try {
			anInt1209++;
			JagexString jagexString = new JagexString();
			jagexString.aByteArray1803 = new byte[arg0];
			jagexString.anInt1805 = 0;
			for (int i = arg2; (i ^ 0xffffffff) > (arg0 + arg2 ^ 0xffffffff); i++) {
				if (arg3[i] != 0)
					jagexString.aByteArray1803[jagexString.anInt1805++] = arg3[i];
			}
			if (arg1 != 73)
				method1046(-106, (byte) 80, 28, null);
			return jagexString;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("re.F("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1047(JagexString arg0, boolean arg1, int arg2,
                                  JagexString arg3, JagexString arg4) {
		try {
			if (arg1 != false)
				anIntArray1222 = null;
			anInt1215++;
			for (int i = 99; (i ^ 0xffffffff) < -1; i--) {
				Class18.anIntArray473[i] = Class18.anIntArray473[i + -1];
				Class13.aJagexStringArray385[i] = Class13.aJagexStringArray385[-1 + i];
				Class4_Sub2_Sub1.aJagexStringArray2574[i] = Class4_Sub2_Sub1.aJagexStringArray2574[i - 1];
				Class4_Sub20_Sub9.aJagexStringArray3046[i] = Class4_Sub20_Sub9.aJagexStringArray3046[-1
						+ i];
			}
			Class18.anIntArray473[0] = arg2;
			Class13.aJagexStringArray385[0] = arg0;
			Class4_Sub2_Sub1.aJagexStringArray2574[0] = arg4;
			Class4_Sub20_Sub9.aJagexStringArray3046[0] = arg3;
			Class67.anInt1341 = Class4_Sub20_Sub10.anInt3053;
			Class80.anInt1646++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("re.A("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + (arg3 != null ? "{...}" : "null") + ','
					+ (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class4_Sub20_Sub7 aClass4_Sub20_Sub7_1197;

	public Class4_Sub20_Sub7 aClass4_Sub20_Sub7_1205;

	public Class4_Sub20_Sub7 aClass4_Sub20_Sub7_1217;

	public int anInt1200;

	public int anInt1204;

	public int anInt1214;

	public int anInt1216;

	public int anInt1219;
}
