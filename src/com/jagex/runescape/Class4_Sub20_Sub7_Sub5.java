package com.jagex.runescape;
import com.jagex.runescape.io.Buffer;

import java.awt.Canvas;

public class Class4_Sub20_Sub7_Sub5 extends Class4_Sub20_Sub7 {
	public static Canvas runeCanvas;
	public static JagexString aJagexString_3383;
	public static JagexString aJagexString_3404;
	public static JagexString aJagexString_3410;
	public static JagexString aJagexString_3422;
	public static int anInt3382;
	public static int anInt3386 = 0;
	public static int anInt3392;
	public static int anInt3393;
	public static int anInt3394;
	public static int anInt3398;
	public static int anInt3399;
	public static int anInt3401;
	public static int anInt3407;
	public static int anInt3412;
	public static int anInt3415 = 2;
	public static int anInt3419;
	public static int anInt3421;
	public static int[] anIntArray3395;
	public static int[][] anIntArrayArray3390;
	static {
		aJagexString_3404 = JagexString.getRs2PreparedString(")1");
		anInt3419 = 0;
		aJagexString_3422 = JagexString.getRs2PreparedString(
				"Please use a different world)3");
		aJagexString_3410 = aJagexString_3422;
		aJagexString_3383 = aJagexString_3422;
	}

