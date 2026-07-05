package kotlinx.coroutines.channels;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.SelectClause1;

/* compiled from: Channels.common.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0001\u001aC\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\t0\n2\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0004\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\b\rH\u0087\b¢\u0006\u0002\u0010\u000e\u001aP\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\t0\u00042\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0004\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\b\rH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00030\fH\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a5\u0010\u0010\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00030\fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a$\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u0015\"\b\b\u0000\u0010\t*\u00020\u0016*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0007\u001a'\u0010\u0017\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u0016*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a'\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\t0\u001a\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"DEFAULT_CLOSE_MESSAGE", "", "cancelConsumed", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "cause", "", "consume", "R", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumeEach", "action", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause1;", "", "receiveOrNull", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes.dex */
final /* synthetic */ class ChannelsKt__Channels_commonKt {

    /* compiled from: Channels.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {LocationRequestCompat.QUALITY_LOW_POWER}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__Channels_commonKt.consumeEach((ReceiveChannel) null, (Function1) null, this);
        }
    }

    /* compiled from: Channels.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {129}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass3<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__Channels_commonKt.consumeEach((BroadcastChannel) null, (Function1) null, this);
        }
    }

    /* compiled from: Channels.common.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {148}, m = "toList", n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    static final class C00731<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C00731(Continuation<? super C00731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toList(null, this);
        }
    }

    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, Function1<? super ReceiveChannel<? extends E>, ? extends R> function1) {
        ReceiveChannel channel = broadcastChannel.openSubscription();
        try {
            return function1.invoke(channel);
        } finally {
            ReceiveChannel.DefaultImpls.cancel$default(channel, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final <E> Object receiveOrNull(ReceiveChannel<? extends E> receiveChannel, Continuation<? super E> continuation) {
        return receiveChannel.receiveOrNull(continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final <E> SelectClause1<E> onReceiveOrNull(ReceiveChannel<? extends E> receiveChannel) {
        return receiveChannel.getOnReceiveOrNull();
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> receiveChannel, Function1<? super ReceiveChannel<? extends E>, ? extends R> function1) {
        try {
            R rInvoke = function1.invoke(receiveChannel);
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return rInvoke;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: all -> 0x009c, TryCatch #3 {all -> 0x009c, blocks: (B:24:0x007a, B:26:0x0082, B:27:0x0092), top: B:46:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #3 {all -> 0x009c, blocks: (B:24:0x007a, B:26:0x0082, B:27:0x0092), top: B:46:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0070 -> B:46:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object consumeEach(ReceiveChannel<? extends E> receiveChannel, Function1<? super E, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ReceiveChannel $this$consume$iv;
        Object $result;
        Function1 action;
        ReceiveChannel $this$consume$iv2;
        Throwable cause$iv;
        ChannelIterator channelIterator;
        int i;
        Object obj;
        AnonymousClass1 anonymousClass12;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object e = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure(e);
                $this$consume$iv = receiveChannel;
                Throwable cause$iv2 = null;
                try {
                    int $i$f$consumeEach = 0;
                    Function1 action2 = function1;
                    ChannelIterator it = $this$consume$iv.iterator();
                    anonymousClass1.L$0 = action2;
                    anonymousClass1.L$1 = $this$consume$iv;
                    anonymousClass1.L$2 = it;
                    anonymousClass1.label = 1;
                    Object objHasNext = it.hasNext(anonymousClass1);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    AnonymousClass1 anonymousClass13 = anonymousClass1;
                    $result = e;
                    e = objHasNext;
                    action = action2;
                    $this$consume$iv2 = $this$consume$iv;
                    cause$iv = cause$iv2;
                    channelIterator = it;
                    i = $i$f$consumeEach;
                    obj = coroutine_suspended;
                    anonymousClass12 = anonymousClass13;
                    try {
                        if (((Boolean) e).booleanValue()) {
                            Unit unit = Unit.INSTANCE;
                            ChannelsKt.cancelConsumed($this$consume$iv2, cause$iv);
                            return Unit.INSTANCE;
                        }
                        action.invoke(channelIterator.next());
                        e = $result;
                        anonymousClass1 = anonymousClass12;
                        coroutine_suspended = obj;
                        $i$f$consumeEach = i;
                        it = channelIterator;
                        cause$iv2 = cause$iv;
                        $this$consume$iv = $this$consume$iv2;
                        action2 = action;
                        anonymousClass1.L$0 = action2;
                        anonymousClass1.L$1 = $this$consume$iv;
                        anonymousClass1.L$2 = it;
                        anonymousClass1.label = 1;
                        Object objHasNext2 = it.hasNext(anonymousClass1);
                        if (objHasNext2 != coroutine_suspended) {
                        }
                    } catch (Throwable th) {
                        e$iv = th;
                        $this$consume$iv = $this$consume$iv2;
                        Throwable cause$iv3 = e$iv;
                        try {
                            throw e$iv;
                        } catch (Throwable e$iv) {
                            ChannelsKt.cancelConsumed($this$consume$iv, cause$iv3);
                            throw e$iv;
                        }
                    }
                } catch (Throwable th2) {
                    e$iv = th2;
                    Throwable cause$iv32 = e$iv;
                    throw e$iv;
                }
            case 1:
                ChannelIterator channelIterator2 = (ChannelIterator) anonymousClass1.L$2;
                $this$consume$iv = (ReceiveChannel) anonymousClass1.L$1;
                Function1 action3 = (Function1) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(e);
                    action = action3;
                    $this$consume$iv2 = $this$consume$iv;
                    cause$iv = null;
                    channelIterator = channelIterator2;
                    i = 0;
                    obj = coroutine_suspended;
                    anonymousClass12 = anonymousClass1;
                    $result = e;
                    if (((Boolean) e).booleanValue()) {
                    }
                } catch (Throwable th3) {
                    e$iv = th3;
                    Throwable cause$iv322 = e$iv;
                    throw e$iv;
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static final <E> Object consumeEach$$forInline(ReceiveChannel<? extends E> receiveChannel, Function1<? super E, Unit> function1, Continuation<? super Unit> continuation) {
        try {
            ChannelIterator<? extends E> it = receiveChannel.iterator();
            while (((Boolean) it.hasNext(null)).booleanValue()) {
                Object e = it.next();
                function1.invoke(e);
            }
            Unit unit = Unit.INSTANCE;
            ChannelsKt.cancelConsumed(receiveChannel, null);
            return Unit.INSTANCE;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:24:0x008f, B:26:0x0097, B:27:0x00ac), top: B:44:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac A[Catch: all -> 0x00ba, TRY_LEAVE, TryCatch #2 {all -> 0x00ba, blocks: (B:24:0x008f, B:26:0x0097, B:27:0x00ac), top: B:44:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:44:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object toList(ReceiveChannel<? extends E> receiveChannel, Continuation<? super List<? extends E>> continuation) throws Throwable {
        C00731 c00731;
        ReceiveChannel $this$consume$iv$iv;
        Object $result;
        List list;
        List list2;
        ReceiveChannel $this$consume$iv$iv2;
        Throwable cause$iv$iv;
        ChannelIterator channelIterator;
        int i;
        List list3;
        int $i$f$consume;
        Object obj;
        C00731 c007312;
        if (continuation instanceof C00731) {
            c00731 = (C00731) continuation;
            if ((c00731.label & Integer.MIN_VALUE) != 0) {
                c00731.label -= Integer.MIN_VALUE;
            } else {
                c00731 = new C00731(continuation);
            }
        }
        Object e$iv = c00731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c00731.label) {
            case 0:
                ResultKt.throwOnFailure(e$iv);
                List $this$toList_u24lambda_u2d3 = CollectionsKt.createListBuilder();
                $this$consume$iv$iv = receiveChannel;
                Throwable cause$iv$iv2 = null;
                try {
                    List $this$toList_u24lambda_u2d32 = $this$toList_u24lambda_u2d3;
                    List $this$toList_u24lambda_u2d33 = null;
                    int $i$f$consume2 = 0;
                    List $this$toList_u24lambda_u2d34 = $this$toList_u24lambda_u2d3;
                    int $i$f$consumeEach = 0;
                    ChannelIterator it = $this$consume$iv$iv.iterator();
                    c00731.L$0 = $this$toList_u24lambda_u2d34;
                    c00731.L$1 = $this$toList_u24lambda_u2d32;
                    c00731.L$2 = $this$consume$iv$iv;
                    c00731.L$3 = it;
                    c00731.label = 1;
                    Object objHasNext = it.hasNext(c00731);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    C00731 c007313 = c00731;
                    $result = e$iv;
                    e$iv = objHasNext;
                    list = $this$toList_u24lambda_u2d34;
                    list2 = $this$toList_u24lambda_u2d32;
                    $this$consume$iv$iv2 = $this$consume$iv$iv;
                    cause$iv$iv = cause$iv$iv2;
                    channelIterator = it;
                    i = $i$f$consume2;
                    list3 = $this$toList_u24lambda_u2d33;
                    $i$f$consume = $i$f$consumeEach;
                    obj = coroutine_suspended;
                    c007312 = c007313;
                    try {
                        if (((Boolean) e$iv).booleanValue()) {
                            Unit unit = Unit.INSTANCE;
                            ChannelsKt.cancelConsumed($this$consume$iv$iv2, cause$iv$iv);
                            return CollectionsKt.build(list);
                        }
                        list2.add(channelIterator.next());
                        e$iv = $result;
                        c00731 = c007312;
                        coroutine_suspended = obj;
                        $i$f$consumeEach = $i$f$consume;
                        $this$toList_u24lambda_u2d33 = list3;
                        $i$f$consume2 = i;
                        it = channelIterator;
                        cause$iv$iv2 = cause$iv$iv;
                        $this$consume$iv$iv = $this$consume$iv$iv2;
                        $this$toList_u24lambda_u2d32 = list2;
                        $this$toList_u24lambda_u2d34 = list;
                        c00731.L$0 = $this$toList_u24lambda_u2d34;
                        c00731.L$1 = $this$toList_u24lambda_u2d32;
                        c00731.L$2 = $this$consume$iv$iv;
                        c00731.L$3 = it;
                        c00731.label = 1;
                        Object objHasNext2 = it.hasNext(c00731);
                        if (objHasNext2 != coroutine_suspended) {
                        }
                    } catch (Throwable th) {
                        e$iv$iv = th;
                        $this$consume$iv$iv = $this$consume$iv$iv2;
                        Throwable cause$iv$iv3 = e$iv$iv;
                        try {
                            throw e$iv$iv;
                        } catch (Throwable e$iv$iv) {
                            ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv3);
                            throw e$iv$iv;
                        }
                    }
                } catch (Throwable th2) {
                    e$iv$iv = th2;
                    Throwable cause$iv$iv32 = e$iv$iv;
                    throw e$iv$iv;
                }
            case 1:
                ChannelIterator channelIterator2 = (ChannelIterator) c00731.L$3;
                $this$consume$iv$iv = (ReceiveChannel) c00731.L$2;
                List $this$toList_u24lambda_u2d35 = (List) c00731.L$1;
                List list4 = (List) c00731.L$0;
                try {
                    ResultKt.throwOnFailure(e$iv);
                    list = list4;
                    list2 = $this$toList_u24lambda_u2d35;
                    $this$consume$iv$iv2 = $this$consume$iv$iv;
                    cause$iv$iv = null;
                    channelIterator = channelIterator2;
                    i = 0;
                    list3 = null;
                    $i$f$consume = 0;
                    obj = coroutine_suspended;
                    c007312 = c00731;
                    $result = e$iv;
                    if (((Boolean) e$iv).booleanValue()) {
                    }
                } catch (Throwable th3) {
                    e$iv$iv = th3;
                    Throwable cause$iv$iv322 = e$iv$iv;
                    throw e$iv$iv;
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: all -> 0x009a, TryCatch #2 {all -> 0x009a, blocks: (B:24:0x0079, B:26:0x0081, B:27:0x0090), top: B:41:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #2 {all -> 0x009a, blocks: (B:24:0x0079, B:26:0x0081, B:27:0x0090), top: B:41:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0070 -> B:41:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object consumeEach(BroadcastChannel<E> broadcastChannel, Function1<? super E, Unit> function1, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass3 anonymousClass3;
        ReceiveChannel channel$iv;
        Object $result;
        Function1 action;
        ReceiveChannel channel$iv2;
        ChannelIterator channelIterator;
        int i;
        Object obj;
        AnonymousClass3 anonymousClass32;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            if ((anonymousClass3.label & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        }
        Object element = anonymousClass3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass3.label) {
            case 0:
                ResultKt.throwOnFailure(element);
                channel$iv = broadcastChannel.openSubscription();
                try {
                    int $i$f$consumeEach = 0;
                    Function1 action2 = function1;
                    ChannelIterator it = channel$iv.iterator();
                    anonymousClass3.L$0 = action2;
                    anonymousClass3.L$1 = channel$iv;
                    anonymousClass3.L$2 = it;
                    anonymousClass3.label = 1;
                    Object objHasNext = it.hasNext(anonymousClass3);
                    if (objHasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    AnonymousClass3 anonymousClass33 = anonymousClass3;
                    $result = element;
                    element = objHasNext;
                    action = action2;
                    channel$iv2 = channel$iv;
                    channelIterator = it;
                    i = $i$f$consumeEach;
                    obj = coroutine_suspended;
                    anonymousClass32 = anonymousClass33;
                    try {
                        if (((Boolean) element).booleanValue()) {
                            Unit unit = Unit.INSTANCE;
                            ReceiveChannel.DefaultImpls.cancel$default(channel$iv2, (CancellationException) null, 1, (Object) null);
                            return Unit.INSTANCE;
                        }
                        action.invoke(channelIterator.next());
                        element = $result;
                        anonymousClass3 = anonymousClass32;
                        coroutine_suspended = obj;
                        $i$f$consumeEach = i;
                        it = channelIterator;
                        channel$iv = channel$iv2;
                        action2 = action;
                        anonymousClass3.L$0 = action2;
                        anonymousClass3.L$1 = channel$iv;
                        anonymousClass3.L$2 = it;
                        anonymousClass3.label = 1;
                        Object objHasNext2 = it.hasNext(anonymousClass3);
                        if (objHasNext2 != coroutine_suspended) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        channel$iv = channel$iv2;
                        ReceiveChannel.DefaultImpls.cancel$default(channel$iv, (CancellationException) null, 1, (Object) null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ReceiveChannel.DefaultImpls.cancel$default(channel$iv, (CancellationException) null, 1, (Object) null);
                    throw th;
                }
            case 1:
                ChannelIterator channelIterator2 = (ChannelIterator) anonymousClass3.L$2;
                channel$iv = (ReceiveChannel) anonymousClass3.L$1;
                Function1 action3 = (Function1) anonymousClass3.L$0;
                try {
                    ResultKt.throwOnFailure(element);
                    action = action3;
                    channel$iv2 = channel$iv;
                    channelIterator = channelIterator2;
                    i = 0;
                    obj = coroutine_suspended;
                    anonymousClass32 = anonymousClass3;
                    $result = element;
                    if (((Boolean) element).booleanValue()) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ReceiveChannel.DefaultImpls.cancel$default(channel$iv, (CancellationException) null, 1, (Object) null);
                    throw th;
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static final <E> Object consumeEach$$forInline(BroadcastChannel<E> broadcastChannel, Function1<? super E, Unit> function1, Continuation<? super Unit> continuation) {
        ReceiveChannel channel$iv = broadcastChannel.openSubscription();
        try {
            ChannelIterator<E> it = channel$iv.iterator();
            while (((Boolean) it.hasNext(null)).booleanValue()) {
                Object element = it.next();
                function1.invoke(element);
            }
            Unit unit = Unit.INSTANCE;
            ReceiveChannel.DefaultImpls.cancel$default(channel$iv, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            ReceiveChannel.DefaultImpls.cancel$default(channel$iv, (CancellationException) null, 1, (Object) null);
            throw th;
        }
    }

    public static final void cancelConsumed(ReceiveChannel<?> receiveChannel, Throwable cause) {
        if (cause != null) {
            CancellationException = cause instanceof CancellationException ? (CancellationException) cause : null;
            if (CancellationException == null) {
                CancellationException = ExceptionsKt.CancellationException("Channel was consumed, consumer had failed", cause);
            }
        }
        receiveChannel.cancel(CancellationException);
    }
}
