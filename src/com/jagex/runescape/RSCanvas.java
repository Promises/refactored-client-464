package com.jagex.runescape;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public class RSCanvas extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5056248253557586967L;
	public static Class16 aClass16_47;
	public static JagexString aJagexString_45 = JagexString.getRs2PreparedString(
			" Sekunde(Xn(Y -Ubertragen)3");
	public static JagexString aJagexString_55;
	public static JagexString aJagexString_58;
	public static JagexString[] aJagexStringArray59;
	public static int anInt46;
	public static int anInt48;
	public static int anInt49;
	public static int anInt50;
	public static int anInt51;
	public static int anInt52;
	public static int anInt53 = 0;
	public static int anInt56;
	public Component component;
	static {
		aClass16_47 = new Class16(32);
		aJagexString_55 = JagexString.getRs2PreparedString("FULL");
		anInt56 = 0;
		aJagexString_58 = aJagexString_55;
	}

	public static int method32(boolean arg0, int arg1) {
		try {
			anInt52++;
			if (arg0 != true)
				return 122;
			return (arg1 & 0xfaf52) >> -715614287;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ob.D("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static void method33(Class19 arg0, Class19 arg1, byte arg2,
			Class19 arg3) {
		try {
			Class4_Sub20_Sub10.aClass19_3062 = arg0;
			anInt50++;
			Class4_Sub20_Sub7_Sub4.aClass19_3371 = arg1;
			Class4_Sub20_Sub5.aClass19_2892 = arg3;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ob.C("
					+ (arg0 != null ? "{...}" : "null") + ','
					+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static boolean method34(int arg0) {
		try {
			anInt48++;
			synchronized (Class4_Sub14.aClass18_2272) {
				if ((Class4_Sub20_Sub10.anInt3060 ^ 0xffffffff) == (Class4_Sub20_Sub10.anInt3057 ^ 0xffffffff))
					return false;
				Class4_Sub15.anInt2298 = Class58.anIntArray1167[Class4_Sub20_Sub10.anInt3057];
				Class48.anInt980 = Class4_Sub8.anIntArray1980[Class4_Sub20_Sub10.anInt3057];
				Class4_Sub20_Sub10.anInt3057 = arg0
						& Class4_Sub20_Sub10.anInt3057 - -1;
				return true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ob.B("
					+ arg0 + ')');
		}
	}

	public static void method35(byte arg0) {
		aClass16_47 = null;
		aJagexString_55 = null;
		aJagexStringArray59 = null;
		aJagexString_45 = null;
		aJagexString_58 = null;
		if (arg0 != 7)
			method34(-88);
	}

	public RSCanvas(Component comp) {
		try {
			this.component = comp;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ob.<init>(" + (comp != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public void paint(Graphics g) {
		try {
			anInt46++;
			component.paint(g);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ob.paint(" + (g != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public void update(Graphics g) {
		try {
			anInt51++;
			component.update(g);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ob.update(" + (g != null ? "{...}" : "null") + ')'));
		}
	}
}
