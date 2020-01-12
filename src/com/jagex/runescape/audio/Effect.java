package com.jagex.runescape.audio;

import com.jagex.runescape.Class19;
import com.jagex.runescape.Class4_Sub4_Sub1;
import com.jagex.runescape.io.Buffer;

public class Effect {

	public Instrument[] instruments;
	public int anInt756;

	public int anInt757;


	public static Effect method913(Class19 arg0, int arg1, int arg2) {
		byte[] is = arg0.method746(arg1, (byte) 102, arg2);
		if (is == null)
			return null;
		return new Effect(new Buffer(is));
	}

	public Effect() {
		instruments = new Instrument[10];
	}

	public Effect(Buffer arg0) {
		instruments = new Instrument[10];
		for (int i = 0; i < 10; i++) {
			int i_10_ = arg0.get();
			if (i_10_ != 0) {
				arg0.pointer--;
				instruments[i] = new Instrument();
				instruments[i].decode(arg0);
			}
		}
		anInt756 = arg0.read_u16((byte) -118);
		anInt757 = arg0.read_u16((byte) -116);
	}

	public int method914() {
		int i = 9999999;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			if (instruments[i_0_] != null
					&& instruments[i_0_].begin / 20 < i)
				i = instruments[i_0_].begin / 20;
		}
		if (anInt756 < anInt757 && anInt756 / 20 < i)
			i = anInt756 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_1_ = 0; i_1_ < 10; i_1_++) {
			if (instruments[i_1_] != null)
				instruments[i_1_].begin -= i * 20;
		}
		if (anInt756 < anInt757) {
			anInt756 -= i * 20;
			anInt757 -= i * 20;
		}
		return i;
	}

	public byte[] method915() {
		int i = 0;
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (instruments[i_2_] != null
					&& (instruments[i_2_].duration + instruments[i_2_].begin) > i)
				i = (instruments[i_2_].duration + instruments[i_2_].begin);
		}
		if (i == 0)
			return new byte[0];
		int i_3_ = 22050 * i / 1000;
		byte[] is = new byte[i_3_];
		for (int i_4_ = 0; i_4_ < 10; i_4_++) {
			if (instruments[i_4_] != null) {
				int i_5_ = instruments[i_4_].duration * 22050 / 1000;
				int i_6_ = instruments[i_4_].begin * 22050 / 1000;
				int[] is_7_ = instruments[i_4_].synthesize(i_5_,
						instruments[i_4_].duration);
				for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
					int i_9_ = is[i_8_ + i_6_] + (is_7_[i_8_] >> 8);
					if ((i_9_ + 128 & ~0xff) != 0)
						i_9_ = i_9_ >> 31 ^ 0x7f;
					is[i_8_ + i_6_] = (byte) i_9_;
				}
			}
		}
		return is;
	}

	public Class4_Sub4_Sub1 method916() {
		byte[] is = method915();
		return new Class4_Sub4_Sub1(22050, is, 22050 * anInt756 / 1000,
				22050 * anInt757 / 1000);
	}
}
