package com.jagex.runescape;

public class Class4_Sub20_Sub12_Sub3 extends Class4_Sub20_Sub12 {
	public static boolean aBoolean3522 = false;
	public static boolean aBoolean3527;
	public static boolean aBoolean3537;
	public static boolean aBoolean3541;
	public static int anInt3525;
	public static int anInt3526;
	public static int anInt3529;
	public static int anInt3531;
	public static int anInt3532;
	public static int anInt3533;
	public static int anInt3534;
	public static int anInt3535;
	public static int anInt3538;
	public static int[] anIntArray3523;
	public static int[] anIntArray3524;
	public static int[] anIntArray3528 = new int[2048];
	public static int[] anIntArray3536;
	public static int[] anIntArray3539;
	public static int[] anIntArray3540;
	public static Interface2 anInterface2_3530;

	static {
		anIntArray3524 = new int[2048];
		anIntArray3523 = new int[65536];
		aBoolean3527 = false;
		aBoolean3537 = true;
		anIntArray3536 = new int[1024];
		anInt3531 = 0;
		anIntArray3539 = new int[2048];
		aBoolean3541 = false;
		anIntArray3540 = new int[512];
		for (int i = 1; i < 512; i++)
			anIntArray3540[i] = 32768 / i;
		for (int i = 1; i < 2048; i++)
			anIntArray3539[i] = 65536 / i;
		for (int i = 0; i < 2048; i++) {
			anIntArray3524[i] = (int) (65536.0 * Math.sin(i * 0.0030679615));
			anIntArray3528[i] = (int) (65536.0 * Math.cos(i * 0.0030679615));
		}
	}

	public static int method538(int arg0, double arg1) {
		double d = (arg0 >> 16) / 256.0;
		double d_0_ = (arg0 >> 8 & 0xff) / 256.0;
		double d_1_ = (arg0 & 0xff) / 256.0;
		d = Math.pow(d, arg1);
		d_0_ = Math.pow(d_0_, arg1);
		d_1_ = Math.pow(d_1_, arg1);
		int i = (int) (d * 256.0);
		int i_2_ = (int) (d_0_ * 256.0);
		int i_3_ = (int) (d_1_ * 256.0);
		return (i << 16) + (i_2_ << 8) + i_3_;
	}

	public static void method539(Interface2 arg0) {
		anInterface2_3530 = arg0;
	}

	public static void method540() {
		anIntArray3536 = null;
		anIntArray3523 = null;
		anInterface2_3530 = null;
		anIntArray3540 = null;
		anIntArray3539 = null;
		anIntArray3524 = null;
		anIntArray3528 = null;
	}

