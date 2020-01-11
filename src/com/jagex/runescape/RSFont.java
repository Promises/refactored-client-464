package com.jagex.runescape;

public class RSFont {
    public static boolean aBoolean152 = false;
    public static Class19 aClass19_158;
    public static Class19 aClass19_169;
    public static JagexString aJagexString_138;
    public static JagexString aJagexString_140 = JagexString.getRs2PreparedString(
            "Your ignore list is full)3 Max of 100 hit");
    public static JagexString aJagexString_142 = JagexString.getRs2PreparedString("sl_flags");
    public static JagexString aJagexString_146 = JagexString.getRs2PreparedString("mapback");
    public static JagexString aJagexString_147 = JagexString.getRs2PreparedString("Hier wechseln");
    public static JagexString aJagexString_151 = JagexString.getRs2PreparedString("mapmarker");
    public static JagexString aJagexString_153;
    public static JagexString aJagexString_159 = JagexString.getRs2PreparedString("Login limit exceeded)3"
    );
    public static JagexString aJagexString_163;
    public static JagexString aJagexString_164;
    public static JagexString aJagexString_165 = JagexString.getRs2PreparedString("level)2");
    public static JagexString aJagexString_166;
    public static JagexString aJagexString_167 = JagexString.getRs2PreparedString("und Ihr Passwort ein)3"
    );
    public static JagexString aJagexString_168 = JagexString.getRs2PreparedString(
            "Your profile will be transferred in:");
    public static JagexString aJagexString_170 = (JagexString.getRs2PreparedString(
            "RuneScape is loading )2 please wait)3)3)3"));
    public static Class4_Sub2_Sub2 aClass4_Sub2_Sub2_139;
    public static Class65 aClass65_144 = new Class65();
    public static int anInt141;
    public static int anInt143;
    public static int anInt145;
    public static int anInt148 = 0;
    public static int anInt156;
    public static int anInt157;
    public static int anInt161 = 0;
    public static int anInt162 = 0;
    public static int[] anIntArray160 = new int[2000];
    public RSFont next;
    public RSFont prev;
    public long aLong150;


    static {
        aJagexString_138 = aJagexString_140;
        aJagexString_153 = aJagexString_159;
        aJagexString_164 = aJagexString_165;
        aJagexString_166 = aJagexString_170;
        aJagexString_163 = aJagexString_168;
    }

