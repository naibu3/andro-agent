package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import androidx.camera.video.AudioStats;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.ReactFontManager;
import com.horcrux.svg.TextProperties;
import java.text.Bidi;
import java.util.ArrayList;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
class TSpanView extends TextView {
    private static final String FONTS = "fonts/";
    private static final String OTF = ".otf";
    private static final String TTF = ".ttf";
    static final String additionalLigatures = "'hlig', 'cala', ";
    static final String defaultFeatures = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', ";
    static final String disableDiscretionaryLigatures = "'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, ";
    static final String fontWeightTag = "'wght' ";
    private static final double radToDeg = 57.29577951308232d;
    static final String requiredFontFeatures = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk',";
    private static final double tau = 6.283185307179586d;
    private final AssetManager assets;
    private final ArrayList<String> emoji;
    private final ArrayList<Matrix> emojiTransforms;
    private Path mCachedPath;

    @Nullable
    String mContent;
    private TextPathView textPath;

    public TSpanView(ReactContext reactContext) {
        super(reactContext);
        this.emoji = new ArrayList<>();
        this.emojiTransforms = new ArrayList<>();
        this.assets = this.mContext.getResources().getAssets();
    }

    public void setContent(@Nullable String str) {
        this.mContent = str;
        invalidate();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.mCachedPath = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView
    void clearCache() {
        this.mCachedPath = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f) {
        if (this.mContent != null) {
            if (this.mInlineSize != null && this.mInlineSize.value != AudioStats.AUDIO_AMPLITUDE_NONE) {
                if (setupFillPaint(paint, this.fillOpacity * f)) {
                    drawWrappedText(canvas, paint);
                }
                if (setupStrokePaint(paint, f * this.strokeOpacity)) {
                    drawWrappedText(canvas, paint);
                    return;
                }
                return;
            }
            int size = this.emoji.size();
            if (size > 0) {
                applyTextPropertiesToPaint(paint, getTextRootGlyphContext().getFont());
                for (int i = 0; i < size; i++) {
                    String str = this.emoji.get(i);
                    Matrix matrix = this.emojiTransforms.get(i);
                    canvas.save();
                    canvas.concat(matrix);
                    canvas.drawText(str, 0.0f, 0.0f, paint);
                    canvas.restore();
                }
            }
            drawPath(canvas, paint, f);
            return;
        }
        clip(canvas, paint);
        drawGroup(canvas, paint, f);
    }

    private void drawWrappedText(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        GlyphContext textRootGlyphContext = getTextRootGlyphContext();
        pushGlyphContext();
        FontData font = textRootGlyphContext.getFont();
        TextPaint textPaint = new TextPaint(paint);
        applyTextPropertiesToPaint(textPaint, font);
        applySpacingAndFeatures(textPaint, font);
        double fontSize = textRootGlyphContext.getFontSize();
        int i = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[font.textAnchor.ordinal()];
        if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout staticLayout = getStaticLayout(textPaint, alignment, true, new SpannableString(this.mContent), (int) PropHelper.fromRelative(this.mInlineSize, canvas.getWidth(), AudioStats.AUDIO_AMPLITUDE_NONE, this.mScale, fontSize));
        int lineAscent = staticLayout.getLineAscent(0);
        float fNextX = (float) textRootGlyphContext.nextX(AudioStats.AUDIO_AMPLITUDE_NONE);
        float fNextY = (float) (textRootGlyphContext.nextY() + lineAscent);
        popGlyphContext();
        canvas.save();
        canvas.translate(fNextX, fNextY);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    private StaticLayout getStaticLayout(TextPaint textPaint, Layout.Alignment alignment, boolean z, SpannableString spannableString, int i) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    public static String visualToLogical(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i = 0; i < runCount; i++) {
            bArr[i] = (byte) bidi.getRunLevel(i);
            numArr[i] = Integer.valueOf(i);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < runCount; i2++) {
            int iIntValue = numArr[i2].intValue();
            int runStart = bidi.getRunStart(iIntValue);
            int runLimit = bidi.getRunLimit(iIntValue);
            if ((bArr[iIntValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb.toString();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mCachedPath;
        if (path != null) {
            return path;
        }
        if (this.mContent == null) {
            Path groupPath = getGroupPath(canvas, paint);
            this.mCachedPath = groupPath;
            return groupPath;
        }
        setupTextPath();
        pushGlyphContext();
        this.mCachedPath = getLinePath(visualToLogical(this.mContent), paint, canvas);
        popGlyphContext();
        return this.mCachedPath;
    }

    @Override // com.horcrux.svg.TextView
    double getSubtreeTextChunksTotalAdvance(Paint paint) {
        if (!Double.isNaN(this.cachedAdvance)) {
            return this.cachedAdvance;
        }
        String str = this.mContent;
        double subtreeTextChunksTotalAdvance = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof TextView) {
                    subtreeTextChunksTotalAdvance += ((TextView) childAt).getSubtreeTextChunksTotalAdvance(paint);
                }
            }
            this.cachedAdvance = subtreeTextChunksTotalAdvance;
            return subtreeTextChunksTotalAdvance;
        }
        if (str.length() == 0) {
            this.cachedAdvance = AudioStats.AUDIO_AMPLITUDE_NONE;
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        FontData font = getTextRootGlyphContext().getFont();
        applyTextPropertiesToPaint(paint, font);
        applySpacingAndFeatures(paint, font);
        this.cachedAdvance = paint.measureText(str);
        return this.cachedAdvance;
    }

    private void applySpacingAndFeatures(Paint paint, FontData fontData) {
        double d = fontData.letterSpacing;
        paint.setLetterSpacing((float) (d / (fontData.fontSize * this.mScale)));
        if (d == AudioStats.AUDIO_AMPLITUDE_NONE && fontData.fontVariantLigatures == TextProperties.FontVariantLigatures.normal) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + fontData.fontFeatureSettings);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + fontData.fontFeatureSettings);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            paint.setFontVariationSettings(fontWeightTag + fontData.absoluteFontWeight + fontData.fontVariationSettings);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path getLinePath(String str, Paint paint, Canvas canvas) {
        PathMeasure pathMeasure;
        boolean z;
        double length;
        GlyphContext glyphContext;
        boolean z2;
        TSpanView tSpanView;
        double d;
        boolean z3;
        GlyphContext glyphContext2;
        double d2;
        boolean z4;
        GlyphPathBag glyphPathBag;
        float[] fArr;
        boolean[] zArr;
        double d3;
        double d4;
        double d5;
        int i;
        boolean z5;
        double d6;
        TextProperties.AlignmentBaseline alignmentBaseline;
        char c;
        boolean z6;
        float f;
        boolean z7;
        double d7;
        float[] fArr2;
        Canvas canvas2;
        int i2;
        GlyphContext glyphContext3;
        GlyphPathBag glyphPathBag2;
        Matrix matrix;
        TSpanView tSpanView2;
        Paint paint2;
        float[] fArr3;
        Path path;
        char c2;
        double d8;
        GlyphPathBag glyphPathBag3;
        float f2;
        double d9;
        char c3;
        double d10;
        float[] fArr4;
        int i3;
        String str2;
        Path orCreateAndCache;
        int i4;
        int i5;
        double d11;
        Paint paint3 = paint;
        Canvas canvas3 = canvas;
        int length2 = str.length();
        Path path2 = new Path();
        this.emoji.clear();
        this.emojiTransforms.clear();
        if (length2 != 0) {
            boolean z8 = this.textPath != null;
            if (z8) {
                pathMeasure = new PathMeasure(this.textPath.getTextPath(canvas3, paint3), false);
                length = pathMeasure.getLength();
                boolean zIsClosed = pathMeasure.isClosed();
                if (length != AudioStats.AUDIO_AMPLITUDE_NONE) {
                    z = zIsClosed;
                }
            } else {
                pathMeasure = null;
                z = false;
                length = 0.0d;
            }
            PathMeasure pathMeasure2 = pathMeasure;
            GlyphContext textRootGlyphContext = getTextRootGlyphContext();
            FontData font = textRootGlyphContext.getFont();
            applyTextPropertiesToPaint(paint3, font);
            GlyphPathBag glyphPathBag4 = new GlyphPathBag(paint3);
            boolean[] zArr2 = new boolean[length2];
            char[] charArray = str.toCharArray();
            double d12 = font.kerning;
            double d13 = font.wordSpacing;
            double d14 = font.letterSpacing;
            boolean z9 = font.manualKerning;
            if (d14 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                glyphContext = textRootGlyphContext;
                z2 = font.fontVariantLigatures == TextProperties.FontVariantLigatures.normal;
                if (!z2) {
                    paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + font.fontFeatureSettings);
                } else {
                    paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + font.fontFeatureSettings);
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    paint3.setFontVariationSettings(fontWeightTag + font.absoluteFontWeight + font.fontVariationSettings);
                }
                ReadableMap readableMap = font.fontData;
                float[] fArr5 = new float[length2];
                double d15 = length;
                paint3.getTextWidths(str, fArr5);
                TextProperties.TextAnchor textAnchor = font.textAnchor;
                double subtreeTextChunksTotalAdvance = getTextAnchorRoot().getSubtreeTextChunksTotalAdvance(paint3);
                double textAnchorOffset = getTextAnchorOffset(textAnchor, subtreeTextChunksTotalAdvance);
                double fontSize = glyphContext.getFontSize();
                char c4 = 65535;
                if (z8) {
                    tSpanView = this;
                    d = subtreeTextChunksTotalAdvance;
                    z3 = z9;
                    glyphContext2 = glyphContext;
                    d2 = fontSize;
                    z4 = z8;
                    glyphPathBag = glyphPathBag4;
                    fArr = fArr5;
                    zArr = zArr2;
                    d3 = d15;
                    d4 = 0.0d;
                    d5 = textAnchorOffset;
                    i = 1;
                    z5 = false;
                } else {
                    boolean z10 = this.textPath.getMidLine() == TextProperties.TextPathMidLine.sharp;
                    int i6 = this.textPath.getSide() == TextProperties.TextPathSide.right ? -1 : 1;
                    d = subtreeTextChunksTotalAdvance;
                    z3 = z9;
                    glyphContext2 = glyphContext;
                    fArr = fArr5;
                    z4 = z8;
                    zArr = zArr2;
                    glyphPathBag = glyphPathBag4;
                    double absoluteStartOffset = getAbsoluteStartOffset(this.textPath.getStartOffset(), d15, fontSize);
                    tSpanView = this;
                    d3 = d15;
                    double d16 = textAnchorOffset + absoluteStartOffset;
                    d2 = fontSize;
                    if (z) {
                        double d17 = absoluteStartOffset + (textAnchor == TextProperties.TextAnchor.middle ? -(d3 / 2.0d) : 0.0d);
                        d5 = d16;
                        d4 = d17;
                        z5 = z10;
                        d6 = d17 + d3;
                        i = i6;
                        double d18 = 1.0d;
                        if (tSpanView.mTextLength != null) {
                            double dFromRelative = PropHelper.fromRelative(tSpanView.mTextLength, canvas3.getWidth(), AudioStats.AUDIO_AMPLITUDE_NONE, tSpanView.mScale, d2);
                            if (dFromRelative < AudioStats.AUDIO_AMPLITUDE_NONE) {
                                throw new IllegalArgumentException("Negative textLength value");
                            }
                            if (AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[tSpanView.mLengthAdjust.ordinal()] != 2) {
                                d14 += (dFromRelative - d) / (length2 - 1);
                            } else {
                                d18 = dFromRelative / d;
                            }
                        }
                        double d19 = i;
                        boolean z11 = z5;
                        Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                        int i7 = i;
                        double d20 = d18 * d19;
                        double d21 = fontMetrics.descent;
                        double d22 = d3;
                        double d23 = fontMetrics.leading + d21;
                        double dFromRelative2 = (-fontMetrics.ascent) + fontMetrics.leading;
                        double d24 = -fontMetrics.top;
                        double d25 = d24 + d23;
                        String baselineShift = tSpanView.getBaselineShift();
                        alignmentBaseline = tSpanView.getAlignmentBaseline();
                        if (alignmentBaseline != null) {
                            switch (alignmentBaseline) {
                                case textBottom:
                                case afterEdge:
                                case textAfterEdge:
                                case ideographic:
                                    c = 0;
                                    dFromRelative2 = -d21;
                                    break;
                                case alphabetic:
                                default:
                                    c = 0;
                                    dFromRelative2 = 0.0d;
                                    break;
                                case middle:
                                    c = 0;
                                    paint3.getTextBounds("x", 0, 1, new Rect());
                                    dFromRelative2 = r0.height() / 2.0d;
                                    break;
                                case central:
                                    dFromRelative2 = (dFromRelative2 - d21) / 2.0d;
                                    c = 0;
                                    break;
                                case mathematical:
                                    d11 = 0.5d;
                                    dFromRelative2 *= d11;
                                    c = 0;
                                    break;
                                case hanging:
                                    d11 = 0.8d;
                                    dFromRelative2 *= d11;
                                    c = 0;
                                    break;
                                case textTop:
                                case beforeEdge:
                                case textBeforeEdge:
                                    c = 0;
                                    break;
                                case bottom:
                                    dFromRelative2 = d23;
                                    c = 0;
                                    break;
                                case center:
                                    dFromRelative2 = d25 / 2.0d;
                                    c = 0;
                                    break;
                                case top:
                                    dFromRelative2 = d24;
                                    c = 0;
                                    break;
                            }
                            if (baselineShift != null && !baselineShift.isEmpty() && (i5 = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[alignmentBaseline.ordinal()]) != 14 && i5 != 16) {
                                baselineShift.hashCode();
                                switch (baselineShift.hashCode()) {
                                    case -1720785339:
                                        if (baselineShift.equals("baseline")) {
                                            c4 = c;
                                            break;
                                        }
                                        break;
                                    case 114240:
                                        if (baselineShift.equals("sub")) {
                                            c4 = 1;
                                            break;
                                        }
                                        break;
                                    case 109801339:
                                        if (baselineShift.equals("super")) {
                                            c4 = 2;
                                            break;
                                        }
                                        break;
                                }
                                switch (c4) {
                                    case 0:
                                        break;
                                    case 1:
                                        if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                            int i8 = readableMap.getInt("unitsPerEm");
                                            ReadableMap map = readableMap.getMap("tables");
                                            if (map.hasKey("os2")) {
                                                ReadableMap map2 = map.getMap("os2");
                                                if (!map2.hasKey("ySubscriptYOffset")) {
                                                    dFromRelative2 = dFromRelative2;
                                                    break;
                                                } else {
                                                    dFromRelative2 += ((tSpanView.mScale * d2) * map2.getDouble("ySubscriptYOffset")) / i8;
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                            int i9 = readableMap.getInt("unitsPerEm");
                                            ReadableMap map3 = readableMap.getMap("tables");
                                            if (map3.hasKey("os2")) {
                                                ReadableMap map4 = map3.getMap("os2");
                                                if (map4.hasKey("ySuperscriptYOffset")) {
                                                    dFromRelative2 -= ((tSpanView.mScale * d2) * map4.getDouble("ySuperscriptYOffset")) / i9;
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        dFromRelative2 -= PropHelper.fromRelative(baselineShift, tSpanView.mScale * d2, tSpanView.mScale, d2);
                                        break;
                                }
                            }
                            double d26 = dFromRelative2;
                            Matrix matrix2 = new Matrix();
                            Matrix matrix3 = new Matrix();
                            Matrix matrix4 = new Matrix();
                            float[] fArr6 = new float[9];
                            float[] fArr7 = new float[9];
                            int i10 = 0;
                            while (i10 < length2) {
                                char c5 = charArray[i10];
                                String strValueOf = String.valueOf(c5);
                                boolean z12 = zArr[i10];
                                if (z12) {
                                    strValueOf = "";
                                    z6 = false;
                                    f = 0.0f;
                                } else {
                                    int i11 = i10;
                                    z6 = false;
                                    f = 0.0f;
                                    while (true) {
                                        int i12 = i11 + 1;
                                        if (i12 < length2 && fArr[i12] <= 0.0f) {
                                            strValueOf = strValueOf + charArray[i12];
                                            zArr[i12] = true;
                                            i11 = i12;
                                            z6 = true;
                                        }
                                    }
                                }
                                int i13 = i10;
                                double dMeasureText = paint3.measureText(strValueOf) * d18;
                                if (!z3) {
                                    d12 = (fArr[i13] * d18) - dMeasureText;
                                }
                                boolean z13 = c5 == ' ';
                                double d27 = dMeasureText + (z13 ? d13 : 0.0d) + d14;
                                if (z12) {
                                    z7 = z13;
                                    d7 = 0.0d;
                                } else {
                                    z7 = z13;
                                    d7 = d12 + d27;
                                }
                                double dNextX = glyphContext2.nextX(d7);
                                double dNextY = glyphContext2.nextY();
                                double dNextDeltaX = glyphContext2.nextDeltaX();
                                double dNextDeltaY = glyphContext2.nextDeltaY();
                                String str3 = strValueOf;
                                double dNextRotation = glyphContext2.nextRotation();
                                if (z12 || z7) {
                                    fArr2 = fArr7;
                                    canvas2 = canvas3;
                                    i2 = length2;
                                    glyphContext3 = glyphContext2;
                                    glyphPathBag2 = glyphPathBag;
                                    matrix = matrix3;
                                    tSpanView2 = this;
                                    paint2 = paint;
                                    fArr3 = fArr6;
                                    path = path2;
                                } else {
                                    double d28 = dMeasureText * d19;
                                    i2 = length2;
                                    Path path3 = path2;
                                    double d29 = (d5 + ((dNextX + dNextDeltaX) * d19)) - (d27 * d19);
                                    if (z4) {
                                        c2 = c5;
                                        d8 = dNextRotation;
                                        double d30 = d29 + d28;
                                        double d31 = d28 / 2.0d;
                                        double d32 = d29 + d31;
                                        if (d32 <= d6 && d32 >= d4) {
                                            glyphContext3 = glyphContext2;
                                            if (z11) {
                                                pathMeasure2.getMatrix((float) d32, matrix3, 3);
                                                fArr2 = fArr7;
                                                glyphPathBag3 = glyphPathBag;
                                                matrix = matrix3;
                                                d10 = d22;
                                                c3 = 2;
                                                fArr4 = fArr6;
                                            } else {
                                                if (d29 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                                                    glyphPathBag3 = glyphPathBag;
                                                    float f3 = f;
                                                    pathMeasure2.getMatrix(f3, matrix2, 3);
                                                    matrix2.preTranslate((float) d29, f3);
                                                    i4 = 1;
                                                } else {
                                                    glyphPathBag3 = glyphPathBag;
                                                    i4 = 1;
                                                    pathMeasure2.getMatrix((float) d29, matrix2, 1);
                                                }
                                                pathMeasure2.getMatrix((float) d32, matrix3, i4);
                                                if (d30 > d22) {
                                                    d10 = d22;
                                                    pathMeasure2.getMatrix((float) d10, matrix4, 3);
                                                    matrix4.preTranslate((float) (d30 - d10), 0.0f);
                                                } else {
                                                    d10 = d22;
                                                    pathMeasure2.getMatrix((float) d30, matrix4, i4);
                                                }
                                                matrix2.getValues(fArr6);
                                                matrix4.getValues(fArr7);
                                                c3 = 2;
                                                fArr2 = fArr7;
                                                fArr4 = fArr6;
                                                matrix = matrix3;
                                                matrix.preRotate((float) (Math.atan2(fArr7[5] - fArr6[5], fArr7[2] - fArr6[2]) * radToDeg * d19));
                                            }
                                            matrix.preTranslate((float) (-d31), (float) (dNextDeltaY + d26));
                                            d9 = d20;
                                            i3 = i7;
                                            matrix.preScale((float) d9, i3);
                                            f2 = 0.0f;
                                            matrix.postTranslate(0.0f, (float) dNextY);
                                        } else {
                                            tSpanView2 = this;
                                            canvas2 = canvas;
                                            fArr2 = fArr7;
                                            fArr3 = fArr6;
                                            glyphContext3 = glyphContext2;
                                            glyphPathBag2 = glyphPathBag;
                                            matrix = matrix3;
                                            path = path3;
                                            paint2 = paint;
                                        }
                                    } else {
                                        fArr2 = fArr7;
                                        c2 = c5;
                                        d8 = dNextRotation;
                                        glyphContext3 = glyphContext2;
                                        glyphPathBag3 = glyphPathBag;
                                        matrix = matrix3;
                                        f2 = f;
                                        d9 = d20;
                                        c3 = 2;
                                        d10 = d22;
                                        fArr4 = fArr6;
                                        i3 = i7;
                                        matrix.setTranslate((float) d29, (float) (dNextY + dNextDeltaY + d26));
                                    }
                                    matrix.preRotate((float) d8);
                                    if (z6) {
                                        orCreateAndCache = new Path();
                                        d20 = d9;
                                        fArr3 = fArr4;
                                        d22 = d10;
                                        tSpanView2 = this;
                                        paint2 = paint;
                                        i7 = i3;
                                        str2 = str3;
                                        paint2.getTextPath(str2, 0, str3.length(), 0.0f, 0.0f, orCreateAndCache);
                                        glyphPathBag2 = glyphPathBag3;
                                    } else {
                                        tSpanView2 = this;
                                        paint2 = paint;
                                        i7 = i3;
                                        d20 = d9;
                                        fArr3 = fArr4;
                                        str2 = str3;
                                        d22 = d10;
                                        glyphPathBag2 = glyphPathBag3;
                                        orCreateAndCache = glyphPathBag2.getOrCreateAndCache(c2, str2);
                                    }
                                    RectF rectF = new RectF();
                                    orCreateAndCache.computeBounds(rectF, true);
                                    if (rectF.width() == f2) {
                                        canvas.save();
                                        canvas2 = canvas;
                                        canvas2.concat(matrix);
                                        tSpanView2.emoji.add(str2);
                                        tSpanView2.emojiTransforms.add(new Matrix(matrix));
                                        canvas2.drawText(str2, f2, f2, paint2);
                                        canvas2.restore();
                                        path = path3;
                                    } else {
                                        canvas2 = canvas;
                                        orCreateAndCache.transform(matrix);
                                        path = path3;
                                        path.addPath(orCreateAndCache);
                                    }
                                }
                                paint3 = paint2;
                                path2 = path;
                                glyphPathBag = glyphPathBag2;
                                tSpanView = tSpanView2;
                                fArr6 = fArr3;
                                matrix3 = matrix;
                                length2 = i2;
                                glyphContext2 = glyphContext3;
                                fArr7 = fArr2;
                                canvas3 = canvas2;
                                i10 = i13 + 1;
                            }
                        }
                    } else {
                        d4 = 0.0d;
                        d5 = d16;
                        z5 = z10;
                        i = i6;
                    }
                }
                d6 = d3;
                double d182 = 1.0d;
                if (tSpanView.mTextLength != null) {
                }
                double d192 = i;
                boolean z112 = z5;
                Paint.FontMetrics fontMetrics2 = paint3.getFontMetrics();
                int i72 = i;
                double d202 = d182 * d192;
                double d212 = fontMetrics2.descent;
                double d222 = d3;
                double d232 = fontMetrics2.leading + d212;
                double dFromRelative22 = (-fontMetrics2.ascent) + fontMetrics2.leading;
                double d242 = -fontMetrics2.top;
                double d252 = d242 + d232;
                String baselineShift2 = tSpanView.getBaselineShift();
                alignmentBaseline = tSpanView.getAlignmentBaseline();
                if (alignmentBaseline != null) {
                }
            } else {
                glyphContext = textRootGlyphContext;
            }
            if (!z2) {
            }
            if (Build.VERSION.SDK_INT >= 26) {
            }
            ReadableMap readableMap2 = font.fontData;
            float[] fArr52 = new float[length2];
            double d152 = length;
            paint3.getTextWidths(str, fArr52);
            TextProperties.TextAnchor textAnchor2 = font.textAnchor;
            double subtreeTextChunksTotalAdvance2 = getTextAnchorRoot().getSubtreeTextChunksTotalAdvance(paint3);
            double textAnchorOffset2 = getTextAnchorOffset(textAnchor2, subtreeTextChunksTotalAdvance2);
            double fontSize2 = glyphContext.getFontSize();
            char c42 = 65535;
            if (z8) {
            }
            d6 = d3;
            double d1822 = 1.0d;
            if (tSpanView.mTextLength != null) {
            }
            double d1922 = i;
            boolean z1122 = z5;
            Paint.FontMetrics fontMetrics22 = paint3.getFontMetrics();
            int i722 = i;
            double d2022 = d1822 * d1922;
            double d2122 = fontMetrics22.descent;
            double d2222 = d3;
            double d2322 = fontMetrics22.leading + d2122;
            double dFromRelative222 = (-fontMetrics22.ascent) + fontMetrics22.leading;
            double d2422 = -fontMetrics22.top;
            double d2522 = d2422 + d2322;
            String baselineShift22 = tSpanView.getBaselineShift();
            alignmentBaseline = tSpanView.getAlignmentBaseline();
            if (alignmentBaseline != null) {
            }
        }
        return path2;
    }

    /* renamed from: com.horcrux.svg.TSpanView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor;
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust;

        static {
            int[] iArr = new int[TextProperties.AlignmentBaseline.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline = iArr;
            try {
                iArr[TextProperties.AlignmentBaseline.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$AlignmentBaseline[TextProperties.AlignmentBaseline.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[TextProperties.TextLengthAdjust.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust = iArr2;
            try {
                iArr2[TextProperties.TextLengthAdjust.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextLengthAdjust[TextProperties.TextLengthAdjust.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[TextProperties.TextAnchor.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor = iArr3;
            try {
                iArr3[TextProperties.TextAnchor.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private double getAbsoluteStartOffset(SVGLength sVGLength, double d, double d2) {
        return PropHelper.fromRelative(sVGLength, d, AudioStats.AUDIO_AMPLITUDE_NONE, this.mScale, d2);
    }

    private double getTextAnchorOffset(TextProperties.TextAnchor textAnchor, double d) {
        int i = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[textAnchor.ordinal()];
        return i != 2 ? i != 3 ? AudioStats.AUDIO_AMPLITUDE_NONE : -d : (-d) / 2.0d;
    }

    private void applyTextPropertiesToPaint(Paint paint, FontData fontData) {
        int i = 0;
        boolean z = fontData.fontWeight == TextProperties.FontWeight.Bold || fontData.absoluteFontWeight >= 550;
        boolean z2 = fontData.fontStyle == TextProperties.FontStyle.italic;
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        int i2 = fontData.absoluteFontWeight;
        String str = fontData.fontFamily;
        Typeface typeface = null;
        if (str != null && str.length() > 0) {
            String str2 = FONTS + str + OTF;
            String str3 = FONTS + str + TTF;
            if (Build.VERSION.SDK_INT >= 26) {
                Typeface.Builder builder = new Typeface.Builder(this.assets, str2);
                builder.setFontVariationSettings(fontWeightTag + i2 + fontData.fontVariationSettings);
                builder.setWeight(i2);
                builder.setItalic(z2);
                typeface = builder.build();
                if (typeface == null) {
                    Typeface.Builder builder2 = new Typeface.Builder(this.assets, str3);
                    builder2.setFontVariationSettings(fontWeightTag + i2 + fontData.fontVariationSettings);
                    builder2.setWeight(i2);
                    builder2.setItalic(z2);
                    typeface = builder2.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(this.assets, str2), i);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    typeface = Typeface.create(Typeface.createFromAsset(this.assets, str3), i);
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = ReactFontManager.getInstance().getTypeface(str, i, this.assets);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i2, z2);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (fontData.fontSize * this.mScale));
        paint.setLetterSpacing(0.0f);
    }

    private void setupTextPath() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == TextPathView.class) {
                this.textPath = (TextPathView) parent;
                return;
            } else {
                if (!(parent instanceof TextView)) {
                    return;
                }
            }
        }
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        if (this.mContent == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            if ((this.mRegion != null && this.mRegion.contains(iRound, iRound2)) || (this.mStrokeRegion != null && this.mStrokeRegion.contains(iRound, iRound2))) {
                if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }
}
