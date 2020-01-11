package com.jagex.runescape;

import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;

public class JagexString {
    public static Class<?> aClass1830;
    public static JagexString aJagexString_1775;
    public static JagexString aJagexString_1800;
    public static JagexString aJagexString_1801 = getRs2PreparedString("(U1");
    public static JagexString aJagexString_1812;
    public static JagexString aJagexString_1814;
    public static JagexString aJagexString_1815;
    public static JagexString aJagexString_1822;
    public static JagexString aJagexString_1824;
    public static Frame aFrame1786;
    public static int[] anIntArray1798;
    public static int anInt1827 = 0;

    static {
        aJagexString_1800 = getRs2PreparedString(
                "No reply from loginserver)3");
        aJagexString_1812 = getRs2PreparedString("welle:");
        aJagexString_1814 = getRs2PreparedString(
                "Starting game engine)3)3)3");
        aJagexString_1822 = aJagexString_1814;
        aJagexString_1775 = aJagexString_1800;
        aJagexString_1824 = getRs2PreparedString("title)3jpg");
        aJagexString_1815 = getRs2PreparedString(" )2> <col=ffffff>");
    }

    public static void method810(byte arg0) {
        try {
            aJagexString_1800 = null;
            aFrame1786 = null;
            aJagexString_1822 = null;
            if (arg0 >= -98) {
                aJagexString_1824 = null;
            }
            aJagexString_1814 = null;
            anIntArray1798 = null;
            aJagexString_1824 = null;
            aJagexString_1815 = null;
            aJagexString_1775 = null;
            aJagexString_1812 = null;
            aJagexString_1801 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.Q("
                    + arg0 + ')');
        }
    }

    public static void method823(int arg0, Class4_Sub20_Sub7_Sub1 arg1) {
        arg1.aBoolean3290 = false;
        if (arg1.anInt3257 != -1) {
            Class4_Sub20_Sub17 class4_sub20_sub17 = Class68.method1093(
                    arg1.anInt3257, (byte) -126);
            if (class4_sub20_sub17 != null
                    && class4_sub20_sub17.anIntArray3211 != null) {
                arg1.anInt3230++;
                if (arg1.anInt3258 < class4_sub20_sub17.anIntArray3211.length
                        && (class4_sub20_sub17.anIntArray3200[arg1.anInt3258] < arg1.anInt3230)) {
                    arg1.anInt3230 = 1;
                    arg1.anInt3258++;
                    Class24.method790(arg1.anInt3270, arg1.anInt3258,
                            class4_sub20_sub17, arg1.anInt3267, 24);
                }
                if (class4_sub20_sub17.anIntArray3211.length <= arg1.anInt3258) {
                    arg1.anInt3230 = 0;
                    arg1.anInt3258 = 0;
                    Class24.method790(arg1.anInt3270, arg1.anInt3258,
                            class4_sub20_sub17, arg1.anInt3267, 24);
                }
            } else {
                arg1.anInt3257 = -1;
            }
        }
        if (arg1.anInt3226 != -1
                && (Region.anInt134 ^ 0xffffffff) <= (arg1.anInt3235 ^ 0xffffffff)) {
            if (arg1.anInt3242 < 0) {
                arg1.anInt3242 = 0;
            }
            int i = (Class4_Sub20_Sub14.method593(-23222, arg1.anInt3226).anInt2909);
            if ((i ^ 0xffffffff) != 0) {
                Class4_Sub20_Sub17 class4_sub20_sub17 = Class68.method1093(i,
                        (byte) -123);
                if (class4_sub20_sub17 == null
                        || class4_sub20_sub17.anIntArray3211 == null) {
                    arg1.anInt3226 = -1;
                } else {
                    arg1.anInt3241++;
                    if ((arg1.anInt3242 < class4_sub20_sub17.anIntArray3211.length)
                            && (class4_sub20_sub17.anIntArray3200[arg1.anInt3242] < arg1.anInt3241)) {
                        arg1.anInt3241 = 1;
                        arg1.anInt3242++;
                        Class24.method790(arg1.anInt3270, arg1.anInt3242,
                                class4_sub20_sub17, arg1.anInt3267, 24);
                    }
                    if ((class4_sub20_sub17.anIntArray3211.length <= arg1.anInt3242)
                            && (arg1.anInt3242 < 0 || ((arg1.anInt3242 ^ 0xffffffff) <= (class4_sub20_sub17.anIntArray3211.length ^ 0xffffffff)))) {
                        arg1.anInt3226 = -1;
                    }
                }
            } else {
                arg1.anInt3226 = -1;
            }
        }
        if (arg1.anInt3277 != -1 && (arg1.anInt3222 ^ 0xffffffff) >= -2) {
            Class4_Sub20_Sub17 class4_sub20_sub17 = Class68.method1093(
                    arg1.anInt3277, (byte) -109);
            if ((class4_sub20_sub17.anInt3183 ^ 0xffffffff) == -2
                    && (arg1.anInt3236 ^ 0xffffffff) < -1
                    && Region.anInt134 >= arg1.anInt3224
                    && (arg1.anInt3281 ^ 0xffffffff) > (Region.anInt134 ^ 0xffffffff)) {
                arg1.anInt3222 = 1;
                return;
            }
        }
        if (arg1.anInt3277 != -1 && (arg1.anInt3222 ^ 0xffffffff) == -1) {
            Class4_Sub20_Sub17 class4_sub20_sub17 = Class68.method1093(
                    arg1.anInt3277, (byte) -124);
            if (class4_sub20_sub17 == null
                    || class4_sub20_sub17.anIntArray3211 == null) {
                arg1.anInt3277 = -1;
            } else {
                arg1.anInt3233++;
                if (((class4_sub20_sub17.anIntArray3211.length ^ 0xffffffff) < (arg1.anInt3239 ^ 0xffffffff))
                        && (class4_sub20_sub17.anIntArray3200[arg1.anInt3239] < arg1.anInt3233)) {
                    arg1.anInt3233 = 1;
                    arg1.anInt3239++;
                    Class24.method790(arg1.anInt3270, arg1.anInt3239,
                            class4_sub20_sub17, arg1.anInt3267, 24);
                }
                if ((class4_sub20_sub17.anIntArray3211.length ^ 0xffffffff) >= (arg1.anInt3239 ^ 0xffffffff)) {
                    arg1.anInt3276++;
                    arg1.anInt3239 -= class4_sub20_sub17.anInt3202;
                    if (class4_sub20_sub17.anInt3184 <= arg1.anInt3276) {
                        arg1.anInt3277 = -1;
                    } else if ((arg1.anInt3239 ^ 0xffffffff) > -1
                            || (arg1.anInt3239 >= class4_sub20_sub17.anIntArray3211.length)) {
                        arg1.anInt3277 = -1;
                    } else {
                        Class24.method790(arg1.anInt3270, arg1.anInt3239,
                                class4_sub20_sub17, arg1.anInt3267, 24);
                    }
                }
                arg1.aBoolean3290 = class4_sub20_sub17.aBoolean3186;
            }
        }
        if (arg1.anInt3222 > 0) {
            arg1.anInt3222--;
        }
    }

