package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub20_Sub1 extends Class4_Sub20 {
    public static Class4_Sub18 aClass4_Sub18_2704;
	public static Class4_Sub20_Sub12_Sub4_Sub1 aClass4_Sub20_Sub12_Sub4_Sub1_2708;
	public static int anInt2701;
	public static int anInt2714;
	public static int anInt2715;
	public static int anInt2718 = 0;
	public static int anInt2734 = 0;
	public static int anInt2735;
	public static int anInt2739;
	public static int anInt2740 = -1;
	public static int anInt2742;
	public static int anInt2748;
	public static int anInt2749;
	public static int anInt2751;
	public static int anInt2752;
	public static int anInt2753;
	public static int anInt2755;


	public static void method328(byte arg0, Class10 arg1, Class19_Sub1 arg2,
			int arg3) {
		try {
			anInt2701++;
			Class4_Sub12 class4_sub12 = new Class4_Sub12();
			class4_sub12.aLong150 = arg3;
			class4_sub12.anInt2124 = 1;
			class4_sub12.aClass10_2117 = arg1;
			class4_sub12.aClass19_Sub1_2120 = arg2;
			synchronized (Class37.aClass65_766) {
				if (arg0 < 11)
					return;
				Class37.aClass65_766.method1068(class4_sub12, (byte) -120);
			}
			Class64.method1063((byte) 127);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("ab.L("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public static void method335(byte arg0) {
		try {
			aClass4_Sub18_2704 = null;
			StringUtilities.aJagexString_2731 = null;
			StringUtilities.aJagexString_2733 = null;
			StringUtilities.aJagexString_2738 = null;
			if (arg0 == 74)
				aClass4_Sub20_Sub12_Sub4_Sub1_2708 = null;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "ab.B("
					+ arg0 + ')');
		}
	}

	public boolean aBoolean2696;
	public boolean aBoolean2697;
	public boolean aBoolean2698 = true;
	public boolean aBoolean2712 = true;
	public boolean aBoolean2724;
	public boolean aBoolean2729;
	public boolean aBoolean2730;
	public boolean aBoolean2754;
	public JagexString aJagexString_2713;
	public JagexString[] aJagexStringArray2716;
	public int anInt2699;
	public int anInt2700;
	public int anInt2702;
	public int anInt2705;
	public int anInt2706 = 128;
	public int anInt2709;
	public int anInt2710;
	public int anInt2711;
	public int anInt2717;
	public int anInt2719;
	public int anInt2720;
	public int anInt2721;
	public int anInt2722;
	public int anInt2725;
	public int anInt2726;
	public int anInt2727;
	public int anInt2741;
	public int anInt2743;
	public int anInt2744;
	public int anInt2745;
	public int anInt2747;
	public int anInt2750;
	public int anInt2756;
	public int anInt2757;
	public int anInt2758;
	public int[] anIntArray2707;
	public int[] anIntArray2723;
	public int[] anIntArray2732;

	public int[] anIntArray2736;

	public short[] aShortArray2728;

	public short[] aShortArray2737;

	public Class4_Sub20_Sub1() {
		anInt2709 = -1;
		anInt2719 = 0;
		aBoolean2696 = false;
		anInt2702 = -1;
		anInt2699 = 128;
		anInt2725 = 1;
		aBoolean2729 = false;
		aJagexString_2713 = Class4_Sub21.aJagexString_2372;
		anInt2710 = -1;
		anInt2720 = 0;
		anInt2705 = 0;
		aBoolean2730 = false;
		anInt2721 = 0;
		anInt2717 = 128;
		anInt2722 = 0;
		anInt2741 = 2;
		aBoolean2697 = false;
		anInt2727 = 0;
		anInt2726 = -1;
		anInt2711 = -1;
		anInt2747 = -1;
		aJagexStringArray2716 = new JagexString[5];
		anInt2744 = 1;
		anInt2745 = -1;
		aBoolean2754 = false;
		anInt2743 = 0;
		anInt2750 = 16;
		anInt2756 = -1;
		anInt2757 = 0;
		aBoolean2724 = false;
		anInt2758 = 0;
	}

	public Class4_Sub20_Sub7 method324(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		try {
			long l;
			if (anIntArray2707 != null)
				l = ((arg5 << -1791793597) + (anInt2700 << 158444810) - -arg2);
			else
				l = ((anInt2700 << -2085345398) - -arg2);
			Class4_Sub20_Sub7 class4_sub20_sub7 = ((Class4_Sub20_Sub7) Class80.aClass66_1639
					.method1083(l, true));
			anInt2714++;
			if (class4_sub20_sub7 == null) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = method336(
						(byte) -125, arg5, arg2);
				if (class4_sub20_sub7_sub2 == null)
					return null;
				if (aBoolean2729) {
					class4_sub20_sub7_sub2.aShort3310 = (short) (768 + 5 * anInt2719);
					class4_sub20_sub7 = class4_sub20_sub7_sub2;
					class4_sub20_sub7_sub2.aShort3313 = (short) (64 + anInt2720);
					class4_sub20_sub7_sub2.method414();
				} else
					class4_sub20_sub7 = class4_sub20_sub7_sub2
							.method411(64 - -anInt2720, 5 * anInt2719 + 768,
									-50, -10, -50);
				Class80.aClass66_1639.method1082(true, l, class4_sub20_sub7);
			}
			if (aBoolean2729)
				class4_sub20_sub7 = ((Class4_Sub20_Sub7_Sub2) class4_sub20_sub7)
						.method400();
			if (aBoolean2697) {
				if (class4_sub20_sub7 instanceof Class4_Sub20_Sub7_Sub7)
					class4_sub20_sub7 = ((Class4_Sub20_Sub7_Sub7) class4_sub20_sub7)
							.method442(arg1, arg3, arg6, arg0, true);
				else if (class4_sub20_sub7 instanceof Class4_Sub20_Sub7_Sub2)
					class4_sub20_sub7 = ((Class4_Sub20_Sub7_Sub2) class4_sub20_sub7)
							.method404(arg1, arg3, arg6, arg0, true);
			}
			return class4_sub20_sub7;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("ab.D("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public Class4_Sub20_Sub1 method325(int arg0) {
		try {
			int i = -1;
			anInt2755++;
			if (anInt2745 == -1) {
				if (anInt2710 != -1)
					i = Class31.anIntArray687[anInt2710];
			} else
				i = Class57.method1028(-1, anInt2745);
			if ((i ^ 0xffffffff) > -1
					|| (anIntArray2732.length ^ 0xffffffff) >= (i ^ 0xffffffff)
					|| anIntArray2732[i] == -1)
				return null;
			return Region.method56(true, anIntArray2732[i]);
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "ab.G("
					+ arg0 + ')');
		}
	}

	public Class4_Sub20_Sub7_Sub7 method326(int arg0, int arg1, int arg2,
			int arg3, int arg4, boolean arg5, int arg6) {
		try {
			anInt2735++;
			long l;
			if (anIntArray2707 != null)
				l = ((anInt2700 << -1437405622) - -(arg1 << -490178269) + arg2);
			else
				l = (arg2 + (anInt2700 << 1151747370));
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = ((Class4_Sub20_Sub7_Sub7) Class4_Sub8.aClass66_1972
					.method1083(l, true));
			if (class4_sub20_sub7_sub7 == null) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = method336(
						(byte) 61, arg1, arg2);
				if (class4_sub20_sub7_sub2 == null)
					return null;
				class4_sub20_sub7_sub7 = class4_sub20_sub7_sub2.method411(
						64 + anInt2720, 768 + anInt2719 * 5, -50, -10, -50);
				Class4_Sub8.aClass66_1972.method1082(true, l,
						class4_sub20_sub7_sub7);
			}
			if (aBoolean2697)
				class4_sub20_sub7_sub7 = class4_sub20_sub7_sub7.method442(arg6,
						arg0, arg3, arg4, true);
			if (arg5 != false)
				method334(null, 89, (byte) 62, -54, 110, 26, 113, 99, -113);
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("ab.A("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public void method327(Buffer arg0, int arg1, int arg2) {
		anInt2749++;
		if (arg1 >= 91) {
			if (arg2 != 1) {
				if ((arg2 ^ 0xffffffff) == -3)
					aJagexString_2713 = arg0.readString();
				else if (arg2 == 5) {
					int i = arg0.get();
					if (i > 0) {
						if (anIntArray2723 != null
								&& !Buffer.aBoolean2066)
							arg0.currentPosition += 2 * i;
						else {
							anIntArray2723 = new int[i];
							anIntArray2707 = null;
							for (int i_1_ = 0; i > i_1_; i_1_++)
								anIntArray2723[i_1_] = arg0
										.readShort();
						}
					}
				} else if (arg2 == 14)
					anInt2725 = arg0.get();
				else if ((arg2 ^ 0xffffffff) == -16)
					anInt2744 = arg0.get();
				else if ((arg2 ^ 0xffffffff) != -18) {
					if ((arg2 ^ 0xffffffff) == -19)
						aBoolean2698 = false;
					else if (arg2 == 19)
						anInt2726 = arg0.get();
					else if (arg2 == 21)
						aBoolean2697 = true;
					else if (arg2 == 22)
						aBoolean2729 = true;
					else if ((arg2 ^ 0xffffffff) != -24) {
						if (arg2 != 24) {
							if (arg2 == 27)
								anInt2741 = 1;
							else if (arg2 != 28) {
								if ((arg2 ^ 0xffffffff) == -30)
									anInt2720 = arg0.method229(85);
								else if (arg2 != 39) {
									if (arg2 < 30 || (arg2 ^ 0xffffffff) <= -36) {
										if (arg2 != 40) {
											if (arg2 != 60) {
												if (arg2 != 62) {
													if ((arg2 ^ 0xffffffff) == -65)
														aBoolean2712 = false;
													else if ((arg2 ^ 0xffffffff) == -66)
														anInt2717 = (arg0
																.readShort());
													else if (arg2 != 66) {
														if (arg2 != 67) {
															if (arg2 == 68)
																anInt2702 = (arg0
																		.readShort());
															else if (arg2 == 69)
																anInt2758 = (arg0
																		.get());
															else if ((arg2 ^ 0xffffffff) == -71)
																anInt2722 = (arg0
																		.method238((byte) -94));
															else if (arg2 == 71)
																anInt2757 = (arg0
																		.method238((byte) -68));
															else if (arg2 != 72) {
																if (arg2 == 73)
																	aBoolean2730 = true;
																else if ((arg2 ^ 0xffffffff) == -75)
																	aBoolean2754 = true;
																else if (arg2 != 75) {
																	if (arg2 == 77) {
																		anInt2745 = arg0
																				.readShort();
																		if (anInt2745 == 65535)
																			anInt2745 = -1;
																		anInt2710 = arg0
																				.readShort();
																		if ((anInt2710 ^ 0xffffffff) == -65536)
																			anInt2710 = -1;
																		int i = arg0
																				.get();
																		anIntArray2732 = new int[i + 1];
																		for (int i_2_ = 0; (i_2_ ^ 0xffffffff) >= (i ^ 0xffffffff); i_2_++) {
																			anIntArray2732[i_2_] = arg0
																					.readShort();
																			if ((anIntArray2732[i_2_] ^ 0xffffffff) == -65536)
																				anIntArray2732[i_2_] = -1;
																		}
																	} else if (arg2 == 78) {
																		anInt2756 = arg0
																				.readShort();
																		anInt2743 = arg0
																				.get();
																	} else if ((arg2 ^ 0xffffffff) == -80) {
																		anInt2727 = arg0
																				.readShort();
																		anInt2721 = arg0
																				.readShort();
																		anInt2743 = arg0
																				.get();
																		int i = arg0
																				.get();
																		anIntArray2736 = new int[i];
																		for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i ^ 0xffffffff); i_3_++)
																			anIntArray2736[i_3_] = arg0
																					.readShort();
																	}
																} else
																	anInt2747 = (arg0
																			.get());
															} else
																anInt2705 = (arg0
																		.method238((byte) -67));
														} else
															anInt2699 = (arg0
																	.readShort());
													} else
														anInt2706 = (arg0
																.readShort());
												} else
													aBoolean2696 = true;
											} else
												anInt2711 = (arg0
														.readShort());
										} else {
											int i = arg0.get();
											aShortArray2728 = new short[i];
											aShortArray2737 = new short[i];
											for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > (i ^ 0xffffffff)); i_4_++) {
												aShortArray2737[i_4_] = (short) (arg0
														.readShort());
												aShortArray2728[i_4_] = (short) (arg0
														.readShort());
											}
										}
									} else {
										aJagexStringArray2716[-30 + arg2] = arg0
												.readString();
										if (aJagexStringArray2716[-30 + arg2]
												.stringEquals(
														StringUtilities.hidden
												))
											aJagexStringArray2716[arg2 + -30] = null;
									}
								} else
									anInt2719 = arg0.method229(-119) * 5;
							} else
								anInt2750 = arg0.get();
						} else {
							anInt2709 = arg0.readShort();
							if (anInt2709 == 65535)
								anInt2709 = -1;
						}
					} else
						aBoolean2724 = true;
				} else {
					anInt2741 = 0;
					aBoolean2698 = false;
				}
			} else {
				int i = arg0.get();
				if ((i ^ 0xffffffff) < -1) {
					if (anIntArray2723 != null && !Buffer.aBoolean2066)
						arg0.currentPosition += 3 * i;
					else {
						anIntArray2723 = new int[i];
						anIntArray2707 = new int[i];
						for (int i_5_ = 0; (i ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
							anIntArray2723[i_5_] = arg0.readShort();
							anIntArray2707[i_5_] = arg0.get();
						}
					}
				}
			}
		}
	}

	public boolean method329(int arg0, int arg1) {
		try {
			if (arg1 != 3881)
				return false;
			anInt2752++;
			if (anIntArray2707 == null) {
				if (anIntArray2723 == null)
					return true;
				if (arg0 != 10)
					return true;
				boolean bool = true;
				for (int i = 0; (i ^ 0xffffffff) > (anIntArray2723.length ^ 0xffffffff); i++)
					bool &= Game.aClass19_1851.method739((byte) -4,
							(anIntArray2723[i] & 0xffff), 0);
				return bool;
			}
			for (int i = 0; i < anIntArray2707.length; i++) {
				if (anIntArray2707[i] == arg0)
					return Game.aClass19_1851.method739((byte) -4,
							(anIntArray2723[i] & 0xffff), 0);
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("ab.K("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean method330(byte arg0) {
		try {
			anInt2715++;
			if (anIntArray2723 == null)
				return true;
			if (arg0 <= 84)
				return true;
			boolean bool = true;
			for (int i = 0; anIntArray2723.length > i; i++)
				bool &= Game.aClass19_1851.method739((byte) -4,
						(0xffff & anIntArray2723[i]), 0);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "ab.M("
					+ arg0 + ')');
		}
	}

	public boolean method331(int arg0) {
		try {
			anInt2742++;
			if (anIntArray2732 == null) {
				if ((anInt2756 ^ 0xffffffff) == 0 && anIntArray2736 == null)
					return false;
				return true;
			}
			int i = 0;
			if (arg0 != 8021)
				anInt2711 = -109;
			for (/**/; anIntArray2732.length > i; i++) {
				if ((anIntArray2732[i] ^ 0xffffffff) != 0) {
					Class4_Sub20_Sub1 class4_sub20_sub1 = Region.method56(true,
							anIntArray2732[i]);
					if (class4_sub20_sub1.anInt2756 != -1
							|| class4_sub20_sub1.anIntArray2736 != null)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, "ab.J("
					+ arg0 + ')');
		}
	}

	public void method332(int arg0) {
		anInt2751++;
		if (anInt2726 == -1) {
			anInt2726 = 0;
			if (anIntArray2723 != null
					&& (anIntArray2707 == null || anIntArray2707[0] == 10))
				anInt2726 = 1;
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -6; i_6_++) {
				if (aJagexStringArray2716[i_6_] != null)
					anInt2726 = 1;
			}
		}
		if (anInt2747 == -1)
			anInt2747 = anInt2741 != 0 ? 1 : 0;
	}

	public void method333(int arg0, Buffer arg1) {
		for (;;) {
			int i = arg1.get();
			if ((i ^ 0xffffffff) == -1)
				break;
			method327(arg1, 93, i);
		}
		anInt2739++;
		if (arg0 != -1)
			method327(null, -33, 73);
	}

	public Class4_Sub20_Sub7_Sub7 method334(Class4_Sub20_Sub17 arg0, int arg1,
			byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7,
			int arg8) {
		try {
			anInt2748++;
			long l;
			if (anIntArray2707 != null)
				l = (arg8 + ((anInt2700 << -160757910) - -(arg7 << 1427813283)));
			else
				l = ((anInt2700 << -644746198) - -arg8);
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = ((Class4_Sub20_Sub7_Sub7) Class4_Sub8.aClass66_1972
					.method1083(l, true));
			if (class4_sub20_sub7_sub7 == null) {
				Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = method336(
						(byte) -83, arg7, arg8);
				if (class4_sub20_sub7_sub2 == null)
					return null;
				class4_sub20_sub7_sub7 = class4_sub20_sub7_sub2.method411(
						64 + anInt2720, 768 - -(5 * anInt2719), -50, -10, -50);
				Class4_Sub8.aClass66_1972.method1082(true, l,
						class4_sub20_sub7_sub7);
			}
			if (arg0 == null && !aBoolean2697)
				return class4_sub20_sub7_sub7;
			if (arg0 != null)
				class4_sub20_sub7_sub7 = arg0.method616(arg3, arg8,
						class4_sub20_sub7_sub7, 30000);
			else
				class4_sub20_sub7_sub7 = class4_sub20_sub7_sub7.method452(true);
			if (aBoolean2697)
				class4_sub20_sub7_sub7.method442(arg5, arg4, arg6, arg1, false);
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("ab.F("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6
					+ ',' + arg7 + ',' + arg8 + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub2 method336(byte arg0, int arg1, int arg2) {
		try {
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2 = null;
			anInt2753++;
			if (anIntArray2707 != null) {
				int i_7_ = -1;
				for (int i_8_ = 0; i_8_ < anIntArray2707.length; i_8_++) {
					if ((arg1 ^ 0xffffffff) == (anIntArray2707[i_8_] ^ 0xffffffff)) {
						i_7_ = i_8_;
						break;
					}
				}
				if ((i_7_ ^ 0xffffffff) == 0)
					return null;
				boolean bool = arg2 > 3 ^ aBoolean2696;
				int i_9_ = anIntArray2723[i_7_];
				if (bool)
					i_9_ += 65536;
				class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) Class10.aClass66_299
						.method1083(i_9_, true));
				if (class4_sub20_sub7_sub2 == null) {
					class4_sub20_sub7_sub2 = Class4_Sub20_Sub7_Sub2.method399(
							(Game.aClass19_1851), i_9_ & 0xffff, 0);
					if (class4_sub20_sub7_sub2 == null)
						return null;
					if (bool)
						class4_sub20_sub7_sub2.method397();
					Class10.aClass66_299.method1082(true, i_9_,
							class4_sub20_sub7_sub2);
				}
			} else {
				if ((arg1 ^ 0xffffffff) != -11)
					return null;
				if (anIntArray2723 == null)
					return null;
				boolean bool = aBoolean2696 ^ (arg2 ^ 0xffffffff) < -4;
				int i_10_ = anIntArray2723.length;
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
					int i_12_ = anIntArray2723[i_11_];
					if (bool)
						i_12_ += 65536;
					class4_sub20_sub7_sub2 = ((Class4_Sub20_Sub7_Sub2) Class10.aClass66_299
							.method1083(i_12_, true));
					if (class4_sub20_sub7_sub2 == null) {
						class4_sub20_sub7_sub2 = (Class4_Sub20_Sub7_Sub2
								.method399(Game.aClass19_1851,
										0xffff & i_12_, 0));
						if (class4_sub20_sub7_sub2 == null)
							return null;
						if (bool)
							class4_sub20_sub7_sub2.method397();
						Class10.aClass66_299.method1082(true, i_12_,
								class4_sub20_sub7_sub2);
					}
					if ((i_10_ ^ 0xffffffff) < -2)
						Class8.aClass4_Sub20_Sub7_Sub2Array257[i_11_] = class4_sub20_sub7_sub2;
				}
				if ((i_10_ ^ 0xffffffff) < -2)
					class4_sub20_sub7_sub2 = (new Class4_Sub20_Sub7_Sub2(
							Class8.aClass4_Sub20_Sub7_Sub2Array257, i_10_));
			}
			boolean bool;
			if (anInt2717 == 128 && (anInt2706 ^ 0xffffffff) == -129
					&& anInt2699 == 128)
				bool = false;
			else
				bool = true;
			boolean bool_13_;
			if ((anInt2722 ^ 0xffffffff) == -1 && anInt2757 == 0
					&& anInt2705 == 0)
				bool_13_ = false;
			else
				bool_13_ = true;
			Class4_Sub20_Sub7_Sub2 class4_sub20_sub7_sub2_14_ = new Class4_Sub20_Sub7_Sub2(
					class4_sub20_sub7_sub2,
					((arg2 ^ 0xffffffff) == -1 && !bool && !bool_13_),
					aShortArray2737 == null, true);
			arg2 &= 0x3;
			if (arg2 != 1) {
				if (arg2 == 2)
					class4_sub20_sub7_sub2_14_.method401();
				else if ((arg2 ^ 0xffffffff) == -4)
					class4_sub20_sub7_sub2_14_.method405();
			} else
				class4_sub20_sub7_sub2_14_.method408();
			if (aShortArray2737 != null) {
				for (int i_15_ = 0; ((aShortArray2737.length ^ 0xffffffff) < (i_15_ ^ 0xffffffff)); i_15_++)
					class4_sub20_sub7_sub2_14_.method416(
							(aShortArray2737[i_15_]), (aShortArray2728[i_15_]));
			}
			if (bool)
				class4_sub20_sub7_sub2_14_.method406(anInt2717, anInt2706,
						anInt2699);
			if (bool_13_)
				class4_sub20_sub7_sub2_14_.method410(anInt2722, anInt2757,
						anInt2705);
			return class4_sub20_sub7_sub2_14_;
		} catch (RuntimeException runtimeexception) {
			throw JagexException.create(runtimeexception, ("ab.I("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}
}
