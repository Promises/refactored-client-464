package com.jagex.runescape;
import java.util.zip.CRC32;

public class Class4_Sub11_Sub1 extends StreamBuffer {
	public static Class19 aClass19_2691;
	public static JagexString aJagexString_2669;
	public static JagexString aJagexString_2676;
	public static JagexString aJagexString_2678;
	public static JagexString aJagexString_2679;
	public static JagexString aJagexString_2683;
	public static JagexString aJagexString_2692;
	public static JagexString aJagexString_2693;
	public static JagexString aJagexString_2694;
	public static JagexString[] aJagexStringArray2671;
	public static JagexString[] aJagexStringArray2673 = new JagexString[1000];
	public static CRC32 aCRC32_2688;
	public static int anInt2666;
	public static int anInt2667;
	public static int anInt2668;
	public static int anInt2670;
	public static int anInt2672;
	public static int anInt2674;
	public static int anInt2675;
	public static int anInt2677 = 1;
	public static int anInt2680;
	public static int anInt2681;
	public static int anInt2682;
	public static int anInt2684;
	public static int anInt2686;
	public static int anInt2687;
	public static int anInt2689;
	public static int anInt2690;
	public static int[] anIntArray2695;
	static {
		aJagexStringArray2671 = new JagexString[1000];
		aJagexString_2683 = JagexString.getRs2PreparedString("shake:");
		aJagexString_2669 = aJagexString_2683;
		aJagexString_2679 = (JagexString.getRs2PreparedString(
				"Die Adresse dieses Computers wurde gesperrt)1"));
		anInt2682 = 0;
		aJagexString_2676 = aJagexString_2683;
		aJagexString_2678 = JagexString.getRs2PreparedString(
				"-5berpr-Ufen Sie Ihr Mitteilungsfach)3");
		aJagexString_2692 = JagexString.getRs2PreparedString(
				"Gegenstand f-Ur Mitglieder");
		aCRC32_2688 = new CRC32();
		anIntArray2695 = new int[32768];
		aJagexString_2693 = JagexString.getRs2PreparedString(" <col=00ff80>");
		aJagexString_2694 = JagexString.getRs2PreparedString(
				"Fehler bei der Verbindung zum Server)3");
	}

