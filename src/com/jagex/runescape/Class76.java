package com.jagex.runescape;
import com.jagex.runescape.util.Signlink;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Class76 implements Runnable {
	public static byte[][] aByteArrayArray1578;
	public static JagexString aJagexString_1557;
	public static JagexString aJagexString_1560 = JagexString.getRs2PreparedString(
			" steht bereits auf Ihrer Freunde)2Liste(Q");
	public static JagexString aJagexString_1561;
	public static JagexString aJagexString_1563;
	public static JagexString aJagexString_1564;
	public static JagexString aJagexString_1566;
	public static JagexString aJagexString_1579;
	public static int anInt1545;
	public static int anInt1546;
	public static int anInt1549;
	public static int anInt1550;
	public static int anInt1551;
	public static int anInt1555;
	public static int anInt1556;
	public static int anInt1559;
	public static int anInt1569;
	public static int anInt1570;
	public static int anInt1572;
	public static int anInt1574;
	public static int anInt1577;
	public static int anInt1580;
	public static int anInt1581;
	public static int anInt1582;
	public static int[] anIntArray1565;
	public static int[] skillLevel;
	public static short[][] aShortArrayArray1576;
	static {
		anInt1550 = 0;
		aJagexString_1557 = JagexString.getRs2PreparedString("W-=hlen Sie eine Option"
        );
		skillLevel = new int[25];
		aJagexString_1563 = JagexString.getRs2PreparedString("Neuer Benutzer");
		aJagexString_1566 = JagexString.getRs2PreparedString("Free world");
		aJagexString_1564 = JagexString.getRs2PreparedString(" loggt sich aus)3");
		aShortArrayArray1576 = new short[][] {
				new short[0],
				{ 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466,
						10145, -6882, 5027, 1457, 16565, -30545, 25486 },
				new short[0], new short[0], new short[0] };
		aJagexString_1561 = aJagexString_1566;
		GameShell.appletListener = new AppletListener();
		anInt1580 = 0;
		aJagexString_1579 = JagexString.getRs2PreparedString("blinken1:");
		anInt1581 = 0;
		aByteArrayArray1578 = new byte[1000][];
		anInt1582 = 0;
	}

	public static void method1180(boolean arg0) {
		try {
			anIntArray1565 = null;
			aJagexString_1564 = null;
			aShortArrayArray1576 = null;
			GameShell.appletListener = null;
			skillLevel = null;
			aJagexString_1563 = null;
			aByteArrayArray1578 = null;
			aJagexString_1561 = null;
			aJagexString_1557 = null;
			aJagexString_1579 = null;
			if (arg0 != false)
				aShortArrayArray1576 = null;
			aJagexString_1560 = null;
			aJagexString_1566 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "vc.G("
					+ arg0 + ')');
		}
	}

	public static void method1182(int arg0) {
		anInt1569++;
		if (GameShell.appletListener != null) {
			synchronized (GameShell.appletListener) {
				GameShell.appletListener = null;
			}
		}
		if (arg0 >= -75)
			method1187((byte) 113, -128);
	}

	public static JagexString method1185(int arg0, int arg1, boolean arg2, int arg3) {
		try {
			if ((arg0 ^ 0xffffffff) > -2 || arg0 > 36)
				arg0 = 10;
			anInt1572++;
			int i = 1;
			int i_0_ = arg3 / arg0;
			for (/**/; i_0_ != 0; i_0_ /= arg0)
				i++;
			int i_2_ = i;
			if ((arg3 ^ 0xffffffff) > -1 || arg2)
				i_2_++;
			byte[] is = new byte[i_2_];
			if ((arg3 ^ 0xffffffff) > -1)
				is[0] = (byte) 45;
			else if (arg2)
				is[0] = (byte) 43;
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i ^ 0xffffffff); i_3_++) {
				int i_4_ = arg3 % arg0;
				if ((i_4_ ^ 0xffffffff) > -1)
					i_4_ = -i_4_;
				arg3 /= arg0;
				if ((i_4_ ^ 0xffffffff) < -10)
					i_4_ += 39;
				is[-1 + i_2_ - i_3_] = (byte) (48 + i_4_);
			}
			JagexString jagexString = new JagexString();
			jagexString.anInt1805 = i_2_;
			jagexString.aByteArray1803 = is;
			return jagexString;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("vc.D("
					+ arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
		}
	}

	public static void method1187(byte arg0, int arg1) {
		try {
			anInt1546++;
			Class4_Sub1 class4_sub1 = ((Class4_Sub1) Class31.aClass16_671
					.method725((byte) 117, arg1));
			if (class4_sub1 != null) {
				if (arg0 < 104)
					GameShell.appletListener = null;
				for (int i = 0; ((i ^ 0xffffffff) > (class4_sub1.anIntArray1866.length ^ 0xffffffff)); i++) {
					class4_sub1.anIntArray1866[i] = -1;
					class4_sub1.anIntArray1858[i] = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("vc.F("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public static boolean method1188(int arg0, byte arg1) {
		try {
			anInt1545++;
			if ((0x1 & arg0 >> -1729115851) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("vc.E("
					+ arg0 + ',' + arg1 + ')'));
		}
	}

	public boolean aBoolean1567;
	public boolean aBoolean1573 = false;
	public byte[] aByteArray1562;
	public Class22 aClass22_1548;

	public Signlink aClass75_1568;

	public InputStream anInputStream1554;

	public int anInt1547 = 0;

	public int anInt1575 = 0;

	public OutputStream anOutputStream1553;

	public Socket aSocket1558;

	public Class76(Socket arg0, Signlink arg1) throws IOException {
		aBoolean1567 = false;
		try {
			aClass75_1568 = arg1;
			aSocket1558 = arg0;
			aSocket1558.setSoTimeout(30000);
			aSocket1558.setTcpNoDelay(true);
			anInputStream1554 = aSocket1558.getInputStream();
			anOutputStream1553 = aSocket1558.getOutputStream();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					("vc.<init>(" + (arg0 != null ? "{...}" : "null") + ','
							+ (arg1 != null ? "{...}" : "null") + ')'));
		}
	}

	public void method1181(int arg0) {
		anInt1556++;
		if (!aBoolean1567) {
			synchronized (this) {
				aBoolean1567 = true;
				this.notifyAll();
			}
			if (aClass22_1548 != null) {
				while (aClass22_1548.anInt545 == 0)
					Class25.method799(1L, 10);
				if ((aClass22_1548.anInt545 ^ 0xffffffff) == -2) {
					try {
						((Thread) aClass22_1548.anObject543).join();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			aClass22_1548 = null;
			if (arg0 != -31709)
				method1185(-79, 26, false, -55);
		}
	}

	public void method1183(int arg0, int arg1, int arg2, byte[] arg3)
			throws IOException {
		try {
			anInt1574++;
			if (!aBoolean1567) {
				if (aBoolean1573) {
					aBoolean1573 = false;
					throw new IOException();
				}
				if (aByteArray1562 == null)
					aByteArray1562 = new byte[5000];
				synchronized (this) {
					int i = 0;
					if (arg2 < 120)
						method1187((byte) -124, 115);
					for (/**/; (arg0 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
						aByteArray1562[anInt1547] = arg3[i + arg1];
						anInt1547 = (anInt1547 + 1) % 5000;
						if (((4900 + anInt1575) % 5000 ^ 0xffffffff) == (anInt1547 ^ 0xffffffff))
							throw new IOException();
					}
					if (aClass22_1548 == null)
						aClass22_1548 = aClass75_1568.method1172(this, 3, 43);
					this.notifyAll();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("vc.I("
					+ arg0 + ',' + arg1 + ',' + arg2 + ','
					+ (arg3 != null ? "{...}" : "null") + ')'));
		}
	}

	public int method1184(int arg0) throws IOException {
		try {
			anInt1570++;
			if (aBoolean1567)
				return 0;
			return anInputStream1554.read();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "vc.J("
					+ arg0 + ')');
		}
	}

	public void method1186(byte[] arg0, int arg1, int arg2, int arg3)
			throws IOException {
		anInt1555++;
		if (!aBoolean1567) {
			int i;
			for (/**/; arg3 > 0; arg3 -= i) {
				i = anInputStream1554.read(arg0, arg2, arg3);
				if (i <= 0)
					throw new EOFException();
				arg2 += i;
			}
			if (arg1 <= 24)
				aShortArrayArray1576 = null;
		}
	}

	public int method1189(boolean arg0) throws IOException {
		try {
			if (arg0 != true)
				return 15;
			anInt1551++;
			if (aBoolean1567)
				return 0;
			return anInputStream1554.available();
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "vc.C("
					+ arg0 + ')');
		}
	}

	@Override
	public void run() {
		try {
			anInt1577++;
			try {
				for (;;) {
					int i;
					int i_5_;
					synchronized (this) {
						if ((anInt1575 ^ 0xffffffff) == (anInt1547 ^ 0xffffffff)) {
							if (aBoolean1567)
								break;
							try {
								this.wait();
							} catch (InterruptedException interruptedexception) {
								/* empty */
							}
						}
						if ((anInt1547 ^ 0xffffffff) > (anInt1575 ^ 0xffffffff))
							i = -anInt1575 + 5000;
						else
							i = -anInt1575 + anInt1547;
						i_5_ = anInt1575;
					}
					if (i > 0) {
						try {
							anOutputStream1553.write(aByteArray1562, i_5_, i);
						} catch (IOException ioexception) {
							aBoolean1573 = true;
						}
						anInt1575 = (anInt1575 + i) % 5000;
						try {
							if ((anInt1575 ^ 0xffffffff) == (anInt1547 ^ 0xffffffff))
								anOutputStream1553.flush();
						} catch (IOException ioexception) {
							aBoolean1573 = true;
						}
					}
				}
				try {
					if (anInputStream1554 != null)
						anInputStream1554.close();
					if (anOutputStream1553 != null)
						anOutputStream1553.close();
					if (aSocket1558 != null)
						aSocket1558.close();
				} catch (IOException ioexception) {
					/* empty */
				}
				aByteArray1562 = null;
			} catch (Exception exception) {
				Class4_Sub20_Sub7_Sub4.method422(exception, -91, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
					"vc.run(" + ')');
		}
	}
}
