/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public abstract class Class45 {
	public static Calendar aCalendar919;
	public static JagexString aJagexString_918 = JagexString.getRs2PreparedString("Mem:"
    );
	public static JagexString aJagexString_921 = JagexString.getRs2PreparedString(
			"Schlie-8en");
	public static JagexString aJagexString_922;
	public static JagexString aJagexString_924 = JagexString.getRs2PreparedString(
			"Lade Sprites )2 ");
	public static JagexString aJagexString_925;
	public static int anInt920 = 2301979;
	public static int anInt923 = 0;
	public static int anInt926;

	static {
		aJagexString_922 = JagexString.getRs2PreparedString(" <col=ffff00>");
		aJagexString_925 = JagexString.getRs2PreparedString("<col=ff7000>");
		aCalendar919 = Calendar.getInstance();
	}

	public static void method972(int arg0) {
		do {
			try {
				aCalendar919 = null;
				aJagexString_921 = null;
				aJagexString_918 = null;
				aJagexString_922 = null;
				aJagexString_925 = null;
				aJagexString_924 = null;
				if (arg0 <= -109)
					break;
				method972(102);
			} catch (RuntimeException runtimeexception) {
				throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
						"lf.C(" + arg0 + ')');
			}
			break;
		} while (false);
	}

	public abstract void method970(int i, byte[] is);

	public abstract byte[] method971(boolean bool);
}
