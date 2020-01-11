package com.jagex.runescape;

public class Class4_Sub2_Sub3 extends Class4_Sub2 {
	public static int method127(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, Class4_Sub2_Sub3 arg11, int arg12, int arg13) {
		if (arg12 == 0
				|| (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9)
			arg8 = arg9;
		arg5 <<= 1;
		arg8 <<= 1;
		while (arg5 < arg8) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1 - 1];
			arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg4 += arg12;
		}
		if (arg12 == 0
				|| (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9)
			arg8 = arg9;
		arg8 <<= 1;
		arg1 = arg13;
		while (arg5 < arg8) {
			arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg4 += arg12;
		}
		arg11.anInt2633 = arg4;
		return arg5 >> 1;
	}

	public static int method130(int arg0, byte[] arg1, int[] arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, Class4_Sub2_Sub3 arg12) {
		arg3 >>= 8;
		arg11 >>= 8;
		arg5 <<= 2;
		arg6 <<= 2;
		arg7 <<= 2;
		arg8 <<= 2;
		if ((arg9 = arg4 + arg3 - (arg11 - 1)) > arg10)
			arg9 = arg10;
		arg12.anInt2640 += arg12.anInt2630 * (arg9 - arg4);
		arg4 <<= 1;
		arg9 <<= 1;
		arg9 -= 6;
		while (arg4 < arg9) {
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
		}
		arg9 += 6;
		while (arg4 < arg9) {
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
		}
		arg12.anInt2638 = arg5 >> 2;
		arg12.anInt2631 = arg6 >> 2;
		arg12.anInt2633 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method131(byte[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8,
			Class4_Sub2_Sub3 arg9) {
		arg2 >>= 8;
		arg8 >>= 8;
		arg4 <<= 2;
		arg5 <<= 2;
		if ((arg6 = arg3 + arg2 - (arg8 - 1)) > arg7)
			arg6 = arg7;
		arg9.anInt2638 += arg9.anInt2641 * (arg6 - arg3);
		arg9.anInt2631 += arg9.anInt2635 * (arg6 - arg3);
		arg6 -= 3;
		while (arg3 < arg6) {
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg4 += arg5;
		}
		arg6 += 3;
		while (arg3 < arg6) {
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg4 += arg5;
		}
		arg9.anInt2640 = arg4 >> 2;
		arg9.anInt2633 = arg2 << 8;
		return arg3;
	}

	public static int method132(int arg0, int arg1) {
		if (arg1 < 0)
			return -arg0;
		return (int) (arg0 * Math.sqrt(arg1 * 1.220703125E-4) + 0.5);
	}

	public static int method133(int arg0, byte[] arg1, int[] arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, Class4_Sub2_Sub3 arg12) {
		arg3 >>= 8;
		arg11 >>= 8;
		arg5 <<= 2;
		arg6 <<= 2;
		arg7 <<= 2;
		arg8 <<= 2;
		if ((arg9 = arg4 + arg11 - arg3) > arg10)
			arg9 = arg10;
		arg12.anInt2640 += arg12.anInt2630 * (arg9 - arg4);
		arg4 <<= 1;
		arg9 <<= 1;
		arg9 -= 6;
		while (arg4 < arg9) {
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
		}
		arg9 += 6;
		while (arg4 < arg9) {
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg5 += arg7;
			arg2[arg4++] += arg0 * arg6;
			arg6 += arg8;
		}
		arg12.anInt2638 = arg5 >> 2;
		arg12.anInt2631 = arg6 >> 2;
		arg12.anInt2633 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method134(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, int arg12, Class4_Sub2_Sub3 arg13, int arg14,
			int arg15) {
		arg13.anInt2640 -= arg13.anInt2630 * arg5;
		if (arg14 == 0
				|| (arg10 = arg5 + (arg12 + 256 - arg4 + arg14) / arg14) > arg11)
			arg10 = arg11;
		arg5 <<= 1;
		arg10 <<= 1;
		while (arg5 < arg10) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1 - 1];
			arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg6 += arg8;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		if (arg14 == 0
				|| (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11)
			arg10 = arg11;
		arg10 <<= 1;
		arg1 = arg15;
		while (arg5 < arg10) {
			arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg6 += arg8;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		arg5 >>= 1;
		arg13.anInt2640 += arg13.anInt2630 * arg5;
		arg13.anInt2638 = arg6;
		arg13.anInt2631 = arg7;
		arg13.anInt2633 = arg4;
		return arg5;
	}

	public static int method137(byte[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, Class4_Sub2_Sub3 arg8) {
		arg2 >>= 8;
		arg7 >>= 8;
		arg4 <<= 2;
		if ((arg5 = arg3 + arg7 - arg2) > arg6)
			arg5 = arg6;
		arg5 -= 3;
		while (arg3 < arg5) {
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg1[arg3++] += arg0[arg2++] * arg4;
		}
		arg5 += 3;
		while (arg3 < arg5)
			arg1[arg3++] += arg0[arg2++] * arg4;
		arg8.anInt2633 = arg2 << 8;
		return arg3;
	}

	public static int method138(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, Class4_Sub2_Sub3 arg11, int arg12, int arg13) {
		if (arg12 == 0
				|| (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9)
			arg8 = arg9;
		arg5 <<= 1;
		arg8 <<= 1;
		while (arg5 < arg8) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1];
			arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg4 += arg12;
		}
		if (arg12 == 0
				|| ((arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9))
			arg8 = arg9;
		arg8 <<= 1;
		arg1 = arg13;
		while (arg5 < arg8) {
			arg0 = arg2[arg4 >> 8];
			arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg4 += arg12;
		}
		arg11.anInt2633 = arg4;
		return arg5 >> 1;
	}

	public static Class4_Sub2_Sub3 method139(Class4_Sub4_Sub1 arg0, int arg1,
			int arg2, int arg3) {
		if (arg0.aByteArray2661 == null || arg0.aByteArray2661.length == 0)
			return null;
		return new Class4_Sub2_Sub3(arg0, arg1, arg2, arg3);
	}

	public static int method140(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			Class4_Sub2_Sub3 arg10, int arg11, int arg12) {
		if (arg11 == 0
				|| (arg7 = arg5 + (arg9 + 256 - arg4 + arg11) / arg11) > arg8)
			arg7 = arg8;
		while (arg5 < arg7) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1 - 1];
			arg3[arg5++] += (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff))
					* arg6 >> 6);
			arg4 += arg11;
		}
		if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11) / arg11) > arg8)
			arg7 = arg8;
		arg0 = arg12;
		arg1 = arg11;
		while (arg5 < arg7) {
			arg3[arg5++] += (((arg0 << 8) + (arg2[arg4 >> 8] - arg0)
					* (arg4 & 0xff)) * arg6) >> 6;
			arg4 += arg1;
		}
		arg10.anInt2633 = arg4;
		return arg5;
	}

	public static int method145(byte[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, Class4_Sub2_Sub3 arg8) {
		arg2 >>= 8;
		arg7 >>= 8;
		arg4 <<= 2;
		if ((arg5 = arg3 + arg2 - (arg7 - 1)) > arg6)
			arg5 = arg6;
		arg5 -= 3;
		while (arg3 < arg5) {
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg1[arg3++] += arg0[arg2--] * arg4;
			arg1[arg3++] += arg0[arg2--] * arg4;
		}
		arg5 += 3;
		while (arg3 < arg5)
			arg1[arg3++] += arg0[arg2--] * arg4;
		arg8.anInt2633 = arg2 << 8;
		return arg3;
	}

	public static int method146(byte[] arg0, int[] arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8,
			Class4_Sub2_Sub3 arg9) {
		arg2 >>= 8;
		arg8 >>= 8;
		arg4 <<= 2;
		arg5 <<= 2;
		if ((arg6 = arg3 + arg8 - arg2) > arg7)
			arg6 = arg7;
		arg9.anInt2638 += arg9.anInt2641 * (arg6 - arg3);
		arg9.anInt2631 += arg9.anInt2635 * (arg6 - arg3);
		arg6 -= 3;
		while (arg3 < arg6) {
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg4 += arg5;
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg4 += arg5;
		}
		arg6 += 3;
		while (arg3 < arg6) {
			arg1[arg3++] += arg0[arg2++] * arg4;
			arg4 += arg5;
		}
		arg9.anInt2640 = arg4 >> 2;
		arg9.anInt2633 = arg2 << 8;
		return arg3;
	}

	public static Class4_Sub2_Sub3 method153(Class4_Sub4_Sub1 arg0, int arg1,
			int arg2) {
		if (arg0.aByteArray2661 == null || arg0.aByteArray2661.length == 0)
			return null;
		return new Class4_Sub2_Sub3(
				arg0,
				(int) (arg0.anInt2662 * 256L * arg1 / (100 * Class67.anInt1354)),
				arg2 << 6);
	}

	public static int method154(int arg0, byte[] arg1, int[] arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			Class4_Sub2_Sub3 arg10) {
		arg3 >>= 8;
		arg9 >>= 8;
		arg5 <<= 2;
		arg6 <<= 2;
		if ((arg7 = arg4 + arg9 - arg3) > arg8)
			arg7 = arg8;
		arg4 <<= 1;
		arg7 <<= 1;
		arg7 -= 6;
		while (arg4 < arg7) {
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
		}
		arg7 += 6;
		while (arg4 < arg7) {
			arg0 = arg1[arg3++];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
		}
		arg10.anInt2633 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method159(int arg0, byte[] arg1, int[] arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			Class4_Sub2_Sub3 arg10) {
		arg3 >>= 8;
		arg9 >>= 8;
		arg5 <<= 2;
		arg6 <<= 2;
		if ((arg7 = arg4 + arg3 - (arg9 - 1)) > arg8)
			arg7 = arg8;
		arg4 <<= 1;
		arg7 <<= 1;
		arg7 -= 6;
		while (arg4 < arg7) {
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
		}
		arg7 += 6;
		while (arg4 < arg7) {
			arg0 = arg1[arg3--];
			arg2[arg4++] += arg0 * arg5;
			arg2[arg4++] += arg0 * arg6;
		}
		arg10.anInt2633 = arg3 << 8;
		return arg4 >> 1;
	}

	public static int method160(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, Class4_Sub2_Sub3 arg11, int arg12, int arg13) {
		arg11.anInt2638 -= arg11.anInt2641 * arg5;
		arg11.anInt2631 -= arg11.anInt2635 * arg5;
		if (arg12 == 0
				|| (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9)
			arg8 = arg9;
		while (arg5 < arg8) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1 - 1];
			arg3[arg5++] += (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff))
					* arg6 >> 6);
			arg6 += arg7;
			arg4 += arg12;
		}
		if (arg12 == 0 || (arg8 = arg5 + (arg10 - arg4 + arg12) / arg12) > arg9)
			arg8 = arg9;
		arg0 = arg13;
		arg1 = arg12;
		while (arg5 < arg8) {
			arg3[arg5++] += (((arg0 << 8) + (arg2[arg4 >> 8] - arg0)
					* (arg4 & 0xff)) * arg6) >> 6;
			arg6 += arg7;
			arg4 += arg1;
		}
		arg11.anInt2638 += arg11.anInt2641 * arg5;
		arg11.anInt2631 += arg11.anInt2635 * arg5;
		arg11.anInt2640 = arg6;
		arg11.anInt2633 = arg4;
		return arg5;
	}

	public static int method161(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			Class4_Sub2_Sub3 arg10, int arg11, int arg12) {
		if (arg11 == 0
				|| (arg7 = arg5 + (arg9 - arg4 + arg11 - 257) / arg11) > arg8)
			arg7 = arg8;
		while (arg5 < arg7) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1];
			arg3[arg5++] += (((arg0 << 8) + (arg2[arg1 + 1] - arg0)
					* (arg4 & 0xff)) * arg6) >> 6;
			arg4 += arg11;
		}
		if (arg11 == 0
				|| (arg7 = arg5 + (arg9 - arg4 + arg11 - 1) / arg11) > arg8)
			arg7 = arg8;
		arg1 = arg12;
		while (arg5 < arg7) {
			arg0 = arg2[arg4 >> 8];
			arg3[arg5++] += ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff))
					* arg6 >> 6;
			arg4 += arg11;
		}
		arg10.anInt2633 = arg4;
		return arg5;
	}

	public static int method163(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, Class4_Sub2_Sub3 arg11, int arg12, int arg13) {
		arg11.anInt2638 -= arg11.anInt2641 * arg5;
		arg11.anInt2631 -= arg11.anInt2635 * arg5;
		if (arg12 == 0
				|| (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9)
			arg8 = arg9;
		while (arg5 < arg8) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1];
			arg3[arg5++] += (((arg0 << 8) + (arg2[arg1 + 1] - arg0)
					* (arg4 & 0xff)) * arg6) >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		if (arg12 == 0
				|| (arg8 = arg5 + (arg10 - arg4 + arg12 - 1) / arg12) > arg9)
			arg8 = arg9;
		arg1 = arg13;
		while (arg5 < arg8) {
			arg0 = arg2[arg4 >> 8];
			arg3[arg5++] += ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff))
					* arg6 >> 6;
			arg6 += arg7;
			arg4 += arg12;
		}
		arg11.anInt2638 += arg11.anInt2641 * arg5;
		arg11.anInt2631 += arg11.anInt2635 * arg5;
		arg11.anInt2640 = arg6;
		arg11.anInt2633 = arg4;
		return arg5;
	}

	public static int method165(int arg0, int arg1) {
		if (arg1 < 0)
			return arg0;
		return (int) ((arg0 * Math.sqrt((16384 - arg1) * 1.220703125E-4)) + 0.5);
	}

	public static int method166(int arg0, int arg1, byte[] arg2, int[] arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, int arg9,
			int arg10, int arg11, int arg12, Class4_Sub2_Sub3 arg13, int arg14,
			int arg15) {
		arg13.anInt2640 -= arg13.anInt2630 * arg5;
		if (arg14 == 0
				|| (arg10 = arg5 + (arg12 - arg4 + arg14 - 257) / arg14) > arg11)
			arg10 = arg11;
		arg5 <<= 1;
		arg10 <<= 1;
		while (arg5 < arg10) {
			arg1 = arg4 >> 8;
			arg0 = arg2[arg1];
			arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg6 += arg8;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		if (arg14 == 0
				|| ((arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11))
			arg10 = arg11;
		arg10 <<= 1;
		arg1 = arg15;
		while (arg5 < arg10) {
			arg0 = arg2[arg4 >> 8];
			arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff);
			arg3[arg5++] += arg0 * arg6 >> 6;
			arg6 += arg8;
			arg3[arg5++] += arg0 * arg7 >> 6;
			arg7 += arg9;
			arg4 += arg14;
		}
		arg5 >>= 1;
		arg13.anInt2640 += arg13.anInt2630 * arg5;
		arg13.anInt2638 = arg6;
		arg13.anInt2631 = arg7;
		arg13.anInt2633 = arg4;
		return arg5;
	}

	public boolean aBoolean2639;

	public int anInt2627;

	public int anInt2628;

	public int anInt2629;

	public int anInt2630;

	public int anInt2631;

	public int anInt2632;

	public int anInt2633;

	public int anInt2634;

	public int anInt2635;

	public int anInt2636;

	public int anInt2637;

	public int anInt2638;

	public int anInt2640;

	public int anInt2641;

	public Class4_Sub2_Sub3(Class4_Sub4_Sub1 arg0, int arg1, int arg2) {
		aClass4_Sub4_1873 = arg0;
		anInt2636 = arg0.anInt2663;
		anInt2627 = arg0.anInt2660;
		aBoolean2639 = arg0.aBoolean2664;
		anInt2637 = arg1;
		anInt2634 = arg2;
		anInt2632 = 8192;
		anInt2633 = 0;
		method144();
	}

	public Class4_Sub2_Sub3(Class4_Sub4_Sub1 arg0, int arg1, int arg2, int arg3) {
		aClass4_Sub4_1873 = arg0;
		anInt2636 = arg0.anInt2663;
		anInt2627 = arg0.anInt2660;
		aBoolean2639 = arg0.aBoolean2664;
		anInt2637 = arg1;
		anInt2634 = arg2;
		anInt2632 = arg3;
		anInt2633 = 0;
		method144();
	}

	public synchronized int method128() {
		if (anInt2634 == -2147483648)
			return 0;
		return anInt2634;
	}

	public synchronized void method129(int arg0) {
		if (anInt2637 < 0)
			anInt2637 = -arg0;
		else
			anInt2637 = arg0;
	}

	public int method135(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		while (anInt2628 > 0) {
			int i = arg1 + anInt2628;
			if (i > arg3)
				i = arg3;
			anInt2628 += arg1;
			if (anInt2637 == -256 && (anInt2633 & 0xff) == 0) {
				if (Class4_Sub20_Sub7_Sub1.aBoolean3218)
					arg1 = method130(
							0,
							(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
							arg0, anInt2633, arg1, anInt2638, anInt2631,
							anInt2641, anInt2635, 0, i, arg2, this);
				else
					arg1 = method131(
							(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
							arg0, anInt2633, arg1, anInt2640, anInt2630, 0, i,
							arg2, this);
			} else if (Class4_Sub20_Sub7_Sub1.aBoolean3218)
				arg1 = method134(
						0,
						0,
						(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
						arg0, anInt2633, arg1, anInt2638, anInt2631, anInt2641,
						anInt2635, 0, i, arg2, this, anInt2637, arg4);
			else
				arg1 = method160(
						0,
						0,
						(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
						arg0, anInt2633, arg1, anInt2640, anInt2630, 0, i,
						arg2, this, anInt2637, arg4);
			anInt2628 -= arg1;
			if (anInt2628 != 0)
				return arg1;
			if (method150())
				return arg3;
		}
		if (anInt2637 == -256 && (anInt2633 & 0xff) == 0) {
			if (Class4_Sub20_Sub7_Sub1.aBoolean3218)
				return method159(
						0,
						(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
						arg0, anInt2633, arg1, anInt2638, anInt2631, 0, arg3,
						arg2, this);
			return method145(
					(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
					arg0, anInt2633, arg1, anInt2640, 0, arg3, arg2, this);
		}
		if (Class4_Sub20_Sub7_Sub1.aBoolean3218)
			return method127(0, 0,
					(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
					arg0, anInt2633, arg1, anInt2638, anInt2631, 0, arg3, arg2,
					this, anInt2637, arg4);
		return method140(0, 0,
				((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661, arg0,
				anInt2633, arg1, anInt2640, 0, arg3, arg2, this, anInt2637,
				arg4);
	}

	public boolean method136() {
		if (anInt2633 >= 0
				&& anInt2633 < (((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661).length << 8)
			return false;
		return true;
	}

	public int method141(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		while (anInt2628 > 0) {
			int i = arg1 + anInt2628;
			if (i > arg3)
				i = arg3;
			anInt2628 += arg1;
			if (anInt2637 == 256 && (anInt2633 & 0xff) == 0) {
				if (Class4_Sub20_Sub7_Sub1.aBoolean3218)
					arg1 = method133(
							0,
							(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
							arg0, anInt2633, arg1, anInt2638, anInt2631,
							anInt2641, anInt2635, 0, i, arg2, this);
				else
					arg1 = method146(
							(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
							arg0, anInt2633, arg1, anInt2640, anInt2630, 0, i,
							arg2, this);
			} else if (Class4_Sub20_Sub7_Sub1.aBoolean3218)
				arg1 = method166(
						0,
						0,
						(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
						arg0, anInt2633, arg1, anInt2638, anInt2631, anInt2641,
						anInt2635, 0, i, arg2, this, anInt2637, arg4);
			else
				arg1 = method163(
						0,
						0,
						(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
						arg0, anInt2633, arg1, anInt2640, anInt2630, 0, i,
						arg2, this, anInt2637, arg4);
			anInt2628 -= arg1;
			if (anInt2628 != 0)
				return arg1;
			if (method150())
				return arg3;
		}
		if (anInt2637 == 256 && (anInt2633 & 0xff) == 0) {
			if (Class4_Sub20_Sub7_Sub1.aBoolean3218)
				return method154(
						0,
						(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
						arg0, anInt2633, arg1, anInt2638, anInt2631, 0, arg3,
						arg2, this);
			return method137(
					(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
					arg0, anInt2633, arg1, anInt2640, 0, arg3, arg2, this);
		}
		if (Class4_Sub20_Sub7_Sub1.aBoolean3218)
			return method138(0, 0,
					(((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661),
					arg0, anInt2633, arg1, anInt2638, anInt2631, 0, arg3, arg2,
					this, anInt2637, arg4);
		return method161(0, 0,
				((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661, arg0,
				anInt2633, arg1, anInt2640, 0, arg3, arg2, this, anInt2637,
				arg4);
	}

	public synchronized void method142(int arg0) {
		anInt2629 = arg0;
	}

	public synchronized void method143(int arg0) {
		method149(arg0 << 6, method151());
	}

	public void method144() {
		anInt2640 = anInt2634;
		anInt2638 = method165(anInt2634, anInt2632);
		anInt2631 = method132(anInt2634, anInt2632);
	}

	public synchronized void method147(int arg0) {
		int i = (((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661.length << 8);
		if (arg0 < -1)
			arg0 = -1;
		if (arg0 > i)
			arg0 = i;
		anInt2633 = arg0;
	}

	public synchronized void method148(int arg0) {
		method149(arg0, method151());
	}

	public synchronized void method149(int arg0, int arg1) {
		anInt2634 = arg0;
		anInt2632 = arg1;
		anInt2628 = 0;
		method144();
	}

	public boolean method150() {
		int i = anInt2634;
		int i_6_;
		int i_7_;
		if (i == -2147483648)
			i = i_6_ = i_7_ = 0;
		else {
			i_6_ = method165(i, anInt2632);
			i_7_ = method132(i, anInt2632);
		}
		if (anInt2640 != i || anInt2638 != i_6_ || anInt2631 != i_7_) {
			if (anInt2640 < i) {
				anInt2630 = 1;
				anInt2628 = i - anInt2640;
			} else if (anInt2640 > i) {
				anInt2630 = -1;
				anInt2628 = anInt2640 - i;
			} else
				anInt2630 = 0;
			if (anInt2638 < i_6_) {
				anInt2641 = 1;
				if (anInt2628 == 0 || anInt2628 > i_6_ - anInt2638)
					anInt2628 = i_6_ - anInt2638;
			} else if (anInt2638 > i_6_) {
				anInt2641 = -1;
				if (anInt2628 == 0 || anInt2628 > anInt2638 - i_6_)
					anInt2628 = anInt2638 - i_6_;
			} else
				anInt2641 = 0;
			if (anInt2631 < i_7_) {
				anInt2635 = 1;
				if (anInt2628 == 0 || anInt2628 > i_7_ - anInt2631)
					anInt2628 = i_7_ - anInt2631;
			} else if (anInt2631 > i_7_) {
				anInt2635 = -1;
				if (anInt2628 == 0 || anInt2628 > anInt2631 - i_7_)
					anInt2628 = anInt2631 - i_7_;
			} else
				anInt2635 = 0;
			return false;
		}
		if (anInt2634 == -2147483648) {
			anInt2634 = 0;
			anInt2640 = anInt2638 = anInt2631 = 0;
			this.clear();
			return true;
		}
		method144();
		return false;
	}

	public synchronized int method151() {
		if (anInt2632 < 0)
			return -1;
		return anInt2632;
	}

	public synchronized void method152(int arg0, int arg1) {
		method157(arg0, arg1, method151());
	}

	public synchronized void method155(boolean arg0) {
		anInt2637 = (anInt2637 ^ anInt2637 >> 31) + (anInt2637 >>> 31);
		if (arg0)
			anInt2637 = -anInt2637;
	}

	public void method156() {
		if (anInt2628 != 0) {
			if (anInt2634 == -2147483648)
				anInt2634 = 0;
			anInt2628 = 0;
			method144();
		}
	}

	public synchronized void method157(int arg0, int arg1, int arg2) {
		if (arg0 == 0)
			method149(arg1, arg2);
		else {
			int i = method165(arg1, arg2);
			int i_8_ = method132(arg1, arg2);
			if (anInt2638 == i && anInt2631 == i_8_)
				anInt2628 = 0;
			else {
				int i_9_ = arg1 - anInt2640;
				if (anInt2640 - arg1 > i_9_)
					i_9_ = anInt2640 - arg1;
				if (i - anInt2638 > i_9_)
					i_9_ = i - anInt2638;
				if (anInt2638 - i > i_9_)
					i_9_ = anInt2638 - i;
				if (i_8_ - anInt2631 > i_9_)
					i_9_ = i_8_ - anInt2631;
				if (anInt2631 - i_8_ > i_9_)
					i_9_ = anInt2631 - i_8_;
				if (arg0 > i_9_)
					arg0 = i_9_;
				anInt2628 = arg0;
				anInt2634 = arg1;
				anInt2632 = arg2;
				anInt2630 = (arg1 - anInt2640) / arg0;
				anInt2641 = (i - anInt2638) / arg0;
				anInt2635 = (i_8_ - anInt2631) / arg0;
			}
		}
	}

	public boolean method158() {
		if (anInt2628 == 0)
			return false;
		return true;
	}

	public synchronized int method162() {
		if (anInt2637 < 0)
			return -anInt2637;
		return anInt2637;
	}

	public synchronized void method164(int arg0) {
		if (arg0 == 0) {
			method148(0);
			this.clear();
		} else if (anInt2638 == 0 && anInt2631 == 0) {
			anInt2628 = 0;
			anInt2634 = 0;
			anInt2640 = 0;
			this.clear();
		} else {
			int i = -anInt2640;
			if (anInt2640 > i)
				i = anInt2640;
			if (-anInt2638 > i)
				i = -anInt2638;
			if (anInt2638 > i)
				i = anInt2638;
			if (-anInt2631 > i)
				i = -anInt2631;
			if (anInt2631 > i)
				i = anInt2631;
			if (arg0 > i)
				arg0 = i;
			anInt2628 = arg0;
			anInt2634 = -2147483648;
			anInt2630 = -anInt2640 / arg0;
			anInt2641 = -anInt2638 / arg0;
			anInt2635 = -anInt2631 / arg0;
		}
	}

	@Override
	public int method78() {
		if (anInt2634 == 0 && anInt2628 == 0)
			return 0;
		return 1;
	}

	@Override
	public Class4_Sub2 method79() {
		return null;
	}

	@Override
	public synchronized void method80(int[] arg0, int arg1, int arg2) {
		if (anInt2634 == 0 && anInt2628 == 0)
			method82(arg2);
		else {
			Class4_Sub4_Sub1 class4_sub4_sub1 = (Class4_Sub4_Sub1) aClass4_Sub4_1873;
			int i = anInt2636 << 8;
			int i_0_ = anInt2627 << 8;
			int i_1_ = class4_sub4_sub1.aByteArray2661.length << 8;
			int i_2_ = i_0_ - i;
			if (i_2_ <= 0)
				anInt2629 = 0;
			int i_3_ = arg1;
			arg2 += arg1;
			if (anInt2633 < 0) {
				if (anInt2637 > 0)
					anInt2633 = 0;
				else {
					method156();
					this.clear();
					return;
				}
			}
			if (anInt2633 >= i_1_) {
				if (anInt2637 < 0)
					anInt2633 = i_1_ - 1;
				else {
					method156();
					this.clear();
					return;
				}
			}
			if (anInt2629 < 0) {
				if (aBoolean2639) {
					if (anInt2637 < 0) {
						i_3_ = method135(arg0, i_3_, i, arg2,
								(class4_sub4_sub1.aByteArray2661[anInt2636]));
						if (anInt2633 >= i)
							return;
						anInt2633 = i + i - 1 - anInt2633;
						anInt2637 = -anInt2637;
					}
					for (;;) {
						i_3_ = method141(
								arg0,
								i_3_,
								i_0_,
								arg2,
								(class4_sub4_sub1.aByteArray2661[anInt2627 - 1]));
						if (anInt2633 < i_0_)
							break;
						anInt2633 = i_0_ + i_0_ - 1 - anInt2633;
						anInt2637 = -anInt2637;
						i_3_ = method135(arg0, i_3_, i, arg2,
								(class4_sub4_sub1.aByteArray2661[anInt2636]));
						if (anInt2633 >= i)
							break;
						anInt2633 = i + i - 1 - anInt2633;
						anInt2637 = -anInt2637;
					}
				} else if (anInt2637 < 0) {
					for (;;) {
						i_3_ = method135(
								arg0,
								i_3_,
								i,
								arg2,
								(class4_sub4_sub1.aByteArray2661[anInt2627 - 1]));
						if (anInt2633 >= i)
							break;
						anInt2633 = i_0_ - 1 - (i_0_ - 1 - anInt2633) % i_2_;
					}
				} else {
					for (;;) {
						i_3_ = method141(arg0, i_3_, i_0_, arg2,
								(class4_sub4_sub1.aByteArray2661[anInt2636]));
						if (anInt2633 < i_0_)
							break;
						anInt2633 = i + (anInt2633 - i) % i_2_;
					}
				}
			} else {
				do {
					if (anInt2629 > 0) {
						if (aBoolean2639) {
							if (anInt2637 < 0) {
								i_3_ = method135(
										arg0,
										i_3_,
										i,
										arg2,
										(class4_sub4_sub1.aByteArray2661[anInt2636]));
								if (anInt2633 >= i)
									return;
								anInt2633 = i + i - 1 - anInt2633;
								anInt2637 = -anInt2637;
								if (--anInt2629 == 0)
									break;
							}
							do {
								i_3_ = method141(
										arg0,
										i_3_,
										i_0_,
										arg2,
										(class4_sub4_sub1.aByteArray2661[anInt2627 - 1]));
								if (anInt2633 < i_0_)
									return;
								anInt2633 = i_0_ + i_0_ - 1 - anInt2633;
								anInt2637 = -anInt2637;
								if (--anInt2629 == 0)
									break;
								i_3_ = method135(
										arg0,
										i_3_,
										i,
										arg2,
										(class4_sub4_sub1.aByteArray2661[anInt2636]));
								if (anInt2633 >= i)
									return;
								anInt2633 = i + i - 1 - anInt2633;
								anInt2637 = -anInt2637;
							} while (--anInt2629 != 0);
						} else if (anInt2637 < 0) {
							for (;;) {
								i_3_ = method135(
										arg0,
										i_3_,
										i,
										arg2,
										(class4_sub4_sub1.aByteArray2661[anInt2627 - 1]));
								if (anInt2633 >= i)
									return;
								int i_4_ = (i_0_ - 1 - anInt2633) / i_2_;
								if (i_4_ >= anInt2629) {
									anInt2633 += i_2_ * anInt2629;
									anInt2629 = 0;
									break;
								}
								anInt2633 += i_2_ * i_4_;
								anInt2629 -= i_4_;
							}
						} else {
							for (;;) {
								i_3_ = method141(
										arg0,
										i_3_,
										i_0_,
										arg2,
										(class4_sub4_sub1.aByteArray2661[anInt2636]));
								if (anInt2633 < i_0_)
									return;
								int i_5_ = (anInt2633 - i) / i_2_;
								if (i_5_ >= anInt2629) {
									anInt2633 -= i_2_ * anInt2629;
									anInt2629 = 0;
									break;
								}
								anInt2633 -= i_2_ * i_5_;
								anInt2629 -= i_5_;
							}
						}
					}
				} while (false);
				if (anInt2637 < 0) {
					method135(arg0, i_3_, 0, arg2, 0);
					if (anInt2633 < 0) {
						anInt2633 = -1;
						method156();
						this.clear();
					}
				} else {
					method141(arg0, i_3_, i_1_, arg2, 0);
					if (anInt2633 >= i_1_) {
						anInt2633 = i_1_;
						method156();
						this.clear();
					}
				}
			}
		}
	}

	@Override
	public Class4_Sub2 method81() {
		return null;
	}

	@Override
	public synchronized void method82(int arg0) {
		if (anInt2628 > 0) {
			if (arg0 >= anInt2628) {
				if (anInt2634 == -2147483648) {
					anInt2634 = 0;
					anInt2640 = anInt2638 = anInt2631 = 0;
					this.clear();
					arg0 = anInt2628;
				}
				anInt2628 = 0;
				method144();
			} else {
				anInt2640 += anInt2630 * arg0;
				anInt2638 += anInt2641 * arg0;
				anInt2631 += anInt2635 * arg0;
				anInt2628 -= arg0;
			}
		}
		Class4_Sub4_Sub1 class4_sub4_sub1 = (Class4_Sub4_Sub1) aClass4_Sub4_1873;
		int i = anInt2636 << 8;
		int i_10_ = anInt2627 << 8;
		int i_11_ = class4_sub4_sub1.aByteArray2661.length << 8;
		int i_12_ = i_10_ - i;
		if (i_12_ <= 0)
			anInt2629 = 0;
		if (anInt2633 < 0) {
			if (anInt2637 > 0)
				anInt2633 = 0;
			else {
				method156();
				this.clear();
				return;
			}
		}
		if (anInt2633 >= i_11_) {
			if (anInt2637 < 0)
				anInt2633 = i_11_ - 1;
			else {
				method156();
				this.clear();
				return;
			}
		}
		anInt2633 += anInt2637 * arg0;
		if (anInt2629 < 0) {
			if (aBoolean2639) {
				if (anInt2637 < 0) {
					if (anInt2633 >= i)
						return;
					anInt2633 = i + i - 1 - anInt2633;
					anInt2637 = -anInt2637;
				}
				while (anInt2633 >= i_10_) {
					anInt2633 = i_10_ + i_10_ - 1 - anInt2633;
					anInt2637 = -anInt2637;
					if (anInt2633 >= i)
						break;
					anInt2633 = i + i - 1 - anInt2633;
					anInt2637 = -anInt2637;
				}
			} else if (anInt2637 < 0) {
				if (anInt2633 < i)
					anInt2633 = i_10_ - 1 - (i_10_ - 1 - anInt2633) % i_12_;
			} else if (anInt2633 >= i_10_)
				anInt2633 = i + (anInt2633 - i) % i_12_;
		} else {
			do {
				if (anInt2629 > 0) {
					if (aBoolean2639) {
						if (anInt2637 < 0) {
							if (anInt2633 >= i)
								return;
							anInt2633 = i + i - 1 - anInt2633;
							anInt2637 = -anInt2637;
							if (--anInt2629 == 0)
								break;
						}
						do {
							if (anInt2633 < i_10_)
								return;
							anInt2633 = i_10_ + i_10_ - 1 - anInt2633;
							anInt2637 = -anInt2637;
							if (--anInt2629 == 0)
								break;
							if (anInt2633 >= i)
								return;
							anInt2633 = i + i - 1 - anInt2633;
							anInt2637 = -anInt2637;
						} while (--anInt2629 != 0);
					} else if (anInt2637 < 0) {
						if (anInt2633 >= i)
							return;
						int i_13_ = (i_10_ - 1 - anInt2633) / i_12_;
						if (i_13_ >= anInt2629) {
							anInt2633 += i_12_ * anInt2629;
							anInt2629 = 0;
						} else {
							anInt2633 += i_12_ * i_13_;
							anInt2629 -= i_13_;
							return;
						}
					} else {
						if (anInt2633 < i_10_)
							return;
						int i_14_ = (anInt2633 - i) / i_12_;
						if (i_14_ >= anInt2629) {
							anInt2633 -= i_12_ * anInt2629;
							anInt2629 = 0;
						} else {
							anInt2633 -= i_12_ * i_14_;
							anInt2629 -= i_14_;
							return;
						}
					}
				}
			} while (false);
			if (anInt2637 < 0) {
				if (anInt2633 < 0) {
					anInt2633 = -1;
					method156();
					this.clear();
				}
			} else if (anInt2633 >= i_11_) {
				anInt2633 = i_11_;
				method156();
				this.clear();
			}
		}
	}

	@Override
	public int method83() {
		int i = anInt2640 * 3 >> 6;
		i = (i ^ i >> 31) + (i >>> 31);
		if (anInt2629 == 0)
			i -= i
					* anInt2633
					/ ((((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661).length << 8);
		else if (anInt2629 >= 0)
			i -= i
					* anInt2636
					/ (((Class4_Sub4_Sub1) aClass4_Sub4_1873).aByteArray2661).length;
		if (i > 255)
			return 255;
		return i;
	}
}
