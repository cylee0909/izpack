package com.izforge.izpack.compiler.data;

/**
 * Data for compiler
 */
public class CompilerData {
    /**
     * The IzPack version.
     */
    public final static String IZPACK_VERSION = "4.3.2";
    /**
     * The IzPack home directory.
     */
    public static String IZPACK_HOME = ".";

    /**
     * Set the IzPack home directory
     *
     * @param izHome - the izpack home directory
     */
    public static void setIzpackHome(String izHome) {
        IZPACK_HOME = izHome;
    }


}