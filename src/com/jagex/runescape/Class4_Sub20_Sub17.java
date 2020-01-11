package com.jagex.runescape;
import com.jagex.runescape.net.StreamBuffer;

import java.io.IOException;

public class Class4_Sub20_Sub17 extends Class4_Sub20 {
	public static byte aByte3194;
	public static JagexString aJagexString_3197 = JagexString.getRs2PreparedString("(U5"
    );
	public static JagexString aJagexString_3210;
	public static JagexString aJagexString_3214 = JagexString.getRs2PreparedString("runes"
    );
	public static Class76 aClass76_3189;
	public static int anInt3185;
	public static int anInt3187;
	public static int anInt3192;
	public static int anInt3193;
	public static int anInt3195;
	public static int anInt3198;
	public static int anInt3203;
	public static int anInt3204;
	public static int anInt3207;
	public static int anInt3209;
	public static int anInt3212;
	public static int anInt3213;
	public static int anInt3215;
	public static int anInt3216;
	public static int[] anIntArray3206;
	static {
		aJagexString_3210 = JagexString.getRs2PreparedString("<img=1>");
	}

	public static void method615(byte arg0) {
		try {
			aJagexString_3197 = null;
			aJagexString_3210 = null;
			aJagexString_3214 = null;
			aClass76_3189 = null;
			if (arg0 != -80)
				aJagexString_3210 = null;
			anIntArray3206 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "uc.B("
					+ arg0 + ')');
		}
	}

	public static boolean method618(byte arg0) {
		try {
			anInt3192++;
			long l = Class52.method1002((byte) -42);
			int i = (int) (-Class4_Sub2_Sub1.aLong2594 + l);
			if (i > 200)
				i = 200;
			Class4_Sub2_Sub1.aLong2594 = l;
			Class71.anInt1472 += i;
			if (Class5.anInt188 == 0 && Class63.anInt1245 == 0
					&& Class76.anInt1581 == 0
					&& (Class31.anInt686 ^ 0xffffffff) == -1)
				return true;
			if (Class4_Sub20_Sub9.aClass76_3047 == null)
				return false;
			try {
				if (Class71.anInt1472 > 30000)
					throw new IOException();
				while (Class63.anInt1245 < 20) {
					if (Class31.anInt686 <= 0)
						break;
					Class4_Sub20_Sub10 class4_sub20_sub10 = (Class4_Sub20_Sub10) Class4_Sub20_Sub9.aClass16_3038
							.method724((byte) 54);
					StreamBuffer class4_sub11 = new StreamBuffer(4);
					class4_sub11.method227((byte) -27, 1);
					class4_sub11.method231((int) class4_sub20_sub10.aLong150,
							-89);
					Class4_Sub20_Sub9.aClass76_3047.method1183(4, 0, 121,
							class4_sub11.byteBuffer);
					RSCanvas.aClass16_47.method720(class4_sub20_sub10,
							(class4_sub20_sub10.aLong150), false);
					Class63.anInt1245++;
					Class31.anInt686--;
				}
				for (/**/; ((Class5.anInt188 ^ 0xffffffff) > -21 && Class76.anInt1581 > 0); Class76.anInt1581--) {
					Class4_Sub20_Sub10 class4_sub20_sub10 = ((Class4_Sub20_Sub10) Region.aClass1_103
							.method37((byte) -122));
					StreamBuffer class4_sub11 = new StreamBuffer(4);
					class4_sub11.method227((byte) -27, 0);
					class4_sub11.method231((int) class4_sub20_sub10.aLong150,
							115);
					Class4_Sub20_Sub9.aClass76_3047.method1183(4, 0, 125,
							class4_sub11.byteBuffer);
					class4_sub20_sub10.method320(-1);
					Class4_Sub10.aClass16_2045.method720(class4_sub20_sub10,
							(class4_sub20_sub10.aLong150), false);
					Class5.anInt188++;
				}
				for (int i_5_ = 0; i_5_ < 100; i_5_++) {
					int i_6_ = Class4_Sub20_Sub9.aClass76_3047.method1189(true);
					if ((i_6_ ^ 0xffffffff) > -1)
						throw new IOException();
					if (i_6_ == 0)
						break;
					Class71.anInt1472 = 0;
					int i_7_ = 0;
					if (Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990 != null) {
						if (Class71.anInt1477 == 0)
							i_7_ = 1;
					} else
						i_7_ = 8;
					if (i_7_ > 0) {
						int i_8_ = -Class74.aClass4_Sub11_1516.pointion + i_7_;
						if ((i_8_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
							i_8_ = i_6_;
						Class4_Sub20_Sub9.aClass76_3047.method1186(
								Class74.aClass4_Sub11_1516.byteBuffer, 106,
								Class74.aClass4_Sub11_1516.pointion, i_8_);
						if (Class9.aByte280 != 0) {
							for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
								Class74.aClass4_Sub11_1516.byteBuffer[(Class74.aClass4_Sub11_1516.pointion + i_9_)] = (byte) (Class18
										.method732(
												(Class74.aClass4_Sub11_1516.byteBuffer[(Class74.aClass4_Sub11_1516.pointion)
														+ i_9_]),
												Class9.aByte280));
						}
						Class74.aClass4_Sub11_1516.pointion += i_8_;
						if ((i_7_ ^ 0xffffffff) < (Class74.aClass4_Sub11_1516.pointion ^ 0xffffffff))
							break;
						if (Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990 == null) {
							Class74.aClass4_Sub11_1516.pointion = 0;
							int i_10_ = Class74.aClass4_Sub11_1516.get();
							int i_11_ = Class74.aClass4_Sub11_1516
									.method209((byte) -116);
							int i_12_ = Class74.aClass4_Sub11_1516.get();
							int i_13_ = Class74.aClass4_Sub11_1516
									.method219((byte) 73);
							long l_14_ = (i_11_ + (i_10_ << 2045283280));
							Class4_Sub20_Sub10 class4_sub20_sub10 = ((Class4_Sub20_Sub10) RSCanvas.aClass16_47
									.method725((byte) 117, l_14_));
							Class4_Sub20_Sub4.aBoolean2857 = true;
							if (class4_sub20_sub10 == null) {
								class4_sub20_sub10 = ((Class4_Sub20_Sub10) Class4_Sub10.aClass16_2045
										.method725((byte) 117, l_14_));
								Class4_Sub20_Sub4.aBoolean2857 = false;
							}
							if (class4_sub20_sub10 == null)
								throw new IOException();
							Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990 = class4_sub20_sub10;
							int i_15_ = i_12_ == 0 ? 5 : 9;
							Class40.aClass4_Sub11_783 = new StreamBuffer(
									(Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990.aByte3052)
											+ (i_13_ - -i_15_));
							Class40.aClass4_Sub11_783.method227((byte) -27,
									i_12_);
							Class40.aClass4_Sub11_783.method236(181, i_13_);
							Class71.anInt1477 = 8;
							Class74.aClass4_Sub11_1516.pointion = 0;
						} else if ((Class71.anInt1477 ^ 0xffffffff) == -1) {
							if (Class74.aClass4_Sub11_1516.byteBuffer[0] != -1)
								Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990 = null;
							else {
								Class71.anInt1477 = 1;
								Class74.aClass4_Sub11_1516.pointion = 0;
							}
						}
					} else {
						int i_16_ = (-(Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990.aByte3052) + (Class40.aClass4_Sub11_783.byteBuffer).length);
						int i_17_ = -Class71.anInt1477 + 512;
						if (-Class40.aClass4_Sub11_783.pointion + i_16_ < i_17_)
							i_17_ = i_16_ + -Class40.aClass4_Sub11_783.pointion;
						if ((i_6_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff))
							i_17_ = i_6_;
						Class4_Sub20_Sub9.aClass76_3047.method1186(
								Class40.aClass4_Sub11_783.byteBuffer, 108,
								Class40.aClass4_Sub11_783.pointion, i_17_);
						if (Class9.aByte280 != 0) {
							for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff); i_18_++)
								Class40.aClass4_Sub11_783.byteBuffer[(Class40.aClass4_Sub11_783.pointion - -i_18_)] = (byte) (Class18
										.method732(
												(Class40.aClass4_Sub11_783.byteBuffer[(Class40.aClass4_Sub11_783.pointion)
														+ i_18_]),
												Class9.aByte280));
						}
						Class40.aClass4_Sub11_783.pointion += i_17_;
						Class71.anInt1477 += i_17_;
						if ((i_16_ ^ 0xffffffff) != (Class40.aClass4_Sub11_783.pointion ^ 0xffffffff)) {
							if ((Class71.anInt1477 ^ 0xffffffff) != -513)
								break;
							Class71.anInt1477 = 0;
						} else {
							if (((Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990.aLong150) ^ 0xffffffffffffffffL) == -16711936L) {
								Class4_Sub20.aClass4_Sub11_2363 = Class40.aClass4_Sub11_783;
								for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -257; i_19_++) {
									Class19_Sub1 class19_sub1 = (SceneGraph.aClass19_Sub1Array2492[i_19_]);
									if (class19_sub1 != null) {
										Class4_Sub20.aClass4_Sub11_2363.pointion = 5 + i_19_ * 8;
										int i_20_ = Class4_Sub20.aClass4_Sub11_2363
												.method219((byte) 73);
										int i_21_ = Class4_Sub20.aClass4_Sub11_2363
												.method219((byte) 73);
										class19_sub1.method760(i_21_, 255,
												i_20_);
									}
								}
							} else {
								Class4_Sub11_Sub1.aCRC32_2688.reset();
								Class4_Sub11_Sub1.aCRC32_2688.update(
										Class40.aClass4_Sub11_783.byteBuffer,
										0, i_16_);
								int i_22_ = (int) Class4_Sub11_Sub1.aCRC32_2688
										.getValue();
								if ((i_22_ ^ 0xffffffff) != ((Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990.anInt3070) ^ 0xffffffff)) {
									try {
										Class4_Sub20_Sub9.aClass76_3047
												.method1181(-31709);
									} catch (Exception exception) {
										/* empty */
									}
									Class9.aByte280 = (byte) (int) (1.0 + (Math
											.random() * 255.0));
									Class27.anInt627++;
									Class4_Sub20_Sub9.aClass76_3047 = null;
									return false;
								}
								Class4_Sub20_Sub16.anInt3164 = 0;
								Class27.anInt627 = 0;
								Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990.aClass19_Sub1_3061
										.method766(
												(((Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990.aLong150) & 0xff0000L) ^ 0xffffffffffffffffL) == -16711681L,
												true,
												(int) (0xffffL & (Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990.aLong150)),
												Class4_Sub20_Sub4.aBoolean2857,
												Class40.aClass4_Sub11_783.byteBuffer);
							}
							Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990
									.clear();
							if (!Class4_Sub20_Sub4.aBoolean2857)
								Class5.anInt188--;
							else
								Class63.anInt1245--;
							Class71.anInt1477 = 0;
							Class4_Sub20_Sub8.aClass4_Sub20_Sub10_2990 = null;
							Class40.aClass4_Sub11_783 = null;
						}
					}
				}
				return true;
			} catch (IOException ioexception) {
				try {
					Class4_Sub20_Sub9.aClass76_3047.method1181(-31709);
				} catch (Exception exception) {
					/* empty */
				}
				Class4_Sub20_Sub16.anInt3164++;
				Class4_Sub20_Sub9.aClass76_3047 = null;
				return false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "uc.D("
					+ arg0 + ')');
		}
	}

	public static void method621(int arg0, int arg1, int arg2, int arg3,
			int arg4) {
		try {
			for (int i = 0; (SceneGraph.anInt2493 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if ((Class24.anIntArray568[i] - -Class77.anIntArray1585[i] > arg3)
						&& (arg2 + arg3 ^ 0xffffffff) < (Class24.anIntArray568[i] ^ 0xffffffff)
						&& ((arg0 ^ 0xffffffff) > ((Class4_Sub20_Sub7_Sub1.anIntArray3268[i] + Class42.anIntArray852[i]) ^ 0xffffffff))
						&& ((Class42.anIntArray852[i] ^ 0xffffffff) > (arg0
								+ arg4 ^ 0xffffffff)))
					Class4_Sub20_Sub11.aBooleanArray3083[i] = true;
			}
			if (arg1 == 16052)
				anInt3209++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("uc.J(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3
							+ ',' + arg4 + ')'));
		}
	}

	public boolean aBoolean3186 = false;
	public int anInt3183;
	public int anInt3184;
	public int anInt3188;
	public int anInt3191;
	public int anInt3196;
	public int anInt3201;
	public int anInt3202;
	public int anInt3208;
	public int[] anIntArray3190;

	public int[] anIntArray3199;

	public int[] anIntArray3200;

	public int[] anIntArray3205;

	public int[] anIntArray3211;

	public Class4_Sub20_Sub17() {
		anInt3183 = -1;
		anInt3184 = 99;
		anInt3191 = 2;
		anInt3188 = -1;
		anInt3196 = -1;
		anInt3201 = -1;
		anInt3202 = -1;
		anInt3208 = 5;
	}

	public Class4_Sub20_Sub7_Sub7 method612(byte arg0, int arg1,
			Class4_Sub20_Sub7_Sub7 arg2) {
		try {
			anInt3213++;
			arg1 = anIntArray3211[arg1];
			Class4_Sub20_Sub14 class4_sub20_sub14 = Class74.method1169(
					(byte) 42, arg1 >> 1972575248);
			arg1 &= 0xffff;
			if (class4_sub20_sub14 == null)
				return arg2.method452(true);
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = arg2
					.method452(!class4_sub20_sub14.method598((byte) 74, arg1));
			class4_sub20_sub7_sub7.method453(class4_sub20_sub14, arg1);
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("uc.A("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub7 method613(Class4_Sub20_Sub7_Sub7 arg0,
			int arg1, byte arg2) {
		try {
			anInt3207++;
			int i_0_ = anIntArray3211[arg1];
			Class4_Sub20_Sub14 class4_sub20_sub14 = Class74.method1169(
					(byte) 44, i_0_ >> 318222256);
			i_0_ &= 0xffff;
			if (class4_sub20_sub14 == null)
				return arg0.method452(true);
			Class4_Sub20_Sub14 class4_sub20_sub14_1_ = null;
			int i_2_ = 0;
			if (anIntArray3190 != null
					&& (anIntArray3190.length ^ 0xffffffff) < (arg1 ^ 0xffffffff)) {
				i_2_ = anIntArray3190[arg1];
				class4_sub20_sub14_1_ = Class74.method1169((byte) 108,
						i_2_ >> -1997644272);
				i_2_ &= 0xffff;
			}
			if (class4_sub20_sub14_1_ == null || i_2_ == 65535) {
				Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = arg0
						.method452(!class4_sub20_sub14.method598((byte) 74,
								i_0_));
				class4_sub20_sub7_sub7.method453(class4_sub20_sub14, i_0_);
				return class4_sub20_sub7_sub7;
			}
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = arg0
					.method452(!class4_sub20_sub14.method598((byte) 74, i_0_)
							& !class4_sub20_sub14_1_.method598((byte) 74, i_2_));
			class4_sub20_sub7_sub7.method453(class4_sub20_sub14, i_0_);
			class4_sub20_sub7_sub7.method453(class4_sub20_sub14_1_, i_2_);
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("uc.H("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ arg2 + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub7 method614(Class4_Sub20_Sub7_Sub7 arg0,
			int arg1, Class4_Sub20_Sub17 arg2, int arg3, int arg4) {
		try {
			arg3 = anIntArray3211[arg3];
			anInt3185++;
			Class4_Sub20_Sub14 class4_sub20_sub14 = Class74.method1169(
					(byte) 67, arg3 >> -1527292048);
			arg3 &= 0xffff;
			if (class4_sub20_sub14 == null)
				return arg2.method612((byte) 72, arg1, arg0);
			arg1 = arg2.anIntArray3211[arg1];
			Class4_Sub20_Sub14 class4_sub20_sub14_3_ = Class74.method1169(
					(byte) 63, arg1 >> 521894672);
			if (arg4 != 24073)
				return null;
			arg1 &= 0xffff;
			if (class4_sub20_sub14_3_ == null) {
				Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = arg0
						.method452(!class4_sub20_sub14.method598((byte) 74,
								arg3));
				class4_sub20_sub7_sub7.method453(class4_sub20_sub14, arg3);
				return class4_sub20_sub7_sub7;
			}
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = arg0
					.method452(!class4_sub20_sub14.method598((byte) 74, arg3)
							& !class4_sub20_sub14_3_.method598((byte) 74, arg1));
			class4_sub20_sub7_sub7.method436(class4_sub20_sub14, arg3,
					class4_sub20_sub14_3_, arg1, anIntArray3205);
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("uc.E("
					+ (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
					+ arg4 + ')'));
		}
	}

	public Class4_Sub20_Sub7_Sub7 method616(int arg0, int arg1,
			Class4_Sub20_Sub7_Sub7 arg2, int arg3) {
		try {
			anInt3187++;
			arg0 = anIntArray3211[arg0];
			Class4_Sub20_Sub14 class4_sub20_sub14 = Class74.method1169(
					(byte) 62, arg0 >> -550265968);
			arg0 &= 0xffff;
			if (class4_sub20_sub14 == null)
				return arg2.method452(true);
			arg1 &= 0x3;
			if (arg3 != 30000)
				anIntArray3200 = null;
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = arg2
					.method452(!class4_sub20_sub14.method598((byte) 74, arg0));
			if ((arg1 ^ 0xffffffff) == -2)
				class4_sub20_sub7_sub7.method449();
			else if (arg1 != 2) {
				if ((arg1 ^ 0xffffffff) == -4)
					class4_sub20_sub7_sub7.method444();
			} else
				class4_sub20_sub7_sub7.method440();
			class4_sub20_sub7_sub7.method453(class4_sub20_sub14, arg0);
			if ((arg1 ^ 0xffffffff) == -2)
				class4_sub20_sub7_sub7.method444();
			else if (arg1 != 2) {
				if (arg1 == 3)
					class4_sub20_sub7_sub7.method449();
			} else
				class4_sub20_sub7_sub7.method440();
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("uc.K("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public void method617(int arg0) {
		anInt3212++;
		if (anInt3183 == -1) {
			if (anIntArray3205 == null)
				anInt3183 = 0;
			else
				anInt3183 = 2;
		}
		if ((anInt3188 ^ 0xffffffff) == arg0) {
			if (anIntArray3205 != null)
				anInt3188 = 2;
			else
				anInt3188 = 0;
		}
	}

	public Class4_Sub20_Sub7_Sub7 method619(byte arg0, int arg1,
			Class4_Sub20_Sub7_Sub7 arg2) {
		try {
			arg1 = anIntArray3211[arg1];
			anInt3198++;
			if (arg0 != -77)
				method613(null, 88, (byte) -94);
			Class4_Sub20_Sub14 class4_sub20_sub14 = Class74.method1169(
					(byte) 86, arg1 >> 2144459344);
			arg1 &= 0xffff;
			if (class4_sub20_sub14 == null)
				return arg2.method443(true);
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = arg2
					.method443(!class4_sub20_sub14.method598((byte) 74, arg1));
			class4_sub20_sub7_sub7.method453(class4_sub20_sub14, arg1);
			return class4_sub20_sub7_sub7;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("uc.C("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method620(byte arg0, StreamBuffer arg1) {
		try {
			if (arg0 != -59)
				method612((byte) -102, 81, null);
			anInt3215++;
			for (;;) {
				int i = arg1.get();
				if (i == 0)
					break;
				method622(i, false, arg1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("uc.I("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method622(int arg0, boolean arg1, StreamBuffer arg2) {
		try {
			if (arg1 == false) {
				if (arg0 == 1) {
					int i = arg2.method209((byte) -110);
					anIntArray3200 = new int[i];
					for (int i_23_ = 0; i_23_ < i; i_23_++)
						anIntArray3200[i_23_] = arg2.method209((byte) -113);
					anIntArray3211 = new int[i];
					for (int i_24_ = 0; i > i_24_; i_24_++)
						anIntArray3211[i_24_] = arg2.method209((byte) -104);
					for (int i_25_ = 0; i > i_25_; i_25_++)
						anIntArray3211[i_25_] = ((arg2.method209((byte) -103) << 96142256) + anIntArray3211[i_25_]);
				} else if ((arg0 ^ 0xffffffff) == -3)
					anInt3202 = arg2.method209((byte) -109);
				else if (arg0 == 3) {
					int i = arg2.get();
					anIntArray3205 = new int[1 + i];
					for (int i_26_ = 0; i_26_ < i; i_26_++)
						anIntArray3205[i_26_] = arg2.get();
					anIntArray3205[i] = 9999999;
				} else if ((arg0 ^ 0xffffffff) == -5)
					aBoolean3186 = true;
				else if ((arg0 ^ 0xffffffff) != -6) {
					if (arg0 == 6)
						anInt3196 = arg2.method209((byte) -108);
					else if ((arg0 ^ 0xffffffff) == -8)
						anInt3201 = arg2.method209((byte) -100);
					else if ((arg0 ^ 0xffffffff) != -9) {
						if (arg0 == 9)
							anInt3183 = arg2.get();
						else if (arg0 != 10) {
							if ((arg0 ^ 0xffffffff) == -12)
								anInt3191 = arg2.get();
							else if (arg0 == 12) {
								int i = arg2.get();
								anIntArray3190 = new int[i];
								for (int i_27_ = 0; (i ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++)
									anIntArray3190[i_27_] = arg2
											.method209((byte) -118);
								for (int i_28_ = 0; (i ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++)
									anIntArray3190[i_28_] = ((arg2
											.method209((byte) -110) << -1272687728) + anIntArray3190[i_28_]);
							} else if ((arg0 ^ 0xffffffff) == -14) {
								int i = arg2.get();
								anIntArray3199 = new int[i];
								for (int i_29_ = 0; i > i_29_; i_29_++)
									anIntArray3199[i_29_] = arg2
											.method248(arg1);
							}
						} else
							anInt3188 = arg2.get();
					} else
						anInt3184 = arg2.get();
				} else
					anInt3208 = arg2.get();
				anInt3193++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("uc.F("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}
}