	public static void method541(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, int arg12, int arg13, int arg14, int arg15,
			int arg16, int arg17, int arg18) {
		int[] is = anInterface2_3530.method9(-54, arg18);
		if (is == null) {
			int i = anInterface2_3530.method8(125, arg18);
			method549(arg0, arg1, arg2, arg3, arg4, arg5, method551(i, arg6),
					method551(i, arg7), method551(i, arg8));
		} else {
			aBoolean3541 = anInterface2_3530.method7(27513, arg18);
			aBoolean3527 = anInterface2_3530.method10((byte) 70, arg18);
			arg10 = arg9 - arg10;
			arg13 = arg12 - arg13;
			arg16 = arg15 - arg16;
			arg11 -= arg9;
			arg14 -= arg12;
			arg17 -= arg15;
			int i = arg11 * arg12 - arg14 * arg9 << 14;
			int i_4_ = arg14 * arg15 - arg17 * arg12 << 8;
			int i_5_ = arg17 * arg9 - arg11 * arg15 << 5;
			int i_6_ = arg10 * arg12 - arg13 * arg9 << 14;
			int i_7_ = arg13 * arg15 - arg16 * arg12 << 8;
			int i_8_ = arg16 * arg9 - arg10 * arg15 << 5;
			int i_9_ = arg13 * arg11 - arg10 * arg14 << 14;
			int i_10_ = arg16 * arg14 - arg13 * arg17 << 8;
			int i_11_ = arg10 * arg17 - arg16 * arg11 << 5;
			int i_12_ = 0;
			int i_13_ = 0;
			if (arg1 != arg0) {
				i_12_ = (arg4 - arg3 << 16) / (arg1 - arg0);
				i_13_ = (arg7 - arg6 << 16) / (arg1 - arg0);
			}
			int i_14_ = 0;
			int i_15_ = 0;
			if (arg2 != arg1) {
				i_14_ = (arg5 - arg4 << 16) / (arg2 - arg1);
				i_15_ = (arg8 - arg7 << 16) / (arg2 - arg1);
			}
			int i_16_ = 0;
			int i_17_ = 0;
			if (arg2 != arg0) {
				i_16_ = (arg3 - arg5 << 16) / (arg0 - arg2);
				i_17_ = (arg6 - arg8 << 16) / (arg0 - arg2);
			}
			if (arg0 <= arg1 && arg0 <= arg2) {
				if (arg0 < anInt3529) {
					if (arg1 > anInt3529)
						arg1 = anInt3529;
					if (arg2 > anInt3529)
						arg2 = anInt3529;
					if (arg1 < arg2) {
						arg5 = arg3 <<= 16;
						arg8 = arg6 <<= 16;
						if (arg0 < 0) {
							arg5 -= i_16_ * arg0;
							arg3 -= i_12_ * arg0;
							arg8 -= i_17_ * arg0;
							arg6 -= i_13_ * arg0;
							arg0 = 0;
						}
						arg4 <<= 16;
						arg7 <<= 16;
						if (arg1 < 0) {
							arg4 -= i_14_ * arg1;
							arg7 -= i_15_ * arg1;
							arg1 = 0;
						}
						int i_18_ = arg0 - anInt3532;
						i += i_5_ * i_18_;
						i_6_ += i_8_ * i_18_;
						i_9_ += i_11_ * i_18_;
						if (arg0 != arg1 && i_16_ < i_12_ || arg0 == arg1
								&& i_16_ > i_14_) {
							arg2 -= arg1;
							arg1 -= arg0;
							arg0 = anIntArray3536[arg0];
							while (--arg1 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg0, arg5 >> 16, arg3 >> 16,
										arg8 >> 8, arg6 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg5 += i_16_;
								arg3 += i_12_;
								arg8 += i_17_;
								arg6 += i_13_;
								arg0 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
							while (--arg2 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg0, arg5 >> 16, arg4 >> 16,
										arg8 >> 8, arg7 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg5 += i_16_;
								arg4 += i_14_;
								arg8 += i_17_;
								arg7 += i_15_;
								arg0 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
						} else {
							arg2 -= arg1;
							arg1 -= arg0;
							arg0 = anIntArray3536[arg0];
							while (--arg1 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg0, arg3 >> 16, arg5 >> 16,
										arg6 >> 8, arg8 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg5 += i_16_;
								arg3 += i_12_;
								arg8 += i_17_;
								arg6 += i_13_;
								arg0 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
							while (--arg2 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg0, arg4 >> 16, arg5 >> 16,
										arg7 >> 8, arg8 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg5 += i_16_;
								arg4 += i_14_;
								arg8 += i_17_;
								arg7 += i_15_;
								arg0 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
						}
					} else {
						arg4 = arg3 <<= 16;
						arg7 = arg6 <<= 16;
						if (arg0 < 0) {
							arg4 -= i_16_ * arg0;
							arg3 -= i_12_ * arg0;
							arg7 -= i_17_ * arg0;
							arg6 -= i_13_ * arg0;
							arg0 = 0;
						}
						arg5 <<= 16;
						arg8 <<= 16;
						if (arg2 < 0) {
							arg5 -= i_14_ * arg2;
							arg8 -= i_15_ * arg2;
							arg2 = 0;
						}
						int i_19_ = arg0 - anInt3532;
						i += i_5_ * i_19_;
						i_6_ += i_8_ * i_19_;
						i_9_ += i_11_ * i_19_;
						if (arg0 != arg2 && i_16_ < i_12_ || arg0 == arg2
								&& i_14_ > i_12_) {
							arg1 -= arg2;
							arg2 -= arg0;
							arg0 = anIntArray3536[arg0];
							while (--arg2 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg0, arg4 >> 16, arg3 >> 16,
										arg7 >> 8, arg6 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg4 += i_16_;
								arg3 += i_12_;
								arg7 += i_17_;
								arg6 += i_13_;
								arg0 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
							while (--arg1 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg0, arg5 >> 16, arg3 >> 16,
										arg8 >> 8, arg6 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg5 += i_14_;
								arg3 += i_12_;
								arg8 += i_15_;
								arg6 += i_13_;
								arg0 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
						} else {
							arg1 -= arg2;
							arg2 -= arg0;
							arg0 = anIntArray3536[arg0];
							while (--arg2 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg0, arg3 >> 16, arg4 >> 16,
										arg6 >> 8, arg7 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg4 += i_16_;
								arg3 += i_12_;
								arg7 += i_17_;
								arg6 += i_13_;
								arg0 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
							while (--arg1 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg0, arg3 >> 16, arg5 >> 16,
										arg6 >> 8, arg8 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg5 += i_14_;
								arg3 += i_12_;
								arg8 += i_15_;
								arg6 += i_13_;
								arg0 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
						}
					}
				}
			} else if (arg1 <= arg2) {
				if (arg1 < anInt3529) {
					if (arg2 > anInt3529)
						arg2 = anInt3529;
					if (arg0 > anInt3529)
						arg0 = anInt3529;
					if (arg2 < arg0) {
						arg3 = arg4 <<= 16;
						arg6 = arg7 <<= 16;
						if (arg1 < 0) {
							arg3 -= i_12_ * arg1;
							arg4 -= i_14_ * arg1;
							arg6 -= i_13_ * arg1;
							arg7 -= i_15_ * arg1;
							arg1 = 0;
						}
						arg5 <<= 16;
						arg8 <<= 16;
						if (arg2 < 0) {
							arg5 -= i_16_ * arg2;
							arg8 -= i_17_ * arg2;
							arg2 = 0;
						}
						int i_20_ = arg1 - anInt3532;
						i += i_5_ * i_20_;
						i_6_ += i_8_ * i_20_;
						i_9_ += i_11_ * i_20_;
						if (arg1 != arg2 && i_12_ < i_14_ || arg1 == arg2
								&& i_12_ > i_16_) {
							arg0 -= arg2;
							arg2 -= arg1;
							arg1 = anIntArray3536[arg1];
							while (--arg2 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg1, arg3 >> 16, arg4 >> 16,
										arg6 >> 8, arg7 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg3 += i_12_;
								arg4 += i_14_;
								arg6 += i_13_;
								arg7 += i_15_;
								arg1 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
							while (--arg0 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg1, arg3 >> 16, arg5 >> 16,
										arg6 >> 8, arg8 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg3 += i_12_;
								arg5 += i_16_;
								arg6 += i_13_;
								arg8 += i_17_;
								arg1 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
						} else {
							arg0 -= arg2;
							arg2 -= arg1;
							arg1 = anIntArray3536[arg1];
							while (--arg2 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg1, arg4 >> 16, arg3 >> 16,
										arg7 >> 8, arg6 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg3 += i_12_;
								arg4 += i_14_;
								arg6 += i_13_;
								arg7 += i_15_;
								arg1 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
							while (--arg0 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg1, arg5 >> 16, arg3 >> 16,
										arg8 >> 8, arg6 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg3 += i_12_;
								arg5 += i_16_;
								arg6 += i_13_;
								arg8 += i_17_;
								arg1 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
						}
					} else {
						arg5 = arg4 <<= 16;
						arg8 = arg7 <<= 16;
						if (arg1 < 0) {
							arg5 -= i_12_ * arg1;
							arg4 -= i_14_ * arg1;
							arg8 -= i_13_ * arg1;
							arg7 -= i_15_ * arg1;
							arg1 = 0;
						}
						arg3 <<= 16;
						arg6 <<= 16;
						if (arg0 < 0) {
							arg3 -= i_16_ * arg0;
							arg6 -= i_17_ * arg0;
							arg0 = 0;
						}
						int i_21_ = arg1 - anInt3532;
						i += i_5_ * i_21_;
						i_6_ += i_8_ * i_21_;
						i_9_ += i_11_ * i_21_;
						if (i_12_ < i_14_) {
							arg2 -= arg0;
							arg0 -= arg1;
							arg1 = anIntArray3536[arg1];
							while (--arg0 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg1, arg5 >> 16, arg4 >> 16,
										arg8 >> 8, arg7 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg5 += i_12_;
								arg4 += i_14_;
								arg8 += i_13_;
								arg7 += i_15_;
								arg1 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
							while (--arg2 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg1, arg3 >> 16, arg4 >> 16,
										arg6 >> 8, arg7 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg3 += i_16_;
								arg4 += i_14_;
								arg6 += i_17_;
								arg7 += i_15_;
								arg1 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
						} else {
							arg2 -= arg0;
							arg0 -= arg1;
							arg1 = anIntArray3536[arg1];
							while (--arg0 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg1, arg4 >> 16, arg5 >> 16,
										arg7 >> 8, arg8 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg5 += i_12_;
								arg4 += i_14_;
								arg8 += i_13_;
								arg7 += i_15_;
								arg1 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
							while (--arg2 >= 0) {
								method552(Class4_Sub20_Sub12.anIntArray3099,
										is, 0, 0, arg1, arg4 >> 16, arg3 >> 16,
										arg7 >> 8, arg6 >> 8, i, i_6_, i_9_,
										i_4_, i_7_, i_10_);
								arg3 += i_16_;
								arg4 += i_14_;
								arg6 += i_17_;
								arg7 += i_15_;
								arg1 += Class4_Sub20_Sub12.anInt3098;
								i += i_5_;
								i_6_ += i_8_;
								i_9_ += i_11_;
							}
						}
					}
				}
			} else if (arg2 < anInt3529) {
				if (arg0 > anInt3529)
					arg0 = anInt3529;
				if (arg1 > anInt3529)
					arg1 = anInt3529;
				if (arg0 < arg1) {
					arg4 = arg5 <<= 16;
					arg7 = arg8 <<= 16;
					if (arg2 < 0) {
						arg4 -= i_14_ * arg2;
						arg5 -= i_16_ * arg2;
						arg7 -= i_15_ * arg2;
						arg8 -= i_17_ * arg2;
						arg2 = 0;
					}
					arg3 <<= 16;
					arg6 <<= 16;
					if (arg0 < 0) {
						arg3 -= i_12_ * arg0;
						arg6 -= i_13_ * arg0;
						arg0 = 0;
					}
					int i_22_ = arg2 - anInt3532;
					i += i_5_ * i_22_;
					i_6_ += i_8_ * i_22_;
					i_9_ += i_11_ * i_22_;
					if (i_14_ < i_16_) {
						arg1 -= arg0;
						arg0 -= arg2;
						arg2 = anIntArray3536[arg2];
						while (--arg0 >= 0) {
							method552(Class4_Sub20_Sub12.anIntArray3099, is, 0,
									0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8,
									arg8 >> 8, i, i_6_, i_9_, i_4_, i_7_, i_10_);
							arg4 += i_14_;
							arg5 += i_16_;
							arg7 += i_15_;
							arg8 += i_17_;
							arg2 += Class4_Sub20_Sub12.anInt3098;
							i += i_5_;
							i_6_ += i_8_;
							i_9_ += i_11_;
						}
						while (--arg1 >= 0) {
							method552(Class4_Sub20_Sub12.anIntArray3099, is, 0,
									0, arg2, arg4 >> 16, arg3 >> 16, arg7 >> 8,
									arg6 >> 8, i, i_6_, i_9_, i_4_, i_7_, i_10_);
							arg4 += i_14_;
							arg3 += i_12_;
							arg7 += i_15_;
							arg6 += i_13_;
							arg2 += Class4_Sub20_Sub12.anInt3098;
							i += i_5_;
							i_6_ += i_8_;
							i_9_ += i_11_;
						}
					} else {
						arg1 -= arg0;
						arg0 -= arg2;
						arg2 = anIntArray3536[arg2];
						while (--arg0 >= 0) {
							method552(Class4_Sub20_Sub12.anIntArray3099, is, 0,
									0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8,
									arg7 >> 8, i, i_6_, i_9_, i_4_, i_7_, i_10_);
							arg4 += i_14_;
							arg5 += i_16_;
							arg7 += i_15_;
							arg8 += i_17_;
							arg2 += Class4_Sub20_Sub12.anInt3098;
							i += i_5_;
							i_6_ += i_8_;
							i_9_ += i_11_;
						}
						while (--arg1 >= 0) {
							method552(Class4_Sub20_Sub12.anIntArray3099, is, 0,
									0, arg2, arg3 >> 16, arg4 >> 16, arg6 >> 8,
									arg7 >> 8, i, i_6_, i_9_, i_4_, i_7_, i_10_);
							arg4 += i_14_;
							arg3 += i_12_;
							arg7 += i_15_;
							arg6 += i_13_;
							arg2 += Class4_Sub20_Sub12.anInt3098;
							i += i_5_;
							i_6_ += i_8_;
							i_9_ += i_11_;
						}
					}
				} else {
					arg3 = arg5 <<= 16;
					arg6 = arg8 <<= 16;
					if (arg2 < 0) {
						arg3 -= i_14_ * arg2;
						arg5 -= i_16_ * arg2;
						arg6 -= i_15_ * arg2;
						arg8 -= i_17_ * arg2;
						arg2 = 0;
					}
					arg4 <<= 16;
					arg7 <<= 16;
					if (arg1 < 0) {
						arg4 -= i_12_ * arg1;
						arg7 -= i_13_ * arg1;
						arg1 = 0;
					}
					int i_23_ = arg2 - anInt3532;
					i += i_5_ * i_23_;
					i_6_ += i_8_ * i_23_;
					i_9_ += i_11_ * i_23_;
					if (i_14_ < i_16_) {
						arg0 -= arg1;
						arg1 -= arg2;
						arg2 = anIntArray3536[arg2];
						while (--arg1 >= 0) {
							method552(Class4_Sub20_Sub12.anIntArray3099, is, 0,
									0, arg2, arg3 >> 16, arg5 >> 16, arg6 >> 8,
									arg8 >> 8, i, i_6_, i_9_, i_4_, i_7_, i_10_);
							arg3 += i_14_;
							arg5 += i_16_;
							arg6 += i_15_;
							arg8 += i_17_;
							arg2 += Class4_Sub20_Sub12.anInt3098;
							i += i_5_;
							i_6_ += i_8_;
							i_9_ += i_11_;
						}
						while (--arg0 >= 0) {
							method552(Class4_Sub20_Sub12.anIntArray3099, is, 0,
									0, arg2, arg4 >> 16, arg5 >> 16, arg7 >> 8,
									arg8 >> 8, i, i_6_, i_9_, i_4_, i_7_, i_10_);
							arg4 += i_12_;
							arg5 += i_16_;
							arg7 += i_13_;
							arg8 += i_17_;
							arg2 += Class4_Sub20_Sub12.anInt3098;
							i += i_5_;
							i_6_ += i_8_;
							i_9_ += i_11_;
						}
					} else {
						arg0 -= arg1;
						arg1 -= arg2;
						arg2 = anIntArray3536[arg2];
						while (--arg1 >= 0) {
							method552(Class4_Sub20_Sub12.anIntArray3099, is, 0,
									0, arg2, arg5 >> 16, arg3 >> 16, arg8 >> 8,
									arg6 >> 8, i, i_6_, i_9_, i_4_, i_7_, i_10_);
							arg3 += i_14_;
							arg5 += i_16_;
							arg6 += i_15_;
							arg8 += i_17_;
							arg2 += Class4_Sub20_Sub12.anInt3098;
							i += i_5_;
							i_6_ += i_8_;
							i_9_ += i_11_;
						}
						while (--arg0 >= 0) {
							method552(Class4_Sub20_Sub12.anIntArray3099, is, 0,
									0, arg2, arg5 >> 16, arg4 >> 16, arg8 >> 8,
									arg7 >> 8, i, i_6_, i_9_, i_4_, i_7_, i_10_);
							arg4 += i_12_;
							arg5 += i_16_;
							arg7 += i_13_;
							arg8 += i_17_;
							arg2 += Class4_Sub20_Sub12.anInt3098;
							i += i_5_;
							i_6_ += i_8_;
							i_9_ += i_11_;
						}
					}
				}
			}
		}
	}

	public static void method542(int arg0, int arg1, int arg2, int arg3) {
		anInt3525 = arg2 - arg0;
		anInt3529 = arg3 - arg1;
		method554();
		if (anIntArray3536.length < anInt3529)
			anIntArray3536 = new int[Class12.method677(-473856792, anInt3529)];
		int i = arg1 * Class4_Sub20_Sub12.anInt3098 + arg0;
		for (int i_24_ = 0; i_24_ < anInt3529; i_24_++) {
			anIntArray3536[i_24_] = i;
			i += Class4_Sub20_Sub12.anInt3098;
		}
	}

	public static void method543() {
		method542(Class4_Sub20_Sub12.anInt3101, Class4_Sub20_Sub12.anInt3103,
				Class4_Sub20_Sub12.anInt3097, Class4_Sub20_Sub12.anInt3100);
	}

	public static void method544(int[] arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7) {
		if (aBoolean3537) {
			int i;
			if (aBoolean3522) {
				if (arg5 - arg4 > 3)
					i = (arg7 - arg6) / (arg5 - arg4);
				else
					i = 0;
				if (arg5 > anInt3525)
					arg5 = anInt3525;
				if (arg4 < 0) {
					arg6 -= arg4 * i;
					arg4 = 0;
				}
				if (arg4 >= arg5)
					return;
				arg1 += arg4;
				arg3 = arg5 - arg4 >> 2;
				i <<= 2;
			} else {
				if (arg4 >= arg5)
					return;
				arg1 += arg4;
				arg3 = arg5 - arg4 >> 2;
				if (arg3 > 0)
					i = (arg7 - arg6) * anIntArray3540[arg3] >> 15;
				else
					i = 0;
			}
			if (anInt3531 == 0) {
				while (--arg3 >= 0) {
					arg2 = anIntArray3523[arg6 >> 8];
					arg6 += i;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
				}
				arg3 = arg5 - arg4 & 0x3;
				if (arg3 > 0) {
					arg2 = anIntArray3523[arg6 >> 8];
					do
						arg0[arg1++] = arg2;
					while (--arg3 > 0);
				}
			} else {
				int i_25_ = anInt3531;
				int i_26_ = 256 - anInt3531;
				while (--arg3 >= 0) {
					arg2 = anIntArray3523[arg6 >> 8];
					arg6 += i;
					arg2 = (((arg2 & 0xff00ff) * i_26_ >> 8 & 0xff00ff) + ((arg2 & 0xff00)
							* i_26_ >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i_25_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i_25_ >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i_25_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i_25_ >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i_25_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i_25_ >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i_25_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i_25_ >> 8 & 0xff00));
				}
				arg3 = arg5 - arg4 & 0x3;
				if (arg3 > 0) {
					arg2 = anIntArray3523[arg6 >> 8];
					arg2 = (((arg2 & 0xff00ff) * i_26_ >> 8 & 0xff00ff) + ((arg2 & 0xff00)
							* i_26_ >> 8 & 0xff00));
					do
						arg0[arg1++] = (arg2
								+ ((arg0[arg1] & 0xff00ff) * i_25_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
								* i_25_ >> 8 & 0xff00));
					while (--arg3 > 0);
				}
			}
		} else if (arg4 < arg5) {
			int i = (arg7 - arg6) / (arg5 - arg4);
			if (aBoolean3522) {
				if (arg5 > anInt3525)
					arg5 = anInt3525;
				if (arg4 < 0) {
					arg6 -= arg4 * i;
					arg4 = 0;
				}
				if (arg4 >= arg5)
					return;
			}
			arg1 += arg4;
			arg3 = arg5 - arg4;
			if (anInt3531 == 0) {
				do {
					arg0[arg1++] = anIntArray3523[arg6 >> 8];
					arg6 += i;
				} while (--arg3 > 0);
			} else {
				int i_27_ = anInt3531;
				int i_28_ = 256 - anInt3531;
				do {
					arg2 = anIntArray3523[arg6 >> 8];
					arg6 += i;
					arg2 = (((arg2 & 0xff00ff) * i_28_ >> 8 & 0xff00ff) + ((arg2 & 0xff00)
							* i_28_ >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i_27_ >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i_27_ >> 8 & 0xff00));
				} while (--arg3 > 0);
			}
		}
	}

	public static void method545(int arg0, int arg1, int arg2) {
		aBoolean3522 = (arg0 < 0 || arg0 > anInt3525 || arg1 < 0
				|| arg1 > anInt3525 || arg2 < 0 || arg2 > anInt3525);
	}

	public static void method546(int arg0, int arg1) {
		int i = anIntArray3536[0];
		int i_29_ = i / Class4_Sub20_Sub12.anInt3098;
		int i_30_ = i - i_29_ * Class4_Sub20_Sub12.anInt3098;
		anInt3535 = arg0 - i_30_;
		anInt3532 = arg1 - i_29_;
		anInt3526 = -anInt3535;
		anInt3538 = anInt3525 - anInt3535;
		anInt3533 = -anInt3532;
		anInt3534 = anInt3529 - anInt3532;
	}

	public static void method547(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6) {
		int i = 0;
		if (arg1 != arg0)
			i = (arg4 - arg3 << 16) / (arg1 - arg0);
		int i_31_ = 0;
		if (arg2 != arg1)
			i_31_ = (arg5 - arg4 << 16) / (arg2 - arg1);
		int i_32_ = 0;
		if (arg2 != arg0)
			i_32_ = (arg3 - arg5 << 16) / (arg0 - arg2);
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt3529) {
				if (arg1 > anInt3529)
					arg1 = anInt3529;
				if (arg2 > anInt3529)
					arg2 = anInt3529;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 16;
					if (arg0 < 0) {
						arg5 -= i_32_ * arg0;
						arg3 -= i * arg0;
						arg0 = 0;
					}
					arg4 <<= 16;
					if (arg1 < 0) {
						arg4 -= i_31_ * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && i_32_ < i || arg0 == arg1
							&& i_32_ > i_31_) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray3536[arg0];
						while (--arg1 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg0,
									arg6, 0, arg5 >> 16, arg3 >> 16);
							arg5 += i_32_;
							arg3 += i;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg2 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg0,
									arg6, 0, arg5 >> 16, arg4 >> 16);
							arg5 += i_32_;
							arg4 += i_31_;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray3536[arg0];
						while (--arg1 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg0,
									arg6, 0, arg3 >> 16, arg5 >> 16);
							arg5 += i_32_;
							arg3 += i;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg2 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg0,
									arg6, 0, arg4 >> 16, arg5 >> 16);
							arg5 += i_32_;
							arg4 += i_31_;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
					}
				} else {
					arg4 = arg3 <<= 16;
					if (arg0 < 0) {
						arg4 -= i_32_ * arg0;
						arg3 -= i * arg0;
						arg0 = 0;
					}
					arg5 <<= 16;
					if (arg2 < 0) {
						arg5 -= i_31_ * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && i_32_ < i || arg0 == arg2 && i_31_ > i) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray3536[arg0];
						while (--arg2 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg0,
									arg6, 0, arg4 >> 16, arg3 >> 16);
							arg4 += i_32_;
							arg3 += i;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg1 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg0,
									arg6, 0, arg5 >> 16, arg3 >> 16);
							arg5 += i_31_;
							arg3 += i;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray3536[arg0];
						while (--arg2 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg0,
									arg6, 0, arg3 >> 16, arg4 >> 16);
							arg4 += i_32_;
							arg3 += i;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg1 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg0,
									arg6, 0, arg3 >> 16, arg5 >> 16);
							arg5 += i_31_;
							arg3 += i;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt3529) {
				if (arg2 > anInt3529)
					arg2 = anInt3529;
				if (arg0 > anInt3529)
					arg0 = anInt3529;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 16;
					if (arg1 < 0) {
						arg3 -= i * arg1;
						arg4 -= i_31_ * arg1;
						arg1 = 0;
					}
					arg5 <<= 16;
					if (arg2 < 0) {
						arg5 -= i_32_ * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && i < i_31_ || arg1 == arg2 && i > i_32_) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray3536[arg1];
						while (--arg2 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg1,
									arg6, 0, arg3 >> 16, arg4 >> 16);
							arg3 += i;
							arg4 += i_31_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg0 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg1,
									arg6, 0, arg3 >> 16, arg5 >> 16);
							arg3 += i;
							arg5 += i_32_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray3536[arg1];
						while (--arg2 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg1,
									arg6, 0, arg4 >> 16, arg3 >> 16);
							arg3 += i;
							arg4 += i_31_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg0 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg1,
									arg6, 0, arg5 >> 16, arg3 >> 16);
							arg3 += i;
							arg5 += i_32_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
					}
				} else {
					arg5 = arg4 <<= 16;
					if (arg1 < 0) {
						arg5 -= i * arg1;
						arg4 -= i_31_ * arg1;
						arg1 = 0;
					}
					arg3 <<= 16;
					if (arg0 < 0) {
						arg3 -= i_32_ * arg0;
						arg0 = 0;
					}
					if (i < i_31_) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray3536[arg1];
						while (--arg0 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg1,
									arg6, 0, arg5 >> 16, arg4 >> 16);
							arg5 += i;
							arg4 += i_31_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg2 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg1,
									arg6, 0, arg3 >> 16, arg4 >> 16);
							arg3 += i_32_;
							arg4 += i_31_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray3536[arg1];
						while (--arg0 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg1,
									arg6, 0, arg4 >> 16, arg5 >> 16);
							arg5 += i;
							arg4 += i_31_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg2 >= 0) {
							method550(Class4_Sub20_Sub12.anIntArray3099, arg1,
									arg6, 0, arg4 >> 16, arg3 >> 16);
							arg3 += i_32_;
							arg4 += i_31_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
					}
				}
			}
		} else if (arg2 < anInt3529) {
			if (arg0 > anInt3529)
				arg0 = anInt3529;
			if (arg1 > anInt3529)
				arg1 = anInt3529;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 16;
				if (arg2 < 0) {
					arg4 -= i_31_ * arg2;
					arg5 -= i_32_ * arg2;
					arg2 = 0;
				}
				arg3 <<= 16;
				if (arg0 < 0) {
					arg3 -= i * arg0;
					arg0 = 0;
				}
				if (i_31_ < i_32_) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray3536[arg2];
					while (--arg0 >= 0) {
						method550(Class4_Sub20_Sub12.anIntArray3099, arg2,
								arg6, 0, arg4 >> 16, arg5 >> 16);
						arg4 += i_31_;
						arg5 += i_32_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
					while (--arg1 >= 0) {
						method550(Class4_Sub20_Sub12.anIntArray3099, arg2,
								arg6, 0, arg4 >> 16, arg3 >> 16);
						arg4 += i_31_;
						arg3 += i;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray3536[arg2];
					while (--arg0 >= 0) {
						method550(Class4_Sub20_Sub12.anIntArray3099, arg2,
								arg6, 0, arg5 >> 16, arg4 >> 16);
						arg4 += i_31_;
						arg5 += i_32_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
					while (--arg1 >= 0) {
						method550(Class4_Sub20_Sub12.anIntArray3099, arg2,
								arg6, 0, arg3 >> 16, arg4 >> 16);
						arg4 += i_31_;
						arg3 += i;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
				}
			} else {
				arg3 = arg5 <<= 16;
				if (arg2 < 0) {
					arg3 -= i_31_ * arg2;
					arg5 -= i_32_ * arg2;
					arg2 = 0;
				}
				arg4 <<= 16;
				if (arg1 < 0) {
					arg4 -= i * arg1;
					arg1 = 0;
				}
				if (i_31_ < i_32_) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray3536[arg2];
					while (--arg1 >= 0) {
						method550(Class4_Sub20_Sub12.anIntArray3099, arg2,
								arg6, 0, arg3 >> 16, arg5 >> 16);
						arg3 += i_31_;
						arg5 += i_32_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
					while (--arg0 >= 0) {
						method550(Class4_Sub20_Sub12.anIntArray3099, arg2,
								arg6, 0, arg4 >> 16, arg5 >> 16);
						arg4 += i;
						arg5 += i_32_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray3536[arg2];
					while (--arg1 >= 0) {
						method550(Class4_Sub20_Sub12.anIntArray3099, arg2,
								arg6, 0, arg5 >> 16, arg3 >> 16);
						arg3 += i_31_;
						arg5 += i_32_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
					while (--arg0 >= 0) {
						method550(Class4_Sub20_Sub12.anIntArray3099, arg2,
								arg6, 0, arg5 >> 16, arg4 >> 16);
						arg4 += i;
						arg5 += i_32_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
				}
			}
		}
	}

	public static void method548(double arg0, int arg1, int arg2) {
		arg0 += Math.random() * 0.03 - 0.015;
		int i = arg1 * 128;
		for (int i_33_ = arg1; i_33_ < arg2; i_33_++) {
			double d = (i_33_ >> 3) / 64.0 + 0.0078125;
			double d_34_ = (i_33_ & 0x7) / 8.0 + 0.0625;
			for (int i_35_ = 0; i_35_ < 128; i_35_++) {
				double d_36_ = i_35_ / 128.0;
				double d_37_ = d_36_;
				double d_38_ = d_36_;
				double d_39_ = d_36_;
				if (d_34_ != 0.0) {
					double d_40_;
					if (d_36_ < 0.5)
						d_40_ = d_36_ * (1.0 + d_34_);
					else
						d_40_ = d_36_ + d_34_ - d_36_ * d_34_;
					double d_41_ = 2.0 * d_36_ - d_40_;
					double d_42_ = d + 0.3333333333333333;
					if (d_42_ > 1.0)
						d_42_--;
					double d_43_ = d;
					double d_44_ = d - 0.3333333333333333;
					if (d_44_ < 0.0)
						d_44_++;
					if (6.0 * d_42_ < 1.0)
						d_37_ = d_41_ + (d_40_ - d_41_) * 6.0 * d_42_;
					else if (2.0 * d_42_ < 1.0)
						d_37_ = d_40_;
					else if (3.0 * d_42_ < 2.0)
						d_37_ = d_41_
								+ ((d_40_ - d_41_)
										* (0.6666666666666666 - d_42_) * 6.0);
					else
						d_37_ = d_41_;
					if (6.0 * d_43_ < 1.0)
						d_38_ = d_41_ + (d_40_ - d_41_) * 6.0 * d_43_;
					else if (2.0 * d_43_ < 1.0)
						d_38_ = d_40_;
					else if (3.0 * d_43_ < 2.0)
						d_38_ = d_41_
								+ ((d_40_ - d_41_)
										* (0.6666666666666666 - d_43_) * 6.0);
					else
						d_38_ = d_41_;
					if (6.0 * d_44_ < 1.0)
						d_39_ = d_41_ + (d_40_ - d_41_) * 6.0 * d_44_;
					else if (2.0 * d_44_ < 1.0)
						d_39_ = d_40_;
					else if (3.0 * d_44_ < 2.0)
						d_39_ = d_41_
								+ ((d_40_ - d_41_)
										* (0.6666666666666666 - d_44_) * 6.0);
					else
						d_39_ = d_41_;
				}
				int i_45_ = (int) (d_37_ * 256.0);
				int i_46_ = (int) (d_38_ * 256.0);
				int i_47_ = (int) (d_39_ * 256.0);
				int i_48_ = (i_45_ << 16) + (i_46_ << 8) + i_47_;
				i_48_ = method538(i_48_, arg0);
				if (i_48_ == 0)
					i_48_ = 1;
				anIntArray3523[i++] = i_48_;
			}
		}
	}

	public static void method549(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8) {
		int i = 0;
		int i_49_ = 0;
		if (arg1 != arg0) {
			i = (arg4 - arg3 << 16) / (arg1 - arg0);
			i_49_ = (arg7 - arg6 << 15) / (arg1 - arg0);
		}
		int i_50_ = 0;
		int i_51_ = 0;
		if (arg2 != arg1) {
			i_50_ = (arg5 - arg4 << 16) / (arg2 - arg1);
			i_51_ = (arg8 - arg7 << 15) / (arg2 - arg1);
		}
		int i_52_ = 0;
		int i_53_ = 0;
		if (arg2 != arg0) {
			i_52_ = (arg3 - arg5 << 16) / (arg0 - arg2);
			i_53_ = (arg6 - arg8 << 15) / (arg0 - arg2);
		}
		if (arg0 <= arg1 && arg0 <= arg2) {
			if (arg0 < anInt3529) {
				if (arg1 > anInt3529)
					arg1 = anInt3529;
				if (arg2 > anInt3529)
					arg2 = anInt3529;
				if (arg1 < arg2) {
					arg5 = arg3 <<= 16;
					arg8 = arg6 <<= 15;
					if (arg0 < 0) {
						arg5 -= i_52_ * arg0;
						arg3 -= i * arg0;
						arg8 -= i_53_ * arg0;
						arg6 -= i_49_ * arg0;
						arg0 = 0;
					}
					arg4 <<= 16;
					arg7 <<= 15;
					if (arg1 < 0) {
						arg4 -= i_50_ * arg1;
						arg7 -= i_51_ * arg1;
						arg1 = 0;
					}
					if (arg0 != arg1 && i_52_ < i || arg0 == arg1
							&& i_52_ > i_50_) {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray3536[arg0];
						while (--arg1 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg0,
									0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7,
									arg6 >> 7);
							arg5 += i_52_;
							arg3 += i;
							arg8 += i_53_;
							arg6 += i_49_;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg2 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg0,
									0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7,
									arg7 >> 7);
							arg5 += i_52_;
							arg4 += i_50_;
							arg8 += i_53_;
							arg7 += i_51_;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
					} else {
						arg2 -= arg1;
						arg1 -= arg0;
						arg0 = anIntArray3536[arg0];
						while (--arg1 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg0,
									0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7,
									arg8 >> 7);
							arg5 += i_52_;
							arg3 += i;
							arg8 += i_53_;
							arg6 += i_49_;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg2 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg0,
									0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7,
									arg8 >> 7);
							arg5 += i_52_;
							arg4 += i_50_;
							arg8 += i_53_;
							arg7 += i_51_;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
					}
				} else {
					arg4 = arg3 <<= 16;
					arg7 = arg6 <<= 15;
					if (arg0 < 0) {
						arg4 -= i_52_ * arg0;
						arg3 -= i * arg0;
						arg7 -= i_53_ * arg0;
						arg6 -= i_49_ * arg0;
						arg0 = 0;
					}
					arg5 <<= 16;
					arg8 <<= 15;
					if (arg2 < 0) {
						arg5 -= i_50_ * arg2;
						arg8 -= i_51_ * arg2;
						arg2 = 0;
					}
					if (arg0 != arg2 && i_52_ < i || arg0 == arg2 && i_50_ > i) {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray3536[arg0];
						while (--arg2 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg0,
									0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7,
									arg6 >> 7);
							arg4 += i_52_;
							arg3 += i;
							arg7 += i_53_;
							arg6 += i_49_;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg1 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg0,
									0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7,
									arg6 >> 7);
							arg5 += i_50_;
							arg3 += i;
							arg8 += i_51_;
							arg6 += i_49_;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
					} else {
						arg1 -= arg2;
						arg2 -= arg0;
						arg0 = anIntArray3536[arg0];
						while (--arg2 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg0,
									0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7,
									arg7 >> 7);
							arg4 += i_52_;
							arg3 += i;
							arg7 += i_53_;
							arg6 += i_49_;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg1 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg0,
									0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7,
									arg8 >> 7);
							arg5 += i_50_;
							arg3 += i;
							arg8 += i_51_;
							arg6 += i_49_;
							arg0 += Class4_Sub20_Sub12.anInt3098;
						}
					}
				}
			}
		} else if (arg1 <= arg2) {
			if (arg1 < anInt3529) {
				if (arg2 > anInt3529)
					arg2 = anInt3529;
				if (arg0 > anInt3529)
					arg0 = anInt3529;
				if (arg2 < arg0) {
					arg3 = arg4 <<= 16;
					arg6 = arg7 <<= 15;
					if (arg1 < 0) {
						arg3 -= i * arg1;
						arg4 -= i_50_ * arg1;
						arg6 -= i_49_ * arg1;
						arg7 -= i_51_ * arg1;
						arg1 = 0;
					}
					arg5 <<= 16;
					arg8 <<= 15;
					if (arg2 < 0) {
						arg5 -= i_52_ * arg2;
						arg8 -= i_53_ * arg2;
						arg2 = 0;
					}
					if (arg1 != arg2 && i < i_50_ || arg1 == arg2 && i > i_52_) {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray3536[arg1];
						while (--arg2 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg1,
									0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7,
									arg7 >> 7);
							arg3 += i;
							arg4 += i_50_;
							arg6 += i_49_;
							arg7 += i_51_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg0 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg1,
									0, 0, arg3 >> 16, arg5 >> 16, arg6 >> 7,
									arg8 >> 7);
							arg3 += i;
							arg5 += i_52_;
							arg6 += i_49_;
							arg8 += i_53_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
					} else {
						arg0 -= arg2;
						arg2 -= arg1;
						arg1 = anIntArray3536[arg1];
						while (--arg2 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg1,
									0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7,
									arg6 >> 7);
							arg3 += i;
							arg4 += i_50_;
							arg6 += i_49_;
							arg7 += i_51_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg0 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg1,
									0, 0, arg5 >> 16, arg3 >> 16, arg8 >> 7,
									arg6 >> 7);
							arg3 += i;
							arg5 += i_52_;
							arg6 += i_49_;
							arg8 += i_53_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
					}
				} else {
					arg5 = arg4 <<= 16;
					arg8 = arg7 <<= 15;
					if (arg1 < 0) {
						arg5 -= i * arg1;
						arg4 -= i_50_ * arg1;
						arg8 -= i_49_ * arg1;
						arg7 -= i_51_ * arg1;
						arg1 = 0;
					}
					arg3 <<= 16;
					arg6 <<= 15;
					if (arg0 < 0) {
						arg3 -= i_52_ * arg0;
						arg6 -= i_53_ * arg0;
						arg0 = 0;
					}
					if (i < i_50_) {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray3536[arg1];
						while (--arg0 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg1,
									0, 0, arg5 >> 16, arg4 >> 16, arg8 >> 7,
									arg7 >> 7);
							arg5 += i;
							arg4 += i_50_;
							arg8 += i_49_;
							arg7 += i_51_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg2 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg1,
									0, 0, arg3 >> 16, arg4 >> 16, arg6 >> 7,
									arg7 >> 7);
							arg3 += i_52_;
							arg4 += i_50_;
							arg6 += i_53_;
							arg7 += i_51_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
					} else {
						arg2 -= arg0;
						arg0 -= arg1;
						arg1 = anIntArray3536[arg1];
						while (--arg0 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg1,
									0, 0, arg4 >> 16, arg5 >> 16, arg7 >> 7,
									arg8 >> 7);
							arg5 += i;
							arg4 += i_50_;
							arg8 += i_49_;
							arg7 += i_51_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
						while (--arg2 >= 0) {
							method544(Class4_Sub20_Sub12.anIntArray3099, arg1,
									0, 0, arg4 >> 16, arg3 >> 16, arg7 >> 7,
									arg6 >> 7);
							arg3 += i_52_;
							arg4 += i_50_;
							arg6 += i_53_;
							arg7 += i_51_;
							arg1 += Class4_Sub20_Sub12.anInt3098;
						}
					}
				}
			}
		} else if (arg2 < anInt3529) {
			if (arg0 > anInt3529)
				arg0 = anInt3529;
			if (arg1 > anInt3529)
				arg1 = anInt3529;
			if (arg0 < arg1) {
				arg4 = arg5 <<= 16;
				arg7 = arg8 <<= 15;
				if (arg2 < 0) {
					arg4 -= i_50_ * arg2;
					arg5 -= i_52_ * arg2;
					arg7 -= i_51_ * arg2;
					arg8 -= i_53_ * arg2;
					arg2 = 0;
				}
				arg3 <<= 16;
				arg6 <<= 15;
				if (arg0 < 0) {
					arg3 -= i * arg0;
					arg6 -= i_49_ * arg0;
					arg0 = 0;
				}
				if (i_50_ < i_52_) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray3536[arg2];
					while (--arg0 >= 0) {
						method544(Class4_Sub20_Sub12.anIntArray3099, arg2, 0,
								0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += i_50_;
						arg5 += i_52_;
						arg7 += i_51_;
						arg8 += i_53_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
					while (--arg1 >= 0) {
						method544(Class4_Sub20_Sub12.anIntArray3099, arg2, 0,
								0, arg4 >> 16, arg3 >> 16, arg7 >> 7, arg6 >> 7);
						arg4 += i_50_;
						arg3 += i;
						arg7 += i_51_;
						arg6 += i_49_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = anIntArray3536[arg2];
					while (--arg0 >= 0) {
						method544(Class4_Sub20_Sub12.anIntArray3099, arg2, 0,
								0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += i_50_;
						arg5 += i_52_;
						arg7 += i_51_;
						arg8 += i_53_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
					while (--arg1 >= 0) {
						method544(Class4_Sub20_Sub12.anIntArray3099, arg2, 0,
								0, arg3 >> 16, arg4 >> 16, arg6 >> 7, arg7 >> 7);
						arg4 += i_50_;
						arg3 += i;
						arg7 += i_51_;
						arg6 += i_49_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
				}
			} else {
				arg3 = arg5 <<= 16;
				arg6 = arg8 <<= 15;
				if (arg2 < 0) {
					arg3 -= i_50_ * arg2;
					arg5 -= i_52_ * arg2;
					arg6 -= i_51_ * arg2;
					arg8 -= i_53_ * arg2;
					arg2 = 0;
				}
				arg4 <<= 16;
				arg7 <<= 15;
				if (arg1 < 0) {
					arg4 -= i * arg1;
					arg7 -= i_49_ * arg1;
					arg1 = 0;
				}
				if (i_50_ < i_52_) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray3536[arg2];
					while (--arg1 >= 0) {
						method544(Class4_Sub20_Sub12.anIntArray3099, arg2, 0,
								0, arg3 >> 16, arg5 >> 16, arg6 >> 7, arg8 >> 7);
						arg3 += i_50_;
						arg5 += i_52_;
						arg6 += i_51_;
						arg8 += i_53_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
					while (--arg0 >= 0) {
						method544(Class4_Sub20_Sub12.anIntArray3099, arg2, 0,
								0, arg4 >> 16, arg5 >> 16, arg7 >> 7, arg8 >> 7);
						arg4 += i;
						arg5 += i_52_;
						arg7 += i_49_;
						arg8 += i_53_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = anIntArray3536[arg2];
					while (--arg1 >= 0) {
						method544(Class4_Sub20_Sub12.anIntArray3099, arg2, 0,
								0, arg5 >> 16, arg3 >> 16, arg8 >> 7, arg6 >> 7);
						arg3 += i_50_;
						arg5 += i_52_;
						arg6 += i_51_;
						arg8 += i_53_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
					while (--arg0 >= 0) {
						method544(Class4_Sub20_Sub12.anIntArray3099, arg2, 0,
								0, arg5 >> 16, arg4 >> 16, arg8 >> 7, arg7 >> 7);
						arg4 += i;
						arg5 += i_52_;
						arg7 += i_49_;
						arg8 += i_53_;
						arg2 += Class4_Sub20_Sub12.anInt3098;
					}
				}
			}
		}
	}

	public static void method550(int[] arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5) {
		if (aBoolean3522) {
			if (arg5 > anInt3525)
				arg5 = anInt3525;
			if (arg4 < 0)
				arg4 = 0;
		}
		if (arg4 < arg5) {
			arg1 += arg4;
			arg3 = arg5 - arg4 >> 2;
			if (anInt3531 == 0) {
				while (--arg3 >= 0) {
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
					arg0[arg1++] = arg2;
				}
				arg3 = arg5 - arg4 & 0x3;
				while (--arg3 >= 0)
					arg0[arg1++] = arg2;
			} else {
				int i = anInt3531;
				int i_54_ = 256 - anInt3531;
				arg2 = (((arg2 & 0xff00ff) * i_54_ >> 8 & 0xff00ff) + ((arg2 & 0xff00)
						* i_54_ >> 8 & 0xff00));
				while (--arg3 >= 0) {
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i >> 8 & 0xff00));
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i >> 8 & 0xff00));
				}
				arg3 = arg5 - arg4 & 0x3;
				while (--arg3 >= 0)
					arg0[arg1++] = (arg2
							+ ((arg0[arg1] & 0xff00ff) * i >> 8 & 0xff00ff) + ((arg0[arg1] & 0xff00)
							* i >> 8 & 0xff00));
			}
		}
	}

	public static int method551(int arg0, int arg1) {
		arg1 = (127 - arg1) * (arg0 & 0x7f) >> 7;
		if (arg1 < 2)
			arg1 = 2;
		else if (arg1 > 126)
			arg1 = 126;
		return (arg0 & 0xff80) + arg1;
	}

	public static void method552(int[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, int arg12, int arg13, int arg14) {
		if (arg5 < arg6) {
			int i;
			int i_55_;
			if (aBoolean3522) {
				i_55_ = (arg8 - arg7) / (arg6 - arg5);
				if (arg6 > anInt3525)
					arg6 = anInt3525;
				if (arg5 < 0) {
					arg7 -= arg5 * i_55_;
					arg5 = 0;
				}
				if (arg5 >= arg6)
					return;
				i = arg6 - arg5 >> 3;
				i_55_ <<= 12;
				arg7 <<= 9;
			} else {
				if (arg6 - arg5 > 7) {
					i = arg6 - arg5 >> 3;
					i_55_ = (arg8 - arg7) * anIntArray3540[i] >> 6;
				} else {
					i = 0;
					i_55_ = 0;
				}
				arg7 <<= 9;
			}
			arg4 += arg5;
			if (aBoolean3541) {
				int i_56_ = 0;
				int i_57_ = 0;
				int i_58_ = arg5 - anInt3535;
				arg9 += (arg12 >> 3) * i_58_;
				arg10 += (arg13 >> 3) * i_58_;
				arg11 += (arg14 >> 3) * i_58_;
				int i_59_ = arg11 >> 12;
				if (i_59_ != 0) {
					arg2 = arg9 / i_59_;
					arg3 = arg10 / i_59_;
					if (arg2 < 0)
						arg2 = 0;
					else if (arg2 > 4032)
						arg2 = 4032;
				}
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				i_59_ = arg11 >> 12;
				if (i_59_ != 0) {
					i_56_ = arg9 / i_59_;
					i_57_ = arg10 / i_59_;
					if (i_56_ < 7)
						i_56_ = 7;
					else if (i_56_ > 4032)
						i_56_ = 4032;
				}
				int i_60_ = i_56_ - arg2 >> 3;
				int i_61_ = i_57_ - arg3 >> 3;
				arg2 += (arg7 & 0x600000) >> 3;
				int i_62_ = arg7 >> 23;
				if (aBoolean3527) {
					while (i-- > 0) {
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_;
						arg2 += i_60_;
						arg3 += i_61_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_;
						arg2 += i_60_;
						arg3 += i_61_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_;
						arg2 += i_60_;
						arg3 += i_61_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_;
						arg2 += i_60_;
						arg3 += i_61_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_;
						arg2 += i_60_;
						arg3 += i_61_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_;
						arg2 += i_60_;
						arg3 += i_61_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_;
						arg2 += i_60_;
						arg3 += i_61_;
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_;
						arg2 = i_56_;
						arg3 = i_57_;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						i_59_ = arg11 >> 12;
						if (i_59_ != 0) {
							i_56_ = arg9 / i_59_;
							i_57_ = arg10 / i_59_;
							if (i_56_ < 7)
								i_56_ = 7;
							else if (i_56_ > 4032)
								i_56_ = 4032;
						}
						i_60_ = i_56_ - arg2 >> 3;
						i_61_ = i_57_ - arg3 >> 3;
						arg7 += i_55_;
						arg2 += (arg7 & 0x600000) >> 3;
						i_62_ = arg7 >> 23;
					}
					i = arg6 - arg5 & 0x7;
					while (i-- > 0) {
						arg0[arg4++] = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_;
						arg2 += i_60_;
						arg3 += i_61_;
					}
				} else {
					while (i-- > 0) {
						int i_63_;
						if ((i_63_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_) != 0)
							arg0[arg4] = i_63_;
						arg4++;
						arg2 += i_60_;
						arg3 += i_61_;
						if ((i_63_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_) != 0)
							arg0[arg4] = i_63_;
						arg4++;
						arg2 += i_60_;
						arg3 += i_61_;
						if ((i_63_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_) != 0)
							arg0[arg4] = i_63_;
						arg4++;
						arg2 += i_60_;
						arg3 += i_61_;
						if ((i_63_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_) != 0)
							arg0[arg4] = i_63_;
						arg4++;
						arg2 += i_60_;
						arg3 += i_61_;
						if ((i_63_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_) != 0)
							arg0[arg4] = i_63_;
						arg4++;
						arg2 += i_60_;
						arg3 += i_61_;
						if ((i_63_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_) != 0)
							arg0[arg4] = i_63_;
						arg4++;
						arg2 += i_60_;
						arg3 += i_61_;
						if ((i_63_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_) != 0)
							arg0[arg4] = i_63_;
						arg4++;
						arg2 += i_60_;
						arg3 += i_61_;
						if ((i_63_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_) != 0)
							arg0[arg4] = i_63_;
						arg4++;
						arg2 = i_56_;
						arg3 = i_57_;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						i_59_ = arg11 >> 12;
						if (i_59_ != 0) {
							i_56_ = arg9 / i_59_;
							i_57_ = arg10 / i_59_;
							if (i_56_ < 7)
								i_56_ = 7;
							else if (i_56_ > 4032)
								i_56_ = 4032;
						}
						i_60_ = i_56_ - arg2 >> 3;
						i_61_ = i_57_ - arg3 >> 3;
						arg7 += i_55_;
						arg2 += (arg7 & 0x600000) >> 3;
						i_62_ = arg7 >> 23;
					}
					i = arg6 - arg5 & 0x7;
					while (i-- > 0) {
						int i_64_;
						if ((i_64_ = arg1[(arg3 & 0xfc0) + (arg2 >> 6)] >>> i_62_) != 0)
							arg0[arg4] = i_64_;
						arg4++;
						arg2 += i_60_;
						arg3 += i_61_;
					}
				}
			} else {
				int i_65_ = 0;
				int i_66_ = 0;
				int i_67_ = arg5 - anInt3535;
				arg9 += (arg12 >> 3) * i_67_;
				arg10 += (arg13 >> 3) * i_67_;
				arg11 += (arg14 >> 3) * i_67_;
				int i_68_ = arg11 >> 14;
				if (i_68_ != 0) {
					arg2 = arg9 / i_68_;
					arg3 = arg10 / i_68_;
					if (arg2 < 0)
						arg2 = 0;
					else if (arg2 > 16256)
						arg2 = 16256;
				}
				arg9 += arg12;
				arg10 += arg13;
				arg11 += arg14;
				i_68_ = arg11 >> 14;
				if (i_68_ != 0) {
					i_65_ = arg9 / i_68_;
					i_66_ = arg10 / i_68_;
					if (i_65_ < 7)
						i_65_ = 7;
					else if (i_65_ > 16256)
						i_65_ = 16256;
				}
				int i_69_ = i_65_ - arg2 >> 3;
				int i_70_ = i_66_ - arg3 >> 3;
				arg2 += arg7 & 0x600000;
				int i_71_ = arg7 >> 23;
				if (aBoolean3527) {
					while (i-- > 0) {
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_;
						arg2 += i_69_;
						arg3 += i_70_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_;
						arg2 += i_69_;
						arg3 += i_70_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_;
						arg2 += i_69_;
						arg3 += i_70_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_;
						arg2 += i_69_;
						arg3 += i_70_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_;
						arg2 += i_69_;
						arg3 += i_70_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_;
						arg2 += i_69_;
						arg3 += i_70_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_;
						arg2 += i_69_;
						arg3 += i_70_;
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_;
						arg2 = i_65_;
						arg3 = i_66_;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						i_68_ = arg11 >> 14;
						if (i_68_ != 0) {
							i_65_ = arg9 / i_68_;
							i_66_ = arg10 / i_68_;
							if (i_65_ < 7)
								i_65_ = 7;
							else if (i_65_ > 16256)
								i_65_ = 16256;
						}
						i_69_ = i_65_ - arg2 >> 3;
						i_70_ = i_66_ - arg3 >> 3;
						arg7 += i_55_;
						arg2 += arg7 & 0x600000;
						i_71_ = arg7 >> 23;
					}
					i = arg6 - arg5 & 0x7;
					while (i-- > 0) {
						arg0[arg4++] = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_;
						arg2 += i_69_;
						arg3 += i_70_;
					}
				} else {
					while (i-- > 0) {
						int i_72_;
						if ((i_72_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_) != 0)
							arg0[arg4] = i_72_;
						arg4++;
						arg2 += i_69_;
						arg3 += i_70_;
						if ((i_72_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_) != 0)
							arg0[arg4] = i_72_;
						arg4++;
						arg2 += i_69_;
						arg3 += i_70_;
						if ((i_72_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_) != 0)
							arg0[arg4] = i_72_;
						arg4++;
						arg2 += i_69_;
						arg3 += i_70_;
						if ((i_72_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_) != 0)
							arg0[arg4] = i_72_;
						arg4++;
						arg2 += i_69_;
						arg3 += i_70_;
						if ((i_72_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_) != 0)
							arg0[arg4] = i_72_;
						arg4++;
						arg2 += i_69_;
						arg3 += i_70_;
						if ((i_72_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_) != 0)
							arg0[arg4] = i_72_;
						arg4++;
						arg2 += i_69_;
						arg3 += i_70_;
						if ((i_72_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_) != 0)
							arg0[arg4] = i_72_;
						arg4++;
						arg2 += i_69_;
						arg3 += i_70_;
						if ((i_72_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_) != 0)
							arg0[arg4] = i_72_;
						arg4++;
						arg2 = i_65_;
						arg3 = i_66_;
						arg9 += arg12;
						arg10 += arg13;
						arg11 += arg14;
						i_68_ = arg11 >> 14;
						if (i_68_ != 0) {
							i_65_ = arg9 / i_68_;
							i_66_ = arg10 / i_68_;
							if (i_65_ < 7)
								i_65_ = 7;
							else if (i_65_ > 16256)
								i_65_ = 16256;
						}
						i_69_ = i_65_ - arg2 >> 3;
						i_70_ = i_66_ - arg3 >> 3;
						arg7 += i_55_;
						arg2 += arg7 & 0x600000;
						i_71_ = arg7 >> 23;
					}
					i = arg6 - arg5 & 0x7;
					while (i-- > 0) {
						int i_73_;
						if ((i_73_ = arg1[(arg3 & 0x3f80) + (arg2 >> 7)] >>> i_71_) != 0)
							arg0[arg4] = i_73_;
						arg4++;
						arg2 += i_69_;
						arg3 += i_70_;
					}
				}
			}
		}
	}

	public static void method553(double arg0) {
		method548(arg0, 0, 512);
	}

	public static void method554() {
		anInt3535 = anInt3525 / 2;
		anInt3532 = anInt3529 / 2;
		anInt3526 = -anInt3535;
		anInt3538 = anInt3525 - anInt3535;
		anInt3533 = -anInt3532;
		anInt3534 = anInt3529 - anInt3532;
	}
}
