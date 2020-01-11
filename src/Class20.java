/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class20 {
	public int anInt531;
	public int anInt532;
	public int anInt533;
	public int anInt534 = 2;
	public int anInt535;
	public int anInt536;
	public int anInt537;
	public int anInt538;
	public int anInt539;
	public int[] anIntArray529;
	public int[] anIntArray530;

	public Class20() {
		anIntArray529 = new int[2];
		anIntArray530 = new int[2];
		anIntArray529[0] = 0;
		anIntArray529[1] = 65535;
		anIntArray530[0] = 0;
		anIntArray530[1] = 65535;
	}

	public void method772(StreamBuffer arg0) {
		anInt531 = arg0.get();
		anInt532 = arg0.method219((byte) 73);
		anInt533 = arg0.method219((byte) 73);
		method775(arg0);
	}

	public int method773(int arg0) {
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

	public void method774() {
		anInt537 = 0;
		anInt538 = 0;
		anInt539 = 0;
		anInt536 = 0;
		anInt535 = 0;
	}

	public void method775(StreamBuffer arg0) {
		anInt534 = arg0.get();
		anIntArray529 = new int[anInt534];
		anIntArray530 = new int[anInt534];
		for (int i = 0; i < anInt534; i++) {
			anIntArray529[i] = arg0.method209((byte) -108);
			anIntArray530[i] = arg0.method209((byte) -109);
		}
	}
}
