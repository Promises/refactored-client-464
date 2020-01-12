package com.jagex.runescape.audio;

import com.jagex.runescape.Class19;
import com.jagex.runescape.Class4_Sub4_Sub1;
import com.jagex.runescape.io.Buffer;

public class Effect {

	public Instrument[] instruments;
	public int loop_begin;

	public int loop_end;


    public int delay() {
        int offset = 0x98967f;
        for (int k = 0; k < 10; k++) {
            if (instruments[k] != null
                    && instruments[k].begin / 20 < offset)
                offset = instruments[k].begin / 20;
        }
        if (loop_begin < loop_end && loop_begin / 20 < offset)
            offset = loop_begin / 20;
        if (offset == 0x98967f || offset == 0)
            return 0;
        for (int l = 0; l < 10; l++) {
            if (instruments[l] != null)
                instruments[l].begin -= offset * 20;
        }
        if (loop_begin < loop_end) {
            loop_begin -= offset * 20;
            loop_end -= offset * 20;
        }
        return offset;
    }

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
		loop_begin = arg0.read_u16();
		loop_end = arg0.read_u16();
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
		return new Class4_Sub4_Sub1(22050, is, 22050 * loop_begin / 1000,
				22050 * loop_end / 1000);
	}
}
