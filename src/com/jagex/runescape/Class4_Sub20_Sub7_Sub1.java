package com.jagex.runescape;

public abstract class Class4_Sub20_Sub7_Sub1 extends Class4_Sub20_Sub7 {
	public static boolean aBoolean3218;
	public static JagexString aJagexString_3227 = JagexString.getRs2PreparedString(
			"Checking for updates )2 ");
	public static JagexString aJagexString_3234;
	public static JagexString aJagexString_3238;
	public static JagexString aJagexString_3243 = JagexString.getRs2PreparedString("lila:"
    );
	public static JagexString aJagexString_3284;
	public static JagexString aJagexString_3285;
	public static JagexString aJagexString_3294;
	public static Class4_Sub20_Sub12_Sub1 aClass4_Sub20_Sub12_Sub1_3260;
	public static Class4_Sub20_Sub12_Sub1 aClass4_Sub20_Sub12_Sub1_3288;
	public static int anInt3249;
	public static int anInt3252;
	public static int anInt3254;
	public static int anInt3255;
	public static int anInt3261;
	public static int anInt3280;
	public static int anInt3283;
	public static int anInt3286;
	public static int anInt3287;
	public static int anInt3291;
	public static int[] anIntArray3268;
	static {
		aJagexString_3234 = aJagexString_3227;
		anInt3249 = 0;
		aJagexString_3238 = JagexString.getRs2PreparedString(
				"Ihr Spielkonto wird bereits benutzt)3");
		aJagexString_3285 = JagexString.getRs2PreparedString(")4slr)3ws?order=LPWM"
        );
		anIntArray3268 = new int[100];
		anInt3287 = -1;
		aJagexString_3284 = JagexString.getRs2PreparedString("mapfunction");
		aJagexString_3294 = JagexString.getRs2PreparedString("m");
	}

