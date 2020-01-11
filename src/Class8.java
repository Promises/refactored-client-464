/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class8 {
	public static byte[] aByteArray258;
	public static byte[][] aByteArrayArray254;
	public static JagexString aJagexString_240;
	public static JagexString aJagexString_242 = JagexString.getRs2PreparedString(
			"Benutzen");
	public static JagexString aJagexString_243;
	public static JagexString aJagexString_247;
	public static JagexString aJagexString_250;
	public static JagexString aJagexString_256;
	public static Class4_Sub20_Sub12_Sub1[] aClass4_Sub20_Sub12_Sub1Array262;
	public static Class4_Sub20_Sub12_Sub2[] aClass4_Sub20_Sub12_Sub2Array253;
	public static Class4_Sub20_Sub7_Sub2[] aClass4_Sub20_Sub7_Sub2Array257;
	public static Class65 aClass65_252;
	public static Class66 aClass66_259;
	public static Class8 aClass8_251;
	public static int anInt239;
	public static int anInt241;
	public static int anInt244;
	public static int anInt246;
	public static int anInt248;
	public static int anInt249;
	public static int anInt260;
	public static int anInt261;
	static {
		aJagexString_240 = JagexString.getRs2PreparedString("<)4col>");
		aJagexString_247 = JagexString.getRs2PreparedString(
				"Unexpected server response");
		aJagexString_243 = JagexString.getRs2PreparedString(" weitere Optionen");
		aByteArrayArray254 = new byte[250][];
		aJagexString_250 = aJagexString_247;
		anInt244 = 0;
		aJagexString_256 = JagexString.getRs2PreparedString(
				"da dieser Computer gegen unsere ");
		aClass4_Sub20_Sub7_Sub2Array257 = new Class4_Sub20_Sub7_Sub2[4];
		aClass65_252 = new Class65();
		aByteArray258 = new byte[520];
		aClass66_259 = new Class66(64);
		anInt261 = 0;
	}

	public static void method659(byte arg0) {
		try {
			aJagexString_240 = null;
			aJagexString_242 = null;
			aClass8_251 = null;
			aClass66_259 = null;
			aClass4_Sub20_Sub7_Sub2Array257 = null;
			aByteArrayArray254 = null;
			aClass65_252 = null;
			aJagexString_256 = null;
			aJagexString_243 = null;
			aByteArray258 = null;
			aJagexString_247 = null;
			aClass4_Sub20_Sub12_Sub2Array253 = null;
			aClass4_Sub20_Sub12_Sub1Array262 = null;
			aJagexString_250 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "be.B("
					+ arg0 + ')');
		}
	}

	public int anInt238;

	public int anInt255;

	public int[][] anIntArrayArray245;

	public Class8(int arg0, int arg1) {
		try {
			if ((arg1 ^ 0xffffffff) != (arg0 ^ 0xffffffff)) {
				int i = Class13.method685(arg1, -113, arg0);
				arg1 /= i;
				anInt238 = arg1;
				arg0 /= i;
				anIntArrayArray245 = new int[arg0][14];
				anInt255 = arg0;
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (arg0 ^ 0xffffffff); i_9_++) {
					int[] is = anIntArrayArray245[i_9_];
					double d = 6.0 + (double) i_9_ / (double) arg0;
					int i_10_ = (int) Math.floor(1.0 + (d - 7.0));
					if (i_10_ < 0)
						i_10_ = 0;
					int i_11_ = (int) Math.ceil(7.0 + d);
					if ((i_11_ ^ 0xffffffff) < -15)
						i_11_ = 14;
					double d_12_ = (double) arg1 / (double) arg0;
					for (/**/; i_11_ > i_10_; i_10_++) {
						double d_13_ = d_12_;
						double d_14_ = (i_10_ - d) * 3.141592653589793;
						if (d_14_ < -1.0E-4 || d_14_ > 1.0E-4)
							d_13_ *= Math.sin(d_14_) / d_14_;
						d_13_ *= (Math.cos(0.2243994752564138 * (i_10_ - d)) * 0.46 + 0.54);
						is[i_10_] = (int) Math.floor(0.5 + d_13_ * 65536.0);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("be.<init>(" + arg0 + ',' + arg1 + ')'));
		}
	}

	public byte[] method657(byte[] arg0, int arg1) {
		try {
			if (arg1 != 0)
				method657(null, -66);
			if (anIntArrayArray245 != null) {
				int i = 14 + (int) ((long) anInt238 * (long) arg0.length / anInt255);
				int[] is = new int[i];
				int i_0_ = 0;
				int i_1_ = 0;
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (arg0.length ^ 0xffffffff); i_2_++) {
					int[] is_3_ = anIntArrayArray245[i_0_];
					int i_4_ = arg0[i_2_];
					for (int i_5_ = 0; i_5_ < 14; i_5_++)
						is[i_5_ + i_1_] += i_4_ * is_3_[i_5_];
					i_0_ += anInt238;
					int i_6_ = i_0_ / anInt255;
					i_0_ -= i_6_ * anInt255;
					i_1_ += i_6_;
				}
				arg0 = new byte[i];
				for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i ^ 0xffffffff); i_7_++) {
					int i_8_ = is[i_7_] + 32768 >> -2014042704;
					if ((i_8_ ^ 0xffffffff) > 127)
						arg0[i_7_] = (byte) -128;
					else if ((i_8_ ^ 0xffffffff) < -128)
						arg0[i_7_] = (byte) 127;
					else
						arg0[i_7_] = (byte) i_8_;
				}
			}
			anInt239++;
			return arg0;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("be.C("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
		}
	}

	public int method658(int arg0, int arg1) {
		try {
			if (anIntArrayArray245 != null)
				arg1 = (int) ((long) anInt238 * (long) arg1 / anInt255);
			if (arg0 != -1006)
				method660(85, 75);
			anInt241++;
			return arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("be.A("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public int method660(int arg0, int arg1) {
		try {
			anInt246++;
			if (arg0 != 31942)
				aJagexString_243 = null;
			if (anIntArrayArray245 != null)
				arg1 = 6 + (int) ((long) arg1 * (long) anInt238 / anInt255);
			return arg1;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("be.D("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
