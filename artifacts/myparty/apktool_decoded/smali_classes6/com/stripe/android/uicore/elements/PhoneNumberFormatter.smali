.class public abstract Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;
.super Ljava/lang/Object;
.source "PhoneNumberFormatter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;,
        Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;,
        Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion;,
        Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \u00162\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0012\u0010\u0008\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0007R\u0012\u0010\u000c\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0001\u0002\u0017\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;",
        "",
        "<init>",
        "()V",
        "prefix",
        "",
        "getPrefix",
        "()Ljava/lang/String;",
        "placeholder",
        "getPlaceholder",
        "countryCode",
        "getCountryCode",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "getVisualTransformation",
        "()Landroidx/compose/ui/text/input/VisualTransformation;",
        "userInputFilter",
        "input",
        "toE164Format",
        "WithRegion",
        "UnknownRegion",
        "Metadata",
        "Companion",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$UnknownRegion;",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;",
        "stripe-ui-core_release"
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
.field public static final $stable:I = 0x0

.field private static final COUNTRY_PREFIX_MAX_LENGTH:I = 0x5

.field public static final Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

.field private static final E164_MAX_DIGITS:I = 0xf

.field private static final VALID_INPUT_RANGE:Lkotlin/ranges/CharRange;

.field private static final allMetadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 26

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    .line 204
    new-instance v0, Lkotlin/ranges/CharRange;

    const/16 v1, 0x30

    const/16 v2, 0x39

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/CharRange;-><init>(CC)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->VALID_INPUT_RANGE:Lkotlin/ranges/CharRange;

    const/16 v0, 0xef

    .line 256
    new-array v0, v0, [Lkotlin/Pair;

    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+1"

    const-string v5, "US"

    const-string v6, "(###) ###-####"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x0

    aput-object v3, v0, v5

    .line 257
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "CA"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "CA"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v0, v5

    .line 258
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "AG"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "AG"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x2

    aput-object v3, v0, v5

    .line 259
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "AS"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "AS"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x3

    aput-object v3, v0, v5

    .line 260
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "AI"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "AI"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x4

    aput-object v3, v0, v5

    .line 261
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "BB"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "BB"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x5

    aput-object v3, v0, v5

    .line 262
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "BM"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "BM"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x6

    aput-object v3, v0, v5

    .line 263
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "BS"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "BS"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x7

    aput-object v3, v0, v5

    .line 264
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "DM"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "DM"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0x8

    aput-object v3, v0, v5

    .line 265
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "DO"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "DO"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0x9

    aput-object v3, v0, v5

    .line 266
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "GD"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "GD"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0xa

    aput-object v3, v0, v5

    .line 267
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "GU"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "GU"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0xb

    aput-object v3, v0, v5

    .line 268
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "JM"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "JM"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0xc

    aput-object v3, v0, v5

    .line 269
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "KN"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "KN"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0xd

    aput-object v3, v0, v5

    .line 270
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "KY"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "KY"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0xe

    aput-object v3, v0, v5

    .line 271
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "LC"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "LC"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0xf

    aput-object v3, v0, v5

    .line 272
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "MP"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "MP"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0x10

    aput-object v3, v0, v5

    .line 273
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "MS"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "MS"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0x11

    aput-object v3, v0, v5

    .line 274
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "PR"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "PR"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0x12

    aput-object v3, v0, v5

    .line 275
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "SX"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "SX"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0x13

    aput-object v3, v0, v5

    .line 276
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "TC"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "TC"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0x14

    aput-object v3, v0, v5

    .line 277
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "TT"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "TT"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0x15

    aput-object v3, v0, v5

    .line 278
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "VC"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "VC"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0x16

    aput-object v3, v0, v5

    .line 279
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "VG"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "VG"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v5, 0x17

    aput-object v3, v0, v5

    .line 280
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v5, "VI"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "VI"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x18

    aput-object v3, v0, v4

    .line 282
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+20"

    const-string v5, "EG"

    const-string v6, "### ### ####"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "EG"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x19

    aput-object v3, v0, v4

    .line 283
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+211"

    const-string v5, "SS"

    const-string v7, "### ### ###"

    invoke-direct {v3, v4, v5, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "SS"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x1a

    aput-object v3, v0, v4

    .line 284
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "MA"

    const-string v5, "###-######"

    const-string v8, "+212"

    invoke-direct {v3, v8, v4, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "MA"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x1b

    aput-object v3, v0, v4

    .line 285
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "EH"

    const-string v5, "###-######"

    const-string v8, "+212"

    invoke-direct {v3, v8, v4, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "EH"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x1c

    aput-object v3, v0, v4

    .line 286
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+213"

    const-string v5, "DZ"

    const-string v8, "### ## ## ##"

    invoke-direct {v3, v4, v5, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "DZ"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x1d

    aput-object v3, v0, v4

    .line 287
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+216"

    const-string v5, "TN"

    const-string v9, "## ### ###"

    invoke-direct {v3, v4, v5, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "TN"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x1e

    aput-object v3, v0, v4

    .line 288
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "LY"

    const-string v5, "##-#######"

    const-string v10, "+218"

    invoke-direct {v3, v10, v4, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "LY"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x1f

    aput-object v3, v0, v4

    .line 289
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+220"

    const-string v5, "GM"

    const-string v10, "### ####"

    invoke-direct {v3, v4, v5, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "GM"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x20

    aput-object v3, v0, v4

    .line 290
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+221"

    const-string v5, "SN"

    const-string v11, "## ### ## ##"

    invoke-direct {v3, v4, v5, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "SN"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x21

    aput-object v3, v0, v4

    .line 291
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+222"

    const-string v5, "MR"

    const-string v12, "## ## ## ##"

    invoke-direct {v3, v4, v5, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "MR"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x22

    aput-object v3, v0, v4

    .line 292
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+223"

    const-string v5, "ML"

    invoke-direct {v3, v4, v5, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "ML"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x23

    aput-object v3, v0, v4

    .line 293
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+224"

    const-string v5, "GN"

    invoke-direct {v3, v4, v5, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "GN"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x24

    aput-object v3, v0, v4

    .line 294
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+225"

    const-string v5, "CI"

    invoke-direct {v3, v4, v5, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "CI"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x25

    aput-object v3, v0, v4

    .line 295
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+226"

    const-string v5, "BF"

    invoke-direct {v3, v4, v5, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "BF"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x26

    aput-object v3, v0, v4

    .line 296
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+227"

    const-string v5, "NE"

    invoke-direct {v3, v4, v5, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "NE"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x27

    aput-object v3, v0, v4

    .line 297
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+228"

    const-string v5, "TG"

    invoke-direct {v3, v4, v5, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "TG"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x28

    aput-object v3, v0, v4

    .line 298
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+229"

    const-string v5, "BJ"

    invoke-direct {v3, v4, v5, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "BJ"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x29

    aput-object v3, v0, v4

    .line 299
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+230"

    const-string v5, "MU"

    const-string v13, "#### ####"

    invoke-direct {v3, v4, v5, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "MU"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x2a

    aput-object v3, v0, v4

    .line 300
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+231"

    const-string v5, "LR"

    invoke-direct {v3, v4, v5, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "LR"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x2b

    aput-object v3, v0, v4

    .line 301
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+232"

    const-string v5, "SL"

    const-string v14, "## ######"

    invoke-direct {v3, v4, v5, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "SL"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x2c

    aput-object v3, v0, v4

    .line 302
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+233"

    const-string v5, "GH"

    const-string v15, "## ### ####"

    invoke-direct {v3, v4, v5, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "GH"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x2d

    aput-object v3, v0, v4

    .line 303
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+234"

    const-string v5, "NG"

    invoke-direct {v3, v4, v5, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "NG"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x2e

    aput-object v3, v0, v4

    .line 304
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+235"

    const-string v5, "TD"

    invoke-direct {v3, v4, v5, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "TD"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v4, 0x2f

    aput-object v3, v0, v4

    .line 305
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v4, "+236"

    const-string v5, "CF"

    invoke-direct {v3, v4, v5, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "CF"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v1

    .line 306
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "+237"

    const-string v4, "CM"

    invoke-direct {v1, v3, v4, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "CM"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x31

    aput-object v1, v0, v3

    .line 307
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "CV"

    const-string v4, "### ## ##"

    const-string v5, "+238"

    invoke-direct {v1, v5, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "CV"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x32

    aput-object v1, v0, v3

    .line 308
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "+239"

    const-string v4, "ST"

    invoke-direct {v1, v3, v4, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "ST"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x33

    aput-object v1, v0, v3

    .line 309
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "+240"

    const-string v4, "GQ"

    invoke-direct {v1, v3, v4, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "GQ"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x34

    aput-object v1, v0, v3

    .line 310
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "+241"

    const-string v4, "GA"

    invoke-direct {v1, v3, v4, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "GA"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x35

    aput-object v1, v0, v3

    .line 311
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "+242"

    const-string v4, "CG"

    invoke-direct {v1, v3, v4, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "CG"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x36

    aput-object v1, v0, v3

    .line 312
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "+243"

    const-string v4, "CD"

    invoke-direct {v1, v3, v4, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "CD"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x37

    aput-object v1, v0, v3

    .line 313
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "+244"

    const-string v4, "AO"

    invoke-direct {v1, v3, v4, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "AO"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x38

    aput-object v1, v0, v3

    .line 314
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v3, "+245"

    const-string v4, "GW"

    invoke-direct {v1, v3, v4, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "GW"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v2

    .line 315
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+246"

    const-string v3, "IO"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "IO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3a

    aput-object v1, v0, v2

    .line 316
    new-instance v16, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const/16 v20, 0x4

    const/16 v21, 0x0

    const-string v17, "+247"

    const-string v18, "AC"

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    const-string v2, "AC"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3b

    aput-object v1, v0, v2

    .line 317
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "SC"

    const-string v3, "# ### ###"

    const-string v4, "+248"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SC"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3c

    aput-object v1, v0, v2

    .line 318
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+250"

    const-string v3, "RW"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "RW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3d

    aput-object v1, v0, v2

    .line 319
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+251"

    const-string v3, "ET"

    invoke-direct {v1, v2, v3, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ET"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    .line 320
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+252"

    const-string v3, "SO"

    const-string v4, "## #######"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3f

    aput-object v1, v0, v2

    .line 321
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+253"

    const-string v3, "DJ"

    invoke-direct {v1, v2, v3, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "DJ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x40

    aput-object v1, v0, v2

    .line 322
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+254"

    const-string v3, "KE"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "KE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x41

    aput-object v1, v0, v2

    .line 323
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+255"

    const-string v3, "TZ"

    invoke-direct {v1, v2, v3, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "TZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x42

    aput-object v1, v0, v2

    .line 324
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "UG"

    const-string v3, "### ######"

    const-string v5, "+256"

    invoke-direct {v1, v5, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "UG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x43

    aput-object v1, v0, v2

    .line 325
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+257"

    const-string v3, "BI"

    invoke-direct {v1, v2, v3, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BI"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x44

    aput-object v1, v0, v2

    .line 326
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+258"

    const-string v3, "MZ"

    invoke-direct {v1, v2, v3, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x45

    aput-object v1, v0, v2

    .line 327
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+260"

    const-string v3, "ZM"

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ZM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x46

    aput-object v1, v0, v2

    .line 328
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "MG"

    const-string v3, "## ## ### ##"

    const-string v5, "+261"

    invoke-direct {v1, v5, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MG"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x47

    aput-object v1, v0, v2

    .line 329
    new-instance v16, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v17, "+262"

    const-string v18, "RE"

    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    const-string v2, "RE"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x48

    aput-object v1, v0, v2

    .line 330
    new-instance v16, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v17, "+262"

    const-string v18, "TF"

    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    const-string v2, "TF"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x49

    aput-object v1, v0, v2

    .line 331
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+262"

    const-string v3, "YT"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "YT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4a

    aput-object v1, v0, v2

    .line 332
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+263"

    const-string v3, "ZW"

    invoke-direct {v1, v2, v3, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ZW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4b

    aput-object v1, v0, v2

    .line 333
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+264"

    const-string v3, "NA"

    invoke-direct {v1, v2, v3, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "NA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4c

    aput-object v1, v0, v2

    .line 334
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+265"

    const-string v3, "MW"

    invoke-direct {v1, v2, v3, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4d

    aput-object v1, v0, v2

    .line 335
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+266"

    const-string v3, "LS"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "LS"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4e

    aput-object v1, v0, v2

    .line 336
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+267"

    const-string v3, "BW"

    invoke-direct {v1, v2, v3, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "BW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4f

    aput-object v1, v0, v2

    .line 337
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+268"

    const-string v3, "SZ"

    invoke-direct {v1, v2, v3, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SZ"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x50

    aput-object v1, v0, v2

    .line 338
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "KM"

    const-string v3, "### ## ##"

    const-string v5, "+269"

    invoke-direct {v1, v5, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "KM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x51

    aput-object v1, v0, v2

    .line 339
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+27"

    const-string v3, "ZA"

    invoke-direct {v1, v2, v3, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ZA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x52

    aput-object v1, v0, v2

    .line 340
    new-instance v16, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v17, "+290"

    const-string v18, "SH"

    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    const-string v2, "SH"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x53

    aput-object v1, v0, v2

    .line 341
    new-instance v16, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v17, "+290"

    const-string v18, "TA"

    invoke-direct/range {v16 .. v21}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    const-string v2, "TA"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x54

    aput-object v1, v0, v2

    .line 342
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "ER"

    const-string v3, "# ### ###"

    const-string v5, "+291"

    invoke-direct {v1, v5, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ER"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x55

    aput-object v1, v0, v2

    .line 343
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+297"

    const-string v3, "AW"

    invoke-direct {v1, v2, v3, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AW"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x56

    aput-object v1, v0, v2

    .line 344
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "FO"

    const-string v3, "######"

    const-string v5, "+298"

    invoke-direct {v1, v5, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "FO"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x57

    aput-object v1, v0, v2

    .line 345
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+299"

    const-string v3, "GL"

    const-string v5, "## ## ##"

    invoke-direct {v1, v2, v3, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GL"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x58

    aput-object v1, v0, v2

    .line 346
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "+30"

    const-string v3, "GR"

    invoke-direct {v1, v2, v3, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GR"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x59

    aput-object v1, v0, v2

    .line 347
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "NL"

    const-string v3, "# ########"

    move-object/from16 v16, v0

    const-string v0, "+31"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "NL"

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x5a

    aput-object v0, v16, v1

    .line 348
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+32"

    const-string v2, "BE"

    invoke-direct {v0, v1, v2, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BE"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x5b

    aput-object v0, v16, v1

    .line 349
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "FR"

    const-string v2, "# ## ## ## ##"

    const-string v3, "+33"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "FR"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x5c

    aput-object v0, v16, v1

    .line 350
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+34"

    const-string v2, "ES"

    invoke-direct {v0, v1, v2, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ES"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x5d

    aput-object v0, v16, v1

    .line 351
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+350"

    const-string v2, "GI"

    const-string v3, "### #####"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "GI"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x5e

    aput-object v0, v16, v1

    .line 352
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+351"

    const-string v2, "PT"

    invoke-direct {v0, v1, v2, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PT"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x5f

    aput-object v0, v16, v1

    .line 353
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "LU"

    const-string v2, "## ## ## ###"

    move-object/from16 v17, v8

    const-string v8, "+352"

    invoke-direct {v0, v8, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "LU"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x60

    aput-object v0, v16, v1

    .line 354
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+353"

    const-string v2, "IE"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "IE"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x61

    aput-object v0, v16, v1

    .line 355
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+354"

    const-string v2, "IS"

    invoke-direct {v0, v1, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "IS"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x62

    aput-object v0, v16, v1

    .line 356
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+355"

    const-string v2, "AL"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AL"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x63

    aput-object v0, v16, v1

    .line 357
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+356"

    const-string v2, "MT"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MT"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x64

    aput-object v0, v16, v1

    .line 358
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+357"

    const-string v2, "CY"

    invoke-direct {v0, v1, v2, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CY"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x65

    aput-object v0, v16, v1

    .line 359
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+358"

    const-string v2, "FI"

    invoke-direct {v0, v1, v2, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "FI"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x66

    aput-object v0, v16, v1

    .line 360
    new-instance v18, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const/16 v22, 0x4

    const/16 v23, 0x0

    const-string v19, "+358"

    const-string v20, "AX"

    invoke-direct/range {v18 .. v23}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v18

    const-string v1, "AX"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x67

    aput-object v0, v16, v1

    .line 361
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "BG"

    const-string v2, "### ### ##"

    const-string v8, "+359"

    invoke-direct {v0, v8, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BG"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x68

    aput-object v0, v16, v1

    .line 362
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+36"

    const-string v2, "HU"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "HU"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x69

    aput-object v0, v16, v1

    .line 363
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+370"

    const-string v2, "LT"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "LT"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x6a

    aput-object v0, v16, v1

    .line 364
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+371"

    const-string v2, "LV"

    invoke-direct {v0, v1, v2, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "LV"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x6b

    aput-object v0, v16, v1

    .line 365
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+372"

    const-string v2, "EE"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "EE"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x6c

    aput-object v0, v16, v1

    .line 366
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "MD"

    const-string v2, "### ## ###"

    const-string v8, "+373"

    invoke-direct {v0, v8, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MD"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x6d

    aput-object v0, v16, v1

    .line 367
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+374"

    const-string v2, "AM"

    invoke-direct {v0, v1, v2, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AM"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x6e

    aput-object v0, v16, v1

    .line 368
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "BY"

    const-string v2, "## ###-##-##"

    const-string v8, "+375"

    invoke-direct {v0, v8, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BY"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x6f

    aput-object v0, v16, v1

    .line 369
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "AD"

    const-string v2, "### ###"

    const-string v8, "+376"

    invoke-direct {v0, v8, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AD"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x70

    aput-object v0, v16, v1

    .line 370
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "MC"

    const-string v2, "# ## ## ## ##"

    const-string v8, "+377"

    invoke-direct {v0, v8, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MC"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x71

    aput-object v0, v16, v1

    .line 371
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+378"

    const-string v2, "SM"

    invoke-direct {v0, v1, v2, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SM"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x72

    aput-object v0, v16, v1

    .line 372
    new-instance v18, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v19, "+379"

    const-string v20, "VA"

    invoke-direct/range {v18 .. v23}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v18

    const-string v1, "VA"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x73

    aput-object v0, v16, v1

    .line 373
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+380"

    const-string v2, "UA"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "UA"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x74

    aput-object v0, v16, v1

    .line 374
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+381"

    const-string v2, "RS"

    invoke-direct {v0, v1, v2, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "RS"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x75

    aput-object v0, v16, v1

    .line 375
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+382"

    const-string v2, "ME"

    invoke-direct {v0, v1, v2, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ME"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x76

    aput-object v0, v16, v1

    .line 376
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+383"

    const-string v2, "XK"

    invoke-direct {v0, v1, v2, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "XK"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x77

    aput-object v0, v16, v1

    .line 377
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+385"

    const-string v2, "HR"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "HR"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x78

    aput-object v0, v16, v1

    .line 378
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+386"

    const-string v2, "SI"

    invoke-direct {v0, v1, v2, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SI"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x79

    aput-object v0, v16, v1

    .line 379
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "BA"

    const-string v2, "## ###-###"

    const-string v8, "+387"

    invoke-direct {v0, v8, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BA"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x7a

    aput-object v0, v16, v1

    .line 380
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+389"

    const-string v2, "MK"

    invoke-direct {v0, v1, v2, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MK"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x7b

    aput-object v0, v16, v1

    .line 381
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "IT"

    const-string v2, "## #### ####"

    const-string v8, "+39"

    invoke-direct {v0, v8, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "IT"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x7c

    aput-object v0, v16, v1

    .line 382
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+40"

    const-string v2, "RO"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "RO"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x7d

    aput-object v0, v16, v1

    .line 383
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+41"

    const-string v2, "CH"

    invoke-direct {v0, v1, v2, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CH"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x7e

    aput-object v0, v16, v1

    .line 384
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+420"

    const-string v2, "CZ"

    invoke-direct {v0, v1, v2, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CZ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x7f

    aput-object v0, v16, v1

    .line 385
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+421"

    const-string v2, "SK"

    invoke-direct {v0, v1, v2, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SK"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x80

    aput-object v0, v16, v1

    .line 386
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+423"

    const-string v2, "LI"

    invoke-direct {v0, v1, v2, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "LI"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x81

    aput-object v0, v16, v1

    .line 387
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "AT"

    const-string v2, "### ######"

    const-string v8, "+43"

    invoke-direct {v0, v8, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AT"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x82

    aput-object v0, v16, v1

    .line 388
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+44"

    const-string v2, "GB"

    const-string v8, "#### ######"

    invoke-direct {v0, v1, v2, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GB"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x83

    aput-object v0, v16, v2

    .line 389
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "GG"

    invoke-direct {v0, v1, v2, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "GG"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x84

    aput-object v0, v16, v2

    .line 390
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "JE"

    invoke-direct {v0, v1, v2, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "JE"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x85

    aput-object v0, v16, v2

    .line 391
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v2, "IM"

    invoke-direct {v0, v1, v2, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "IM"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x86

    aput-object v0, v16, v1

    .line 392
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+45"

    const-string v2, "DK"

    invoke-direct {v0, v1, v2, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "DK"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x87

    aput-object v0, v16, v1

    .line 393
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "SE"

    const-string v2, "##-### ## ##"

    const-string v14, "+46"

    invoke-direct {v0, v14, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SE"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x88

    aput-object v0, v16, v1

    .line 394
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "NO"

    const-string v2, "### ## ###"

    const-string v14, "+47"

    invoke-direct {v0, v14, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "NO"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x89

    aput-object v0, v16, v1

    .line 395
    new-instance v18, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v19, "+47"

    const-string v20, "BV"

    invoke-direct/range {v18 .. v23}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v18

    const-string v1, "BV"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x8a

    aput-object v0, v16, v1

    .line 396
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+47"

    const-string v2, "SJ"

    invoke-direct {v0, v1, v2, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SJ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x8b

    aput-object v0, v16, v1

    .line 397
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+48"

    const-string v2, "PL"

    invoke-direct {v0, v1, v2, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PL"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x8c

    aput-object v0, v16, v1

    .line 398
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+49"

    const-string v2, "DE"

    const-string v14, "### #######"

    invoke-direct {v0, v1, v2, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "DE"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x8d

    aput-object v0, v16, v1

    .line 399
    new-instance v18, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v19, "+500"

    const-string v20, "FK"

    invoke-direct/range {v18 .. v23}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v18

    const-string v1, "FK"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x8e

    aput-object v0, v16, v1

    .line 400
    new-instance v18, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v19, "+500"

    const-string v20, "GS"

    invoke-direct/range {v18 .. v23}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v18

    const-string v1, "GS"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x8f

    aput-object v0, v16, v1

    .line 401
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+501"

    const-string v2, "BZ"

    move-object/from16 v18, v12

    const-string v12, "###-####"

    invoke-direct {v0, v1, v2, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BZ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x90

    aput-object v0, v16, v1

    .line 402
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+502"

    const-string v2, "GT"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "GT"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x91

    aput-object v0, v16, v1

    .line 403
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+503"

    const-string v2, "SV"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SV"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x92

    aput-object v0, v16, v1

    .line 404
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "HN"

    const-string v2, "####-####"

    move-object/from16 v19, v3

    const-string v3, "+504"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "HN"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x93

    aput-object v0, v16, v1

    .line 405
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+505"

    const-string v2, "NI"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "NI"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x94

    aput-object v0, v16, v1

    .line 406
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+506"

    const-string v2, "CR"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CR"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x95

    aput-object v0, v16, v1

    .line 407
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "PA"

    const-string v2, "####-####"

    const-string v3, "+507"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PA"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x96

    aput-object v0, v16, v1

    .line 408
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+508"

    const-string v2, "PM"

    invoke-direct {v0, v1, v2, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PM"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x97

    aput-object v0, v16, v1

    .line 409
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "HT"

    const-string v2, "## ## ####"

    const-string v3, "+509"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "HT"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x98

    aput-object v0, v16, v1

    .line 410
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+51"

    const-string v2, "PE"

    invoke-direct {v0, v1, v2, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PE"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x99

    aput-object v0, v16, v1

    .line 411
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+52"

    const-string v2, "MX"

    invoke-direct {v0, v1, v2, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MX"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x9a

    aput-object v0, v16, v1

    .line 412
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "AR"

    const-string v2, "## ##-####-####"

    const-string v3, "+54"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AR"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x9b

    aput-object v0, v16, v1

    .line 413
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "BR"

    const-string v2, "## #####-####"

    const-string v3, "+55"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BR"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x9c

    aput-object v0, v16, v1

    .line 414
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "CL"

    const-string v2, "# #### ####"

    const-string v3, "+56"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CL"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x9d

    aput-object v0, v16, v1

    .line 415
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+57"

    const-string v2, "CO"

    invoke-direct {v0, v1, v2, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CO"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x9e

    aput-object v0, v16, v1

    .line 416
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "VE"

    const-string v2, "###-#######"

    const-string v3, "+58"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "VE"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0x9f

    aput-object v0, v16, v1

    .line 417
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+590"

    const-string v2, "BL"

    move-object/from16 v3, v17

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BL"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xa0

    aput-object v0, v16, v1

    .line 418
    new-instance v20, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const/16 v24, 0x4

    const/16 v25, 0x0

    const-string v21, "+590"

    const-string v22, "MF"

    invoke-direct/range {v20 .. v25}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v20

    const-string v1, "MF"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xa1

    aput-object v0, v16, v1

    .line 419
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+590"

    const-string v2, "GP"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "GP"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xa2

    aput-object v0, v16, v1

    .line 420
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "BO"

    const-string v2, "########"

    move-object/from16 v17, v14

    const-string v14, "+591"

    invoke-direct {v0, v14, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BO"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xa3

    aput-object v0, v16, v1

    .line 421
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+592"

    const-string v2, "GY"

    invoke-direct {v0, v1, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "GY"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xa4

    aput-object v0, v16, v1

    .line 422
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+593"

    const-string v2, "EC"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "EC"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xa5

    aput-object v0, v16, v1

    .line 423
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+594"

    const-string v2, "GF"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "GF"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xa6

    aput-object v0, v16, v1

    .line 424
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+595"

    const-string v2, "PY"

    invoke-direct {v0, v1, v2, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PY"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xa7

    aput-object v0, v16, v1

    .line 425
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+596"

    const-string v2, "MQ"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MQ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xa8

    aput-object v0, v16, v1

    .line 426
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+597"

    const-string v2, "SR"

    invoke-direct {v0, v1, v2, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SR"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xa9

    aput-object v0, v16, v1

    .line 427
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+598"

    const-string v2, "UY"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "UY"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xaa

    aput-object v0, v16, v1

    .line 428
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "CW"

    const-string v2, "# ### ####"

    const-string v4, "+599"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CW"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xab

    aput-object v0, v16, v1

    .line 429
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+599"

    const-string v2, "BQ"

    invoke-direct {v0, v1, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BQ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xac

    aput-object v0, v16, v1

    .line 430
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "MY"

    const-string v2, "##-### ####"

    const-string v4, "+60"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MY"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xad

    aput-object v0, v16, v1

    .line 431
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+61"

    const-string v2, "AU"

    invoke-direct {v0, v1, v2, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AU"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xae

    aput-object v0, v16, v1

    .line 432
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "ID"

    const-string v2, "###-###-###"

    const-string v4, "+62"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ID"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xaf

    aput-object v0, v16, v1

    .line 433
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+63"

    const-string v2, "PH"

    invoke-direct {v0, v1, v2, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PH"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xb0

    aput-object v0, v16, v1

    .line 434
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+64"

    const-string v2, "NZ"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "NZ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xb1

    aput-object v0, v16, v1

    .line 435
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+65"

    const-string v2, "SG"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SG"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xb2

    aput-object v0, v16, v1

    .line 436
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+66"

    const-string v2, "TH"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TH"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xb3

    aput-object v0, v16, v1

    .line 437
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+670"

    const-string v2, "TL"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TL"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xb4

    aput-object v0, v16, v1

    .line 438
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "AQ"

    const-string v2, "## ####"

    const-string v4, "+672"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AQ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xb5

    aput-object v0, v16, v1

    .line 439
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+673"

    const-string v2, "BN"

    invoke-direct {v0, v1, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BN"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xb6

    aput-object v0, v16, v1

    .line 440
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+674"

    const-string v2, "NR"

    invoke-direct {v0, v1, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "NR"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xb7

    aput-object v0, v16, v1

    .line 441
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+675"

    const-string v2, "PG"

    invoke-direct {v0, v1, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PG"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xb8

    aput-object v0, v16, v1

    .line 442
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+676"

    const-string v2, "TO"

    invoke-direct {v0, v1, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TO"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xb9

    aput-object v0, v16, v1

    .line 443
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+677"

    const-string v2, "SB"

    invoke-direct {v0, v1, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SB"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xba

    aput-object v0, v16, v1

    .line 444
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+678"

    const-string v2, "VU"

    invoke-direct {v0, v1, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "VU"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xbb

    aput-object v0, v16, v1

    .line 445
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+679"

    const-string v2, "FJ"

    invoke-direct {v0, v1, v2, v10}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "FJ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xbc

    aput-object v0, v16, v1

    .line 446
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+681"

    const-string v2, "WF"

    invoke-direct {v0, v1, v2, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "WF"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xbd

    aput-object v0, v16, v1

    .line 447
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "CK"

    const-string v2, "## ###"

    const-string v4, "+682"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CK"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xbe

    aput-object v0, v16, v1

    .line 448
    new-instance v20, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v21, "+683"

    const-string v22, "NU"

    invoke-direct/range {v20 .. v25}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v20

    const-string v1, "NU"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xbf

    aput-object v0, v16, v1

    .line 449
    new-instance v20, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v21, "+685"

    const-string v22, "WS"

    invoke-direct/range {v20 .. v25}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v20

    const-string v1, "WS"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc0

    aput-object v0, v16, v1

    .line 450
    new-instance v20, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v21, "+686"

    const-string v22, "KI"

    invoke-direct/range {v20 .. v25}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v20

    const-string v1, "KI"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc1

    aput-object v0, v16, v1

    .line 451
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "NC"

    const-string v2, "########"

    const-string v4, "+687"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "NC"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc2

    aput-object v0, v16, v1

    .line 452
    new-instance v20, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v21, "+688"

    const-string v22, "TV"

    invoke-direct/range {v20 .. v25}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v20

    const-string v1, "TV"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc3

    aput-object v0, v16, v1

    .line 453
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+689"

    const-string v2, "PF"

    invoke-direct {v0, v1, v2, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PF"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc4

    aput-object v0, v16, v1

    .line 454
    new-instance v20, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v21, "+690"

    const-string v22, "TK"

    invoke-direct/range {v20 .. v25}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v20

    const-string v1, "TK"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc5

    aput-object v0, v16, v1

    .line 455
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "RU"

    const-string v2, "### ###-##-##"

    const-string v4, "+7"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "RU"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc6

    aput-object v0, v16, v1

    .line 456
    new-instance v20, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v21, "+7"

    const-string v22, "KZ"

    invoke-direct/range {v20 .. v25}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v20

    const-string v1, "KZ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc7

    aput-object v0, v16, v1

    .line 457
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "JP"

    const-string v2, "##-####-####"

    const-string v4, "+81"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "JP"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc8

    aput-object v0, v16, v1

    .line 458
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "KR"

    const-string v2, "##-####-####"

    const-string v4, "+82"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "KR"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xc9

    aput-object v0, v16, v1

    .line 459
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+84"

    const-string v2, "VN"

    invoke-direct {v0, v1, v2, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "VN"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xca

    aput-object v0, v16, v1

    .line 460
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+852"

    const-string v2, "HK"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "HK"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xcb

    aput-object v0, v16, v1

    .line 461
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+853"

    const-string v2, "MO"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MO"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xcc

    aput-object v0, v16, v1

    .line 462
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+855"

    const-string v2, "KH"

    invoke-direct {v0, v1, v2, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "KH"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xcd

    aput-object v0, v16, v1

    .line 463
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "LA"

    const-string v2, "## ## ### ###"

    const-string v4, "+856"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "LA"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xce

    aput-object v0, v16, v1

    .line 464
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "CN"

    const-string v2, "### #### ####"

    const-string v4, "+86"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "CN"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xcf

    aput-object v0, v16, v1

    .line 465
    new-instance v20, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v21, "+872"

    const-string v22, "PN"

    invoke-direct/range {v20 .. v25}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v20

    const-string v1, "PN"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd0

    aput-object v0, v16, v1

    .line 466
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "BD"

    const-string v2, "####-######"

    const-string v4, "+880"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BD"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd1

    aput-object v0, v16, v1

    .line 467
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+886"

    const-string v2, "TW"

    invoke-direct {v0, v1, v2, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TW"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd2

    aput-object v0, v16, v1

    .line 468
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+90"

    const-string v2, "TR"

    invoke-direct {v0, v1, v2, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TR"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd3

    aput-object v0, v16, v1

    .line 469
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "IN"

    const-string v2, "## ## ######"

    const-string v4, "+91"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "IN"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd4

    aput-object v0, v16, v1

    .line 470
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+92"

    const-string v2, "PK"

    move-object/from16 v4, v17

    invoke-direct {v0, v1, v2, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PK"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd5

    aput-object v0, v16, v1

    .line 471
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+93"

    const-string v2, "AF"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AF"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd6

    aput-object v0, v16, v1

    .line 472
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "LK"

    const-string v2, "## # ######"

    const-string v4, "+94"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "LK"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd7

    aput-object v0, v16, v1

    .line 473
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "MM"

    const-string v2, "# ### ####"

    const-string v4, "+95"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MM"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd8

    aput-object v0, v16, v1

    .line 474
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+960"

    const-string v2, "MV"

    invoke-direct {v0, v1, v2, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MV"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xd9

    aput-object v0, v16, v1

    .line 475
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+961"

    const-string v2, "LB"

    invoke-direct {v0, v1, v2, v9}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "LB"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xda

    aput-object v0, v16, v1

    .line 476
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "JO"

    const-string v2, "# #### ####"

    const-string v4, "+962"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "JO"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xdb

    aput-object v0, v16, v1

    .line 477
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+964"

    const-string v2, "IQ"

    invoke-direct {v0, v1, v2, v6}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "IQ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xdc

    aput-object v0, v16, v1

    .line 478
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+965"

    const-string v2, "KW"

    move-object/from16 v4, v19

    invoke-direct {v0, v1, v2, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "KW"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xdd

    aput-object v0, v16, v1

    .line 479
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+966"

    const-string v2, "SA"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "SA"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xde

    aput-object v0, v16, v1

    .line 480
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+967"

    const-string v2, "YE"

    invoke-direct {v0, v1, v2, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "YE"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xdf

    aput-object v0, v16, v1

    .line 481
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+968"

    const-string v2, "OM"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "OM"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xe0

    aput-object v0, v16, v1

    .line 482
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+970"

    const-string v2, "PS"

    invoke-direct {v0, v1, v2, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "PS"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xe1

    aput-object v0, v16, v1

    .line 483
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+971"

    const-string v2, "AE"

    invoke-direct {v0, v1, v2, v15}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AE"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xe2

    aput-object v0, v16, v1

    .line 484
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "IL"

    const-string v2, "##-###-####"

    const-string v4, "+972"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "IL"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xe3

    aput-object v0, v16, v1

    .line 485
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+973"

    const-string v2, "BH"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BH"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xe4

    aput-object v0, v16, v1

    .line 486
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+974"

    const-string v2, "QA"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "QA"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xe5

    aput-object v0, v16, v1

    .line 487
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+975"

    const-string v2, "BT"

    move-object/from16 v4, v18

    invoke-direct {v0, v1, v2, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "BT"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xe6

    aput-object v0, v16, v1

    .line 488
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+976"

    const-string v2, "MN"

    invoke-direct {v0, v1, v2, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MN"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xe7

    aput-object v0, v16, v1

    .line 489
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "NP"

    const-string v2, "###-#######"

    const-string v4, "+977"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "NP"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xe8

    aput-object v0, v16, v1

    .line 490
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "TJ"

    const-string v2, "### ## ####"

    const-string v4, "+992"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TJ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xe9

    aput-object v0, v16, v1

    .line 491
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "TM"

    const-string v2, "## ##-##-##"

    const-string v4, "+993"

    invoke-direct {v0, v4, v1, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TM"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xea

    aput-object v0, v16, v1

    .line 492
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+994"

    const-string v2, "AZ"

    invoke-direct {v0, v1, v2, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "AZ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xeb

    aput-object v0, v16, v1

    .line 493
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+995"

    const-string v2, "GE"

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "GE"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xec

    aput-object v0, v16, v1

    .line 494
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+996"

    const-string v2, "KG"

    invoke-direct {v0, v1, v2, v7}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "KG"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xed

    aput-object v0, v16, v1

    .line 495
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;

    const-string v1, "+998"

    const-string v2, "UZ"

    invoke-direct {v0, v1, v2, v11}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Metadata;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "UZ"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v1, 0xee

    aput-object v0, v16, v1

    .line 253
    invoke-static/range {v16 .. v16}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->allMetadata:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;-><init>()V

    return-void
.end method

.method public static final synthetic access$getAllMetadata$cp()Ljava/util/Map;
    .locals 1

    .line 18
    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->allMetadata:Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic access$getVALID_INPUT_RANGE$cp()Lkotlin/ranges/CharRange;
    .locals 1

    .line 18
    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->VALID_INPUT_RANGE:Lkotlin/ranges/CharRange;

    return-object v0
.end method


# virtual methods
.method public abstract getCountryCode()Ljava/lang/String;
.end method

.method public abstract getPlaceholder()Ljava/lang/String;
.end method

.method public abstract getPrefix()Ljava/lang/String;
.end method

.method public abstract getVisualTransformation()Landroidx/compose/ui/text/input/VisualTransformation;
.end method

.method public abstract toE164Format(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract userInputFilter(Ljava/lang/String;)Ljava/lang/String;
.end method
