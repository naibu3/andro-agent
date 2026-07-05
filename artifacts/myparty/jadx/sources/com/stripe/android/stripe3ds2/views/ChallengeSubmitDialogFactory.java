package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeSubmitDialogBinding;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.Factory0;
import com.stripe.android.stripe3ds2.views.ChallengeSubmitDialogFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeSubmitDialogFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "Lcom/stripe/android/stripe3ds2/utils/Factory0;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "create", "ChallengeSubmitDialog", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeSubmitDialogFactory implements Factory0<Dialog> {
    private final Context context;
    private final UiCustomization uiCustomization;

    public ChallengeSubmitDialogFactory(Context context, UiCustomization uiCustomization) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        this.context = context;
        this.uiCustomization = uiCustomization;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.stripe3ds2.utils.Factory0
    public Dialog create() {
        return new ChallengeSubmitDialog(this.context, this.uiCustomization);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChallengeSubmitDialogFactory.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory$ChallengeSubmitDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "getViewBinding", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeSubmitDialogBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "onStart", "", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ChallengeSubmitDialog extends Dialog {
        private final UiCustomization uiCustomization;

        /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
        private final Lazy viewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeSubmitDialog(Context context, UiCustomization uiCustomization) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            this.uiCustomization = uiCustomization;
            this.viewBinding = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeSubmitDialogFactory$ChallengeSubmitDialog$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChallengeSubmitDialogFactory.ChallengeSubmitDialog.viewBinding_delegate$lambda$0(this.f$0);
                }
            });
            setCancelable(false);
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        private final StripeChallengeSubmitDialogBinding getViewBinding() {
            return (StripeChallengeSubmitDialogBinding) this.viewBinding.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StripeChallengeSubmitDialogBinding viewBinding_delegate$lambda$0(ChallengeSubmitDialog challengeSubmitDialog) {
            StripeChallengeSubmitDialogBinding stripeChallengeSubmitDialogBindingInflate = StripeChallengeSubmitDialogBinding.inflate(challengeSubmitDialog.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(stripeChallengeSubmitDialogBindingInflate, "inflate(...)");
            return stripeChallengeSubmitDialogBindingInflate;
        }

        @Override // android.app.Dialog
        protected void onStart() {
            super.onStart();
            setContentView(getViewBinding().getRoot());
            CustomizeUtils customizeUtils = CustomizeUtils.INSTANCE;
            CircularProgressIndicator progressBar = getViewBinding().progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            customizeUtils.applyProgressBarColor$3ds2sdk_release(progressBar, this.uiCustomization);
        }
    }
}
