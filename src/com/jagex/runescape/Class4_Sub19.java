package com.jagex.runescape;

public class Class4_Sub19 extends RSFont {
	public static int[] anIntArray2346;

	public static void method312() {
		anIntArray2346 = null;
	}

	public boolean aBoolean2339 = false;
	public boolean aBoolean2343;
	public int anInt2337;
	public int anInt2341;
	public int anInt2342;
	public int[] anIntArray2338;
	public int[] anIntArray2340;
	public int[] anIntArray2344;
	public int[] anIntArray2345;

	public int[] anIntArray2347;

	public Class4_Sub19(StreamBuffer arg0) {
		anInt2337 = arg0.method209((byte) -117);
		aBoolean2343 = arg0.get() == 1;
		int i = arg0.get();
		if (i < 1 || i > 4)
			throw new RuntimeException();
		anIntArray2347 = new int[i];
		for (int i_30_ = 0; i_30_ < i; i_30_++)
			anIntArray2347[i_30_] = arg0.method209((byte) -101);
		if (i > 1) {
			anIntArray2338 = new int[i - 1];
			for (int i_31_ = 0; i_31_ < i - 1; i_31_++)
				anIntArray2338[i_31_] = arg0.get();
		}
		if (i > 1) {
			anIntArray2340 = new int[i - 1];
			for (int i_32_ = 0; i_32_ < i - 1; i_32_++)
				anIntArray2340[i_32_] = arg0.get();
		}
		anIntArray2345 = new int[i];
		for (int i_33_ = 0; i_33_ < i; i_33_++)
			anIntArray2345[i_33_] = arg0.method219((byte) 73);
		anInt2342 = arg0.get();
		anInt2341 = arg0.get();
		anIntArray2344 = null;
	}

