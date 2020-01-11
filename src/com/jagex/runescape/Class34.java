package com.jagex.runescape;
import java.awt.event.KeyEvent;

public class Class34 implements Interface2 {
	public static boolean aBoolean1765;
	public static boolean aBoolean1770;
	public static JagexString aJagexString_1753;
	public static JagexString aJagexString_1759;
	public static JagexString aJagexString_1762;
	public static JagexString aJagexString_1764;
	public static JagexString aJagexString_1766;
	public static JagexString aJagexString_1767;
	public static JagexString aJagexString_1768;
	public static JagexString aJagexString_1769;
	public static JagexString aJagexString_1771;
	public static Class4_Sub20_Sub12_Sub2 aClass4_Sub20_Sub12_Sub2_1760;
	public static Class66 aClass66_1758;
	public static int anInt1736;
	public static int anInt1737;
	public static int anInt1739;
	public static int anInt1740;
	public static int anInt1741;
	public static int anInt1742;
	public static int anInt1745;
	public static int anInt1746;
	public static int anInt1749;
	public static int anInt1755;
	public static int anInt1756;
	public static int anInt1757;
	public static int anInt1761;
	public static int[] anIntArray1743 = new int[200];
	public static int[] anIntArray1751 = new int[99];
	public static int[] anIntArray1763;
	static {
		int i = 0;
		for (int i_2_ = 0; i_2_ < 99; i_2_++) {
			int i_3_ = i_2_ + 1;
			int i_4_ = (int) (300.0 * Math.pow(2.0, i_3_ / 7.0) + i_3_);
			i += i_4_;
			anIntArray1751[i_2_] = i / 4;
		}
		aJagexString_1753 = JagexString.getRs2PreparedString(
				"Bitte versuchen Sie es erneut)3");
		aClass66_1758 = new Class66(100);
		aJagexString_1759 = JagexString.getRs2PreparedString(")3runescape)3com");
		anInt1761 = 0;
		aBoolean1765 = false;
		anIntArray1763 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		aBoolean1770 = true;
		aJagexString_1767 = JagexString.getRs2PreparedString("");
		aJagexString_1762 = aJagexString_1767;
		aJagexString_1771 = aJagexString_1767;
		aJagexString_1766 = aJagexString_1767;
		aJagexString_1769 = aJagexString_1767;
		aJagexString_1764 = aJagexString_1767;
		aJagexString_1768 = aJagexString_1767;
	}

