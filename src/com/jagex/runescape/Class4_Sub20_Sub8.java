package com.jagex.runescape;
import java.awt.Component;
import java.lang.reflect.Method;

public class Class4_Sub20_Sub8 extends Class4_Sub20 {
	public static JagexString aJagexString_2958 = JagexString.getRs2PreparedString(
			"Loading sprites )2 ");
	public static JagexString aJagexString_2967;
	public static JagexString aJagexString_2973;
	public static JagexString aJagexString_2981;
	public static JagexString aJagexString_2982;
	public static JagexString aJagexString_2996;
	public static JagexString aJagexString_2998;
	public static JagexString aJagexString_3013;
	public static JagexString aJagexString_3015;
	public static JagexString[] aJagexStringArray2957;
	public static Class4_Sub20_Sub10 aClass4_Sub20_Sub10_2990;
	public static Class66 aClass66_3014;
	public static Class77 aClass77_3020;
	public static int anInt2952;
	public static int anInt2953;
	public static int anInt2955;
	public static int anInt2956;
	public static int anInt2959;
	public static int anInt2960;
	public static int anInt2962;
	public static int anInt2968;
	public static int anInt2969;
	public static int anInt2978;
	public static int anInt2980;
	public static int anInt2987;
	public static int anInt2992;
	public static int anInt2994;
	public static int anInt3001;
	public static int anInt3004;
	public static int anInt3016;
	public static int anInt3018;
	public static int anInt3019;
	public static int anInt3021;
	static {
		aJagexStringArray2957 = new JagexString[500];
		aJagexString_2981 = JagexString
				.getRs2PreparedString("Please try again)3");
		aJagexString_2973 = aJagexString_2958;
		anInt2980 = 0;
		aJagexString_3013 = JagexString.getRs2PreparedString("cross");
		aJagexString_2998 = JagexString.getRs2PreparedString("Loading wordpack )2 "
		);
		aJagexString_2996 = aJagexString_2981;
		aJagexString_2982 = aJagexString_2998;
		aJagexString_3015 = JagexString.getRs2PreparedString("Continue");
		aJagexString_2967 = aJagexString_3015;
		aClass66_3014 = new Class66(64);
		aClass77_3020 = new Class77();
		anInt3021 = 255;
	}

	public static void method462(int arg0) {
		aJagexString_2981 = null;
		aClass66_3014 = null;
		aJagexString_2998 = null;
		aJagexString_2973 = null;
		aJagexString_2982 = null;
		aJagexString_2958 = null;
		aJagexString_2996 = null;
		aJagexString_3013 = null;
		aClass4_Sub20_Sub10_2990 = null;
		aJagexString_3015 = null;
		aClass77_3020 = null;
		aJagexStringArray2957 = null;
		aJagexString_2967 = null;
		if (arg0 != 0)
			method462(-35);
	}

