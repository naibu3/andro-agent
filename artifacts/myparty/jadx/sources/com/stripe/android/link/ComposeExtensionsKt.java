package com.stripe.android.link;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.uicore.utils.ActivityExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ComposeExtensions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"linkViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "factory", "Lkotlin/Function1;", "Lcom/stripe/android/link/injection/NativeLinkComponent;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModel;", "parentActivity", "Lcom/stripe/android/link/LinkActivity;", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/LinkActivity;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposeExtensionsKt {
    public static final /* synthetic */ <T extends ViewModel> T linkViewModel(Function1<? super NativeLinkComponent, ? extends ViewModelProvider.Factory> factory, Composer composer, int i) {
        NativeLinkComponent activityRetainedComponent;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(factory, "factory");
        composer.startReplaceGroup(2047965416);
        LinkActivityViewModel viewModel = parentActivity(composer, 0).getViewModel();
        if (viewModel == null || (activityRetainedComponent = viewModel.getActivityRetainedComponent()) == null) {
            throw new IllegalStateException("no viewmodel in parent activity");
        }
        ViewModelProvider.Factory factoryInvoke = factory.invoke(activityRetainedComponent);
        composer.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(composer, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t = (T) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), current, (String) null, factoryInvoke, defaultViewModelCreationExtras, composer, 0, 0);
        composer.endReplaceableGroup();
        composer.endReplaceGroup();
        return t;
    }

    public static final LinkActivity parentActivity(Composer composer, int i) {
        composer.startReplaceGroup(994393249);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(994393249, i, -1, "com.stripe.android.link.parentActivity (ComposeExtensions.kt:27)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComponentActivity componentActivityExtractActivity = ActivityExtensionsKt.extractActivity((Context) objConsume);
        Intrinsics.checkNotNull(componentActivityExtractActivity, "null cannot be cast to non-null type com.stripe.android.link.LinkActivity");
        LinkActivity linkActivity = (LinkActivity) componentActivityExtractActivity;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return linkActivity;
    }
}
