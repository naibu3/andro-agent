.class public final synthetic Lcom/stripe/android/financialconnections/ui/components/TextKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/Map;

.field public final synthetic f$1:J

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;JLandroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/components/TextKt$$ExternalSyntheticLambda0;->f$0:Ljava/util/Map;

    iput-wide p2, p0, Lcom/stripe/android/financialconnections/ui/components/TextKt$$ExternalSyntheticLambda0;->f$1:J

    iput-object p4, p0, Lcom/stripe/android/financialconnections/ui/components/TextKt$$ExternalSyntheticLambda0;->f$2:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/components/TextKt$$ExternalSyntheticLambda0;->f$0:Ljava/util/Map;

    iget-wide v1, p0, Lcom/stripe/android/financialconnections/ui/components/TextKt$$ExternalSyntheticLambda0;->f$1:J

    iget-object v3, p0, Lcom/stripe/android/financialconnections/ui/components/TextKt$$ExternalSyntheticLambda0;->f$2:Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroid/text/Annotation;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->$r8$lambda$Lnx5RsTulEK_VEb_36y29JLvXYo(Ljava/util/Map;JLandroidx/compose/runtime/MutableState;Landroid/text/Annotation;)Landroidx/compose/ui/text/SpanStyle;

    move-result-object p1

    return-object p1
.end method
