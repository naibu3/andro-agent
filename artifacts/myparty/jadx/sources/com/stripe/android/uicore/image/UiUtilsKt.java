package com.stripe.android.uicore.image;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.facebook.share.internal.ShareConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.enums.EnumEntries;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: UiUtils.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"getResourceId", "Lkotlin/Pair;", "Landroid/content/res/Resources;", "", "Landroid/content/Context;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "getDrawableFromUri", "Landroid/graphics/drawable/Drawable;", "isSupportedImageUrl", "", "", "TAG", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiUtilsKt {
    private static final String TAG = "stripe_ui_core_utils";

    public static final Pair<Resources, Integer> getResourceId(Context context, Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (TextUtils.isEmpty(uri.getAuthority())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
        Intrinsics.checkNotNullExpressionValue(resourcesForApplication, "getResourcesForApplication(...)");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null) {
            throw new FileNotFoundException("No path: " + uri);
        }
        int size = pathSegments.size();
        if (size == 1) {
            try {
                identifier = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
            }
        } else if (size == 2) {
            identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        } else {
            throw new FileNotFoundException("More than two path segments: " + uri);
        }
        if (identifier == 0) {
            throw new FileNotFoundException("No resource found for: " + uri);
        }
        return TuplesKt.to(resourcesForApplication, Integer.valueOf(identifier));
    }

    public static final Drawable getDrawableFromUri(Context context, Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String scheme = uri.getScheme();
        if (Intrinsics.areEqual(UriUtil.QUALIFIED_RESOURCE_SCHEME, scheme)) {
            try {
                Pair<Resources, Integer> resourceId = getResourceId(context, uri);
                return resourceId.component1().getDrawable(resourceId.component2().intValue(), context.getTheme());
            } catch (Resources.NotFoundException e) {
                Log.e(TAG, "Unable to open content: " + uri, e);
            }
        } else if (Intrinsics.areEqual(UriUtil.LOCAL_CONTENT_SCHEME, scheme) || Intrinsics.areEqual("file", scheme)) {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, uri.toString());
                    CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                    return drawableCreateFromStream;
                } finally {
                }
            } catch (IOException e2) {
                Log.w(TAG, "Unable to open content: " + uri, e2);
            }
        } else {
            return Drawable.createFromPath(uri.toString());
        }
        return null;
    }

    public static final boolean isSupportedImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        EnumEntries<ImageType> entries = ImageType.getEntries();
        if ((entries instanceof Collection) && entries.isEmpty()) {
            return false;
        }
        Iterator<ImageType> it = entries.iterator();
        while (it.hasNext()) {
            List<String> suffixes = it.next().getSuffixes();
            if (!(suffixes instanceof Collection) || !suffixes.isEmpty()) {
                Iterator<T> it2 = suffixes.iterator();
                while (it2.hasNext()) {
                    if (StringsKt.endsWith(str, (String) it2.next(), true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
