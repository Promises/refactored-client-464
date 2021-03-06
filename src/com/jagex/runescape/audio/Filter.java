package com.jagex.runescape.audio;

import com.jagex.runescape.io.Buffer;

public class Filter {
	public static float _inv_unity;
	public static float[][] _coef = new float[2][8];
	public static int inv_unity;
	public static int[][] coef = new int[2][8];
	public int[] num_pairs = new int[2];
	public int[] unity = new int[2];
	public int[][][] pair_mag = new int[2][2][4];
	public int[][][] pair_phase = new int[2][2][4];

	public static float normalize(float F) {
		float _f = 32.703197F * (float) Math.pow(2.0, F);
		return _f * 3.1415927F / 11025.0F;
	}


	public float adapt_phase(int dir, int i, float t) {
		float f = (pair_phase[dir][0][i] + t
				* (pair_phase[dir][1][i] - pair_phase[dir][0][i]));
		f *= 1.2207031E-4F;
		return normalize(f);
	}

	public float adapt_mag(int dir, int k, float t) {
		float f = (pair_mag[dir][0][k] + t
				* (pair_mag[dir][1][k] - pair_mag[dir][0][k]));
		f *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (-f / 20.0F));
	}

	public static void method1019() {
		_coef = null;
		coef = null;
	}


	public int compute(int dir, float arg1) {
		if (dir == 0) {
			float _a0 = (unity[0] + (unity[1] - unity[0])
					* arg1);
			_a0 *= 0.0030517578F;
			_inv_unity = (float) Math.pow(0.1, (_a0 / 20.0F));
			inv_unity = (int) (_inv_unity * 65536.0F);
		}
		if (num_pairs[dir] == 0)
			return 0;
		float f = adapt_mag(dir, 0, arg1);
		_coef[dir][0] = -2.0F * f
				* (float) Math.cos(adapt_phase(dir, 0, arg1));
		_coef[dir][1] = f * f;
		for (int i = 1; i < num_pairs[dir]; i++) {
			f = adapt_mag(dir, i, arg1);
			float f_0_ = (-2.0F * f * (float) Math
					.cos(adapt_phase(dir, i, arg1)));
			float f_1_ = f * f;
			_coef[dir][i * 2 + 1] = _coef[dir][i * 2 - 1]
					* f_1_;
			_coef[dir][i * 2] = (_coef[dir][i * 2 - 1]
					* f_0_ + _coef[dir][i * 2 - 2] * f_1_);
			for (int i_2_ = i * 2 - 1; i_2_ >= 2; i_2_--)
				_coef[dir][i_2_] += (_coef[dir][i_2_ - 1]
						* f_0_ + _coef[dir][i_2_ - 2] * f_1_);
			_coef[dir][1] += _coef[dir][0]
					* f_0_ + f_1_;
			_coef[dir][0] += f_0_;
		}
		if (dir == 0) {
			for (int i = 0; i < num_pairs[0] * 2; i++)
				_coef[0][i] *= _inv_unity;
		}
		for (int i = 0; i < num_pairs[dir] * 2; i++)
			coef[dir][i] = (int) (_coef[dir][i] * 65536.0F);
		return num_pairs[dir] * 2;
	}


	public void decode(Buffer data, Envelope envelope) {
		int i = data.get();
		num_pairs[0] = i >> 4;
		num_pairs[1] = i & 0xf;
		if (i != 0) {
			unity[0] = data.readShort();
			unity[1] = data.readShort();
			int i_3_ = data.get();
			for (int i_4_ = 0; i_4_ < 2; i_4_++) {
				for (int i_5_ = 0; i_5_ < num_pairs[i_4_]; i_5_++) {
					pair_phase[i_4_][0][i_5_] = data
							.readShort();
					pair_mag[i_4_][0][i_5_] = data
							.readShort();
				}
			}
			for (int i_6_ = 0; i_6_ < 2; i_6_++) {
				for (int i_7_ = 0; i_7_ < num_pairs[i_6_]; i_7_++) {
					if ((i_3_ & 1 << i_6_ * 4 << i_7_) != 0) {
						pair_phase[i_6_][1][i_7_] = data
								.readShort();
						pair_mag[i_6_][1][i_7_] = data
								.readShort();
					} else {
						pair_phase[i_6_][1][i_7_] = pair_phase[i_6_][0][i_7_];
						pair_mag[i_6_][1][i_7_] = pair_mag[i_6_][0][i_7_];
					}
				}
			}
			if (i_3_ != 0 || unity[1] != unity[0])
				envelope.decode_shape(data);
		} else
			unity[0] = unity[1] = 0;
	}
}
