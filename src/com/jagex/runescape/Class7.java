package com.jagex.runescape;
import java.awt.FontMetrics;

public class Class7 {
	public static Class19 aClass19_234;
	public static JagexString aJagexString_219 = JagexString.getRs2PreparedString(
			"Der Anmelde)2Server ist offline)3");
	public static JagexString aJagexString_223;
	public static JagexString aJagexString_225;
	public static JagexString aJagexString_226 = JagexString.getRs2PreparedString(
			"This world is full)3");
	public static JagexString aJagexString_228;
	public static JagexString aJagexString_232;
	public static JagexString aJagexString_235;
	public static Class27 aClass27_222;
	public static FontMetrics aFontMetrics230;
	public static int anInt220;
	public static int anInt224;
	public static int anInt233;
	public static int anInt236;
	public static int[] anIntArray221 = new int[1000];
	static {
		aJagexString_225 = JagexString.getRs2PreparedString("Loading )2 please wait)3"
        );
		aJagexString_223 = JagexString.getRs2PreparedString("::noclip");
		aJagexString_235 = aJagexString_226;
		aJagexString_232 = JagexString.getRs2PreparedString("(Y<)4col>");
		aJagexString_228 = aJagexString_225;
	}

	public static boolean method653(int arg0, int arg1) {
		try {
			anInt224++;
			if ((arg0 >> 98679988 & 0x1 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bd.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method654(int arg0, Class4_Sub20_Sub7_Sub1 arg1) {
		try {
			if (Region.anInt134 == arg1.anInt3281
					|| (arg1.anInt3277 ^ 0xffffffff) == 0
					|| arg1.anInt3222 != 0
					|| ((arg1.anInt3233 - -1 ^ 0xffffffff) < ((Class68
							.method1093(arg1.anInt3277, (byte) -115).anIntArray3200[arg1.anInt3239]) ^ 0xffffffff))) {
				int i = -arg1.anInt3224 + Region.anInt134;
				int i_0_ = arg1.anInt3281 - arg1.anInt3224;
				int i_1_ = 64 * arg1.anInt3244 + arg1.anInt3240 * 128;
				int i_2_ = 64 * arg1.anInt3244 + arg1.anInt3279 * 128;
				int i_3_ = arg1.anInt3278 * 128 + 64 * arg1.anInt3244;
				int i_4_ = arg1.anInt3244 * 64 + arg1.anInt3232 * 128;
				arg1.anInt3270 = (i_3_ * i + (-i + i_0_) * i_1_) / i_0_;
				arg1.anInt3267 = ((-i + i_0_) * i_2_ + i * i_4_) / i_0_;
			}
			anInt220++;
			if (arg1.anInt3245 == 0)
				arg1.anInt3217 = 1024;
			if ((arg1.anInt3245 ^ 0xffffffff) == -2)
				arg1.anInt3217 = 1536;
			if (arg0 == arg1.anInt3245)
				arg1.anInt3217 = 0;
			arg1.anInt3266 = 0;
			if ((arg1.anInt3245 ^ 0xffffffff) == -4)
				arg1.anInt3217 = 512;
			arg1.anInt3219 = arg1.anInt3217;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("bd.D("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method655(boolean arg0) {
		try {
			int i = 256;
			anInt236++;
			if ((Class45.anInt923 ^ 0xffffffff) < -1) {
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -257; i_5_++) {
					if ((Class45.anInt923 ^ 0xffffffff) < -769)
						Class4_Sub24.anIntArray2450[i_5_] = RSInterface
								.method293((Class65.anIntArray1307[i_5_]),
										-Class45.anInt923 + 1024, 1427931656,
										(Class80.anIntArray1644[i_5_]));
					else if (Class45.anInt923 <= 256)
						Class4_Sub24.anIntArray2450[i_5_] = RSInterface
								.method293((Class80.anIntArray1644[i_5_]),
										-Class45.anInt923 + 256, 1427931656,
										(Class65.anIntArray1307[i_5_]));
					else
						Class4_Sub24.anIntArray2450[i_5_] = Class80.anIntArray1644[i_5_];
				}
			} else if ((Class48.anInt984 ^ 0xffffffff) >= -1) {
				for (int i_6_ = 0; i_6_ < 256; i_6_++)
					Class4_Sub24.anIntArray2450[i_6_] = Class65.anIntArray1307[i_6_];
			} else {
				for (int i_7_ = 0; i_7_ < 256; i_7_++) {
					if ((Class48.anInt984 ^ 0xffffffff) >= -769) {
						if ((Class48.anInt984 ^ 0xffffffff) >= -257)
							Class4_Sub24.anIntArray2450[i_7_] = (RSInterface
									.method293(Class2.anIntArray90[i_7_],
											256 - Class48.anInt984, 1427931656,
											Class65.anIntArray1307[i_7_]));
						else
							Class4_Sub24.anIntArray2450[i_7_] = Class2.anIntArray90[i_7_];
					} else
						Class4_Sub24.anIntArray2450[i_7_] = RSInterface
								.method293((Class65.anIntArray1307[i_7_]),
										1024 - Class48.anInt984, 1427931656,
										(Class2.anIntArray90[i_7_]));
				}
			}
			int i_8_ = 0;
			Class4_Sub20_Sub12.method492(0, 9, 128, i - -7);
			Class4_Sub20_Sub16.aClass4_Sub20_Sub12_Sub2_3177.method523(0, 0);
			Class4_Sub20_Sub12.method499();
			int i_9_ = 6885;
			for (int i_10_ = 1; i + -1 > i_10_; i_10_++) {
				int i_11_ = ((i - i_10_)
						* RS2Font.anIntArray2771[i_10_] / i);
				int i_12_ = i_11_ + 22;
				if ((i_12_ ^ 0xffffffff) > -1)
					i_12_ = 0;
				i_8_ += i_12_;
				for (int i_13_ = i_12_; i_13_ < 128; i_13_++) {
					int i_14_ = Class76.anIntArray1565[i_8_++];
					if ((i_14_ ^ 0xffffffff) == -1)
						i_9_++;
					else {
						int i_15_ = 256 + -i_14_;
						int i_16_ = i_14_;
						i_14_ = Class4_Sub24.anIntArray2450[i_14_];
						int i_17_ = Class62.aClass13_1225.anIntArray384[i_9_];
						Class62.aClass13_1225.anIntArray384[i_9_++] = ((Class59
								.method1035(
										-16711936,
										(Class59.method1035(16711935, i_17_)
												* i_15_ + i_16_
												* Class59.method1035(16711935,
														i_14_)))) + (Class59
								.method1035(16711680,
										(Class59.method1035(i_14_, 65280)
												* i_16_ + (Class59.method1035(
												i_17_, 65280) * i_15_))))) >> 378918248;
					}
				}
				i_9_ += 637 - -i_12_;
			}
			i_9_ = 7546;
			i_8_ = 0;
			Class4_Sub20_Sub12.method492(637, 9, 765, i + 7);
			Class34.aClass4_Sub20_Sub12_Sub2_1760.method523(382, 0);
			Class4_Sub20_Sub12.method499();
			if (arg0 != false)
				aClass27_222 = null;
			for (int i_18_ = 1; -1 + i > i_18_; i_18_++) {
				int i_19_ = ((i - i_18_)
						* RS2Font.anIntArray2771[i_18_] / i);
				int i_20_ = -i_19_ + 103;
				i_9_ += i_19_;
				for (int i_21_ = 0; i_20_ > i_21_; i_21_++) {
					int i_22_ = Class76.anIntArray1565[i_8_++];
					if (i_22_ == 0)
						i_9_++;
					else {
						int i_23_ = i_22_;
						int i_24_ = Class62.aClass13_1225.anIntArray384[i_9_];
						int i_25_ = -i_22_ + 256;
						i_22_ = Class4_Sub24.anIntArray2450[i_22_];
						Class62.aClass13_1225.anIntArray384[i_9_++] = ((Class59
								.method1035(
										-16711936,
										(i_25_
												* Class59.method1035(16711935,
														i_24_) + (Class59
												.method1035(i_22_, 16711935) * i_23_)))) - -(Class59
								.method1035((Class59.method1035(65280, i_24_)
										* i_25_ + (Class59.method1035(65280,
										i_22_) * i_23_)), 16711680))) >> -220032792;
					}
				}
				i_8_ += 128 - i_20_;
				i_9_ += -i_19_ + 765 + -i_20_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bd.B("
					+ arg0 + ')');
		}
	}

	public static void method656(boolean arg0) {
		try {
			aJagexString_228 = null;
			aJagexString_226 = null;
			aJagexString_235 = null;
			aJagexString_232 = null;
			aJagexString_223 = null;
			if (arg0 == false) {
				aFontMetrics230 = null;
				aJagexString_225 = null;
				aClass19_234 = null;
				aClass27_222 = null;
				aJagexString_219 = null;
				anIntArray221 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "bd.A("
					+ arg0 + ')');
		}
	}

	public int anInt227;

	public int anInt229;

	public int anInt231;

	public int anInt237;

	public Class7() {
		/* empty */
	}

	public Class7(Class7 arg0) {
		try {
			anInt237 = arg0.anInt237;
			anInt229 = arg0.anInt229;
			anInt231 = arg0.anInt231;
			anInt227 = arg0.anInt227;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("bd.<init>(" + (arg0 != null ? "{...}" : "null") + ')'));
		}
	}
}
