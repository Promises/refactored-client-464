package com.jagex.runescape;

public class Class17 {
	public int anInt455;
	public int anInt456;
	public int anInt457 = Class4_Sub9.method198(16);
	public int anInt458;
	public int anInt460 = Class4_Sub9.method198(24);
	public int anInt461 = Class4_Sub9.method198(24);
	public int[] anIntArray459;

	public Class17() {
		anInt458 = Class4_Sub9.method198(24) + 1;
		anInt456 = Class4_Sub9.method198(6) + 1;
		anInt455 = Class4_Sub9.method198(8);
		int[] is = new int[anInt456];
		for (int i = 0; i < anInt456; i++) {
			int i_15_ = 0;
			int i_16_ = Class4_Sub9.method198(3);
			boolean bool = Class4_Sub9.method201() != 0;
			if (bool)
				i_15_ = Class4_Sub9.method198(5);
			is[i] = i_15_ << 3 | i_16_;
		}
		anIntArray459 = new int[anInt456 * 8];
		for (int i = 0; i < anInt456 * 8; i++)
			anIntArray459[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class4_Sub9
					.method198(8) : -1);
	}

	public void method730(float[] arg0, int arg1, boolean arg2) {
		for (int i = 0; i < arg1; i++)
			arg0[i] = 0.0F;
		if (!arg2) {
			int i = Class4_Sub9.aClass60Array2006[anInt455].anInt1194;
			int i_0_ = anInt461 - anInt460;
			int i_1_ = i_0_ / anInt458;
			int[] is = new int[i_1_];
			for (int i_2_ = 0; i_2_ < 8; i_2_++) {
				int i_3_ = 0;
				while (i_3_ < i_1_) {
					if (i_2_ == 0) {
						int i_4_ = Class4_Sub9.aClass60Array2006[anInt455]
								.method1040();
						for (int i_5_ = i - 1; i_5_ >= 0; i_5_--) {
							if (i_3_ + i_5_ < i_1_)
								is[i_3_ + i_5_] = i_4_ % anInt456;
							i_4_ /= anInt456;
						}
					}
					for (int i_6_ = 0; i_6_ < i; i_6_++) {
						int i_7_ = is[i_3_];
						int i_8_ = anIntArray459[i_7_ * 8 + i_2_];
						if (i_8_ >= 0) {
							int i_9_ = anInt460 + i_3_ * anInt458;
							Class60 class60 = Class4_Sub9.aClass60Array2006[i_8_];
							if (anInt457 == 0) {
								int i_10_ = anInt458 / class60.anInt1194;
								for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
									float[] fs = class60.method1038();
									for (int i_12_ = 0; i_12_ < class60.anInt1194; i_12_++)
										arg0[i_9_ + i_11_ + i_12_ * i_10_] += fs[i_12_];
								}
							} else {
								int i_13_ = 0;
								while (i_13_ < anInt458) {
									float[] fs = class60.method1038();
									for (int i_14_ = 0; i_14_ < class60.anInt1194; i_14_++) {
										arg0[i_9_ + i_13_] += fs[i_14_];
										i_13_++;
									}
								}
							}
						}
						if (++i_3_ >= i_1_)
							break;
					}
				}
			}
		}
	}
}