    public static boolean method830(int arg0, JagexString arg1) {
        try {
            if (arg1 == null) {
                return false;
            }
            for (int i = 0; RSApplet.anInt23 > i; i++) {
                if (arg1.method818(Class4_Sub20_Sub5.aJagexStringArray2893[i],
                        (byte) -105)) {
                    return true;
                }
            }
            if (arg1.method818(
                    (Class4_Sub15.aClass4_Sub20_Sub7_Sub1_Sub1_2302.aJagexString_3593),
                    (byte) -105)) {
                return true;
            }
            if (arg0 != 60) {
                method823(-127, null);
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.FA("
                    + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }

    public static int method840(int arg0, int arg1, int arg2) {
        try {
            if (arg0 > -22) {
                method823(-123, null);
            }
            int i = 0;
            while ((arg2 ^ 0xffffffff) < -1) {
                arg2--;
                i = 0x1 & arg1 | i << -117755839;
                arg1 >>>= 1;
            }
            return i;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.M("
                    + arg0 + ',' + arg1 + ',' + arg2 + ')'));
        }
    }

    /* synthetic */
    public static Class<?> method842(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    public boolean aBoolean1774 = true;

    public byte[] aByteArray1803;

    public int anInt1788;

    public int anInt1805;

    public JagexString() {

    }

    public JagexString(String string) {
        RS2Font.anInt2775++;
        char[] stringData = string.toCharArray();
        int length = stringData.length;
        int index = 0;
        this.aByteArray1803 = new byte[length];
        while (length != index) {
            int i_10_ = stringData[index++] & 0xff;
            if (i_10_ <= 45 && i_10_ >= 40) {
                if (index >= length) {
                    break;
                }
                int i_11_ = 0xff & stringData[index++];
                this.aByteArray1803[this.anInt1805++] = (byte) ((-40 + i_10_) * 43 + (i_11_ - 48));
            } else if (i_10_ != 0) {
                this.aByteArray1803[this.anInt1805++] = (byte) i_10_;
            }
        }
        this.method831(0);
    }

    public static JagexString getRs2PreparedString(String string) {
        JagexString jagexString = new JagexString(string);
        return jagexString.method828(true);
    }

    @Override
    public boolean equals(Object arg0) {
        try {
            if (arg0 instanceof JagexString) {
                return method802(1, (JagexString) arg0);
            }
            throw new IllegalArgumentException();
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    ("he.equals(" + (arg0 != null ? "{...}" : "null") + ')'));
        }
    }

    @Override
    public int hashCode() {
        try {
            return method820((byte) 112);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception,
                    "he.hashCode(" + ')');
        }
    }

    public JagexString method801(boolean arg0) {
        try {
            int i = 2;
            JagexString jagexString = new JagexString();
            if (arg0 != false) {
                method819((byte) 39);
            }
            jagexString.anInt1805 = anInt1805;
            jagexString.aByteArray1803 = new byte[anInt1805];
            for (int i_0_ = 0; (anInt1805 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
                byte i_1_ = aByteArray1803[i_0_];
                if ((i_1_ < 97 || (i_1_ ^ 0xffffffff) < -123)
                        && ((i_1_ ^ 0xffffffff) > 31 || i_1_ > -2 || (i_1_ ^ 0xffffffff) == 8)) {
                    if (((i_1_ ^ 0xffffffff) > -66 || i_1_ > 90)
                            && (i_1_ < -64 || i_1_ > -34 || (i_1_ ^ 0xffffffff) == 40)) {
                        if (i_1_ != 46 && i_1_ != 33 && i_1_ != 63) {
                            if ((i_1_ ^ 0xffffffff) != -33) {
                                i = 1;
                            } else if (i != 2) {
                                i = 1;
                            }
                        } else {
                            i = 2;
                        }
                    } else {
                        if ((i ^ 0xffffffff) == -1) {
                            i_1_ += 32;
                        }
                        i = 0;
                    }
                } else {
                    if (i == 2) {
                        i_1_ -= 32;
                    }
                    i = 0;
                }
                jagexString.aByteArray1803[i_0_] = i_1_;
            }
            return jagexString;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.O("
                    + arg0 + ')');
        }
    }

    public boolean method802(int arg0, JagexString arg1) {
        try {
            if (arg1 == null) {
                return false;
            }
            if (arg1.anInt1805 != anInt1805) {
                return false;
            }
            if (arg0 != 1) {
                return true;
            }
            if (!aBoolean1774 || !arg1.aBoolean1774) {
                if (anInt1788 == 0) {
                    anInt1788 = method820((byte) 38);
                    if (anInt1788 == 0) {
                        anInt1788 = 1;
                    }
                }
                if (arg1.anInt1788 == 0) {
                    arg1.anInt1788 = arg1.method820((byte) 23);
                    if ((arg1.anInt1788 ^ 0xffffffff) == -1) {
                        arg1.anInt1788 = 1;
                    }
                }
                if ((anInt1788 ^ 0xffffffff) != (arg1.anInt1788 ^ 0xffffffff)) {
                    return false;
                }
            }
            for (int i = 0; i < anInt1805; i++) {
                if ((arg1.aByteArray1803[i] ^ 0xffffffff) != (aByteArray1803[i] ^ 0xffffffff)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.NA("
                    + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }

    public int method803(JagexString arg0, byte arg1) {
        try {
            return method807(arg0, 0, 256);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.KA("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
        }
    }

    public int method804(byte arg0) {
        try {
            if (arg0 >= -82) {
                method836(114);
            }
            return method835(-9613, 10);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.P("
                    + arg0 + ')');
        }
    }

    public JagexString method805(int arg0, int arg1) {
        try {
            return method829((byte) -114, arg0, anInt1805);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.V("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public long method806(byte arg0) {
        try {
            long l = 0L;
            if (arg0 > -22) {
                equals(null);
            }
            for (int i = 0; (i ^ 0xffffffff) > (anInt1805 ^ 0xffffffff); i++) {
                if ((i ^ 0xffffffff) <= -13) {
                    break;
                }
                l *= 37L;
                int i_2_ = aByteArray1803[i];
                if (i_2_ < 65 || i_2_ > 90) {
                    if ((i_2_ ^ 0xffffffff) <= -98
                            && (i_2_ ^ 0xffffffff) >= -123) {
                        l += (-97 + (i_2_ + 1));
                    } else if ((i_2_ ^ 0xffffffff) <= -49
                            && (i_2_ ^ 0xffffffff) >= -58) {
                        l += (27 - -i_2_ - 48);
                    }
                } else {
                    l += (-64 - -i_2_);
                }
            }
            for (/**/; (l % 37L ^ 0xffffffffffffffffL) == -1L && l != 0L; l /= 37L) {
                /* empty */
            }
            return l;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.QA("
                    + arg0 + ')');
        }
    }

    public int method807(JagexString arg0, int arg1, int arg2) {
        try {
            int[] is = new int[arg2];
            int[] is_3_ = new int[arg0.anInt1805];
            int[] is_4_ = new int[arg0.anInt1805];
            for (int i = 0; (i ^ 0xffffffff) > (is.length ^ 0xffffffff); i++) {
                is[i] = arg0.anInt1805;
            }
            for (int i = 1; i <= arg0.anInt1805; i++) {
                is_3_[i - 1] = -i + (arg0.anInt1805 << -1206809375);
                is[Class59.method1035(255, arg0.aByteArray1803[i - 1])] = arg0.anInt1805
                        - i;
            }
            int i = 1 + arg0.anInt1805;
            int i_5_ = arg0.anInt1805;
            while (i_5_ > 0) {
                is_4_[i_5_ - 1] = i;
                for (/**/; ((i ^ 0xffffffff) >= (arg0.anInt1805 ^ 0xffffffff) && (arg0.aByteArray1803[i_5_
                        + -1] != arg0.aByteArray1803[i + -1])); i = is_4_[-1
                        + i]) {
                    if (is_3_[-1 + i] >= arg0.anInt1805 + -i_5_) {
                        is_3_[-1 + i] = -i_5_ + arg0.anInt1805;
                    }
                }
                i_5_--;
                i--;
            }
            int i_6_ = i;
            i = -i_6_ + arg0.anInt1805 + 1;
            int i_7_ = 1;
            int i_8_ = 0;
            for (int i_9_ = 1; (i_9_ ^ 0xffffffff) >= (i ^ 0xffffffff); i_9_++) {
                is_4_[-1 + i_9_] = i_8_;
                for (/**/; i_8_ >= 1
                        && (arg0.aByteArray1803[i_8_ + -1] != arg0.aByteArray1803[-1
                        + i_9_]); i_8_ = is_4_[i_8_ + -1]) {
                    /* empty */
                }
                i_8_++;
            }
            while (arg0.anInt1805 > i_6_) {
                for (int i_10_ = i_7_; (i_10_ ^ 0xffffffff) >= (i_6_ ^ 0xffffffff); i_10_++) {
                    if (-i_10_ + i_6_ + arg0.anInt1805 <= is_3_[i_10_ - 1]) {
                        is_3_[-1 + i_10_] = -i_10_ + arg0.anInt1805 + i_6_;
                    }
                }
                i_7_ = 1 + i_6_;
                i_6_ = i_6_ + i - is_4_[-1 + i];
                i = is_4_[i - 1];
            }
            int i_11_;
            for (int i_12_ = -1 + (arg1 - -arg0.anInt1805); anInt1805 > i_12_; i_12_ += Math
                    .max(is[0xff & aByteArray1803[i_12_]], is_3_[i_11_])) {
                for (i_11_ = arg0.anInt1805 + -1; (i_11_ >= 0 && aByteArray1803[i_12_] == arg0.aByteArray1803[i_11_]); i_11_--) {
                    i_12_--;
                }
                if ((i_11_ ^ 0xffffffff) == 0) {
                    return 1 + i_12_;
                }
            }
            return -1;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.AA("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ','
                    + arg2 + ')'));
        }
    }

    public boolean method808(JagexString arg0, byte arg1) {
        try {
            if (arg0.anInt1805 > anInt1805) {
                return false;
            }
            if (arg1 != -95) {
                aBoolean1774 = true;
            }
            for (int i = 0; i < arg0.anInt1805; i++) {
                if ((aByteArray1803[i] ^ 0xffffffff) != (arg0.aByteArray1803[i] ^ 0xffffffff)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.W("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
        }
    }

    public JagexString method809(int arg0) {
        try {
            JagexString jagexString = new JagexString();
            jagexString.anInt1805 = anInt1805;
            jagexString.aByteArray1803 = new byte[anInt1805];
            for (int i_13_ = 0; (anInt1805 ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
                jagexString.aByteArray1803[i_13_] = (byte) 42;
            }
            return jagexString;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.GA("
                    + arg0 + ')');
        }
    }

    public int method811(int arg0, int arg1, boolean arg2) {
        try {
            if (arg2 != false) {
                method811(15, 124, true);
            }
            byte i = (byte) arg1;
            for (int i_14_ = arg0; anInt1805 > i_14_; i_14_++) {
                if (i == aByteArray1803[i_14_]) {
                    return i_14_;
                }
            }
            return -1;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.B("
                    + arg0 + ',' + arg1 + ',' + arg2 + ')'));
        }
    }

    public long method812(int arg0) {
        try {
            if (arg0 != 255) {
                method827((byte) -103);
            }
            long l = 0L;
            for (int i = 0; (i ^ 0xffffffff) > (anInt1805 ^ 0xffffffff); i++) {
                l = (0xff & aByteArray1803[i]) + (-l + (l << 339039237));
            }
            return l;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.RA("
                    + arg0 + ')');
        }
    }

    public int method813(int arg0, JagexString arg1) {
        try {
            int i;
            if ((anInt1805 ^ 0xffffffff) >= (arg1.anInt1805 ^ 0xffffffff)) {
                i = anInt1805;
            } else {
                i = arg1.anInt1805;
            }
            if (arg0 != 255) {
                aJagexString_1815 = null;
            }
            for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (i ^ 0xffffffff); i_15_++) {
                if ((arg1.aByteArray1803[i_15_] & 0xff ^ 0xffffffff) < (0xff & aByteArray1803[i_15_] ^ 0xffffffff)) {
                    return -1;
                }
                if ((0xff & aByteArray1803[i_15_]) > (arg1.aByteArray1803[i_15_] & 0xff)) {
                    return 1;
                }
            }
            if (anInt1805 < arg1.anInt1805) {
                return -1;
            }
            if ((anInt1805 ^ 0xffffffff) < (arg1.anInt1805 ^ 0xffffffff)) {
                return 1;
            }
            return 0;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.C("
                    + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }

    public URL method814(byte arg0) throws MalformedURLException {
        try {
            if (arg0 >= -56) {
                return null;
            }
            return new URL(new String(aByteArray1803, 0, anInt1805));
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.CA("
                    + arg0 + ')');
        }
    }

    public JagexString method815(int arg0) {
        try {
            int i = 0;
            if (arg0 <= 120) {
                return null;
            }
            for (/**/; ((i ^ 0xffffffff) > (anInt1805 ^ 0xffffffff) && (aByteArray1803[i] >= 0
                    && aByteArray1803[i] <= 32 || (aByteArray1803[i] & 0xff) == 160)); i++) {
                /* empty */
            }
            int i_16_;
            for (i_16_ = anInt1805; ((i ^ 0xffffffff) > (i_16_ ^ 0xffffffff) && ((aByteArray1803[-1
                    + i_16_] >= 0 && aByteArray1803[-1 + i_16_] <= 32) || (0xff & aByteArray1803[i_16_ - 1]) == 160)); i_16_--) {
                /* empty */
            }
            if ((i ^ 0xffffffff) == -1
                    && (i_16_ ^ 0xffffffff) == (anInt1805 ^ 0xffffffff)) {
                return this;
            }
            JagexString jagexString = new JagexString();
            jagexString.anInt1805 = -i + i_16_;
            jagexString.aByteArray1803 = new byte[jagexString.anInt1805];
            for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (jagexString.anInt1805 ^ 0xffffffff); i_17_++) {
                jagexString.aByteArray1803[i_17_] = aByteArray1803[i + i_17_];
            }
            return jagexString;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.A("
                    + arg0 + ')');
        }
    }

    public JagexString method816(int arg0) {
        try {
            JagexString jagexString = new JagexString();
            jagexString.anInt1805 = 0;
            jagexString.aByteArray1803 = new byte[12];
            int i = 0;
            for (int i_18_ = 0; i_18_ < anInt1805; i_18_++) {
                if (aByteArray1803[i_18_] < 65 || aByteArray1803[i_18_] > 90) {
                    if (((aByteArray1803[i_18_] ^ 0xffffffff) > -98 || aByteArray1803[i_18_] > 122)
                            && (aByteArray1803[i_18_] < 48 || aByteArray1803[i_18_] > 57)) {
                        if ((i ^ 0xffffffff) < -1) {
                            jagexString.aByteArray1803[i++] = (byte) 95;
                        }
                    } else {
                        jagexString.aByteArray1803[i++] = aByteArray1803[i_18_];
                        jagexString.anInt1805 = i;
                    }
                } else {
                    jagexString.aByteArray1803[i++] = (byte) (32 + aByteArray1803[i_18_]);
                    jagexString.anInt1805 = i;
                }
                if ((i ^ 0xffffffff) == -13) {
                    break;
                }
            }
            return jagexString;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.U("
                    + arg0 + ')');
        }
    }

    public void method817(int arg0, byte arg1, int arg2, Graphics arg3) {
        try {
            String string;
            try {
                string = new String(aByteArray1803, 0, anInt1805, "ISO-8859-1");
                if (arg1 > -96) {
                    aJagexString_1800 = null;
                }
            } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
                string = new String(aByteArray1803, 0, anInt1805);
            }
            arg3.drawString(string, arg0, arg2);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.G("
                    + arg0 + ',' + arg1 + ',' + arg2 + ','
                    + (arg3 != null ? "{...}" : "null") + ')'));
        }
    }

    public boolean method818(JagexString arg0, byte arg1) {
        try {
            if (arg0 == null) {
                return false;
            }
            if (anInt1805 != arg0.anInt1805) {
                return false;
            }
            for (int i = 0; (i ^ 0xffffffff) > (anInt1805 ^ 0xffffffff); i++) {
                byte i_20_ = arg0.aByteArray1803[i];
                if ((i_20_ ^ 0xffffffff) <= -66
                        && i_20_ <= 90
                        || (i_20_ >= -64 && i_20_ <= -34 && (i_20_ ^ 0xffffffff) != 40)) {
                    i_20_ += 32;
                }
                byte i_21_ = aByteArray1803[i];
                if ((i_21_ ^ 0xffffffff) <= -66 && (i_21_ ^ 0xffffffff) >= -91
                        || i_21_ >= -64 && i_21_ <= -34 && i_21_ != -41) {
                    i_21_ += 32;
                }
                if ((i_20_ ^ 0xffffffff) != (i_21_ ^ 0xffffffff)) {
                    return false;
                }
            }
            if (arg1 != -105) {
                method838(-90, 49);
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.PA("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
        }
    }

    public boolean method819(byte arg0) {
        try {
            return method841(10, (byte) 76);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.HA("
                    + arg0 + ')');
        }
    }

    public int method820(byte arg0) {
        try {
            int i = 0;
            for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (anInt1805 ^ 0xffffffff); i_22_++) {
                i = (0xff & aByteArray1803[i_22_]) + ((i << -16430203) - i);
            }
            if (arg0 <= 8) {
                method841(-99, (byte) -40);
            }
            return i;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.T("
                    + arg0 + ')');
        }
    }

    public int method821(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        try {
            Class21.method777(aByteArray1803, arg3, arg4, arg1, arg0 + -arg3);
            if (arg2 != true) {
                method833(null, -3);
            }
            return arg0 - arg3;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.IA("
                    + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ','
                    + (arg4 != null ? "{...}" : "null") + ')'));
        }
    }

    public int method822(int arg0, FontMetrics arg1) {
        try {
            if (arg0 != 59) {
                aJagexString_1815 = null;
            }
            String string;
            try {
                string = new String(aByteArray1803, 0, anInt1805, "ISO-8859-1");
            } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
                string = new String(aByteArray1803, 0, anInt1805);
            }
            return arg1.stringWidth(string);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.N("
                    + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')'));
        }
    }

    public JagexString method824(int arg0, int arg1) {
        try {
            if ((arg0 ^ 0xffffffff) >= -1 || arg0 > 255) {
                throw new IllegalArgumentException("invalid char:" + arg0);
            }
            if (!aBoolean1774) {
                throw new IllegalArgumentException();
            }
            anInt1788 = arg1;
            if (anInt1805 == aByteArray1803.length) {
                int i;
                for (i = 1; (i ^ 0xffffffff) >= (anInt1805 ^ 0xffffffff); i += i) {
                    /* empty */
                }
                byte[] is = new byte[i];
                Class21.method777(aByteArray1803, 0, is, 0, anInt1805);
                aByteArray1803 = is;
            }
            aByteArray1803[anInt1805++] = (byte) arg0;
            return this;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.DA("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public int method825(int arg0) {
        try {
            if (arg0 > -95) {
                aJagexString_1814 = null;
            }
            return anInt1805;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.H("
                    + arg0 + ')');
        }
    }

    public boolean method826(JagexString arg0, byte arg1) {
        try {
            if (anInt1805 < arg0.anInt1805) {
                return false;
            }
            int i = anInt1805 + -arg0.anInt1805;
            for (int i_24_ = 0; arg0.anInt1805 > i_24_; i_24_++) {
                if ((aByteArray1803[i + i_24_] ^ 0xffffffff) != (arg0.aByteArray1803[i_24_] ^ 0xffffffff)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.F("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
        }
    }

    public JagexString method827(byte arg0) {
        try {
            JagexString jagexString = new JagexString();
            jagexString.anInt1805 = anInt1805;
            jagexString.aByteArray1803 = new byte[anInt1805];
            if (arg0 != -55) {
                return null;
            }
            for (int i = 0; (i ^ 0xffffffff) > (anInt1805 ^ 0xffffffff); i++) {
                byte i_25_ = aByteArray1803[i];
                if ((i_25_ ^ 0xffffffff) <= -66
                        && i_25_ <= 90
                        || ((i_25_ ^ 0xffffffff) <= 63
                        && (i_25_ ^ 0xffffffff) >= 33 && i_25_ != -41)) {
                    i_25_ += 32;
                }
                jagexString.aByteArray1803[i] = i_25_;
            }
            return jagexString;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.J("
                    + arg0 + ')');
        }
    }

    public JagexString method828(boolean arg0) {
        try {
            long l = method812(255);
            synchronized (aClass1830 != null ? aClass1830 : (aClass1830 = method842("com.jagex.runescape.JagexString"))) {
                if (Class4_Sub20_Sub7.aClass16_2950 != null) {
                    for (Class4_Sub21 class4_sub21 = (Class4_Sub21) Class4_Sub20_Sub7.aClass16_2950
                            .method725((byte) 117, l); class4_sub21 != null; class4_sub21 = (Class4_Sub21) Class4_Sub20_Sub7.aClass16_2950
                            .method728(12133)) {
                        if (method802(1, class4_sub21.aJagexString_2364)) {
                            return class4_sub21.aJagexString_2364;
                        }
                    }
                } else {
                    Class4_Sub20_Sub7.aClass16_2950 = new Class16(4096);
                }
                Class4_Sub21 class4_sub21 = new Class4_Sub21();
                class4_sub21.aJagexString_2364 = this;
                aBoolean1774 = false;
                Class4_Sub20_Sub7.aClass16_2950.method720(class4_sub21, l,
                        !arg0);
            }
            if (arg0 != true) {
                method831(-93);
            }
            return this;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.OA("
                    + arg0 + ')');
        }
    }

    public JagexString method829(byte arg0, int arg1, int arg2) {
        try {
            JagexString jagexString = new JagexString();
            jagexString.aByteArray1803 = new byte[arg2 - arg1];
            jagexString.anInt1805 = arg2 + -arg1;
            Class21.method777(aByteArray1803, arg1, jagexString.aByteArray1803, 0,
                    jagexString.anInt1805);
            return jagexString;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.LA("
                    + arg0 + ',' + arg1 + ',' + arg2 + ')'));
        }
    }

    public JagexString method831(int arg0) {
        try {
            if (!aBoolean1774) {
                throw new IllegalArgumentException();
            }
            anInt1788 = arg0;
            if (anInt1805 != aByteArray1803.length) {
                byte[] is = new byte[anInt1805];
                Class21.method777(aByteArray1803, 0, is, 0, anInt1805);
                aByteArray1803 = is;
            }
            return this;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.D("
                    + arg0 + ')');
        }
    }

    public JagexString method832(JagexString arg0, byte arg1) {
        try {
            if (!aBoolean1774) {
                throw new IllegalArgumentException();
            }
            anInt1788 = 0;
            if (arg1 != -28) {
                return null;
            }
            if (arg0.anInt1805 + anInt1805 > aByteArray1803.length) {
                int i;
                for (i = 1; i < arg0.anInt1805 + anInt1805; i += i) {
                    /* empty */
                }
                byte[] is = new byte[i];
                Class21.method777(aByteArray1803, 0, is, 0, anInt1805);
                aByteArray1803 = is;
            }
            Class21.method777(arg0.aByteArray1803, 0, aByteArray1803,
                    anInt1805, arg0.anInt1805);
            anInt1805 += arg0.anInt1805;
            return this;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.S("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
        }
    }

    public int method833(JagexString arg0, int arg1) {
        try {
            int i;
            if (arg0.anInt1805 >= anInt1805) {
                i = anInt1805;
            } else {
                i = arg0.anInt1805;
            }
            int i_26_ = 0;
            if (arg1 > -90) {
                method827((byte) 53);
            }
            for (/**/; i_26_ < i; i_26_++) {
                if (((Class4_Sub6.anIntArray1921[arg0.aByteArray1803[i_26_] & 0xff]) ^ 0xffffffff) < (Class4_Sub6.anIntArray1921[aByteArray1803[i_26_] & 0xff] ^ 0xffffffff)) {
                    return -1;
                }
                if (Class4_Sub6.anIntArray1921[aByteArray1803[i_26_] & 0xff] > (Class4_Sub6.anIntArray1921[arg0.aByteArray1803[i_26_] & 0xff])) {
                    return 1;
                }
            }
            if ((anInt1805 ^ 0xffffffff) > (arg0.anInt1805 ^ 0xffffffff)) {
                return -1;
            }
            if (arg0.anInt1805 < anInt1805) {
                return 1;
            }
            return 0;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.K("
                    + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')'));
        }
    }

    public int method834(int arg0, int arg1) {
        try {
            if (arg0 != 21340) {
                method813(65, null);
            }
            return aByteArray1803[arg1] & 0xff;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.MA("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public int method835(int arg0, int arg1) {
        try {
            if (arg1 < 1 || arg1 > 36) {
                arg1 = 10;
            }
            boolean bool = false;
            boolean bool_27_ = false;
            int i = 0;
            for (int i_28_ = 0; (anInt1805 ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
                int i_29_ = aByteArray1803[i_28_] & 0xff;
                if (i_28_ == 0) {
                    if ((i_29_ ^ 0xffffffff) == -46) {
                        bool = true;
                        continue;
                    }
                    if (i_29_ == 43) {
                        continue;
                    }
                }
                if ((i_29_ ^ 0xffffffff) > -49 || (i_29_ ^ 0xffffffff) < -58) {
                    if ((i_29_ ^ 0xffffffff) <= -66 && i_29_ <= 90) {
                        i_29_ -= 55;
                    } else if ((i_29_ ^ 0xffffffff) <= -98
                            && (i_29_ ^ 0xffffffff) >= -123) {
                        i_29_ -= 87;
                    } else {
                        throw new NumberFormatException();
                    }
                } else {
                    i_29_ -= 48;
                }
                if (i_29_ >= arg1) {
                    throw new NumberFormatException();
                }
                if (bool) {
                    i_29_ = -i_29_;
                }
                int i_30_ = arg1 * i - -i_29_;
                if ((i_30_ / arg1 ^ 0xffffffff) != (i ^ 0xffffffff)) {
                    throw new NumberFormatException();
                }
                i = i_30_;
                bool_27_ = true;
            }
            if (arg0 != -9613) {
                return -52;
            }
            if (!bool_27_) {
                throw new NumberFormatException();
            }
            return i;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.EA("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public byte[] method836(int arg0) {
        try {
            if (arg0 != -10650) {
                method804((byte) -37);
            }
            byte[] is = new byte[anInt1805];
            Class21.method777(aByteArray1803, 0, is, 0, anInt1805);
            return is;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.I("
                    + arg0 + ')');
        }
    }

    public int method837(int arg0, int arg1) {
        try {
            if (arg1 != 0) {
                return 9;
            }
            return method811(0, arg0, false);
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.E("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public JagexString method838(int arg0, int arg1) {
        try {
            if ((arg1 ^ 0xffffffff) >= -1 || (arg1 ^ 0xffffffff) < -256) {
                throw new IllegalArgumentException("invalid char");
            }
            JagexString jagexString = new JagexString();
            jagexString.aByteArray1803 = new byte[1 + anInt1805];
            jagexString.anInt1805 = 1 + anInt1805;
            Class21.method777(aByteArray1803, 0, jagexString.aByteArray1803, 0,
                    anInt1805);
            if (arg0 != 15871) {
                method830(28, null);
            }
            jagexString.aByteArray1803[anInt1805] = (byte) arg1;
            return jagexString;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.R("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    public JagexString method839(int arg0) {
        try {
            if (arg0 <= 77) {
                method819((byte) -12);
            }
            boolean bool = true;
            JagexString jagexString = new JagexString();
            jagexString.anInt1805 = anInt1805;
            jagexString.aByteArray1803 = new byte[anInt1805];
            for (int i = 0; (i ^ 0xffffffff) > (anInt1805 ^ 0xffffffff); i++) {
                byte i_31_ = aByteArray1803[i];
                if ((i_31_ ^ 0xffffffff) != -96) {
                    if ((i_31_ ^ 0xffffffff) <= -98
                            && (i_31_ ^ 0xffffffff) >= -123 && bool) {
                        bool = false;
                        jagexString.aByteArray1803[i] = (byte) (i_31_ - 32);
                    } else {
                        bool = false;
                        jagexString.aByteArray1803[i] = i_31_;
                    }
                } else {
                    jagexString.aByteArray1803[i] = (byte) 32;
                    bool = true;
                }
            }
            return jagexString;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, "he.JA("
                    + arg0 + ')');
        }
    }

    public boolean method841(int arg0, byte arg1) {
        try {
            if ((arg0 ^ 0xffffffff) > -2 || arg0 > 36) {
                arg0 = 10;
            }
            boolean bool = false;
            boolean bool_32_ = false;
            int i = 0;
            if (arg1 <= 72) {
                method831(-72);
            }
            for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > (anInt1805 ^ 0xffffffff); i_33_++) {
                int i_34_ = aByteArray1803[i_33_] & 0xff;
                if ((i_33_ ^ 0xffffffff) == -1) {
                    if (i_34_ == 45) {
                        bool = true;
                        continue;
                    }
                    if ((i_34_ ^ 0xffffffff) == -44) {
                        continue;
                    }
                }
                if (i_34_ >= 48 && i_34_ <= 57) {
                    i_34_ -= 48;
                } else if ((i_34_ ^ 0xffffffff) <= -66 && i_34_ <= 90) {
                    i_34_ -= 55;
                } else {
                    if (i_34_ < 97 || i_34_ > 122) {
                        return false;
                    }
                    i_34_ -= 87;
                }
                if (i_34_ >= arg0) {
                    return false;
                }
                if (bool) {
                    i_34_ = -i_34_;
                }
                int i_35_ = i_34_ + i * arg0;
                if ((i ^ 0xffffffff) != (i_35_ / arg0 ^ 0xffffffff)) {
                    return false;
                }
                bool_32_ = true;
                i = i_35_;
            }
            return bool_32_;
        } catch (RuntimeException runtimeexception) {
            throw Class4_Sub20_Sub7_Sub4.method423(runtimeexception, ("he.BA("
                    + arg0 + ',' + arg1 + ')'));
        }
    }

    @Override
    public String toString() {
        return "";
    }
}
