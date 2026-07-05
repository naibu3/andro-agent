.class final synthetic Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$1;
.super Lkotlin/jvm/internal/PropertyReference1Impl;
.source "LinkAccountPickerViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel;->observeAsyncs()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$observeAsyncs$1;

    return-void
.end method

.method constructor <init>()V
    .locals 4

    const-class v0, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    const-string v1, "getPayload()Lcom/stripe/android/financialconnections/presentation/Async;"

    const/4 v2, 0x0

    const-string v3, "payload"

    invoke-direct {p0, v0, v3, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 141
    check-cast p1, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    return-object p1
.end method
