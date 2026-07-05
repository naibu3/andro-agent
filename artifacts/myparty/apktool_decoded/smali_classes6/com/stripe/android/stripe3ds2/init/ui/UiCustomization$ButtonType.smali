.class public final enum Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;
.super Ljava/lang/Enum;
.source "UiCustomization.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ButtonType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

.field public static final enum CANCEL:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

.field public static final enum CONTINUE:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

.field public static final enum NEXT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

.field public static final enum RESEND:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

.field public static final enum SELECT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

.field public static final enum SUBMIT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;


# direct methods
.method private static synthetic $values()[Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;
    .locals 6

    .line 13
    sget-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->SUBMIT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->CONTINUE:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    sget-object v2, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->NEXT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    sget-object v3, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->CANCEL:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    sget-object v4, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->RESEND:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    sget-object v5, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->SELECT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    filled-new-array/range {v0 .. v5}, [Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    const-string v1, "SUBMIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->SUBMIT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    const-string v1, "CONTINUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->CONTINUE:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    const-string v1, "NEXT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->NEXT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    const-string v1, "CANCEL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->CANCEL:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    const-string v1, "RESEND"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->RESEND:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    const-string v1, "SELECT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->SELECT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    .line 13
    invoke-static {}, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->$values()[Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->$VALUES:[Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;
    .locals 1

    .line 13
    const-class v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;
    .locals 1

    .line 13
    sget-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->$VALUES:[Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {v0}, [Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    return-object v0
.end method
