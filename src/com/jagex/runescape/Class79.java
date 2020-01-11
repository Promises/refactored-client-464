package com.jagex.runescape;
import java.util.Random;

public class Class79 {
	public static int[] anIntArray1615 = new int[32768];
	public static int[] anIntArray1616;
	public static int[] anIntArray1621;
	public static int[] anIntArray1626;
	public static int[] anIntArray1628;
	public static int[] anIntArray1631;
	public static int[] anIntArray1632;
	public static int[] anIntArray1633;
	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++)
			anIntArray1615[i] = (random.nextInt() & 0x2) - 1;
		anIntArray1621 = new int[32768];
		for (int i = 0; i < 32768; i++)
			anIntArray1621[i] = (int) (Math.sin(i / 5215.1903) * 16384.0);
		anIntArray1616 = new int[220500];
		anIntArray1626 = new int[5];
		anIntArray1631 = new int[5];
		anIntArray1628 = new int[5];
		anIntArray1632 = new int[5];
		anIntArray1633 = new int[5];
	}

	public static void method1198() {
		anIntArray1616 = null;
		anIntArray1615 = null;
		anIntArray1621 = null;
		anIntArray1633 = null;
		anIntArray1631 = null;
		anIntArray1628 = null;
		anIntArray1632 = null;
		anIntArray1626 = null;
	}

	public Class20 aClass20_1611;
	public Class20 aClass20_1613;
	public Class20 aClass20_1617;
	public Class20 aClass20_1618;
	public Class20 aClass20_1619;
	public Class20 aClass20_1620;
	public Class20 aClass20_1622;
	public Class20 aClass20_1625;
	public Class20 aClass20_1627;
	public Class56 aClass56_1630;
	public int anInt1610;
	public int anInt1612 = 0;
	public int anInt1614;
	public int anInt1624;
	public int[] anIntArray1609;

	public int[] anIntArray1623;

	public int[] anIntArray1629;

	public Class79() {
		anIntArray1609 = new int[5];
		anInt1624 = 500;
		anIntArray1623 = new int[5];
		anIntArray1629 = new int[5];
		anInt1614 = 0;
		anInt1610 = 100;
	}

	public int method1199(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg0 & 0x7fff) < 16384)
				return arg1;
			return -arg1;
		}
		if (arg2 == 2)
			return anIntArray1621[arg0 & 0x7fff] * arg1 >> 14;
		if (arg2 == 3)
			return ((arg0 & 0x7fff) * arg1 >> 14) - arg1;
		if (arg2 == 4)
			return anIntArray1615[arg0 / 2607 & 0x7fff] * arg1;
		return 0;
	}

	public void method1200(StreamBuffer arg0) {
		aClass20_1620 = new Class20();
		aClass20_1620.method772(arg0);
		aClass20_1618 = new Class20();
		aClass20_1618.method772(arg0);
		int i = arg0.get();
		if (i != 0) {
			arg0.pointion--;
			aClass20_1625 = new Class20();
			aClass20_1625.method772(arg0);
			aClass20_1619 = new Class20();
			aClass20_1619.method772(arg0);
		}
		i = arg0.get();
		if (i != 0) {
			arg0.pointion--;
			aClass20_1627 = new Class20();
			aClass20_1627.method772(arg0);
			aClass20_1613 = new Class20();
			aClass20_1613.method772(arg0);
		}
		i = arg0.get();
		if (i != 0) {
			arg0.pointion--;
			aClass20_1622 = new Class20();
			aClass20_1622.method772(arg0);
			aClass20_1617 = new Class20();
			aClass20_1617.method772(arg0);
		}
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			int i_1_ = arg0.getSmart();
			if (i_1_ == 0)
				break;
			anIntArray1609[i_0_] = i_1_;
			anIntArray1629[i_0_] = arg0.method260(-77);
			anIntArray1623[i_0_] = arg0.getSmart();
		}
		anInt1612 = arg0.getSmart();
		anInt1610 = arg0.getSmart();
		anInt1624 = arg0.method209((byte) -124);
		anInt1614 = arg0.method209((byte) -112);
		aClass56_1630 = new Class56();
		aClass20_1611 = new Class20();
		aClass56_1630.method1018(arg0, aClass20_1611);
	}

	public int[] method1201(int arg0, int arg1) {
		Class21.method776(anIntArray1616, 0, arg0);
		if (arg1 < 10)
			return anIntArray1616;
		double d = arg0 / (arg1 + 0.0);
		aClass20_1620.method774();
		aClass20_1618.method774();
		int i = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		if (aClass20_1625 != null) {
			aClass20_1625.method774();
			aClass20_1619.method774();
			i = (int) ((aClass20_1625.anInt533 - aClass20_1625.anInt532) * 32.768 / d);
			i_2_ = (int) (aClass20_1625.anInt532 * 32.768 / d);
		}
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		if (aClass20_1627 != null) {
			aClass20_1627.method774();
			aClass20_1613.method774();
			i_4_ = (int) ((aClass20_1627.anInt533 - aClass20_1627.anInt532) * 32.768 / d);
			i_5_ = (int) (aClass20_1627.anInt532 * 32.768 / d);
		}
		for (int i_7_ = 0; i_7_ < 5; i_7_++) {
			if (anIntArray1609[i_7_] != 0) {
				anIntArray1633[i_7_] = 0;
				anIntArray1631[i_7_] = (int) (anIntArray1623[i_7_] * d);
				anIntArray1628[i_7_] = (anIntArray1609[i_7_] << 14) / 100;
				anIntArray1632[i_7_] = (int) ((aClass20_1620.anInt533 - aClass20_1620.anInt532)
						* 32.768
						* Math.pow(1.0057929410678534, anIntArray1629[i_7_]) / d);
				anIntArray1626[i_7_] = (int) (aClass20_1620.anInt532 * 32.768 / d);
			}
		}
		for (int i_8_ = 0; i_8_ < arg0; i_8_++) {
			int i_9_ = aClass20_1620.method773(arg0);
			int i_10_ = aClass20_1618.method773(arg0);
			if (aClass20_1625 != null) {
				int i_11_ = aClass20_1625.method773(arg0);
				int i_12_ = aClass20_1619.method773(arg0);
				i_9_ += method1199(i_3_, i_12_, aClass20_1625.anInt531) >> 1;
				i_3_ += (i_11_ * i >> 16) + i_2_;
			}
			if (aClass20_1627 != null) {
				int i_13_ = aClass20_1627.method773(arg0);
				int i_14_ = aClass20_1613.method773(arg0);
				i_10_ = i_10_
						* ((method1199(i_6_, i_14_, aClass20_1627.anInt531) >> 1) + 32768) >> 15;
				i_6_ += (i_13_ * i_4_ >> 16) + i_5_;
			}
			for (int i_15_ = 0; i_15_ < 5; i_15_++) {
				if (anIntArray1609[i_15_] != 0) {
					int i_16_ = i_8_ + anIntArray1631[i_15_];
					if (i_16_ < arg0) {
						anIntArray1616[i_16_] += method1199(
								anIntArray1633[i_15_], i_10_
										* anIntArray1628[i_15_] >> 15,
								aClass20_1620.anInt531);
						anIntArray1633[i_15_] += ((i_9_ * anIntArray1632[i_15_] >> 16) + anIntArray1626[i_15_]);
					}
				}
			}
		}
		if (aClass20_1622 != null) {
			aClass20_1622.method774();
			aClass20_1617.method774();
			int i_17_ = 0;
			boolean bool_18_ = true;
			for (int i_19_ = 0; i_19_ < arg0; i_19_++) {
				int i_20_ = aClass20_1622.method773(arg0);
				int i_21_ = aClass20_1617.method773(arg0);
				int i_22_;
				if (bool_18_)
					i_22_ = aClass20_1622.anInt532
							+ (((aClass20_1622.anInt533 - aClass20_1622.anInt532) * i_20_) >> 8);
				else
					i_22_ = aClass20_1622.anInt532
							+ (((aClass20_1622.anInt533 - aClass20_1622.anInt532) * i_21_) >> 8);
				i_17_ += 256;
				if (i_17_ >= i_22_) {
					i_17_ = 0;
					bool_18_ = !bool_18_;
				}
				if (bool_18_)
					anIntArray1616[i_19_] = 0;
			}
		}
		if (anInt1612 > 0 && anInt1610 > 0) {
			int i_23_ = (int) (anInt1612 * d);
			for (int i_24_ = i_23_; i_24_ < arg0; i_24_++)
				anIntArray1616[i_24_] += anIntArray1616[i_24_ - i_23_]
						* anInt1610 / 100;
		}
		if (aClass56_1630.anIntArray1116[0] > 0
				|| aClass56_1630.anIntArray1116[1] > 0) {
			aClass20_1611.method774();
			int i_25_ = aClass20_1611.method773(arg0 + 1);
			int i_26_ = aClass56_1630.method1014(0, i_25_ / 65536.0F);
			int i_27_ = aClass56_1630.method1014(1, i_25_ / 65536.0F);
			if (arg0 >= i_26_ + i_27_) {
				int i_28_ = 0;
				int i_29_ = i_27_;
				if (i_29_ > arg0 - i_26_)
					i_29_ = arg0 - i_26_;
				for (/**/; i_28_ < i_29_; i_28_++) {
					int i_30_ = (int) (((long) anIntArray1616[i_28_ + i_26_] * (long) Class56.anInt1120) >> 16);
					for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
						i_30_ += (int) (((long) (anIntArray1616[i_28_ + i_26_
								- 1 - i_31_]) * (long) (Class56.anIntArrayArray1114[0][i_31_])) >> 16);
					for (int i_32_ = 0; i_32_ < i_28_; i_32_++)
						i_30_ -= (int) (((long) anIntArray1616[i_28_ - 1
								- i_32_] * (long) (Class56.anIntArrayArray1114[1][i_32_])) >> 16);
					anIntArray1616[i_28_] = i_30_;
					i_25_ = aClass20_1611.method773(arg0 + 1);
				}
				i_29_ = 128;
				for (;;) {
					if (i_29_ > arg0 - i_26_)
						i_29_ = arg0 - i_26_;
					for (/**/; i_28_ < i_29_; i_28_++) {
						int i_33_ = (int) (((long) anIntArray1616[i_28_ + i_26_] * (long) Class56.anInt1120) >> 16);
						for (int i_34_ = 0; i_34_ < i_26_; i_34_++)
							i_33_ += (int) (((long) (anIntArray1616[i_28_
									+ i_26_ - 1 - i_34_]) * (long) (Class56.anIntArrayArray1114[0][i_34_])) >> 16);
						for (int i_35_ = 0; i_35_ < i_27_; i_35_++)
							i_33_ -= (int) (((long) (anIntArray1616[i_28_ - 1
									- i_35_]) * (long) (Class56.anIntArrayArray1114[1][i_35_])) >> 16);
						anIntArray1616[i_28_] = i_33_;
						i_25_ = aClass20_1611.method773(arg0 + 1);
					}
					if (i_28_ >= arg0 - i_26_)
						break;
					i_26_ = aClass56_1630.method1014(0, i_25_ / 65536.0F);
					i_27_ = aClass56_1630.method1014(1, i_25_ / 65536.0F);
					i_29_ += 128;
				}
				for (/**/; i_28_ < arg0; i_28_++) {
					int i_36_ = 0;
					for (int i_37_ = i_28_ + i_26_ - arg0; i_37_ < i_26_; i_37_++)
						i_36_ += (int) (((long) (anIntArray1616[i_28_ + i_26_
								- 1 - i_37_]) * (long) (Class56.anIntArrayArray1114[0][i_37_])) >> 16);
					for (int i_38_ = 0; i_38_ < i_27_; i_38_++)
						i_36_ -= (int) (((long) anIntArray1616[i_28_ - 1
								- i_38_] * (long) (Class56.anIntArrayArray1114[1][i_38_])) >> 16);
					anIntArray1616[i_28_] = i_36_;
					i_25_ = aClass20_1611.method773(arg0 + 1);
				}
			}
		}
		for (int i_39_ = 0; i_39_ < arg0; i_39_++) {
			if (anIntArray1616[i_39_] < -32768)
				anIntArray1616[i_39_] = -32768;
			if (anIntArray1616[i_39_] > 32767)
				anIntArray1616[i_39_] = 32767;
		}
		return anIntArray1616;
	}
}