	public static void method381(byte arg0) {
		try {
			anInt3286++;
			Class4_Sub20_Sub7_Sub5 class4_sub20_sub7_sub5 = ((Class4_Sub20_Sub7_Sub5) Class4_Sub20_Sub11.aClass65_3075
					.method1071(-126));
			if (arg0 != 10)
				aJagexString_3227 = null;
			for (/**/; class4_sub20_sub7_sub5 != null; class4_sub20_sub7_sub5 = ((Class4_Sub20_Sub7_Sub5) Class4_Sub20_Sub11.aClass65_3075
					.method1075(18485))) {
				if (class4_sub20_sub7_sub5.anInt3389 != Class82.anInt1711
						|| ((Region.anInt134 ^ 0xffffffff) < (class4_sub20_sub7_sub5.anInt3424 ^ 0xffffffff)))
					class4_sub20_sub7_sub5.method70(-315);
				else if ((Region.anInt134 ^ 0xffffffff) <= (class4_sub20_sub7_sub5.anInt3388 ^ 0xffffffff)) {
					if ((class4_sub20_sub7_sub5.anInt3400 ^ 0xffffffff) < -1) {
						Class4_Sub20_Sub7_Sub1_Sub2 class4_sub20_sub7_sub1_sub2 = (Class57.aClass4_Sub20_Sub7_Sub1_Sub2Array1151[-1
								+ class4_sub20_sub7_sub5.anInt3400]);
						if (class4_sub20_sub7_sub1_sub2 != null
								&& class4_sub20_sub7_sub1_sub2.anInt3270 >= 0
								&& class4_sub20_sub7_sub1_sub2.anInt3270 < 13312
								&& (class4_sub20_sub7_sub1_sub2.anInt3267 ^ 0xffffffff) <= -1
								&& class4_sub20_sub7_sub1_sub2.anInt3267 < 13312)
							class4_sub20_sub7_sub5
									.method425(
											class4_sub20_sub7_sub1_sub2.anInt3270,
											((Class67
													.method1090(
															class4_sub20_sub7_sub1_sub2.anInt3270,
															class4_sub20_sub7_sub1_sub2.anInt3267,
															true,
															class4_sub20_sub7_sub5.anInt3389)) + -class4_sub20_sub7_sub5.anInt3387),
											Region.anInt134,
											class4_sub20_sub7_sub1_sub2.anInt3267,
											87);
					}
					if ((class4_sub20_sub7_sub5.anInt3400 ^ 0xffffffff) > -1) {
						int i = -class4_sub20_sub7_sub5.anInt3400 - 1;
						Class4_Sub20_Sub7_Sub1_Sub1 class4_sub20_sub7_sub1_sub1;
						if (i == Region.anInt127)
							class4_sub20_sub7_sub1_sub1 = (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302);
						else
							class4_sub20_sub7_sub1_sub1 = (Class4_Sub20_Sub7_Sub4.aClass4_Sub20_Sub7_Sub1_Sub1Array3358[i]);
						if (class4_sub20_sub7_sub1_sub1 != null
								&& (class4_sub20_sub7_sub1_sub1.anInt3270 ^ 0xffffffff) <= -1
								&& (class4_sub20_sub7_sub1_sub1.anInt3270 ^ 0xffffffff) > -13313
								&& (class4_sub20_sub7_sub1_sub1.anInt3267 ^ 0xffffffff) <= -1
								&& (class4_sub20_sub7_sub1_sub1.anInt3267 ^ 0xffffffff) > -13313)
							class4_sub20_sub7_sub5
									.method425(
											class4_sub20_sub7_sub1_sub1.anInt3270,
											((Class67
													.method1090(
															class4_sub20_sub7_sub1_sub1.anInt3270,
															class4_sub20_sub7_sub1_sub1.anInt3267,
															true,
															class4_sub20_sub7_sub5.anInt3389)) - class4_sub20_sub7_sub5.anInt3387),
											Region.anInt134,
											class4_sub20_sub7_sub1_sub1.anInt3267,
											97);
					}
					class4_sub20_sub7_sub5.method431(
							Class4_Sub20_Sub6.anInt2906, -4);
					Class4_Sub20_Sub7_Sub6.aClass69_3439.method1132(
							Class82.anInt1711,
							(int) class4_sub20_sub7_sub5.aDouble3423,
							(int) class4_sub20_sub7_sub5.aDouble3418,
							(int) class4_sub20_sub7_sub5.aDouble3409, 60,
							class4_sub20_sub7_sub5,
							class4_sub20_sub7_sub5.anInt3406, -1, false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "fb.A("
					+ arg0 + ')');
		}
	}

	public static Class4_Sub20_Sub12_Sub2 method387(byte arg0) {
		try {
			anInt3280++;
			Class4_Sub20_Sub12_Sub2 class4_sub20_sub12_sub2 = new Class4_Sub20_Sub12_Sub2();
			class4_sub20_sub12_sub2.anInt3516 = Class13_Sub2.anIntArray2480[0];
			class4_sub20_sub12_sub2.anInt3518 = Class35.anIntArray726[0];
			class4_sub20_sub12_sub2.anInt3521 = Class4_Sub20_Sub7_Sub5.anIntArray3395[0];
			class4_sub20_sub12_sub2.anInt3517 = Class32.anInt696;
			class4_sub20_sub12_sub2.anInt3520 = Class30.anIntArray650[0];
			class4_sub20_sub12_sub2.anInt3519 = Class53.anInt1080;
			int i = (class4_sub20_sub12_sub2.anInt3520 * class4_sub20_sub12_sub2.anInt3516);
			class4_sub20_sub12_sub2.anIntArray3515 = new int[i];
			byte[] is = Class4_Sub23.aByteArrayArray2426[0];
			for (int i_5_ = 0; (i ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
				class4_sub20_sub12_sub2.anIntArray3515[i_5_] = Class67.anIntArray1367[Class59
						.method1035(is[i_5_], 255)];
			Class43.method953(true);
			return class4_sub20_sub12_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "fb.H("
					+ arg0 + ')');
		}
	}

	public static void method388(int arg0) {
		try {
			aJagexString_3285 = null;
			aClass4_Sub20_Sub12_Sub1_3260 = null;
			if (arg0 <= -51) {
				aJagexString_3284 = null;
				aJagexString_3234 = null;
				aJagexString_3238 = null;
				aJagexString_3227 = null;
				aClass4_Sub20_Sub12_Sub1_3288 = null;
				anIntArray3268 = null;
				aJagexString_3294 = null;
				aJagexString_3243 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "fb.E("
					+ arg0 + ')');
		}
	}

	public static int method389(int arg0, int arg1) {
		try {
			return arg0 | arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("fb.F("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean aBoolean3290;
	public boolean[] aBooleanArray3289;
	public JagexString aJagexString_3271;
	public int anInt3217;
	public int anInt3219;
	public int anInt3220;
	public int anInt3221;
	public int anInt3222;
	public int anInt3224;
	public int anInt3225;
	public int anInt3226;
	public int anInt3228 = 0;
	public int anInt3229;
	public int anInt3230;
	public int anInt3231;
	public int anInt3232;
	public int anInt3233;
	public int anInt3235;
	public int anInt3236;
	public int anInt3237;
	public int anInt3239;
	public int anInt3240;
	public int anInt3241;
	public int anInt3242;
	public int anInt3244;
	public int anInt3245;
	public int anInt3246;
	public int anInt3250;
	public int anInt3251;
	public int anInt3253;
	public int anInt3256;
	public int anInt3257;
	public int anInt3258;
	public int anInt3259;
	public int anInt3262;
	public int anInt3263;
	public int anInt3265;
	public int anInt3266;
	public int anInt3267;
	public int anInt3269;
	public int anInt3270;
	public int anInt3272;
	public int anInt3273;
	public int anInt3274;
	public int anInt3276;
	public int anInt3277;
	public int anInt3278;
	public int anInt3279;
	public int anInt3281;
	public int anInt3282;
	public int anInt3292;
	public int anInt3293;

	public int[] anIntArray3223;

	public int[] anIntArray3247;

	public int[] anIntArray3248;

	public int[] anIntArray3264;

	public int[] anIntArray3275;

	public Class4_Sub20_Sub7_Sub1() {
		anInt3221 = 0;
		anInt3237 = 32;
		anInt3244 = 1;
		anInt3236 = 0;
		anIntArray3248 = new int[10];
		anInt3226 = -1;
		anInt3258 = 0;
		anInt3220 = 0;
		anInt3256 = 0;
		anInt3246 = -1;
		anInt3242 = 0;
		anInt3230 = 0;
		anInt3266 = 0;
		anInt3257 = -1;
		anInt3231 = 0;
		anInt3263 = -1;
		anIntArray3247 = new int[10];
		anInt3225 = 0;
		anInt3250 = -1;
		anInt3239 = 0;
		anInt3241 = 0;
		anInt3233 = 0;
		anInt3222 = 0;
		anIntArray3275 = new int[4];
		anIntArray3264 = new int[4];
		anInt3253 = 100;
		anInt3265 = -1;
		anInt3251 = -1;
		anInt3274 = -1;
		anInt3276 = 0;
		anInt3277 = -1;
		anInt3282 = 200;
		aBoolean3290 = false;
		anInt3272 = -1;
		anInt3292 = 0;
		anInt3293 = -1;
		aBooleanArray3289 = new boolean[10];
		anIntArray3223 = new int[4];
		anInt3273 = -1000;
		anInt3269 = -1;
		aJagexString_3271 = null;
	}

	public void method382(boolean arg0) {
		try {
			if (arg0 == true) {
				anInt3236 = 0;
				anInt3291++;
				anInt3228 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "fb.G("
					+ arg0 + ')');
		}
	}

	public void method383(int arg0, boolean arg1, int arg2, int arg3) {
		try {
			anInt3254++;
			int i = 0;
			if (arg1 == false) {
				for (/**/; i < 4; i++) {
					if ((anIntArray3223[i] ^ 0xffffffff) >= (arg2 ^ 0xffffffff)) {
						anIntArray3264[i] = arg0;
						anIntArray3275[i] = arg3;
						anIntArray3223[i] = 70 + arg2;
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("fb.I("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public boolean method384(int arg0) {
		try {
			anInt3252++;
			if (arg0 != -19456)
				anInt3220 = 45;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "fb.D("
					+ arg0 + ')');
		}
	}

	public void method385(int arg0, boolean arg1, int arg2, int arg3) {
		try {
			anInt3283++;
			if ((anInt3277 ^ 0xffffffff) != 0
					&& Class68.method1093(anInt3277, (byte) -109).anInt3188 == 1)
				anInt3277 = -1;
			if (!arg1) {
				int i = -anIntArray3248[0] + arg0;
				int i_0_ = arg3 + -anIntArray3247[0];
				if ((i ^ 0xffffffff) <= 7 && i <= 8 && i_0_ >= -8
						&& (i_0_ ^ 0xffffffff) >= -9) {
					if ((anInt3228 ^ 0xffffffff) > -10)
						anInt3228++;
					for (int i_1_ = anInt3228; (i_1_ ^ 0xffffffff) < -1; i_1_--) {
						anIntArray3248[i_1_] = anIntArray3248[-1 + i_1_];
						anIntArray3247[i_1_] = anIntArray3247[-1 + i_1_];
						aBooleanArray3289[i_1_] = aBooleanArray3289[-1 + i_1_];
					}
					aBooleanArray3289[0] = false;
					anIntArray3248[0] = arg0;
					anIntArray3247[0] = arg3;
					return;
				}
			}
			anInt3266 = 0;
			anInt3228 = 0;
			anInt3236 = 0;
			anIntArray3248[0] = arg0;
			anIntArray3247[0] = arg3;
			anInt3267 = anIntArray3247[0] * arg2 + anInt3244 * 64;
			anInt3270 = 64 * anInt3244 + 128 * anIntArray3248[0];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("fb.B("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public void method386(boolean arg0, boolean arg1, int arg2) {
		try {
			int i = anIntArray3248[0];
			if (arg0 == false) {
				anInt3261++;
				int i_2_ = anIntArray3247[0];
				if (anInt3277 != -1
						&& (Class68.method1093(anInt3277, (byte) -113).anInt3188 ^ 0xffffffff) == -2)
					anInt3277 = -1;
				if (anInt3228 < 9)
					anInt3228++;
				for (int i_3_ = anInt3228; i_3_ > 0; i_3_--) {
					anIntArray3248[i_3_] = anIntArray3248[i_3_ - 1];
					anIntArray3247[i_3_] = anIntArray3247[i_3_ - 1];
					aBooleanArray3289[i_3_] = aBooleanArray3289[-1 + i_3_];
				}
				aBooleanArray3289[0] = arg1;
				if (arg2 == 0) {
					i--;
					i_2_++;
				}
				if (arg2 == 1)
					i_2_++;
				if (arg2 == 2) {
					i++;
					i_2_++;
				}
				if ((arg2 ^ 0xffffffff) == -4)
					i--;
				if ((arg2 ^ 0xffffffff) == -5)
					i++;
				if ((arg2 ^ 0xffffffff) == -6) {
					i_2_--;
					i--;
				}
				if (arg2 == 6)
					i_2_--;
				if (arg2 == 7) {
					i++;
					i_2_--;
				}
				anIntArray3248[0] = i;
				anIntArray3247[0] = i_2_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("fb.C("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}
}