	public static void method464(byte arg0, Component arg1) {
		try {
			anInt3016++;
			Method method = Signlink.aMethod1537;
			if (method != null) {
				try {
					method.invoke(arg1, new Object[] { Boolean.FALSE });
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			arg1.addKeyListener(Class4_Sub14.aClass18_2272);
			if (arg0 == 79)
				arg1.addFocusListener(Class4_Sub14.aClass18_2272);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.L("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method467(Class19 arg0, int arg1) {
		try {
			Class50.aClass19_1021 = arg0;
			if (arg1 != 14531)
				method470(false, null, null);
			anInt2962++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.K("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method470(boolean arg0, Class19 arg1, Class19 arg2) {
		do {
			try {
				Class16.aClass19_429 = arg2;
				Class4_Sub11_Sub1.aClass19_2691 = arg1;
				anInt3018++;
				if (arg0 == true)
					break;
				method470(true, null, null);
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						("je.P(" + arg0 + ','
								+ (arg1 != null ? "{...}" : "null") + ','
								+ (arg2 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method471(byte[] arg0, byte arg1, Class69 arg2,
			Region[] arg3, int yAbs, int xAbs) {
		try {
			anInt2952++;
			int objectId = -1;
			StreamBuffer buffer = new StreamBuffer(arg0);
			if (arg1 <= -23) {
				for (;;) {
					int incr = buffer.getSmart();
					if (incr == 0)
						break;
					objectId += incr;
					int location = 0;
					for (;;) {
						int incr2 = buffer.getSmart();
						if (incr2 == 0)
							break;
						location += -1 + incr2;
						int xAbsOffset = (0xfe1 & location) >> 774081286;
						int zAbs = location >> 1804348492;
						int objectData = buffer.get();
						int yAbsOffset = location & 0x3f;
						int type = objectData >> 179973826;
						int rotation = 0x3 & objectData;
						int localY = yAbs + yAbsOffset;
						int localX = xAbs + xAbsOffset;
						if (localX > 0 && (localY ^ 0xffffffff) < -1
								&& localX < 103 && (localY ^ 0xffffffff) > -104) {
							int z = zAbs;
							Region class3 = null;
							if (((Class46.landscapeData[1][localX][localY]) & 0x2 ^ 0xffffffff) == -3)
								z--;
							if ((z ^ 0xffffffff) <= -1)
								class3 = arg3[z];
							Class42.method945(rotation, zAbs, localX, objectId,
									localY, type, class3, arg2);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.F("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + yAbs + ','
					+ xAbs + ')'));
		}
	}

	public boolean aBoolean3002;
	public JagexString aJagexString_2991;
	public JagexString[] aJagexStringArray2988;
	public JagexString[] aJagexStringArray3008;
	public int anInt2951;
	public int anInt2954;
	public int anInt2963 = 0;
	public int anInt2964;
	public int anInt2965;
	public int anInt2966;
	public int anInt2970;
	public int anInt2971;
	public int anInt2972;
	public int anInt2974;
	public int anInt2975 = -1;
	public int anInt2976;
	public int anInt2977;
	public int anInt2979 = -1;
	public int anInt2983;
	public int anInt2984;
	public int anInt2985;
	public int anInt2986;
	public int anInt2989;
	public int anInt2995;
	public int anInt2999;
	public int anInt3000;
	public int anInt3003;
	public int anInt3005;
	public int anInt3006;
	public int anInt3007;
	public int anInt3010;
	public int anInt3011;

	public int anInt3012;

	public int anInt3017;

	public int[] anIntArray2961;

	public int[] anIntArray2997;

	public short[] aShortArray2993;

	public short[] aShortArray3009;

	public Class4_Sub20_Sub8() {
		anInt2966 = 128;
		anInt2971 = -1;
		anInt2974 = -1;
		aBoolean3002 = false;
		anInt2965 = 0;
		aJagexString_2991 = Class4_Sub22.aJagexString_2395;
		anInt3003 = 0;
		anInt3006 = -1;
		aJagexStringArray2988 = new JagexString[] { null, null, null, null,
				Class24.aJagexString_564};
		aJagexStringArray3008 = new JagexString[] { null, null,
				Class4_Sub6.aJagexString_1933, null, null };
		anInt2986 = -1;
		anInt3005 = 128;
		anInt2995 = 0;
		anInt2976 = 0;
		anInt2964 = -1;
		anInt3000 = 0;
		anInt2983 = 2000;
		anInt2970 = 0;
		anInt2972 = -1;
		anInt2985 = 0;
		anInt2999 = -1;
		anInt3011 = -1;
		anInt3010 = 0;
		anInt2989 = -1;
		anInt2984 = 0;
		anInt2951 = 128;
		anInt3012 = 0;
		anInt2977 = -1;
		anInt3017 = 1;
	}

	public boolean method459(byte arg0, boolean arg1) {
		try {
			anInt2955++;
			int i = anInt2975;
			int i_0_ = anInt2972;
			if (arg0 != -73)
				method462(68);
			if (arg1) {
				i_0_ = anInt2971;
				i = anInt2979;
			}
			if ((i ^ 0xffffffff) == 0)
				return true;
			boolean bool = true;
			if (!RSFont.aClass19_169.method739((byte) -4, i, 0))
				bool = false;
			if ((i_0_ ^ 0xffffffff) != 0
					&& !RSFont.aClass19_169.method739((byte) -4, i_0_, 0))
				bool = false;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.O("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean method460(int arg0, boolean arg1) {
		try {
			anInt2992++;
			int i = anInt2989;
			int i_1_ = anInt2964;
			int i_2_ = anInt3006;
			if (arg1) {
				i_2_ = anInt2974;
				i = anInt2999;
				i_1_ = anInt3011;
			}
			if (i_1_ == arg0)
				return true;
			boolean bool = true;
			if (!RSFont.aClass19_169.method739((byte) -4, i_1_, 0))
				bool = false;
			if (i_2_ != -1
					&& !RSFont.aClass19_169.method739((byte) -4, i_2_, 0))
				bool = false;
			if ((i ^ 0xffffffff) != 0
					&& !RSFont.aClass19_169.method739((byte) -4, i, 0))
				bool = false;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.N("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub7 method461(int arg0, int arg1) {
		try {
			anInt3001++;
			if (anIntArray2961 != null && (arg1 ^ 0xffffffff) < -2) {
				int i = -1;
				for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -11; i_3_++) {
					if (anIntArray2997[i_3_] <= arg1
							&& anIntArray2997[i_3_] != 0)
						i = anIntArray2961[i_3_];
				}
				if ((i ^ 0xffffffff) != 0)
					return Class4_Sub23.method633(i, (byte) -124).method461(
							-11, 1);
			}
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = ((Class4_Sub20_Sub7_Sub7) Class25.aClass66_592
					.method1083(anInt2954, true));
			if (class4_sub20_sub7_sub7 != null)
				return class4_sub20_sub7_sub7;
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2
					.method399(RSFont.aClass19_169, anInt3007, 0);
			if (arg0 != -11)
				anInt2989 = -95;
			if (class4_sub20_sub7_sub2 == null)
				return null;
			if (anInt3005 != 128 || (anInt2966 ^ 0xffffffff) != -129
					|| anInt2951 != 128)
				class4_sub20_sub7_sub2.method406(anInt3005, anInt2966,
						anInt2951);
			if (aShortArray2993 != null) {
				for (int i = 0; (i ^ 0xffffffff) > (aShortArray2993.length ^ 0xffffffff); i++)
					class4_sub20_sub7_sub2.method416(aShortArray2993[i],
							aShortArray3009[i]);
			}
			class4_sub20_sub7_sub7 = class4_sub20_sub7_sub2.method411(
					64 - -anInt2970, anInt2963 + 768, -50, -10, -50);
			class4_sub20_sub7_sub7.aBoolean3454 = true;
			Class25.aClass66_592.method1082(true, anInt2954,
					class4_sub20_sub7_sub7);
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method463(int arg0) {
		try {
			if (arg0 == 4065)
				anInt2959++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "je.I("
					+ arg0 + ')');
		}
	}

	public void method465(byte arg0, StreamBuffer arg1, int arg2) {
		try {
			anInt2968++;
			if (arg0 != -28)
				method463(-55);
			if (arg2 == 1)
				anInt3007 = arg1.method209((byte) -99);
			else if (arg2 != 2) {
				if ((arg2 ^ 0xffffffff) == -5)
					anInt2983 = arg1.method209((byte) -108);
				else if (arg2 != 5) {
					if (arg2 != 6) {
						if (arg2 == 7) {
							anInt2965 = arg1.method209((byte) -102);
							if ((anInt2965 ^ 0xffffffff) < -32768)
								anInt2965 -= 65536;
						} else if ((arg2 ^ 0xffffffff) == -9) {
							anInt3010 = arg1.method209((byte) -102);
							if ((anInt3010 ^ 0xffffffff) < -32768)
								anInt3010 -= 65536;
						} else if (arg2 == 11)
							anInt3012 = 1;
						else if (arg2 != 12) {
							if ((arg2 ^ 0xffffffff) != -17) {
								if (arg2 == 23) {
									anInt2964 = arg1.method209((byte) -122);
									anInt2985 = arg1.get();
								} else if ((arg2 ^ 0xffffffff) == -25)
									anInt3006 = arg1.method209((byte) -120);
								else if ((arg2 ^ 0xffffffff) != -26) {
									if ((arg2 ^ 0xffffffff) == -27)
										anInt2974 = arg1.method209((byte) -113);
									else if (arg2 < 30 || arg2 >= 35) {
										if (arg2 >= 35 && arg2 < 40)
											aJagexStringArray2988[arg2 + -35] = arg1
													.method212(arg0 + 144);
										else if (arg2 != 40) {
											if (arg2 != 78) {
												if (arg2 == 79)
													anInt2999 = (arg1
															.method209((byte) -101));
												else if ((arg2 ^ 0xffffffff) == -91)
													anInt2975 = (arg1
															.method209((byte) -116));
												else if ((arg2 ^ 0xffffffff) == -92)
													anInt2979 = (arg1
															.method209((byte) -104));
												else if (arg2 != 92) {
													if ((arg2 ^ 0xffffffff) != -94) {
														if ((arg2 ^ 0xffffffff) == -96)
															anInt2976 = (arg1
																	.method209((byte) -104));
														else if (arg2 == 97)
															anInt2977 = (arg1
																	.method209((byte) -108));
														else if (arg2 != 98) {
															if (((arg2 ^ 0xffffffff) <= -101)
																	&& (arg2 < 110)) {
																if (anIntArray2961 == null) {
																	anIntArray2961 = (new int[10]);
																	anIntArray2997 = (new int[10]);
																}
																anIntArray2961[(arg2 + -100)] = (arg1
																		.method209((byte) -110));
																anIntArray2997[(arg2 - 100)] = (arg1
																		.method209((byte) -102));
															} else if ((arg2 ^ 0xffffffff) != -111) {
																if (arg2 == 111)
																	anInt2966 = (arg1
																			.method209((byte) -125));
																else if ((arg2 ^ 0xffffffff) != -113) {
																	if ((arg2 ^ 0xffffffff) == -114)
																		anInt2970 = arg1
																				.method229(104);
																	else if (arg2 != 114) {
																		if (arg2 == 115)
																			anInt3000 = arg1
																					.get();
																	} else
																		anInt2963 = arg1
																				.method229(-114) * 5;
																} else
																	anInt2951 = (arg1
																			.method209((byte) -122));
															} else
																anInt3005 = (arg1
																		.method209((byte) -111));
														} else
															anInt2986 = (arg1
																	.method209((byte) -107));
													} else
														anInt2971 = (arg1
																.method209((byte) -120));
												} else
													anInt2972 = (arg1
															.method209((byte) -117));
											} else
												anInt2989 = (arg1
														.method209((byte) -121));
										} else {
											int i = arg1.get();
											aShortArray2993 = new short[i];
											aShortArray3009 = new short[i];
											for (int i_4_ = 0; i > i_4_; i_4_++) {
												aShortArray2993[i_4_] = (short) (arg1
														.method209((byte) -103));
												aShortArray3009[i_4_] = (short) (arg1
														.method209((byte) -105));
											}
										}
									} else {
										aJagexStringArray3008[arg2 - 30] = arg1
												.method212(82);
										if (aJagexStringArray3008[arg2 + -30]
												.method818(
														Class28.aJagexString_638,
														(byte) -105))
											aJagexStringArray3008[arg2 + -30] = null;
									}
								} else {
									anInt3011 = arg1.method209((byte) -112);
									anInt2984 = arg1.get();
								}
							} else
								aBoolean3002 = true;
						} else
							anInt3017 = arg1.method219((byte) 73);
					} else
						anInt2995 = arg1.method209((byte) -111);
				} else
					anInt3003 = arg1.method209((byte) -117);
			} else
				aJagexString_2991 = arg1.method212(94);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.D("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ')'));
		}
	}

	public void method466(int arg0, StreamBuffer arg1) {
		try {
			for (;;) {
				int i = arg1.get();
				if ((i ^ 0xffffffff) == -1)
					break;
				method465((byte) -28, arg1, i);
			}
			anInt2956++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.G("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub2 method468(boolean arg0, int arg1) {
		try {
			anInt3019++;
			int i = anInt2975;
			int i_5_ = anInt2972;
			if (arg0) {
				i_5_ = anInt2971;
				i = anInt2979;
			}
			if ((i ^ 0xffffffff) == arg1)
				return null;
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2
					.method399(RSFont.aClass19_169, i, 0);
			if (i_5_ != -1) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2_6_ = Class4_Sub20_Sub7_Sub2
						.method399(RSFont.aClass19_169, i_5_, 0);
				Class4_Sub20_Sub7_Sub2[] class4_sub20_sub7_sub2s = {
						class4_sub20_sub7_sub2, class4_sub20_sub7_sub2_6_ };
				class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2(
						class4_sub20_sub7_sub2s, 2);
			}
			if (aShortArray2993 != null) {
				for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (aShortArray2993.length ^ 0xffffffff)); i_7_++)
					class4_sub20_sub7_sub2.method416(aShortArray2993[i_7_],
							aShortArray3009[i_7_]);
			}
			return class4_sub20_sub7_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.H("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public Class4_Sub20_Sub8 method469(int arg0, int arg1) {
		try {
			anInt2994++;
			if (arg0 != 0)
				anInt3010 = 112;
			if (anIntArray2961 != null && arg1 > 1) {
				int i = -1;
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -11; i_8_++) {
					if (anIntArray2997[i_8_] <= arg1
							&& anIntArray2997[i_8_] != 0)
						i = anIntArray2961[i_8_];
				}
				if ((i ^ 0xffffffff) != 0)
					return Class4_Sub23.method633(i, (byte) -118);
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method472(int arg0, Class4_Sub20_Sub8 arg1,
			Class4_Sub20_Sub8 arg2) {
		try {
			aBoolean3002 = arg1.aBoolean3002;
			anInt2976 = arg2.anInt2976;
			anInt2978++;
			anInt3017 = arg1.anInt3017;
			anInt2983 = arg2.anInt2983;
			aShortArray3009 = arg2.aShortArray3009;
			anInt3007 = arg2.anInt3007;
			anInt2965 = arg2.anInt2965;
			anInt3012 = 1;
			anInt3003 = arg2.anInt3003;
			anInt3010 = arg2.anInt3010;
			aJagexString_2991 = arg1.aJagexString_2991;
			aShortArray2993 = arg2.aShortArray2993;
			if (arg0 >= 51)
				anInt2995 = arg2.anInt2995;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.A("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub2 method473(boolean arg0, int arg1) {
		try {
			int i = anInt2964;
			int i_21_ = anInt3006;
			int i_22_ = anInt2989;
			anInt2969++;
			if (arg0) {
				i_22_ = anInt2999;
				i_21_ = anInt2974;
				i = anInt3011;
			}
			if ((i ^ 0xffffffff) == 0)
				return null;
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2
					.method399(RSFont.aClass19_169, i, 0);
			if ((i_21_ ^ 0xffffffff) != 0) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2_23_ = Class4_Sub20_Sub7_Sub2
						.method399(RSFont.aClass19_169, i_21_, 0);
				if ((i_22_ ^ 0xffffffff) != 0) {
					Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2_24_ = Class4_Sub20_Sub7_Sub2
							.method399(RSFont.aClass19_169, i_22_, 0);
					Class4_Sub20_Sub7_Sub2[] class4_sub20_sub7_sub2s = {
							class4_sub20_sub7_sub2, class4_sub20_sub7_sub2_23_,
							class4_sub20_sub7_sub2_24_ };
					class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2(
							class4_sub20_sub7_sub2s, 3);
				} else {
					Class4_Sub20_Sub7_Sub2[] class4_sub20_sub7_sub2s = {
							class4_sub20_sub7_sub2, class4_sub20_sub7_sub2_23_ };
					class4_sub20_sub7_sub2 = new Class4_Sub20_Sub7_Sub2(
							class4_sub20_sub7_sub2s, 2);
				}
			}
			if (!arg0 && (anInt2985 ^ 0xffffffff) != -1)
				class4_sub20_sub7_sub2.method410(0, anInt2985, 0);
			if (arg0 && anInt2984 != 0)
				class4_sub20_sub7_sub2.method410(0, anInt2984, 0);
			if (aShortArray2993 != null) {
				for (int i_25_ = 0; ((aShortArray2993.length ^ 0xffffffff) < (i_25_ ^ 0xffffffff)); i_25_++)
					class4_sub20_sub7_sub2.method416(aShortArray2993[i_25_],
							aShortArray3009[i_25_]);
			}
			if (arg1 != -25)
				return null;
			return class4_sub20_sub7_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.E("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub2 method474(int arg0, int arg1) {
		try {
			if (arg0 != 10)
				method464((byte) -26, null);
			anInt2953++;
			if (anIntArray2961 != null && arg1 > 1) {
				int i = -1;
				for (int i_26_ = 0; i_26_ < 10; i_26_++) {
					if ((anIntArray2997[i_26_] ^ 0xffffffff) >= (arg1 ^ 0xffffffff)
							&& (anIntArray2997[i_26_] ^ 0xffffffff) != -1)
						i = anIntArray2961[i_26_];
				}
				if ((i ^ 0xffffffff) != 0)
					return Class4_Sub23.method633(i, (byte) -105).method474(
							arg0, 1);
			}
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2
					.method399(RSFont.aClass19_169, anInt3007, 0);
			if (class4_sub20_sub7_sub2 == null)
				return null;
			if (anInt3005 != 128 || (anInt2966 ^ 0xffffffff) != -129
					|| (anInt2951 ^ 0xffffffff) != -129)
				class4_sub20_sub7_sub2.method406(anInt3005, anInt2966,
						anInt2951);
			if (aShortArray2993 != null) {
				for (int i = 0; i < aShortArray2993.length; i++)
					class4_sub20_sub7_sub2.method416(aShortArray2993[i],
							aShortArray3009[i]);
			}
			return class4_sub20_sub7_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("je.J("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