	public static int method892(KeyEvent arg0, int arg1) {
		try {
			anInt1736++;
			int i = arg0.getKeyChar();
			if (arg1 < 6)
				method897(59);
			if (i == 8364)
				return 128;
			if ((i ^ 0xffffffff) >= -1 || (i ^ 0xffffffff) <= -257)
				i = -1;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jd.K("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static void method894(Class19 arg0, int arg1) {
		try {
			anInt1746++;
			RSFont.aClass19_158 = arg0;
			Class82.anInt1715 = RSFont.aClass19_158.method741(16, true);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jd.L("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public static int method895(boolean arg0, JagexString arg1) {
		try {
			anInt1742++;
			if (Class19_Sub1.anInt2536 == 1)
				return 7;
			if (arg1.method808(RS2Font.aJagexString_2764, (byte) -95))
				return 1;
			if (arg1.method808(Class4_Sub20_Sub4.aJagexString_2855, (byte) -95))
				return 1;
			if (arg1.method808(Class78.aJagexString_1605, (byte) -95))
				return 2;
			if (arg1.method808(Class10.aJagexString_309, (byte) -95))
				return 2;
			if (arg1.method808(Class46.aJagexString_930, (byte) -95))
				return 3;
			if (arg1.method808(Class4_Sub20_Sub7_Sub1_Sub2.aJagexString_3620,
					(byte) -95))
				return 4;
			if (arg0 != false)
				return 44;
			if (arg1.method808(Class13_Sub2.aJagexString_2469, (byte) -95))
				return 4;
			if (arg1.method808(Class4_Sub6.aJagexString_1917, (byte) -95))
				return 5;
			if (arg1.method808(Class57.aJagexString_1126, (byte) -95))
				return 6;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jd.E("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static JagexString method896(boolean arg0, int arg1, int arg2) {
		try {
			anInt1740++;
			if (arg2 <= 70)
				aJagexString_1764 = null;
			return Class76.method1185(10, -106, arg0, arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jd.J("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method897(int arg0) {
		try {
			anIntArray1763 = null;
			aJagexString_1768 = null;
			aJagexString_1766 = null;
			aClass66_1758 = null;
			aJagexString_1759 = null;
			aClass4_Sub20_Sub12_Sub2_1760 = null;
			anIntArray1751 = null;
			aJagexString_1769 = null;
			aJagexString_1771 = null;
			aJagexString_1753 = null;
			aJagexString_1767 = null;
			if (arg0 != 16)
				method896(true, -70, 37);
			aJagexString_1764 = null;
			aJagexString_1762 = null;
			anIntArray1743 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "jd.F("
					+ arg0 + ')');
		}
	}

	public Class19 aClass19_1748;

	public Class4_Sub19[] aClass4_Sub19Array1738;

	public Class65 aClass65_1744 = new Class65();

	public double aDouble1750;

	public int anInt1747;

	public int anInt1752 = 0;

	public int anInt1754;

	public Class34(Class19 arg0, Class19 arg1, int arg2, double arg3, int arg4) {
		aDouble1750 = 1.0;
		anInt1747 = 128;
		try {
			aClass19_1748 = arg1;
			aDouble1750 = arg3;
			anInt1747 = arg4;
			anInt1754 = arg2;
			anInt1752 = anInt1754;
			int[] is = arg0.method751(92, 0);
			int i = is.length;
			aClass4_Sub19Array1738 = new Class4_Sub19[arg0.method741(0, true)];
			for (int i_1_ = 0; i > i_1_; i_1_++) {
				StreamBuffer class4_sub11 = new StreamBuffer(arg0.method746(0,
						(byte) 90, is[i_1_]));
				aClass4_Sub19Array1738[is[i_1_]] = new Class4_Sub19(
						class4_sub11);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("jd.<init>(" + (arg0 != null ? "{...}" : "null") + ','
							+ (arg1 != null ? "{...}" : "null") + ',' + arg2
							+ ',' + arg3 + ',' + arg4 + ')'));
		}
	}

	@Override
	public boolean method10(byte arg0, int arg1) {
		try {
			anInt1741++;
			return aClass4_Sub19Array1738[arg1].aBoolean2343;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jd.D("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	@Override
	public boolean method7(int arg0, int arg1) {
		try {
			if (arg0 != 27513)
				aBoolean1770 = false;
			anInt1755++;
			if ((anInt1747 ^ 0xffffffff) != -65)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jd.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	@Override
	public int method8(int arg0, int arg1) {
		try {
			anInt1749++;
			if (arg0 <= 76)
				return -85;
			if (aClass4_Sub19Array1738[arg1] == null)
				return 0;
			return aClass4_Sub19Array1738[arg1].anInt2337;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jd.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method890(int arg0) {
		try {
			anInt1739++;
			for (int i = arg0; aClass4_Sub19Array1738.length > i; i++) {
				if (aClass4_Sub19Array1738[i] != null)
					aClass4_Sub19Array1738[i].method315();
			}
			aClass65_1744 = new Class65();
			anInt1752 = anInt1754;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "jd.G("
					+ arg0 + ')');
		}
	}

	public void method891(int arg0, double arg1) {
		try {
			anInt1745++;
			aDouble1750 = arg1;
			method890(arg0 ^ arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jd.H("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method893(int arg0, byte arg1) {
		try {
			anInt1756++;
			for (int i = 0; (i ^ 0xffffffff) > (aClass4_Sub19Array1738.length ^ 0xffffffff); i++) {
				Class4_Sub19 class4_sub19 = aClass4_Sub19Array1738[i];
				if (class4_sub19 != null
						&& (class4_sub19.anInt2342 ^ 0xffffffff) != -1
						&& class4_sub19.aBoolean2339) {
					class4_sub19.method314(arg0);
					class4_sub19.aBoolean2339 = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jd.I("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	@Override
	public int[] method9(int arg0, int arg1) {
		try {
			anInt1737++;
			Class4_Sub19 class4_sub19 = aClass4_Sub19Array1738[arg1];
			if (class4_sub19 != null) {
				if (class4_sub19.anIntArray2344 != null) {
					aClass65_1744.method1077(false, class4_sub19);
					class4_sub19.aBoolean2339 = true;
					return class4_sub19.anIntArray2344;
				}
				boolean bool = class4_sub19.method313(aDouble1750, anInt1747,
						aClass19_1748);
				if (bool) {
					if ((anInt1752 ^ 0xffffffff) != -1)
						anInt1752--;
					else {
						Class4_Sub19 class4_sub19_0_ = (Class4_Sub19) aClass65_1744
								.method1069(2);
						class4_sub19_0_.method315();
					}
					aClass65_1744.method1077(false, class4_sub19);
					class4_sub19.aBoolean2339 = true;
					return class4_sub19.anIntArray2344;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("jd.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
