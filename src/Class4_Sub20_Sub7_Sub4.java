/* Class4_Sub20_Sub7_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.net.URL;

public class Class4_Sub20_Sub7_Sub4 extends Class4_Sub20_Sub7 {
	public static Class19 aClass19_3371;
	public static JagexString aJagexString_3359;
	public static JagexString aJagexString_3361 = JagexString.getRs2PreparedString("Art"
    );
	public static JagexString aJagexString_3362;
	public static JagexString aJagexString_3368;
	public static JagexString aJagexString_3369;
	public static JagexString aJagexString_3370;
	public static JagexString aJagexString_3373;
	public static JagexString aJagexString_3374;
	public static JagexString aJagexString_3376;
	public static RSInterface[] aClass4_Sub13Array3377;
	public static Class4_Sub20_Sub7_Sub1_Sub1[] aClass4_Sub20_Sub7_Sub1_Sub1Array3358;
	public static int anInt3357;
	public static int anInt3360;
	public static int anInt3363;
	public static int anInt3364;
	public static int anInt3365;
	public static int anInt3366;
	public static int anInt3367;
	public static int anInt3372;
	public static int anInt3380;
	public static int[][] anIntArrayArray3375;
	static {
		aClass4_Sub20_Sub7_Sub1_Sub1Array3358 = new Class4_Sub20_Sub7_Sub1_Sub1[2048];
		anInt3366 = 0;
		aJagexString_3359 = JagexString.getRs2PreparedString("World");
		aJagexString_3368 = JagexString.getRs2PreparedString("::qa_op_test");
		aJagexString_3370 = (JagexString.getRs2PreparedString(
				"Begeben Sie sich in ein freies Gebiet)1 um"));
		aJagexString_3362 = aJagexString_3359;
		anInt3357 = 0;
		aJagexString_3374 = JagexString.getRs2PreparedString(
				"To create a new account you need to");
		aJagexString_3376 = aJagexString_3359;
		aJagexString_3369 = aJagexString_3374;
		aJagexString_3373 = JagexString
				.getRs2PreparedString("Texturen geladen)3");
	}

	public static void method420(int arg0) {
		try {
			anIntArrayArray3375 = null;
			aJagexString_3359 = null;
			aJagexString_3368 = null;
			aJagexString_3362 = null;
			aJagexString_3369 = null;
			aClass19_3371 = null;
			aJagexString_3374 = null;
			aJagexString_3370 = null;
			aClass4_Sub20_Sub7_Sub1_Sub1Array3358 = null;
			if (arg0 != -2)
				method424((byte) 93, null, null);
			aClass4_Sub13Array3377 = null;
			aJagexString_3373 = null;
			aJagexString_3376 = null;
			aJagexString_3361 = null;
		} catch (RuntimeException runtimeexception) {
			throw method423(runtimeexception, "gf.C(" + arg0 + ')');
		}
	}

	public static Class4_Sub20_Sub12_Sub2 method421(boolean arg0, int arg1,
			int arg2, int arg3, byte arg4, int arg5) {
		try {
			long l = (((long) arg5 << 1366978280) + (arg1 + (((long) arg2 << -358778032) - -((long) arg3 << -1982051354))));
			anInt3380++;
			if (!arg0) {
				Class4_Sub20_Sub12_Sub2 class4_sub20_sub12_sub2 = ((Class4_Sub20_Sub12_Sub2) Class9.aClass66_277
						.method1083(l, true));
				if (class4_sub20_sub12_sub2 != null)
					return class4_sub20_sub12_sub2;
			}
			Class4_Sub20_Sub8 class4_sub20_sub8 = Class4_Sub23.method633(arg1,
					(byte) -115);
			if ((arg2 ^ 0xffffffff) < -2
					&& class4_sub20_sub8.anIntArray2961 != null) {
				int i = -1;
				for (int i_0_ = 0; i_0_ < 10; i_0_++) {
					if (arg2 >= class4_sub20_sub8.anIntArray2997[i_0_]
							&& (class4_sub20_sub8.anIntArray2997[i_0_] ^ 0xffffffff) != -1)
						i = class4_sub20_sub8.anIntArray2961[i_0_];
				}
				if ((i ^ 0xffffffff) != 0)
					class4_sub20_sub8 = Class4_Sub23.method633(i, (byte) -119);
			}
			Class4_Sub20_Sub7_Sub7 class4_sub20_sub7_sub7 = class4_sub20_sub8
					.method461(arg4 + 86, 1);
			if (class4_sub20_sub7_sub7 == null)
				return null;
			Class4_Sub20_Sub12_Sub2 class4_sub20_sub12_sub2 = null;
			if ((class4_sub20_sub8.anInt2986 ^ 0xffffffff) != 0) {
				class4_sub20_sub12_sub2 = method421(true,
						class4_sub20_sub8.anInt2977, 10, 1, (byte) -97, 0);
				if (class4_sub20_sub12_sub2 == null)
					return null;
			}
			int[] is = Class4_Sub20_Sub12.anIntArray3099;
			int i = Class4_Sub20_Sub12.anInt3098;
			int i_1_ = Class4_Sub20_Sub12.anInt3102;
			int[] is_2_ = new int[4];
			Class4_Sub20_Sub12.method495(is_2_);
			Class4_Sub20_Sub12_Sub2 class4_sub20_sub12_sub2_3_ = new Class4_Sub20_Sub12_Sub2(
					36, 32);
			Class4_Sub20_Sub12.method493(
					class4_sub20_sub12_sub2_3_.anIntArray3515, 36, 32);
			Class4_Sub20_Sub12.method496();
			Class4_Sub20_Sub12_Sub3.method543();
			Class4_Sub20_Sub12_Sub3.method546(16, 16);
			Class4_Sub20_Sub12_Sub3.aBoolean3537 = false;
			int i_4_ = class4_sub20_sub8.anInt2983;
			if (arg0)
				i_4_ = (int) (1.5 * i_4_);
			else if (arg3 == 2)
				i_4_ = (int) (1.04 * i_4_);
			int i_5_ = ((Class4_Sub20_Sub12_Sub3.anIntArray3524[class4_sub20_sub8.anInt3003])
					* i_4_ >> -1882203568);
			int i_6_ = ((Class4_Sub20_Sub12_Sub3.anIntArray3528[class4_sub20_sub8.anInt3003])
					* i_4_ >> 1098861360);
			class4_sub20_sub7_sub7.method446();
			class4_sub20_sub7_sub7
					.method437(
							0,
							class4_sub20_sub8.anInt2995,
							class4_sub20_sub8.anInt2976,
							class4_sub20_sub8.anInt3003,
							class4_sub20_sub8.anInt2965,
							(class4_sub20_sub8.anInt3010 + (class4_sub20_sub7_sub7.anInt2938 / 2 + i_5_)),
							i_6_ + class4_sub20_sub8.anInt3010);
			if ((arg3 ^ 0xffffffff) <= -2)
				class4_sub20_sub12_sub2_3_.method537(1);
			if ((arg3 ^ 0xffffffff) <= -3)
				class4_sub20_sub12_sub2_3_.method537(16777215);
			if ((arg5 ^ 0xffffffff) != -1)
				class4_sub20_sub12_sub2_3_.method520(arg5);
			Class4_Sub20_Sub12.method493(
					class4_sub20_sub12_sub2_3_.anIntArray3515, 36, 32);
			if ((class4_sub20_sub8.anInt2986 ^ 0xffffffff) != 0)
				class4_sub20_sub12_sub2.method532(0, 0);
			if (!arg0
					&& ((class4_sub20_sub8.anInt3012 ^ 0xffffffff) == -2 || arg2 != 1)
					&& arg2 != -1)
				Class4_Sub20_Sub1.aClass4_Sub20_Sub12_Sub4_Sub1_2708.method577(
						Class30.method872(arg2, -1), 0, 9, 16776960, 1);
			if (arg4 != -97)
				method424((byte) 64, null, null);
			if (!arg0)
				Class9.aClass66_277.method1082(true, l,
						class4_sub20_sub12_sub2_3_);
			Class4_Sub20_Sub12.method493(is, i, i_1_);
			Class4_Sub20_Sub12.method490(is_2_);
			Class4_Sub20_Sub12_Sub3.method543();
			Class4_Sub20_Sub12_Sub3.aBoolean3537 = true;
			return class4_sub20_sub12_sub2_3_;
		} catch (RuntimeException runtimeexception) {
			throw method423(runtimeexception, ("gf.B(" + arg0 + ',' + arg1
					+ ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')'));
		}
	}

	public static void method422(Throwable arg0, int arg1, String arg2) {
		anInt3363++;
		do {
			try {
				String string = "";
				if (arg0 != null)
					string = Class46.method974((byte) -24, arg0);
				if (arg2 != null) {
					if (arg0 != null)
						string += " | ";
					string += arg2;
				}
				System.out.println("Error: " + string);
				string = string.replace(':', '.');
				string = string.replace('@', '_');
				string = string.replace('&', '_');
				string = string.replace('#', '_');
				if (Class77.aClass75_1597.applet != null) {
					if (arg1 >= -42)
						method422(null, 50, null);
					Class22 class22 = (Class77.aClass75_1597.method1173(
							-128,
							new URL(Class77.aClass75_1597.applet
									.getCodeBase(), ("clienterror.ws?c="
									+ Class4_Sub20_Sub7_Sub3.anInt3347 + "&u="
									+ Class25.aLong584 + "&v1="
									+ Signlink.jVendor + "&v2="
									+ Signlink.jVersion + "&e=" + string))));
					while (class22.anInt545 == 0)
						Class25.method799(1L, 10);
					if (class22.anInt545 != 1)
						break;
					DataInputStream datainputstream = (DataInputStream) class22.anObject543;
					datainputstream.read();
					datainputstream.close();
				}
			} catch (Exception exception) {
				break;
			}
			break;
		} while (false);
	}

	public static JagexException method423(Throwable arg0, String arg1) {
		try {
			JagexException runtimeexception_sub1;
			if (arg0 instanceof JagexException) {
				runtimeexception_sub1 = (JagexException) arg0;
				runtimeexception_sub1.errorMessage += ' ' + arg1;
			} else
				runtimeexception_sub1 = new JagexException(arg0, arg1);
			anInt3360++;
			return runtimeexception_sub1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void method424(byte arg0, Object arg1, Signlink arg2) {
		do {
			try {
				anInt3372++;
				if (arg2.anEventQueue1533 != null && arg0 <= -28) {
					for (int i = 0; i < 50
							&& arg2.anEventQueue1533.peekEvent() != null; i++)
						Class25.method799(1L, 10);
					if (arg1 == null)
						break;
					arg2.anEventQueue1533.postEvent(new ActionEvent(arg1, 1001,
							"dummy"));
				}
			} catch (RuntimeException runtimeexception) {
				throw method423(runtimeexception, ("gf.A(" + arg0 + ','
						+ (arg1 != null ? "{...}" : "null") + ','
						+ (arg2 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public int anInt3378;

	public int anInt3379;

	@Override
	public Class4_Sub20_Sub7_Sub7 method378(boolean arg0) {
		try {
			anInt3365++;
			if (arg0 != false)
				aClass4_Sub13Array3377 = null;
			return Class4_Sub23.method633(anInt3379, (byte) -117).method461(
					-11, anInt3378);
		} catch (RuntimeException runtimeexception) {
			throw method423(runtimeexception, "gf.V(" + arg0 + ')');
		}
	}
}
