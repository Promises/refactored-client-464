package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class4_Sub20_Sub14 extends Class4_Sub20 {
	public static Class19_Sub1 aClass19_Sub1_3146;
	public static JagexString aJagexString_3135 = JagexString.getRs2PreparedString(
			"Keine Antwort vom Server)3");
	public static JagexString aJagexString_3136;
	public static JagexString aJagexString_3137;
	public static JagexString aJagexString_3145;
	public static JagexString aJagexString_3147;
	public static JagexString aJagexString_3148;
	public static int anInt3134;
	public static int anInt3139 = 0;
	public static int anInt3140 = 0;
	public static int anInt3141;
	public static int anInt3142;
	public static int anInt3143;
	public static int anInt3144;
	public static int anInt3149;
	public static int anInt3150;
	static {
		aJagexString_3137 = JagexString
				.getRs2PreparedString("Wordpack geladen)3");
		aJagexString_3145 = JagexString.getRs2PreparedString("Einloggen");
		aJagexString_3148 = JagexString.getRs2PreparedString("Unable to connect)3"
        );
		aJagexString_3136 = aJagexString_3148;
		aJagexString_3147 = aJagexString_3148;
	}

	public static Class4_Sub20_Sub6 method593(int arg0, int arg1) {
		try {
			if (arg0 != -23222)
				anInt3139 = -32;
			anInt3134++;
			Class4_Sub20_Sub6 class4_sub20_sub6 = ((Class4_Sub20_Sub6) Class66.aClass66_1337
					.method1083(arg1, true));
			if (class4_sub20_sub6 != null)
				return class4_sub20_sub6;
			byte[] is = Class1.aClass19_80.method746(13, (byte) 107, arg1);
			class4_sub20_sub6 = new Class4_Sub20_Sub6();
			class4_sub20_sub6.anInt2922 = arg1;
			if (is != null)
				class4_sub20_sub6.method369(-40, new StreamBuffer(is));
			Class66.aClass66_1337.method1082(true, arg1, class4_sub20_sub6);
			return class4_sub20_sub6;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("pc.F("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static boolean method594(int arg0, int arg1, int arg2, Class19 arg3) {
		try {
			anInt3149++;
			if (arg0 != -30384)
				aJagexString_3135 = null;
			byte[] is = arg3.method746(arg2, (byte) 122, arg1);
			if (is == null)
				return false;
			Class64.method1060(is, -112);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("pc.B("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method595(byte arg0, Class19 arg1) {
		Class4_Sub2_Sub1.aClass19_2579 = arg1;
		anInt3150++;
		if (arg0 != 26)
			anInt3140 = -24;
	}

	public static void method596(boolean arg0, Class4_Sub20_Sub7_Sub1 arg1) {
		anInt3143++;
		arg1.anInt3257 = arg1.anInt3265;
		if (arg1.anInt3228 == 0)
			arg1.anInt3266 = 0;
		else {
			if (arg1.anInt3277 != -1 && (arg1.anInt3222 ^ 0xffffffff) == -1) {
				Class4_Sub20_Sub17 class4_sub20_sub17 = Class68.method1093(
						arg1.anInt3277, (byte) -118);
				if (arg1.anInt3236 > 0 && class4_sub20_sub17.anInt3183 == 0) {
					arg1.anInt3266++;
					return;
				}
				if ((arg1.anInt3236 ^ 0xffffffff) >= -1
						&& class4_sub20_sub17.anInt3188 == 0) {
					arg1.anInt3266++;
					return;
				}
			}
			int i = arg1.anInt3270;
			int i_0_ = arg1.anInt3267;
			int i_1_ = (arg1.anInt3244 * 64 + arg1.anIntArray3247[arg1.anInt3228 - 1] * 128);
			int i_2_ = (arg1.anInt3244 * 64 + 128 * arg1.anIntArray3248[arg1.anInt3228
					+ -1]);
			if (i_2_ + -i > 256 || (-i + i_2_ ^ 0xffffffff) > 255
					|| i_1_ + -i_0_ > 256 || -i_0_ + i_1_ < -256) {
				arg1.anInt3270 = i_2_;
				arg1.anInt3267 = i_1_;
			} else {
				if (i_2_ <= i) {
					if ((i ^ 0xffffffff) >= (i_2_ ^ 0xffffffff)) {
						if (i_1_ > i_0_)
							arg1.anInt3217 = 1024;
						else if (i_1_ < i_0_)
							arg1.anInt3217 = 0;
					} else if ((i_1_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff))
						arg1.anInt3217 = 768;
					else if ((i_1_ ^ 0xffffffff) <= (i_0_ ^ 0xffffffff))
						arg1.anInt3217 = 512;
					else
						arg1.anInt3217 = 256;
				} else if (i_1_ <= i_0_) {
					if (i_1_ < i_0_)
						arg1.anInt3217 = 1792;
					else
						arg1.anInt3217 = 1536;
				} else
					arg1.anInt3217 = 1280;
				int i_3_ = arg1.anInt3269;
				int i_4_ = 0x7ff & -arg1.anInt3219 + arg1.anInt3217;
				if (i_4_ > 1024)
					i_4_ -= 2048;
				if (i_4_ >= -256 && (i_4_ ^ 0xffffffff) >= -257)
					i_3_ = arg1.anInt3272;
				else if ((i_4_ ^ 0xffffffff) > -257
						|| (i_4_ ^ 0xffffffff) <= -769) {
					if (i_4_ >= -768 && (i_4_ ^ 0xffffffff) >= 255)
						i_3_ = arg1.anInt3263;
				} else
					i_3_ = arg1.anInt3251;
				if ((i_3_ ^ 0xffffffff) == 0)
					i_3_ = arg1.anInt3272;
				arg1.anInt3257 = i_3_;
				int i_5_ = 4;
				boolean bool = true;
				if (arg1 instanceof Class4_Sub20_Sub7_Sub1_Sub2)
					bool = (((Class4_Sub20_Sub7_Sub1_Sub2) arg1).aClass4_Sub20_Sub3_3617.aBoolean2792);
				if (!bool) {
					if (arg1.anInt3228 > 1)
						i_5_ = 6;
					if ((arg1.anInt3228 ^ 0xffffffff) < -3)
						i_5_ = 8;
					if (arg1.anInt3266 > 0 && arg1.anInt3228 > 1) {
						i_5_ = 8;
						arg1.anInt3266--;
					}
				} else {
					if (arg1.anInt3217 != arg1.anInt3219
							&& (arg1.anInt3293 ^ 0xffffffff) == 0
							&& arg1.anInt3237 != 0)
						i_5_ = 2;
					if (arg1.anInt3228 > 2)
						i_5_ = 6;
					if ((arg1.anInt3228 ^ 0xffffffff) < -4)
						i_5_ = 8;
					if (arg1.anInt3266 > 0 && arg1.anInt3228 > 1) {
						arg1.anInt3266--;
						i_5_ = 8;
					}
				}
				if (arg1.aBooleanArray3289[arg1.anInt3228 + -1])
					i_5_ <<= 1;
				if ((i_5_ ^ 0xffffffff) <= -9
						&& (arg1.anInt3257 ^ 0xffffffff) == (arg1.anInt3272 ^ 0xffffffff)
						&& arg1.anInt3274 != -1)
					arg1.anInt3257 = arg1.anInt3274;
				if ((i_2_ ^ 0xffffffff) >= (i ^ 0xffffffff)) {
					if ((i_2_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
						arg1.anInt3270 -= i_5_;
						if (i_2_ > arg1.anInt3270)
							arg1.anInt3270 = i_2_;
					}
				} else {
					arg1.anInt3270 += i_5_;
					if ((i_2_ ^ 0xffffffff) > (arg1.anInt3270 ^ 0xffffffff))
						arg1.anInt3270 = i_2_;
				}
				if ((i_1_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff)) {
					arg1.anInt3267 += i_5_;
					if (arg1.anInt3267 > i_1_)
						arg1.anInt3267 = i_1_;
				} else if (i_0_ > i_1_) {
					arg1.anInt3267 -= i_5_;
					if ((arg1.anInt3267 ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
						arg1.anInt3267 = i_1_;
				}
				if ((i_2_ ^ 0xffffffff) == (arg1.anInt3270 ^ 0xffffffff)
						&& (arg1.anInt3267 ^ 0xffffffff) == (i_1_ ^ 0xffffffff)) {
					arg1.anInt3228--;
					if ((arg1.anInt3236 ^ 0xffffffff) < -1)
						arg1.anInt3236--;
				}
				if (arg0 != false)
					aJagexString_3145 = null;
			}
		}
	}

	public static void method597(int arg0) {
		try {
			aJagexString_3137 = null;
			aJagexString_3135 = null;
			aClass19_Sub1_3146 = null;
			aJagexString_3148 = null;
			aJagexString_3145 = null;
			if (arg0 <= 38)
				aJagexString_3136 = null;
			aJagexString_3136 = null;
			aJagexString_3147 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "pc.G("
					+ arg0 + ')');
		}
	}

	public static void method599(boolean arg0, boolean arg1, Class76 arg2) {
		try {
			if (Class4_Sub20_Sub9.aClass76_3047 != null) {
				try {
					Class4_Sub20_Sub9.aClass76_3047.method1181(-31709);
				} catch (Exception exception) {
					/* empty */
				}
				Class4_Sub20_Sub9.aClass76_3047 = null;
			}
			anInt3144++;
			Class4_Sub20_Sub9.aClass76_3047 = arg2;
			if (arg1 == false) {
				Class4_Sub20_Sub7_Sub5.method426(122, arg0);
				Class74.aClass4_Sub11_1516.pointion = 0;
				Class40.aClass4_Sub11_783 = null;
				Class71.anInt1477 = 0;
				Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990 = null;
				for (;;) {
					Class4_Sub20_Sub10 class4_sub20_sub10 = ((Class4_Sub20_Sub10) RSCanvas.aClass16_47
							.method724((byte) 104));
					if (class4_sub20_sub10 == null)
						break;
					Class4_Sub20_Sub9.aClass16_3038.method720(
							class4_sub20_sub10, class4_sub20_sub10.aLong150,
							false);
					Class63.anInt1245--;
					Class31.anInt686++;
				}
				for (;;) {
					Class4_Sub20_Sub10 class4_sub20_sub10 = ((Class4_Sub20_Sub10) Class4_Sub10.aClass16_2045
							.method724((byte) -85));
					if (class4_sub20_sub10 == null)
						break;
					Region.aClass1_103.method38(class4_sub20_sub10, 1);
					Class58.aClass16_1171.method720(class4_sub20_sub10,
							(class4_sub20_sub10.aLong150), false);
					Class5.anInt188--;
					Class76.anInt1581++;
				}
				if ((Class9.aByte280 ^ 0xffffffff) != -1) {
					try {
						StreamBuffer class4_sub11 = new StreamBuffer(4);
						class4_sub11.method227((byte) -27, 4);
						class4_sub11.method227((byte) -27, Class9.aByte280);
						class4_sub11.method207(0, 2018779304);
						Class4_Sub20_Sub9.aClass76_3047.method1183(4, 0, 122,
								class4_sub11.byteBuffer);
					} catch (java.io.IOException ioexception) {
						try {
							Class4_Sub20_Sub9.aClass76_3047.method1181(-31709);
						} catch (Exception exception) {
							/* empty */
						}
						Class4_Sub20_Sub16.anInt3164++;
						Class4_Sub20_Sub9.aClass76_3047 = null;
					}
				}
				Class71.anInt1472 = 0;
				Class4_Sub2_Sub1.aLong2594 = Class52.method1002((byte) -42);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("pc.C("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method600(Region[] arg0, Class69 arg1, byte arg2) {
		try {
			for (int i = 0; (i ^ 0xffffffff) > -5; i++) {
				for (int i_11_ = 0; i_11_ < 104; i_11_++) {
					for (int i_12_ = 0; i_12_ < 104; i_12_++) {
						if ((0x1 & (Class46.landscapeData[i][i_11_][i_12_]) ^ 0xffffffff) == -2) {
							int i_13_ = i;
							if (((Class46.landscapeData[1][i_11_][i_12_]) & 0x2 ^ 0xffffffff) == -3)
								i_13_--;
							if ((i_13_ ^ 0xffffffff) <= -1)
								arg0[i_13_].method63(i_11_, i_12_, 2097152);
						}
					}
				}
			}
			Class57.anInt1147 += -2 + (int) (5.0 * Math.random());
			if ((Class57.anInt1147 ^ 0xffffffff) > 7)
				Class57.anInt1147 = -8;
			Class4_Sub16.anInt2309 += -2 + (int) (Math.random() * 5.0);
			anInt3142++;
			if (Class4_Sub16.anInt2309 < -16)
				Class4_Sub16.anInt2309 = -16;
			if ((Class4_Sub16.anInt2309 ^ 0xffffffff) < -17)
				Class4_Sub16.anInt2309 = 16;
			if ((Class57.anInt1147 ^ 0xffffffff) < -9)
				Class57.anInt1147 = 8;
			for (int i_14_ = 0; i_14_ < 4; i_14_++) {
				byte[][] is = Class4_Sub14.aByteArrayArrayArray2275[i_14_];
				int i_15_ = (int) Math.sqrt(5100.0);
				int i_16_ = i_15_ * 768 >> 989591560;
				for (int i_17_ = 1; i_17_ < 103; i_17_++) {
					for (int i_18_ = 1; (i_18_ ^ 0xffffffff) > -104; i_18_++) {
						int i_19_ = (-(Class4_Sub23.anIntArrayArrayArray2416[i_14_][i_18_
								+ -1][i_17_]) + (Class4_Sub23.anIntArrayArrayArray2416[i_14_][1 + i_18_][i_17_]));
						int i_20_ = (-(Class4_Sub23.anIntArrayArrayArray2416[i_14_][i_18_][i_17_ - 1]) + (Class4_Sub23.anIntArrayArrayArray2416[i_14_][i_18_][i_17_ + 1]));
						int i_21_ = (int) Math
								.sqrt((i_19_ * i_19_ + (65536 - -(i_20_ * i_20_))));
						int i_22_ = (i_19_ << -1315670360) / i_21_;
						int i_23_ = 65536 / i_21_;
						int i_24_ = (i_20_ << -1040806712) / i_21_;
						int i_25_ = (((-10 * i_23_ + -50 * i_22_ + i_24_ * -50) / i_16_) + 96);
						int i_26_ = ((is[i_18_][i_17_ + -1] >> 953308962) + ((is[i_18_ + 1][i_17_] >> 526973059)
								+ (is[-1 + i_18_][i_17_] >> -26702974) - (-(is[i_18_][1 + i_17_] >> 1559948387) + -(is[i_18_][i_17_] >> 688601249))));
						Class4_Sub20_Sub7_Sub5.anIntArrayArray3390[i_18_][i_17_] = -i_26_
								+ i_25_;
					}
				}
				for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > -105; i_27_++) {
					Class4_Sub23.anIntArray2411[i_27_] = 0;
					Class46.anIntArray937[i_27_] = 0;
					Class4_Sub21.anIntArray2373[i_27_] = 0;
					Class65.anIntArray1297[i_27_] = 0;
					JagexString.anIntArray1798[i_27_] = 0;
				}
				for (int i_28_ = -5; (i_28_ ^ 0xffffffff) > -110; i_28_++) {
					for (int i_29_ = 0; i_29_ < 104; i_29_++) {
						int i_30_ = 5 + i_28_;
						if (i_30_ >= 0 && i_30_ < 104) {
							int i_31_ = 0xff & (Class4_Sub20_Sub4.aByteArrayArrayArray2861[i_14_][i_30_][i_29_]);
							if (i_31_ > 0) {
								RS2Font class4_sub20_sub2 = Class13_Sub2
										.method697(i_31_ - 1, -7988);
								Class4_Sub23.anIntArray2411[i_29_] += class4_sub20_sub2.anInt2785;
								Class46.anIntArray937[i_29_] += class4_sub20_sub2.anInt2766;
								Class4_Sub21.anIntArray2373[i_29_] += class4_sub20_sub2.anInt2778;
								Class65.anIntArray1297[i_29_] += class4_sub20_sub2.anInt2784;
								JagexString.anIntArray1798[i_29_]++;
							}
						}
						int i_32_ = -5 + i_28_;
						if ((i_32_ ^ 0xffffffff) <= -1 && i_32_ < 104) {
							int i_33_ = 0xff & (Class4_Sub20_Sub4.aByteArrayArrayArray2861[i_14_][i_32_][i_29_]);
							if (i_33_ > 0) {
								RS2Font class4_sub20_sub2 = Class13_Sub2
										.method697(-1 + i_33_, -7988);
								Class4_Sub23.anIntArray2411[i_29_] -= class4_sub20_sub2.anInt2785;
								Class46.anIntArray937[i_29_] -= class4_sub20_sub2.anInt2766;
								Class4_Sub21.anIntArray2373[i_29_] -= class4_sub20_sub2.anInt2778;
								Class65.anIntArray1297[i_29_] -= class4_sub20_sub2.anInt2784;
								JagexString.anIntArray1798[i_29_]--;
							}
						}
					}
					if ((i_28_ ^ 0xffffffff) <= -2
							&& (i_28_ ^ 0xffffffff) > -104) {
						int i_34_ = 0;
						int i_35_ = 0;
						int i_36_ = 0;
						int i_37_ = 0;
						int i_38_ = 0;
						for (int i_39_ = -5; (i_39_ ^ 0xffffffff) > -110; i_39_++) {
							int i_40_ = -5 + i_39_;
							int i_41_ = i_39_ - -5;
							if (i_41_ >= 0 && i_41_ < 104) {
								i_34_ += Class4_Sub23.anIntArray2411[i_41_];
								i_38_ += Class65.anIntArray1297[i_41_];
								i_36_ += Class4_Sub21.anIntArray2373[i_41_];
								i_35_ += Class46.anIntArray937[i_41_];
								i_37_ += JagexString.anIntArray1798[i_41_];
							}
							if (i_40_ >= 0 && i_40_ < 104) {
								i_34_ -= Class4_Sub23.anIntArray2411[i_40_];
								i_36_ -= Class4_Sub21.anIntArray2373[i_40_];
								i_38_ -= Class65.anIntArray1297[i_40_];
								i_35_ -= Class46.anIntArray937[i_40_];
								i_37_ -= JagexString.anIntArray1798[i_40_];
							}
							if ((i_39_ ^ 0xffffffff) <= -2
									&& i_39_ < 103
									&& (!Class59.aBoolean1189
											|| (0x2 & (Class46.landscapeData[0][i_28_][i_39_]) ^ 0xffffffff) != -1 || (((Class46.landscapeData[i_14_][i_28_][i_39_]) & 0x10) == 0 && ((Class4_Sub15
											.method301(i_28_, 0, i_14_, i_39_) ^ 0xffffffff) == (Class50.anInt1010 ^ 0xffffffff))))) {
								if (i_14_ < Class4_Sub6.anInt1918)
									Class4_Sub6.anInt1918 = i_14_;
								int i_42_ = 0xff & (Class4_Sub20_Sub4.aByteArrayArrayArray2861[i_14_][i_28_][i_39_]);
								int i_43_ = 0xff & (Class59.aByteArrayArrayArray1181[i_14_][i_28_][i_39_]);
								if (i_42_ > 0 || i_43_ > 0) {
									int i_44_ = (Class4_Sub23.anIntArrayArrayArray2416[i_14_][i_28_
											- -1][i_39_]);
									int i_45_ = (Class4_Sub23.anIntArrayArrayArray2416[i_14_][i_28_][i_39_]);
									int i_46_ = (Class4_Sub23.anIntArrayArrayArray2416[i_14_][i_28_ + 1][1 + i_39_]);
									int i_47_ = (Class4_Sub23.anIntArrayArrayArray2416[i_14_][i_28_][i_39_
											- -1]);
									int i_48_ = (Class4_Sub20_Sub7_Sub5.anIntArrayArray3390[i_28_][i_39_]);
									int i_49_ = (Class4_Sub20_Sub7_Sub5.anIntArrayArray3390[1 + i_28_][i_39_]);
									int i_50_ = (Class4_Sub20_Sub7_Sub5.anIntArrayArray3390[i_28_ + 1][1 + i_39_]);
									int i_51_ = (Class4_Sub20_Sub7_Sub5.anIntArrayArray3390[i_28_][1 + i_39_]);
									int i_52_ = -1;
									int i_53_ = -1;
									if (i_42_ > 0) {
										int i_54_ = 256 * i_34_ / i_38_;
										int i_55_ = i_35_ / i_37_;
										int i_56_ = i_36_ / i_37_;
										i_52_ = RSFont.method73((byte) -1,
												i_56_, i_55_, i_54_);
										i_54_ = i_54_ + Class57.anInt1147
												& 0xff;
										i_56_ += Class4_Sub16.anInt2309;
										if ((i_56_ ^ 0xffffffff) > -1)
											i_56_ = 0;
										else if (i_56_ > 255)
											i_56_ = 255;
										i_53_ = RSFont.method73((byte) -1,
												i_56_, i_55_, i_54_);
									}
									if ((i_14_ ^ 0xffffffff) < -1) {
										boolean bool = true;
										if ((i_42_ ^ 0xffffffff) == -1
												&& ((Class4_Sub20_Sub10.aByteArrayArrayArray3054[i_14_][i_28_][i_39_]) ^ 0xffffffff) != -1)
											bool = false;
										if ((i_43_ ^ 0xffffffff) < -1
												&& !(Class4_Sub6
														.method184(i_43_ + -1,
																(byte) -112).aBoolean3040))
											bool = false;
										if (bool && i_44_ == i_45_
												&& i_45_ == i_46_
												&& i_47_ == i_45_)
											SceneGraph.heightmap[i_14_][i_28_][i_39_] = (Class4_Sub20_Sub7_Sub1
													.method389(
															(SceneGraph.heightmap[i_14_][i_28_][i_39_]),
															2340));
									}
									int i_57_ = 0;
									if (i_53_ != -1)
										i_57_ = (Class4_Sub20_Sub12_Sub3.anIntArray3523[Class61
												.method1043(96, i_53_, 128)]);
									if ((i_43_ ^ 0xffffffff) == -1)
										arg1.method1147(i_14_, i_28_, i_39_, 0,
												0, -1, i_45_, i_44_, i_46_,
												i_47_, Class61.method1043(
														i_48_, i_52_, 128),
												Class61.method1043(i_49_,
														i_52_, 128), Class61
														.method1043(i_50_,
																i_52_, 128),
												Class61.method1043(i_51_,
														i_52_, 128), 0, 0, 0,
												0, i_57_, 0);
									else {
										byte i_58_ = (Class4_Sub20_Sub10.aByteArrayArrayArray3065[i_14_][i_28_][i_39_]);
										int i_59_ = 1 + (Class4_Sub20_Sub10.aByteArrayArrayArray3054[i_14_][i_28_][i_39_]);
										Class4_Sub20_Sub9 class4_sub20_sub9 = (Class4_Sub6
												.method184(i_43_ - 1,
														(byte) -112));
										int i_60_ = class4_sub20_sub9.anInt3027;
										int i_61_;
										int i_62_;
										if ((i_60_ ^ 0xffffffff) > -1) {
											if ((class4_sub20_sub9.anInt3025 ^ 0xffffffff) == -16711936) {
												i_61_ = -2;
												i_60_ = -1;
												i_62_ = -2;
											} else {
												i_61_ = (RSFont
														.method73(
																(byte) -1,
																(class4_sub20_sub9.anInt3029),
																(class4_sub20_sub9.anInt3039),
																(class4_sub20_sub9.anInt3031)));
												int i_63_ = ((class4_sub20_sub9.anInt3029) - -(Class4_Sub16.anInt2309));
												int i_64_ = (0xff & ((class4_sub20_sub9.anInt3031) + (Class57.anInt1147)));
												if (i_63_ < 0)
													i_63_ = 0;
												else if ((i_63_ ^ 0xffffffff) < -256)
													i_63_ = 255;
												i_62_ = (RSFont
														.method73(
																(byte) -1,
																i_63_,
																(class4_sub20_sub9.anInt3039),
																i_64_));
											}
										} else {
											i_61_ = -1;
											i_62_ = Class4_Sub20_Sub12_Sub3.anInterface2_3530
													.method8(96, i_60_);
										}
										int i_65_ = 0;
										if (i_62_ != -2)
											i_65_ = (Class4_Sub20_Sub12_Sub3.anIntArray3523[(Class4_Sub15
													.method300(i_62_,
															(byte) 96, 96))]);
										if (class4_sub20_sub9.anInt3023 != -1) {
											int i_66_ = ((Class57.anInt1147 + (class4_sub20_sub9.anInt3024)) & 0xff);
											int i_67_ = (Class4_Sub16.anInt2309 + (class4_sub20_sub9.anInt3028));
											if (i_67_ >= 0) {
												if ((i_67_ ^ 0xffffffff) < -256)
													i_67_ = 255;
											} else
												i_67_ = 0;
											i_62_ = (RSFont
													.method73(
															(byte) -1,
															i_67_,
															(class4_sub20_sub9.anInt3036),
															i_66_));
											i_65_ = (Class4_Sub20_Sub12_Sub3.anIntArray3523[(Class4_Sub15
													.method300(i_62_,
															(byte) 96, 96))]);
										}
										arg1.method1147(i_14_, i_28_, i_39_,
												i_59_, i_58_, i_60_, i_45_,
												i_44_, i_46_, i_47_, Class61
														.method1043(i_48_,
																i_52_, 128),
												Class61.method1043(i_49_,
														i_52_, 128), Class61
														.method1043(i_50_,
																i_52_, 128),
												Class61.method1043(i_51_,
														i_52_, 128),
												Class4_Sub15.method300(i_61_,
														(byte) 96, i_48_),
												Class4_Sub15.method300(i_61_,
														(byte) 96, i_49_),
												Class4_Sub15.method300(i_61_,
														(byte) 96, i_50_),
												Class4_Sub15.method300(i_61_,
														(byte) 96, i_51_),
												i_57_, i_65_);
									}
								}
							}
						}
					}
				}
				for (int i_68_ = 1; (i_68_ ^ 0xffffffff) > -104; i_68_++) {
					for (int i_69_ = 1; i_69_ < 103; i_69_++)
						arg1.method1104(i_14_, i_69_, i_68_,
								Class4_Sub15.method301(i_69_, 0, i_14_, i_68_));
				}
				Class4_Sub20_Sub4.aByteArrayArrayArray2861[i_14_] = null;
				Class59.aByteArrayArrayArray1181[i_14_] = null;
				Class4_Sub20_Sub10.aByteArrayArrayArray3054[i_14_] = null;
				Class4_Sub20_Sub10.aByteArrayArrayArray3065[i_14_] = null;
				Class4_Sub14.aByteArrayArrayArray2275[i_14_] = null;
			}
			arg1.method1125(-50, -10, -50);
			for (int i_70_ = 0; i_70_ < 104; i_70_++) {
				for (int i_71_ = 0; (i_71_ ^ 0xffffffff) > -105; i_71_++) {
					if ((Class46.landscapeData[1][i_70_][i_71_] & 0x2 ^ 0xffffffff) == -3)
						arg1.method1109(i_70_, i_71_);
				}
			}
			int i_72_ = 1;
			int i_73_ = 4;
			int i_74_ = 2;
			for (int i_75_ = 0; i_75_ < 4; i_75_++) {
				if (i_75_ > 0) {
					i_74_ <<= 3;
					i_72_ <<= 3;
					i_73_ <<= 3;
				}
				for (int i_76_ = 0; (i_75_ ^ 0xffffffff) <= (i_76_ ^ 0xffffffff); i_76_++) {
					for (int i_77_ = 0; i_77_ <= 104; i_77_++) {
						for (int i_78_ = 0; (i_78_ ^ 0xffffffff) >= -105; i_78_++) {
							if ((i_72_ & (SceneGraph.heightmap[i_76_][i_78_][i_77_])) != 0) {
								int i_79_ = i_77_;
								int i_80_ = i_77_;
								for (/**/; ((i_79_ ^ 0xffffffff) < -1 && ((SceneGraph.heightmap[i_76_][i_78_][i_79_
										+ -1])
										& i_72_ ^ 0xffffffff) != -1); i_79_--) {
									/* empty */
								}
								int i_81_ = i_76_;
								for (/**/; i_80_ < 104; i_80_++) {
									if (((SceneGraph.heightmap[i_76_][i_78_][1 + i_80_])
											& i_72_ ^ 0xffffffff) == -1)
										break;
								}
								while_18_: for (/**/; (i_81_ ^ 0xffffffff) < -1; i_81_--) {
									for (int i_82_ = i_79_; i_82_ <= i_80_; i_82_++) {
										if ((i_72_ & (SceneGraph.heightmap[-1
												+ i_81_][i_78_][i_82_])) == 0)
											break while_18_;
									}
								}
								int i_83_;
								while_19_: for (i_83_ = i_76_; ((i_75_ ^ 0xffffffff) < (i_83_ ^ 0xffffffff)); i_83_++) {
									for (int i_84_ = i_79_; ((i_84_ ^ 0xffffffff) >= (i_80_ ^ 0xffffffff)); i_84_++) {
										if ((i_72_
												& (SceneGraph.heightmap[i_83_ + 1][i_78_][i_84_]) ^ 0xffffffff) == -1)
											break while_19_;
									}
								}
								int i_85_ = ((i_80_ - i_79_ + 1) * (1 + (i_83_ - i_81_)));
								if ((i_85_ ^ 0xffffffff) <= -9) {
									int i_86_ = 240;
									int i_87_ = -i_86_
											+ (Class4_Sub23.anIntArrayArrayArray2416[i_83_][i_78_][i_79_]);
									int i_88_ = (Class4_Sub23.anIntArrayArrayArray2416[i_81_][i_78_][i_79_]);
									Class69.method1133(i_75_, 1, i_78_ * 128,
											128 * i_78_, i_79_ * 128, 128
													* i_80_ - -128, i_87_,
											i_88_);
									for (int i_89_ = i_81_; ((i_83_ ^ 0xffffffff) <= (i_89_ ^ 0xffffffff)); i_89_++) {
										for (int i_90_ = i_79_; ((i_80_ ^ 0xffffffff) <= (i_90_ ^ 0xffffffff)); i_90_++)
											SceneGraph.heightmap[i_89_][i_78_][i_90_] = (Class59
													.method1035(
															(SceneGraph.heightmap[i_89_][i_78_][i_90_]),
															i_72_ ^ 0xffffffff));
									}
								}
							}
							if (((SceneGraph.heightmap[i_76_][i_78_][i_77_]) & i_74_) != 0) {
								int i_91_;
								for (i_91_ = i_78_; i_91_ > 0
										&& ((SceneGraph.heightmap[i_76_][i_91_ - 1][i_77_]) & i_74_) != 0; i_91_--) {
									/* empty */
								}
								int i_92_ = i_76_;
								int i_93_ = i_76_;
								int i_94_;
								for (i_94_ = i_78_; (i_94_ ^ 0xffffffff) > -105; i_94_++) {
									if ((i_74_
											& (SceneGraph.heightmap[i_76_][i_94_ + 1][i_77_]) ^ 0xffffffff) == -1)
										break;
								}
								while_20_: for (/**/; (i_92_ ^ 0xffffffff) < -1; i_92_--) {
									for (int i_95_ = i_91_; ((i_94_ ^ 0xffffffff) <= (i_95_ ^ 0xffffffff)); i_95_++) {
										if ((i_74_
												& (SceneGraph.heightmap[i_92_
														+ -1][i_95_][i_77_]) ^ 0xffffffff) == -1)
											break while_20_;
									}
								}
								while_21_: for (/**/; ((i_75_ ^ 0xffffffff) < (i_93_ ^ 0xffffffff)); i_93_++) {
									for (int i_96_ = i_91_; i_96_ <= i_94_; i_96_++) {
										if ((i_74_
												& (SceneGraph.heightmap[1 + i_93_][i_96_][i_77_]) ^ 0xffffffff) == -1)
											break while_21_;
									}
								}
								int i_97_ = ((-i_92_ + i_93_ + 1) * (1 + i_94_ + -i_91_));
								if (i_97_ >= 8) {
									int i_98_ = 240;
									int i_99_ = ((Class4_Sub23.anIntArrayArrayArray2416[i_93_][i_91_][i_77_]) + -i_98_);
									int i_100_ = (Class4_Sub23.anIntArrayArrayArray2416[i_92_][i_91_][i_77_]);
									Class69.method1133(i_75_, 2, i_91_ * 128,
											128 + i_94_ * 128, 128 * i_77_,
											128 * i_77_, i_99_, i_100_);
									for (int i_101_ = i_92_; i_93_ >= i_101_; i_101_++) {
										for (int i_102_ = i_91_; i_102_ <= i_94_; i_102_++)
											SceneGraph.heightmap[i_101_][i_102_][i_77_] = (Class59
													.method1035(
															(SceneGraph.heightmap[i_101_][i_102_][i_77_]),
															i_74_ ^ 0xffffffff));
									}
								}
							}
							if (((SceneGraph.heightmap[i_76_][i_78_][i_77_])
									& i_73_ ^ 0xffffffff) != -1) {
								int i_103_ = i_78_;
								int i_104_ = i_77_;
								int i_105_ = i_78_;
								for (/**/; (i_104_ < 104 && (i_73_ & (SceneGraph.heightmap[i_76_][i_78_][i_104_
										- -1])) != 0); i_104_++) {
									/* empty */
								}
								int i_106_;
								for (i_106_ = i_77_; (i_106_ ^ 0xffffffff) < -1; i_106_--) {
									if ((i_73_ & (SceneGraph.heightmap[i_76_][i_78_][-1
											+ i_106_])) == 0)
										break;
								}
								while_22_: for (/**/; (i_103_ ^ 0xffffffff) < -1; i_103_--) {
									for (int i_107_ = i_106_; ((i_104_ ^ 0xffffffff) <= (i_107_ ^ 0xffffffff)); i_107_++) {
										if ((i_73_
												& (SceneGraph.heightmap[i_76_][i_103_
														+ -1][i_107_]) ^ 0xffffffff) == -1)
											break while_22_;
									}
								}
								while_23_: for (/**/; (i_105_ ^ 0xffffffff) > -105; i_105_++) {
									for (int i_108_ = i_106_; i_104_ >= i_108_; i_108_++) {
										if (((SceneGraph.heightmap[i_76_][1 + i_105_][i_108_])
												& i_73_ ^ 0xffffffff) == -1)
											break while_23_;
									}
								}
								if (((1 + -i_106_ + i_104_)
										* (1 + (i_105_ + -i_103_)) ^ 0xffffffff) <= -5) {
									int i_109_ = (Class4_Sub23.anIntArrayArrayArray2416[i_76_][i_103_][i_106_]);
									Class69.method1133(i_75_, 4, i_103_ * 128,
											128 + 128 * i_105_, 128 * i_106_,
											i_104_ * 128 + 128, i_109_, i_109_);
									for (int i_110_ = i_103_; i_110_ <= i_105_; i_110_++) {
										for (int i_111_ = i_106_; i_104_ >= i_111_; i_111_++)
											SceneGraph.heightmap[i_76_][i_110_][i_111_] = (Class59
													.method1035(
															(SceneGraph.heightmap[i_76_][i_110_][i_111_]),
															i_73_ ^ 0xffffffff));
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("pc.D("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')'));
		}
	}

	public Class44[] aClass44Array3138;

	public Class4_Sub20_Sub14(Class19 arg0, Class19 arg1, int arg2, boolean arg3) {
		try {
			Class65 class65 = new Class65();
			int i = arg0.method741(arg2, true);
			aClass44Array3138 = new Class44[i];
			int[] is = arg0.method751(107, arg2);
			for (int i_6_ = 0; is.length > i_6_; i_6_++) {
				Class4_Sub24 class4_sub24 = null;
				byte[] is_7_ = arg0.method746(arg2, (byte) 92, is[i_6_]);
				int i_8_ = is_7_[1] & 0xff | (is_7_[0] & 0xff) << -194963096;
				for (Class4_Sub24 class4_sub24_9_ = (Class4_Sub24) class65
						.method1071(-126); class4_sub24_9_ != null; class4_sub24_9_ = (Class4_Sub24) class65
						.method1075(18485)) {
					if (i_8_ == class4_sub24_9_.anInt2436) {
						class4_sub24 = class4_sub24_9_;
						break;
					}
				}
				if (class4_sub24 == null) {
					byte[] is_10_;
					if (arg3)
						is_10_ = arg1.method738(i_8_, (byte) -80, 0);
					else
						is_10_ = arg1.method738(0, (byte) -81, i_8_);
					class4_sub24 = new Class4_Sub24(i_8_, is_10_);
					class65.method1068(class4_sub24, (byte) -121);
				}
				aClass44Array3138[is[i_6_]] = new Class44(is_7_, class4_sub24);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("pc.<init>(" + (arg0 != null ? "{...}" : "null") + ','
							+ (arg1 != null ? "{...}" : "null") + ',' + arg2
							+ ',' + arg3 + ')'));
		}
	}

	public boolean method598(byte arg0, int arg1) {
		try {
			if (arg0 != 74)
				aJagexString_3136 = null;
			anInt3141++;
			return aClass44Array3138[arg1].aBoolean911;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("pc.H("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
