package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.OperationCanceledException;
import androidx.core.os.CancellationSignal;

/* loaded from: classes2.dex */
public final class ContentResolverCompat {
    private ContentResolverCompat() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Cursor query(ContentResolver resolver, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) throws Exception {
        Object cancellationSignalObject;
        if (cancellationSignal != null) {
            try {
                cancellationSignalObject = cancellationSignal.getCancellationSignalObject();
            } catch (Exception e) {
                e = e;
                if (!(e instanceof OperationCanceledException)) {
                }
            }
        } else {
            cancellationSignalObject = null;
        }
        try {
            android.os.CancellationSignal cancellationSignalObj = (android.os.CancellationSignal) cancellationSignalObject;
            try {
                return Api16Impl.query(resolver, uri, projection, selection, selectionArgs, sortOrder, cancellationSignalObj);
            } catch (Exception e2) {
                e = e2;
                if (!(e instanceof OperationCanceledException)) {
                    throw new androidx.core.os.OperationCanceledException();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static Cursor query(ContentResolver contentResolver, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, android.os.CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, projection, selection, selectionArgs, sortOrder, cancellationSignal);
        }
    }
}