    public static void method69(byte arg0) {
        try {
            aJagexString_164 = null;
            aJagexString_159 = null;
            aJagexString_165 = null;
            aJagexString_153 = null;
            aJagexString_167 = null;
            aJagexString_168 = null;
            aClass19_169 = null;
            aClass19_158 = null;
            anIntArray160 = null;
            aJagexString_163 = null;
            aClass65_144 = null;
            aJagexString_151 = null;
            aJagexString_138 = null;
            aJagexString_170 = null;
            aJagexString_166 = null;
            aClass4_Sub2_Sub2_139 = null;
            if (arg0 <= 83)
                anInt162 = -60;
            aJagexString_140 = null;
            aJagexString_147 = null;
            aJagexString_142 = null;
            aJagexString_146 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "ad.DB("
                    + arg0 + ')');
        }
    }

    public static boolean method71(int arg0, RSInterface rsInterface) {
        try {
            anInt143++;
            int i = rsInterface.anInt2227;
            if (i == 205) {
                Class78.anInt1599 = 250;
                return true;
            }
            if (i >= 300 && (i ^ 0xffffffff) >= -314) {
                int i_0_ = (i - 300) / 2;
                int i_1_ = 0x1 & i;
                Class4_Sub24.aClass35_2438.method899((i_1_ ^ 0xffffffff) == -2,
                        7872, i_0_);
            }
            if ((i ^ 0xffffffff) <= -315 && i <= 323) {
                int i_2_ = (i - 314) / 2;
                int i_3_ = i & 0x1;
                Class4_Sub24.aClass35_2438.method906(i_3_ == 1, i_2_, 80);
            }
            if (arg0 >= -113)
                aJagexString_163 = null;
            if ((i ^ 0xffffffff) == -325)
                Class4_Sub24.aClass35_2438.method905(false, (byte) 97);
            if (i == 325)
                Class4_Sub24.aClass35_2438.method905(true, (byte) 77);
            if (i == 326) {
                Class66.aClass4_Sub11_Sub1_1328.method264(49, -105);
                Class4_Sub20_Sub4.anInt2847++;
                Class4_Sub24.aClass35_2438.method908(
                        Class66.aClass4_Sub11_Sub1_1328, -113);
                return true;
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ad.GB("
                    + arg0 + ',' + (rsInterface != null ? "{...}" : "null") + ')'));
        }
    }

    public static int method73(byte arg0, int arg1, int arg2, int arg3) {
        try {
            if ((arg1 ^ 0xffffffff) < -180)
                arg2 /= 2;
            if (arg0 != -1)
                method74(110, 80, 49, 2, -125, null, 113, -9);
            if (arg1 > 192)
                arg2 /= 2;
            anInt157++;
            if (arg1 > 217)
                arg2 /= 2;
            if ((arg1 ^ 0xffffffff) < -244)
                arg2 /= 2;
            int i = (arg1 / 2 + ((arg2 / 32 << 1644991495) + (arg3 / 4 << -990288854)));
            return i;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("ad.FB("
                    + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')'));
        }
    }

    public static void method74(int arg0, int arg1, int arg2, int arg3,
                                int arg4, RSInterface arg5, int arg6, int arg7) {
        anInt156++;
        if (Class32.aBoolean703)
            Class8.anInt244 = 32;
        else
            Class8.anInt244 = 0;
        Class32.aBoolean703 = false;
        if (arg2 < 73)
            aClass65_144 = null;
        if (Class4_Sub20_Sub7_Sub1_Sub1.anInt3587 != 0) {
            if (arg1 > arg0 || (arg0 ^ 0xffffffff) <= (16 + arg1 ^ 0xffffffff)
                    || arg7 < arg6
                    || (16 + arg6 ^ 0xffffffff) >= (arg7 ^ 0xffffffff)) {
                if ((arg1 ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
                        && (arg0 ^ 0xffffffff) > (arg1 - -16 ^ 0xffffffff)
                        && (-16 + (arg6 - -arg4) ^ 0xffffffff) >= (arg7 ^ 0xffffffff)
                        && arg7 < arg6 - -arg4) {
                    arg5.anInt2238 += 4;
                    Class67.method1088(arg5);
                } else if (arg0 >= -Class8.anInt244 + arg1
                        && arg1 - -16 - -Class8.anInt244 > arg0
                        && (16 + arg6 ^ 0xffffffff) >= (arg7 ^ 0xffffffff)
                        && arg4 + (arg6 + -16) > arg7) {
                    int i = arg4 * (-32 + arg4) / arg3;
                    if ((i ^ 0xffffffff) > -9)
                        i = 8;
                    int i_4_ = -16 + (arg7 + -arg6) + -(i / 2);
                    int i_5_ = -i + -32 + arg4;
                    arg5.anInt2238 = i_4_ * (-arg4 + arg3) / i_5_;
                    Class67.method1088(arg5);
                    Class32.aBoolean703 = true;
                }
            } else {
                arg5.anInt2238 -= 4;
                Class67.method1088(arg5);
            }
        }
        if (RS2Font.anInt2768 != 0) {
            int i = arg5.anInt2156;
            if ((arg1 + -i ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
                    && (arg6 ^ 0xffffffff) >= (arg7 ^ 0xffffffff)
                    && (arg0 ^ 0xffffffff) > (16 + arg1 ^ 0xffffffff)
                    && (arg6 - -arg4 ^ 0xffffffff) <= (arg7 ^ 0xffffffff)) {
                arg5.anInt2238 += RS2Font.anInt2768 * 45;
                Class67.method1088(arg5);
            }
        }
    }


    public void clear() {
        if (prev != null) {
            prev.next = next;
            next.prev = prev;
            prev = null;
            next = null;
        }
    }

    public boolean method72() {
        return prev != null;
    }
}
