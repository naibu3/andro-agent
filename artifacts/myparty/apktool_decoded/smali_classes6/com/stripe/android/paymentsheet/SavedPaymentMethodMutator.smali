.class public final Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;
.super Ljava/lang/Object;
.source "SavedPaymentMethodMutator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSavedPaymentMethodMutator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedPaymentMethodMutator.kt\ncom/stripe/android/paymentsheet/SavedPaymentMethodMutator\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,473:1\n230#2,5:474\n1#3:479\n808#4,11:480\n1755#4,3:491\n*S KotlinDebug\n*F\n+ 1 SavedPaymentMethodMutator.kt\ncom/stripe/android/paymentsheet/SavedPaymentMethodMutator\n*L\n132#1:474,5\n97#1:480,11\n97#1:491,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0001\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0095\u0003\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u001c\u0010\u0015\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011\u0012\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0018\u0012\u00e1\u0001\u0010\u0019\u001a\u00dc\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110\u001c\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(\u001f\u0012+\u0012)\u0008\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(!\u0012D\u0012B\u0008\u0001\u0012\u0013\u0012\u00110#\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008($\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0%0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(\'\u0012D\u0012B\u0008\u0001\u0012\u0013\u0012\u00110&\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008((\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120%0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008()\u0012\u0004\u0012\u00020\u00120\u001a\u0012\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0003\u0012\u0006\u0010+\u001a\u00020\u001c\u00a2\u0006\u0004\u0008,\u0010-J\u0006\u0010H\u001a\u00020\u0012J\u000e\u0010I\u001a\u00020\u00122\u0006\u0010(\u001a\u00020&J\u001e\u0010J\u001a\u0008\u0012\u0004\u0012\u00020&0%2\u0006\u0010K\u001a\u000200H\u0082@\u00a2\u0006\u0004\u0008L\u0010MJ\u0016\u0010N\u001a\u00020\u00122\u0006\u0010K\u001a\u000200H\u0082@\u00a2\u0006\u0002\u0010MJ\u000e\u0010O\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u001bJ\u001e\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020\u00120%2\u0006\u0010(\u001a\u00020&H\u0080@\u00a2\u0006\u0004\u0008R\u0010SJ\u0018\u0010T\u001a\u0004\u0018\u00010 2\u0006\u0010(\u001a\u00020&H\u0086@\u00a2\u0006\u0002\u0010SJ<\u0010U\u001a\u0008\u0012\u0004\u0012\u00020&0%2\u0006\u0010(\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0014\u0008\u0002\u0010V\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@\u00a2\u0006\u0004\u0008W\u0010XJ\u0010\u0010Y\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020&H\u0002R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010.R\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u00e9\u0001\u0010\u0019\u001a\u00dc\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110\u001c\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(\u001f\u0012+\u0012)\u0008\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(!\u0012D\u0012B\u0008\u0001\u0012\u0013\u0012\u00110#\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008($\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0%0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(\'\u0012D\u0012B\u0008\u0001\u0012\u0013\u0012\u00110&\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008((\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120%0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008()\u0012\u0004\u0012\u00020\u00120\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R.\u00103\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u000100\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(4\u0012\u0004\u0012\u0002050\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008:\u0010;R\u001d\u0010>\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020@0?0\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u00102R\u0017\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u00102R\u0014\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u001c0EX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u00102\u00a8\u0006["
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;",
        "",
        "paymentMethodMetadataFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "uiContext",
        "customerRepository",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "setSelection",
        "Lkotlin/Function1;",
        "",
        "customerStateHolder",
        "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
        "prePaymentMethodRemoveActions",
        "Lkotlin/coroutines/Continuation;",
        "postPaymentMethodRemoveActions",
        "Lkotlin/Function0;",
        "onUpdatePaymentMethod",
        "Lkotlin/Function5;",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "canRemove",
        "",
        "performRemove",
        "Lkotlin/Function2;",
        "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
        "cardUpdateParams",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/PaymentMethod;",
        "updateExecutor",
        "paymentMethod",
        "setDefaultPaymentMethodExecutor",
        "isLinkEnabled",
        "isNotPaymentFlow",
        "<init>",
        "(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function5;Lkotlinx/coroutines/flow/StateFlow;Z)V",
        "Lkotlin/jvm/functions/Function1;",
        "defaultPaymentMethodId",
        "",
        "getDefaultPaymentMethodId",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "providePaymentMethodName",
        "code",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getProvidePaymentMethodName",
        "()Lkotlin/jvm/functions/Function1;",
        "paymentOptionsItemsMapper",
        "Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;",
        "getPaymentOptionsItemsMapper",
        "()Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;",
        "paymentOptionsItemsMapper$delegate",
        "Lkotlin/Lazy;",
        "paymentOptionsItems",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
        "getPaymentOptionsItems",
        "canEdit",
        "getCanEdit",
        "_editing",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "editing",
        "getEditing$paymentsheet_release",
        "toggleEditing",
        "removePaymentMethod",
        "removePaymentMethodInternal",
        "paymentMethodId",
        "removePaymentMethodInternal-gIAlu-s",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "removeDeletedPaymentMethodFromState",
        "updatePaymentMethod",
        "displayableSavedPaymentMethod",
        "setDefaultPaymentMethod",
        "setDefaultPaymentMethod-gIAlu-s$paymentsheet_release",
        "(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "removePaymentMethodInEditScreen",
        "modifyCardPaymentMethod",
        "onSuccess",
        "modifyCardPaymentMethod-BWLJW6A",
        "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isSelectedPaymentMethod",
        "Companion",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$Companion;


