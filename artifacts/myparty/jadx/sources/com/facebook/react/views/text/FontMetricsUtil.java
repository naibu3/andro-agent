package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FontMetricsUtil.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/views/text/FontMetricsUtil;", "", "<init>", "()V", "CAP_HEIGHT_MEASUREMENT_TEXT", "", "X_HEIGHT_MEASUREMENT_TEXT", "AMPLIFICATION_FACTOR", "", "getFontMetrics", "Lcom/facebook/react/bridge/WritableArray;", "text", "", "layout", "Landroid/text/Layout;", "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FontMetricsUtil {
    private static final float AMPLIFICATION_FACTOR = 100.0f;
    private static final String CAP_HEIGHT_MEASUREMENT_TEXT = "T";
    public static final FontMetricsUtil INSTANCE = new FontMetricsUtil();
    private static final String X_HEIGHT_MEASUREMENT_TEXT = "x";

    private FontMetricsUtil() {
    }

    @JvmStatic
    public static final WritableArray getFontMetrics(CharSequence text, Layout layout, Context context) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Intrinsics.checkNotNullExpressionValue(writableArrayCreateArray, "createArray(...)");
        TextPaint textPaint = new TextPaint(layout.getPaint());
        textPaint.setTextSize(textPaint.getTextSize() * 100.0f);
        int i = 0;
        int i2 = 1;
        textPaint.getTextBounds("T", 0, 1, new Rect());
        float fHeight = (r6.height() / 100.0f) / displayMetrics.density;
        String str = "x";
        textPaint.getTextBounds("x", 0, 1, new Rect());
        float fHeight2 = (r8.height() / 100.0f) / displayMetrics.density;
        int lineCount = layout.getLineCount();
        while (i < lineCount) {
            float lineWidth = (text.length() <= 0 || text.charAt(layout.getLineEnd(i) - i2) != '\n') ? layout.getLineWidth(i) : layout.getLineMax(i);
            layout.getLineBounds(i, new Rect());
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put(str, layout.getLineLeft(i) / displayMetrics.density);
            readableMapBuilder.put(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, r12.top / displayMetrics.density);
            readableMapBuilder.put("width", lineWidth / displayMetrics.density);
            readableMapBuilder.put("height", r12.height() / displayMetrics.density);
            readableMapBuilder.put("descender", layout.getLineDescent(i) / displayMetrics.density);
            readableMapBuilder.put("ascender", (-layout.getLineAscent(i)) / displayMetrics.density);
            readableMapBuilder.put("baseline", layout.getLineBaseline(i) / displayMetrics.density);
            readableMapBuilder.put("capHeight", fHeight);
            readableMapBuilder.put("xHeight", fHeight2);
            readableMapBuilder.put("text", text.subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
            i++;
            str = str;
            lineCount = lineCount;
            i2 = 1;
        }
        return writableArrayCreateArray;
    }
}
