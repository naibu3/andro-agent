package com.stripe.android.financialconnections.ui.components;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.financialconnections.ui.components.MultipleEventsCutter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultipleEventsCutter.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001aA\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0002\b\u000e\u001aS\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0002\b\u0013¨\u0006\u0014"}, d2 = {"get", "Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;", "Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter$Companion;", "clickableSingle", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "onClickLabel", "", ViewProps.ROLE, "Landroidx/compose/ui/semantics/Role;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "", "clickableSingle-XHw0xAI", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "clickableSingle-O2vRcR0", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultipleEventsCutterKt {
    public static final MultipleEventsCutter get(MultipleEventsCutter.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new MultipleEventsCutterImpl();
    }

    /* renamed from: clickableSingle-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7582clickableSingleXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return m7581clickableSingleXHw0xAI(modifier, z, str, role, function0);
    }

    /* renamed from: clickableSingle-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7580clickableSingleO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m7579clickableSingleO2vRcR0(modifier, mutableInteractionSource, indication, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : role, function0);
    }

    /* renamed from: clickableSingle-XHw0xAI, reason: not valid java name */
    public static final Modifier m7581clickableSingleXHw0xAI(Modifier clickableSingle, final boolean z, final String str, final Role role, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickableSingle, "$this$clickableSingle");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickableSingle, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.MultipleEventsCutterKt$clickableSingle-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set(ViewProps.ENABLED, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set(ViewProps.ROLE, role);
                inspectorInfo.getProperties().set(ViewProps.ON_CLICK, onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new MultipleEventsCutterKt$clickableSingle$2(z, str, role, onClick));
    }

    /* renamed from: clickableSingle-O2vRcR0, reason: not valid java name */
    public static final Modifier m7579clickableSingleO2vRcR0(Modifier clickableSingle, MutableInteractionSource interactionSource, Indication indication, final boolean z, final String str, final Role role, final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickableSingle, "$this$clickableSingle");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickableSingle, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.MultipleEventsCutterKt$clickableSingle-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set(ViewProps.ENABLED, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set(ViewProps.ROLE, role);
                inspectorInfo.getProperties().set(ViewProps.ON_CLICK, onClick);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new MultipleEventsCutterKt$clickableSingle$4(interactionSource, indication, z, str, role, onClick));
    }
}
