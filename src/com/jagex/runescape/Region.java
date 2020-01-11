package com.jagex.runescape;

import com.jagex.runescape.net.StreamBuffer;

public class Region {
	public static boolean aBoolean126;
	public static boolean aBoolean129;
	public static Class1 aClass1_103;
	public static JagexString aJagexString_114 = JagexString.getRs2PreparedString(
			"Could not complete login)3");
	public static JagexString aJagexString_120 = aJagexString_114;
	public static JagexString aJagexString_122 = (JagexString
			.getRs2PreparedString(
					"Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q"
            ));
	public static JagexString aJagexString_137;
	public static Class4_Sub20_Sub12_Sub1 aClass4_Sub20_Sub12_Sub1_132;
	public static Class42 aClass42_130;
	public static Class66 aClass66_131;
	public static int anInt100;
	public static int anInt102;
	public static int anInt104;
	public static int anInt105;
	public static int anInt106;
	public static int anInt107;
	public static int anInt108;
	public static int anInt110;
	public static int anInt111;
	public static int anInt112;
	public static int anInt115;
	public static int anInt116;
	public static int anInt117;
	public static int anInt118;
	public static int anInt119;
	public static int anInt123;
	public static int anInt124;
	public static int anInt127;
	public static int anInt133;
	public static int anInt134;
	public static int anInt135;
	public static int anInt136;
	public static int anInt97;
	public static int anInt98;
	public static int anInt99;
	static {
		aClass1_103 = new Class1();
		GameShell.mouseY = -1;
		aBoolean129 = false;
		anInt127 = -1;
		aClass66_131 = new Class66(50);
		anInt134 = 0;
		anInt135 = 10;
		anInt136 = -1;
		aJagexString_137 = (JagexString.getRs2PreparedString(
				"Unerwartete Antwort vom Anmelde)2Server)3"));
	}

