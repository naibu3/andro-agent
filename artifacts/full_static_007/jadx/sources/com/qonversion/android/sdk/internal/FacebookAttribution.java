package com.qonversion.android.sdk.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FacebookAttribution.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0002¨\u0006\r"}, d2 = {"Lcom/qonversion/android/sdk/internal/FacebookAttribution;", "", "()V", "getAttributionId", "", "contentResolver", "Landroid/content/ContentResolver;", "resultListener", "Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;", "getAttributionIdAsync", "listenerRef", "Ljava/lang/ref/WeakReference;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class FacebookAttribution {
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");

    public final void getAttributionId(final ContentResolver contentResolver, FacebookAttributionListener resultListener) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        final WeakReference weakReference = new WeakReference(resultListener);
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.qonversion.android.sdk.internal.FacebookAttribution$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FacebookAttribution.getAttributionId$lambda$0(this.f$0, contentResolver, weakReference);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getAttributionId$lambda$0(FacebookAttribution this$0, ContentResolver contentResolver, WeakReference listenerRef) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(contentResolver, "$contentResolver");
        Intrinsics.checkNotNullParameter(listenerRef, "$listenerRef");
        this$0.getAttributionIdAsync(contentResolver, listenerRef);
    }

    private final void getAttributionIdAsync(ContentResolver contentResolver, WeakReference<FacebookAttributionListener> listenerRef) {
        Cursor cursorQuery;
        int columnIndex;
        String string = null;
        try {
            cursorQuery = contentResolver.query(ATTRIBUTION_ID_CONTENT_URI, new String[]{ATTRIBUTION_ID_COLUMN_NAME}, null, null, null);
        } catch (Exception unused) {
            cursorQuery = null;
        }
        if (cursorQuery != null && cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex(ATTRIBUTION_ID_COLUMN_NAME)) >= 0) {
            string = cursorQuery.getString(columnIndex);
            cursorQuery.close();
        }
        FacebookAttributionListener facebookAttributionListener = listenerRef.get();
        if (facebookAttributionListener != null) {
            facebookAttributionListener.onFbAttributionIdResult(string);
        }
    }
}
