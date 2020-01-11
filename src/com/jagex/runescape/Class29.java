package com.jagex.runescape;

public class Class29 {
	public static byte[] aByteArray641 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0 };

	public static void method864() {
		aByteArray641 = null;
	}

	public StreamBuffer aClass4_Sub11_642;
	public long aLong644;
	public int anInt645;
	public int anInt646;
	public int[] anIntArray643;
	public int[] anIntArray647;
	public int[] anIntArray648;

	public int[] anIntArray649;

	public Class29() {
		aClass4_Sub11_642 = new StreamBuffer(null);
	}

	public Class29(byte[] arg0) {
		aClass4_Sub11_642 = new StreamBuffer(null);
		method857(arg0);
	}

	public void method856() {
		aClass4_Sub11_642.pointion = -1;
	}

	public void method857(byte[] arg0) {
		aClass4_Sub11_642.byteBuffer = arg0;
		aClass4_Sub11_642.pointion = 10;
		int i = aClass4_Sub11_642.method209((byte) -101);
		anInt645 = aClass4_Sub11_642.method209((byte) -101);
		anInt646 = 500000;
		anIntArray648 = new int[i];
		int i_0_ = 0;
		while (i_0_ < i) {
			int i_1_ = aClass4_Sub11_642.method219((byte) 73);
			int i_2_ = aClass4_Sub11_642.method219((byte) 73);
			if (i_1_ == 1297379947) {
				anIntArray648[i_0_] = aClass4_Sub11_642.pointion;
				i_0_++;
			}
			aClass4_Sub11_642.pointion += i_2_;
		}
		aLong644 = 0L;
		anIntArray649 = new int[i];
		for (int i_3_ = 0; i_3_ < i; i_3_++)
			anIntArray649[i_3_] = anIntArray648[i_3_];
		anIntArray647 = new int[i];
		anIntArray643 = new int[i];
	}

	public boolean method858() {
		int i = anIntArray649.length;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			if (anIntArray649[i_4_] >= 0)
				return false;
		}
		return true;
	}

	public long method859(int arg0) {
		return aLong644 + (long) arg0 * (long) anInt646;
	}

	public void method860(int arg0) {
		int i = aClass4_Sub11_642.method228(0);
		anIntArray647[arg0] += i;
	}

	public void method861(int arg0) {
		anIntArray649[arg0] = aClass4_Sub11_642.pointion;
	}

	public void method862(long arg0) {
		aLong644 = arg0;
		int i = anIntArray649.length;
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			anIntArray647[i_5_] = 0;
			anIntArray643[i_5_] = 0;
			aClass4_Sub11_642.pointion = anIntArray648[i_5_];
			method860(i_5_);
			anIntArray649[i_5_] = aClass4_Sub11_642.pointion;
		}
	}

	public int method863(int arg0) {
		int i = aClass4_Sub11_642.byteBuffer[aClass4_Sub11_642.pointion];
		if (i < 0) {
			i &= 0xff;
			anIntArray643[arg0] = i;
			aClass4_Sub11_642.pointion++;
		} else
			i = anIntArray643[arg0];
		if (i == 240 || i == 247) {
			int i_6_ = aClass4_Sub11_642.method228(0);
			if (i == 247 && i_6_ > 0) {
				int i_7_ = ((aClass4_Sub11_642.byteBuffer[aClass4_Sub11_642.pointion]) & 0xff);
				if (i_7_ >= 241 && i_7_ <= 243 || i_7_ == 246 || i_7_ == 248
						|| i_7_ >= 250 && i_7_ <= 252 || i_7_ == 254) {
					aClass4_Sub11_642.pointion++;
					anIntArray643[arg0] = i_7_;
					return method868(arg0, i_7_);
				}
			}
			aClass4_Sub11_642.pointion += i_6_;
			return 0;
		}
		return method868(arg0, i);
	}

	public boolean method865() {
		if (aClass4_Sub11_642.byteBuffer == null)
			return false;
		return true;
	}

	public int method866() {
		return anIntArray649.length;
	}

	public int method867() {
		int i = anIntArray649.length;
		int i_8_ = -1;
		int i_9_ = 2147483647;
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			if (anIntArray649[i_10_] >= 0 && anIntArray647[i_10_] < i_9_) {
				i_8_ = i_10_;
				i_9_ = anIntArray647[i_10_];
			}
		}
		return i_8_;
	}

	public int method868(int arg0, int arg1) {
		if (arg1 == 255) {
			int i = aClass4_Sub11_642.get();
			int i_11_ = aClass4_Sub11_642.method228(0);
			if (i == 47) {
				aClass4_Sub11_642.pointion += i_11_;
				return 1;
			}
			if (i == 81) {
				int i_12_ = aClass4_Sub11_642.method248(false);
				i_11_ -= 3;
				int i_13_ = anIntArray647[arg0];
				aLong644 += (long) i_13_ * (long) (anInt646 - i_12_);
				anInt646 = i_12_;
				aClass4_Sub11_642.pointion += i_11_;
				return 2;
			}
			aClass4_Sub11_642.pointion += i_11_;
			return 3;
		}
		byte i = aByteArray641[arg1 - 128];
		int i_14_ = arg1;
		if (i >= 1)
			i_14_ |= aClass4_Sub11_642.get() << 8;
		if (i >= 2)
			i_14_ |= aClass4_Sub11_642.get() << 16;
		return i_14_;
	}

	public void method869() {
		aClass4_Sub11_642.byteBuffer = null;
		anIntArray648 = null;
		anIntArray649 = null;
		anIntArray647 = null;
		anIntArray643 = null;
	}

	public int method870(int arg0) {
		int i = method863(arg0);
		return i;
	}

	public void method871(int arg0) {
		aClass4_Sub11_642.pointion = anIntArray649[arg0];
	}
}
