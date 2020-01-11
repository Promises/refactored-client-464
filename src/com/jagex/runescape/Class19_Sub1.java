package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Class19_Sub1 extends Class19 {
	public static boolean aBoolean2538 = false;
	public static Class22 aClass22_2517;
	public static int anInt2506;
	public static int anInt2507;
	public static int anInt2510;
	public static int anInt2511 = 5063219;
	public static int anInt2512;
	public static int anInt2516;
	public static int anInt2521;
	public static int anInt2522;
	public static int anInt2523;
	public static int anInt2524;
	public static int anInt2525 = 0;
	public static int anInt2526;
	public static int anInt2530;
	public static int anInt2531;
	public static int anInt2532;
	public static int anInt2534;
	public static int anInt2536 = 0;
	public static int anInt2537;


	public static void method763(int arg0, byte arg1, RSInterface[] arg2) {
		try {
			if (arg1 != 2) {
				method763(20, (byte) 34, null);
			}
			for (int i = 0; i < arg2.length; i++) {
				RSInterface class4_sub13 = arg2[i];
				if (class4_sub13 != null) {
					if (class4_sub13.anInt2258 == 0) {
						if (class4_sub13.aClass4_Sub13Array2215 != null) {
							method763(arg0, (byte) 2,
									class4_sub13.aClass4_Sub13Array2215);
						}
						Class4_Sub16 class4_sub16 = ((Class4_Sub16) (Class31.aClass16_677
								.method725((byte) 117, class4_sub13.anInt2172)));
						if (class4_sub16 != null) {
							Class58.method1032(0, arg0, class4_sub16.anInt2311);
						}
					}
					if ((arg0 ^ 0xffffffff) == -1
							&& class4_sub13.anObjectArray2133 != null) {
						Class4_Sub14 class4_sub14 = new Class4_Sub14();
						class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2133;
						class4_sub14.aClass4_Sub13_2282 = class4_sub13;
						Class16.method721(1, class4_sub14);
					}
					if ((arg0 ^ 0xffffffff) == -2
							&& class4_sub13.anObjectArray2244 != null) {
						if (class4_sub13.anInt2163 >= 0) {
							RSInterface class4_sub13_6_ = Class4_Sub20
									.method322(true, class4_sub13.anInt2172);
							if (class4_sub13_6_ == null
									|| (class4_sub13_6_.aClass4_Sub13Array2215 == null)
									|| (((class4_sub13_6_.aClass4_Sub13Array2215).length ^ 0xffffffff) >= (class4_sub13.anInt2163 ^ 0xffffffff))
									|| class4_sub13 != (class4_sub13_6_.aClass4_Sub13Array2215[class4_sub13.anInt2163])) {
								continue;
							}
						}
						Class4_Sub14 class4_sub14 = new Class4_Sub14();
						class4_sub14.aClass4_Sub13_2282 = class4_sub13;
						class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2244;
						Class16.method721(1, class4_sub14);
					}
				}
			}
			anInt2537++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("eb.B("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method764(int arg0, int arg1, int arg2, int arg3,
			byte arg4) {
		try {
			if (arg4 != -44) {
				method765(41, -48, (byte) 87);
			}
			for (Class4_Sub22 class4_sub22 = ((Class4_Sub22) StreamBuffer.aClass65_2073
					.method1071(arg4 + -81)); class4_sub22 != null; class4_sub22 = (Class4_Sub22) StreamBuffer.aClass65_2073
					.method1075(18485)) {
				if (class4_sub22.anInt2404 != -1
						|| class4_sub22.anIntArray2383 != null) {
					int i = 0;
					if ((class4_sub22.anInt2389 ^ 0xffffffff) <= (arg3 ^ 0xffffffff)) {
						if ((class4_sub22.anInt2394 ^ 0xffffffff) < (arg3 ^ 0xffffffff)) {
							i += -arg3 + class4_sub22.anInt2394;
						}
					} else {
						i += arg3 - class4_sub22.anInt2389;
					}
					if (class4_sub22.anInt2408 >= arg2) {
						if ((class4_sub22.anInt2407 ^ 0xffffffff) < (arg2 ^ 0xffffffff)) {
							i += -arg2 + class4_sub22.anInt2407;
						}
					} else {
						i += -class4_sub22.anInt2408 + arg2;
					}
					if (-64 + i > class4_sub22.anInt2386
							|| (Class71.anInt1480 ^ 0xffffffff) == -1
							|| (arg0 ^ 0xffffffff) != (class4_sub22.anInt2397 ^ 0xffffffff)) {
						if (class4_sub22.aClass4_Sub2_Sub3_2393 != null) {
							RSFont.aClass4_Sub2_Sub2_139
									.method122(class4_sub22.aClass4_Sub2_Sub3_2393);
							class4_sub22.aClass4_Sub2_Sub3_2393 = null;
						}
						if (class4_sub22.aClass4_Sub2_Sub3_2390 != null) {
							RSFont.aClass4_Sub2_Sub2_139
									.method122(class4_sub22.aClass4_Sub2_Sub3_2390);
							class4_sub22.aClass4_Sub2_Sub3_2390 = null;
						}
					} else {
						i -= 64;
						if ((i ^ 0xffffffff) > -1) {
							i = 0;
						}
						int i_7_ = ((-i + class4_sub22.anInt2386)
								* Class71.anInt1480 / class4_sub22.anInt2386);
						if (class4_sub22.aClass4_Sub2_Sub3_2393 != null) {
							class4_sub22.aClass4_Sub2_Sub3_2393.method143(i_7_);
						} else if (class4_sub22.anInt2404 >= 0) {
							Class36 class36 = Class36.method913(
									Class66.aClass19_Sub1_1336,
									class4_sub22.anInt2404, 0);
							if (class36 != null) {
								Class4_Sub4_Sub1 class4_sub4_sub1 = class36
										.method916().method177(
												Class8.aClass8_251);
								Class4_Sub2_Sub3 class4_sub2_sub3 = (Class4_Sub2_Sub3
										.method153(class4_sub4_sub1, 100, i_7_));
								class4_sub2_sub3.method142(-1);
								RSFont.aClass4_Sub2_Sub2_139
										.method120(class4_sub2_sub3);
								class4_sub22.aClass4_Sub2_Sub3_2393 = class4_sub2_sub3;
							}
						}
						if (class4_sub22.aClass4_Sub2_Sub3_2390 != null) {
							class4_sub22.aClass4_Sub2_Sub3_2390.method143(i_7_);
							if (!class4_sub22.aClass4_Sub2_Sub3_2390.method72()) {
								class4_sub22.aClass4_Sub2_Sub3_2390 = null;
							}
						} else if (class4_sub22.anIntArray2383 != null
								&& (class4_sub22.anInt2409 -= arg1) <= 0) {
							int i_8_ = (int) (Math.random() * (class4_sub22.anIntArray2383).length);
							Class36 class36 = Class36.method913(
									Class66.aClass19_Sub1_1336,
									(class4_sub22.anIntArray2383[i_8_]), 0);
							if (class36 != null) {
								Class4_Sub4_Sub1 class4_sub4_sub1 = class36
										.method916().method177(
												Class8.aClass8_251);
								Class4_Sub2_Sub3 class4_sub2_sub3 = (Class4_Sub2_Sub3
										.method153(class4_sub4_sub1, 100, i_7_));
								class4_sub2_sub3.method142(0);
								RSFont.aClass4_Sub2_Sub2_139
										.method120(class4_sub2_sub3);
								class4_sub22.anInt2409 = ((int) ((-class4_sub22.anInt2384 + (class4_sub22.anInt2388)) * Math
										.random()) + class4_sub22.anInt2384);
								class4_sub22.aClass4_Sub2_Sub3_2390 = class4_sub2_sub3;
							}
						}
					}
				}
			}
			anInt2523++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("eb.L(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ')'));
		}
	}

	public static JagexString method765(int arg0, int arg1, byte arg2) {
		try {
			anInt2534++;
			int i = arg0 - arg1;
			if ((i ^ 0xffffffff) > 8) {
				return Class4_Sub20_Sub7_Sub6.aJagexString_3430;
			}
			if (arg2 != -45) {
				StringUtilities.aJagexString_2518 = null;
			}
			if ((i ^ 0xffffffff) > 5) {
				return Class4_Sub1.aJagexString_1856;
			}
			if ((i ^ 0xffffffff) > 2) {
				return StringUtilities.aJagexString_925;
			}
			if ((i ^ 0xffffffff) > -1) {
				return Class50.aJagexString_1024;
			}
			if ((i ^ 0xffffffff) < -10) {
				return Class50.aJagexString_1016;
			}
			if ((i ^ 0xffffffff) < -7) {
				return Class9.aJagexString_278;
			}
			if ((i ^ 0xffffffff) < -4) {
				return Class4_Sub20_Sub3.aJagexString_2803;
			}
			if ((i ^ 0xffffffff) < -1) {
				return Class4_Sub20_Sub13.aJagexString_3108;
			}
			return Class80.aJagexString_1641;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("eb.M("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method768(int arg0) {
		try {
			Class81.anIntArray1670 = new int[151];
			Class62.anIntArray1233 = new int[33];
			Class49.anIntArray995 = new int[151];
			anInt2507++;
			Class81.anIntArray1654 = new int[33];
			for (int i = 0; i < 33; i++) {
				int i_9_ = 999;
				int i_10_ = 0;
				for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -35; i_11_++) {
					if ((Region.aClass4_Sub20_Sub12_Sub1_132.aByteArray3510[i_11_
							+ i
							* (Region.aClass4_Sub20_Sub12_Sub1_132.anInt3511)]) == 0) {
						if (i_9_ == 999) {
							i_9_ = i_11_;
						}
					} else if (i_9_ != 999) {
						i_10_ = i_11_;
						break;
					}
				}
				Class62.anIntArray1233[i] = i_9_;
				Class81.anIntArray1654[i] = -i_9_ + i_10_;
			}
			if (arg0 <= 20) {
				method765(-86, 32, (byte) 7);
			}
			for (int i = 5; i < 156; i++) {
				int i_12_ = 999;
				int i_13_ = 0;
				for (int i_14_ = 25; i_14_ < 172; i_14_++) {
					if ((Region.aClass4_Sub20_Sub12_Sub1_132.aByteArray3510[(i
							* Region.aClass4_Sub20_Sub12_Sub1_132.anInt3511 + i_14_)]) != 0
							|| ((i_14_ ^ 0xffffffff) >= -35 && (i ^ 0xffffffff) >= -35)) {
						if ((i_12_ ^ 0xffffffff) != -1000) {
							i_13_ = i_14_;
							break;
						}
					} else if (i_12_ == 999) {
						i_12_ = i_14_;
					}
				}
				Class81.anIntArray1670[-5 + i] = i_12_ - 25;
				Class49.anIntArray995[-5 + i] = i_13_ - i_12_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "eb.G("
					+ arg0 + ')');
		}
	}

	public static void method771(byte arg0) {
		try {
			StringUtilities.aJagexString_2515 = null;
			aClass22_2517 = null;
			StringUtilities.aJagexString_2528 = null;
			if (arg0 < -45) {
				StringUtilities.aJagexString_2514 = null;
				StringUtilities.aJagexString_2518 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "eb.H("
					+ arg0 + ')');
		}
	}

	public volatile boolean aBoolean2527 = false;
	public boolean aBoolean2535 = false;
	public volatile boolean[] aBooleanArray2520;

	public Class10 aClass10_2508;

	public Class10 aClass10_2533;

	public int anInt2509;

	public int anInt2513;

	public int anInt2519;

	public int anInt2539 = -1;

	public Class19_Sub1(Class10 arg0, Class10 arg1, int arg2, boolean arg3,
			boolean arg4, boolean arg5) {
		super(arg3, arg4);
		try {
			aClass10_2508 = arg1;
			aBoolean2535 = arg5;
			anInt2513 = arg2;
			aClass10_2533 = arg0;
			Class64.method1066(anInt2513, this, 255);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("eb.<init>(" + (arg0 != null ? "{...}" : "null") + ','
							+ (arg1 != null ? "{...}" : "null") + ',' + arg2
							+ ',' + arg3 + ',' + arg4 + ',' + arg5 + ')'));
		}
	}

	@Override
	public void method743(int arg0, int arg1) {
		try {
			if (arg1 != 10064) {
				StringUtilities.aJagexString_2528 = null;
			}
			anInt2521++;
			Class16.method719(arg0, (byte) -85, anInt2513);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("eb.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	@Override
	public void method748(int arg0, int arg1) {
		try {
			anInt2524++;
			if (aClass10_2533 == null || aBooleanArray2520 == null
					|| !aBooleanArray2520[arg1]) {
				Class11.method672(anIntArray496[arg1], arg1, this, (byte) 2,
						anInt2513, true, (byte) 62);
			} else {
				Class4_Sub16.method303(-6207, this, arg1, aClass10_2533);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("eb.F("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method760(int arg0, int arg1, int arg2) {
		anInt2509 = arg2;
		anInt2519 = arg0;
		anInt2531++;
		if (aClass10_2508 == null) {
			Class11.method672(anInt2509, anInt2513, this, (byte) 0, 255, true,
					(byte) 99);
		} else {
			Class4_Sub16.method303(-6207, this, anInt2513, aClass10_2508);
		}
		if (arg1 != 255) {
			aBoolean2538 = true;
		}
	}

	public int method761(byte arg0) {
		try {
			anInt2522++;
			int i = 0;
			int i_0_ = 0;
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (anObjectArray488.length ^ 0xffffffff); i_1_++) {
				if (anIntArray510[i_1_] > 0) {
					i += 100;
					i_0_ += method769((byte) 114, i_1_);
				}
			}
			if (arg0 != 119) {
				method768(92);
			}
			if (i == 0) {
				return 100;
			}
			int i_2_ = 100 * i_0_ / i;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "eb.K("
					+ arg0 + ')');
		}
	}

	public void method762(Class10 arg0, int arg1, byte[] arg2, boolean arg3,
			boolean arg4) {
		do {
			try {
				anInt2532++;
				if (arg4 == false) {
					if (arg0 == aClass10_2508) {
						if (aBoolean2527) {
							throw new RuntimeException();
						}
						if (arg2 == null) {
							Class11.method672(anInt2509, anInt2513, this,
									(byte) 0, 255, true, (byte) 98);
						} else {
							StreamBuffer.aCRC32_2116.reset();
							StreamBuffer.aCRC32_2116.update(arg2, 0,
									arg2.length);
							int i = (int) StreamBuffer.aCRC32_2116.getValue();
							StreamBuffer class4_sub11 = new StreamBuffer(
									Class4_Sub20_Sub16.method609(-38, arg2));
							int i_3_ = class4_sub11.get();
							if ((i_3_ ^ 0xffffffff) != -6 && i_3_ != 6) {
								throw new RuntimeException(
										"Incorrect JS5 protocol number: "
												+ i_3_);
							}
							int i_4_ = 0;
							if (i_3_ >= 6) {
								i_4_ = class4_sub11.method219((byte) 73);
							}
							if (i != anInt2509 || anInt2519 != i_4_) {
								Class11.method672(anInt2509, anInt2513, this,
										(byte) 0, 255, true, (byte) -125);
							} else {
								this.method756((byte) 108, arg2);
								method770(arg4);
							}
						}
					} else {
						if (!arg3 && arg1 == anInt2539) {
							aBoolean2527 = true;
						}
						if (arg2 == null || arg2.length <= 2) {
							aBooleanArray2520[arg1] = false;
							if (aBoolean2535 || arg3) {
								Class11.method672(anIntArray496[arg1], arg1,
										this, (byte) 2, anInt2513, arg3,
										(byte) -127);
							}
						} else {
							StreamBuffer.aCRC32_2116.reset();
							StreamBuffer.aCRC32_2116.update(arg2, 0, -2
									+ arg2.length);
							int i = (int) StreamBuffer.aCRC32_2116.getValue();
							int i_5_ = (((0xff & arg2[-2 + arg2.length]) << 793596392) + (arg2[-1
									+ arg2.length] & 0xff));
							if (anIntArray496[arg1] != i
									|| (i_5_ ^ 0xffffffff) != (anIntArray528[arg1] ^ 0xffffffff)) {
								aBooleanArray2520[arg1] = false;
								if (aBoolean2535 || arg3) {
									Class11.method672(anIntArray496[arg1],
											arg1, this, (byte) 2, anInt2513,
											arg3, (byte) 29);
								}
							} else {
								aBooleanArray2520[arg1] = true;
								if (!arg3) {
									break;
								}
								anObjectArray488[arg1] = Class4_Sub21
										.method623(arg2, false, (byte) 75);
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						("eb.E(" + (arg0 != null ? "{...}" : "null") + ','
								+ arg1 + ','
								+ (arg2 != null ? "{...}" : "null") + ','
								+ arg3 + ',' + arg4 + ')'));
			}
			break;
		} while (false);
	}

	public void method766(boolean arg0, boolean arg1, int arg2, boolean arg3,
			byte[] arg4) {
		try {
			if (arg1 != true) {
				method762(null, 78, null, false, false);
			}
			anInt2506++;
			if (!arg0) {
				arg4[arg4.length - 2] = (byte) (anIntArray528[arg2] >> 1572854920);
				arg4[-1 + arg4.length] = (byte) anIntArray528[arg2];
				if (aClass10_2533 != null) {
					Class4_Sub6.method182(1778, arg2, arg4, aClass10_2533);
					aBooleanArray2520[arg2] = true;
				}
				if (arg3) {
					anObjectArray488[arg2] = Class4_Sub21.method623(arg4,
							false, (byte) 75);
				}
			} else {
				if (aBoolean2527) {
					throw new RuntimeException();
				}
				if (aClass10_2508 != null) {
					Class4_Sub6.method182(1778, anInt2513, arg4, aClass10_2508);
				}
				this.method756((byte) 108, arg4);
				method770(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("eb.J("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ','
					+ (arg4 != null ? "{...}" : "null") + ')'));
		}
	}

	public int method767(byte arg0) {
		try {
			anInt2530++;
			if (aBoolean2527) {
				return 100;
			}
			if (arg0 != -31) {
				method765(54, 95, (byte) 111);
			}
			if (anObjectArray488 != null) {
				return 99;
			}
			int i = Class4_Sub20_Sub6.method367(255, 0, anInt2513);
			if ((i ^ 0xffffffff) <= -101) {
				i = 99;
			}
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "eb.N("
					+ arg0 + ')');
		}
	}

	public int method769(byte arg0, int arg1) {
		try {
			anInt2512++;
			if (arg0 != 114) {
				return -118;
			}
			if (anObjectArray488[arg1] != null) {
				return 100;
			}
			if (aBooleanArray2520[arg1]) {
				return 100;
			}
			return Class4_Sub20_Sub6.method367(anInt2513, 0, arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("eb.I("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method770(boolean arg0) {
		anInt2510++;
		aBooleanArray2520 = new boolean[anObjectArray488.length];
		for (int i = 0; aBooleanArray2520.length > i; i++) {
			aBooleanArray2520[i] = false;
		}
		if (aClass10_2533 == null) {
			aBoolean2527 = true;
		} else {
			anInt2539 = -1;
			if (arg0 == false) {
				for (int i = 0; (i ^ 0xffffffff) > (aBooleanArray2520.length ^ 0xffffffff); i++) {
					if (anIntArray510[i] > 0) {
						Class4_Sub20_Sub1.method328((byte) 94, aClass10_2533,
								this, i);
						anInt2539 = i;
					}
				}
				if (anInt2539 == -1) {
					aBoolean2527 = true;
				}
			}
		}
	}
}