# instance fields
.field private final _editing:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final canEdit:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

.field private final customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

.field private final defaultPaymentMethodId:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final editing:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final onUpdatePaymentMethod:Lkotlin/jvm/functions/Function5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function5<",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
            "Ljava/lang/Boolean;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Throwable;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentMethodMetadataFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentOptionsItems:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;>;"
        }
    .end annotation
.end field

.field private final paymentOptionsItemsMapper$delegate:Lkotlin/Lazy;

.field private final postPaymentMethodRemoveActions:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final prePaymentMethodRemoveActions:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final providePaymentMethodName:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private final selection:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final setSelection:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final uiContext:Lkotlin/coroutines/CoroutineContext;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static synthetic $r8$lambda$IdxEZmjBxn_PD3yZjZFXRR68BRU(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlinx/coroutines/flow/StateFlow;Z)Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentOptionsItemsMapper_delegate$lambda$6(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlinx/coroutines/flow/StateFlow;Z)Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$JeIUcpse-Gdp_64IGimdwcfHgws(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;ZLjava/util/List;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->canEdit$lambda$8(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;ZLjava/util/List;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$KsMbKxybp05xykOFkoR5uFCUugs(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentOptionsItemsMapper_delegate$lambda$6$lambda$5(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$N2AIZ8FcPj4Ps05n3bsgjUUYTUo(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentOptionsItemsMapper_delegate$lambda$6$lambda$4(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$TSih-5tnfp08CMcWJo0L2mpTGtk(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentOptionsItemsMapper_delegate$lambda$6$lambda$3(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$asi16lw6rbw3ItzprI3MMi3HfmI(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->providePaymentMethodName$lambda$2(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$fCOAW0PbhUK0-KLAzQrPr0jfniA(Lcom/stripe/android/model/PaymentMethod;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->modifyCardPaymentMethod_BWLJW6A$lambda$15(Lcom/stripe/android/model/PaymentMethod;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$lOQnYQdsQXKSvCQXq33czeERAWg(Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->defaultPaymentMethodId$lambda$0(Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->Companion:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/CustomerStateHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function5;Lkotlinx/coroutines/flow/StateFlow;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
            ">;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Throwable;",
            ">;+",
            "Ljava/lang/Object;",
            ">;-",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;-",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "paymentMethodMetadataFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selection"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setSelection"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerStateHolder"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prePaymentMethodRemoveActions"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "postPaymentMethodRemoveActions"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUpdatePaymentMethod"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkEnabled"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentMethodMetadataFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 35
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 36
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    .line 37
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->workContext:Lkotlin/coroutines/CoroutineContext;

    .line 38
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->uiContext:Lkotlin/coroutines/CoroutineContext;

    .line 39
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    .line 40
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->selection:Lkotlinx/coroutines/flow/StateFlow;

    .line 41
    iput-object p8, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->setSelection:Lkotlin/jvm/functions/Function1;

    .line 42
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    .line 47
    iput-object p10, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->prePaymentMethodRemoveActions:Lkotlin/jvm/functions/Function1;

    .line 51
    iput-object p11, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->postPaymentMethodRemoveActions:Lkotlin/jvm/functions/Function0;

    .line 52
    iput-object p12, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->onUpdatePaymentMethod:Lkotlin/jvm/functions/Function5;

    .line 63
    invoke-virtual {p9}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCustomer()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    .line 64
    new-instance p4, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda0;

    invoke-direct {p4}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda0;-><init>()V

    .line 62
    invoke-static {p2, p1, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->defaultPaymentMethodId:Lkotlinx/coroutines/flow/StateFlow;

    .line 73
    new-instance p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda1;

    invoke-direct {p1, p0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->providePaymentMethodName:Lkotlin/jvm/functions/Function1;

    .line 79
    new-instance p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda2;

    invoke-direct {p1, p0, p13, p14}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlinx/coroutines/flow/StateFlow;Z)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentOptionsItemsMapper$delegate:Lkotlin/Lazy;

    .line 91
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->getPaymentOptionsItemsMapper()Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;->invoke()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentOptionsItems:Lkotlinx/coroutines/flow/StateFlow;

    .line 94
    invoke-virtual {p9}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCanRemove()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    .line 93
    new-instance p4, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda3;

    invoke-direct {p4, p0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)V

    invoke-static {p2, p1, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->canEdit:Lkotlinx/coroutines/flow/StateFlow;

    const/4 p1, 0x0

    .line 102
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->_editing:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 103
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->editing:Lkotlinx/coroutines/flow/StateFlow;

    .line 106
    new-instance p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlin/coroutines/Continuation;)V

    move-object p6, p1

    check-cast p6, Lkotlin/jvm/functions/Function2;

    const/4 p7, 0x3

    const/4 p8, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    invoke-static/range {p3 .. p8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-object p9, p3

    .line 114
    new-instance p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$2;

    invoke-direct {p1, p0, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$2;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlin/coroutines/Continuation;)V

    move-object p12, p1

    check-cast p12, Lkotlin/jvm/functions/Function2;

    const/4 p13, 0x3

    const/4 p14, 0x0

    const/4 p10, 0x0

    const/4 p11, 0x0

    invoke-static/range {p9 .. p14}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 122
    new-instance p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$3;

    invoke-direct {p1, p0, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$3;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlin/coroutines/Continuation;)V

    move-object p12, p1

    check-cast p12, Lkotlin/jvm/functions/Function2;

    invoke-static/range {p9 .. p14}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getCustomerStateHolder$p(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Lcom/stripe/android/paymentsheet/CustomerStateHolder;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    return-object p0
.end method

.method public static final synthetic access$getPostPaymentMethodRemoveActions$p(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->postPaymentMethodRemoveActions:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic access$getPrePaymentMethodRemoveActions$p(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->prePaymentMethodRemoveActions:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getSelection$p(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->selection:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getSetSelection$p(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->setSelection:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$get_editing$p(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->_editing:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$isSelectedPaymentMethod(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/model/PaymentMethod;)Z
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->isSelectedPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$removeDeletedPaymentMethodFromState(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->removeDeletedPaymentMethodFromState(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$removePaymentMethodInternal-gIAlu-s(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->removePaymentMethodInternal-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final canEdit$lambda$8(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;ZLjava/util/List;)Z
    .locals 2

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_5

    .line 97
    check-cast p2, Ljava/lang/Iterable;

    .line 480
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    .line 489
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 490
    :cond_1
    check-cast p1, Ljava/util/List;

    .line 480
    check-cast p1, Ljava/lang/Iterable;

    .line 491
    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    .line 492
    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;

    .line 98
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCanUpdateFullPaymentMethodDetails()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p2, v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$SavedPaymentMethod;->isModifiable(Z)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0

    :cond_5
    :goto_2
    const/4 p0, 0x1

    return p0
.end method

.method private static final defaultPaymentMethodId$lambda$0(Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 66
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCustomerMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    if-eqz p0, :cond_0

    .line 67
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getDefaultPaymentMethodId()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method private final getPaymentOptionsItemsMapper()Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentOptionsItemsMapper$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;

    return-object v0
.end method

.method private final isSelectedPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)Z
    .locals 3

    .line 326
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->selection:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    .line 327
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, v0, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    :cond_1
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public static synthetic modifyCardPaymentMethod-BWLJW6A$default(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 262
    new-instance p3, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda7;

    invoke-direct {p3}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda7;-><init>()V

    .line 259
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->modifyCardPaymentMethod-BWLJW6A(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final modifyCardPaymentMethod_BWLJW6A$lambda$15(Lcom/stripe/android/model/PaymentMethod;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final paymentOptionsItemsMapper_delegate$lambda$6(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlinx/coroutines/flow/StateFlow;Z)Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;
    .locals 10

    .line 81
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentMethodMetadataFlow:Lkotlinx/coroutines/flow/StateFlow;

    new-instance v1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda4;

    invoke-direct {v1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda4;-><init>()V

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    .line 82
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCustomer()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    .line 83
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentMethodMetadataFlow:Lkotlinx/coroutines/flow/StateFlow;

    new-instance v1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda5;

    invoke-direct {v1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda5;-><init>()V

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    .line 86
    iget-object v7, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->providePaymentMethodName:Lkotlin/jvm/functions/Function1;

    .line 80
    new-instance v2, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;

    .line 87
    new-instance v9, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda6;

    invoke-direct {v9, p0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda6;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)V

    move-object v6, p1

    move v8, p2

    .line 80
    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;-><init>(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;)V

    return-object v2
.end method

.method private static final paymentOptionsItemsMapper_delegate$lambda$6$lambda$3(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;
    .locals 0

    if-eqz p0, :cond_0

    .line 81
    invoke-virtual {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCustomerMetadata()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final paymentOptionsItemsMapper_delegate$lambda$6$lambda$4(Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 83
    invoke-virtual {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isGooglePayReady()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    return v1

    :cond_0
    return v0
.end method

.method private static final paymentOptionsItemsMapper_delegate$lambda$6$lambda$5(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;)Z
    .locals 0

    .line 87
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentMethodMetadataFlow:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->getCbcEligibility()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    instance-of p0, p0, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Eligible;

    return p0
.end method

.method private static final providePaymentMethodName$lambda$2(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 75
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentMethodMetadataFlow:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->supportedPaymentMethodForCode(Ljava/lang/String;)Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    .line 76
    invoke-virtual {p0}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getDisplayName()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    :cond_1
    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->orEmpty(Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private final removeDeletedPaymentMethodFromState(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 177
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCustomer()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/state/CustomerState;

    if-nez v0, :cond_0

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 179
    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    check-cast v2, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v2, :cond_3

    iget-object v1, v2, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz v1, :cond_3

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 180
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {v2, v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onRemoveSavedPaymentMethod(Ljava/lang/String;)V

    .line 183
    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->uiContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removeDeletedPaymentMethodFromState$4;

    invoke-direct {v2, p0, v0, p1, v3}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removeDeletedPaymentMethodFromState$4;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/paymentsheet/state/CustomerState;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    invoke-static {v1, v2, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_4

    return-object p1

    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final removePaymentMethodInternal-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 144
    iget v2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->Z$0:Z

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/state/CustomerState;

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v6, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move p2, p1

    move-object p1, v4

    goto/16 :goto_4

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 146
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCustomer()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/paymentsheet/state/CustomerState;

    if-nez v2, :cond_4

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 147
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 148
    const-string p2, "Could not remove payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration"

    .line 147
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 146
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 153
    :cond_4
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCanRemoveDuplicate()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    .line 154
    iget-object v6, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->selection:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v6}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v7, :cond_5

    check-cast v6, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    goto :goto_1

    :cond_5
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v6

    goto :goto_2

    :cond_6
    move-object v6, v5

    :goto_2
    if-eqz v6, :cond_7

    .line 155
    iget-object v6, v6, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    goto :goto_3

    :cond_7
    move-object v6, v5

    :goto_3
    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 160
    iget-object v6, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->uiContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v7, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$2;

    invoke-direct {v7, p0, v5}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$2;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlin/coroutines/Continuation;)V

    check-cast v7, Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->L$2:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->Z$0:Z

    iput v4, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->label:I

    invoke-static {v6, v7, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_8

    goto :goto_5

    :cond_8
    move-object v6, p0

    .line 165
    :goto_4
    iget-object v4, v6, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    .line 166
    new-instance v6, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;

    .line 167
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getId()Ljava/lang/String;

    move-result-object v7

    .line 168
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v8

    .line 169
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object v2

    .line 166
    invoke-direct {v6, v7, v8, v2}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    iput-object v5, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInternal$1;->label:I

    invoke-interface {v4, v6, p1, p2, v0}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->detachPaymentMethod-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_5
    return-object v1

    :cond_9
    return-object p1
.end method


# virtual methods
.method public final getCanEdit()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->canEdit:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getDefaultPaymentMethodId()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->defaultPaymentMethodId:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getEditing$paymentsheet_release()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 103
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->editing:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getPaymentOptionsItems()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;",
            ">;>;"
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->paymentOptionsItems:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getProvidePaymentMethodName()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->providePaymentMethodName:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final modifyCardPaymentMethod-BWLJW6A(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;

    iget v3, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 259
    iget v4, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$2:Ljava/lang/Object;

    iget-object v4, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/paymentsheet/CardUpdateParams;

    iget-object v2, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/paymentsheet/state/CustomerState;

    iget-object v7, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$2:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v8, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lcom/stripe/android/paymentsheet/CardUpdateParams;

    iget-object v9, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/Result;

    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v7

    move-object v11, v8

    move-object v13, v9

    :goto_1
    move-object v15, v4

    goto/16 :goto_3

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 265
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCustomer()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/paymentsheet/state/CustomerState;

    if-nez v4, :cond_4

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 266
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 267
    const-string v2, "Could not update payment method because CustomerConfiguration was not found! Make sure it is provided as part of PaymentSheet.Configuration"

    .line 266
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    .line 265
    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    .line 272
    :cond_4
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    .line 273
    new-instance v8, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;

    .line 274
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getId()Ljava/lang/String;

    move-result-object v9

    .line 275
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v10

    .line 276
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object v11

    .line 273
    invoke-direct {v8, v9, v10, v11}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v9, p1

    .line 278
    iget-object v9, v9, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 279
    sget-object v10, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    .line 280
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getCardBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v11

    if-eqz v11, :cond_5

    .line 281
    new-instance v12, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

    .line 282
    invoke-virtual {v11}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v11

    .line 281
    invoke-direct {v12, v11}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;-><init>(Ljava/lang/String;)V

    move-object v13, v12

    goto :goto_2

    :cond_5
    move-object v13, v5

    .line 285
    :goto_2
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v14

    .line 286
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getExpiryMonth()Ljava/lang/Integer;

    move-result-object v11

    .line 287
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getExpiryYear()Ljava/lang/Integer;

    move-result-object v12

    .line 288
    const-string v15, "PaymentSheet"

    invoke-static {v15}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v16

    const/16 v17, 0x10

    const/16 v18, 0x0

    const/4 v15, 0x0

    .line 279
    invoke-static/range {v10 .. v18}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard$default(Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object v10

    .line 272
    iput-object v0, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$0:Ljava/lang/Object;

    move-object/from16 v11, p2

    iput-object v11, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$1:Ljava/lang/Object;

    move-object/from16 v12, p3

    iput-object v12, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$3:Ljava/lang/Object;

    iput v7, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->label:I

    invoke-interface {v1, v8, v9, v10, v2}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->updatePaymentMethod-BWLJW6A(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto :goto_4

    :cond_6
    move-object v13, v0

    move-object/from16 v16, v12

    goto/16 :goto_1

    .line 290
    :goto_3
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object v14, v1

    check-cast v14, Lcom/stripe/android/model/PaymentMethod;

    .line 291
    iget-object v4, v13, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->uiContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v12, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v17}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$4$1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/state/CustomerState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v12, Lkotlin/jvm/functions/Function2;

    iput-object v13, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object v11, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput-object v1, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$2:Ljava/lang/Object;

    iput-object v5, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->L$3:Ljava/lang/Object;

    iput v6, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$modifyCardPaymentMethod$1;->label:I

    invoke-static {v4, v12, v2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_7

    :goto_4
    return-object v3

    :cond_7
    move-object v3, v1

    move-object v4, v11

    move-object v2, v13

    .line 314
    :goto_5
    iget-object v1, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 315
    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getCardBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v5

    .line 314
    invoke-interface {v1, v5}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onUpdatePaymentMethodSucceeded(Lcom/stripe/android/model/CardBrand;)V

    move-object v13, v2

    move-object v1, v3

    move-object v11, v4

    .line 317
    :cond_8
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 318
    iget-object v3, v13, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 319
    invoke-virtual {v11}, Lcom/stripe/android/paymentsheet/CardUpdateParams;->getCardBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v4

    .line 318
    invoke-interface {v3, v4, v2}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onUpdatePaymentMethodFailed(Lcom/stripe/android/model/CardBrand;Ljava/lang/Throwable;)V

    :cond_9
    return-object v1
.end method

.method public final removePaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 6

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethod$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final removePaymentMethodInEditScreen(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 245
    iget v2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 246
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 247
    iput-object p0, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->removePaymentMethodInternal-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 249
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 250
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v3, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->uiContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$2;

    const/4 v4, 0x0

    invoke-direct {v1, v0, p1, v4}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$removePaymentMethodInEditScreen$2;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 256
    :cond_4
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method

.method public final setDefaultPaymentMethod-gIAlu-s$paymentsheet_release(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 215
    iget v2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->L$2:Ljava/lang/Object;

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 216
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCustomer()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/paymentsheet/state/CustomerState;

    if-nez p2, :cond_4

    .line 217
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 218
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unable to set default payment method when customer is null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    .line 217
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 221
    :cond_4
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerRepository:Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;

    .line 222
    new-instance v6, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;

    .line 223
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getId()Ljava/lang/String;

    move-result-object v7

    .line 224
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object v8

    .line 225
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object p2

    .line 222
    invoke-direct {v6, v7, v8, p2}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    iget-object p2, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    .line 221
    iput-object p0, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->label:I

    invoke-interface {v2, v6, p2, v0}, Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;->setDefaultPaymentMethod-0E7RQCE(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, p0

    .line 228
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 229
    iget-object v6, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 230
    iget-object v7, p2, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz v7, :cond_6

    iget-object v7, v7, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    goto :goto_2

    :cond_6
    move-object v7, v5

    .line 229
    :goto_2
    invoke-interface {v6, v7, v4}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onSetAsDefaultPaymentMethodFailed(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 233
    :cond_7
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    move-object v4, p1

    check-cast v4, Lcom/stripe/android/model/Customer;

    .line 234
    iget-object v4, v2, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->uiContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v6, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$3$1;

    invoke-direct {v6, v2, p2, v5}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$3$1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V

    check-cast v6, Lkotlin/jvm/functions/Function2;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$setDefaultPaymentMethod$1;->label:I

    invoke-static {v4, v6, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    move-object v1, p2

    move-object v0, v2

    .line 239
    :goto_4
    iget-object p2, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 240
    iget-object v0, v1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-eqz v0, :cond_9

    iget-object v5, v0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    .line 239
    :cond_9
    invoke-interface {p2, v5}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onSetAsDefaultPaymentMethodSucceeded(Ljava/lang/String;)V

    .line 242
    :cond_a
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_b

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/model/Customer;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_b
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toggleEditing()V
    .locals 3

    .line 132
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->_editing:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 475
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 476
    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    .line 132
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 477
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final updatePaymentMethod(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V
    .locals 7

    const-string v0, "displayableSavedPaymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    .line 202
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->onUpdatePaymentMethod:Lkotlin/jvm/functions/Function5;

    .line 204
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->customerStateHolder:Lcom/stripe/android/paymentsheet/CustomerStateHolder;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->getCanRemove()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 202
    new-instance v4, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$updatePaymentMethod$1;

    const/4 v2, 0x0

    invoke-direct {v4, p0, v0, v2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$updatePaymentMethod$1;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V

    new-instance v5, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$updatePaymentMethod$2;

    invoke-direct {v5, p0, v0, v2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$updatePaymentMethod$2;-><init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V

    .line 211
    new-instance v6, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$updatePaymentMethod$3;

    invoke-direct {v6, p0}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$updatePaymentMethod$3;-><init>(Ljava/lang/Object;)V

    move-object v2, p1

    .line 202
    invoke-interface/range {v1 .. v6}, Lkotlin/jvm/functions/Function5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
