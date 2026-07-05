package id.blackbear.vulnapk;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class CryptoUtil {
    private static final String KEY = "sup3R_str0ng_K3y";

    public static String encrypt(String secret) throws Exception {
        byte[] keyBytes = KEY.getBytes("UTF-8");
        SecretKey secretKey = new SecretKeySpec(keyBytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(1, secretKey);
        byte[] encryptedBytes = cipher.doFinal(secret.getBytes("UTF-8"));
        return Base64.encodeToString(encryptedBytes, 0);
    }
}
