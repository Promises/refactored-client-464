package com.jagex.runescape.audio;

import com.jagex.runescape.io.Buffer;

public class Envelope {
	public int form;
	public int start;
	public int end;
	public int anInt534 = 2;
	public int anInt535;
	public int anInt536;
	public int anInt537;
	public int anInt538;
	public int anInt539;
	public int[] anIntArray529;
	public int[] anIntArray530;

	public Envelope() {
		anIntArray529 = new int[2];
		anIntArray530 = new int[2];
		anIntArray529[0] = 0;
		anIntArray529[1] = 65535;
		anIntArray530[0] = 0;
		anIntArray530[1] = 65535;
	}

	public void decode(Buffer arg0) {
		form = arg0.get();
		start = arg0.method219((byte) 73);
		end = arg0.method219((byte) 73);
		method775(arg0);
	}

	public int step(int arg0) {
		if (anInt535 >= anInt537) {
			anInt536 = anIntArray530[anInt538++] << 15;
			if (anInt538 >= anInt534)
				anInt538 = anInt534 - 1;
			anInt537 = (int) (anIntArray529[anInt538] / 65536.0 * arg0);
			if (anInt537 > anInt535)
				anInt539 = (((anIntArray530[anInt538] << 15) - anInt536) / (anInt537 - anInt535));
		}
		anInt536 += anInt539;
		anInt535++;
		return anInt536 - anInt539 >> 15;
	}

	public void reset() {
		anInt537 = 0;
		anInt538 = 0;
		anInt539 = 0;
		anInt536 = 0;
		anInt535 = 0;
	}

	public void method775(Buffer arg0) {
		anInt534 = arg0.get();
		anIntArray529 = new int[anInt534];
		anIntArray530 = new int[anInt534];
		for (int i = 0; i < anInt534; i++) {
			anIntArray529[i] = arg0.read_u16((byte) -108);
			anIntArray530[i] = arg0.read_u16((byte) -109);
		}
	}
}
