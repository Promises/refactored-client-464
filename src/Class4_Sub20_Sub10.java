/* Class4_Sub20_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4_Sub20_Sub10 extends Class4_Sub20 {
	public static byte[][][] aByteArrayArrayArray3054;
	public static byte[][][] aByteArrayArrayArray3065;
	public static Class19 aClass19_3062;
	public static JagexString aJagexString_3056;
	public static JagexString aJagexString_3058;
	public static JagexString aJagexString_3059;
	public static JagexString aJagexString_3067;
	public static JagexString aJagexString_3069;
	public static JagexString aJagexString_3071;
	public static JagexString aJagexString_3072;
	public static RSInterface aClass4_Sub13_3064;
	public static long aLong3063;
	public static int anInt3053;
	public static int anInt3055;
	public static int anInt3057 = 0;
	public static int anInt3060;
	public static int anInt3066;
	public static int anInt3068;
	static {
		aJagexString_3056 = JagexString.getRs2PreparedString("mapedge");
		anInt3055 = 0;
		anInt3060 = 0;
		aJagexString_3058 = JagexString.getRs2PreparedString("Welcome to RuneScape"
        );
		aJagexString_3059 = JagexString.getRs2PreparedString(
				" is already on your ignore list");
		aLong3063 = 0L;
		anInt3066 = 0;
		aJagexString_3067 = aJagexString_3059;
		aJagexString_3069 = aJagexString_3058;
		aJagexString_3071 = JagexString.getRs2PreparedString("event_opbase");
		anInt3053 = 1;
		aJagexString_3072 = JagexString.getRs2PreparedString("<)4col>");
	}

	public static void method482(boolean arg0, long arg1) {
		do {
			try {
				anInt3068++;
				if (arg1 != 0L) {
					Class66.aClass4_Sub11_Sub1_1328.method264(218, 125);
					Class66.aClass4_Sub11_Sub1_1328.method255(189354448, arg1);
					Class43.anInt859++;
					if (arg0 == true)
						break;
					anInt3053 = -61;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						("ma.B(" + arg0 + ',' + arg1 + ')'));
			}
			break;
		} while (false);
	}

	public static void method483(byte arg0) {
		try {
			aClass19_3062 = null;
			aJagexString_3058 = null;
			aJagexString_3071 = null;
			aByteArrayArrayArray3065 = null;
			aJagexString_3069 = null;
			aJagexString_3067 = null;
			aClass4_Sub13_3064 = null;
			if (arg0 >= -40)
				method482(true, -36L);
			aJagexString_3072 = null;
			aJagexString_3056 = null;
			aByteArrayArrayArray3054 = null;
			aJagexString_3059 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ma.A("
					+ arg0 + ')');
		}
	}

	public byte aByte3052;

	public Class19_Sub1 aClass19_Sub1_3061;

	public int anInt3070;
}
