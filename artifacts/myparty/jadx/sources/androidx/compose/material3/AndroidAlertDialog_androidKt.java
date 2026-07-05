package androidx.compose.material3;

import android.content.res.Resources;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aâ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"ButtonsCrossAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonsMainAxisSpacing", "AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", PaymentSheetAppearanceKeys.ICON, "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "iconContentColor", "titleContentColor", "textContentColor", "tonalElevation", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-Oix01E0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt {
    private static final float ButtonsMainAxisSpacing = Dp.m6117constructorimpl(8);
    private static final float ButtonsCrossAxisSpacing = Dp.m6117constructorimpl(12);

    /* JADX WARN: Removed duplicated region for block: B:105:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0340 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* renamed from: AlertDialog-Oix01E0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2119AlertDialogOix01E0(final Function0<Unit> onDismissRequest, final Function2<? super Composer, ? super Integer, Unit> confirmButton, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, long j, long j2, long j3, long j4, float f, DialogProperties dialogProperties, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Shape shape2;
        int i9;
        int i10;
        long containerColor;
        long iconContentColor;
        long titleContentColor;
        long textContentColor;
        DialogProperties dialogProperties2;
        final float f2;
        int i11;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Shape shape3;
        int i12;
        final long j5;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final long j6;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final long j7;
        Composer composer3;
        final long j8;
        final Modifier modifier3;
        final DialogProperties dialogProperties3;
        final float f3;
        final long j9;
        final Shape shape4;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2081346864);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AlertDialog)P(6!1,5,2,3,11,9,8,1:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color,10:c#ui.graphics.Color,13:c#ui.unit.Dp)81@4079L5,82@4134L14,83@4200L16,84@4269L17,85@4338L16,89@4479L1392:AndroidAlertDialog.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(onDismissRequest) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(confirmButton) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    function25 = function2;
                    i4 |= composerStartRestartGroup.changed(function25) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                    function26 = function22;
                } else {
                    function26 = function22;
                    if ((i & 57344) == 0) {
                        i4 |= composerStartRestartGroup.changed(function26) ? 16384 : 8192;
                    }
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function27 = function23;
                } else {
                    function27 = function23;
                    if ((i & 458752) == 0) {
                        i4 |= composerStartRestartGroup.changed(function27) ? 131072 : 65536;
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                    function28 = function24;
                } else {
                    function28 = function24;
                    if ((i & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changed(function28) ? 1048576 : 524288;
                    }
                }
                if ((i & 29360128) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        int i14 = composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
                        i4 |= i14;
                    } else {
                        shape2 = shape;
                    }
                    i4 |= i14;
                } else {
                    shape2 = shape;
                }
                if ((i & 234881024) == 0) {
                    i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(j)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i & 1879048192) == 0) {
                    i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(j2)) ? 536870912 : 268435456;
                }
                if ((i2 & 14) == 0) {
                    i9 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(j3)) ? 4 : 2);
                } else {
                    i9 = i2;
                }
                if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                    i9 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(j4)) ? 32 : 16;
                }
                i10 = i3 & 4096;
                if (i10 == 0) {
                    if ((i2 & 896) == 0) {
                        i9 |= composerStartRestartGroup.changed(f) ? 256 : 128;
                    }
                    if ((i2 & 7168) == 0) {
                        i9 |= ((i3 & 8192) == 0 && composerStartRestartGroup.changed(dialogProperties)) ? 2048 : 1024;
                    }
                    if ((i4 & 1533916891) == 306783378 || (i9 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                function25 = null;
                            }
                            if (i6 != 0) {
                                function26 = null;
                            }
                            if (i7 != 0) {
                                function27 = null;
                            }
                            if (i8 != 0) {
                                function28 = null;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                                shape2 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            }
                            if ((i3 & 256) == 0) {
                                containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i4 &= -234881025;
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & 512) == 0) {
                                iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                                i4 &= -1879048193;
                            } else {
                                iconContentColor = j2;
                            }
                            if ((i3 & 1024) == 0) {
                                titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                                i9 &= -15;
                            } else {
                                titleContentColor = j3;
                            }
                            if ((i3 & 2048) == 0) {
                                textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                                i9 &= -113;
                            } else {
                                textContentColor = j4;
                            }
                            float fM2116getTonalElevationD9Ej5fM = i10 == 0 ? AlertDialogDefaults.INSTANCE.m2116getTonalElevationD9Ej5fM() : f;
                            if ((i3 & 8192) == 0) {
                                i9 &= -7169;
                                f2 = fM2116getTonalElevationD9Ej5fM;
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                                f2 = fM2116getTonalElevationD9Ej5fM;
                            }
                            i11 = i4;
                            function29 = function26;
                            function210 = function27;
                            shape3 = shape2;
                            i12 = i9;
                            j5 = titleContentColor;
                            long j10 = iconContentColor;
                            composer2 = composerStartRestartGroup;
                            function211 = function28;
                            j6 = j10;
                            function212 = function25;
                            j7 = containerColor;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            if ((i3 & 1024) != 0) {
                                i9 &= -15;
                            }
                            if ((i3 & 2048) != 0) {
                                i9 &= -113;
                            }
                            if ((i3 & 8192) != 0) {
                                i9 &= -7169;
                            }
                            textContentColor = j4;
                            f2 = f;
                            dialogProperties2 = dialogProperties;
                            composer2 = composerStartRestartGroup;
                            i11 = i4;
                            function212 = function25;
                            function29 = function26;
                            function210 = function27;
                            function211 = function28;
                            shape3 = shape2;
                            i12 = i9;
                            j7 = j;
                            j6 = j2;
                            j5 = j3;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2081346864, i11, i12, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:73)");
                        }
                        final int i15 = i12;
                        final int i16 = i11;
                        final Modifier modifier4 = modifier2;
                        composer3 = composer2;
                        j8 = textContentColor;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer3, -1218806937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) throws Resources.NotFoundException {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i17) throws Resources.NotFoundException {
                                ComposerKt.sourceInformation(composer4, "C93@4608L25,105@5053L37,117@5696L9,94@4642L1223:AndroidAlertDialog.android.kt#uh7d8r");
                                if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1218806937, i17, -1, "androidx.compose.material3.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:92)");
                                    }
                                    final String strM2449getStringNWtq28 = Strings_androidKt.m2449getStringNWtq28(Strings.INSTANCE.m2442getDialogadMyvUU(), composer4, 6);
                                    final Function2<Composer, Integer, Unit> function217 = function212;
                                    final int i18 = i16;
                                    final Function2<Composer, Integer, Unit> function218 = confirmButton;
                                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer4, 2094788745, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i19) {
                                            ComposerKt.sourceInformation(composer5, "C96@4702L262:AndroidAlertDialog.android.kt#uh7d8r");
                                            if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2094788745, i19, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:95)");
                                                }
                                                float f4 = AndroidAlertDialog_androidKt.ButtonsMainAxisSpacing;
                                                float f5 = AndroidAlertDialog_androidKt.ButtonsCrossAxisSpacing;
                                                final Function2<Composer, Integer, Unit> function219 = function217;
                                                final int i20 = i18;
                                                final Function2<Composer, Integer, Unit> function220 = function218;
                                                AlertDialogKt.m2118AlertDialogFlowRowixp7dh8(f4, f5, ComposableLambdaKt.composableLambda(composer5, -1243689536, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt.AlertDialog.1.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                        invoke(composer6, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer6, int i21) {
                                                        ComposerKt.sourceInformation(composer6, "C101@4931L15:AndroidAlertDialog.android.kt#uh7d8r");
                                                        if ((i21 & 11) != 2 || !composer6.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1243689536, i21, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:99)");
                                                            }
                                                            Function2<Composer, Integer, Unit> function221 = function219;
                                                            composer6.startReplaceableGroup(-1969500760);
                                                            ComposerKt.sourceInformation(composer6, "100@4902L8");
                                                            if (function221 != null) {
                                                                function221.invoke(composer6, Integer.valueOf((i20 >> 9) & 14));
                                                                Unit unit = Unit.INSTANCE;
                                                            }
                                                            composer6.endReplaceableGroup();
                                                            function220.invoke(composer6, Integer.valueOf((i20 >> 3) & 14));
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer6.skipToGroupEnd();
                                                    }
                                                }), composer5, 438);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    });
                                    Modifier modifier5 = modifier4;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    composer4.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged = composer4.changed(strM2449getStringNWtq28);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                SemanticsPropertiesKt.setPaneTitle(semantics, strM2449getStringNWtq28);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceableGroup();
                                    Modifier modifierThen = modifier5.then(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null));
                                    Function2<Composer, Integer, Unit> function219 = function29;
                                    Function2<Composer, Integer, Unit> function220 = function210;
                                    Function2<Composer, Integer, Unit> function221 = function211;
                                    Shape shape5 = shape3;
                                    long j11 = j7;
                                    float f4 = f2;
                                    long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getActionLabelTextColor(), composer4, 6);
                                    long j12 = j6;
                                    long j13 = j5;
                                    long j14 = j8;
                                    int i19 = i16;
                                    int i20 = ((i19 >> 6) & 7168) | ((i19 >> 6) & 896) | 6 | ((i19 >> 6) & 57344) | ((i19 >> 6) & 458752) | ((i19 >> 6) & 3670016);
                                    int i21 = i15;
                                    AlertDialogKt.m2117AlertDialogContent4hvqGtA(composableLambda, modifierThen, function219, function220, function221, shape5, j11, f4, color, j12, j13, j14, composer4, i20 | ((i21 << 15) & 29360128) | (i19 & 1879048192), i21 & WebSocketProtocol.PAYLOAD_SHORT, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, (i16 & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT | ((i15 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 0);
                        DialogProperties dialogProperties4 = dialogProperties2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        dialogProperties3 = dialogProperties4;
                        f3 = f2;
                        j9 = j7;
                        shape4 = shape3;
                        function213 = function211;
                        function214 = function210;
                        function215 = function29;
                        function216 = function212;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        f3 = f;
                        dialogProperties3 = dialogProperties;
                        composer3 = composerStartRestartGroup;
                        function216 = function25;
                        function215 = function26;
                        function214 = function27;
                        function213 = function28;
                        shape4 = shape2;
                        modifier3 = modifier2;
                        j9 = j;
                        j6 = j2;
                        j5 = j3;
                        j8 = j4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i17) {
                            AndroidAlertDialog_androidKt.m2119AlertDialogOix01E0(onDismissRequest, confirmButton, modifier3, function216, function215, function214, function213, shape4, j9, j6, j5, j8, f3, dialogProperties3, composer4, i | 1, i2, i3);
                        }
                    });
                    return;
                }
                i9 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                if ((i2 & 7168) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if ((i3 & 128) != 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i3 & 8192) == 0) {
                        }
                        i11 = i4;
                        function29 = function26;
                        function210 = function27;
                        shape3 = shape2;
                        i12 = i9;
                        j5 = titleContentColor;
                        long j102 = iconContentColor;
                        composer2 = composerStartRestartGroup;
                        function211 = function28;
                        j6 = j102;
                        function212 = function25;
                        j7 = containerColor;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final int i152 = i12;
                        final int i162 = i11;
                        final Modifier modifier42 = modifier2;
                        composer3 = composer2;
                        j8 = textContentColor;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer3, -1218806937, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) throws Resources.NotFoundException {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i17) throws Resources.NotFoundException {
                                ComposerKt.sourceInformation(composer4, "C93@4608L25,105@5053L37,117@5696L9,94@4642L1223:AndroidAlertDialog.android.kt#uh7d8r");
                                if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1218806937, i17, -1, "androidx.compose.material3.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:92)");
                                    }
                                    final String strM2449getStringNWtq28 = Strings_androidKt.m2449getStringNWtq28(Strings.INSTANCE.m2442getDialogadMyvUU(), composer4, 6);
                                    final Function2<? super Composer, ? super Integer, Unit> function217 = function212;
                                    final int i18 = i162;
                                    final Function2<? super Composer, ? super Integer, Unit> function218 = confirmButton;
                                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer4, 2094788745, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i19) {
                                            ComposerKt.sourceInformation(composer5, "C96@4702L262:AndroidAlertDialog.android.kt#uh7d8r");
                                            if ((i19 & 11) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2094788745, i19, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:95)");
                                                }
                                                float f4 = AndroidAlertDialog_androidKt.ButtonsMainAxisSpacing;
                                                float f5 = AndroidAlertDialog_androidKt.ButtonsCrossAxisSpacing;
                                                final Function2<? super Composer, ? super Integer, Unit> function219 = function217;
                                                final int i20 = i18;
                                                final Function2<? super Composer, ? super Integer, Unit> function220 = function218;
                                                AlertDialogKt.m2118AlertDialogFlowRowixp7dh8(f4, f5, ComposableLambdaKt.composableLambda(composer5, -1243689536, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt.AlertDialog.1.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                        invoke(composer6, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer6, int i21) {
                                                        ComposerKt.sourceInformation(composer6, "C101@4931L15:AndroidAlertDialog.android.kt#uh7d8r");
                                                        if ((i21 & 11) != 2 || !composer6.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1243689536, i21, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:99)");
                                                            }
                                                            Function2<Composer, Integer, Unit> function221 = function219;
                                                            composer6.startReplaceableGroup(-1969500760);
                                                            ComposerKt.sourceInformation(composer6, "100@4902L8");
                                                            if (function221 != null) {
                                                                function221.invoke(composer6, Integer.valueOf((i20 >> 9) & 14));
                                                                Unit unit = Unit.INSTANCE;
                                                            }
                                                            composer6.endReplaceableGroup();
                                                            function220.invoke(composer6, Integer.valueOf((i20 >> 3) & 14));
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer6.skipToGroupEnd();
                                                    }
                                                }), composer5, 438);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    });
                                    Modifier modifier5 = modifier42;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    composer4.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(composer4, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean zChanged = composer4.changed(strM2449getStringNWtq28);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                SemanticsPropertiesKt.setPaneTitle(semantics, strM2449getStringNWtq28);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceableGroup();
                                    Modifier modifierThen = modifier5.then(SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null));
                                    Function2<Composer, Integer, Unit> function219 = function29;
                                    Function2<Composer, Integer, Unit> function220 = function210;
                                    Function2<Composer, Integer, Unit> function221 = function211;
                                    Shape shape5 = shape3;
                                    long j11 = j7;
                                    float f4 = f2;
                                    long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getActionLabelTextColor(), composer4, 6);
                                    long j12 = j6;
                                    long j13 = j5;
                                    long j14 = j8;
                                    int i19 = i162;
                                    int i20 = ((i19 >> 6) & 7168) | ((i19 >> 6) & 896) | 6 | ((i19 >> 6) & 57344) | ((i19 >> 6) & 458752) | ((i19 >> 6) & 3670016);
                                    int i21 = i152;
                                    AlertDialogKt.m2117AlertDialogContent4hvqGtA(composableLambda, modifierThen, function219, function220, function221, shape5, j11, f4, color, j12, j13, j14, composer4, i20 | ((i21 << 15) & 29360128) | (i19 & 1879048192), i21 & WebSocketProtocol.PAYLOAD_SHORT, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, (i162 & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT | ((i152 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 0);
                        DialogProperties dialogProperties42 = dialogProperties2;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        dialogProperties3 = dialogProperties42;
                        f3 = f2;
                        j9 = j7;
                        shape4 = shape3;
                        function213 = function211;
                        function214 = function210;
                        function215 = function29;
                        function216 = function212;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function25 = function2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            if ((i2 & 14) == 0) {
            }
            if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            }
            i10 = i3 & 4096;
            if (i10 == 0) {
            }
            if ((i2 & 7168) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function25 = function2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((i2 & 14) == 0) {
        }
        if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
        }
        i10 = i3 & 4096;
        if (i10 == 0) {
        }
        if ((i2 & 7168) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