	public boolean method313(double arg0, int arg1, Class19 arg2) {
		for (int i = 0; i < anIntArray2347.length; i++) {
			if (arg2.method749(true, anIntArray2347[i]) == null)
				return false;
		}
		int i = arg1 * arg1;
		anIntArray2344 = new int[i * 4];
		for (int i_0_ = 0; i_0_ < anIntArray2347.length; i_0_++) {
			Class4_Sub20_Sub12_Sub1 class4_sub20_sub12_sub1 = Class49
					.method990(arg2, anIntArray2347[i_0_], -1);
			class4_sub20_sub12_sub1.method509();
			byte[] is = class4_sub20_sub12_sub1.aByteArray3510;
			int[] is_1_ = class4_sub20_sub12_sub1.anIntArray3512;
			int i_2_ = anIntArray2345[i_0_];
			if ((i_2_ & ~0xffffff) == 50331648) {
				int i_3_ = i_2_ & 0xff00ff;
				int i_4_ = i_2_ >> 8 & 0xff;
				for (int i_5_ = 0; i_5_ < is_1_.length; i_5_++) {
					int i_6_ = is_1_[i_5_];
					if ((i_6_ & 0xffff) == i_6_ >> 8) {
						i_6_ &= 0xff;
						is_1_[i_5_] = (i_3_ * i_6_ >> 8 & 0xff00ff | i_4_
								* i_6_ & 0xff00);
					}
				}
			}
			for (int i_7_ = 0; i_7_ < is_1_.length; i_7_++)
				is_1_[i_7_] = Class4_Sub20_Sub12_Sub3.method538(is_1_[i_7_],
						arg0);
			int i_8_;
			if (i_0_ == 0)
				i_8_ = 0;
			else
				i_8_ = anIntArray2338[i_0_ - 1];
			if (i_8_ == 0) {
				if (class4_sub20_sub12_sub1.anInt3511 == arg1) {
					for (int i_9_ = 0; i_9_ < i; i_9_++)
						anIntArray2344[i_9_] = is_1_[is[i_9_] & 0xff];
				} else if (class4_sub20_sub12_sub1.anInt3511 == 64
						&& arg1 == 128) {
					int i_10_ = 0;
					for (int i_11_ = 0; i_11_ < arg1; i_11_++) {
						for (int i_12_ = 0; i_12_ < arg1; i_12_++)
							anIntArray2344[i_10_++] = is_1_[(is[(i_12_ >> 1)
									+ (i_11_ >> 1 << 6)] & 0xff)];
					}
				} else if (class4_sub20_sub12_sub1.anInt3511 == 128
						&& arg1 == 64) {
					int i_13_ = 0;
					for (int i_14_ = 0; i_14_ < arg1; i_14_++) {
						for (int i_15_ = 0; i_15_ < arg1; i_15_++)
							anIntArray2344[i_13_++] = is_1_[(is[(i_15_ << 1)
									+ (i_14_ << 1 << 7)] & 0xff)];
					}
				} else
					throw new RuntimeException();
			}
		}
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			anIntArray2344[i_16_] &= 0xf8f8ff;
			int i_17_ = anIntArray2344[i_16_];
			anIntArray2344[i_16_ + i] = i_17_ - (i_17_ >>> 3) & 0xf8f8ff;
			anIntArray2344[i_16_ + i + i] = i_17_ - (i_17_ >>> 2) & 0xf8f8ff;
			anIntArray2344[i_16_ + i + i + i] = i_17_ - (i_17_ >>> 2)
					- (i_17_ >>> 3) & 0xf8f8ff;
		}
		return true;
	}

	public void method314(int arg0) {
		if (anIntArray2344 != null) {
			if (anInt2342 == 1 || anInt2342 == 3) {
				if (anIntArray2346 == null
						|| anIntArray2346.length < anIntArray2344.length)
					anIntArray2346 = new int[anIntArray2344.length];
				int i;
				if (anIntArray2344.length == 16384)
					i = 64;
				else
					i = 128;
				int i_18_ = anIntArray2344.length / 4;
				int i_19_ = i * arg0 * anInt2341;
				int i_20_ = i_18_ - 1;
				if (anInt2342 == 1)
					i_19_ = -i_19_;
				for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
					int i_22_ = i_21_ + i_19_ & i_20_;
					anIntArray2346[i_21_] = anIntArray2344[i_22_];
					anIntArray2346[i_21_ + i_18_] = anIntArray2344[i_22_
							+ i_18_];
					anIntArray2346[i_21_ + i_18_ + i_18_] = anIntArray2344[i_22_
							+ i_18_ + i_18_];
					anIntArray2346[i_21_ + i_18_ + i_18_ + i_18_] = anIntArray2344[i_22_
							+ i_18_ + i_18_ + i_18_];
				}
				int[] is = anIntArray2344;
				anIntArray2344 = anIntArray2346;
				anIntArray2346 = is;
			}
			if (anInt2342 == 2 || anInt2342 == 4) {
				if (anIntArray2346 == null
						|| anIntArray2346.length < anIntArray2344.length)
					anIntArray2346 = new int[anIntArray2344.length];
				int i;
				if (anIntArray2344.length == 16384)
					i = 64;
				else
					i = 128;
				int i_23_ = anIntArray2344.length / 4;
				int i_24_ = arg0 * anInt2341;
				int i_25_ = i - 1;
				if (anInt2342 == 2)
					i_24_ = -i_24_;
				for (int i_26_ = 0; i_26_ < i_23_; i_26_ += i) {
					for (int i_27_ = 0; i_27_ < i; i_27_++) {
						int i_28_ = i_26_ + i_27_;
						int i_29_ = i_26_ + (i_27_ + i_24_ & i_25_);
						anIntArray2346[i_28_] = anIntArray2344[i_29_];
						anIntArray2346[i_28_ + i_23_] = anIntArray2344[i_29_
								+ i_23_];
						anIntArray2346[i_28_ + i_23_ + i_23_] = anIntArray2344[i_29_
								+ i_23_ + i_23_];
						anIntArray2346[i_28_ + i_23_ + i_23_ + i_23_] = anIntArray2344[i_29_
								+ i_23_ + i_23_ + i_23_];
					}
				}
				int[] is = anIntArray2344;
				anIntArray2344 = anIntArray2346;
				anIntArray2346 = is;
			}
		}
	}

	public void method315() {
		anIntArray2344 = null;
	}
}
