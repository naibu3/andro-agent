package com.stripe.android.paymentsheet.addresselement;

import android.app.Application;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: AddressLauncher.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberAddressLauncher", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;", "callback", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;", "(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressLauncherKt {
    public static final AddressLauncher rememberAddressLauncher(AddressLauncherResultCallback callback, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        composer.startReplaceGroup(857915885);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(857915885, i, -1, "com.stripe.android.paymentsheet.addresselement.rememberAddressLauncher (AddressLauncher.kt:245)");
        }
        AddressElementActivityContract addressElementActivityContract = AddressElementActivityContract.INSTANCE;
        composer.startReplaceGroup(557007748);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changedInstance(callback)) || (i & 6) == 4;
        AddressLauncherKt$rememberAddressLauncher$activityResultLauncher$1$1 addressLauncherKt$rememberAddressLauncher$activityResultLauncher$1$1RememberedValue = composer.rememberedValue();
        if (z || addressLauncherKt$rememberAddressLauncher$activityResultLauncher$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            addressLauncherKt$rememberAddressLauncher$activityResultLauncher$1$1RememberedValue = new AddressLauncherKt$rememberAddressLauncher$activityResultLauncher$1$1(callback);
            composer.updateRememberedValue(addressLauncherKt$rememberAddressLauncher$activityResultLauncher$1$1RememberedValue);
        }
        composer.endReplaceGroup();
        ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(addressElementActivityContract, (Function1) ((KFunction) addressLauncherKt$rememberAddressLauncher$activityResultLauncher$1$1RememberedValue), composer, 6);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        composer.startReplaceGroup(557010840);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            objRememberedValue = new AddressLauncher((Application) applicationContext, managedActivityResultLauncherRememberLauncherForActivityResult);
            composer.updateRememberedValue(objRememberedValue);
        }
        AddressLauncher addressLauncher = (AddressLauncher) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return addressLauncher;
    }
}
