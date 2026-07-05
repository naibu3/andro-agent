package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewbinding.R;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ViewKt;
import androidx.viewbinding.ViewBinding;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidViewBinding.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÁ\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u00122\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0016\u001a$\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0011H\u0002\u001a\u001b\u0010\u001b\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001d\u001a#\u0010\u001e\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u001c2\u0006\u0010\u001f\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"AndroidViewBinding", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/viewbinding/ViewBinding;", "factory", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "modifier", "Landroidx/compose/ui/Modifier;", "onReset", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "onRelease", "update", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "forEachFragmentContainerView", "viewGroup", "action", "Landroidx/fragment/app/FragmentContainerView;", "getBinding", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;", "setBinding", "binding", "(Landroid/view/View;Landroidx/viewbinding/ViewBinding;)V", "ui-viewbinding_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidViewBindingKt {
    public static final <T extends ViewBinding> void AndroidViewBinding(final Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, Function1<? super T, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Function1<? super T, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985291610);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AndroidViewBinding)80@4026L129:AndroidViewBinding.kt#z33iqn");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i5 != 0) {
                function1 = new Function1<T, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.1
                    /* JADX WARN: Incorrect types in method signature: (TT;)V */
                    public final void invoke(ViewBinding viewBinding) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                        invoke((ViewBinding) obj);
                        return Unit.INSTANCE;
                    }
                };
            }
            Function1<? super T, Unit> function13 = function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985291610, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:79)");
            }
            AndroidViewBinding(function3, modifier3, null, null, function13, composerStartRestartGroup, (i3 & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT | (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (57344 & (i3 << 6)), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            function12 = function13;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function12 = function1;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    AndroidViewBindingKt.AndroidViewBinding(function3, modifier2, function12, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends ViewBinding> void AndroidViewBinding(final Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12, Function1<? super T, Unit> function13, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super T, Unit> function14;
        int i5;
        Function1<? super T, Unit> function15;
        int i6;
        final Function1<? super T, Unit> function16;
        final Function1<? super T, Unit> function17;
        final AnonymousClass3 anonymousClass3;
        View view;
        boolean zChanged;
        Object objRememberedValue;
        final Fragment fragment;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        boolean z;
        Object objRememberedValue4;
        final Function1<? super T, Unit> function18;
        final Function1<? super T, Unit> function19;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(509101952);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AndroidViewBinding)P(!2,3)157@9039L7,161@9306L226,170@9570L7,172@9613L411,183@10161L1090,204@11270L41,171@9582L1735:AndroidViewBinding.kt#z33iqn");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    function14 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function14) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function15 = function12;
                        i3 |= composerStartRestartGroup.changedInstance(function15) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            function16 = function13;
                            i3 |= composerStartRestartGroup.changedInstance(function16) ? 16384 : 8192;
                        }
                        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            Function1 function110 = null;
                            function17 = i4 == 0 ? null : function14;
                            anonymousClass3 = i5 == 0 ? new Function1<T, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.3
                                /* JADX WARN: Incorrect types in method signature: (TT;)V */
                                public final void invoke(ViewBinding viewBinding) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                                    invoke((ViewBinding) obj);
                                    return Unit.INSTANCE;
                                }
                            } : function15;
                            if (i6 != 0) {
                                function16 = new Function1<T, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.4
                                    /* JADX WARN: Incorrect types in method signature: (TT;)V */
                                    public final void invoke(ViewBinding viewBinding) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                                        invoke((ViewBinding) obj);
                                        return Unit.INSTANCE;
                                    }
                                };
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(509101952, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:156)");
                            }
                            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composerStartRestartGroup.consume(localView);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            view = (View) objConsume;
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 741952546, "CC(remember):AndroidViewBinding.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(view);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                try {
                                    objRememberedValue = ViewKt.findFragment(view);
                                } catch (IllegalStateException unused) {
                                    objRememberedValue = null;
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            fragment = (Fragment) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composerStartRestartGroup.consume(localContext);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            context = (Context) objConsume2;
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 741962555, "CC(remember):AndroidViewBinding.kt#9igjgp");
                            zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(fragment);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function1) new Function1<Context, View>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final View invoke(Context context2) {
                                        LayoutInflater layoutInflaterFrom;
                                        Fragment fragment2 = fragment;
                                        if (fragment2 == null || (layoutInflaterFrom = fragment2.getLayoutInflater()) == null) {
                                            layoutInflaterFrom = LayoutInflater.from(context2);
                                        }
                                        ViewBinding viewBinding = (ViewBinding) function3.invoke(layoutInflaterFrom, new FrameLayout(context2), false);
                                        View root = viewBinding.getRoot();
                                        AndroidViewBindingKt.setBinding(root, viewBinding);
                                        return root;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function111 = (Function1) objRememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            if (function17 == null) {
                                composerStartRestartGroup.startReplaceGroup(1526457001);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "*182@10097L40");
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 688058439, "CC(remember):AndroidViewBinding.kt#9igjgp");
                                boolean zChanged2 = composerStartRestartGroup.changed(function17);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = (Function1) new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$6$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                                            invoke2(view2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(View view2) {
                                            function17.invoke(AndroidViewBindingKt.getBinding(view2));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                function110 = (Function1) objRememberedValue5;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            } else {
                                composerStartRestartGroup.startReplaceGroup(1526457000);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 741980770, "CC(remember):AndroidViewBinding.kt#9igjgp");
                            zChangedInstance2 = ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(fragment) | composerStartRestartGroup.changedInstance(context);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function1) new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$7$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                                        invoke2(view2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(View view2) {
                                        FragmentManager childFragmentManager;
                                        anonymousClass3.invoke(AndroidViewBindingKt.getBinding(view2));
                                        final FragmentManager supportFragmentManager = null;
                                        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                                        if (viewGroup != null) {
                                            Fragment fragment2 = fragment;
                                            Context context2 = context;
                                            if (fragment2 == null || (childFragmentManager = fragment2.getChildFragmentManager()) == null) {
                                                FragmentActivity fragmentActivity = context2 instanceof FragmentActivity ? (FragmentActivity) context2 : null;
                                                if (fragmentActivity != null) {
                                                    supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                                                }
                                            } else {
                                                supportFragmentManager = childFragmentManager;
                                            }
                                            AndroidViewBindingKt.forEachFragmentContainerView(viewGroup, new Function1<FragmentContainerView, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$7$1$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(FragmentContainerView fragmentContainerView) {
                                                    invoke2(fragmentContainerView);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(FragmentContainerView fragmentContainerView) {
                                                    FragmentManager fragmentManager = supportFragmentManager;
                                                    Fragment fragmentFindFragmentById = fragmentManager != null ? fragmentManager.findFragmentById(fragmentContainerView.getId()) : null;
                                                    if (fragmentFindFragmentById == null || supportFragmentManager.isStateSaved()) {
                                                        return;
                                                    }
                                                    FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                                                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
                                                    fragmentTransactionBeginTransaction.remove(fragmentFindFragmentById);
                                                    fragmentTransactionBeginTransaction.commitNow();
                                                }
                                            });
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            Function1 function112 = (Function1) objRememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 742015209, "CC(remember):AndroidViewBinding.kt#9igjgp");
                            z = (57344 & i3) == 16384;
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = (Function1) new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$8$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                                        invoke2(view2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(View view2) {
                                        function16.invoke(AndroidViewBindingKt.getBinding(view2));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            Function1 function113 = function110;
                            Function1<? super T, Unit> function114 = function17;
                            Function1<? super T, Unit> function115 = anonymousClass3;
                            Modifier modifier4 = companion;
                            AndroidView_androidKt.AndroidView(function111, modifier4, function113, function112, (Function1) objRememberedValue4, composerStartRestartGroup, i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function18 = function115;
                            function19 = function114;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function19 = function14;
                            function18 = function15;
                        }
                        final Function1<? super T, Unit> function116 = function16;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding.9
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i8) {
                                    AndroidViewBindingKt.AndroidViewBinding(function3, modifier3, function19, function18, function116, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    function16 = function13;
                    if ((i3 & 9363) != 9362) {
                        if (i7 == 0) {
                        }
                        Function1 function1102 = null;
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume3 = composerStartRestartGroup.consume(localView2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        view = (View) objConsume3;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 741952546, "CC(remember):AndroidViewBinding.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(view);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = ViewKt.findFragment(view);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            fragment = (Fragment) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume22 = composerStartRestartGroup.consume(localContext2);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            context = (Context) objConsume22;
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 741962555, "CC(remember):AndroidViewBinding.kt#9igjgp");
                            zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(fragment);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue2 = (Function1) new Function1<Context, View>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final View invoke(Context context2) {
                                        LayoutInflater layoutInflaterFrom;
                                        Fragment fragment2 = fragment;
                                        if (fragment2 == null || (layoutInflaterFrom = fragment2.getLayoutInflater()) == null) {
                                            layoutInflaterFrom = LayoutInflater.from(context2);
                                        }
                                        ViewBinding viewBinding = (ViewBinding) function3.invoke(layoutInflaterFrom, new FrameLayout(context2), false);
                                        View root = viewBinding.getRoot();
                                        AndroidViewBindingKt.setBinding(root, viewBinding);
                                        return root;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                Function1 function1112 = (Function1) objRememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                if (function17 == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 741980770, "CC(remember):AndroidViewBinding.kt#9igjgp");
                                zChangedInstance2 = ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(fragment) | composerStartRestartGroup.changedInstance(context);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance2) {
                                    objRememberedValue3 = (Function1) new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$7$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                                            invoke2(view2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(View view2) {
                                            FragmentManager childFragmentManager;
                                            anonymousClass3.invoke(AndroidViewBindingKt.getBinding(view2));
                                            final FragmentManager supportFragmentManager = null;
                                            ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                                            if (viewGroup != null) {
                                                Fragment fragment2 = fragment;
                                                Context context2 = context;
                                                if (fragment2 == null || (childFragmentManager = fragment2.getChildFragmentManager()) == null) {
                                                    FragmentActivity fragmentActivity = context2 instanceof FragmentActivity ? (FragmentActivity) context2 : null;
                                                    if (fragmentActivity != null) {
                                                        supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                                                    }
                                                } else {
                                                    supportFragmentManager = childFragmentManager;
                                                }
                                                AndroidViewBindingKt.forEachFragmentContainerView(viewGroup, new Function1<FragmentContainerView, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$7$1$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(FragmentContainerView fragmentContainerView) {
                                                        invoke2(fragmentContainerView);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(FragmentContainerView fragmentContainerView) {
                                                        FragmentManager fragmentManager = supportFragmentManager;
                                                        Fragment fragmentFindFragmentById = fragmentManager != null ? fragmentManager.findFragmentById(fragmentContainerView.getId()) : null;
                                                        if (fragmentFindFragmentById == null || supportFragmentManager.isStateSaved()) {
                                                            return;
                                                        }
                                                        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                                                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
                                                        fragmentTransactionBeginTransaction.remove(fragmentFindFragmentById);
                                                        fragmentTransactionBeginTransaction.commitNow();
                                                    }
                                                });
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    Function1 function1122 = (Function1) objRememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 742015209, "CC(remember):AndroidViewBinding.kt#9igjgp");
                                    if ((57344 & i3) == 16384) {
                                    }
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!z) {
                                        objRememberedValue4 = (Function1) new Function1<View, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$8$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                                                invoke2(view2);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(View view2) {
                                                function16.invoke(AndroidViewBindingKt.getBinding(view2));
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        Function1 function1132 = function1102;
                                        Function1<? super T, Unit> function1142 = function17;
                                        Function1<? super T, Unit> function1152 = anonymousClass3;
                                        Modifier modifier42 = companion;
                                        AndroidView_androidKt.AndroidView(function1112, modifier42, function1132, function1122, (Function1) objRememberedValue4, composerStartRestartGroup, i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        function18 = function1152;
                                        function19 = function1142;
                                        modifier3 = modifier42;
                                    }
                                }
                            }
                        }
                    }
                    final Function1<? super T, Unit> function1162 = function16;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function15 = function12;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                function16 = function13;
                if ((i3 & 9363) != 9362) {
                }
                final Function1<? super T, Unit> function11622 = function16;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function14 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function15 = function12;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function16 = function13;
            if ((i3 & 9363) != 9362) {
            }
            final Function1<? super T, Unit> function116222 = function16;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function14 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function15 = function12;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function16 = function13;
        if ((i3 & 9363) != 9362) {
        }
        final Function1<? super T, Unit> function1162222 = function16;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> void setBinding(View view, T t) {
        view.setTag(R.id.binding_reference, t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends ViewBinding> T getBinding(View view) {
        Object tag = view.getTag(R.id.binding_reference);
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (T) tag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forEachFragmentContainerView(ViewGroup viewGroup, Function1<? super FragmentContainerView, Unit> function1) {
        if (viewGroup instanceof FragmentContainerView) {
            function1.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(index)");
            if (childAt instanceof ViewGroup) {
                forEachFragmentContainerView((ViewGroup) childAt, function1);
            }
        }
    }
}
