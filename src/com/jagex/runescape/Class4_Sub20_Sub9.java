package com.jagex.runescape;

public class Class4_Sub20_Sub9 extends Class4_Sub20 {
	public static boolean aBoolean3048;
	public static Class16 aClass16_3038 = new Class16(4096);
	public static JagexString aJagexString_3041 = JagexString.getRs2PreparedString(
			"Password: ");
	public static JagexString aJagexString_3042 = aJagexString_3041;
	public static JagexString aJagexString_3043 = JagexString.getRs2PreparedString(
			"sch-Utteln:");
	public static JagexString aJagexString_3045;
	public static JagexString aJagexString_3049;
	public static JagexString[] aJagexStringArray3046;
	public static Class76 aClass76_3047;
	public static int anInt3022;
	public static int anInt3026;
	public static int anInt3030;
	public static int anInt3032;
	public static int anInt3033;
	public static int anInt3034;
	public static int anInt3035;
	public static int anInt3037;
	public static int anInt3050;
	public static int anInt3051;
	public static int[] anIntArray3044 = new int[32];
	static {
		int i = 2;
		for (int i_12_ = 0; i_12_ < 32; i_12_++) {
			anIntArray3044[i_12_] = -1 + i;
			i += i;
		}
		aJagexString_3045 = JagexString.getRs2PreparedString(
				" from your friend list first");
		aJagexString_3049 = aJagexString_3045;
		aBoolean3048 = false;
		aJagexStringArray3046 = new JagexString[100];
		anInt3051 = 0;
	}

