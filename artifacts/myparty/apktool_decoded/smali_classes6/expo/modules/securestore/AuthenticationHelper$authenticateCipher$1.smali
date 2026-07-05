.class final Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "AuthenticationHelper.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/securestore/AuthenticationHelper;->authenticateCipher(Ljavax/crypto/Cipher;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "expo.modules.securestore.AuthenticationHelper"
    f = "AuthenticationHelper.kt"
    i = {}
    l = {
        0x18
    }
    m = "authenticateCipher"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lexpo/modules/securestore/AuthenticationHelper;


# direct methods
.method constructor <init>(Lexpo/modules/securestore/AuthenticationHelper;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/securestore/AuthenticationHelper;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->this$0:Lexpo/modules/securestore/AuthenticationHelper;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->result:Ljava/lang/Object;

    iget p1, p0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->label:I

    iget-object p1, p0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->this$0:Lexpo/modules/securestore/AuthenticationHelper;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0, v2, v1}, Lexpo/modules/securestore/AuthenticationHelper;->authenticateCipher(Ljavax/crypto/Cipher;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