	public static void method50(int arg0, int arg1) {
		try {
			anInt123++;
			if (Class54.anInt1109 != arg0) {
				if (Class54.anInt1109 == 0)
					Class24.method792((byte) -6);
				if ((arg0 ^ 0xffffffff) == -21 || arg0 == 40) {
					Class4_Sub20_Sub7_Sub5.anInt3419 = 0;
					Class59.anInt1186 = 0;
					RSFont.anInt148 = 0;
				}
				if ((arg0 ^ 0xffffffff) != -21 && arg0 != 40
						&& Class4_Sub20_Sub3.aClass76_2798 != null) {
					Class4_Sub20_Sub3.aClass76_2798.method1181(-31709);
					Class4_Sub20_Sub3.aClass76_2798 = null;
				}
				if ((Class54.anInt1109 ^ 0xffffffff) == -26) {
					Class77.anInt1591 = 0;
					Class4_Sub23.anInt2415 = 0;
					Class4_Sub20.anInt2353 = 0;
					Class4_Sub11_Sub1.anInt2677 = 1;
					Class48.anInt976 = 1;
				}
				if ((arg0 ^ 0xffffffff) == -6 || arg0 == 10
						|| (arg0 ^ 0xffffffff) == -21)
					JagexException.method1219(Game.aClass19_Sub1_1849,
							Class77.aClass19_Sub1_1589, (byte) 99,
							Class4_Sub20_Sub7_Sub5.runeCanvas);
				else
					Class4_Sub22.method628((byte) 56);
				if (arg1 != 1)
					aBoolean126 = true;
				Class54.anInt1109 = arg0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ac.B("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method51(int arg0) {
		try {
			Class4_Sub20_Sub13.aClass14_3126.method699(arg0);
			anInt133++;
			for (int i = 0; i < 32; i++)
				Class32.aLongArray699[i] = 0L;
			for (int i = 0; i < 32; i++)
				Class43.aLongArray881[i] = 0L;
			Class4_Sub10.anInt2024 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ac.Q("
					+ arg0 + ')');
		}
	}

	public static void method53(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, byte arg8) {
		anInt110++;
		if (!Class4_Sub12.method277((byte) 112, arg7)) {
			if ((arg3 ^ 0xffffffff) == 0) {
				for (int i = 0; (i ^ 0xffffffff) > -101; i++)
					Class4_Sub20_Sub11.aBooleanArray3083[i] = true;
			} else
				Class4_Sub20_Sub11.aBooleanArray3083[arg3] = true;
		} else {
			Class4_Sub20_Sub7_Sub4.aClass4_Sub13Array3377 = null;
			if (arg8 < 35)
				aClass4_Sub20_Sub12_Sub1_132 = null;
			Class9.method661(Class28.aClass4_Sub13ArrayArray632[arg7], arg0,
					arg4, arg2, arg1, arg3, arg6, -1, arg5, -107);
			if (Class4_Sub20_Sub7_Sub4.aClass4_Sub13Array3377 != null) {
				Class9.method661(Class4_Sub20_Sub7_Sub4.aClass4_Sub13Array3377,
						arg0, Class4_Sub10.anInt2027, arg2, Class1.anInt62,
						arg3, arg6, -1412584499, arg5, -107);
				Class4_Sub20_Sub7_Sub4.aClass4_Sub13Array3377 = null;
			}
		}
	}

	public static void method54(byte arg0, int arg1, int arg2, RSInterface arg3) {
		try {
			anInt106++;
			if (Class4_Sub20_Sub16.aClass4_Sub13_3179 == null
					&& !Class4_Sub20_Sub16.aBoolean3169
					&& (arg3 != null && Class71.method1156(-20274, arg3) != null)) {
				Class4_Sub20_Sub16.aClass4_Sub13_3179 = arg3;
				Class58.aClass4_Sub13_1159 = Class71.method1156(arg0 + -20359,
						arg3);
				Class74.anInt1513 = arg2;
				if (arg0 != 85)
					method54((byte) -122, 32, 94, null);
				Class4_Sub20_Sub7.anInt2947 = 0;
				Class4_Sub6.aBoolean1922 = false;
				Class72.anInt1494 = arg1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ac.A("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static Class4_Sub20_Sub1 method56(boolean arg0, int arg1) {
		try {
			anInt108++;
			Class4_Sub20_Sub1 class4_sub20_sub1 = ((Class4_Sub20_Sub1) Class57.aClass66_1131
					.method1083(arg1, arg0));
			if (class4_sub20_sub1 != null)
				return class4_sub20_sub1;
			byte[] is = Class4_Sub6.aClass19_1930
					.method746(6, (byte) 118, arg1);
			class4_sub20_sub1 = new Class4_Sub20_Sub1();
			class4_sub20_sub1.anInt2700 = arg1;
			if (is != null)
				class4_sub20_sub1.method333(-1, new StreamBuffer(is));
			class4_sub20_sub1.method332(61);
			if (class4_sub20_sub1.aBoolean2754) {
				class4_sub20_sub1.aBoolean2698 = false;
				class4_sub20_sub1.anInt2741 = 0;
			}
			Class57.aClass66_1131.method1082(arg0, arg1, class4_sub20_sub1);
			return class4_sub20_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ac.O("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method58(byte arg0, Class4_Sub20_Sub12_Sub1 arg1) {
		for (int i = 0; (Class65.anIntArray1284.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			Class65.anIntArray1284[i] = 0;
		int i_1_ = 256;
		for (int i_2_ = 0; i_2_ < 5000; i_2_++) {
			int i_3_ = (int) (128.0 * Math.random() * i_1_);
			Class65.anIntArray1284[i_3_] = (int) (Math.random() * 256.0);
		}
		for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -21; i_4_++) {
			for (int i_5_ = 1; i_5_ < -1 + i_1_; i_5_++) {
				for (int i_6_ = 1; i_6_ < 127; i_6_++) {
					int i_7_ = (i_5_ << 9152327) + i_6_;
					Class52.anIntArray1059[i_7_] = (Class65.anIntArray1284[128 + i_7_] + (Class65.anIntArray1284[i_7_
							+ -1] - (-Class65.anIntArray1284[1 + i_7_] + -Class65.anIntArray1284[-128
							+ i_7_]))) / 4;
				}
			}
			int[] is = Class65.anIntArray1284;
			Class65.anIntArray1284 = Class52.anIntArray1059;
			Class52.anIntArray1059 = is;
		}
		anInt104++;
		if (arg1 != null) {
			int i_8_ = 0;
			for (int i_9_ = 0; i_9_ < arg1.anInt3514; i_9_++) {
				for (int i_10_ = 0; arg1.anInt3511 > i_10_; i_10_++) {
					if (arg1.aByteArray3510[i_8_++] != 0) {
						int i_11_ = 16 + i_10_ + arg1.anInt3508;
						int i_12_ = arg1.anInt3513 + (i_9_ + 16);
						int i_13_ = i_11_ + (i_12_ << 858410759);
						Class65.anIntArray1284[i_13_] = 0;
					}
				}
			}
		}
	}

	public static void method65(int arg0, int arg1) {
		anInt115++;
		Class4_Sub20_Sub7.method374();
		Class4_Sub20_Sub13.method592(false);
		if (arg1 != 2)
			aBoolean129 = false;
		int i = Class4_Sub10.method203(arg1 ^ 0x6a, arg0).anInt3151;
		if ((i ^ 0xffffffff) != -1) {
			int i_19_ = Class31.anIntArray687[arg0];
			if (i == 1) {
				if ((i_19_ ^ 0xffffffff) == -2) {
					Class4_Sub20_Sub12_Sub3.method553(0.9);
					((Class34) Class4_Sub20_Sub12_Sub3.anInterface2_3530)
							.method891(0, 0.9);
				}
				if (i_19_ == 2) {
					Class4_Sub20_Sub12_Sub3.method553(0.8);
					((Class34) Class4_Sub20_Sub12_Sub3.anInterface2_3530)
							.method891(0, 0.8);
				}
				if ((i_19_ ^ 0xffffffff) == -4) {
					Class4_Sub20_Sub12_Sub3.method553(0.7);
					((Class34) Class4_Sub20_Sub12_Sub3.anInterface2_3530)
							.method891(arg1 + -2, 0.7);
				}
				if ((i_19_ ^ 0xffffffff) == -5) {
					Class4_Sub20_Sub12_Sub3.method553(0.6);
					((Class34) Class4_Sub20_Sub12_Sub3.anInterface2_3530)
							.method891(0, 0.6);
				}
				Class30.method873(4000);
			}
			if ((i ^ 0xffffffff) == -4) {
				int i_20_ = 0;
				if (i_19_ == 0)
					i_20_ = 255;
				if ((i_19_ ^ 0xffffffff) == -2)
					i_20_ = 192;
				if (i_19_ == 2)
					i_20_ = 128;
				if (i_19_ == 3)
					i_20_ = 64;
				if (i_19_ == 4)
					i_20_ = 0;
				if (i_20_ != Class4_Sub20_Sub8.anInt3021) {
					if (Class4_Sub20_Sub8.anInt3021 != 0
							|| (anInt136 ^ 0xffffffff) == 0) {
						if (i_20_ != 0)
							Class35.method911(23245, i_20_);
						else {
							Class4_Sub20_Sub16.method606(arg1 ^ 0x6431);
							Class4_Sub20_Sub6.aBoolean2895 = false;
						}
					} else {
						AppletListener.method1151(i_20_, -2,
								Class54.aClass19_Sub1_1107, 0, anInt136, false);
						Class4_Sub20_Sub6.aBoolean2895 = false;
					}
					Class4_Sub20_Sub8.anInt3021 = i_20_;
				}
			}
			if ((i ^ 0xffffffff) == -5) {
				if (i_19_ == 0)
					Class18.anInt476 = 127;
				if ((i_19_ ^ 0xffffffff) == -2)
					Class18.anInt476 = 96;
				if (i_19_ == 2)
					Class18.anInt476 = 64;
				if ((i_19_ ^ 0xffffffff) == -4)
					Class18.anInt476 = 32;
				if ((i_19_ ^ 0xffffffff) == -5)
					Class18.anInt476 = 0;
			}
			if (i == 6)
				Class14.anInt412 = i_19_;
			if (i == 10) {
				if ((i_19_ ^ 0xffffffff) == -1)
					Class71.anInt1480 = 127;
				if (i_19_ == 1)
					Class71.anInt1480 = 96;
				if ((i_19_ ^ 0xffffffff) == -3)
					Class71.anInt1480 = 64;
				if (i_19_ == 3)
					Class71.anInt1480 = 32;
				if (i_19_ == 4)
					Class71.anInt1480 = 0;
			}
			if ((i ^ 0xffffffff) == -6)
				Class81.anInt1681 = i_19_;
			if ((i ^ 0xffffffff) == -10)
				Class19_Sub1.anInt2525 = i_19_;
		}
	}

	public static void method66(boolean arg0) {
		try {
			aJagexString_122 = null;
			if (arg0 == false) {
				aClass4_Sub20_Sub12_Sub1_132 = null;
				aJagexString_120 = null;
				aClass42_130 = null;
				aClass1_103 = null;
				aJagexString_114 = null;
				aClass66_131 = null;
				aJagexString_137 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ac.U("
					+ arg0 + ')');
		}
	}

	public int anInt101;

	public int anInt109;

	public int anInt121;

	public int anInt125;

	public int[][] clippingData;

	public Region(int arg0, int arg1) {
		try {
			anInt121 = arg0;
			anInt109 = arg1;
			anInt125 = 0;
			clippingData = new int[anInt121][anInt109];
			anInt101 = 0;
			method68(true);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ac.<init>(" + arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean method48(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6) {
		try {
			anInt97++;
			if (arg6 == arg3 && arg0 == arg4)
				return true;
			arg3 -= anInt125;
			arg6 -= anInt125;
			arg0 -= anInt101;
			arg4 -= anInt101;
			if ((arg2 ^ 0xffffffff) == -7 || (arg2 ^ 0xffffffff) == -8) {
				if (arg2 == 7)
					arg5 = arg5 + 2 & 0x3;
				if (arg5 == 0) {
					if ((arg3 + 1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
							&& (arg0 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
							&& (clippingData[arg6][arg4] & 0x80 ^ 0xffffffff) == -1)
						return true;
					if (arg3 == arg6 && arg0 + -1 == arg4
							&& (0x2 & clippingData[arg6][arg4]) == 0)
						return true;
				} else if (arg5 != 1) {
					if (arg5 != 2) {
						if ((arg5 ^ 0xffffffff) == -4) {
							if ((arg3 + 1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
									&& arg0 == arg4
									&& (0x80 & clippingData[arg6][arg4] ^ 0xffffffff) == -1)
								return true;
							if (arg3 == arg6
									&& (arg4 ^ 0xffffffff) == (1 + arg0 ^ 0xffffffff)
									&& ((0x20 & clippingData[arg6][arg4]) == 0))
								return true;
						}
					} else {
						if ((arg6 ^ 0xffffffff) == (-1 + arg3 ^ 0xffffffff)
								&& (arg4 ^ 0xffffffff) == (arg0 ^ 0xffffffff)
								&& (0x8 & clippingData[arg6][arg4] ^ 0xffffffff) == -1)
							return true;
						if (arg6 == arg3
								&& (1 + arg0 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
								&& (0x20 & clippingData[arg6][arg4]) == 0)
							return true;
					}
				} else {
					if ((arg3 + -1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
							&& (arg0 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
							&& (0x8 & clippingData[arg6][arg4]) == 0)
						return true;
					if (arg3 == arg6
							&& arg4 == -1 + arg0
							&& ((0x2 & clippingData[arg6][arg4] ^ 0xffffffff) == -1))
						return true;
				}
			}
			if ((arg2 ^ 0xffffffff) == -9) {
				if (arg6 == arg3
						&& arg4 == arg0 - -1
						&& ((clippingData[arg6][arg4] & 0x20 ^ 0xffffffff) == -1))
					return true;
				if (arg3 == arg6
						&& (arg4 ^ 0xffffffff) == (-1 + arg0 ^ 0xffffffff)
						&& ((clippingData[arg6][arg4] & 0x2 ^ 0xffffffff) == -1))
					return true;
				if (arg6 == arg3 + -1
						&& (arg0 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
						&& (clippingData[arg6][arg4] & 0x8) == 0)
					return true;
				if ((arg3 + 1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
						&& (arg0 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
						&& (0x80 & clippingData[arg6][arg4]) == 0)
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ac.M("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public boolean method49(int arg0, int arg1, int arg2, int arg3, int arg4,
			boolean arg5, int arg6, int arg7) {
		System.out.println("region shit...");
		try {
			anInt111++;
			int i = -1 + arg2 + arg4;
			int i_0_ = arg6 + arg0 + -1;
			if (arg4 <= arg3 && (arg3 ^ 0xffffffff) >= (i ^ 0xffffffff)
					&& arg1 >= arg6 && arg1 <= i_0_)
				return true;
			if (arg3 == arg4 - 1
					&& arg1 >= arg6
					&& (i_0_ ^ 0xffffffff) <= (arg1 ^ 0xffffffff)
					&& ((0x8 & clippingData[-anInt125 + arg3][-anInt101 + arg1]) ^ 0xffffffff) == -1
					&& (arg7 & 0x8) == 0)
				return true;
			if ((arg3 ^ 0xffffffff) == (i - -1 ^ 0xffffffff)
					&& (arg1 ^ 0xffffffff) <= (arg6 ^ 0xffffffff)
					&& (i_0_ ^ 0xffffffff) <= (arg1 ^ 0xffffffff)
					&& ((clippingData[arg3 + -anInt125][-anInt101 + arg1] & 0x80) ^ 0xffffffff) == -1
					&& (0x2 & arg7) == 0)
				return true;
			if (arg1 == arg6 - 1
					&& arg3 >= arg4
					&& arg3 <= i
					&& ((0x2 & clippingData[arg3 + -anInt125][arg1 + -anInt101]) ^ 0xffffffff) == -1
					&& (0x4 & arg7 ^ 0xffffffff) == -1)
				return true;
			if (i_0_ + 1 == arg1
					&& (arg4 ^ 0xffffffff) >= (arg3 ^ 0xffffffff)
					&& i >= arg3
					&& ((0x20 & clippingData[arg3 + -anInt125][arg1 - anInt101]) == 0)
					&& (0x1 & arg7) == 0)
				return true;
			if (arg5 != true)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ac.T("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ',' + arg7 + ')'));
		}
	}

	public void method52(boolean arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		anInt98++;
		if (arg4 < -109) {
			arg5 -= anInt101;
			arg3 -= anInt125;
			if (arg1 == 0) {
				if ((arg2 ^ 0xffffffff) == -1) {
					method57(115, arg3, arg5, 128);
					method57(94, arg3 + -1, arg5, 8);
				}
				if (arg2 == 1) {
					method57(101, arg3, arg5, 2);
					method57(92, arg3, 1 + arg5, 32);
				}
				if ((arg2 ^ 0xffffffff) == -3) {
					method57(97, arg3, arg5, 8);
					method57(109, 1 + arg3, arg5, 128);
				}
				if ((arg2 ^ 0xffffffff) == -4) {
					method57(111, arg3, arg5, 32);
					method57(120, arg3, arg5 - 1, 2);
				}
			}
			if ((arg1 ^ 0xffffffff) == -2 || arg1 == 3) {
				if ((arg2 ^ 0xffffffff) == -1) {
					method57(108, arg3, arg5, 1);
					method57(113, arg3 - 1, 1 + arg5, 16);
				}
				if ((arg2 ^ 0xffffffff) == -2) {
					method57(116, arg3, arg5, 4);
					method57(117, arg3 + 1, 1 + arg5, 64);
				}
				if (arg2 == 2) {
					method57(123, arg3, arg5, 16);
					method57(113, arg3 - -1, arg5 + -1, 1);
				}
				if (arg2 == 3) {
					method57(98, arg3, arg5, 64);
					method57(109, arg3 + -1, -1 + arg5, 4);
				}
			}
			if (arg1 == 2) {
				if (arg2 == 0) {
					method57(95, arg3, arg5, 130);
					method57(99, arg3 - 1, arg5, 8);
					method57(125, arg3, arg5 - -1, 32);
				}
				if (arg2 == 1) {
					method57(105, arg3, arg5, 10);
					method57(127, arg3, arg5 + 1, 32);
					method57(106, arg3 - -1, arg5, 128);
				}
				if ((arg2 ^ 0xffffffff) == -3) {
					method57(110, arg3, arg5, 40);
					method57(90, 1 + arg3, arg5, 128);
					method57(121, arg3, -1 + arg5, 2);
				}
				if (arg2 == 3) {
					method57(107, arg3, arg5, 160);
					method57(94, arg3, -1 + arg5, 2);
					method57(94, arg3 - 1, arg5, 8);
				}
			}
			if (arg0) {
				if ((arg1 ^ 0xffffffff) == -1) {
					if (arg2 == 0) {
						method57(90, arg3, arg5, 65536);
						method57(104, arg3 + -1, arg5, 4096);
					}
					if ((arg2 ^ 0xffffffff) == -2) {
						method57(94, arg3, arg5, 1024);
						method57(96, arg3, arg5 + 1, 16384);
					}
					if (arg2 == 2) {
						method57(121, arg3, arg5, 4096);
						method57(117, arg3 - -1, arg5, 65536);
					}
					if (arg2 == 3) {
						method57(101, arg3, arg5, 16384);
						method57(106, arg3, arg5 + -1, 1024);
					}
				}
				if (arg1 == 1 || (arg1 ^ 0xffffffff) == -4) {
					if (arg2 == 0) {
						method57(117, arg3, arg5, 512);
						method57(96, arg3 + -1, 1 + arg5, 8192);
					}
					if (arg2 == 1) {
						method57(93, arg3, arg5, 2048);
						method57(101, arg3 - -1, 1 + arg5, 32768);
					}
					if (arg2 == 2) {
						method57(116, arg3, arg5, 8192);
						method57(116, arg3 + 1, arg5 - 1, 512);
					}
					if (arg2 == 3) {
						method57(126, arg3, arg5, 32768);
						method57(100, -1 + arg3, -1 + arg5, 2048);
					}
				}
				if (arg1 == 2) {
					if (arg2 == 0) {
						method57(125, arg3, arg5, 66560);
						method57(120, -1 + arg3, arg5, 4096);
						method57(102, arg3, arg5 - -1, 16384);
					}
					if (arg2 == 1) {
						method57(98, arg3, arg5, 5120);
						method57(123, arg3, arg5 + 1, 16384);
						method57(112, 1 + arg3, arg5, 65536);
					}
					if ((arg2 ^ 0xffffffff) == -3) {
						method57(112, arg3, arg5, 20480);
						method57(90, 1 + arg3, arg5, 65536);
						method57(99, arg3, -1 + arg5, 1024);
					}
					if ((arg2 ^ 0xffffffff) == -4) {
						method57(100, arg3, arg5, 81920);
						method57(94, arg3, -1 + arg5, 1024);
						method57(89, -1 + arg3, arg5, 4096);
					}
				}
			}
		}
	}

	public void method55(byte arg0, int arg1, int arg2) {
		try {
			if (arg0 >= 114) {
				anInt105++;
				arg2 -= anInt125;
				arg1 -= anInt101;
				clippingData[arg2][arg1] = Class4_Sub20_Sub7_Sub1.method389(
						clippingData[arg2][arg1], 262144);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ac.E("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public void method57(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 >= 88) {
				clippingData[arg1][arg2] = Class4_Sub20_Sub7_Sub1.method389(
						clippingData[arg1][arg2], arg3);
				anInt99++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ac.J("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public void method59(int arg0, int arg1, int arg2, boolean arg3, int arg4,
			int arg5) {
		arg0 -= anInt125;
		anInt112++;
		arg2 -= anInt101;
		if (arg5 == 0) {
			if (arg4 == 0) {
				method67((byte) -96, arg0, arg2, 128);
				method67((byte) -94, arg0 - 1, arg2, 8);
			}
			if ((arg4 ^ 0xffffffff) == -2) {
				method67((byte) -98, arg0, arg2, 2);
				method67((byte) -123, arg0, 1 + arg2, 32);
			}
			if (arg4 == 2) {
				method67((byte) -102, arg0, arg2, 8);
				method67((byte) -109, arg0 - -1, arg2, 128);
			}
			if ((arg4 ^ 0xffffffff) == -4) {
				method67((byte) -111, arg0, arg2, 32);
				method67((byte) -121, arg0, arg2 - 1, 2);
			}
		}
		if ((arg5 ^ 0xffffffff) == -2 || (arg5 ^ 0xffffffff) == -4) {
			if ((arg4 ^ 0xffffffff) == -1) {
				method67((byte) -125, arg0, arg2, 1);
				method67((byte) -87, arg0 - 1, 1 + arg2, 16);
			}
			if ((arg4 ^ 0xffffffff) == -2) {
				method67((byte) -115, arg0, arg2, 4);
				method67((byte) -114, arg0 - -1, arg2 + 1, 64);
			}
			if ((arg4 ^ 0xffffffff) == -3) {
				method67((byte) -94, arg0, arg2, 16);
				method67((byte) -124, 1 + arg0, arg2 + -1, 1);
			}
			if (arg4 == 3) {
				method67((byte) -103, arg0, arg2, 64);
				method67((byte) -124, arg0 - 1, -1 + arg2, 4);
			}
		}
		if (arg1 != 1)
			aJagexString_120 = null;
		if (arg5 == 2) {
			if ((arg4 ^ 0xffffffff) == -1) {
				method67((byte) -92, arg0, arg2, 130);
				method67((byte) -110, arg0 + -1, arg2, 8);
				method67((byte) -114, arg0, 1 + arg2, 32);
			}
			if ((arg4 ^ 0xffffffff) == -2) {
				method67((byte) -112, arg0, arg2, 10);
				method67((byte) -115, arg0, arg2 + 1, 32);
				method67((byte) -114, 1 + arg0, arg2, 128);
			}
			if ((arg4 ^ 0xffffffff) == -3) {
				method67((byte) -89, arg0, arg2, 40);
				method67((byte) -105, arg0 + 1, arg2, 128);
				method67((byte) -95, arg0, -1 + arg2, 2);
			}
			if (arg4 == 3) {
				method67((byte) -125, arg0, arg2, 160);
				method67((byte) -121, arg0, arg2 + -1, 2);
				method67((byte) -115, -1 + arg0, arg2, 8);
			}
		}
		if (arg3) {
			if ((arg5 ^ 0xffffffff) == -1) {
				if (arg4 == 0) {
					method67((byte) -108, arg0, arg2, 65536);
					method67((byte) -121, arg0 + -1, arg2, 4096);
				}
				if (arg4 == 1) {
					method67((byte) -87, arg0, arg2, 1024);
					method67((byte) -120, arg0, 1 + arg2, 16384);
				}
				if ((arg4 ^ 0xffffffff) == -3) {
					method67((byte) -124, arg0, arg2, 4096);
					method67((byte) -100, 1 + arg0, arg2, 65536);
				}
				if (arg4 == 3) {
					method67((byte) -115, arg0, arg2, 16384);
					method67((byte) -107, arg0, -1 + arg2, 1024);
				}
			}
			if ((arg5 ^ 0xffffffff) == -2 || (arg5 ^ 0xffffffff) == -4) {
				if ((arg4 ^ 0xffffffff) == -1) {
					method67((byte) -92, arg0, arg2, 512);
					method67((byte) -97, arg0 + -1, arg2 + 1, 8192);
				}
				if ((arg4 ^ 0xffffffff) == -2) {
					method67((byte) -104, arg0, arg2, 2048);
					method67((byte) -97, 1 + arg0, 1 + arg2, 32768);
				}
				if ((arg4 ^ 0xffffffff) == -3) {
					method67((byte) -87, arg0, arg2, 8192);
					method67((byte) -86, 1 + arg0, -1 + arg2, 512);
				}
				if ((arg4 ^ 0xffffffff) == -4) {
					method67((byte) -87, arg0, arg2, 32768);
					method67((byte) -112, -1 + arg0, arg2 - 1, 2048);
				}
			}
			if ((arg5 ^ 0xffffffff) == -3) {
				if ((arg4 ^ 0xffffffff) == -1) {
					method67((byte) -88, arg0, arg2, 66560);
					method67((byte) -110, arg0 - 1, arg2, 4096);
					method67((byte) -106, arg0, arg2 - -1, 16384);
				}
				if (arg4 == 1) {
					method67((byte) -101, arg0, arg2, 5120);
					method67((byte) -88, arg0, 1 + arg2, 16384);
					method67((byte) -103, 1 + arg0, arg2, 65536);
				}
				if (arg4 == 2) {
					method67((byte) -107, arg0, arg2, 20480);
					method67((byte) -109, arg0 - -1, arg2, 65536);
					method67((byte) -123, arg0, -1 + arg2, 1024);
				}
				if ((arg4 ^ 0xffffffff) == -4) {
					method67((byte) -85, arg0, arg2, 81920);
					method67((byte) -108, arg0, arg2 + -1, 1024);
					method67((byte) -115, -1 + arg0, arg2, 4096);
				}
			}
		}
	}

	public void method60(int arg0, int arg1, boolean arg2, int arg3, int arg4,
			int arg5, int arg6) {
		try {
			arg6 -= anInt125;
			int i = 256;
			if ((arg4 ^ 0xffffffff) == -2 || (arg4 ^ 0xffffffff) == -4) {
				int i_14_ = arg5;
				arg5 = arg3;
				arg3 = i_14_;
			}
			if (arg2)
				i += 131072;
			anInt102++;
			arg0 -= anInt101;
			if (arg1 != 2)
				aJagexString_137 = null;
			for (int i_15_ = arg6; arg5 + arg6 > i_15_; i_15_++) {
				if (i_15_ >= 0 && i_15_ < anInt121) {
					for (int i_16_ = arg0; i_16_ < arg0 - -arg3; i_16_++) {
						if ((i_16_ ^ 0xffffffff) <= -1 && anInt109 > i_16_)
							method57(97, i_15_, i_16_, i);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ac.R("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public void method61(int arg0, int arg1, int arg2) {
		anInt119++;
		arg0 -= anInt125;
		arg1 -= anInt101;
		clippingData[arg0][arg1] = Class59.method1035(clippingData[arg0][arg1],
				-262145);
		if (arg2 != -1)
			anInt101 = -112;
	}

	public boolean canMove(int arg0, byte arg1, int arg2, int arg3, int arg4,
			int arg5, int arg6) {
		try {
			anInt100++;
			if ((arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
					&& (arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff))
				return true;
			arg4 -= anInt125;
			arg6 -= anInt101;
			arg0 -= anInt101;
			arg3 -= anInt125;
			if (arg2 == 0) {
				if ((arg5 ^ 0xffffffff) == -1) {
					if (arg4 == arg3 - 1
							&& (arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff))
						return true;
					if ((arg4 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
							&& (arg6 ^ 0xffffffff) == (arg0 + 1 ^ 0xffffffff)
							&& (clippingData[arg4][arg6] & 0x12c0120) == 0)
						return true;
					if (arg4 == arg3 && arg6 == arg0 + -1
							&& (0x12c0102 & clippingData[arg4][arg6]) == 0)
						return true;
				} else if (arg5 != 1) {
					if (arg5 != 2) {
						if (arg5 == 3) {
							if ((arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
									&& -1 + arg0 == arg6)
								return true;
							if (arg4 == -1 + arg3
									&& (arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
									&& (0x12c0108 & clippingData[arg4][arg6] ^ 0xffffffff) == -1)
								return true;
							if ((1 + arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
									&& (arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
									&& (0x12c0180 & clippingData[arg4][arg6] ^ 0xffffffff) == -1)
								return true;
						}
					} else {
						if ((1 + arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
								&& (arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff))
							return true;
						if (arg3 == arg4
								&& (arg6 ^ 0xffffffff) == (arg0 + 1 ^ 0xffffffff)
								&& (0x12c0120 & clippingData[arg4][arg6] ^ 0xffffffff) == -1)
							return true;
						if (arg4 == arg3
								&& arg6 == -1 + arg0
								&& (clippingData[arg4][arg6] & 0x12c0102 ^ 0xffffffff) == -1)
							return true;
					}
				} else {
					if ((arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
							&& (arg6 ^ 0xffffffff) == (arg0 - -1 ^ 0xffffffff))
						return true;
					if (arg4 == arg3 + -1 && arg6 == arg0
							&& (0x12c0108 & clippingData[arg4][arg6]) == 0)
						return true;
					if ((arg3 - -1 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
							&& arg6 == arg0
							&& (0x12c0180 & clippingData[arg4][arg6]) == 0)
						return true;
				}
			}
			if (arg2 == 2) {
				if (arg5 != 0) {
					if ((arg5 ^ 0xffffffff) != -2) {
						if ((arg5 ^ 0xffffffff) == -3) {
							if ((arg3 + -1 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
									&& (arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
									&& (0x12c0108 & clippingData[arg4][arg6] ^ 0xffffffff) == -1)
								return true;
							if (arg3 == arg4
									&& arg6 == 1 + arg0
									&& (clippingData[arg4][arg6] & 0x12c0120) == 0)
								return true;
							if ((arg4 ^ 0xffffffff) == (arg3 + 1 ^ 0xffffffff)
									&& (arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff))
								return true;
							if (arg3 == arg4 && arg6 == arg0 - 1)
								return true;
						} else if ((arg5 ^ 0xffffffff) == -4) {
							if ((arg3 - 1 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
									&& (arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff))
								return true;
							if (arg3 == arg4
									&& (arg6 ^ 0xffffffff) == (1 + arg0 ^ 0xffffffff)
									&& (0x12c0120 & clippingData[arg4][arg6] ^ 0xffffffff) == -1)
								return true;
							if (arg3 + 1 == arg4
									&& (arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
									&& (clippingData[arg4][arg6] & 0x12c0180 ^ 0xffffffff) == -1)
								return true;
							if (arg4 == arg3 && arg6 == arg0 - 1)
								return true;
						}
					} else {
						if (-1 + arg3 == arg4
								&& arg0 == arg6
								&& (clippingData[arg4][arg6] & 0x12c0108 ^ 0xffffffff) == -1)
							return true;
						if ((arg4 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
								&& (1 + arg0 ^ 0xffffffff) == (arg6 ^ 0xffffffff))
							return true;
						if ((arg3 + 1 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
								&& (arg6 ^ 0xffffffff) == (arg0 ^ 0xffffffff))
							return true;
						if ((arg3 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
								&& (arg6 ^ 0xffffffff) == (arg0 - 1 ^ 0xffffffff)
								&& (0x12c0102 & clippingData[arg4][arg6] ^ 0xffffffff) == -1)
							return true;
					}
				} else {
					if (arg4 == -1 + arg3 && arg6 == arg0)
						return true;
					if ((arg4 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
							&& arg0 + 1 == arg6)
						return true;
					if (arg4 == arg3 - -1 && arg6 == arg0
							&& (clippingData[arg4][arg6] & 0x12c0180) == 0)
						return true;
					if ((arg4 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
							&& (arg0 - 1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
							&& (0x12c0102 & clippingData[arg4][arg6] ^ 0xffffffff) == -1)
						return true;
				}
			}
			if (arg2 == 9) {
				if (arg4 == arg3 && 1 + arg0 == arg6
						&& (0x20 & clippingData[arg4][arg6]) == 0)
					return true;
				if (arg3 == arg4
						&& (arg0 + -1 ^ 0xffffffff) == (arg6 ^ 0xffffffff)
						&& (0x2 & clippingData[arg4][arg6]) == 0)
					return true;
				if ((arg4 ^ 0xffffffff) == (arg3 - 1 ^ 0xffffffff)
						&& arg0 == arg6
						&& ((0x8 & clippingData[arg4][arg6] ^ 0xffffffff) == -1))
					return true;
				if (arg3 - -1 == arg4
						&& (arg6 ^ 0xffffffff) == (arg0 ^ 0xffffffff)
						&& (0x80 & clippingData[arg4][arg6]) == 0)
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ac.H("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ')'));
		}
	}

	public void method63(int arg0, int arg1, int arg2) {
		try {
			anInt107++;
			arg0 -= anInt125;
			arg1 -= anInt101;
			clippingData[arg0][arg1] = Class4_Sub20_Sub7_Sub1.method389(
					clippingData[arg0][arg1], arg2);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ac.K("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public void method64(int arg0, int arg1, int arg2, byte arg3, int arg4,
			int arg5, boolean arg6) {
		arg1 -= anInt125;
		arg0 -= anInt101;
		if (arg5 == 1 || arg5 == 3) {
			int i = arg2;
			arg2 = arg4;
			arg4 = i;
		}
		anInt116++;
		int i = 256;
		if (arg6)
			i += 131072;
		for (int i_17_ = arg1; (i_17_ ^ 0xffffffff) > (arg2 + arg1 ^ 0xffffffff); i_17_++) {
			if ((i_17_ ^ 0xffffffff) <= -1 && anInt121 > i_17_) {
				for (int i_18_ = arg0; arg0 + arg4 > i_18_; i_18_++) {
					if ((i_18_ ^ 0xffffffff) <= -1
							&& (anInt109 ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
						method67((byte) -110, i_17_, i_18_, i);
				}
			}
		}
		if (arg3 <= 32)
			anInt127 = 10;
	}

	public void method67(byte arg0, int arg1, int arg2, int arg3) {
		clippingData[arg1][arg2] = Class59.method1035(clippingData[arg1][arg2],
				arg3 ^ 0xffffffff);
		anInt118++;
		if (arg0 > -84)
			method58((byte) 42, null);
	}

	public void method68(boolean arg0) {
		try {
			for (int i = 0; i < anInt121; i++) {
				for (int i_21_ = 0; i_21_ < anInt109; i_21_++) {
					if (i == 0
							|| i_21_ == 0
							|| (i ^ 0xffffffff) <= (anInt121 - 5 ^ 0xffffffff)
							|| (i_21_ ^ 0xffffffff) <= (anInt109 + -5 ^ 0xffffffff))
						clippingData[i][i_21_] = 16777215;
					else
						clippingData[i][i_21_] = 16777216;
				}
			}
			if (arg0 == true)
				anInt124++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ac.I("
					+ arg0 + ')');
		}
	}
}
