package com.stripe.android.financialconnections.ui.theme;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsSizeKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.ui.components.ScaffoldKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Layout.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$LayoutKt {
    public static final ComposableSingletons$LayoutKt INSTANCE = new ComposableSingletons$LayoutKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f145lambda1 = ComposableLambdaKt.composableLambdaInstance(-993674401, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-993674401, i, -1, "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.lambda-1.<anonymous> (Layout.kt:139)");
            }
            SpacerKt.Spacer(WindowInsetsSizeKt.windowInsetsBottomHeight(Modifier.INSTANCE, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 6)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f146lambda2 = ComposableLambdaKt.composableLambdaInstance(-1277661102, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope FinancialConnectionsButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1277661102, i, -1, "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.lambda-2.<anonymous> (Layout.kt:271)");
            }
            TextKt.m2076Text4IGK_g("Button 1", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f147lambda3 = ComposableLambdaKt.composableLambdaInstance(1030431689, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope FinancialConnectionsButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1030431689, i, -1, "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.lambda-3.<anonymous> (Layout.kt:278)");
            }
            TextKt.m2076Text4IGK_g("Button 1", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f148lambda4 = ComposableLambdaKt.composableLambdaInstance(1017990275, false, ComposableSingletons$LayoutKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f149lambda5 = ComposableLambdaKt.composableLambdaInstance(-1156338151, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1156338151, i, -1, "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.lambda-5.<anonymous> (Layout.kt:252)");
                }
                TextKt.m2076Text4IGK_g("Title", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getHeadingXLarge(), composer, 6, 0, 65534);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f150lambda6 = ComposableLambdaKt.composableLambdaInstance(1947598019, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1947598019, i, -1, "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.lambda-6.<anonymous> (Layout.kt:236)");
                }
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer, 0, 3);
                ScaffoldKt.FinancialConnectionsScaffold(ComposableLambdaKt.rememberComposableLambda(-1890225868, true, new AnonymousClass1(lazyListStateRememberLazyListState), composer, 54), ComposableLambdaKt.rememberComposableLambda(51929328, true, new AnonymousClass2(lazyListStateRememberLazyListState), composer, 54), composer, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* compiled from: Layout.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ LazyListState $state;

            AnonymousClass1(LazyListState lazyListState) {
                this.$state = lazyListState;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1890225868, i, -1, "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.lambda-6.<anonymous>.<anonymous> (Layout.kt:239)");
                    }
                    TopAppBarState topAppBarState = new TopAppBarState(false, false, false, null, false, false, this.$state.getCanScrollBackward(), null, false, 446, null);
                    composer.startReplaceGroup(750949004);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: CONSTRUCTOR (r2v7 'objRememberedValue' java.lang.Object) =  A[MD:():void (m)] (LINE:291) call: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$1$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR in method: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes5.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                            	at jadx.core.codegen.InsnGen.staticField(InsnGen.java:225)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:492)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
                            	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:547)
                            	at jadx.core.codegen.ClassGen.addField(ClassGen.java:453)
                            	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:285)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 80 more
                            */
                        /*
                            this = this;
                            r0 = r18
                            r1 = r19
                            r2 = r1 & 3
                            r3 = 2
                            if (r2 != r3) goto L14
                            boolean r2 = r0.getSkipping()
                            if (r2 != 0) goto L10
                            goto L14
                        L10:
                            r0.skipToGroupEnd()
                            return
                        L14:
                            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r2 == 0) goto L23
                            r2 = -1
                            java.lang.String r3 = "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.lambda-6.<anonymous>.<anonymous> (Layout.kt:239)"
                            r4 = -1890225868(0xffffffff8f557134, float:-1.0523513E-29)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                        L23:
                            com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState r5 = new com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState
                            r1 = r17
                            androidx.compose.foundation.lazy.LazyListState r2 = r1.$state
                            boolean r12 = r2.getCanScrollBackward()
                            r15 = 446(0x1be, float:6.25E-43)
                            r16 = 0
                            r6 = 0
                            r7 = 0
                            r8 = 0
                            r9 = 0
                            r10 = 0
                            r11 = 0
                            r13 = 0
                            r14 = 0
                            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                            r2 = 750949004(0x2cc2928c, float:5.5300816E-12)
                            r0.startReplaceGroup(r2)
                            java.lang.Object r2 = r0.rememberedValue()
                            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r3 = r3.getEmpty()
                            if (r2 != r3) goto L56
                            com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$1$$ExternalSyntheticLambda0 r2 = new com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$1$$ExternalSyntheticLambda0
                            r2.<init>()
                            r0.updateRememberedValue(r2)
                        L56:
                            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                            r0.endReplaceGroup()
                            r3 = 48
                            com.stripe.android.financialconnections.ui.components.TopAppBarKt.FinancialConnectionsTopAppBar(r5, r2, r0, r3)
                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r0 == 0) goto L69
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        L69:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda6$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                    }
                }

                /* compiled from: Layout.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ LazyListState $state;

                    AnonymousClass2(LazyListState lazyListState) {
                        this.$state = lazyListState;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues it, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i & 17) != 16 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(51929328, i, -1, "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.lambda-6.<anonymous>.<anonymous> (Layout.kt:248)");
                            }
                            LazyListState lazyListState = this.$state;
                            Function2<Composer, Integer, Unit> function2M7603getLambda4$financial_connections_release = ComposableSingletons$LayoutKt.INSTANCE.m7603getLambda4$financial_connections_release();
                            composer.startReplaceGroup(750954535);
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0044: CONSTRUCTOR (r0v7 'objRememberedValue' java.lang.Object) =  A[MD:():void (m)] (LINE:291) call: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$2$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR in method: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1.2.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void, file: classes5.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                    	at jadx.core.codegen.InsnGen.staticField(InsnGen.java:225)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:492)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
                                    	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:547)
                                    	at jadx.core.codegen.ClassGen.addField(ClassGen.java:453)
                                    	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:420)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:285)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                    	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
                                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 80 more
                                    */
                                /*
                                    this = this;
                                    r10 = r15
                                    r0 = r16
                                    java.lang.String r1 = "it"
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
                                    r1 = r0 & 17
                                    r2 = 16
                                    if (r1 != r2) goto L19
                                    boolean r1 = r15.getSkipping()
                                    if (r1 != 0) goto L15
                                    goto L19
                                L15:
                                    r15.skipToGroupEnd()
                                    return
                                L19:
                                    boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r1 == 0) goto L28
                                    r1 = -1
                                    java.lang.String r2 = "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.lambda-6.<anonymous>.<anonymous> (Layout.kt:248)"
                                    r3 = 51929328(0x31860f0, float:4.4780064E-37)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r3, r0, r1, r2)
                                L28:
                                    androidx.compose.foundation.lazy.LazyListState r7 = r13.$state
                                    com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt r0 = com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.INSTANCE
                                    kotlin.jvm.functions.Function2 r8 = r0.m7603getLambda4$financial_connections_release()
                                    r0 = 750954535(0x2cc2a827, float:5.5324803E-12)
                                    r15.startReplaceGroup(r0)
                                    java.lang.Object r0 = r15.rememberedValue()
                                    androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r1 = r1.getEmpty()
                                    if (r0 != r1) goto L4a
                                    com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$2$$ExternalSyntheticLambda0 r0 = new com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$2$$ExternalSyntheticLambda0
                                    r0.<init>()
                                    r15.updateRememberedValue(r0)
                                L4a:
                                    r9 = r0
                                    kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                                    r15.endReplaceGroup()
                                    r11 = 905969664(0x36000000, float:1.9073486E-6)
                                    r12 = 127(0x7f, float:1.78E-43)
                                    r0 = 0
                                    r1 = 0
                                    r2 = 0
                                    r3 = 0
                                    r4 = 0
                                    r5 = 0
                                    r6 = 0
                                    com.stripe.android.financialconnections.ui.theme.LayoutKt.LazyLayout(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r0 == 0) goto L67
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                L67:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda6$1.AnonymousClass2.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(LazyListScope LazyLayout) {
                                Intrinsics.checkNotNullParameter(LazyLayout, "$this$LazyLayout");
                                LazyListScope.item$default(LazyLayout, null, null, ComposableSingletons$LayoutKt.INSTANCE.m7604getLambda5$financial_connections_release(), 3, null);
                                for (final int i = 1; i < 51; i++) {
                                    LazyListScope.item$default(LazyLayout, null, null, ComposableLambdaKt.composableLambdaInstance(55034555, true, 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002d: INVOKE 
                                          (r13v0 'LazyLayout' androidx.compose.foundation.lazy.LazyListScope)
                                          (null java.lang.Object)
                                          (null java.lang.Object)
                                          (wrap:androidx.compose.runtime.internal.ComposableLambda:0x0021: INVOKE 
                                          (55034555 int)
                                          true
                                          (wrap:kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x001b: CONSTRUCTOR (r0v3 'i' int A[DONT_INLINE]) A[MD:(int):void (m), WRAPPED] (LINE:259) call: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$2$1$1$1.<init>(int):void type: CONSTRUCTOR)
                                         STATIC call: androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda A[MD:(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda (m), WRAPPED] (LINE:259))
                                          (3 int)
                                          (null java.lang.Object)
                                         STATIC call: androidx.compose.foundation.lazy.LazyListScope.item$default(androidx.compose.foundation.lazy.LazyListScope, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function3, int, java.lang.Object):void A[MD:(androidx.compose.foundation.lazy.LazyListScope, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function3, int, java.lang.Object):void (m)] (LINE:259) in method: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1.2.invoke$lambda$1$lambda$0(androidx.compose.foundation.lazy.LazyListScope):kotlin.Unit, file: classes5.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                        	at jadx.core.codegen.InsnGen.staticField(InsnGen.java:225)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:492)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
                                        	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:547)
                                        	at jadx.core.codegen.ClassGen.addField(ClassGen.java:453)
                                        	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:420)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:285)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
                                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$2$1$1$1, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 72 more
                                        */
                                    /*
                                        java.lang.String r0 = "$this$LazyLayout"
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                                        com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt r0 = com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt.INSTANCE
                                        kotlin.jvm.functions.Function3 r4 = r0.m7604getLambda5$financial_connections_release()
                                        r5 = 3
                                        r6 = 0
                                        r2 = 0
                                        r3 = 0
                                        r1 = r13
                                        androidx.compose.foundation.lazy.LazyListScope.item$default(r1, r2, r3, r4, r5, r6)
                                        r13 = 1
                                        r0 = r13
                                    L15:
                                        r2 = 51
                                        if (r0 >= r2) goto L33
                                        com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$2$1$1$1 r2 = new com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda-6$1$2$1$1$1
                                        r2.<init>(r0)
                                        r3 = 55034555(0x347c2bb, float:5.8704384E-37)
                                        androidx.compose.runtime.internal.ComposableLambda r2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r3, r13, r2)
                                        r10 = r2
                                        kotlin.jvm.functions.Function3 r10 = (kotlin.jvm.functions.Function3) r10
                                        r11 = 3
                                        r12 = 0
                                        r8 = 0
                                        r9 = 0
                                        r7 = r1
                                        androidx.compose.foundation.lazy.LazyListScope.item$default(r7, r8, r9, r10, r11, r12)
                                        int r0 = r0 + 1
                                        goto L15
                                    L33:
                                        kotlin.Unit r13 = kotlin.Unit.INSTANCE
                                        return r13
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$LayoutKt$lambda6$1.AnonymousClass2.invoke$lambda$1$lambda$0(androidx.compose.foundation.lazy.LazyListScope):kotlin.Unit");
                                }
                            }
                        });

                        /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
                        public final Function3<LazyItemScope, Composer, Integer, Unit> m7600getLambda1$financial_connections_release() {
                            return f145lambda1;
                        }

                        /* renamed from: getLambda-2$financial_connections_release, reason: not valid java name */
                        public final Function3<RowScope, Composer, Integer, Unit> m7601getLambda2$financial_connections_release() {
                            return f146lambda2;
                        }

                        /* renamed from: getLambda-3$financial_connections_release, reason: not valid java name */
                        public final Function3<RowScope, Composer, Integer, Unit> m7602getLambda3$financial_connections_release() {
                            return f147lambda3;
                        }

                        /* renamed from: getLambda-4$financial_connections_release, reason: not valid java name */
                        public final Function2<Composer, Integer, Unit> m7603getLambda4$financial_connections_release() {
                            return f148lambda4;
                        }

                        /* renamed from: getLambda-5$financial_connections_release, reason: not valid java name */
                        public final Function3<LazyItemScope, Composer, Integer, Unit> m7604getLambda5$financial_connections_release() {
                            return f149lambda5;
                        }

                        /* renamed from: getLambda-6$financial_connections_release, reason: not valid java name */
                        public final Function2<Composer, Integer, Unit> m7605getLambda6$financial_connections_release() {
                            return f150lambda6;
                        }
                    }
