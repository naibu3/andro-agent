package com.stripe.android.paymentelement.embedded.form;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentelement.embedded.form.FormActivity;
import com.stripe.android.paymentelement.embedded.form.FormActivityStateHelper;
import com.stripe.android.paymentelement.embedded.form.FormActivityViewModel;
import com.stripe.android.paymentelement.embedded.form.FormContract;
import com.stripe.android.paymentelement.embedded.form.FormResult;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.utils.EdgeToEdgeKt;
import com.stripe.android.paymentsheet.verticalmode.DefaultVerticalModeFormInteractor;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import com.stripe.android.uicore.utils.AnimationConstantsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;

/* compiled from: FormActivity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00061²\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", CardScanActivity.ARGS, "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;", "getArgs", "()Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;", "args$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;", "getViewModel", "()Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModel;", "viewModel$delegate", "formInteractor", "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;", "getFormInteractor", "()Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;", "setFormInteractor", "(Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;)V", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "getEventReporter", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "setEventReporter", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "formActivityStateHelper", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;", "getFormActivityStateHelper", "()Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;", "setFormActivityStateHelper", "(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;)V", "confirmationHelper", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;", "getConfirmationHelper", "()Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;", "setConfirmationHelper", "(Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setCompletedResultAndDismiss", "setCancelAndFinish", "finish", "setFormResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentelement/embedded/form/FormResult;", "paymentsheet_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FormActivity.args_delegate$lambda$0(this.f$0);
        }
    });

    @Inject
    public FormActivityConfirmationHelper confirmationHelper;

    @Inject
    public EventReporter eventReporter;

    @Inject
    public FormActivityStateHelper formActivityStateHelper;

    @Inject
    public DefaultVerticalModeFormInteractor formInteractor;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public FormActivity() {
        final FormActivity formActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FormActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return formActivity.getViewModelStore();
            }
        }, new Function0() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FormActivity.viewModel_delegate$lambda$2(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? formActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final FormContract.Args getArgs() {
        return (FormContract.Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormContract.Args args_delegate$lambda$0(FormActivity formActivity) {
        FormContract.Args.Companion companion = FormContract.Args.INSTANCE;
        Intent intent = formActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.fromIntent(intent);
    }

    private final FormActivityViewModel getViewModel() {
        return (FormActivityViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$2(final FormActivity formActivity) {
        return new FormActivityViewModel.Factory(new Function0() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FormActivity.viewModel_delegate$lambda$2$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormContract.Args viewModel_delegate$lambda$2$lambda$1(FormActivity formActivity) {
        FormContract.Args args = formActivity.getArgs();
        if (args != null) {
            return args;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final DefaultVerticalModeFormInteractor getFormInteractor() {
        DefaultVerticalModeFormInteractor defaultVerticalModeFormInteractor = this.formInteractor;
        if (defaultVerticalModeFormInteractor != null) {
            return defaultVerticalModeFormInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formInteractor");
        return null;
    }

    public final void setFormInteractor(DefaultVerticalModeFormInteractor defaultVerticalModeFormInteractor) {
        Intrinsics.checkNotNullParameter(defaultVerticalModeFormInteractor, "<set-?>");
        this.formInteractor = defaultVerticalModeFormInteractor;
    }

    public final EventReporter getEventReporter() {
        EventReporter eventReporter = this.eventReporter;
        if (eventReporter != null) {
            return eventReporter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventReporter");
        return null;
    }

    public final void setEventReporter(EventReporter eventReporter) {
        Intrinsics.checkNotNullParameter(eventReporter, "<set-?>");
        this.eventReporter = eventReporter;
    }

    public final FormActivityStateHelper getFormActivityStateHelper() {
        FormActivityStateHelper formActivityStateHelper = this.formActivityStateHelper;
        if (formActivityStateHelper != null) {
            return formActivityStateHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formActivityStateHelper");
        return null;
    }

    public final void setFormActivityStateHelper(FormActivityStateHelper formActivityStateHelper) {
        Intrinsics.checkNotNullParameter(formActivityStateHelper, "<set-?>");
        this.formActivityStateHelper = formActivityStateHelper;
    }

    public final FormActivityConfirmationHelper getConfirmationHelper() {
        FormActivityConfirmationHelper formActivityConfirmationHelper = this.confirmationHelper;
        if (formActivityConfirmationHelper != null) {
            return formActivityConfirmationHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("confirmationHelper");
        return null;
    }

    public final void setConfirmationHelper(FormActivityConfirmationHelper formActivityConfirmationHelper) {
        Intrinsics.checkNotNullParameter(formActivityConfirmationHelper, "<set-?>");
        this.confirmationHelper = formActivityConfirmationHelper;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArgs() == null) {
            setCancelAndFinish();
            return;
        }
        EdgeToEdgeKt.renderEdgeToEdge(this);
        getViewModel().getComponent().getSubcomponentFactory().build(this, this).inject(this);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(134179455, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivity.onCreate.1

            /* compiled from: FormActivity.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.paymentelement.embedded.form.FormActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01931 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ FormActivity this$0;

                C01931(FormActivity formActivity) {
                    this.this$0 = formActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1031122795, i, -1, "com.stripe.android.paymentelement.embedded.form.FormActivity.onCreate.<anonymous>.<anonymous> (FormActivity.kt:60)");
                        }
                        final State stateCollectAsState = StateFlowsComposeKt.collectAsState(this.this$0.getFormActivityStateHelper().getState(), null, composer, 0, 1);
                        composer.startReplaceGroup(1604244160);
                        boolean zChanged = composer.changed(stateCollectAsState);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivity$onCreate$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(FormActivity.AnonymousClass1.C01931.invoke$lambda$2$lambda$1(stateCollectAsState, (ModalBottomSheetValue) obj));
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, (Function1) objRememberedValue, composer, 0, 1);
                        Object obj = this.this$0;
                        composer.startReplaceGroup(1604249437);
                        boolean zChangedInstance = composer.changedInstance(obj);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (KFunction) new FormActivity$onCreate$1$1$1$1(obj);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetStateRememberStripeBottomSheetState, null, 0.0f, (Function0) ((KFunction) objRememberedValue2), ComposableLambdaKt.rememberComposableLambda(-1710455827, true, new AnonymousClass2(this.this$0, stateCollectAsState), composer, 54), composer, StripeBottomSheetState.$stable | 24576, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean invoke$lambda$2$lambda$1(State state, ModalBottomSheetValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return !invoke$lambda$0(state).isProcessing();
                }

                /* compiled from: FormActivity.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.paymentelement.embedded.form.FormActivity$onCreate$1$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ State<FormActivityStateHelper.State> $state$delegate;
                    final /* synthetic */ FormActivity this$0;

                    AnonymousClass2(FormActivity formActivity, State<FormActivityStateHelper.State> state) {
                        this.this$0 = formActivity;
                        this.$state$delegate = state;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1710455827, i, -1, "com.stripe.android.paymentelement.embedded.form.FormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FormActivity.kt:68)");
                        }
                        DefaultVerticalModeFormInteractor formInteractor = this.this$0.getFormInteractor();
                        EventReporter eventReporter = this.this$0.getEventReporter();
                        FormActivity formActivity = this.this$0;
                        composer.startReplaceGroup(1926885308);
                        boolean zChangedInstance = composer.changedInstance(formActivity);
                        FormActivity$onCreate$1$1$2$1$1 formActivity$onCreate$1$1$2$1$1RememberedValue = composer.rememberedValue();
                        if (zChangedInstance || formActivity$onCreate$1$1$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            formActivity$onCreate$1$1$2$1$1RememberedValue = new FormActivity$onCreate$1$1$2$1$1(formActivity);
                            composer.updateRememberedValue(formActivity$onCreate$1$1$2$1$1RememberedValue);
                        }
                        KFunction kFunction = (KFunction) formActivity$onCreate$1$1$2$1$1RememberedValue;
                        composer.endReplaceGroup();
                        FormActivity formActivity2 = this.this$0;
                        composer.startReplaceGroup(1926895494);
                        boolean zChangedInstance2 = composer.changedInstance(formActivity2);
                        FormActivity$onCreate$1$1$2$2$1 formActivity$onCreate$1$1$2$2$1RememberedValue = composer.rememberedValue();
                        if (zChangedInstance2 || formActivity$onCreate$1$1$2$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            formActivity$onCreate$1$1$2$2$1RememberedValue = new FormActivity$onCreate$1$1$2$2$1(formActivity2);
                            composer.updateRememberedValue(formActivity$onCreate$1$1$2$2$1RememberedValue);
                        }
                        KFunction kFunction2 = (KFunction) formActivity$onCreate$1$1$2$2$1RememberedValue;
                        composer.endReplaceGroup();
                        FormActivityStateHelper.State stateInvoke$lambda$0 = C01931.invoke$lambda$0(this.$state$delegate);
                        composer.startReplaceGroup(1926887292);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final FormActivity formActivity3 = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.stripe.android.paymentelement.embedded.form.FormActivity$onCreate$1$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FormActivity.AnonymousClass1.C01931.AnonymousClass2.invoke$lambda$4$lambda$3(formActivity3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        FormActivityUIKt.FormActivityUI(formInteractor, eventReporter, (Function0) objRememberedValue, (Function0) kFunction2, stateInvoke$lambda$0, (Function0) kFunction, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(FormActivity formActivity) {
                        FormResult formResultConfirm = formActivity.getConfirmationHelper().confirm();
                        if (formResultConfirm != null) {
                            formActivity.setFormResult(formResultConfirm);
                            formActivity.finish();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final FormActivityStateHelper.State invoke$lambda$0(State<FormActivityStateHelper.State> state) {
                    return state.getValue();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(134179455, i, -1, "com.stripe.android.paymentelement.embedded.form.FormActivity.onCreate.<anonymous> (FormActivity.kt:59)");
                    }
                    StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1031122795, true, new C01931(FormActivity.this), composer, 54), composer, 12582912, 127);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCompletedResultAndDismiss() {
        setFormResult(new FormResult.Complete(null, true));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCancelAndFinish() {
        setFormResult(FormResult.Cancelled.INSTANCE);
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFormResult(FormResult result) {
        FormResult.Companion companion = FormResult.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        setResult(-1, companion.toIntent(intent, result));
    }
}
