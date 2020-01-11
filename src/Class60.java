/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class60 {
	public static int method1041(int arg0, int arg1) {
		int i;
		for (i = (int) Math.pow(arg0, 1.0 / arg1) + 1; Class4_Sub20_Sub7_Sub1_Sub2
				.method396(i, (byte) -31, arg1) > arg0; i--) {
			/* empty */
		}
		return i;
	}

	public float[][] aFloatArrayArray1193;
	public int anInt1192;
	public int anInt1194;
	public int[] anIntArray1191;
	public int[] anIntArray1195;

	public int[] anIntArray1196;

	public Class60() {
		Class4_Sub9.method198(24);
		anInt1194 = Class4_Sub9.method198(16);
		anInt1192 = Class4_Sub9.method198(24);
		anIntArray1191 = new int[anInt1192];
		boolean bool = Class4_Sub9.method201() != 0;
		if (bool) {
			int i = 0;
			int i_18_ = Class4_Sub9.method198(5) + 1;
			while (i < anInt1192) {
				int i_19_ = Class4_Sub9.method198(Class68.method1096(anInt1192
						- i, -119));
				for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
					anIntArray1191[i++] = i_18_;
				i_18_++;
			}
		} else {
			boolean bool_21_ = Class4_Sub9.method201() != 0;
			for (int i = 0; i < anInt1192; i++) {
				if (bool_21_ && Class4_Sub9.method201() == 0)
					anIntArray1191[i] = 0;
				else
					anIntArray1191[i] = Class4_Sub9.method198(5) + 1;
			}
		}
		method1039();
		int i = Class4_Sub9.method198(4);
		if (i > 0) {
			float f = Class4_Sub9.method197(Class4_Sub9.method198(32));
			float f_22_ = Class4_Sub9.method197(Class4_Sub9.method198(32));
			int i_23_ = Class4_Sub9.method198(4) + 1;
			boolean bool_24_ = Class4_Sub9.method201() != 0;
			int i_25_;
			if (i == 1)
				i_25_ = method1041(anInt1192, anInt1194);
			else
				i_25_ = anInt1192 * anInt1194;
			anIntArray1195 = new int[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
				anIntArray1195[i_26_] = Class4_Sub9.method198(i_23_);
			aFloatArrayArray1193 = new float[anInt1192][anInt1194];
			if (i == 1) {
				for (int i_27_ = 0; i_27_ < anInt1192; i_27_++) {
					float f_28_ = 0.0F;
					int i_29_ = 1;
					for (int i_30_ = 0; i_30_ < anInt1194; i_30_++) {
						int i_31_ = i_27_ / i_29_ % i_25_;
						float f_32_ = (anIntArray1195[i_31_] * f_22_ + f + f_28_);
						aFloatArrayArray1193[i_27_][i_30_] = f_32_;
						if (bool_24_)
							f_28_ = f_32_;
						i_29_ *= i_25_;
					}
				}
			} else {
				for (int i_33_ = 0; i_33_ < anInt1192; i_33_++) {
					float f_34_ = 0.0F;
					int i_35_ = i_33_ * anInt1194;
					for (int i_36_ = 0; i_36_ < anInt1194; i_36_++) {
						float f_37_ = (anIntArray1195[i_35_] * f_22_ + f + f_34_);
						aFloatArrayArray1193[i_33_][i_36_] = f_37_;
						if (bool_24_)
							f_34_ = f_37_;
						i_35_++;
					}
				}
			}
		}
	}

	public float[] method1038() {
		return aFloatArrayArray1193[method1040()];
	}

	public void method1039() {
		int[] is = new int[anInt1192];
		int[] is_0_ = new int[33];
		for (int i = 0; i < anInt1192; i++) {
			int i_1_ = anIntArray1191[i];
			if (i_1_ != 0) {
				int i_2_ = 1 << 32 - i_1_;
				int i_3_ = is_0_[i_1_];
				is[i] = i_3_;
				int i_4_;
				if ((i_3_ & i_2_) != 0)
					i_4_ = is_0_[i_1_ - 1];
				else {
					i_4_ = i_3_ | i_2_;
					for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
						int i_6_ = is_0_[i_5_];
						if (i_6_ != i_3_)
							break;
						int i_7_ = 1 << 32 - i_5_;
						if ((i_6_ & i_7_) != 0) {
							is_0_[i_5_] = is_0_[i_5_ - 1];
							break;
						}
						is_0_[i_5_] = i_6_ | i_7_;
					}
				}
				is_0_[i_1_] = i_4_;
				for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
					int i_9_ = is_0_[i_8_];
					if (i_9_ == i_3_)
						is_0_[i_8_] = i_4_;
				}
			}
		}
		anIntArray1196 = new int[8];
		int i = 0;
		for (int i_10_ = 0; i_10_ < anInt1192; i_10_++) {
			int i_11_ = anIntArray1191[i_10_];
			if (i_11_ != 0) {
				int i_12_ = is[i_10_];
				int i_13_ = 0;
				for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
					int i_15_ = -2147483648 >>> i_14_;
					if ((i_12_ & i_15_) != 0) {
						if (anIntArray1196[i_13_] == 0)
							anIntArray1196[i_13_] = i;
						i_13_ = anIntArray1196[i_13_];
					} else
						i_13_++;
					if (i_13_ >= anIntArray1196.length) {
						int[] is_16_ = new int[anIntArray1196.length * 2];
						for (int i_17_ = 0; i_17_ < anIntArray1196.length; i_17_++)
							is_16_[i_17_] = anIntArray1196[i_17_];
						anIntArray1196 = is_16_;
					}
					i_15_ >>>= 1;
				}
				anIntArray1196[i_13_] = i_10_ ^ 0xffffffff;
				if (i_13_ >= i)
					i = i_13_ + 1;
			}
		}
	}

	public int method1040() {
		int i;
		for (i = 0; anIntArray1196[i] >= 0; i = Class4_Sub9.method201() != 0 ? anIntArray1196[i]
				: i + 1) {
			/* empty */
		}
		return anIntArray1196[i] ^ 0xffffffff;
	}
}
