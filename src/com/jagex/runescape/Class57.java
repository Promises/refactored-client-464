package com.jagex.runescape;

public class Class57 {
	public static boolean aBoolean1127 = false;
	public static boolean aBoolean1132;
	public static JagexString aJagexString_1126;
	public static JagexString aJagexString_1128;
	public static JagexString aJagexString_1139;
	public static JagexString aJagexString_1152;
	public static JagexString aJagexString_1154;
	public static Region[] regions;
	public static Class4_Sub20_Sub12_Sub1[] aClass4_Sub20_Sub12_Sub1Array1135;
	public static Class4_Sub20_Sub7_Sub1_Sub2[] aClass4_Sub20_Sub7_Sub1_Sub2Array1151;
	public static Class66 aClass66_1131;
	public static int anInt1122;
	public static int anInt1130;
	public static int anInt1133;
	public static int anInt1134;
	public static int anInt1136;
	public static int anInt1138;
	public static int anInt1141;
	public static int anInt1142;
	public static int anInt1145;
	public static int anInt1146;
	public static int anInt1147;
	public static int anInt1150;
	public static int anInt1153;
	public static int anInt1155;
	static {
		regions = new Region[4];
		anInt1130 = 0;
		aJagexString_1126 = JagexString.getRs2PreparedString("hel");
		aJagexString_1139 = JagexString.getRs2PreparedString("Lade Schrifts-=tze )2 "
        );
		aBoolean1132 = false;
		aJagexString_1128 = JagexString.getRs2PreparedString("Use");
		anInt1141 = 0;
		anInt1147 = (int) (Math.random() * 17.0) + -8;
		aClass4_Sub20_Sub7_Sub1_Sub2Array1151 = new Class4_Sub20_Sub7_Sub1_Sub2[32768];
		aJagexString_1152 = JagexString.getRs2PreparedString("Okay");
		aJagexString_1154 = aJagexString_1128;
		aClass66_1131 = new Class66(64);
		anInt1155 = 0;
	}

