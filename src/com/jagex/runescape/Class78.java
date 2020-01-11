package com.jagex.runescape;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class78 {
	public static JagexString aJagexString_1603;
	public static JagexString aJagexString_1605;
	public static JagexString aJagexString_1606;
	public static JagexString aJagexString_1608;
	public static int anInt1598;
	public static int anInt1599;
	public static int anInt1600;
	public static int anInt1601;
	public static int anInt1602;
	public static int anInt1604 = 0;
	public static int[] anIntArray1607;

	static {
		anInt1598 = 0;
		anInt1599 = 0;
		aJagexString_1603 = JagexString.getRs2PreparedString("gelb:");
		aJagexString_1606 = JagexString.getRs2PreparedString("p12_full");
		aJagexString_1608 = JagexString.getRs2PreparedString(
				"Geben Sie Ihren Benutzernamen");
		anIntArray1607 = new int[5];
		aJagexString_1605 = JagexString.getRs2PreparedString("nav");
	}

	public static void method1194(int arg0) {
		try {
			aJagexString_1608 = null;
			aJagexString_1606 = null;
			aJagexString_1605 = null;
			anIntArray1607 = null;
			aJagexString_1603 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ve.D("
					+ arg0 + ')');
		}
	}

	public static void method1195(int arg0, int arg1, boolean arg2) {
		try {
			RS2Font.anInt2761++;
			if (arg2 == false) {
				anInt1601++;
				Class66.aClass4_Sub11_Sub1_1328.method264(240, 114);
				Class66.aClass4_Sub11_Sub1_1328.method236(181, arg1); // put int
				Class66.aClass4_Sub11_Sub1_1328.method224(13421, arg0); // addLEShort()
				System.out.println("arg1: " + arg1 + " arg0: " + arg0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ve.A("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static void method1196(byte arg0) {
		anInt1602++;
		int i = Class4_Sub20_Sub7_Sub1.anInt3255 * 128 - -64;
		int i_0_ = 64 + Class71.anInt1479 * 128;
		int i_1_ = (Class67.method1090(i, i_0_, true, Class82.anInt1711) + -Class4_Sub12.anInt2127);
		if (Class6.anInt209 < i) {
			Class6.anInt209 += Class1.anInt60
					+ (Class4_Sub20_Sub17.anInt3216 * (i + -Class6.anInt209) / 1000);
			if (Class6.anInt209 > i)
				Class6.anInt209 = i;
		}
		if (i < Class6.anInt209) {
			Class6.anInt209 -= ((-i + Class6.anInt209)
					* Class4_Sub20_Sub17.anInt3216 / 1000)
					+ Class1.anInt60;
			if (Class6.anInt209 < i)
				Class6.anInt209 = i;
		}
		if (Class33.anInt708 < i_0_) {
			Class33.anInt708 += Class1.anInt60
					- -((-Class33.anInt708 + i_0_)
							* Class4_Sub20_Sub17.anInt3216 / 1000);
			if (i_0_ < Class33.anInt708)
				Class33.anInt708 = i_0_;
		}
		if (arg0 <= 105)
			method1195(-92, 41, false);
		i = 128 * Class12.anInt348 - -64;
		if ((i_0_ ^ 0xffffffff) > (Class33.anInt708 ^ 0xffffffff)) {
			Class33.anInt708 -= Class1.anInt60
					+ (Class4_Sub20_Sub17.anInt3216
							* (Class33.anInt708 + -i_0_) / 1000);
			if ((i_0_ ^ 0xffffffff) < (Class33.anInt708 ^ 0xffffffff))
				Class33.anInt708 = i_0_;
		}
		if ((i_1_ ^ 0xffffffff) < (RSInterface.anInt2176 ^ 0xffffffff)) {
			RSInterface.anInt2176 += Class1.anInt60
					- -(Class4_Sub20_Sub17.anInt3216
							* (-RSInterface.anInt2176 + i_1_) / 1000);
			if ((RSInterface.anInt2176 ^ 0xffffffff) < (i_1_ ^ 0xffffffff))
				RSInterface.anInt2176 = i_1_;
		}
		i_0_ = Class14.anInt399 * 128 + 64;
		if ((RSInterface.anInt2176 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
			RSInterface.anInt2176 -= ((RSInterface.anInt2176 - i_1_)
					* Class4_Sub20_Sub17.anInt3216 / 1000)
					+ Class1.anInt60;
			if ((RSInterface.anInt2176 ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
				RSInterface.anInt2176 = i_1_;
		}
		i_1_ = (Class67.method1090(i, i_0_, true, Class82.anInt1711) + -Class8.anInt260);
		int i_2_ = i_1_ + -RSInterface.anInt2176;
		int i_3_ = -Class6.anInt209 + i;
		int i_4_ = i_0_ - Class33.anInt708;
		int i_5_ = (int) Math.sqrt((i_4_ * i_4_ + i_3_ * i_3_));
		int i_6_ = ((int) (Math.atan2(i_2_, i_5_) * 325.949) & 0x7ff);
		if ((i_6_ ^ 0xffffffff) > -129)
			i_6_ = 128;
		int i_7_ = 0x7ff & (int) (-325.949 * Math.atan2(i_3_, i_4_));
		int i_8_ = -Class4_Sub6.anInt1941 + i_7_;
		if ((i_6_ ^ 0xffffffff) < -384)
			i_6_ = 383;
		if (i_8_ > 1024)
			i_8_ -= 2048;
		if (Class4_Sub20_Sub13.anInt3131 < i_6_) {
			Class4_Sub20_Sub13.anInt3131 += (Class52.anInt1058
					* (-Class4_Sub20_Sub13.anInt3131 + i_6_) / 1000)
					+ Class18.anInt471;
			if ((Class4_Sub20_Sub13.anInt3131 ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
				Class4_Sub20_Sub13.anInt3131 = i_6_;
		}
		if (Class4_Sub20_Sub13.anInt3131 > i_6_) {
			Class4_Sub20_Sub13.anInt3131 -= ((Class4_Sub20_Sub13.anInt3131 - i_6_)
					* Class52.anInt1058 / 1000)
					+ Class18.anInt471;
			if (Class4_Sub20_Sub13.anInt3131 < i_6_)
				Class4_Sub20_Sub13.anInt3131 = i_6_;
		}
		if ((i_8_ ^ 0xffffffff) > 1023)
			i_8_ += 2048;
		if ((i_8_ ^ 0xffffffff) < -1) {
			Class4_Sub6.anInt1941 += Class52.anInt1058 * i_8_ / 1000
					+ Class18.anInt471;
			Class4_Sub6.anInt1941 &= 0x7ff;
		}
		if ((i_8_ ^ 0xffffffff) > -1) {
			Class4_Sub6.anInt1941 -= Class18.anInt471
					- -(Class52.anInt1058 * -i_8_ / 1000);
			Class4_Sub6.anInt1941 &= 0x7ff;
		}
		int i_9_ = -Class4_Sub6.anInt1941 + i_7_;
		if ((i_9_ ^ 0xffffffff) < -1025)
			i_9_ -= 2048;
		if (i_9_ < -1024)
			i_9_ += 2048;
		if ((i_9_ ^ 0xffffffff) > -1 && (i_8_ ^ 0xffffffff) < -1 || i_9_ > 0
				&& i_8_ < 0)
			Class4_Sub6.anInt1941 = i_7_;
	}

	public static void method1197(int arg0, byte arg1, Class4_Sub11_Sub1 arg2) {
		try {
			if (arg1 == -61) {
				anInt1600++;
				for (;;) {
					Class4_Sub6 class4_sub6 = ((Class4_Sub6) Class8.aClass65_252
							.method1071(arg1 ^ 0x41));
					if (class4_sub6 == null)
						break;
					boolean bool = false;
					for (int i = 0; i < class4_sub6.anInt1916; i++) {
						if (class4_sub6.aClass22Array1940[i] != null) {
							if (class4_sub6.aClass22Array1940[i].anInt545 == 2)
								class4_sub6.anIntArray1926[i] = -5;
							if (class4_sub6.aClass22Array1940[i].anInt545 == 0)
								bool = true;
						}
						if (class4_sub6.aClass22Array1927[i] != null) {
							if ((class4_sub6.aClass22Array1927[i].anInt545 ^ 0xffffffff) == -3)
								class4_sub6.anIntArray1926[i] = -6;
							if ((class4_sub6.aClass22Array1927[i].anInt545 ^ 0xffffffff) == -1)
								bool = true;
						}
					}
					if (bool)
						break;
					arg2.method264(arg0, 108);
					arg2.method227((byte) -27, 0);
					int i = arg2.pointion;
					arg2.method236(181, class4_sub6.anInt1937);
					for (int i_10_ = 0; ((i_10_ ^ 0xffffffff) > (class4_sub6.anInt1916 ^ 0xffffffff)); i_10_++) {
						if ((class4_sub6.anIntArray1926[i_10_] ^ 0xffffffff) != -1)
							arg2.method227((byte) -27,
									class4_sub6.anIntArray1926[i_10_]);
						else {
							try {
								int i_11_ = class4_sub6.anIntArray1920[i_10_];
								if ((i_11_ ^ 0xffffffff) != -1) {
									if (i_11_ == 1) {
										Field field = ((Field) (class4_sub6.aClass22Array1940[i_10_].anObject543));
										field.setInt(
												null,
												(class4_sub6.anIntArray1929[i_10_]));
										arg2.method227((byte) -27, 0);
									} else if ((i_11_ ^ 0xffffffff) == -3) {
										Field field = ((Field) (class4_sub6.aClass22Array1940[i_10_].anObject543));
										int i_12_ = field.getModifiers();
										arg2.method227((byte) -27, 0);
										arg2.method236(181, i_12_);
									}
								} else {
									Field field = ((Field) (class4_sub6.aClass22Array1940[i_10_].anObject543));
									int i_13_ = field.getInt(null);
									arg2.method227((byte) -27, 0);
									arg2.method236(181, i_13_);
								}
								if (i_11_ != 3) {
									if ((i_11_ ^ 0xffffffff) == -5) {
										Method method = ((Method) (class4_sub6.aClass22Array1927[i_10_].anObject543));
										int i_14_ = method.getModifiers();
										arg2.method227((byte) -27, 0);
										arg2.method236(181, i_14_);
									}
								} else {
									Method method = ((Method) (class4_sub6.aClass22Array1927[i_10_].anObject543));
									byte[][] is = (class4_sub6.aByteArrayArrayArray1925[i_10_]);
									Object[] objects = new Object[is.length];
									for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
										ObjectInputStream objectinputstream = (new ObjectInputStream(
												new ByteArrayInputStream(
														is[i_15_])));
										objects[i_15_] = objectinputstream
												.readObject();
									}
									Object object = method
											.invoke(null, objects);
									if (object == null)
										arg2.method227((byte) -27, 0);
									else if (object instanceof Number) {
										arg2.method227((byte) -27, 1);
										arg2.method255(arg1 ^ ~0xb4951ec,
												((Number) object).longValue());
									} else if (object instanceof JagexString) {
										arg2.method227((byte) -27, 2);
										arg2.method259((JagexString) object, 18601);
									} else
										arg2.method227((byte) -27, 4);
								}
							} catch (ClassNotFoundException classnotfoundexception) {
								arg2.method227((byte) -27, -10);
							} catch (java.io.InvalidClassException invalidclassexception) {
								arg2.method227((byte) -27, -11);
							} catch (java.io.StreamCorruptedException streamcorruptedexception) {
								arg2.method227((byte) -27, -12);
							} catch (java.io.OptionalDataException optionaldataexception) {
								arg2.method227((byte) -27, -13);
							} catch (IllegalAccessException illegalaccessexception) {
								arg2.method227((byte) -27, -14);
							} catch (IllegalArgumentException illegalargumentexception) {
								arg2.method227((byte) -27, -15);
							} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
								arg2.method227((byte) -27, -16);
							} catch (SecurityException securityexception) {
								arg2.method227((byte) -27, -17);
							} catch (java.io.IOException ioexception) {
								arg2.method227((byte) -27, -18);
							} catch (NullPointerException nullpointerexception) {
								arg2.method227((byte) -27, -19);
							} catch (Exception exception) {
								arg2.method227((byte) -27, -20);
							} catch (Throwable throwable) {
								arg2.method227((byte) -27, -21);
							}
						}
					}
					arg2.method234(i, arg1 + 62);
					arg2.method258(-i + arg2.pointion, (byte) 50);
					class4_sub6.clear();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ve.C("
					+ arg0 + ',' + arg1 + ','
					+ (arg2 != null ? "{...}" : "null") + ')'));
		}
	}
}
