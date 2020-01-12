package com.jagex.runescape;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class46 {
	public static byte[][][] currentSceneTileFlags;
	public static JagexString aJagexString_928 = JagexString.getRs2PreparedString("Weiter"
    );
	public static JagexString aJagexString_930 = JagexString.getRs2PreparedString("au"
    );
	public static JagexString aJagexString_941;
	public static JagexString aJagexString_942;
	public static JagexString aJagexString_944;
	public static RSInterface rsInterface;
	public static int anInt927;
	public static int anInt929;
	public static int anInt931;
	public static int anInt932;
	public static int anInt933;
	public static int anInt935;
	public static int anInt936;
	public static int anInt943;
	public static int[] anIntArray934 = new int[256];
	public static int[] anIntArray937;
	public static int[] anIntArray939;
	public static int[] skillExperience;

	static {
		for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
			int i_6_ = i;
			for (int i_7_ = 0; i_7_ < 8; i_7_++) {
				if ((0x1 & i_6_) != 1)
					i_6_ >>>= 1;
				else
					i_6_ = ~0x12477cdf ^ i_6_ >>> -1734191103;
			}
			anIntArray934[i] = i_6_;
		}
		currentSceneTileFlags = new byte[4][104][104];
		anInt936 = 0;
		anIntArray939 = new int[5];
		aJagexString_944 = JagexString.getRs2PreparedString("gleiten:");
		anInt943 = -1;
		skillExperience = new int[25];
		aJagexString_941 = JagexString.getRs2PreparedString(" ");
		aJagexString_942 = aJagexString_941;
	}

	public static void method973(boolean arg0, int arg1, int arg2) {
		try {
			if (Class4_Sub20_Sub8.anInt3021 != 0 && arg1 != -1) {
				AppletListener.method1151(Class4_Sub20_Sub8.anInt3021, -2,
						Class24.aClass19_Sub1_562, 0, arg1, false);
				Class4_Sub20_Sub6.aBoolean2895 = true;
			}
			if (arg0 != false)
				resetCache(-56);
			anInt935++;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("md.B("
					+ arg0 + ',' + arg1 + ',' + arg2 + ')'));
		}
	}

	public static String method974(byte arg0, Throwable arg1)
			throws IOException {
		try {
			anInt927++;
			String string;
			if (!(arg1 instanceof JagexException))
				string = "";
			else {
				JagexException runtimeexception_sub1 = (JagexException) arg1;
				arg1 = runtimeexception_sub1.throwable;
				string = runtimeexception_sub1.errorMessage + " | ";
			}
			StringWriter stringwriter = new StringWriter();
			if (arg0 != -24)
				anInt936 = 111;
			PrintWriter printwriter = new PrintWriter(stringwriter);
			arg1.printStackTrace(printwriter);
			printwriter.close();
			String string_0_ = stringwriter.toString();
			BufferedReader bufferedreader = new BufferedReader(
					new StringReader(string_0_));
			String string_1_ = bufferedreader.readLine();
			for (;;) {
				String string_2_ = bufferedreader.readLine();
				if (string_2_ == null)
					break;
				int i = string_2_.indexOf('(');
				int i_3_ = string_2_.indexOf(')', i - -1);
				if (i >= 0 && i_3_ >= 0) {
					String string_4_ = string_2_.substring(i - -1, i_3_);
					int i_5_ = string_4_.indexOf(".java:");
					if ((i_5_ ^ 0xffffffff) <= -1) {
						string_4_ = (string_4_.substring(0, i_5_) + string_4_
								.substring(5 + i_5_));
						string += string_4_ + ' ';
						continue;
					}
					string_2_ = string_2_.substring(0, i);
				}
				string_2_ = string_2_.trim();
				string_2_ = string_2_.substring(1 + string_2_.lastIndexOf(' '));
				string_2_ = string_2_.substring(string_2_.lastIndexOf('\t')
						- -1);
				string += string_2_ + ' ';
			}
			string += "| " + string_1_;
			return string;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void resetCache(int arg0) {
		try {
			anIntArray934 = null;
			currentSceneTileFlags = null;
			anIntArray937 = null;
			rsInterface = null;
			aJagexString_930 = null;
			aJagexString_928 = null;
			aJagexString_941 = null;
			aJagexString_942 = null;
			skillExperience = null;
			aJagexString_944 = null;
			anIntArray939 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "md.C("
					+ arg0 + ')');
		}
	}
}