	public static void method263(long arg0, int arg1) {
		try {
			anInt2690++;
			if ((arg0 ^ 0xffffffffffffffffL) != -1L) {
				if (((RSApplet.anInt23 ^ 0xffffffff) <= -101 && (RSFont.anInt162 ^ 0xffffffff) != -2)
						|| RSApplet.anInt23 >= 200)
					Class43.method955(Class27.aJagexString_624,
							Class4_Sub3.aJagexString_1895, (byte) 109, 0);
				else {
					if (arg1 != -314)
						aJagexString_2693 = null;
					JagexString jagexString = Class68.method1094(arg1 + 309, arg0)
							.method839(80);
					for (int i = 0; RSApplet.anInt23 > i; i++) {
						if ((arg0 ^ 0xffffffffffffffffL) == (Class64.aLongArray1279[i] ^ 0xffffffffffffffffL)) {
							Class43.method955(Class4_Sub24.method639(
									(new JagexString[] {jagexString,
											(Class25.aJagexString_581) }), -842),
									Class4_Sub3.aJagexString_1895, (byte) 113, 0);
							return;
						}
					}
					for (int i = 0; (JagexString.anInt1827 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						if (Class9.aLongArray284[i] == arg0) {
							Class43.method955(Class4_Sub24.method639(
									(new JagexString[] { (Class53.aJagexString_1078),
                                            jagexString,
											(Class4_Sub10.aJagexString_2046) }),
									arg1 + -528), Class4_Sub3.aJagexString_1895,
									(byte) 126, 0);
							return;
						}
					}
					if (jagexString
							.method802(
									arg1 + 315,
									(Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.aJagexString_3593)))
						Class43.method955(Class68.aJagexString_1383,
								Class4_Sub3.aJagexString_1895, (byte) 112, 0);
					else {
						Class4_Sub20_Sub5.aJagexStringArray2893[(RSApplet.anInt23)] = jagexString;
						Class19_Sub1.anInt2516++;
						Class64.aLongArray1279[RSApplet.anInt23] = arg0;
						Class50.anIntArray1005[RSApplet.anInt23] = 0;
						Class34.anIntArray1743[RSApplet.anInt23] = 0;
						RSApplet.anInt23++;
						Class4_Sub20_Sub1.anInt2718 = Class4_Sub20_Sub10.anInt3053;
						Class66.aClass4_Sub11_Sub1_1328.method264(197, -102);
						Class66.aClass4_Sub11_Sub1_1328.method255(189354448,
								arg0);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ib.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method267(int arg0, Class19 arg1, Class19 arg2,
			Class19 arg3, Class19 arg4) {
		do {
			try {
				Class4_Sub2_Sub4.aClass19_2648 = arg2;
				Class9.aClass19_275 = arg3;
				Class7.aClass19_234 = arg1;
				anInt2675++;
				Class58.aClass19_1165 = arg4;
				Class28.aClass4_Sub13ArrayArray632 = new RSInterface[Class9.aClass19_275
						.method759(108)][];
				Class72.aBooleanArray1487 = new boolean[Class9.aClass19_275
						.method759(38)];
				if (arg0 >= 12)
					break;
				aJagexString_2683 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						("ib.B(" + arg0 + ','
								+ (arg1 != null ? "{...}" : "null") + ','
								+ (arg2 != null ? "{...}" : "null") + ','
								+ (arg3 != null ? "{...}" : "null") + ','
								+ (arg4 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method268(int arg0) {
		try {
			anInt2687++;
			Class4_Sub3.aClass66_1882.method1084(arg0 ^ 0x6e9d);
			Class34.aClass66_1758.method1084(arg0 ^ arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ib.K("
					+ arg0 + ')');
		}
	}

	public static void method269(int arg0) {
		try {
			aJagexString_2694 = null;
			aCRC32_2688 = null;
			aJagexString_2679 = null;
			aClass19_2691 = null;
			anIntArray2695 = null;
			aJagexString_2676 = null;
			aJagexStringArray2673 = null;
			aJagexString_2692 = null;
			aJagexString_2669 = null;
			aJagexString_2693 = null;
			aJagexString_2683 = null;
			if (arg0 != 1)
				method275((byte) -68, 109);
			aJagexStringArray2671 = null;
			aJagexString_2678 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ib.G("
					+ arg0 + ')');
		}
	}

	public static int method270(StreamBuffer arg0, int arg1, JagexString arg2) {
		try {
			int i = arg0.pointion;
			arg0.method243(13952, arg2.anInt1805);
			arg0.pointion += Class10.aClass47_305.method979(arg0.byteBuffer,
					arg2.aByteArray1803, arg0.pointion, arg2.anInt1805, 0, arg1
							^ ~0x1d7d);
			if (arg1 != -7547)
				method275((byte) -38, 54);
			anInt2672++;
			return -i + arg0.pointion;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ib.L("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method272(int arg0) {
		anInt2680++;
		synchronized (Class12.anObject366) {
			if ((Class10.anInt307 ^ 0xffffffff) != -1) {
				Class10.anInt307 = 1;
				try {
					Class12.anObject366.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
		if (arg0 != -1432215741)
			method275((byte) -108, 86);
	}

	public static void method275(byte arg0, int arg1) {
		anInt2670++;
		if (arg1 != -1 || Class4_Sub20_Sub6.aBoolean2895) {
			if ((arg1 ^ 0xffffffff) != 0
					&& (arg1 ^ 0xffffffff) != (Region.anInt136 ^ 0xffffffff)
					&& (Class4_Sub20_Sub8.anInt3021 ^ 0xffffffff) != -1
					&& !Class4_Sub20_Sub6.aBoolean2895)
				Class77.method1192(0, false, Class54.aClass19_Sub1_1107, 2,
						Class4_Sub20_Sub8.anInt3021, arg1, 0);
		} else
			Class4_Sub20_Sub16.method606(25651);
		Region.anInt136 = arg1;
		if (arg0 <= 26)
			method263(-23L, 81);
	}

	public Class33 aClass33_2685;

	public int anInt2665;

	public Class4_Sub11_Sub1(int arg0) {
		super(arg0);
	}

	public int method262(byte arg0, int arg1) {
		try {
			anInt2667++;
			if (arg0 != 24)
				method271((byte) -101);
			return -anInt2665 + 8 * arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ib.E("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method264(int arg0, int arg1) {
		try {
			byteBuffer[pointion++] = (byte) (arg0 + aClass33_2685.method884(6));
			anInt2674++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ib.M("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public int method265(boolean arg0) {
		try {
			anInt2689++;
			if (arg0 != true)
				anInt2682 = 25;
			return 0xff & (byteBuffer[pointion++] + -aClass33_2685.method884(6));
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ib.F("
					+ arg0 + ')');
		}
	}

	public int method266(int arg0, int arg1) {
		try {
			anInt2681++;
			if (arg0 != -1432215741)
				method264(-109, 111);
			int i = anInt2665 >> -1432215741;
			int i_0_ = 0;
			int i_1_ = 8 - (anInt2665 & 0x7);
			anInt2665 += arg1;
			for (/**/; arg1 > i_1_; i_1_ = 8) {
				i_0_ += ((byteBuffer[i++] & RS2Font.anIntArray2777[i_1_]) << arg1
						+ -i_1_);
				arg1 -= i_1_;
			}
			if ((i_1_ ^ 0xffffffff) == (arg1 ^ 0xffffffff))
				i_0_ += (RS2Font.anIntArray2777[i_1_] & byteBuffer[i]);
			else
				i_0_ += (byteBuffer[i] >> i_1_ + -arg1 & RS2Font.anIntArray2777[arg1]);
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ib.N("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method271(byte arg0) {
		try {
			anInt2665 = 8 * pointion;
			if (arg0 >= -17)
				aJagexString_2679 = null;
			anInt2684++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ib.I("
					+ arg0 + ')');
		}
	}

	public void method273(int[] arg0, byte arg1) {
		try {
			anInt2668++;
			if (arg1 != -104)
				method263(113L, -7);
			aClass33_2685 = new Class33(arg0);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ib.H("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public void method274(byte arg0) {
		try {
			anInt2666++;
			pointion = (anInt2665 - -7) / 8;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ib.A("
					+ arg0 + ')');
		}
	}
}