	public static void method475(int arg0, int arg1, byte arg2,
			Class4_Sub20_Sub12_Sub2 arg3, int arg4, int arg5) {
		try {
			anInt3034++;
			if (arg3 != null) {
				int i = Class31.anInt680 + Class49.anInt999 & 0x7ff;
				int i_0_ = arg1 * arg1 + arg0 * arg0;
				if (i_0_ <= 6400) {
					int i_1_ = Class4_Sub20_Sub12_Sub3.anIntArray3524[i];
					i_1_ = i_1_ * 256 / (Class4_Sub20_Sub5.anInt2889 - -256);
					int i_2_ = Class4_Sub20_Sub12_Sub3.anIntArray3528[i];
					if (arg2 <= 115)
						method475(73, 113, (byte) -107, null, -121, 11);
					i_2_ = i_2_ * 256 / (256 + Class4_Sub20_Sub5.anInt2889);
					int i_3_ = i_2_ * arg1 + -(arg0 * i_1_) >> -818912880;
					int i_4_ = i_1_ * arg1 + arg0 * i_2_ >> 1789075664;
					if ((i_0_ ^ 0xffffffff) < -2501)
						arg3.method525(
								Region.aClass4_Sub20_Sub12_Sub1_132,
								(-(arg3.anInt3519 / 2) + 94 + arg5 - (-i_4_ - 4)),
								-(arg3.anInt3517 / 2) + (83 + arg4 + -i_3_ - 4));
					else
						arg3.method532((-(arg3.anInt3519 / 2) + (94 + arg5)
								- -i_4_ - -4), -i_3_
								+ (83 + (arg4 - arg3.anInt3517 / 2) + -4));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("kf.B("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
					+ arg5 + ')'));
		}
	}

	public static void method477(JagexString arg0, int arg1, JagexString arg2,
                                 JagexString arg3) {
		try {
			if (arg1 > 3) {
				Class34.aJagexString_1769 = arg3;
				Class34.aJagexString_1766 = arg0;
				Class34.aJagexString_1771 = arg2;
				anInt3030++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("kf.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method478(byte arg0) {
		try {
			aClass76_3047 = null;
			anIntArray3044 = null;
			aJagexString_3042 = null;
			aJagexStringArray3046 = null;
			aJagexString_3049 = null;
			aJagexString_3041 = null;
			if (arg0 == 31) {
				aJagexString_3043 = null;
				aJagexString_3045 = null;
				aClass16_3038 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "kf.D("
					+ arg0 + ')');
		}
	}

	public boolean aBoolean3040;
	public int anInt3023;
	public int anInt3024;
	public int anInt3025 = 0;
	public int anInt3027 = -1;
	public int anInt3028;

	public int anInt3029;

	public int anInt3031;

	public int anInt3036;

	public int anInt3039;

	public Class4_Sub20_Sub9() {
		anInt3023 = -1;
		aBoolean3040 = true;
	}

	public void method476(int arg0, StreamBuffer arg1, int arg2) {
		try {
			anInt3037++;
			if (arg2 == 255) {
				for (;;) {
					int i = arg1.get();
					if (i == 0)
						break;
					method479(arg0, i, arg1, -27753);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("kf.C("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ')'));
		}
	}

	public void method479(int arg0, int arg1, StreamBuffer arg2, int arg3) {
		try {
			if (arg3 != -27753)
				method477(null, 23, null, null);
			if (arg1 == 1)
				anInt3025 = arg2.method248(false);
			else if ((arg1 ^ 0xffffffff) == -3)
				anInt3027 = arg2.get();
			else if ((arg1 ^ 0xffffffff) == -6)
				aBoolean3040 = false;
			else if (arg1 == 7)
				anInt3023 = arg2.method248(false);
			anInt3026++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("kf.F("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public void method480(int arg0) {
		try {
			anInt3032++;
			if ((anInt3023 ^ 0xffffffff) != arg0) {
				method481(true, anInt3023);
				anInt3028 = anInt3029;
				anInt3024 = anInt3031;
				anInt3036 = anInt3039;
			}
			method481(true, anInt3025);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "kf.G("
					+ arg0 + ')');
		}
	}

	public void method481(boolean arg0, int arg1) {
		anInt3033++;
		double d = (arg1 >> 1635014792 & 0xff) / 256.0;
		double d_5_ = ((arg1 & 0xff1a78) >> 1917789008) / 256.0;
		double d_6_ = d_5_;
		double d_7_ = d_5_;
		if (d_7_ < d)
			d_7_ = d;
		double d_8_ = (arg1 & 0xff) / 256.0;
		if (d < d_6_)
			d_6_ = d;
		if (d_6_ > d_8_)
			d_6_ = d_8_;
		if (d_8_ > d_7_)
			d_7_ = d_8_;
		double d_9_ = (d_6_ + d_7_) / 2.0;
		anInt3029 = (int) (d_9_ * 256.0);
		if ((anInt3029 ^ 0xffffffff) <= -1) {
			if (anInt3029 > 255)
				anInt3029 = 255;
		} else
			anInt3029 = 0;
		double d_10_ = 0.0;
		double d_11_ = 0.0;
		if (d_6_ != d_7_) {
			if (d_7_ != d_5_) {
				if (d_7_ != d) {
					if (d_8_ == d_7_)
						d_10_ = (-d + d_5_) / (d_7_ - d_6_) + 4.0;
				} else
					d_10_ = 2.0 + (d_8_ - d_5_) / (-d_6_ + d_7_);
			} else
				d_10_ = (-d_8_ + d) / (-d_6_ + d_7_);
			if (d_9_ < 0.5)
				d_11_ = (-d_6_ + d_7_) / (d_7_ + d_6_);
			if (d_9_ >= 0.5)
				d_11_ = (-d_6_ + d_7_) / (-d_6_ + (2.0 - d_7_));
		}
		anInt3039 = (int) (d_11_ * 256.0);
		if ((anInt3039 ^ 0xffffffff) <= -1) {
			if ((anInt3039 ^ 0xffffffff) < -256)
				anInt3039 = 255;
		} else
			anInt3039 = 0;
		d_10_ /= 6.0;
		anInt3031 = (int) (d_10_ * 256.0);
		if (arg0 != true)
			aBoolean3040 = false;
	}
}