	public static void method426(int arg0, boolean arg1) {
		try {
			anInt3421++;
			if (Class4_Sub20_Sub9.aClass76_3047 != null) {
				try {
					Buffer class4_sub11 = new Buffer(4);
					if (arg0 >= 26) {
						class4_sub11.method227((byte) -27, arg1 ? 2 : 3);
						class4_sub11.method231(0, -83);
						Class4_Sub20_Sub9.aClass76_3047.method1183(4, 0, 127,
								class4_sub11.byteBuffer);
					}
				} catch (java.io.IOException ioexception) {
					try {
						Class4_Sub20_Sub9.aClass76_3047.method1181(-31709);
					} catch (Exception exception) {
						/* empty */
					}
					Class4_Sub20_Sub9.aClass76_3047 = null;
					Class4_Sub20_Sub16.anInt3164++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ka.E("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method427(boolean arg0) {
		try {
			anIntArray3395 = null;
			anIntArrayArray3390 = null;
			runeCanvas = null;
			aJagexString_3383 = null;
			aJagexString_3410 = null;
			aJagexString_3422 = null;
			if (arg0 != false)
				anInt3386 = -82;
			aJagexString_3404 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ka.C("
					+ arg0 + ')');
		}
	}

	public static void method428(int arg0) {
		try {
			if (arg0 != 1)
				method430((byte) -73, null, 10);
			anInt3398++;
			Class8.aClass66_259.method1084(0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ka.F("
					+ arg0 + ')');
		}
	}

	public static void method429(int arg0, int arg1) {
		try {
			int[] is = (RS2Font.minimapImage.anIntArray3515);
			anInt3412++;
			int i = is.length;
			for (int i_2_ = 0; i > i_2_; i_2_++)
				is[i_2_] = 0;
			for (int i_3_ = 1; i_3_ < 103; i_3_++) {
				int i_4_ = 24628 + 4 * (-(i_3_ * 512) + 52736);
				for (int i_5_ = 1; i_5_ < 103; i_5_++) {
					if ((0x18 & Class46.currentSceneTileFlags[arg1][i_5_][i_3_]) == 0)
						Class4_Sub20_Sub7_Sub6.aClass69_3439.method1137(is,
								i_4_, 512, arg1, i_5_, i_3_);
					if ((arg1 ^ 0xffffffff) > -4
							&& ((Class46.currentSceneTileFlags[arg1 - -1][i_5_][i_3_]) & 0x8) != 0)
						Class4_Sub20_Sub7_Sub6.aClass69_3439.method1137(is,
								i_4_, 512, 1 + arg1, i_5_, i_3_);
					i_4_ += 4;
				}
			}
			int i_6_ = ((228 - -(int) (20.0 * Math.random()) << -48105328)
					- -(-10 + (238 - -(int) (Math.random() * 20.0)) << 1565855048)
					- (-(int) (20.0 * Math.random()) + -238) + -10);
			RS2Font.minimapImage.method516();
			int i_7_ = 228 + (int) (Math.random() * 20.0) << 1104080464;
			for (int i_8_ = 1; (i_8_ ^ 0xffffffff) > -104; i_8_++) {
				for (int i_9_ = 1; i_9_ < 103; i_9_++) {
					if (((0x18 & Class46.currentSceneTileFlags[arg1][i_9_][i_8_]) ^ 0xffffffff) == -1)
						Class57.method1025(arg1, (byte) -91, i_9_, i_7_, i_6_,
								i_8_);
					if (arg1 < 3
							&& (0x8 & (Class46.currentSceneTileFlags[1 + arg1][i_9_][i_8_]) ^ 0xffffffff) != -1)
						Class57.method1025(arg1 + 1, (byte) -97, i_9_, i_7_,
								i_6_, i_8_);
				}
			}
			if (arg0 != 4)
				aJagexString_3410 = null;
			Class13_Sub2.minimapHintCount = 0;
			for (int i_10_ = 0; i_10_ < 104; i_10_++) {
				for (int i_11_ = 0; i_11_ < 104; i_11_++) {
					int i_12_ = Class4_Sub20_Sub7_Sub6.aClass69_3439
							.method1101(Class82.plane, i_10_, i_11_);
					if (i_12_ != 0) {
						i_12_ = 0x7fff & i_12_ >> -1135397330;
						int i_13_ = Region.method56(true, i_12_).anInt2711;
						if (i_13_ >= 0) {
							int i_14_ = i_10_;
							int i_15_ = i_11_;
							if (i_13_ != 22 && i_13_ != 29
									&& (i_13_ ^ 0xffffffff) != -35
									&& (i_13_ ^ 0xffffffff) != -37
									&& (i_13_ ^ 0xffffffff) != -47
									&& i_13_ != 47 && i_13_ != 48) {
								int[][] is_16_ = (Class57.regions[Class82.plane].clippingData);
								for (int i_17_ = 0; i_17_ < 10; i_17_++) {
									int i_18_ = (int) (Math.random() * 4.0);
									if (i_18_ == 0
											&& (i_14_ ^ 0xffffffff) < -1
											&& ((i_14_ ^ 0xffffffff) < (i_10_
													+ -3 ^ 0xffffffff))
											&& (0x12c0108 & is_16_[i_14_ + -1][i_15_]) == 0)
										i_14_--;
									if ((i_18_ ^ 0xffffffff) == -2
											&& i_14_ < 103
											&& ((i_14_ ^ 0xffffffff) > (3 + i_10_ ^ 0xffffffff))
											&& ((0x12c0180 & is_16_[1 + i_14_][i_15_]) ^ 0xffffffff) == -1)
										i_14_++;
									if (i_18_ == 2
											&& i_15_ > 0
											&& ((i_15_ ^ 0xffffffff) < (i_11_ - 3 ^ 0xffffffff))
											&& (0x12c0102 & is_16_[i_14_][-1
													+ i_15_]) == 0)
										i_15_--;
									if ((i_18_ ^ 0xffffffff) == -4
											&& i_15_ < 103
											&& ((3 + i_11_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff))
											&& (is_16_[i_14_][i_15_ - -1] & 0x12c0120) == 0)
										i_15_++;
								}
							}
							Class4_Sub2_Sub1.minimapHint[Class13_Sub2.minimapHintCount] = (Class19.aImageRGBArray504[i_13_]);
							Class7.minimapHintX[Class13_Sub2.minimapHintCount] = i_14_;
							Class4_Sub8.minimapHintY[Class13_Sub2.minimapHintCount] = i_15_;
							Class13_Sub2.minimapHintCount++;
						}
					}
				}
			}
			Class62.aClass13_1225.method689(-119);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ka.D("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method430(byte arg0, JagexString arg1, int arg2) {
		anInt3382++;
		JagexString jagexString = arg1.method816(104).method839(89);
		boolean bool = false;
		for (int i_19_ = 0; i_19_ < Class4_Sub20_Sub7_Sub6.anInt3431; i_19_++) {
			Player player = (Class4_Sub20_Sub7_Sub4.aPlayerArray3358[Class4_Sub23.anIntArray2432[i_19_]]);
			if (player != null
					&& player.aJagexString_3593 != null
					&& player.aJagexString_3593.method818(
                    jagexString, (byte) -105)) {
				Class4_Sub20
						.method319(
								1,
								(Class4_Sub15.localPlayer.anIntArray3247[0]),
								player.anIntArray3247[0],
								player.anIntArray3248[0],
								1,
								0,
								false,
								2,
								0,
								0,
								0,
								(Class4_Sub15.localPlayer.anIntArray3248[0]));
				bool = true;
				if ((arg2 ^ 0xffffffff) == -2) {
					Class66.aClass4_Sub11_Sub1_1328.method264(84, 118);
					Class4_Sub10.anInt2038++;
					Class66.aClass4_Sub11_Sub1_1328.method207(
							(Class4_Sub23.anIntArray2432[i_19_]), 2018779304);
				} else if ((arg2 ^ 0xffffffff) == -5) {
					Class67.anInt1339++;
					Class66.aClass4_Sub11_Sub1_1328.method264(183, 121);
					Class66.aClass4_Sub11_Sub1_1328.method251(
							(Class4_Sub23.anIntArray2432[i_19_]), (byte) 53);
				} else if ((arg2 ^ 0xffffffff) != -7) {
					if (arg2 == 7) {
						RSFont.anInt141++;
						Class66.aClass4_Sub11_Sub1_1328.method264(117, -26);
						Class66.aClass4_Sub11_Sub1_1328.method218(81,
								Class4_Sub23.anIntArray2432[i_19_]);
					}
				} else {
					Class66.aClass4_Sub11_Sub1_1328.method264(114, 122);
					Class66.aClass4_Sub11_Sub1_1328.method207(
							(Class4_Sub23.anIntArray2432[i_19_]), 2018779304);
					Class4_Sub20_Sub15.anInt3156++;
				}
				break;
			}
		}
		if (!bool)
			Class43.method955(Class4_Sub24.method639((new JagexString[] {
					(Class4_Sub20_Sub3.aJagexString_2813), jagexString}), -842),
					Class4_Sub3.aJagexString_1895, (byte) 122, 0);
	}

	public static void method432(boolean arg0) {
		try {
			anInt3392++;
			if (Class4_Sub23.aBoolean2421) {
				RSInterface class4_sub13 = Class54.method1012(
						Class4_Sub20.anInt2357, -1,
						Class4_Sub20_Sub11.anInt3088);
				if (class4_sub13 != null
						&& class4_sub13.anObjectArray2152 != null) {
					Class4_Sub14 class4_sub14 = new Class4_Sub14();
					class4_sub14.aClass4_Sub13_2282 = class4_sub13;
					class4_sub14.anObjectArray2267 = class4_sub13.anObjectArray2152;
					Class16.method721(1, class4_sub14);
				}
				Class4_Sub23.aBoolean2421 = arg0;
				Class67.method1088(class4_sub13);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ka.G("
					+ arg0 + ')');
		}
	}

	public boolean aBoolean3391 = false;
	public Class4_Sub20_Sub17 aClass4_Sub20_Sub17_3381;
	public double aDouble3403;
	public double aDouble3408;
	public double aDouble3409;
	public double aDouble3414;
	public double aDouble3417;
	public double aDouble3418;
	public double aDouble3420;
	public double aDouble3423;
	public int anInt3384;
	public int anInt3385 = 0;
	public int anInt3387;
	public int anInt3388;
	public int anInt3389;
	public int anInt3396;
	public int anInt3397;
	public int anInt3400;

	public int anInt3402;

	public int anInt3405 = 0;

	public int anInt3406;

	public int anInt3411;

	public int anInt3413;

	public int anInt3424;

	public int anInt3425;

	public Class4_Sub20_Sub7_Sub5(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10) {
		try {
			anInt3397 = arg7;
			anInt3413 = arg8;
			anInt3425 = arg4;
			anInt3424 = arg6;
			anInt3402 = arg2;
			anInt3384 = arg0;
			anInt3388 = arg5;
			anInt3400 = arg9;
			aBoolean3391 = false;
			anInt3387 = arg10;
			anInt3389 = arg1;
			anInt3396 = arg3;
			int i = Class4_Sub20_Sub14.method593(-23222, anInt3384).anInt2909;
			if ((i ^ 0xffffffff) == 0)
				aClass4_Sub20_Sub17_3381 = null;
			else
				aClass4_Sub20_Sub17_3381 = Class68.method1093(i, (byte) -123);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ka.<init>(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7
							+ ',' + arg8 + ',' + arg9 + ',' + arg10 + ')'));
		}
	}

	@Override
	public Class4_Sub20_Sub7_Sub7 method378(boolean arg0) {
		try {
			anInt3399++;
			Class4_Sub20_Sub6 class4_sub20_sub6 = Class4_Sub20_Sub14.method593(
					-23222, anInt3384);
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = class4_sub20_sub6
					.method371(-59, anInt3385);
			if (class4_sub20_sub7_sub7 == null)
				return null;
			if (arg0 != false)
				aJagexString_3404 = null;
			class4_sub20_sub7_sub7.method455(anInt3411);
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ka.V("
					+ arg0 + ')');
		}
	}

	public void method425(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (!aBoolean3391) {
				double d = (arg0 - anInt3402);
				double d_0_ = (-anInt3396 + arg3);
				double d_1_ = Math.sqrt(d_0_ * d_0_ + d * d);
				aDouble3409 = anInt3425;
				aDouble3423 = anInt3402 + d * anInt3413 / d_1_;
				aDouble3418 = anInt3396 + d_0_ * anInt3413 / d_1_;
			}
			anInt3407++;
			double d = (-arg2 + 1 + anInt3424);
			aDouble3408 = (-aDouble3418 + arg3) / d;
			aDouble3403 = (arg0 - aDouble3423) / d;
			aDouble3417 = Math.sqrt(aDouble3408 * aDouble3408 + aDouble3403
					* aDouble3403);
			if (!aBoolean3391)
				aDouble3414 = -aDouble3417 * Math.tan(0.02454369 * anInt3397);
			if (arg4 < 82)
				aDouble3414 = 1.981091349703998;
			aDouble3420 = ((-(d * aDouble3414) + (arg1 - aDouble3409)) * 2.0 / (d * d));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ka.B(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ')'));
		}
	}

	public void method431(int arg0, int arg1) {
		aDouble3423 += aDouble3403 * arg0;
		anInt3394++;
		aDouble3418 += aDouble3408 * arg0;
		aBoolean3391 = true;
		aDouble3409 += aDouble3414 * arg0 + arg0 * (aDouble3420 * 0.5 * arg0);
		aDouble3414 += aDouble3420 * arg0;
		anInt3406 = 0x7ff & 1024 + (int) (Math.atan2(aDouble3403, aDouble3408) * 325.949);
		if (arg1 != -4)
			method428(-123);
		anInt3411 = (int) (Math.atan2(aDouble3414, aDouble3417) * 325.949) & 0x7ff;
		if (aClass4_Sub20_Sub17_3381 != null) {
			anInt3405 += arg0;
			while (aClass4_Sub20_Sub17_3381.anIntArray3200[anInt3385] < anInt3405) {
				anInt3405 -= aClass4_Sub20_Sub17_3381.anIntArray3200[anInt3385];
				anInt3385++;
				if (aClass4_Sub20_Sub17_3381.anIntArray3211.length <= anInt3385) {
					anInt3385 -= aClass4_Sub20_Sub17_3381.anInt3202;
					if (anInt3385 < 0
							|| (aClass4_Sub20_Sub17_3381.anIntArray3211.length ^ 0xffffffff) >= (anInt3385 ^ 0xffffffff))
						anInt3385 = 0;
				}
			}
		}
	}
}
