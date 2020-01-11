package com.jagex.runescape;
import java.awt.Graphics;

public abstract class Class19 {
	public static JagexString aJagexString_495 = (JagexString.getRs2PreparedString(
			"Verbindung konnte nicht hergestellt werden)3"));
	public static JagexString aJagexString_517 = JagexString.getRs2PreparedString(
			"<col=ffffff> )4 ");
	public static Class4_Sub20_Sub12_Sub2[] aClass4_Sub20_Sub12_Sub2Array504;
	public static long aLong524 = 0L;
	public static int anInt485;
	public static int anInt486;
	public static int anInt489;
	public static int anInt490;
	public static int anInt491;
	public static int anInt494;
	public static int anInt497;
	public static int anInt498;
	public static int anInt499;
	public static int anInt500;
	public static int anInt501;
	public static int anInt503;
	public static int anInt505;
	public static int anInt506;
	public static int anInt507;
	public static int anInt508;
	public static int anInt509;
	public static int anInt511;
	public static int anInt513;
	public static int anInt515;
	public static int anInt516;
	public static int anInt519;
	public static int anInt520;
	public static int anInt522;
	public static int[] anIntArray514;
	static {
		anIntArray514 = new int[2000];
	}

	public static void method735(boolean arg0, JagexString arg1, byte arg2) {
		try {
			anInt494++;
			int i = 4;
			int i_0_ = i + 6;
			int i_1_ = 6 - -i;
			if (arg2 != -126)
				method757((byte) -111);
			int i_2_ = Class4_Sub15.aClass4_Sub20_Sub12_Sub4_Sub1_2289
					.method568(arg1, 250);
			int i_3_ = (Class4_Sub15.aClass4_Sub20_Sub12_Sub4_Sub1_2289
					.method570(arg1, 250) * 13);
			Class4_Sub20_Sub12.method488(i_0_ + -i, i_1_ - i, i + i + i_2_, i
					+ i_3_ - -i, 0);
			Class4_Sub20_Sub12.method502(-i + i_0_, i_1_ - i, i + (i + i_2_), i
					+ i_3_ - -i, 16777215);
			Class4_Sub15.aClass4_Sub20_Sub12_Sub4_Sub1_2289.method566(arg1,
					i_0_, i_1_, i_2_, i_3_, 16777215, -1, 1, 1, 0);
			Class4_Sub20_Sub17.method621(i_1_ + -i, 16052, i + (i + i_2_), i_0_
					- i, i + (i_3_ + i));
			if (arg0) {
				try {
					Graphics graphics = Class4_Sub20_Sub7_Sub5.runeCanvas
							.getGraphics();
					Class62.aClass13_1225.method687(graphics, 0, 0, true);
				} catch (Exception exception) {
					Class4_Sub20_Sub7_Sub5.runeCanvas.repaint();
				}
			} else
				Class67.method1087(arg2 ^ 0x753a, i_0_, i_2_, i_3_, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.HA("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ')'));
		}
	}

	public static boolean method750(boolean arg0, int arg1) {
		try {
			anInt501++;
			if (arg0 != true)
				aJagexString_495 = null;
			if (arg1 >= 97 && (arg1 ^ 0xffffffff) >= -123)
				return true;
			if ((arg1 ^ 0xffffffff) <= -66 && (arg1 ^ 0xffffffff) >= -91)
				return true;
			if ((arg1 ^ 0xffffffff) <= -49 && arg1 <= 57)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.BA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method757(byte arg0) {
		try {
			aJagexString_517 = null;
			if (arg0 > -61)
				aJagexString_517 = null;
			aClass4_Sub20_Sub12_Sub2Array504 = null;
			anIntArray514 = null;
			aJagexString_495 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ef.W("
					+ arg0 + ')');
		}
	}

	public boolean aBoolean502;
	public boolean aBoolean525;
	public Class62 aClass62_521;
	public Class62[] aClass62Array523;
	public int anInt492;
	public int anInt526;
	public int[] anIntArray496;
	public int[] anIntArray510;
	public int[] anIntArray512;
	public int[] anIntArray518;
	public int[] anIntArray528;

	public int[][] anIntArrayArray493;

	public int[][] anIntArrayArray527;

	public Object[] anObjectArray488;

	public Object[][] anObjectArrayArray487;

	public Class19(boolean arg0, boolean arg1) {
		try {
			aBoolean525 = arg1;
			aBoolean502 = arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ef.<init>(" + arg0 + ',' + arg1 + ')'));
		}
	}

	public void method736(int arg0) {
		try {
			for (int i = arg0; ((anObjectArrayArray487.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
				if (anObjectArrayArray487[i] != null) {
					for (int i_4_ = 0; ((anObjectArrayArray487[i].length ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++)
						anObjectArrayArray487[i][i_4_] = null;
				}
			}
			anInt505++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ef.NA("
					+ arg0 + ')');
		}
	}

	public boolean method737(int arg0, byte arg1, int[] arg2) {
		try {
			anInt489++;
			if (anObjectArray488[arg0] == null)
				return false;
			if (arg1 < 55)
				return true;
			int i = anIntArray510[arg0];
			int[] is = anIntArrayArray493[arg0];
			Object[] objects = anObjectArrayArray487[arg0];
			boolean bool = true;
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i ^ 0xffffffff); i_5_++) {
				if (objects[is[i_5_]] == null) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
			byte[] is_6_;
			if (arg2 == null
					|| (arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0))
				is_6_ = Class59.method1034(false, (byte) 85,
						anObjectArray488[arg0]);
			else {
				is_6_ = Class59.method1034(true, (byte) 101,
						anObjectArray488[arg0]);
				StreamBuffer class4_sub11 = new StreamBuffer(is_6_);
				class4_sub11.method247(5, 255, arg2,
						class4_sub11.byteBuffer.length);
			}
			byte[] is_7_;
			try {
				is_7_ = Class4_Sub20_Sub16.method609(-86, is_6_);
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4
						.method423(
								runtimeexception,
								("T3 - "
										+ (arg2 != null)
										+ ","
										+ arg0
										+ ","
										+ is_6_.length
										+ ","
										+ Class6.method649(-968, is_6_,
												is_6_.length)
										+ ","
										+ Class6.method649(-968, is_6_,
												is_6_.length + -2) + ","
										+ anIntArray496[arg0] + "," + anInt492));
			}
			if (aBoolean502)
				anObjectArray488[arg0] = null;
			if (i > 1) {
				int i_8_ = is_7_.length;
				int i_9_ = is_7_[--i_8_] & 0xff;
				i_8_ -= i_9_ * (i * 4);
				StreamBuffer class4_sub11 = new StreamBuffer(is_7_);
				int[] is_10_ = new int[i];
				class4_sub11.pointion = i_8_;
				for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff); i_11_++) {
					int i_12_ = 0;
					for (int i_13_ = 0; (i ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
						i_12_ += class4_sub11.method219((byte) 73);
						is_10_[i_13_] += i_12_;
					}
				}
				byte[][] is_14_ = new byte[i][];
				for (int i_15_ = 0; (i ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
					is_14_[i_15_] = new byte[is_10_[i_15_]];
					is_10_[i_15_] = 0;
				}
				class4_sub11.pointion = i_8_;
				int i_16_ = 0;
				for (int i_17_ = 0; (i_9_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
					int i_18_ = 0;
					for (int i_19_ = 0; i > i_19_; i_19_++) {
						i_18_ += class4_sub11.method219((byte) 73);
						Class21.method777(is_7_, i_16_, is_14_[i_19_],
								is_10_[i_19_], i_18_);
						is_10_[i_19_] += i_18_;
						i_16_ += i_18_;
					}
				}
				for (int i_20_ = 0; i > i_20_; i_20_++) {
					if (aBoolean525)
						objects[is[i_20_]] = is_14_[i_20_];
					else
						objects[is[i_20_]] = Class4_Sub21.method623(
								is_14_[i_20_], false, (byte) 75);
				}
			} else if (!aBoolean525)
				objects[is[0]] = Class4_Sub21
						.method623(is_7_, false, (byte) 75);
			else
				objects[is[0]] = is_7_;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.CA("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public byte[] method738(int arg0, byte arg1, int arg2) {
		try {
			anInt509++;
			if (arg1 >= -69)
				return null;
			if (arg2 < 0
					|| (arg2 ^ 0xffffffff) <= (anObjectArrayArray487.length ^ 0xffffffff)
					|| anObjectArrayArray487[arg2] == null
					|| (arg0 ^ 0xffffffff) > -1
					|| (arg0 ^ 0xffffffff) <= (anObjectArrayArray487[arg2].length ^ 0xffffffff))
				return null;
			if (anObjectArrayArray487[arg2][arg0] == null) {
				boolean bool = method737(arg2, (byte) 105, null);
				if (!bool) {
					method748(-127, arg2);
					bool = method737(arg2, (byte) 121, null);
					if (!bool)
						return null;
				}
			}
			byte[] is = Class59.method1034(false, (byte) -109,
					anObjectArrayArray487[arg2][arg0]);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.Q("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public boolean method739(byte arg0, int arg1, int arg2) {
		try {
			anInt491++;
			if ((arg1 ^ 0xffffffff) > -1
					|| arg1 >= anObjectArrayArray487.length
					|| anObjectArrayArray487[arg1] == null
					|| arg2 < 0
					|| (arg2 ^ 0xffffffff) <= (anObjectArrayArray487[arg1].length ^ 0xffffffff))
				return false;
			if (anObjectArrayArray487[arg1][arg2] != null)
				return true;
			if (anObjectArray488[arg1] != null)
				return true;
			method748(33, arg1);
			if (anObjectArray488[arg1] != null)
				return true;
			if (arg0 != -4)
				method747(false, null, -78);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.O("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public byte[] method740(int arg0, boolean arg1) {
		try {
			if (arg1 != true)
				return null;
			anInt513++;
			if (anObjectArrayArray487.length == 1)
				return method746(0, (byte) 113, arg0);
			if ((anObjectArrayArray487[arg0].length ^ 0xffffffff) == -2)
				return method746(arg0, (byte) 104, 0);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.KA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public int method741(int arg0, boolean arg1) {
		try {
			anInt507++;
			if (arg1 != true)
				return 121;
			return anObjectArrayArray487[arg0].length;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.AA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean method742(int arg0, int arg1) {
		try {
			anInt522++;
			if (anObjectArray488[arg0] != null)
				return true;
			method748(arg1 + -20503, arg0);
			if (anObjectArray488[arg0] != null)
				return true;
			if (arg1 != 20619)
				method759(69);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.MA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method743(int arg0, int arg1) {
		anInt497++;
		if (arg1 != 10064)
			aJagexString_495 = null;
	}

	public boolean method744(byte arg0, JagexString arg1, JagexString arg2) {
		try {
			arg1 = arg1.method827((byte) -55);
			arg2 = arg2.method827((byte) -55);
			anInt503++;
			int i = aClass62_521.method1051(arg1.method820((byte) 98),
					(byte) -127);
			int i_22_ = aClass62Array523[i].method1051(
					arg2.method820((byte) 117), (byte) -121);
			return method739((byte) -4, i, i_22_);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.DA("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method745(int arg0, JagexString arg1) {
		try {
			if (arg0 == 19268) {
				arg1 = arg1.method827((byte) -55);
				int i = aClass62_521.method1051(arg1.method820((byte) 123),
						(byte) -123);
				anInt490++;
				if (i >= 0)
					method743(i, 10064);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.FA("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public byte[] method746(int arg0, byte arg1, int arg2) {
		try {
			if (arg1 < 82)
				method752((byte) 36);
			anInt515++;
			return method758(null, arg0, false, arg2);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.T("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public int method747(boolean arg0, JagexString arg1, int arg2) {
		try {
			arg1 = arg1.method827((byte) -55);
			anInt499++;
			if (arg0 != false)
				return 30;
			return aClass62Array523[arg2].method1051(
					arg1.method820((byte) 113), (byte) -127);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.U("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ arg2 + ')'));
		}
	}

	public void method748(int arg0, int arg1) {
		try {
			anInt511++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.F("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public byte[] method749(boolean arg0, int arg1) {
		try {
			anInt520++;
			if (anObjectArrayArray487.length == 1)
				return method738(arg1, (byte) -87, 0);
			if (anObjectArrayArray487[arg1].length == 1)
				return method738(0, (byte) -109, arg1);
			if (arg0 != true)
				aClass62_521 = null;
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.R("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public int[] method751(int arg0, int arg1) {
		try {
			if (arg0 <= 57)
				method758(null, 34, false, -16);
			anInt486++;
			return anIntArrayArray493[arg1];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.V("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean method752(byte arg0) {
		try {
			anInt485++;
			boolean bool = true;
			for (int i = 0; anIntArray518.length > i; i++) {
				int i_23_ = anIntArray518[i];
				if (anObjectArray488[i_23_] == null) {
					method748(-100, i_23_);
					if (anObjectArray488[i_23_] == null)
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ef.S("
					+ arg0 + ')');
		}
	}

	public byte[] method753(boolean arg0, JagexString arg1, JagexString arg2) {
		try {
			if (arg0 != false)
				method739((byte) -40, 5, 102);
			anInt508++;
			arg1 = arg1.method827((byte) -55);
			arg2 = arg2.method827((byte) -55);
			int i = aClass62_521.method1051(arg1.method820((byte) 63),
					(byte) -123);
			int i_24_ = aClass62Array523[i].method1051(
					arg2.method820((byte) 61), (byte) -123);
			return method746(i, (byte) 93, i_24_);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.EA("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public int method754(JagexString arg0, int arg1) {
		try {
			arg0 = arg0.method827((byte) -55);
			anInt519++;
			if (arg1 != 1)
				anIntArray510 = null;
			return aClass62_521.method1051(arg0.method820((byte) 74),
					(byte) -126);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.LA("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public void method755(int arg0, int arg1) {
		try {
			anInt498++;
			if (arg0 != -91)
				aClass62Array523 = null;
			for (int i = 0; ((i ^ 0xffffffff) > (anObjectArrayArray487[arg1].length ^ 0xffffffff)); i++)
				anObjectArrayArray487[arg1][i] = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.JA("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public void method756(byte arg0, byte[] arg1) {
		anInt506++;
		anInt492 = Class6.method649(-968, arg1, arg1.length);
		StreamBuffer class4_sub11 = new StreamBuffer(
				Class4_Sub20_Sub16.method609(-37, arg1));
		int i = class4_sub11.get();
		if ((i ^ 0xffffffff) != -6 && (i ^ 0xffffffff) != -7)
			throw new RuntimeException("Incorrect JS5 protocol number: " + i);
		if (i >= 6)
			class4_sub11.method219((byte) 73);
		int i_25_ = class4_sub11.get();
		int i_26_ = -1;
		int i_27_ = 0;
		anInt526 = class4_sub11.method209((byte) -111);
		anIntArray518 = new int[anInt526];
		for (int i_28_ = 0; i_28_ < anInt526; i_28_++) {
			anIntArray518[i_28_] = i_27_ += class4_sub11.method209((byte) -127);
			if ((anIntArray518[i_28_] ^ 0xffffffff) < (i_26_ ^ 0xffffffff))
				i_26_ = anIntArray518[i_28_];
		}
		if (arg0 != 108)
			anIntArray518 = null;
		anObjectArray488 = new Object[1 + i_26_];
		anIntArray528 = new int[1 + i_26_];
		anIntArray510 = new int[i_26_ - -1];
		anObjectArrayArray487 = new Object[i_26_ + 1][];
		anIntArray496 = new int[i_26_ + 1];
		anIntArrayArray493 = new int[1 + i_26_][];
		if (i_25_ != 0) {
			anIntArray512 = new int[1 + i_26_];
			for (int i_29_ = 0; anInt526 > i_29_; i_29_++)
				anIntArray512[anIntArray518[i_29_]] = class4_sub11
						.method219((byte) 73);
			aClass62_521 = new Class62(anIntArray512);
		}
		for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (anInt526 ^ 0xffffffff); i_30_++)
			anIntArray496[anIntArray518[i_30_]] = class4_sub11
					.method219((byte) 73);
		for (int i_31_ = 0; i_31_ < anInt526; i_31_++)
			anIntArray528[anIntArray518[i_31_]] = class4_sub11
					.method219((byte) 73);
		for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > (anInt526 ^ 0xffffffff); i_32_++)
			anIntArray510[anIntArray518[i_32_]] = class4_sub11
					.method209((byte) -101);
		for (int i_33_ = 0; anInt526 > i_33_; i_33_++) {
			i_27_ = 0;
			int i_34_ = anIntArray518[i_33_];
			int i_35_ = -1;
			int i_36_ = anIntArray510[i_34_];
			anIntArrayArray493[i_34_] = new int[i_36_];
			for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
				int i_38_ = (anIntArrayArray493[i_34_][i_37_] = i_27_ += class4_sub11
						.method209((byte) -119));
				if ((i_38_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff))
					i_35_ = i_38_;
			}
			anObjectArrayArray487[i_34_] = new Object[1 + i_35_];
		}
		if ((i_25_ ^ 0xffffffff) != -1) {
			aClass62Array523 = new Class62[1 + i_26_];
			anIntArrayArray527 = new int[1 + i_26_][];
			for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > (anInt526 ^ 0xffffffff); i_39_++) {
				int i_40_ = anIntArray518[i_39_];
				int i_41_ = anIntArray510[i_40_];
				anIntArrayArray527[i_40_] = new int[anObjectArrayArray487[i_40_].length];
				for (int i_42_ = 0; (i_41_ ^ 0xffffffff) < (i_42_ ^ 0xffffffff); i_42_++)
					anIntArrayArray527[i_40_][anIntArrayArray493[i_40_][i_42_]] = class4_sub11
							.method219((byte) 73);
				aClass62Array523[i_40_] = new Class62(anIntArrayArray527[i_40_]);
			}
		}
	}

	public byte[] method758(int[] arg0, int arg1, boolean arg2, int arg3) {
		try {
			anInt516++;
			if ((arg1 ^ 0xffffffff) > -1
					|| (arg1 ^ 0xffffffff) <= (anObjectArrayArray487.length ^ 0xffffffff)
					|| anObjectArrayArray487[arg1] == null
					|| (arg3 ^ 0xffffffff) > -1
					|| arg3 >= anObjectArrayArray487[arg1].length)
				return null;
			if (anObjectArrayArray487[arg1][arg3] == null) {
				boolean bool = method737(arg1, (byte) 104, arg0);
				if (!bool) {
					method748(110, arg1);
					bool = method737(arg1, (byte) 66, arg0);
					if (!bool)
						return null;
				}
			}
			byte[] is = Class59.method1034(arg2, (byte) -90,
					anObjectArrayArray487[arg1][arg3]);
			if (aBoolean525)
				anObjectArrayArray487[arg1][arg3] = null;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ef.GA("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ',' + arg3 + ')'));
		}
	}

	public int method759(int arg0) {
		try {
			anInt500++;
			if (arg0 <= 15)
				method741(63, false);
			return anObjectArrayArray487.length;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ef.P("
					+ arg0 + ')');
		}
	}
}
