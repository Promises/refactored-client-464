package com.jagex.runescape;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class18 implements KeyListener, FocusListener {
	public static Class19_Sub1 aClass19_Sub1_482;
	public static JagexString[] aJagexStringArray462 = new JagexString[500];
	public static Class65 aClass65_463 = new Class65();
	public static long[] aLongArray483 = new long[100];
	public static int anInt465;
	public static int anInt466;
	public static int anInt467;
	public static int anInt468;
	public static int anInt471;
	public static int anInt475 = 0;
	public static int anInt476 = 127;
	public static int anInt477 = -1;
	public static int anInt479;
	public static int anInt480;
	public static int anInt481;
	public static int[] anIntArray473 = new int[100];

	public static void method731(int arg0) {
		try {
			aJagexStringArray462 = null;
			aClass19_Sub1_482 = null;
			StringUtilities.aJagexString_474 = null;
			aLongArray483 = null;
			StringUtilities.aJagexString_478 = null;
			StringUtilities.aJagexString_472 = null;
			if (arg0 > -73)
				method733(4, (byte) 123, -124, 90);
			StringUtilities.aJagexString_464 = null;
			aClass65_463 = null;
			StringUtilities.aJagexString_484 = null;
			StringUtilities.aJagexString_470 = null;
			anIntArray473 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ee.B("
					+ arg0 + ')');
		}
	}

	public static int method732(int arg0, int arg1) {
		try {
			return arg0 ^ arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ee.D("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static int method733(int arg0, byte arg1, int arg2, int arg3) {
		try {
			anInt465++;
			if (arg1 != 18)
				return 67;
			arg3 &= 0x3;
			if (arg3 == 0)
				return arg0;
			if ((arg3 ^ 0xffffffff) == -2)
				return arg2;
			if (arg3 == 2)
				return 7 + -arg0;
			return 7 + -arg2;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ee.A("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static Class<?> method734(boolean arg0, String arg1)
			throws ClassNotFoundException {
		try {
			anInt467++;
			if (arg1.equals("B"))
				return Byte.TYPE;
			if (arg1.equals("I"))
				return Integer.TYPE;
			if (arg1.equals("S"))
				return Short.TYPE;
			if (arg1.equals("J"))
				return Long.TYPE;
			if (arg1.equals("Z"))
				return Boolean.TYPE;
			if (arg1.equals("F"))
				return Float.TYPE;
			if (arg0 != false)
				method731(30);
			if (arg1.equals("D"))
				return Double.TYPE;
			if (arg1.equals("C"))
				return Character.TYPE;
			return Class.forName(arg1);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ee.C("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		try {
			anInt466++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4
					.method423(runtimeexception, ("ee.focusGained("
							+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public synchronized void focusLost(FocusEvent arg0) {
		anInt480++;
		if (Class4_Sub14.aClass18_2272 != null)
			Class4_Sub20_Sub11.anInt3093 = -1;
	}

	@Override
	public synchronized void keyPressed(KeyEvent arg0) {
		try {
			if (Class4_Sub14.aClass18_2272 != null) {
				Class4_Sub21.anInt2379 = 0;
				int i = arg0.getKeyCode();
				if ((i ^ 0xffffffff) <= -1 && Class14.anIntArray392.length > i) {
					i = Class14.anIntArray392[i];
					if ((0x80 & i) != 0)
						i = -1;
				} else
					i = -1;
				if ((Class4_Sub20_Sub11.anInt3093 ^ 0xffffffff) <= -1 && i >= 0) {
					Class80.anIntArray1645[Class4_Sub20_Sub11.anInt3093] = i;
					Class4_Sub20_Sub11.anInt3093 = 0x7f & Class4_Sub20_Sub11.anInt3093 + 1;
					if ((Class4_Sub20_Sub11.anInt3093 ^ 0xffffffff) == (Class4_Sub20_Sub13.anInt3111 ^ 0xffffffff))
						Class4_Sub20_Sub11.anInt3093 = -1;
				}
				if (i >= 0) {
					int i_0_ = 0x7f & Class4_Sub21.anInt2380 + 1;
					if (i_0_ != Class4_Sub20_Sub10.anInt3057) {
						Class58.anIntArray1167[Class4_Sub21.anInt2380] = i;
						Class4_Sub8.anIntArray1980[Class4_Sub21.anInt2380] = -1;
						Class4_Sub21.anInt2380 = i_0_;
					}
				}
				int i_1_ = arg0.getModifiers();
				if ((i_1_ & 0xa ^ 0xffffffff) != -1 || i == 85 || i == 10)
					arg0.consume();
			}
			anInt481++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4
					.method423(runtimeexception, ("ee.keyPressed("
							+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public synchronized void keyReleased(KeyEvent arg0) {
		try {
			anInt479++;
			if (Class4_Sub14.aClass18_2272 != null) {
				Class4_Sub21.anInt2379 = 0;
				int i = arg0.getKeyCode();
				if ((i ^ 0xffffffff) <= -1
						&& ((Class14.anIntArray392.length ^ 0xffffffff) < (i ^ 0xffffffff)))
					i = ~0x80 & Class14.anIntArray392[i];
				else
					i = -1;
				if ((Class4_Sub20_Sub11.anInt3093 ^ 0xffffffff) <= -1
						&& (i ^ 0xffffffff) <= -1) {
					Class80.anIntArray1645[Class4_Sub20_Sub11.anInt3093] = i ^ 0xffffffff;
					Class4_Sub20_Sub11.anInt3093 = 0x7f & 1 + Class4_Sub20_Sub11.anInt3093;
					if (Class4_Sub20_Sub13.anInt3111 == Class4_Sub20_Sub11.anInt3093)
						Class4_Sub20_Sub11.anInt3093 = -1;
				}
			}
			arg0.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4
					.method423(runtimeexception, ("ee.keyReleased("
							+ (arg0 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		try {
			int i = Class34.method892(arg0, 111);
			if ((i ^ 0xffffffff) <= -1) {
				int i_2_ = Class4_Sub21.anInt2380 - -1 & 0x7f;
				if ((Class4_Sub20_Sub10.anInt3057 ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
					Class58.anIntArray1167[Class4_Sub21.anInt2380] = -1;
					Class4_Sub8.anIntArray1980[Class4_Sub21.anInt2380] = i;
					Class4_Sub21.anInt2380 = i_2_;
				}
			}
			anInt468++;
			arg0.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ee.keyTyped(" + (arg0 != null ? "{...}" : "null") + ')'));
		}
	}
}
