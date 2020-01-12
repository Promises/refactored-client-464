package com.jagex.runescape.audio;

import com.jagex.runescape.io.Buffer;

public class Filter {
	public static float aFloat1117;
	public static float[][] aFloatArrayArray1119 = new float[2][8];
	public static int inv_unity;
	public static int[][] coef = new int[2][8];

	public static float method1016(float arg0) {
		float f = 32.703197F * (float) Math.pow(2.0, arg0);
		return f * 3.1415927F / 11025.0F;
	}

	public static void method1019() {
		aFloatArrayArray1119 = null;
		coef = null;
	}

	public int[] num_pairs = new int[2];
	public int[] anIntArray1118 = new int[2];

	public int[][][] anIntArrayArrayArray1115 = new int[2][2][4];

	public int[][][] anIntArrayArrayArray1121 = new int[2][2][4];

	public int compute(int arg0, float arg1) {
		if (arg0 == 0) {
			float f = (anIntArray1118[0] + (anIntArray1118[1] - anIntArray1118[0])
					* arg1);
			f *= 0.0030517578F;
			aFloat1117 = (float) Math.pow(0.1, (f / 20.0F));
			inv_unity = (int) (aFloat1117 * 65536.0F);
		}
		if (num_pairs[arg0] == 0)
			return 0;
		float f = method1017(arg0, 0, arg1);
		aFloatArrayArray1119[arg0][0] = -2.0F * f
				* (float) Math.cos(method1015(arg0, 0, arg1));
		aFloatArrayArray1119[arg0][1] = f * f;
		for (int i = 1; i < num_pairs[arg0]; i++) {
			f = method1017(arg0, i, arg1);
			float f_0_ = (-2.0F * f * (float) Math
					.cos(method1015(arg0, i, arg1)));
			float f_1_ = f * f;
			aFloatArrayArray1119[arg0][i * 2 + 1] = aFloatArrayArray1119[arg0][i * 2 - 1]
					* f_1_;
			aFloatArrayArray1119[arg0][i * 2] = (aFloatArrayArray1119[arg0][i * 2 - 1]
					* f_0_ + aFloatArrayArray1119[arg0][i * 2 - 2] * f_1_);
			for (int i_2_ = i * 2 - 1; i_2_ >= 2; i_2_--)
				aFloatArrayArray1119[arg0][i_2_] += (aFloatArrayArray1119[arg0][i_2_ - 1]
						* f_0_ + aFloatArrayArray1119[arg0][i_2_ - 2] * f_1_);
			aFloatArrayArray1119[arg0][1] += aFloatArrayArray1119[arg0][0]
					* f_0_ + f_1_;
			aFloatArrayArray1119[arg0][0] += f_0_;
		}
		if (arg0 == 0) {
			for (int i = 0; i < num_pairs[0] * 2; i++)
				aFloatArrayArray1119[0][i] *= aFloat1117;
		}
		for (int i = 0; i < num_pairs[arg0] * 2; i++)
			coef[arg0][i] = (int) (aFloatArrayArray1119[arg0][i] * 65536.0F);
		return num_pairs[arg0] * 2;
	}

	public float method1015(int arg0, int arg1, float arg2) {
		float f = (anIntArrayArrayArray1121[arg0][0][arg1] + arg2
				* (anIntArrayArrayArray1121[arg0][1][arg1] - anIntArrayArrayArray1121[arg0][0][arg1]));
		f *= 1.2207031E-4F;
		return method1016(f);
	}

	public float method1017(int arg0, int arg1, float arg2) {
		float f = (anIntArrayArrayArray1115[arg0][0][arg1] + arg2
				* (anIntArrayArrayArray1115[arg0][1][arg1] - anIntArrayArrayArray1115[arg0][0][arg1]));
		f *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (-f / 20.0F));
	}

	public void method1018(Buffer arg0, Envelope arg1) {
		int i = arg0.get();
		num_pairs[0] = i >> 4;
		num_pairs[1] = i & 0xf;
		if (i != 0) {
			anIntArray1118[0] = arg0.read_u16((byte) -124);
			anIntArray1118[1] = arg0.read_u16((byte) -107);
			int i_3_ = arg0.get();
			for (int i_4_ = 0; i_4_ < 2; i_4_++) {
				for (int i_5_ = 0; i_5_ < num_pairs[i_4_]; i_5_++) {
					anIntArrayArrayArray1121[i_4_][0][i_5_] = arg0
							.read_u16((byte) -102);
					anIntArrayArrayArray1115[i_4_][0][i_5_] = arg0
							.read_u16((byte) -113);
				}
			}
			for (int i_6_ = 0; i_6_ < 2; i_6_++) {
				for (int i_7_ = 0; i_7_ < num_pairs[i_6_]; i_7_++) {
					if ((i_3_ & 1 << i_6_ * 4 << i_7_) != 0) {
						anIntArrayArrayArray1121[i_6_][1][i_7_] = arg0
								.read_u16((byte) -108);
						anIntArrayArrayArray1115[i_6_][1][i_7_] = arg0
								.read_u16((byte) -120);
					} else {
						anIntArrayArrayArray1121[i_6_][1][i_7_] = anIntArrayArrayArray1121[i_6_][0][i_7_];
						anIntArrayArrayArray1115[i_6_][1][i_7_] = anIntArrayArrayArray1115[i_6_][0][i_7_];
					}
				}
			}
			if (i_3_ != 0 || anIntArray1118[1] != anIntArray1118[0])
				arg1.method775(arg0);
		} else
			anIntArray1118[0] = anIntArray1118[1] = 0;
	}
}
