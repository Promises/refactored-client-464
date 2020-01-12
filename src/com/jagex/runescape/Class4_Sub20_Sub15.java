package com.jagex.runescape;

import com.jagex.runescape.io.Buffer;

public class Class4_Sub20_Sub15 extends Class4_Sub20 {
	public static int anInt3152;
	public static int anInt3153;
	public static int anInt3154;
	public static int anInt3155;
	public static int anInt3156;
	public static int anInt3157 = 0;
	public static int anInt3158;
	public static int anInt3159;

	public static void method601(int[] arg0, int arg1, int arg2, int[] arg3,
			int arg4, Class9[] arg5) {
		do {
			try {
				anInt3158++;
				if (arg2 > arg4) {
					int i = 1 + arg2;
					int i_0_ = (arg2 + arg4) / 2;
					int i_1_ = -1 + arg4;
					Class9 class9 = arg5[i_0_];
					arg5[i_0_] = arg5[arg4];
					arg5[arg4] = class9;
					while ((i ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
						boolean bool = true;
						do {
							i--;
							for (int i_2_ = 0; i_2_ < 4; i_2_++) {
								int i_3_;
								int i_4_;
								if (arg3[i_2_] != 2) {
									if (arg3[i_2_] == 1) {
										i_4_ = class9.anInt265;
										if ((i_4_ ^ 0xffffffff) == 0
												&& (arg0[i_2_] ^ 0xffffffff) == -2)
											i_4_ = 2001;
										i_3_ = arg5[i].anInt265;
										if ((i_3_ ^ 0xffffffff) == 0
												&& arg0[i_2_] == 1)
											i_3_ = 2001;
									} else if ((arg3[i_2_] ^ 0xffffffff) == -4) {
										i_3_ = !arg5[i].aBoolean267 ? 0 : 1;
										i_4_ = class9.aBoolean267 ? 1 : 0;
									} else {
										i_4_ = class9.anInt279;
										i_3_ = arg5[i].anInt279;
									}
								} else {
									i_3_ = arg5[i].anInt263;
									i_4_ = class9.anInt263;
								}
								if ((i_4_ ^ 0xffffffff) == (i_3_ ^ 0xffffffff)) {
									if ((i_2_ ^ 0xffffffff) == -4)
										bool = false;
								} else {
									if ((arg0[i_2_] != 1 || ((i_4_ ^ 0xffffffff) <= (i_3_ ^ 0xffffffff)))
											&& ((arg0[i_2_] ^ 0xffffffff) != -1 || i_3_ >= i_4_))
										bool = false;
									break;
								}
							}
						} while (bool);
						bool = true;
						do {
							i_1_++;
							for (int i_5_ = 0; i_5_ < 4; i_5_++) {
								int i_6_;
								int i_7_;
								if ((arg3[i_5_] ^ 0xffffffff) == -3) {
									i_7_ = class9.anInt263;
									i_6_ = arg5[i_1_].anInt263;
								} else if ((arg3[i_5_] ^ 0xffffffff) == -2) {
									i_6_ = arg5[i_1_].anInt265;
									if ((i_6_ ^ 0xffffffff) == 0
											&& (arg0[i_5_] ^ 0xffffffff) == -2)
										i_6_ = 2001;
									i_7_ = class9.anInt265;
									if ((i_7_ ^ 0xffffffff) == 0
											&& arg0[i_5_] == 1)
										i_7_ = 2001;
								} else if ((arg3[i_5_] ^ 0xffffffff) == -4) {
									i_6_ = arg5[i_1_].aBoolean267 ? 1 : 0;
									i_7_ = !class9.aBoolean267 ? 0 : 1;
								} else {
									i_6_ = arg5[i_1_].anInt279;
									i_7_ = class9.anInt279;
								}
								if (i_6_ == i_7_) {
									if ((i_5_ ^ 0xffffffff) == -4)
										bool = false;
								} else {
									if (((arg0[i_5_] ^ 0xffffffff) != -2 || i_7_ <= i_6_)
											&& ((arg0[i_5_] ^ 0xffffffff) != -1 || i_7_ >= i_6_))
										bool = false;
									break;
								}
							}
						} while (bool);
						if ((i_1_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
							Class9 class9_8_ = arg5[i_1_];
							arg5[i_1_] = arg5[i];
							arg5[i] = class9_8_;
						}
					}
					method601(arg0, -4, i, arg3, arg4, arg5);
					method601(arg0, -4, arg2, arg3, i - -1, arg5);
				}
				if (arg1 == -4)
					break;
				anInt3157 = -76;
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						("sc.C(" + (arg0 != null ? "{...}" : "null") + ','
								+ arg1 + ',' + arg2 + ','
								+ (arg3 != null ? "{...}" : "null") + ','
								+ arg4 + ','
								+ (arg5 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static Class4_Sub20_Sub12_Sub1 method602(boolean arg0, Class19 arg1,
			int arg2, int arg3) {
		try {
			anInt3159++;
			if (!Class4_Sub20_Sub14.method594(-30384, arg2, arg3, arg1))
				return null;
			if (arg0 != true)
				method603(true);
			return Class4_Sub17.method306(2640);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("sc.A("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method603(boolean arg0) {
		try {
			for (int i = 0; (i ^ 0xffffffff) > (JagexException.anInt1726 ^ 0xffffffff); i++) {
				int i_9_ = Class48.anIntArray979[i];
				Player player = (Class4_Sub20_Sub7_Sub4.aPlayerArray3358[i_9_]);
				int i_10_ = Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get();
				if ((0x10 & i_10_) != 0) {
					i_10_ += Class4_Sub20_Sub5.aClass4_Sub11_Sub1_2883.get() << -1623439800;
				}
				Class73.method1166(i_9_, 17933, player,
						i_10_);
			}
			if (arg0 != false)
				anInt3157 = 9;
			anInt3155++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "sc.D("
					+ arg0 + ')');
		}
	}

	public int anInt3151 = 0;

	public void method604(int arg0, boolean arg1, Buffer arg2) {
		anInt3152++;
		if (arg1 != false)
			anInt3157 = 115;
		if ((arg0 ^ 0xffffffff) == -6)
			anInt3151 = arg2.read_u16();
	}

	public void method605(Buffer arg0, int arg1) {
		try {
			for (;;) {
				int i = arg0.get();
				if ((i ^ 0xffffffff) == -1)
					break;
				method604(i, false, arg0);
			}
			if (arg1 != 4606)
				anInt3157 = -93;
			anInt3154++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("sc.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}
}
