/* Class4_Sub20_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4_Sub20_Sub12 extends Class4_Sub20 {
	public static int anInt3097;
	public static int anInt3098;
	public static int anInt3100 = 0;
	public static int anInt3101;
	public static int anInt3102;
	public static int anInt3103;
	public static int[] anIntArray3099;

	static {
		anInt3097 = 0;
		anInt3101 = 0;
		anInt3103 = 0;
	}

	public static void method488(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		if (arg0 < anInt3101) {
			arg2 -= anInt3101 - arg0;
			arg0 = anInt3101;
		}
		if (arg1 < anInt3103) {
			arg3 -= anInt3103 - arg1;
			arg1 = anInt3103;
		}
		if (arg0 + arg2 > anInt3097)
			arg2 = anInt3097 - arg0;
		if (arg1 + arg3 > anInt3100)
			arg3 = anInt3100 - arg1;
		int i = anInt3098 - arg2;
		int i_0_ = arg0 + arg1 * anInt3098;
		for (int i_1_ = -arg3; i_1_ < 0; i_1_++) {
			for (int i_2_ = -arg2; i_2_ < 0; i_2_++)
				anIntArray3099[i_0_++] = arg4;
			i_0_ += i;
		}
	}

	public static void method489(int arg0, int arg1, int arg2, int[] arg3,
			int[] arg4) {
		int i = arg0 + arg1 * anInt3098;
		for (arg1 = 0; arg1 < arg3.length; arg1++) {
			int i_3_ = i + arg3[arg1];
			for (arg0 = -arg4[arg1]; arg0 < 0; arg0++)
				anIntArray3099[i_3_++] = arg2;
			i += anInt3098;
		}
	}

	public static void method490(int[] arg0) {
		anInt3101 = arg0[0];
		anInt3103 = arg0[1];
		anInt3097 = arg0[2];
		anInt3100 = arg0[3];
	}

	public static void method491(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		if (arg1 >= anInt3103 && arg1 < anInt3100) {
			if (arg0 < anInt3101) {
				arg2 -= anInt3101 - arg0;
				arg0 = anInt3101;
			}
			if (arg0 + arg2 > anInt3097)
				arg2 = anInt3097 - arg0;
			int i = 256 - arg4;
			int i_4_ = (arg3 >> 16 & 0xff) * arg4;
			int i_5_ = (arg3 >> 8 & 0xff) * arg4;
			int i_6_ = (arg3 & 0xff) * arg4;
			int i_7_ = arg0 + arg1 * anInt3098;
			for (int i_8_ = 0; i_8_ < arg2; i_8_++) {
				int i_9_ = (anIntArray3099[i_7_] >> 16 & 0xff) * i;
				int i_10_ = (anIntArray3099[i_7_] >> 8 & 0xff) * i;
				int i_11_ = (anIntArray3099[i_7_] & 0xff) * i;
				int i_12_ = ((i_4_ + i_9_ >> 8 << 16)
						+ (i_5_ + i_10_ >> 8 << 8) + (i_6_ + i_11_ >> 8));
				anIntArray3099[i_7_++] = i_12_;
			}
		}
	}

	public static void method492(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0)
			arg0 = 0;
		if (arg1 < 0)
			arg1 = 0;
		if (arg2 > anInt3098)
			arg2 = anInt3098;
		if (arg3 > anInt3102)
			arg3 = anInt3102;
		anInt3101 = arg0;
		anInt3103 = arg1;
		anInt3097 = arg2;
		anInt3100 = arg3;
	}

	public static void method493(int[] arg0, int arg1, int arg2) {
		anIntArray3099 = arg0;
		anInt3098 = arg1;
		anInt3102 = arg2;
		method492(0, 0, arg1, arg2);
	}

	public static void method494(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= anInt3101 && arg0 < anInt3097) {
			if (arg1 < anInt3103) {
				arg2 -= anInt3103 - arg1;
				arg1 = anInt3103;
			}
			if (arg1 + arg2 > anInt3100)
				arg2 = anInt3100 - arg1;
			int i = arg0 + arg1 * anInt3098;
			for (int i_13_ = 0; i_13_ < arg2; i_13_++)
				anIntArray3099[i + i_13_ * anInt3098] = arg3;
		}
	}

	public static void method495(int[] arg0) {
		arg0[0] = anInt3101;
		arg0[1] = anInt3103;
		arg0[2] = anInt3097;
		arg0[3] = anInt3100;
	}

	public static void method496() {
		int i = 0;
		int i_14_ = anInt3098 * anInt3102 - 7;
		while (i < i_14_) {
			anIntArray3099[i++] = 0;
			anIntArray3099[i++] = 0;
			anIntArray3099[i++] = 0;
			anIntArray3099[i++] = 0;
			anIntArray3099[i++] = 0;
			anIntArray3099[i++] = 0;
			anIntArray3099[i++] = 0;
			anIntArray3099[i++] = 0;
		}
		i_14_ += 7;
		while (i < i_14_)
			anIntArray3099[i++] = 0;
	}

	public static void method497(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		method491(arg0, arg1, arg2, arg4, arg5);
		method491(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method504(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method504(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	public static void method498(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		if (arg0 < anInt3101) {
			arg2 -= anInt3101 - arg0;
			arg0 = anInt3101;
		}
		if (arg1 < anInt3103) {
			arg3 -= anInt3103 - arg1;
			arg1 = anInt3103;
		}
		if (arg0 + arg2 > anInt3097)
			arg2 = anInt3097 - arg0;
		if (arg1 + arg3 > anInt3100)
			arg3 = anInt3100 - arg1;
		arg4 = (((arg4 & 0xff00ff) * arg5 >> 8 & 0xff00ff) + ((arg4 & 0xff00)
				* arg5 >> 8 & 0xff00));
		int i = 256 - arg5;
		int i_15_ = anInt3098 - arg2;
		int i_16_ = arg0 + arg1 * anInt3098;
		for (int i_17_ = 0; i_17_ < arg3; i_17_++) {
			for (int i_18_ = -arg2; i_18_ < 0; i_18_++) {
				int i_19_ = anIntArray3099[i_16_];
				i_19_ = (((i_19_ & 0xff00ff) * i >> 8 & 0xff00ff) + ((i_19_ & 0xff00)
						* i >> 8 & 0xff00));
				anIntArray3099[i_16_++] = arg4 + i_19_;
			}
			i_16_ += i_15_;
		}
	}

	public static void method499() {
		anInt3101 = 0;
		anInt3103 = 0;
		anInt3097 = anInt3098;
		anInt3100 = anInt3102;
	}

	public static void method500(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		int i = 0;
		int i_20_ = 65536 / arg3;
		if (arg0 < anInt3101) {
			arg2 -= anInt3101 - arg0;
			arg0 = anInt3101;
		}
		if (arg1 < anInt3103) {
			i += (anInt3103 - arg1) * i_20_;
			arg3 -= anInt3103 - arg1;
			arg1 = anInt3103;
		}
		if (arg0 + arg2 > anInt3097)
			arg2 = anInt3097 - arg0;
		if (arg1 + arg3 > anInt3100)
			arg3 = anInt3100 - arg1;
		int i_21_ = anInt3098 - arg2;
		int i_22_ = arg0 + arg1 * anInt3098;
		for (int i_23_ = -arg3; i_23_ < 0; i_23_++) {
			int i_24_ = 65536 - i >> 8;
			int i_25_ = i >> 8;
			int i_26_ = (((arg4 & 0xff00ff) * i_24_ + (arg5 & 0xff00ff) * i_25_ & ~0xff00ff) + ((arg4 & 0xff00)
					* i_24_ + (arg5 & 0xff00) * i_25_ & 0xff0000)) >>> 8;
			for (int i_27_ = -arg2; i_27_ < 0; i_27_++)
				anIntArray3099[i_22_++] = i_26_;
			i_22_ += i_21_;
			i += i_20_;
		}
	}

	public static void method501(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0)
				method505(arg0, arg1, arg2 + 1, arg4);
			else
				method505(arg0 + arg2, arg1, -arg2 + 1, arg4);
		} else if (arg2 == 0) {
			if (arg3 >= 0)
				method494(arg0, arg1, arg3 + 1, arg4);
			else
				method494(arg0, arg1 + arg3, -arg3 + 1, arg4);
		} else {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			if (arg2 > arg3) {
				arg1 <<= 16;
				arg1 += 32768;
				arg3 <<= 16;
				int i = (int) Math.floor((double) arg3 / (double) arg2 + 0.5);
				arg2 += arg0;
				if (arg0 < anInt3101) {
					arg1 += i * (anInt3101 - arg0);
					arg0 = anInt3101;
				}
				if (arg2 >= anInt3097)
					arg2 = anInt3097 - 1;
				for (/**/; arg0 <= arg2; arg0++) {
					int i_28_ = arg1 >> 16;
					if (i_28_ >= anInt3103 && i_28_ < anInt3100)
						anIntArray3099[arg0 + i_28_ * anInt3098] = arg4;
					arg1 += i;
				}
			} else {
				arg0 <<= 16;
				arg0 += 32768;
				arg2 <<= 16;
				int i = (int) Math.floor((double) arg2 / (double) arg3 + 0.5);
				arg3 += arg1;
				if (arg1 < anInt3103) {
					arg0 += i * (anInt3103 - arg1);
					arg1 = anInt3103;
				}
				if (arg3 >= anInt3100)
					arg3 = anInt3100 - 1;
				for (/**/; arg1 <= arg3; arg1++) {
					int i_29_ = arg0 >> 16;
					if (i_29_ >= anInt3101 && i_29_ < anInt3097)
						anIntArray3099[i_29_ + arg1 * anInt3098] = arg4;
					arg0 += i;
				}
			}
		}
	}

	public static void method502(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		method505(arg0, arg1, arg2, arg4);
		method505(arg0, arg1 + arg3 - 1, arg2, arg4);
		method494(arg0, arg1, arg3, arg4);
		method494(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	public static void method503(int arg0, int arg1, int arg2, int arg3) {
		if (anInt3101 < arg0)
			anInt3101 = arg0;
		if (anInt3103 < arg1)
			anInt3103 = arg1;
		if (anInt3097 > arg2)
			anInt3097 = arg2;
		if (anInt3100 > arg3)
			anInt3100 = arg3;
	}

	public static void method504(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		if (arg0 >= anInt3101 && arg0 < anInt3097) {
			if (arg1 < anInt3103) {
				arg2 -= anInt3103 - arg1;
				arg1 = anInt3103;
			}
			if (arg1 + arg2 > anInt3100)
				arg2 = anInt3100 - arg1;
			int i = 256 - arg4;
			int i_30_ = (arg3 >> 16 & 0xff) * arg4;
			int i_31_ = (arg3 >> 8 & 0xff) * arg4;
			int i_32_ = (arg3 & 0xff) * arg4;
			int i_33_ = arg0 + arg1 * anInt3098;
			for (int i_34_ = 0; i_34_ < arg2; i_34_++) {
				int i_35_ = (anIntArray3099[i_33_] >> 16 & 0xff) * i;
				int i_36_ = (anIntArray3099[i_33_] >> 8 & 0xff) * i;
				int i_37_ = (anIntArray3099[i_33_] & 0xff) * i;
				int i_38_ = ((i_30_ + i_35_ >> 8 << 16)
						+ (i_31_ + i_36_ >> 8 << 8) + (i_32_ + i_37_ >> 8));
				anIntArray3099[i_33_] = i_38_;
				i_33_ += anInt3098;
			}
		}
	}

	public static void method505(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= anInt3103 && arg1 < anInt3100) {
			if (arg0 < anInt3101) {
				arg2 -= anInt3101 - arg0;
				arg0 = anInt3101;
			}
			if (arg0 + arg2 > anInt3097)
				arg2 = anInt3097 - arg0;
			int i = arg0 + arg1 * anInt3098;
			for (int i_39_ = 0; i_39_ < arg2; i_39_++)
				anIntArray3099[i + i_39_] = arg3;
		}
	}

	public static void method506() {
		anIntArray3099 = null;
	}
}
