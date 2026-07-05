package com.stripe.android.uicore.elements;

import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SectionElementUI.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002"}, d2 = {"SectionElementUI", "", ViewProps.ENABLED, "", "element", "Lcom/stripe/android/uicore/elements/SectionElement;", "hiddenIdentifiers", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "lastTextFieldIdentifier", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLcom/stripe/android/uicore/elements/SectionElement;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "stripe-ui-core_release", "error", "Lcom/stripe/android/uicore/elements/FieldError;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SectionElementUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SectionElementUI$lambda$3(boolean z, SectionElement sectionElement, Set set, IdentifierSpec identifierSpec, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SectionElementUI(z, sectionElement, set, identifierSpec, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SectionElementUI(final boolean z, final SectionElement element, final Set<IdentifierSpec> hiddenIdentifiers, final IdentifierSpec identifierSpec, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        Composer composerStartRestartGroup = composer.startRestartGroup(-431908523);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(element) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(hiddenIdentifiers) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(identifierSpec) : composerStartRestartGroup.changedInstance(identifierSpec) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-431908523, i3, -1, "com.stripe.android.uicore.elements.SectionElementUI (SectionElementUI.kt:24)");
                }
                if (!hiddenIdentifiers.contains(element.getIdentifier())) {
                    SectionController controller = element.getController();
                    FieldError fieldErrorSectionElementUI$lambda$0 = SectionElementUI$lambda$0(StateFlowsComposeKt.collectAsState(controller.getError(), null, composerStartRestartGroup, 0, 1));
                    composerStartRestartGroup.startReplaceGroup(-389242988);
                    if (fieldErrorSectionElementUI$lambda$0 != null) {
                        Object[] formatArgs = fieldErrorSectionElementUI$lambda$0.getFormatArgs();
                        composerStartRestartGroup.startReplaceGroup(-389242010);
                        strStringResource = formatArgs != null ? StringResources_androidKt.stringResource(fieldErrorSectionElementUI$lambda$0.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), composerStartRestartGroup, 0) : null;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-389242440);
                        if (strStringResource == null) {
                            strStringResource = StringResources_androidKt.stringResource(fieldErrorSectionElementUI$lambda$0.getErrorMessage(), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    String str = strStringResource;
                    composerStartRestartGroup.endReplaceGroup();
                    SectionUIKt.Section(controller.getLabel(), str, modifier4, false, ComposableLambdaKt.rememberComposableLambda(1957561252, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.SectionElementUIKt.SectionElementUI.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1957561252, i5, -1, "com.stripe.android.uicore.elements.SectionElementUI.<anonymous> (SectionElementUI.kt:43)");
                                }
                                List<SectionFieldElement> fields = element.getFields();
                                boolean z2 = z;
                                Set<IdentifierSpec> set = hiddenIdentifiers;
                                IdentifierSpec identifierSpec2 = identifierSpec;
                                SectionElement sectionElement = element;
                                int i6 = 0;
                                for (Object obj : fields) {
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    SectionFieldElementUIKt.SectionFieldElementUI(z2, (SectionFieldElement) obj, null, set, identifierSpec2, composer2, 0, 4);
                                    boolean z3 = z2;
                                    Set<IdentifierSpec> set2 = set;
                                    IdentifierSpec identifierSpec3 = identifierSpec2;
                                    composer2.startReplaceGroup(1380654504);
                                    if (i6 != CollectionsKt.getLastIndex(sectionElement.getFields())) {
                                        DividerKt.m1877DivideroMI9zvI(null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8727getComponentDivider0d7_KjU(), Dp.m6117constructorimpl(StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).getBorderStrokeWidth()), 0.0f, composer2, 0, 9);
                                    }
                                    composer2.endReplaceGroup();
                                    i6 = i7;
                                    z2 = z3;
                                    set = set2;
                                    identifierSpec2 = identifierSpec3;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 896) | 24576, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.SectionElementUIKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SectionElementUIKt.SectionElementUI$lambda$3(z, element, hiddenIdentifiers, identifierSpec, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!hiddenIdentifiers.contains(element.getIdentifier())) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final FieldError SectionElementUI$lambda$0(State<FieldError> state) {
        return state.getValue();
    }
}
