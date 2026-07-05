package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class Crypto {
    private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static String DELIMITER = "@~@~@";
    private static int ITERATION_COUNT = 10000;
    private static int KEY_LENGTH = 256;
    public static final String PBKDF2_DERIVATION_ALGORITHM = "PBKDF2WithHmacSHA1";
    private static final int PKCS5_SALT_LENGTH = 8;
    private static final String TAG = "Crypto";
    private static SecureRandom random = new SecureRandom();

    public static SecretKey deriveKeyPbkdf2(byte[] bArr, String str) throws InvalidKeySpecException, NoSuchAlgorithmException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] encoded = SecretKeyFactory.getInstance(PBKDF2_DERIVATION_ALGORITHM).generateSecret(new PBEKeySpec(str.toCharArray(), bArr, ITERATION_COUNT, KEY_LENGTH)).getEncoded();
        String str2 = TAG;
        Log.d(str2, "key bytes: " + toHex(encoded));
        SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, "AES");
        Log.d(str2, String.format("PBKDF2 key derivation took %d [ms].", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return secretKeySpec;
    }

    public static byte[] generateIv(int i) {
        byte[] bArr = new byte[i];
        random.nextBytes(bArr);
        return bArr;
    }

    public static byte[] generateSalt() {
        byte[] bArr = new byte[8];
        random.nextBytes(bArr);
        return bArr;
    }

    public static String encrypt(String str, String str2) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        byte[] bArrGenerateSalt = generateSalt();
        SecretKey secretKeyDeriveKeyPbkdf2 = deriveKeyPbkdf2(bArrGenerateSalt, str2);
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        byte[] bArrGenerateIv = generateIv(cipher.getBlockSize());
        String str3 = TAG;
        Log.d(str3, "IV: " + toHex(bArrGenerateIv));
        cipher.init(1, secretKeyDeriveKeyPbkdf2, new IvParameterSpec(bArrGenerateIv));
        Log.d(str3, "Cipher IV: " + (cipher.getIV() == null ? null : toHex(cipher.getIV())));
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes("UTF-8"));
        if (bArrGenerateSalt != null) {
            return String.format("%s%s%s%s%s", toBase64(bArrGenerateSalt), DELIMITER, toBase64(bArrGenerateIv), DELIMITER, toBase64(bArrDoFinal));
        }
        return String.format("%s%s%s", toBase64(bArrGenerateIv), DELIMITER, toBase64(bArrDoFinal));
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02X", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static String toBase64(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static byte[] fromBase64(String str) {
        return Base64.decode(str, 2);
    }

    public static String decrypt(byte[] bArr, SecretKey secretKey, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        cipher.init(2, secretKey, new IvParameterSpec(bArr2));
        Log.d(TAG, "Cipher IV: " + toHex(cipher.getIV()));
        return new String(cipher.doFinal(bArr), "UTF-8");
    }

    public static String decryptPbkdf2(String str, String str2) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        String[] strArrSplit = str.split(DELIMITER);
        if (strArrSplit.length != 3) {
            throw new IllegalArgumentException("Invalid encypted text format");
        }
        byte[] bArrFromBase64 = fromBase64(strArrSplit[0]);
        return decrypt(fromBase64(strArrSplit[2]), deriveKeyPbkdf2(bArrFromBase64, str2), fromBase64(strArrSplit[1]));
    }
}
