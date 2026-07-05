package androidx.compose.material3;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Strings.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"getString", "", TypedValues.Custom.S_STRING, "Landroidx/compose/material3/Strings;", "getString-NWtq2-8", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Strings_androidKt {
    /* renamed from: getString-NWtq2-8, reason: not valid java name */
    public static final String m2449getStringNWtq28(int i, Composer composer, int i2) throws Resources.NotFoundException {
        String string;
        composer.startReplaceableGroup(-176762646);
        ComposerKt.sourceInformation(composer, "C(getString)P(0:c#material3.Strings)25@922L7,26@963L7:Strings.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176762646, i2, -1, "androidx.compose.material3.getString (Strings.android.kt:24)");
        }
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Resources resources = ((Context) objConsume).getResources();
        if (Strings.m2435equalsimpl0(i, Strings.INSTANCE.m2446getNavigationMenuadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m2435equalsimpl0(i, Strings.INSTANCE.m2439getCloseDraweradMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.close_drawer);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m2435equalsimpl0(i, Strings.INSTANCE.m2440getCloseSheetadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.close_sheet);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m2435equalsimpl0(i, Strings.INSTANCE.m2441getDefaultErrorMessageadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.default_error_message);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m2435equalsimpl0(i, Strings.INSTANCE.m2443getExposedDropdownMenuadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m2435equalsimpl0(i, Strings.INSTANCE.m2448getSliderRangeStartadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.range_start);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.range_start)");
        } else if (Strings.m2435equalsimpl0(i, Strings.INSTANCE.m2447getSliderRangeEndadMyvUU())) {
            string = resources.getString(androidx.compose.ui.R.string.range_end);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.range_end)");
        } else if (Strings.m2435equalsimpl0(i, Strings.INSTANCE.m2442getDialogadMyvUU())) {
            string = resources.getString(R.string.dialog);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(andr…aterial3.R.string.dialog)");
        } else if (Strings.m2435equalsimpl0(i, Strings.INSTANCE.m2445getMenuExpandedadMyvUU())) {
            string = resources.getString(R.string.expanded);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(andr…erial3.R.string.expanded)");
        } else if (Strings.m2435equalsimpl0(i, Strings.INSTANCE.m2444getMenuCollapsedadMyvUU())) {
            string = resources.getString(R.string.collapsed);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(andr…rial3.R.string.collapsed)");
        } else {
            string = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return string;
    }
}
