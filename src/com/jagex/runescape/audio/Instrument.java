package com.jagex.runescape.audio;
import com.jagex.runescape.Class21;
import com.jagex.runescape.net.StreamBuffer;

import java.util.Random;


// https://www.rune-server.ee/runescape-development/rs2-client/snippets/421977-sound-effects.html

public class Instrument {
	public static int[] noise = new int[32768];
	public static int[] output;
	public static int[] sine;
	public static int[] anIntArray1626;
	public static int[] anIntArray1628;
	public static int[] anIntArray1631;
	public static int[] anIntArray1632;
	public static int[] anIntArray1633;
	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++) {
			noise[i] = (random.nextInt() & 0x2) - 1;
		}
		sine = new int[32768];
		for (int i = 0; i < 32768; i++) {
			sine[i] = (int) (Math.sin(i / 5215.1903) * 16384.0);
		}
		output = new int[220500];
		anIntArray1626 = new int[5];
		anIntArray1631 = new int[5];
		anIntArray1628 = new int[5];
		anIntArray1632 = new int[5];
		anIntArray1633 = new int[5];
	}

	public static void method1198() {
		output = null;
		noise = null;
		sine = null;
		anIntArray1633 = null;
		anIntArray1631 = null;
		anIntArray1628 = null;
		anIntArray1632 = null;
		anIntArray1626 = null;
	}

	public Envelope filter_env;
	public Envelope aEnvelope_1613;
	public Envelope aEnvelope_1617;
	public Envelope aEnvelope_1618;
	public Envelope aEnvelope_1619;
	public Envelope aEnvelope_1620;
	public Envelope aEnvelope_1622;
	public Envelope aEnvelope_1625;
	public Envelope aEnvelope_1627;
	public Filter filter;
	public int anInt1610;
	public int anInt1612 = 0;
	public int anInt1614;
	public int anInt1624;
	public int[] anIntArray1609;

	public int[] anIntArray1623;

	public int[] anIntArray1629;

	public Instrument() {
		anIntArray1609 = new int[5];
		anInt1624 = 500;
		anIntArray1623 = new int[5];
		anIntArray1629 = new int[5];
		anInt1614 = 0;
		anInt1610 = 100;
	}

	public int evaluateWave(int phase, int amplitude, int table) {
		if (table == 1) {
			if ((phase & 0x7fff) < 16384) {
				return amplitude;
			}
			return -amplitude;
		}
		if (table == 2) {
			return sine[phase & 0x7fff] * amplitude >> 14;
		}
		if (table == 3) {
			return ((phase & 0x7fff) * amplitude >> 14) - amplitude;
		}
		if (table == 4) {
			return noise[phase / 2607 & 0x7fff] * amplitude;
		}
		return 0;
	}

	public void method1200(StreamBuffer arg0) {
		aEnvelope_1620 = new Envelope();
		aEnvelope_1620.method772(arg0);
		aEnvelope_1618 = new Envelope();
		aEnvelope_1618.method772(arg0);
		int i = arg0.get();
		if (i != 0) {
			arg0.pointion--;
			aEnvelope_1625 = new Envelope();
			aEnvelope_1625.method772(arg0);
			aEnvelope_1619 = new Envelope();
			aEnvelope_1619.method772(arg0);
		}
		i = arg0.get();
		if (i != 0) {
			arg0.pointion--;
			aEnvelope_1627 = new Envelope();
			aEnvelope_1627.method772(arg0);
			aEnvelope_1613 = new Envelope();
			aEnvelope_1613.method772(arg0);
		}
		i = arg0.get();
		if (i != 0) {
			arg0.pointion--;
			aEnvelope_1622 = new Envelope();
			aEnvelope_1622.method772(arg0);
			aEnvelope_1617 = new Envelope();
			aEnvelope_1617.method772(arg0);
		}
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			int i_1_ = arg0.getSmart();
			if (i_1_ == 0) {
				break;
			}
			anIntArray1609[i_0_] = i_1_;
			anIntArray1629[i_0_] = arg0.method260(-77);
			anIntArray1623[i_0_] = arg0.getSmart();
		}
		anInt1612 = arg0.getSmart();
		anInt1610 = arg0.getSmart();
		anInt1624 = arg0.method209((byte) -124);
		anInt1614 = arg0.method209((byte) -112);
		filter = new Filter();
		filter_env = new Envelope();
		filter.method1018(arg0, filter_env);
	}

	public int[] synthesize(int n_s, int arg1) { // synthesize
		Class21.method776(output, 0, n_s);
		if (arg1 < 10) {
			return output;
		}
		double d = n_s / (arg1 + 0.0);
		aEnvelope_1620.method774();
		aEnvelope_1618.method774();
		int i = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		if (aEnvelope_1625 != null) {
			aEnvelope_1625.method774();
			aEnvelope_1619.method774();
			i = (int) ((aEnvelope_1625.anInt533 - aEnvelope_1625.anInt532) * 32.768 / d);
			i_2_ = (int) (aEnvelope_1625.anInt532 * 32.768 / d);
		}
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		if (aEnvelope_1627 != null) {
			aEnvelope_1627.method774();
			aEnvelope_1613.method774();
			i_4_ = (int) ((aEnvelope_1627.anInt533 - aEnvelope_1627.anInt532) * 32.768 / d);
			i_5_ = (int) (aEnvelope_1627.anInt532 * 32.768 / d);
		}
		for (int i_7_ = 0; i_7_ < 5; i_7_++) {
			if (anIntArray1609[i_7_] != 0) {
				anIntArray1633[i_7_] = 0;
				anIntArray1631[i_7_] = (int) (anIntArray1623[i_7_] * d);
				anIntArray1628[i_7_] = (anIntArray1609[i_7_] << 14) / 100;
				anIntArray1632[i_7_] = (int) ((aEnvelope_1620.anInt533 - aEnvelope_1620.anInt532)
						* 32.768
						* Math.pow(1.0057929410678534, anIntArray1629[i_7_]) / d);
				anIntArray1626[i_7_] = (int) (aEnvelope_1620.anInt532 * 32.768 / d);
			}
		}
		for (int i_8_ = 0; i_8_ < n_s; i_8_++) {
			int i_9_ = aEnvelope_1620.step(n_s);
			int i_10_ = aEnvelope_1618.step(n_s);
			if (aEnvelope_1625 != null) {
				int i_11_ = aEnvelope_1625.step(n_s);
				int i_12_ = aEnvelope_1619.step(n_s);
				i_9_ += evaluateWave(i_3_, i_12_, aEnvelope_1625.anInt531) >> 1;
				i_3_ += (i_11_ * i >> 16) + i_2_;
			}
			if (aEnvelope_1627 != null) {
				int i_13_ = aEnvelope_1627.step(n_s);
				int i_14_ = aEnvelope_1613.step(n_s);
				i_10_ = i_10_
						* ((evaluateWave(i_6_, i_14_, aEnvelope_1627.anInt531) >> 1) + 32768) >> 15;
				i_6_ += (i_13_ * i_4_ >> 16) + i_5_;
			}
			for (int i_15_ = 0; i_15_ < 5; i_15_++) {
				if (anIntArray1609[i_15_] != 0) {
					int i_16_ = i_8_ + anIntArray1631[i_15_];
					if (i_16_ < n_s) {
						output[i_16_] += evaluateWave(
								anIntArray1633[i_15_], i_10_
										* anIntArray1628[i_15_] >> 15,
								aEnvelope_1620.anInt531);
						anIntArray1633[i_15_] += ((i_9_ * anIntArray1632[i_15_] >> 16) + anIntArray1626[i_15_]);
					}
				}
			}
		}
		if (aEnvelope_1622 != null) {
			aEnvelope_1622.method774();
			aEnvelope_1617.method774();
			int i_17_ = 0;
			boolean bool_18_ = true;
			for (int i_19_ = 0; i_19_ < n_s; i_19_++) {
				int i_20_ = aEnvelope_1622.step(n_s);
				int i_21_ = aEnvelope_1617.step(n_s);
				int i_22_;
				if (bool_18_) {
					i_22_ = aEnvelope_1622.anInt532
							+ (((aEnvelope_1622.anInt533 - aEnvelope_1622.anInt532) * i_20_) >> 8);
				} else {
					i_22_ = aEnvelope_1622.anInt532
							+ (((aEnvelope_1622.anInt533 - aEnvelope_1622.anInt532) * i_21_) >> 8);
				}
				i_17_ += 256;
				if (i_17_ >= i_22_) {
					i_17_ = 0;
					bool_18_ = !bool_18_;
				}
				if (bool_18_) {
					output[i_19_] = 0;
				}
			}
		}
		if (anInt1612 > 0 && anInt1610 > 0) {
			int i_23_ = (int) (anInt1612 * d);
			for (int i_24_ = i_23_; i_24_ < n_s; i_24_++) {
				output[i_24_] += output[i_24_ - i_23_]
						* anInt1610 / 100;
			}
		}
		if (filter.anIntArray1116[0] > 0
				|| filter.anIntArray1116[1] > 0) {
			filter_env.method774();
			int i_25_ = filter_env.step(n_s + 1);
			int M = filter.method1014(0, i_25_ / 65536.0F);
			int N = filter.method1014(1, i_25_ / 65536.0F);
			if (n_s >= M + N) {
				int n = 0;
				int delay = N;
				if (delay > n_s - M) {
					delay = n_s - M;
				}
				for (/**/; n < delay; n++) {
					int i_30_ = (int) (((long) output[n + M] * (long) Filter.anInt1120) >> 16);
					for (int i_31_ = 0; i_31_ < M; i_31_++) {
						i_30_ += (int) (((long) (output[n + M
								- 1 - i_31_]) * (long) (Filter.coef[0][i_31_])) >> 16);
					}
					for (int i_32_ = 0; i_32_ < n; i_32_++) {
						i_30_ -= (int) (((long) output[n - 1
								- i_32_] * (long) (Filter.coef[1][i_32_])) >> 16);
					}
					output[n] = i_30_;
					i_25_ = filter_env.step(n_s + 1);
				}
				delay = 128;
				for (;;) {
					if (delay > n_s - M) {
						delay = n_s - M;
					}
					for (/**/; n < delay; n++) {
						int i_33_ = (int) (((long) output[n + M] * (long) Filter.anInt1120) >> 16);
						for (int i_34_ = 0; i_34_ < M; i_34_++) {
							i_33_ += (int) (((long) (output[n
									+ M - 1 - i_34_]) * (long) (Filter.coef[0][i_34_])) >> 16);
						}
						for (int i_35_ = 0; i_35_ < N; i_35_++) {
							i_33_ -= (int) (((long) (output[n - 1
									- i_35_]) * (long) (Filter.coef[1][i_35_])) >> 16);
						}
						output[n] = i_33_;
						i_25_ = filter_env.step(n_s + 1);
					}
					if (n >= n_s - M) {
						break;
					}
					M = filter.method1014(0, i_25_ / 65536.0F);
					N = filter.method1014(1, i_25_ / 65536.0F);
					delay += 128;
				}
				for (/**/; n < n_s; n++) {
					int y = 0;
					for (int i_37_ = n + M - n_s; i_37_ < M; i_37_++) {
						y += (int) (((long) (output[n + M
								- 1 - i_37_]) * (long) (Filter.coef[0][i_37_])) >> 16);
					}
					for (int i_38_ = 0; i_38_ < N; i_38_++) {
						y -= (int) (((long) output[n - 1
								- i_38_] * (long) (Filter.coef[1][i_38_])) >> 16);
					}
					output[n] = y;
					i_25_ = filter_env.step(n_s + 1);
				}
			}
		}
		/* clamp */
		for (int i_39_ = 0; i_39_ < n_s; i_39_++) {
			if (output[i_39_] < -32768) {
				output[i_39_] = -32768;
			}
			if (output[i_39_] > 32767) {
				output[i_39_] = 32767;
			}
		}
		return output;
	}
}