	public static int method1020(int arg0, int arg1, int arg2, int arg3) {
		try {
			anInt1150++;
			int i = arg2 / arg1;
			int i_0_ = arg2 & -1 + arg1;
			int i_1_ = arg1 + -1 & arg3;
			int i_2_ = arg3 / arg1;
			if (arg0 > -75)
				return 75;
			int i_3_ = Class50.method998(-1, i_2_, i);
			int i_4_ = Class50.method998(-1, i_2_, i + 1);
			int i_5_ = Class50.method998(-1, 1 + i_2_, i);
			int i_6_ = Class50.method998(-1, i_2_ + 1, 1 + i);
			int i_7_ = Class14.method700(i_4_, arg1, i_3_, i_0_, (byte) 109);
			int i_8_ = Class14.method700(i_6_, arg1, i_5_, i_0_, (byte) 122);
			return Class14.method700(i_8_, arg1, i_7_, i_1_, (byte) 110);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("q.B("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method1021(int arg0) {
		try {
			anInt1145++;
			for (Class4_Sub7 class4_sub7 = (Class4_Sub7) Class4_Sub20_Sub7_Sub1_Sub2.aClass65_3618
					.method1071(-124); class4_sub7 != null; class4_sub7 = (Class4_Sub7) Class4_Sub20_Sub7_Sub1_Sub2.aClass65_3618
					.method1075(18485)) {
				if ((class4_sub7.anInt1954 ^ 0xffffffff) < -1)
					class4_sub7.anInt1954--;
				if ((class4_sub7.anInt1954 ^ 0xffffffff) == -1) {
					if (class4_sub7.anInt1958 < 0
							|| Class58.method1033(0, class4_sub7.anInt1958,
									class4_sub7.anInt1962)) {
						Class4_Sub20_Sub6.method368(class4_sub7.anInt1958,
								class4_sub7.anInt1961, class4_sub7.anInt1953,
								(byte) -103, class4_sub7.anInt1955,
								class4_sub7.anInt1962, class4_sub7.anInt1950,
								class4_sub7.anInt1959);
						class4_sub7.clear();
					}
				} else {
					if (class4_sub7.anInt1952 > 0)
						class4_sub7.anInt1952--;
					if ((class4_sub7.anInt1952 ^ 0xffffffff) == -1
							&& class4_sub7.anInt1953 >= 1
							&& class4_sub7.anInt1950 >= 1
							&& (class4_sub7.anInt1953 ^ 0xffffffff) >= -103
							&& (class4_sub7.anInt1950 ^ 0xffffffff) >= -103
							&& (class4_sub7.anInt1951 < 0 || Class58
									.method1033(0, class4_sub7.anInt1951,
											class4_sub7.anInt1946))) {
						Class4_Sub20_Sub6.method368(class4_sub7.anInt1951,
								class4_sub7.anInt1961, class4_sub7.anInt1953,
								(byte) -97, class4_sub7.anInt1949,
								class4_sub7.anInt1946, class4_sub7.anInt1950,
								class4_sub7.anInt1959);
						class4_sub7.anInt1952 = -1;
						if (class4_sub7.anInt1951 == class4_sub7.anInt1958
								&& (class4_sub7.anInt1958 ^ 0xffffffff) == 0)
							class4_sub7.clear();
						else if (class4_sub7.anInt1958 == class4_sub7.anInt1951
								&& ((class4_sub7.anInt1955 ^ 0xffffffff) == (class4_sub7.anInt1949 ^ 0xffffffff))
								&& ((class4_sub7.anInt1962 ^ 0xffffffff) == (class4_sub7.anInt1946 ^ 0xffffffff)))
							class4_sub7.clear();
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "q.C("
					+ arg0 + ')');
		}
	}

	public static void method1022(byte arg0) {
		try {
			Class4_Sub20_Sub9.minimapState = 0;
			Class1.anInt74 = 0;
			Class41.anInt822 = -1;
			Class66.aClass4_Sub11_Sub1_1328.pointer = 0;
			if (arg0 > -86)
				aJagexString_1154 = null;
			RSCanvas.anInt56 = -1;
			Class43.anInt874 = -1;
			Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.pointer = 0;
			anInt1134++;
			anInt1130 = 0;
			Class4_Sub20_Sub15.anInt3157 = 0;
			Class4_Sub20_Sub8.anInt2980 = 0;
			Class4_Sub20_Sub16.aBoolean3169 = false;
			AppletListener.anInt1448 = 0;
			Class4_Sub20_Sub11.incomingPacket = -1;
			for (int i = 0; ((i ^ 0xffffffff) > ((Class4_Sub20_Sub7_Sub4.aPlayerArray3358).length ^ 0xffffffff)); i++) {
				if ((Class4_Sub20_Sub7_Sub4.aPlayerArray3358[i]) != null)
					Class4_Sub20_Sub7_Sub4.aPlayerArray3358[i].anInt3293 = -1;
			}
			for (int i = 0; i < aClass4_Sub20_Sub7_Sub1_Sub2Array1151.length; i++) {
				if (aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i] != null)
					aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i].anInt3293 = -1;
			}
			Class13_Sub2.method695((byte) -127);
			Region.method50(30, 1);
			for (int i = 0; (i ^ 0xffffffff) > -101; i++)
				Class4_Sub20_Sub11.aBooleanArray3083[i] = true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "q.H("
					+ arg0 + ')');
		}
	}

	public static void method1023(int arg0) {
		try {
			anInt1153++;
			for (int i = -1; Class4_Sub20_Sub7_Sub6.anInt3431 > i; i++) {
				int i_9_;
				if (i == -1)
					i_9_ = 2047;
				else
					i_9_ = Class4_Sub23.anIntArray2432[i];
				Player player = (Class4_Sub20_Sub7_Sub4.aPlayerArray3358[i_9_]);
				if (player != null
						&& ((player.anInt3253 ^ 0xffffffff) < -1)) {
					player.anInt3253--;
					if (player.anInt3253 == 0)
						player.aJagexString_3271 = null;
				}
			}
			for (int i = 0; (GameShell.anInt12 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				int i_10_ = Class4_Sub11_Sub1.anIntArray2695[i];
				Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = aClass4_Sub20_Sub7_Sub1_Sub2Array1151[i_10_];
				if (class4_sub20_sub7_sub1_sub2 != null
						&& ((class4_sub20_sub7_sub1_sub2.anInt3253 ^ 0xffffffff) < -1)) {
					class4_sub20_sub7_sub1_sub2.anInt3253--;
					if (class4_sub20_sub7_sub1_sub2.anInt3253 == 0)
						class4_sub20_sub7_sub1_sub2.aJagexString_3271 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "q.G("
					+ arg0 + ')');
		}
	}

	public static ImageRGB method1024(int arg0, Class19 arg1,
									  JagexString arg2, JagexString arg3) {
		try {
			if (arg0 != 26149)
				method1026(null, null, -27, null, null);
			int i = arg1.method754(arg2, 1);
			int i_11_ = arg1.method747(false, arg3, i);
			anInt1133++;
			return Class4_Sub20.method321(i_11_, i, -1, arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("q.A("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1025(int arg0, byte arg1, int arg2, int arg3,
			int arg4, int arg5) {
		int i = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1126(arg0, arg2,
				arg5);
		anInt1136++;
		if (i != 0) {
			int i_12_ = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1146(arg0,
					arg2, arg5, i);
			int i_13_ = (0xc9 & i_12_) >> -1136334650;
			int i_14_ = arg4;
			if ((i ^ 0xffffffff) < -1)
				i_14_ = arg3;
			int[] is = (RS2Font.minimapImage.anIntArray3515);
			int i_15_ = i_12_ & 0x1f;
			int i_16_ = 4 * (52736 - 512 * arg5) + (4 * arg2 + 24624);
			int i_17_ = 0x7fff & i >> 2080712622;
			Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(true, i_17_);
			if (class4_sub20_sub1.anInt2702 == -1) {
				if (i_15_ == 0 || i_15_ == 2) {
					if (i_13_ != 0) {
						if (i_13_ != 1) {
							if (i_13_ == 2) {
								is[i_16_ + 3] = i_14_;
								is[i_16_ + 515] = i_14_;
								is[i_16_ + 1027] = i_14_;
								is[i_16_ - -1539] = i_14_;
							} else if ((i_13_ ^ 0xffffffff) == -4) {
								is[i_16_ + 1536] = i_14_;
								is[i_16_ - -1537] = i_14_;
								is[i_16_ + 1536 + 2] = i_14_;
								is[i_16_ + 1536 + 3] = i_14_;
							}
						} else {
							is[i_16_] = i_14_;
							is[1 + i_16_] = i_14_;
							is[2 + i_16_] = i_14_;
							is[3 + i_16_] = i_14_;
						}
					} else {
						is[i_16_] = i_14_;
						is[512 + i_16_] = i_14_;
						is[1024 + i_16_] = i_14_;
						is[1536 + i_16_] = i_14_;
					}
				}
				if (i_15_ == 3) {
					if ((i_13_ ^ 0xffffffff) == -1)
						is[i_16_] = i_14_;
					else if ((i_13_ ^ 0xffffffff) != -2) {
						if ((i_13_ ^ 0xffffffff) != -3) {
							if ((i_13_ ^ 0xffffffff) == -4)
								is[1536 + i_16_] = i_14_;
						} else
							is[i_16_ + 1539] = i_14_;
					} else
						is[3 + i_16_] = i_14_;
				}
				if (i_15_ == 2) {
					if (i_13_ == 3) {
						is[i_16_] = i_14_;
						is[i_16_ + 512] = i_14_;
						is[1024 + i_16_] = i_14_;
						is[i_16_ - -1536] = i_14_;
					} else if (i_13_ == 0) {
						is[i_16_] = i_14_;
						is[1 + i_16_] = i_14_;
						is[i_16_ - -2] = i_14_;
						is[i_16_ + 3] = i_14_;
					} else if (i_13_ == 1) {
						is[3 + i_16_] = i_14_;
						is[512 + i_16_ - -3] = i_14_;
						is[1024 + i_16_ + 3] = i_14_;
						is[1536 + (i_16_ - -3)] = i_14_;
					} else if (i_13_ == 2) {
						is[i_16_ + 1536] = i_14_;
						is[i_16_ + 1537] = i_14_;
						is[i_16_ - -1536 - -2] = i_14_;
						is[3 + i_16_ - -1536] = i_14_;
					}
				}
			} else {
				Class4_Sub20_Sub12_Sub1 class4_sub20_sub12_sub1 = (Class1.aClass4_Sub20_Sub12_Sub1Array66[class4_sub20_sub1.anInt2702]);
				if (class4_sub20_sub12_sub1 != null) {
					int i_18_ = ((class4_sub20_sub1.anInt2725 * 4 + -class4_sub20_sub12_sub1.anInt3511) / 2);
					int i_19_ = ((class4_sub20_sub1.anInt2744 * 4 + -class4_sub20_sub12_sub1.anInt3514) / 2);
					class4_sub20_sub12_sub1
							.method507(i_18_ + (arg2 * 4 + 48),
									(48 - -((-(class4_sub20_sub1.anInt2744)
											+ -arg5 + 104) * 4) - -i_19_));
				}
			}
		}
		i = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1103(arg0, arg2, arg5);
		if ((i ^ 0xffffffff) != -1) {
			int i_20_ = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1146(arg0,
					arg2, arg5, i);
			int i_21_ = i_20_ >> 2131378310 & 0x3;
			int i_22_ = i_20_ & 0x1f;
			int i_23_ = (0x1ffff5ef & i) >> 1123176206;
			Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(true, i_23_);
			if (class4_sub20_sub1.anInt2702 == -1) {
				if ((i_22_ ^ 0xffffffff) == -10) {
					int i_24_ = 15658734;
					int[] is = (RS2Font.minimapImage.anIntArray3515);
					if (i > 0)
						i_24_ = 15597568;
					int i_25_ = 2048 * (103 - arg5) + (24624 - -(arg2 * 4));
					if ((i_21_ ^ 0xffffffff) != -1 && i_21_ != 2) {
						is[i_25_] = i_24_;
						is[513 + i_25_] = i_24_;
						is[2 + (i_25_ - -1024)] = i_24_;
						is[1539 + i_25_] = i_24_;
					} else {
						is[i_25_ - -1536] = i_24_;
						is[1024 + (i_25_ + 1)] = i_24_;
						is[i_25_ + 512 + 2] = i_24_;
						is[3 + i_25_] = i_24_;
					}
				}
			} else {
				Class4_Sub20_Sub12_Sub1 class4_sub20_sub12_sub1 = (Class1.aClass4_Sub20_Sub12_Sub1Array66[class4_sub20_sub1.anInt2702]);
				if (class4_sub20_sub12_sub1 != null) {
					int i_26_ = ((-class4_sub20_sub12_sub1.anInt3511 + 4 * class4_sub20_sub1.anInt2725) / 2);
					int i_27_ = ((4 * class4_sub20_sub1.anInt2744 - class4_sub20_sub12_sub1.anInt3514) / 2);
					class4_sub20_sub12_sub1
							.method507(
									i_26_ + (4 * arg2 + 48),
									(4 * (-(class4_sub20_sub1.anInt2744) + (104 - arg5)) + 48 - -i_27_));
				}
			}
		}
		i = Class4_Sub20_Sub7_Sub6.aClass69_3439.method1101(arg0, arg2, arg5);
		if (i != 0) {
			int i_28_ = (i & 0x1fffc0b0) >> 731549934;
			Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(true, i_28_);
			if ((class4_sub20_sub1.anInt2702 ^ 0xffffffff) != 0) {
				Class4_Sub20_Sub12_Sub1 class4_sub20_sub12_sub1 = (Class1.aClass4_Sub20_Sub12_Sub1Array66[class4_sub20_sub1.anInt2702]);
				if (class4_sub20_sub12_sub1 != null) {
					int i_29_ = ((class4_sub20_sub1.anInt2744 * 4 - class4_sub20_sub12_sub1.anInt3514) / 2);
					int i_30_ = ((-class4_sub20_sub12_sub1.anInt3511 + class4_sub20_sub1.anInt2725 * 4) / 2);
					class4_sub20_sub12_sub1
							.method507(
									i_30_ + arg2 * 4 + 48,
									(i_29_ + ((-(class4_sub20_sub1.anInt2744) + (-arg5 + 104)) * 4 + 48)));
				}
			}
		}
		if (arg1 >= -82)
			aJagexString_1154 = null;
	}

	public static Class4_Sub20_Sub12_Sub4_Sub1 method1026(JagexString arg0,
                                                          Class19 arg1, int arg2, JagexString arg3, Class19 arg4) {
		try {
			anInt1146++;
			int i_31_ = arg1.method754(arg0, 1);
			int i_32_ = arg1.method747(false, arg3, i_31_);
			return Class4_Sub20_Sub4.method357(arg4, 4550, arg1, i_31_, i_32_);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("q.I("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ','
					+ (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1027(int arg0) {
		try {
			aClass4_Sub20_Sub7_Sub1_Sub2Array1151 = null;
			aJagexString_1128 = null;
			aClass66_1131 = null;
			if (arg0 != -10159)
				method1028(-46, 31);
			aJagexString_1152 = null;
			aJagexString_1154 = null;
			aJagexString_1139 = null;
			aClass4_Sub20_Sub12_Sub1Array1135 = null;
			aJagexString_1126 = null;
			regions = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "q.E("
					+ arg0 + ')');
		}
	}

	public static int method1028(int arg0, int arg1) {
		try {
			Class4_Sub20_Sub4 class4_sub20_sub4 = Class4_Sub7.method187(arg1,
					arg0 + 106);
			anInt1122++;
			int i = class4_sub20_sub4.anInt2846;
			int i_33_ = class4_sub20_sub4.anInt2865;
			int i_34_ = Class4_Sub20_Sub9.anIntArray3044[-i_33_ + i];
			int i_35_ = class4_sub20_sub4.anInt2862;
			if (arg0 != -1)
				method1022((byte) -16);
			return Class31.anIntArray687[i_35_] >> i_33_ & i_34_;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("q.D("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public byte[] aByteArray1143;

	public byte[] aByteArray1144;

	public int anInt1123;

	public int anInt1125;

	public int anInt1129;

	public int anInt1137;

	public int anInt1140;

	public int anInt1148;

	public int anInt1149;
}
