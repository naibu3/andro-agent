package org.apache.cordova.file;

import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.LOG;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AssetFilesystem extends Filesystem {
    private static final String LOG_TAG = "AssetFilesystem";
    private static Map<String, Long> lengthCache;
    private static Map<String, String[]> listCache;
    private static boolean listCacheFromFile;
    private static Object listCacheLock = new Object();
    private final AssetManager assetManager;

    @Override // org.apache.cordova.file.Filesystem
    LocalFilesystemURL URLforFilesystemPath(String str) {
        return null;
    }

    @Override // org.apache.cordova.file.Filesystem
    public boolean canRemoveFileAtLocalURL(LocalFilesystemURL localFilesystemURL) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:9:0x0028, B:34:0x0063, B:36:0x0067, B:12:0x002d, B:13:0x0033, B:30:0x0057, B:33:0x005c, B:40:0x0079, B:44:0x0087, B:43:0x007e, B:21:0x0042, B:24:0x0047, B:45:0x0088), top: B:56:0x0003, inners: #2, #8, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.ObjectInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void lazyInitCaches() {
        ObjectInputStream objectInputStream;
        Throwable th;
        ?? objectInputStream2;
        ClassNotFoundException e;
        String localizedMessage;
        synchronized (listCacheLock) {
            if (listCache == null) {
                ObjectInputStream objectInputStream3 = null;
                try {
                    try {
                        objectInputStream2 = new ObjectInputStream(this.assetManager.open("cdvasset.manifest"));
                        try {
                            listCache = (Map) objectInputStream2.readObject();
                            lengthCache = (Map) objectInputStream2.readObject();
                            listCacheFromFile = true;
                            try {
                                objectInputStream2.close();
                            } catch (IOException e2) {
                                String str = LOG_TAG;
                                localizedMessage = e2.getLocalizedMessage();
                                objectInputStream2 = str;
                                LOG.d(objectInputStream2, localizedMessage);
                                objectInputStream = objectInputStream2;
                                if (listCache == null) {
                                }
                            }
                        } catch (IOException unused) {
                            objectInputStream3 = objectInputStream2;
                            if (objectInputStream3 != null) {
                                try {
                                    objectInputStream3.close();
                                } catch (IOException e3) {
                                    String str2 = LOG_TAG;
                                    localizedMessage = e3.getLocalizedMessage();
                                    objectInputStream2 = str2;
                                    LOG.d(objectInputStream2, localizedMessage);
                                    objectInputStream = objectInputStream2;
                                    if (listCache == null) {
                                    }
                                }
                            }
                            objectInputStream = objectInputStream2;
                            if (listCache == null) {
                            }
                        } catch (ClassNotFoundException e4) {
                            e = e4;
                            e.printStackTrace();
                            if (objectInputStream2 != 0) {
                                try {
                                    objectInputStream2.close();
                                } catch (IOException e5) {
                                    String str3 = LOG_TAG;
                                    localizedMessage = e5.getLocalizedMessage();
                                    objectInputStream2 = str3;
                                    LOG.d(objectInputStream2, localizedMessage);
                                    objectInputStream = objectInputStream2;
                                    if (listCache == null) {
                                    }
                                }
                            }
                            objectInputStream = objectInputStream2;
                            if (listCache == null) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e6) {
                                LOG.d(LOG_TAG, e6.getLocalizedMessage());
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                } catch (ClassNotFoundException e7) {
                    objectInputStream2 = 0;
                    e = e7;
                } catch (Throwable th3) {
                    objectInputStream = null;
                    th = th3;
                    if (objectInputStream != null) {
                    }
                    throw th;
                }
                objectInputStream = objectInputStream2;
                if (listCache == null) {
                    LOG.w(LOG_TAG, "Asset manifest not found. Recursive copies and directory listing will be slow.");
                    listCache = new HashMap();
                    objectInputStream = "Asset manifest not found. Recursive copies and directory listing will be slow.";
                }
            }
        }
    }

    private String[] listAssets(String str) throws IOException {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        lazyInitCaches();
        String[] strArr = listCache.get(str);
        if (strArr != null) {
            return strArr;
        }
        if (listCacheFromFile) {
            return new String[0];
        }
        String[] list = this.assetManager.list(str);
        listCache.put(str, list);
        return list;
    }

    private long getAssetSize(String str) throws IOException {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        lazyInitCaches();
        Map<String, Long> map = lengthCache;
        if (map != null) {
            Long l = map.get(str);
            if (l != null) {
                return l.longValue();
            }
            throw new FileNotFoundException("Asset not found: " + str);
        }
        CordovaResourceApi.OpenForReadResult openForReadResultOpenForRead = null;
        try {
            try {
                openForReadResultOpenForRead = this.resourceApi.openForRead(nativeUriForFullPath(str));
                long jAvailable = openForReadResultOpenForRead.length;
                if (jAvailable < 0) {
                    jAvailable = openForReadResultOpenForRead.inputStream.available();
                }
                return jAvailable;
            } catch (IOException e) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("File not found: " + str);
                fileNotFoundException.initCause(e);
                throw fileNotFoundException;
            }
        } finally {
            if (openForReadResultOpenForRead != null) {
                try {
                    openForReadResultOpenForRead.inputStream.close();
                } catch (IOException e2) {
                    LOG.d(LOG_TAG, e2.getLocalizedMessage());
                }
            }
        }
    }

    public AssetFilesystem(AssetManager assetManager, CordovaResourceApi cordovaResourceApi, CordovaPreferences cordovaPreferences) {
        super(Uri.parse("file:///android_asset/"), "assets", cordovaResourceApi, cordovaPreferences);
        this.assetManager = assetManager;
    }

    @Override // org.apache.cordova.file.Filesystem
    public Uri toNativeUri(LocalFilesystemURL localFilesystemURL) {
        return nativeUriForFullPath(localFilesystemURL.path);
    }

    @Override // org.apache.cordova.file.Filesystem
    public LocalFilesystemURL toLocalUri(Uri uri) {
        if (!"file".equals(uri.getScheme())) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(new File(uri.getPath()));
        String encodedPath = this.rootUri.getEncodedPath();
        String strSubstring = encodedPath.substring(0, encodedPath.length() - 1);
        if (!uriFromFile.getEncodedPath().startsWith(strSubstring)) {
            return null;
        }
        String strSubstring2 = uriFromFile.getEncodedPath().substring(strSubstring.length());
        if (!strSubstring2.isEmpty()) {
            strSubstring2 = strSubstring2.substring(1);
        }
        Uri.Builder builderCreateLocalUriBuilder = createLocalUriBuilder();
        if (!strSubstring2.isEmpty()) {
            builderCreateLocalUriBuilder.appendEncodedPath(strSubstring2);
        }
        if (isDirectory(strSubstring2) || uri.getPath().endsWith("/")) {
            builderCreateLocalUriBuilder.appendEncodedPath("");
        }
        return LocalFilesystemURL.parse(builderCreateLocalUriBuilder.build());
    }

    private boolean isDirectory(String str) {
        try {
            return listAssets(str).length != 0;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // org.apache.cordova.file.Filesystem
    public LocalFilesystemURL[] listChildren(LocalFilesystemURL localFilesystemURL) throws FileNotFoundException {
        String strSubstring = localFilesystemURL.path.substring(1);
        if (strSubstring.endsWith("/")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        try {
            String[] strArrListAssets = listAssets(strSubstring);
            LocalFilesystemURL[] localFilesystemURLArr = new LocalFilesystemURL[strArrListAssets.length];
            for (int i = 0; i < strArrListAssets.length; i++) {
                localFilesystemURLArr[i] = localUrlforFullPath(new File(localFilesystemURL.path, strArrListAssets[i]).getPath());
            }
            return localFilesystemURLArr;
        } catch (IOException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException();
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        }
    }

    @Override // org.apache.cordova.file.Filesystem
    public JSONObject getFileForLocalURL(LocalFilesystemURL localFilesystemURL, String str, JSONObject jSONObject, boolean z) throws JSONException, FileExistsException, EncodingException, TypeMismatchException, IOException {
        LocalFilesystemURL localFilesystemURLLocalUrlforFullPath;
        if (jSONObject != null && jSONObject.optBoolean("create")) {
            throw new UnsupportedOperationException("Assets are read-only");
        }
        if (z && !str.endsWith("/")) {
            str = str + "/";
        }
        if (!str.startsWith("/")) {
            localFilesystemURLLocalUrlforFullPath = localUrlforFullPath(normalizePath(localFilesystemURL.path + "/" + str));
        } else {
            localFilesystemURLLocalUrlforFullPath = localUrlforFullPath(normalizePath(str));
        }
        getFileMetadataForLocalURL(localFilesystemURLLocalUrlforFullPath);
        boolean zIsDirectory = isDirectory(localFilesystemURLLocalUrlforFullPath.path);
        if (z && !zIsDirectory) {
            throw new TypeMismatchException("path doesn't exist or is file");
        }
        if (!z && zIsDirectory) {
            throw new TypeMismatchException("path doesn't exist or is directory");
        }
        return makeEntryForURL(localFilesystemURLLocalUrlforFullPath);
    }

    @Override // org.apache.cordova.file.Filesystem
    public JSONObject getFileMetadataForLocalURL(LocalFilesystemURL localFilesystemURL) throws JSONException, FileNotFoundException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", localFilesystemURL.isDirectory ? 0L : getAssetSize(localFilesystemURL.path));
            jSONObject.put("type", localFilesystemURL.isDirectory ? "text/directory" : this.resourceApi.getMimeType(toNativeUri(localFilesystemURL)));
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new File(localFilesystemURL.path).getName());
            jSONObject.put("fullPath", localFilesystemURL.path);
            jSONObject.put("lastModifiedDate", 0);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // org.apache.cordova.file.Filesystem
    long writeToFileAtURL(LocalFilesystemURL localFilesystemURL, String str, int i, boolean z) throws NoModificationAllowedException, IOException {
        throw new NoModificationAllowedException("Assets are read-only");
    }

    @Override // org.apache.cordova.file.Filesystem
    long truncateFileAtURL(LocalFilesystemURL localFilesystemURL, long j) throws NoModificationAllowedException, IOException {
        throw new NoModificationAllowedException("Assets are read-only");
    }

    @Override // org.apache.cordova.file.Filesystem
    String filesystemPathForURL(LocalFilesystemURL localFilesystemURL) {
        return new File(this.rootUri.getPath(), localFilesystemURL.path).toString();
    }

    @Override // org.apache.cordova.file.Filesystem
    boolean removeFileAtLocalURL(LocalFilesystemURL localFilesystemURL) throws InvalidModificationException, NoModificationAllowedException {
        throw new NoModificationAllowedException("Assets are read-only");
    }

    @Override // org.apache.cordova.file.Filesystem
    boolean recursiveRemoveFileAtLocalURL(LocalFilesystemURL localFilesystemURL) throws NoModificationAllowedException {
        throw new NoModificationAllowedException("Assets are read-only");
    }
}
