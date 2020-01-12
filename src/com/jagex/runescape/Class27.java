package com.jagex.runescape;
import com.jagex.runescape.io.Buffer;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public class Class27 {
	public static boolean aBoolean616 = false;
	public static byte aByte613;
	public static int anInt598;
	public static int anInt600;
	public static int anInt604 = -1;
	public static int anInt605;
	public static int anInt606;
	public static int anInt609;
	public static int anInt614;
	public static int anInt617;
	public static int anInt618 = 0;
	public static int anInt620;
	public static int anInt621;
	public static int anInt625 = 500;
	public static int anInt626;
	public static int anInt627 = 0;
	public static int anInt628;
	public static int anInt631;

	public static void method847(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			anInt605++;
			Class4_Sub7 class4_sub7 = (Class4_Sub7) Class4_Sub20_Sub7_Sub1_Sub2.aClass65_3618
					.method1071(arg0 + -126);
			Class4_Sub7 class4_sub7_1_ = null;
			for (/**/; class4_sub7 != null; class4_sub7 = (Class4_Sub7) Class4_Sub20_Sub7_Sub1_Sub2.aClass65_3618
					.method1075(18485)) {
				if (class4_sub7.anInt1961 == arg9
						&& (arg2 ^ 0xffffffff) == (class4_sub7.anInt1953 ^ 0xffffffff)
						&& (arg7 ^ 0xffffffff) == (class4_sub7.anInt1950 ^ 0xffffffff)
						&& ((class4_sub7.anInt1959 ^ 0xffffffff) == (arg4 ^ 0xffffffff))) {
					class4_sub7_1_ = class4_sub7;
					break;
				}
			}
			if (class4_sub7_1_ == null) {
				class4_sub7_1_ = new Class4_Sub7();
				class4_sub7_1_.anInt1959 = arg4;
				class4_sub7_1_.anInt1950 = arg7;
				class4_sub7_1_.anInt1961 = arg9;
				class4_sub7_1_.anInt1953 = arg2;
				Class4_Sub20_Sub7.method375(class4_sub7_1_, 18278);
				Class4_Sub20_Sub7_Sub1_Sub2.aClass65_3618.method1068(
						class4_sub7_1_, (byte) -123);
			}
			class4_sub7_1_.anInt1952 = arg6;
			if (arg0 == -1) {
				class4_sub7_1_.anInt1946 = arg3;
				class4_sub7_1_.anInt1951 = arg5;
				class4_sub7_1_.anInt1949 = arg1;
				class4_sub7_1_.anInt1954 = arg8;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ia.A("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4
					+ ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ','
					+ arg9 + ')'));
		}
	}

	public static void method850(int arg0) {
		try {
			StringUtilities.aJagexString_623 = null;
			if (arg0 <= 76) {
				method852(7, null, null, false);
			}
			StringUtilities.aJagexString_622 = null;
			StringUtilities.aJagexString_629 = null;
			StringUtilities.aJagexString_624 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ia.F("
					+ arg0 + ')');
		}
	}

	public static void method852(int arg0, Class19 arg1, Class19 arg2,
			boolean arg3) {
		try {
			Class4_Sub6.aClass19_1930 = arg2;
			Game.aClass19_1851 = arg1;
			if (arg0 != -1) {
				method852(-41, null, null, false);
			}
			Buffer.aBoolean2066 = arg3;
			anInt606++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ia.I("
					+ arg0 + ',' + (arg1 != null ? "{...}" : "null") + ','
					+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')'));
		}
	}

	public byte[] aByteArray601;
	public byte[] aByteArray602;
	public Class39 aClass39_599;
	public long aLong603;
	public long aLong607;
	public long aLong611;
	public long aLong612;

	public long aLong619;

	public long aLong630;

	public int anInt608 = 0;

	public int anInt615;

	public Class27(Class39 arg0, int arg1, int arg2) throws IOException {
		aLong603 = -1L;
		aLong612 = -1L;
		try {
			aClass39_599 = arg0;
			aLong619 = aLong630 = arg0.method925(-29248);
			aLong611 = 0L;
			aByteArray602 = new byte[arg2];
			aByteArray601 = new byte[arg1];
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("ia.<init>(" + (arg0 != null ? "{...}" : "null") + ','
							+ arg1 + ',' + arg2 + ')'));
		}
	}

	public void method843(byte arg0) throws IOException {
		anInt614++;
		method844(255);
		aClass39_599.method927(0);
		if (arg0 > -26) {
			method850(122);
		}
	}

	public void method844(int arg0) throws IOException {
		if (arg0 == 255) {
			anInt631++;
			if (aLong603 != -1L) {
				if ((aLong607 ^ 0xffffffffffffffffL) != (aLong603 ^ 0xffffffffffffffffL)) {
					aClass39_599.method929(arg0 ^ 0x80, aLong603);
					aLong607 = aLong603;
				}
				aClass39_599.method930(0, aByteArray602, anInt608, true);
				aLong607 += anInt608;
				if (aLong630 < aLong607) {
					aLong630 = aLong607;
				}
				long l = -1L;
				long l_0_ = -1L;
				if (aLong612 > aLong603
						|| ((anInt615 + aLong612 ^ 0xffffffffffffffffL) >= (aLong603 ^ 0xffffffffffffffffL))) {
					if (aLong612 >= aLong603 && anInt608 + aLong603 > aLong612) {
						l = aLong612;
					}
				} else {
					l = aLong603;
				}
				if (anInt608 + aLong603 > aLong612
						&& ((anInt615 + aLong612 ^ 0xffffffffffffffffL) <= (anInt608
								+ aLong603 ^ 0xffffffffffffffffL))) {
					l_0_ = aLong603 - -(long) anInt608;
				} else if (((aLong603 ^ 0xffffffffffffffffL) > (aLong612
						- -(long) anInt615 ^ 0xffffffffffffffffL))
						&& (anInt615 + aLong612 <= anInt608 + aLong603)) {
					l_0_ = anInt615 + aLong612;
				}
				if (l > -1L && l_0_ > l) {
					int i = (int) (-l + l_0_);
					Class21.method777(aByteArray602, (int) (l + -aLong603),
							aByteArray601, (int) (l - aLong612), i);
				}
				aLong603 = -1L;
				anInt608 = 0;
			}
		}
	}

	public File method845(byte arg0) {
		try {
			if (arg0 < 38) {
				method845((byte) -76);
			}
			anInt620++;
			return aClass39_599.method926((byte) 79);
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ia.K("
					+ arg0 + ')');
		}
	}

	public long method846(int arg0) {
		try {
			if (arg0 != 31549) {
				method852(-85, null, null, true);
			}
			anInt621++;
			return aLong619;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ia.J("
					+ arg0 + ')');
		}
	}

	public void method848(byte[] arg0, int arg1, int arg2, int arg3)
			throws IOException {
		anInt617++;
		try {
			if ((arg0.length ^ 0xffffffff) > (arg2 + arg3 ^ 0xffffffff)) {
				throw new ArrayIndexOutOfBoundsException(arg2
						+ (arg3 + -arg0.length));
			}
			if (arg1 != 2094) {
				StringUtilities.aJagexString_624 = null;
			}
			if (aLong603 != -1L
					&& (aLong611 ^ 0xffffffffffffffffL) <= (aLong603 ^ 0xffffffffffffffffL)
					&& anInt608 + aLong603 >= aLong611 - -(long) arg2) {
				Class21.method777(aByteArray602, (int) (aLong611 + -aLong603),
						arg0, arg3, arg2);
				aLong611 += arg2;
				return;
			}
			long l = aLong611;
			int i = arg3;
			int i_2_ = arg2;
			if ((aLong611 ^ 0xffffffffffffffffL) <= (aLong612 ^ 0xffffffffffffffffL)
					&& aLong611 < anInt615 + aLong612) {
				int i_3_ = (int) (-aLong611 + (aLong612 + anInt615));
				if ((i_3_ ^ 0xffffffff) < (arg2 ^ 0xffffffff)) {
					i_3_ = arg2;
				}
				Class21.method777(aByteArray601, (int) (-aLong612 + aLong611),
						arg0, arg3, i_3_);
				aLong611 += i_3_;
				arg2 -= i_3_;
				arg3 += i_3_;
			}
			if ((arg2 ^ 0xffffffff) >= (aByteArray601.length ^ 0xffffffff)) {
				if (arg2 > 0) {
					method849((byte) -106);
					int i_4_ = arg2;
					if ((anInt615 ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
						i_4_ = anInt615;
					}
					arg2 -= i_4_;
					Class21.method777(aByteArray601, 0, arg0, arg3, i_4_);
					aLong611 += i_4_;
					arg3 += i_4_;
				}
			} else {
				aClass39_599.method929(87, aLong611);
				aLong607 = aLong611;
				while (arg2 > 0) {
					int i_5_ = aClass39_599.method928((byte) -100, arg3, arg0,
							arg2);
					if ((i_5_ ^ 0xffffffff) == 0) {
						break;
					}
					arg2 -= i_5_;
					aLong607 += i_5_;
					aLong611 += i_5_;
					arg3 += i_5_;
				}
			}
			if ((aLong603 ^ 0xffffffffffffffffL) != 0L) {
				if ((aLong611 ^ 0xffffffffffffffffL) > (aLong603 ^ 0xffffffffffffffffL)
						&& arg2 > 0) {
					int i_6_ = arg3 - -(int) (aLong603 + -aLong611);
					if (arg2 + arg3 < i_6_) {
						i_6_ = arg3 - -arg2;
					}
					while ((i_6_ ^ 0xffffffff) < (arg3 ^ 0xffffffff)) {
						arg0[arg3++] = (byte) 0;
						arg2--;
						aLong611++;
					}
				}
				long l_7_ = -1L;
				if (aLong603 < l
						|| ((aLong603 ^ 0xffffffffffffffffL) <= (i_2_ + l ^ 0xffffffffffffffffL))) {
					if (((aLong603 ^ 0xffffffffffffffffL) >= (l ^ 0xffffffffffffffffL))
							&& aLong603 - -(long) anInt608 > l) {
						l_7_ = l;
					}
				} else {
					l_7_ = aLong603;
				}
				long l_8_ = -1L;
				if ((l ^ 0xffffffffffffffffL) > (anInt608 + aLong603 ^ 0xffffffffffffffffL)
						&& ((aLong603 + anInt608 ^ 0xffffffffffffffffL) >= (i_2_
								+ l ^ 0xffffffffffffffffL))) {
					l_8_ = anInt608 + aLong603;
				} else if (aLong603 < l + i_2_
						&& ((anInt608 + aLong603 ^ 0xffffffffffffffffL) <= (l
								- -(long) i_2_ ^ 0xffffffffffffffffL))) {
					l_8_ = i_2_ + l;
				}
				if ((l_7_ ^ 0xffffffffffffffffL) < 0L
						&& ((l_7_ ^ 0xffffffffffffffffL) > (l_8_ ^ 0xffffffffffffffffL))) {
					int i_9_ = (int) (-l_7_ + l_8_);
					Class21.method777(aByteArray602, (int) (-aLong603 + l_7_),
							arg0, (int) (l_7_ - l) + i, i_9_);
					if ((aLong611 ^ 0xffffffffffffffffL) > (l_8_ ^ 0xffffffffffffffffL)) {
						arg2 -= -aLong611 + l_8_;
						aLong611 = l_8_;
					}
				}
			}
		} catch (IOException ioexception) {
			aLong607 = -1L;
			throw ioexception;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	public void method849(byte arg0) throws IOException {
		try {
			anInt615 = 0;
			if (aLong607 != aLong611) {
				aClass39_599.method929(114, aLong611);
				aLong607 = aLong611;
			}
			if (arg0 == -106) {
				aLong612 = aLong611;
				anInt598++;
				int i;
				for (/**/; ((aByteArray601.length ^ 0xffffffff) < (anInt615 ^ 0xffffffff)); anInt615 += i) {
					i = aClass39_599.method928((byte) -100, anInt615,
							aByteArray601, (-anInt615 + aByteArray601.length));
					if ((i ^ 0xffffffff) == 0) {
						break;
					}
					aLong607 += i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ia.H("
					+ arg0 + ')');
		}
	}

	public void method851(byte[] arg0, int arg1, int arg2, int arg3)
			throws IOException {
		anInt628++;
		try {
			if ((aLong619 ^ 0xffffffffffffffffL) > (arg2 + aLong611 ^ 0xffffffffffffffffL)) {
				aLong619 = aLong611 + arg2;
			}
			if (aLong603 != -1L
					&& (aLong603 > aLong611 || aLong603 + anInt608 < aLong611)) {
				method844(255);
			}
			if ((aLong603 ^ 0xffffffffffffffffL) != 0L
					&& (aLong611 - -(long) arg2 > aByteArray602.length
							+ aLong603)) {
				int i = (int) (-aLong611 + aLong603 + aByteArray602.length);
				Class21.method777(arg0, arg3, aByteArray602,
						(int) (aLong611 + -aLong603), i);
				arg3 += i;
				aLong611 += i;
				anInt608 = aByteArray602.length;
				arg2 -= i;
				method844(255);
			}
			if (arg2 > aByteArray602.length) {
				long l = -1L;
				if ((aLong611 ^ 0xffffffffffffffffL) != (aLong607 ^ 0xffffffffffffffffL)) {
					aClass39_599.method929(101, aLong611);
					aLong607 = aLong611;
				}
				long l_10_ = -1L;
				aClass39_599.method930(arg3, arg0, arg2, true);
				aLong607 += arg2;
				if ((aLong607 ^ 0xffffffffffffffffL) < (aLong630 ^ 0xffffffffffffffffL)) {
					aLong630 = aLong607;
				}
				if (((aLong612 ^ 0xffffffffffffffffL) <= (aLong611
						- -(long) arg2 ^ 0xffffffffffffffffL))
						|| anInt615 + aLong612 < arg2 + aLong611) {
					if (anInt615 + aLong612 > aLong611
							&& ((arg2 + aLong611 ^ 0xffffffffffffffffL) <= (anInt615
									+ aLong612 ^ 0xffffffffffffffffL))) {
						l_10_ = aLong612 - -(long) anInt615;
					}
				} else {
					l_10_ = arg2 + aLong611;
				}
				if ((aLong611 ^ 0xffffffffffffffffL) > (aLong612 ^ 0xffffffffffffffffL)
						|| aLong612 + anInt615 <= aLong611) {
					if (((aLong612 ^ 0xffffffffffffffffL) <= (aLong611 ^ 0xffffffffffffffffL))
							&& aLong611 + arg2 > aLong612) {
						l = aLong612;
					}
				} else {
					l = aLong611;
				}
				if (l > -1L && l < l_10_) {
					int i = (int) (l_10_ + -l);
					Class21.method777(arg0, (int) (-aLong611 + l + arg3),
							aByteArray601, (int) (-aLong612 + l), i);
				}
				aLong611 += arg2;
			} else if ((arg2 ^ 0xffffffff) < arg1) {
				if (aLong603 == -1L) {
					aLong603 = aLong611;
				}
				Class21.method777(arg0, arg3, aByteArray602,
						(int) (aLong611 + -aLong603), arg2);
				aLong611 += arg2;
				if ((-aLong603 + aLong611 ^ 0xffffffffffffffffL) < (anInt608 ^ 0xffffffffffffffffL)) {
					anInt608 = (int) (aLong611 + -aLong603);
				}
			}
		} catch (IOException ioexception) {
			aLong607 = -1L;
			throw ioexception;
		}
	}

	public void method853(byte arg0, long arg1) throws IOException {
		try {
			if (arg0 <= -43) {
				anInt609++;
				if ((arg1 ^ 0xffffffffffffffffL) > -1L) {
					throw new IOException("Invalid seek to " + arg1
							+ " in file " + method845((byte) 45));
				}
				aLong611 = arg1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ia.C("
					+ arg0 + ',' + arg1 + ')'));
		}
	}
}
