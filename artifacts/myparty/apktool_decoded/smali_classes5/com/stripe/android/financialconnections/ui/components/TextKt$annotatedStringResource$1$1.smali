.class final Lcom/stripe/android/financialconnections/ui/components/TextKt$annotatedStringResource$1$1;
.super Ljava/lang/Object;
.source "Text.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/ui/components/TextKt;->annotatedStringResource(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/AnnotatedString;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
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
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/ui/components/TextKt$annotatedStringResource$1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/ui/components/TextKt$annotatedStringResource$1$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/ui/components/TextKt$annotatedStringResource$1$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/components/TextKt$annotatedStringResource$1$1;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/TextKt$annotatedStringResource$1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 119
    check-cast p1, Landroid/text/Annotation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/ui/components/TextKt$annotatedStringResource$1$1;->invoke(Landroid/text/Annotation;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Landroid/text/Annotation;)Ljava/lang/Void;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
